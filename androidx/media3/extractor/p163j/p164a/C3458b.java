package androidx.media3.extractor.p163j.p164a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p135a.C2567c;
import androidx.media3.common.p136b.C2612ak;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.a.b */
/* compiled from: PG */
final class C3458b {

    /* renamed from: a */
    public final List f10683a = new ArrayList();

    /* renamed from: b */
    public final List f10684b = new ArrayList();

    /* renamed from: c */
    public final StringBuilder f10685c = new StringBuilder();

    /* renamed from: d */
    public int f10686d;

    /* renamed from: e */
    public int f10687e;

    /* renamed from: f */
    public int f10688f;

    /* renamed from: g */
    public int f10689g;

    /* renamed from: h */
    public int f10690h;

    public C3458b(int i, int i2) {
        mo7417e(i);
        this.f10690h = i2;
    }

    /* renamed from: h */
    private static void m10009h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }
    }

    /* renamed from: i */
    private static void m10010i(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    /* renamed from: j */
    private static void m10011j(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    /* renamed from: a */
    public final SpannableString mo7413a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10685c);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = -1;
        boolean z = false;
        while (i < this.f10683a.size()) {
            C3457a aVar = (C3457a) this.f10683a.get(i);
            boolean z2 = aVar.f10681b;
            int i7 = aVar.f10680a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i3 = C3459c.f10691a[i7];
                }
                z = z3;
            }
            int i8 = aVar.f10682c;
            i++;
            if (i8 != (i < this.f10683a.size() ? ((C3457a) this.f10683a.get(i)).f10682c : length)) {
                if (i2 != -1 && !z2) {
                    m10011j(spannableStringBuilder, i2, i8);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i4 != -1 && !z) {
                    m10010i(spannableStringBuilder, i4, i8);
                    i4 = -1;
                } else if (i4 == -1 && z) {
                    i4 = i8;
                }
                if (i3 != i6) {
                    m10009h(spannableStringBuilder, i5, i8, i6);
                    i6 = i3;
                    i5 = i8;
                }
            }
        }
        if (!(i2 == -1 || i2 == length)) {
            m10011j(spannableStringBuilder, i2, length);
        }
        if (!(i4 == -1 || i4 == length)) {
            m10010i(spannableStringBuilder, i4, length);
        }
        if (i5 != length) {
            m10009h(spannableStringBuilder, i5, length, i6);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* renamed from: b */
    public final C2567c mo7414b(int i) {
        float f;
        int i2 = this.f10687e + this.f10688f;
        int i3 = 32 - i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i4 = 0; i4 < this.f10684b.size(); i4++) {
            spannableStringBuilder.append(C2612ak.m6926I((CharSequence) this.f10684b.get(i4), i3));
            spannableStringBuilder.append(10);
        }
        spannableStringBuilder.append(C2612ak.m6926I(mo7413a(), i3));
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length = i3 - spannableStringBuilder.length();
        int i5 = i2 - length;
        if (i == Integer.MIN_VALUE) {
            i = (this.f10689g != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.f10689g != 2 || i5 <= 0) ? 0 : 2 : 1;
        }
        if (i != 1) {
            if (i == 2) {
                i2 = 32 - length;
            }
            f = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.f10686d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.f10689g == 1) {
            i6 -= this.f10690h - 1;
        }
        C2566b bVar = new C2566b();
        bVar.f7065a = spannableStringBuilder;
        bVar.f7067c = Layout.Alignment.ALIGN_NORMAL;
        bVar.f7069e = (float) i6;
        bVar.f7070f = 1;
        bVar.f7072h = f;
        bVar.f7073i = i;
        return bVar.mo6076a();
    }

    /* renamed from: c */
    public final void mo7415c(char c) {
        if (this.f10685c.length() < 32) {
            this.f10685c.append(c);
        }
    }

    /* renamed from: d */
    public final void mo7416d() {
        C3457a aVar;
        int i;
        int length = this.f10685c.length();
        if (length > 0) {
            this.f10685c.delete(length - 1, length);
            int size = this.f10683a.size();
            while (true) {
                size--;
                if (size >= 0 && (i = (aVar = (C3457a) this.f10683a.get(size)).f10682c) == length) {
                    aVar.f10682c = i - 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo7417e(int i) {
        this.f10689g = i;
        this.f10683a.clear();
        this.f10684b.clear();
        this.f10685c.setLength(0);
        this.f10686d = 15;
        this.f10687e = 0;
        this.f10688f = 0;
    }

    /* renamed from: f */
    public final void mo7418f(int i, boolean z) {
        this.f10683a.add(new C3457a(i, z, this.f10685c.length()));
    }

    /* renamed from: g */
    public final boolean mo7419g() {
        return this.f10683a.isEmpty() && this.f10684b.isEmpty() && this.f10685c.length() == 0;
    }
}
