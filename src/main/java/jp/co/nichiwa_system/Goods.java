package jp.co.nichiwa_system;
import java.text.DecimalFormat;

public class Goods {

	private int unitPrice = 0;

	public Goods(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Object getPrice() {
		return this.unitPrice;
	}

	public Object getTaxIncludedPrice() {
		// 小数点以下の桁数を0
        DecimalFormat format = new DecimalFormat("#.#");
        format.setMaximumFractionDigits(0);

        // 消費税8%で税込価格を計算
        String strTaxIncludedPrice = format.format(this.unitPrice * 1.08);

        // string型からint型に変換して返す
		return Integer.parseInt(strTaxIncludedPrice);
	}

}
