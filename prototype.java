public class WordDocument implments Cloneable {
	private String mText;
	private ArrayList<String> mImages = new ArrayList<String>();

	public WordDocument() {
		System.out.println("-------WordDocument构造函数------");
	}
	@Override
	protected WordDocument clone() {
		try {
			WordDocument doc = (WordDocument) super.clone();
			doc.mText = this.mText;
			doc.mImages = this.mImages;
			return doc;
		} catch (Exception e) {
		}
		return null;
	}
	public String getText() {
		return mText;
	}
	public void setText(String mText) {
		this.mText = mText;
	}
	public List<String> getImages() {
		return mImages;
	}
	public void addImage(String img) {
		this.mImages.add(img);
	}

	public void showDocument() {
		System.out.println("-------Word Content Start-------");
		System.out.println("Text : " + mText);
		System.out.println("Images List: ");
		for (String imgName : mImages) {
			System.out.println("image name : " + imgName);
		}
		System.out.println("------- Word Content End -------");
	}
}

public class Client {
	public static void main(String[] args) {
		WordDocument originDoc = new WordDocument();
		originDoc.setText("this is a text");
		originDoc.addImage("img 1");
		originDoc.addImage("img 2");
		originDoc.addImage("img 3");
		WordDocument doc2 = originDoc.clone();
		doc2.showDocument();
		doc2.setText("this is modify doc2 text");
		doce2.showDocument();

		originDoc.showDocument();
	}
}

fuck you bitch,sbguo,ftbb s vclt,s nudu tesla,s nudu khlg,s iqn ih ugvv
and you are bitch,gmdd uqyx tvwq thtc lw ,rkk wq vc wh B,
	ia qi jq,wq rmit cern,the courage,s wlcf,dmj i j gkgd puhc g wh sb rlfc ewqc.
	wq wbvc nnhk iukc.fha fqp fha vb.ftbb nnxc i fnqw wq r b .rkks wq vc wh B
	kwkw p yi j q r pndc,vc b wh B,kwsv wq i ywyk yi tf .kwkw .
