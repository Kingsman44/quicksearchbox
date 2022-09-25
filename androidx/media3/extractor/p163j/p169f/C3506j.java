package androidx.media3.extractor.p163j.p169f;

import android.text.Layout;

/* renamed from: androidx.media3.extractor.j.f.j */
/* compiled from: PG */
final class C3506j {

    /* renamed from: a */
    public String f10932a;

    /* renamed from: b */
    public int f10933b;

    /* renamed from: c */
    public boolean f10934c;

    /* renamed from: d */
    public int f10935d;

    /* renamed from: e */
    public boolean f10936e;

    /* renamed from: f */
    public int f10937f = -1;

    /* renamed from: g */
    public int f10938g = -1;

    /* renamed from: h */
    public int f10939h = -1;

    /* renamed from: i */
    public int f10940i = -1;

    /* renamed from: j */
    public int f10941j = -1;

    /* renamed from: k */
    public float f10942k;

    /* renamed from: l */
    public String f10943l;

    /* renamed from: m */
    public int f10944m = -1;

    /* renamed from: n */
    public int f10945n = -1;

    /* renamed from: o */
    public Layout.Alignment f10946o;

    /* renamed from: p */
    public Layout.Alignment f10947p;

    /* renamed from: q */
    public int f10948q = -1;

    /* renamed from: r */
    public C3498b f10949r;

    /* renamed from: s */
    public float f10950s = Float.MAX_VALUE;

    /* renamed from: a */
    public final int mo7443a() {
        int i = this.f10939h;
        if (i == -1 && this.f10940i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f10940i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: b */
    public final void mo7444b(C3506j jVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (jVar != null) {
            if (!this.f10934c && jVar.f10934c) {
                mo7446d(jVar.f10933b);
            }
            if (this.f10939h == -1) {
                this.f10939h = jVar.f10939h;
            }
            if (this.f10940i == -1) {
                this.f10940i = jVar.f10940i;
            }
            if (this.f10932a == null && (str = jVar.f10932a) != null) {
                this.f10932a = str;
            }
            if (this.f10937f == -1) {
                this.f10937f = jVar.f10937f;
            }
            if (this.f10938g == -1) {
                this.f10938g = jVar.f10938g;
            }
            if (this.f10945n == -1) {
                this.f10945n = jVar.f10945n;
            }
            if (this.f10946o == null && (alignment2 = jVar.f10946o) != null) {
                this.f10946o = alignment2;
            }
            if (this.f10947p == null && (alignment = jVar.f10947p) != null) {
                this.f10947p = alignment;
            }
            if (this.f10948q == -1) {
                this.f10948q = jVar.f10948q;
            }
            if (this.f10941j == -1) {
                this.f10941j = jVar.f10941j;
                this.f10942k = jVar.f10942k;
            }
            if (this.f10949r == null) {
                this.f10949r = jVar.f10949r;
            }
            if (this.f10950s == Float.MAX_VALUE) {
                this.f10950s = jVar.f10950s;
            }
            if (!this.f10936e && jVar.f10936e) {
                mo7445c(jVar.f10935d);
            }
            if (this.f10944m == -1 && (i = jVar.f10944m) != -1) {
                this.f10944m = i;
            }
        }
    }

    /* renamed from: c */
    public final void mo7445c(int i) {
        this.f10935d = i;
        this.f10936e = true;
    }

    /* renamed from: d */
    public final void mo7446d(int i) {
        this.f10933b = i;
        this.f10934c = true;
    }
}
