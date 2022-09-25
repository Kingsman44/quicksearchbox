package androidx.core.p096h;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.core.h.g */
/* compiled from: PG */
public final class C1954g {

    /* renamed from: a */
    public final TextPaint f5870a;

    /* renamed from: b */
    public final TextDirectionHeuristic f5871b;

    /* renamed from: c */
    public final int f5872c;

    /* renamed from: d */
    public final int f5873d;

    public C1954g(PrecomputedText.Params params) {
        this.f5870a = params.getTextPaint();
        this.f5871b = params.getTextDirection();
        this.f5872c = params.getBreakStrategy();
        this.f5873d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1954g)) {
            return false;
        }
        C1954g gVar = (C1954g) obj;
        return this.f5872c == gVar.f5872c && this.f5873d == gVar.f5873d && this.f5870a.getTextSize() == gVar.f5870a.getTextSize() && this.f5870a.getTextScaleX() == gVar.f5870a.getTextScaleX() && this.f5870a.getTextSkewX() == gVar.f5870a.getTextSkewX() && this.f5870a.getLetterSpacing() == gVar.f5870a.getLetterSpacing() && TextUtils.equals(this.f5870a.getFontFeatureSettings(), gVar.f5870a.getFontFeatureSettings()) && this.f5870a.getFlags() == gVar.f5870a.getFlags() && this.f5870a.getTextLocales().equals(gVar.f5870a.getTextLocales()) && (this.f5870a.getTypeface() != null ? this.f5870a.getTypeface().equals(gVar.f5870a.getTypeface()) : gVar.f5870a.getTypeface() == null) && this.f5871b == gVar.f5871b;
    }

    public final int hashCode() {
        return C1968c.m5304a(Float.valueOf(this.f5870a.getTextSize()), Float.valueOf(this.f5870a.getTextScaleX()), Float.valueOf(this.f5870a.getTextSkewX()), Float.valueOf(this.f5870a.getLetterSpacing()), Integer.valueOf(this.f5870a.getFlags()), this.f5870a.getTextLocales(), this.f5870a.getTypeface(), Boolean.valueOf(this.f5870a.isElegantTextHeight()), this.f5871b, Integer.valueOf(this.f5872c), Integer.valueOf(this.f5873d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("textSize=" + this.f5870a.getTextSize());
        sb.append(", textScaleX=" + this.f5870a.getTextScaleX());
        sb.append(", textSkewX=" + this.f5870a.getTextSkewX());
        sb.append(", letterSpacing=" + this.f5870a.getLetterSpacing());
        sb.append(", elegantTextHeight=" + this.f5870a.isElegantTextHeight());
        StringBuilder sb2 = new StringBuilder(", textLocale=");
        LocaleList textLocales = this.f5870a.getTextLocales();
        sb2.append(textLocales);
        sb.append(", textLocale=".concat(String.valueOf(textLocales)));
        StringBuilder sb3 = new StringBuilder(", typeface=");
        Typeface typeface = this.f5870a.getTypeface();
        sb3.append(typeface);
        sb.append(", typeface=".concat(String.valueOf(typeface)));
        sb.append(", variationSettings=".concat(String.valueOf(this.f5870a.getFontVariationSettings())));
        StringBuilder sb4 = new StringBuilder(", textDir=");
        TextDirectionHeuristic textDirectionHeuristic = this.f5871b;
        sb4.append(textDirectionHeuristic);
        sb.append(", textDir=".concat(String.valueOf(textDirectionHeuristic)));
        sb.append(", breakStrategy=" + this.f5872c);
        sb.append(", hyphenationFrequency=" + this.f5873d);
        sb.append("}");
        return sb.toString();
    }
}
