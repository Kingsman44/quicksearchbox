package com.facebook.p308a.p309a;

import android.content.res.ColorStateList;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.p096h.C1956i;
import androidx.core.p096h.C1963p;
import java.util.Arrays;

/* renamed from: com.facebook.a.a.a */
/* compiled from: PG */
public final class C6016a {

    /* renamed from: a */
    public TextPaint f17715a = new TextPaint(1);

    /* renamed from: b */
    public float f17716b;

    /* renamed from: c */
    public float f17717c;

    /* renamed from: d */
    public float f17718d;

    /* renamed from: e */
    public int f17719e;

    /* renamed from: f */
    public int f17720f;

    /* renamed from: g */
    public int f17721g;

    /* renamed from: h */
    public CharSequence f17722h;

    /* renamed from: i */
    public ColorStateList f17723i;

    /* renamed from: j */
    public float f17724j = 1.0f;

    /* renamed from: k */
    public float f17725k = 0.0f;

    /* renamed from: l */
    public boolean f17726l = true;

    /* renamed from: m */
    public TextUtils.TruncateAt f17727m = null;

    /* renamed from: n */
    public int f17728n = Integer.MAX_VALUE;

    /* renamed from: o */
    Layout.Alignment f17729o = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: p */
    C1956i f17730p = C1963p.f5881c;

    /* renamed from: q */
    public int f17731q = 0;

    /* renamed from: r */
    boolean f17732r = false;

    /* renamed from: a */
    public final void mo12559a() {
        if (this.f17732r) {
            TextPaint textPaint = new TextPaint(this.f17715a);
            textPaint.set(this.f17715a);
            this.f17715a = textPaint;
            this.f17732r = false;
        }
    }

    public final int hashCode() {
        int i = 0;
        int color = (((((((((((((((((((((((((((((((((this.f17715a.getColor() + 31) * 31) + Float.floatToIntBits(this.f17715a.getTextSize())) * 31) + (this.f17715a.getTypeface() != null ? this.f17715a.getTypeface().hashCode() : 0)) * 31) + Float.floatToIntBits(this.f17716b)) * 31) + Float.floatToIntBits(this.f17717c)) * 31) + Float.floatToIntBits(this.f17718d)) * 31) + this.f17719e) * 31) + this.f17715a.linkColor) * 31) + Float.floatToIntBits(this.f17715a.density)) * 31) + Arrays.hashCode(this.f17715a.drawableState)) * 31) + this.f17720f) * 31) + this.f17721g) * 31) + Float.floatToIntBits(this.f17724j)) * 31) + Float.floatToIntBits(this.f17725k)) * 31) + Float.floatToIntBits(Float.MAX_VALUE)) * 31) + (this.f17726l ? 1 : 0)) * 31) + 1) * 31;
        TextUtils.TruncateAt truncateAt = this.f17727m;
        int hashCode = (((color + (truncateAt != null ? truncateAt.hashCode() : 0)) * 961) + this.f17728n) * 31;
        Layout.Alignment alignment = this.f17729o;
        int hashCode2 = (hashCode + (alignment != null ? alignment.hashCode() : 0)) * 31;
        C1956i iVar = this.f17730p;
        int hashCode3 = (((((((hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.f17731q) * 961) + Arrays.hashCode((int[]) null)) * 31) + Arrays.hashCode((int[]) null)) * 31;
        CharSequence charSequence = this.f17722h;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return hashCode3 + i;
    }
}
