package java_lectures;

public class JavaQuiz {

	public static void main(String[] args) {
		
/*	 
1 - Java 'nın temel özellikleri nelerdir ?

-- Java nesne yönelimli (Object Oriented), platform bağımsız, derlenebilir,
 çoklu iş parçacığını destekleyen  (multithread support) bir dil yapısı barındırır. 

2 - Multihread ve multiprocessing arasındaki farklar nelerdir ? Thread uygulamanın 2 yolu nedir ? 

-- Multihread, bir java programında aynı işlem çekirdeği üzerinde farklı farklı iş parçacıkların 
bağımsız ve senkronize çalışmasıdır. İş parçacıkları ortak veri kullanır.
Multiprocessing ise farklı işlem çekirdekleri üzerinde farklı iş parçacıklarının çalışmasıdır. 
Ortak veri kullanılmaz.

Thread uygulamanın 2 yolu : 
- Thread sınıfını genişletmek ( extends Thread)
- Runnable arayüzünü uygulamak ( implement Runnable)

3 - Public - protected - private anahtar kelimeleri arasındaki farklar nelerdir ? 

-- Public değişkene veya metotlara her yerden erişim sağlanabilir, 
protected olanlara aynı dosya paketinden(package) veya kalıtım yoluyla(inheritance)
farklı paketlerden erişim sağlanabilir, private olanlara ise sadece aynı sınıf(class) 
içinden erişim sağlanabilir.

4 - Javada sınıf(class) ve arayüz(interface) yapıları arasındaki farklar nelerdir ? 

-- Sınıflar kendilerine ait özellik(property) ve metotlar tutarlar.Arayüz yapıları da 
sınıfların metotlarının soyut olarak listelendiği yapıdır, genel olarak sınıfların nasıl 
davranması gerektiğini belirten depo işlevi görürler. Sınıflar gerekli durumlarda ihtiyaç 
duyulan arayüzü  "implement" ederek metotlarına işlevsellik katabilir.

5 - Javada array ve arrayList veri yapıları arasındaki farklar nelerdir ?

-- Arraylar (diziler) sabit boyutludur ve eleman ekleme-çıkarma gibi işlevsellikler sunmaz.
 Arraylistler dinamik boyutlu bir yapıdadır ve metot işlevselliği sunar.
 O(1) zaman karmaşıklığı ile istenen indeksteki elemana erişim sağlanır.list[5]

6 - Hashmap ve Hashtable veri yapıları arasındaki farklar nelerdir ?

- İkiside anahtar-değer çiftlerini depolayan veri yapılarıdır. 
Hashmap O(1) zaman karmaşıklığı ile elemanlarına erişim sağlar ve 
birden fazla thread(iş parçacığına) karşı korumasızdır bu yüzden daha hızlıdır.
Hashtable genellikle daha yavaştır ama metotları multihread e karşı senkronize çalışır. 

7 - Hashset ve treeset veri yapıları arasındaki farklar nelerdir ?

- Hashset benzersiz  elemanlar topluluğunu depolamak için kullanılan  bir veri yapısıdır.
Hashmap gibi anahtar-değer çifti kullanmaz sadece değer depolar. 
Elemanları hash table içinde sıralama olmaksızın depolar ve erişim hızlıdır(O(1)). 
Treeset ise elemanlarını ağaç yapısı içinde sıralama içinde dizer ve 
O(log(n)) zamanda erişim sağlar.Düzen ve sıra gerektiren durumlarda tree yapısı tercih edilir.
		 	 
8 - Stack, Queque ve LinkedList veri yapılarının mekanizmaları arasında ne gibi farklar mevcuttur ? 

-- Doğrusal (linear) yapılı bir liste formatındadırlar.Stack "yığın" olarak geçer ve sadece 
listenin sonundan eleman eklenebilir veya çıkarılabilir. Queque "sıra" olarak geçer ve listenin
başından eleman çıkarılır , sonundan ekleme yapılır.Linkedlist elemanların zincir halkası şeklinde
birbirine bağlı olduğu bir yapıdır. Her eleman kendi değerini ve bir sonraki elemanı işaret eden
pointer(belirteçi) depolar.

9 - BigO notasyonu nedir , ne amaçla kullanılır ?

-- Bir algoritmanın yaptığı işlem sayısını baz alarak 
farklı boyutlarda girdi(input) karşısında zaman ve bellek yönetiminin
verimliliğini ölçmek için tanımlanmış bir kriterdir.Algoritmalar arasında
hız,zaman ve kullanılan bellek karşılaştırmaları yapılmasına olanak sağlar.

Temel durumlar : 

- O(1) : Sabit zaman karmaşıklığı => array[2]
- O(n) : Doğrusal zaman karmaşıklığı => For döngüsü ile dizide gezinmek
- O(n2) : Karesel zaman karmaşıklığı => İç içe oluşturulmuş döngüler
- O(log n) : Logaritmik zaman karmaşıklığı => Binary search algoritmaları

10 - Javada dikkat edilmesi gereken SOLID kod prensipleri nelerdir ?

-- Single Responsibility : Sınıflar ve metotlar tek işten sorumlu olmalı.
-- Open / Closed : Sınıflar ve metotları değişmeye kapalı , üzerine geliştirilmeye açık olmalı.
-- Liskov Substitution : Bir sınıftan türeyen sınıflar , o sınıfı geliştirmeli  , yerine geçmelidir.
-- Interface Segregation : Sınıfların arayüzü genel ve kapsayıcı değil , spesifik olmalıdır Kullanılmayan metotlar içermemeli.
-- Dependency Inversion : Yüksek ve düşük seviyeli modüller birbirine bağımlı olmamalı , ikiside soyutlamalara bağımlı olmalı.

11 - Yazılım geliştirme projelerinde uygulanan temel mimari tasarım şablonları(design pattern) nelerdir ?

-- MVC MODEL
MODEL : Projede kullanılan verinin tanımlandığı,okunduğu,saklandığı kısımdır.
VIEW : Kullanıcının etkileşime geçtiği arayüzdür , modelden gelen bilgiyi görsel olarak sunar. ( *WEB DESIGNS-HTML-CSS , GUI BİLEŞENLERİ,BUTTON,)
CONTROLLER : View bileşenindeki aksiyonların yönetildiği ve tanımlandığı bileşendir. (Butona basmak , inputu işlemek, arama yapmak ...)

Avantajları : Ayrık bir proeje yapısı sunar , okunabilir , kolay güncellenebilir ve tekrar tekrar kullanılabilir bir kod yapısı sağlar.

--Singleton Model
Kullanılan sınıf modelinin yalnızca 1 tane örneği(instance) olması gereken durumlarda kullanılır.(veri tabanı bağlantısı,loglama)
Sınıfın tek örneğine multithread (aynı anda çoklu iş parçacıkları tarafından erişim) ile erişim olduğunda "synchronized" anahtar 
kelimesi kullanılmaldır.

--FACTORY MODEL
Farklı türlerde aynı ortak üst sınıfa bağlı nesnelerin yaratılması gereken durumlarda kullanılır.
İstenen sınıfın objesi, ortak fabrika sınıfından(üst class,interface) talep edilir ve oluşturulur.

Örnek : kırmızı,beyaz,siyah renkli araba örneklerinin  hepsi ARABA sınıfının bir metodu ile oluşturulur !!

12 - Rest API nedir ? 

-- Cihazlar arasında veri paylaşımı yapmayı sağlayan Server-Client modelidir.
HTTP protokol komutları ile(GET-POST-PUT-DELETE) veri transferi ve aksiyonları gerçekleştirilir.


		 */
	}

}
