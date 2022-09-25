package com.bumptech.glide.p287f;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.C5956o;
import com.bumptech.glide.load.C5959r;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.load.p297b.p298a.C5737b;
import com.bumptech.glide.load.p299c.p300a.C5823ab;
import com.bumptech.glide.load.p299c.p300a.C5825ad;
import com.bumptech.glide.load.p299c.p300a.C5854c;
import com.bumptech.glide.load.p299c.p300a.C5860i;
import com.bumptech.glide.load.p299c.p300a.C5861j;
import com.bumptech.glide.load.p299c.p300a.C5862k;
import com.bumptech.glide.load.p299c.p300a.C5873v;
import com.bumptech.glide.load.p299c.p300a.C5876y;
import com.bumptech.glide.load.p299c.p304e.C5900e;
import com.bumptech.glide.load.p299c.p304e.C5903h;
import com.bumptech.glide.p290g.C5600c;
import com.bumptech.glide.p291h.C5617d;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.C5632s;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.Map;

/* renamed from: com.bumptech.glide.f.a */
/* compiled from: PG */
public class C5558a implements Cloneable {

    /* renamed from: a */
    public int f16814a;

    /* renamed from: b */
    public float f16815b = 1.0f;

    /* renamed from: c */
    public C5731x f16816c = C5731x.f17285d;

    /* renamed from: d */
    public C5997p f16817d = C5997p.NORMAL;

    /* renamed from: e */
    public Drawable f16818e;

    /* renamed from: f */
    public int f16819f;

    /* renamed from: g */
    public Drawable f16820g;

    /* renamed from: h */
    public int f16821h;

    /* renamed from: i */
    public boolean f16822i = true;

    /* renamed from: j */
    public int f16823j = -1;

    /* renamed from: k */
    public int f16824k = -1;

    /* renamed from: l */
    public C5955n f16825l = C5600c.f16937b;

    /* renamed from: m */
    public boolean f16826m;

    /* renamed from: n */
    public boolean f16827n = true;

    /* renamed from: o */
    public Drawable f16828o;

    /* renamed from: p */
    public C5960s f16829p = new C5960s();

    /* renamed from: q */
    public Map f16830q = new C5617d();

    /* renamed from: r */
    public Class f16831r = Object.class;

    /* renamed from: s */
    public boolean f16832s;

    /* renamed from: t */
    public boolean f16833t;

    /* renamed from: u */
    public boolean f16834u;

    /* renamed from: v */
    public boolean f16835v = true;

    /* renamed from: w */
    public boolean f16836w;

    /* renamed from: x */
    private int f16837x;

    /* renamed from: y */
    private Resources.Theme f16838y;

    /* renamed from: z */
    private boolean f16839z;

    /* renamed from: a */
    private final C5558a m14349a(C5873v vVar, C5964w wVar, boolean z) {
        C5558a aVar;
        if (z) {
            aVar = mo11972Y(vVar, wVar);
        } else {
            aVar = mo11960M(vVar, wVar);
        }
        aVar.f16835v = true;
        return aVar;
    }

    /* renamed from: aa */
    public static boolean m14350aa(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: A */
    public C5558a mo11948A() {
        if (this.f16833t) {
            return clone().mo11948A();
        }
        this.f16830q.clear();
        int i = this.f16814a;
        this.f16826m = false;
        this.f16827n = false;
        this.f16814a = (i & -133121) | 65536;
        this.f16835v = true;
        mo11977ae();
        return this;
    }

    /* renamed from: B */
    public C5558a mo11949B(C5873v vVar) {
        C5959r rVar = C5873v.f17475f;
        C5630q.m14607d(vVar, "Argument must not be null");
        return mo11966S(rVar, vVar);
    }

    /* renamed from: C */
    public C5558a mo11950C(Bitmap.CompressFormat compressFormat) {
        C5959r rVar = C5854c.f17456b;
        C5630q.m14607d(compressFormat, "Argument must not be null");
        return mo11966S(rVar, compressFormat);
    }

    /* renamed from: D */
    public C5558a mo11951D(int i) {
        return mo11966S(C5854c.f17455a, Integer.valueOf(i));
    }

    /* renamed from: E */
    public C5558a mo11952E(int i) {
        if (this.f16833t) {
            return clone().mo11952E(i);
        }
        this.f16819f = i;
        int i2 = this.f16814a;
        this.f16818e = null;
        this.f16814a = (i2 | 32) & -17;
        mo11977ae();
        return this;
    }

    /* renamed from: F */
    public C5558a mo11953F(Drawable drawable) {
        if (this.f16833t) {
            return clone().mo11953F(drawable);
        }
        this.f16818e = drawable;
        int i = this.f16814a;
        this.f16819f = 0;
        this.f16814a = (i | 16) & -33;
        mo11977ae();
        return this;
    }

    /* renamed from: G */
    public C5558a mo11954G(Drawable drawable) {
        if (this.f16833t) {
            return clone().mo11954G(drawable);
        }
        this.f16828o = drawable;
        int i = this.f16814a;
        this.f16837x = 0;
        this.f16814a = (i | 8192) & -16385;
        mo11977ae();
        return this;
    }

    /* renamed from: H */
    public C5558a mo11955H() {
        return m14349a(C5873v.f17470a, new C5825ad(), true);
    }

    /* renamed from: I */
    public C5558a mo11956I(boolean z) {
        if (this.f16833t) {
            return clone().mo11956I(z);
        }
        this.f16834u = z;
        this.f16814a |= 524288;
        mo11977ae();
        return this;
    }

    /* renamed from: J */
    public C5558a mo11957J() {
        return mo11960M(C5873v.f17472c, new C5860i());
    }

    /* renamed from: K */
    public C5558a mo11958K() {
        return m14349a(C5873v.f17471b, new C5861j(), false);
    }

    /* renamed from: L */
    public C5558a mo11959L() {
        return m14349a(C5873v.f17470a, new C5825ad(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final C5558a mo11960M(C5873v vVar, C5964w wVar) {
        if (this.f16833t) {
            return clone().mo11960M(vVar, wVar);
        }
        mo11949B(vVar);
        return mo11971X(wVar, false);
    }

    /* renamed from: N */
    public C5558a mo11961N(int i) {
        return mo11962O(i, i);
    }

    /* renamed from: O */
    public C5558a mo11962O(int i, int i2) {
        if (this.f16833t) {
            return clone().mo11962O(i, i2);
        }
        this.f16824k = i;
        this.f16823j = i2;
        this.f16814a |= 512;
        mo11977ae();
        return this;
    }

    /* renamed from: P */
    public C5558a mo11963P(int i) {
        if (this.f16833t) {
            return clone().mo11963P(i);
        }
        this.f16821h = i;
        int i2 = this.f16814a;
        this.f16820g = null;
        this.f16814a = (i2 | 128) & -65;
        mo11977ae();
        return this;
    }

    /* renamed from: Q */
    public C5558a mo11964Q(Drawable drawable) {
        if (this.f16833t) {
            return clone().mo11964Q(drawable);
        }
        this.f16820g = drawable;
        int i = this.f16814a;
        this.f16821h = 0;
        this.f16814a = (i | 64) & -129;
        mo11977ae();
        return this;
    }

    /* renamed from: U */
    public C5558a mo11968U(int i) {
        return mo11966S(C5737b.f17295a, Integer.valueOf(i));
    }

    /* renamed from: V */
    public C5558a mo11969V(C5964w wVar) {
        return mo11971X(wVar, true);
    }

    /* renamed from: W */
    public C5558a mo11970W(C5964w... wVarArr) {
        return mo11971X(new C5956o(wVarArr), true);
    }

    /* renamed from: X */
    public final C5558a mo11971X(C5964w wVar, boolean z) {
        if (this.f16833t) {
            return clone().mo11971X(wVar, z);
        }
        C5823ab abVar = new C5823ab(wVar, z);
        mo11973Z(Bitmap.class, wVar, z);
        mo11973Z(Drawable.class, abVar, z);
        mo11973Z(BitmapDrawable.class, abVar, z);
        mo11973Z(C5900e.class, new C5903h(wVar), z);
        mo11977ae();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final C5558a mo11972Y(C5873v vVar, C5964w wVar) {
        if (this.f16833t) {
            return clone().mo11972Y(vVar, wVar);
        }
        mo11949B(vVar);
        return mo11969V(wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final C5558a mo11973Z(Class cls, C5964w wVar, boolean z) {
        if (this.f16833t) {
            return clone().mo11973Z(cls, wVar, z);
        }
        C5630q.m14607d(wVar, "Argument must not be null");
        this.f16830q.put(cls, wVar);
        int i = this.f16814a;
        this.f16827n = true;
        int i2 = i | 67584;
        this.f16814a = i2;
        this.f16835v = false;
        if (z) {
            this.f16814a = i2 | C89885b.S3REQUEST_VALUE;
            this.f16826m = true;
        }
        mo11977ae();
        return this;
    }

    /* renamed from: ab */
    public final boolean mo11974ab() {
        return C5632s.m14622o(this.f16824k, this.f16823j);
    }

    /* renamed from: ac */
    public C5558a mo11975ac() {
        if (this.f16833t) {
            return clone().mo11975ac();
        }
        this.f16836w = true;
        this.f16814a |= 1048576;
        mo11977ae();
        return this;
    }

    /* renamed from: ad */
    public void mo11976ad() {
        this.f16832s = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final void mo11977ae() {
        if (this.f16832s) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* renamed from: af */
    public C5558a mo11978af() {
        if (this.f16833t) {
            return clone().mo11978af();
        }
        this.f16822i = false;
        this.f16814a |= 256;
        mo11977ae();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5558a) {
            C5558a aVar = (C5558a) obj;
            if (Float.compare(aVar.f16815b, this.f16815b) == 0 && this.f16819f == aVar.f16819f && C5632s.m14619l(this.f16818e, aVar.f16818e) && this.f16821h == aVar.f16821h && C5632s.m14619l(this.f16820g, aVar.f16820g)) {
                int i = aVar.f16837x;
                if (C5632s.m14619l(this.f16828o, aVar.f16828o) && this.f16822i == aVar.f16822i && this.f16823j == aVar.f16823j && this.f16824k == aVar.f16824k && this.f16826m == aVar.f16826m && this.f16827n == aVar.f16827n) {
                    boolean z = aVar.f16839z;
                    if (this.f16834u == aVar.f16834u && this.f16816c.equals(aVar.f16816c) && this.f16817d == aVar.f16817d && this.f16829p.equals(aVar.f16829p) && this.f16830q.equals(aVar.f16830q) && this.f16831r.equals(aVar.f16831r) && C5632s.m14619l(this.f16825l, aVar.f16825l)) {
                        Resources.Theme theme = aVar.f16838y;
                        if (C5632s.m14619l((Object) null, (Object) null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f16815b);
        int e = C5632s.m14612e(this.f16818e, C5632s.m14611d(this.f16819f, floatToIntBits + 527));
        int e2 = C5632s.m14612e(this.f16828o, C5632s.m14611d(0, C5632s.m14612e(this.f16820g, C5632s.m14611d(this.f16821h, e))));
        boolean z = this.f16822i;
        int i = this.f16823j;
        return C5632s.m14612e((Object) null, C5632s.m14612e(this.f16825l, C5632s.m14612e(this.f16831r, C5632s.m14612e(this.f16830q, C5632s.m14612e(this.f16829p, C5632s.m14612e(this.f16817d, C5632s.m14612e(this.f16816c, (((((C5632s.m14611d(this.f16824k, C5632s.m14611d(i, (e2 * 31) + (z ? 1 : 0))) * 31) + (this.f16826m ? 1 : 0)) * 31) + (this.f16827n ? 1 : 0)) * 961) + (this.f16834u ? 1 : 0))))))));
    }

    /* renamed from: o */
    public C5558a mo11982o(C5558a aVar) {
        if (this.f16833t) {
            return clone().mo11982o(aVar);
        }
        int i = aVar.f16814a;
        if (m14350aa(i, 2)) {
            this.f16815b = aVar.f16815b;
        }
        if (m14350aa(i, C89885b.HTTP_VALUE)) {
            boolean z = aVar.f16839z;
            this.f16839z = false;
        }
        if (m14350aa(i, 1048576)) {
            this.f16836w = aVar.f16836w;
        }
        if (m14350aa(i, 4)) {
            this.f16816c = aVar.f16816c;
        }
        if (m14350aa(i, 8)) {
            this.f16817d = aVar.f16817d;
        }
        if (m14350aa(i, 16)) {
            this.f16818e = aVar.f16818e;
            this.f16819f = 0;
            this.f16814a &= -33;
        }
        if (m14350aa(aVar.f16814a, 32)) {
            this.f16819f = aVar.f16819f;
            this.f16818e = null;
            this.f16814a &= -17;
        }
        if (m14350aa(aVar.f16814a, 64)) {
            this.f16820g = aVar.f16820g;
            this.f16821h = 0;
            this.f16814a &= -129;
        }
        if (m14350aa(aVar.f16814a, 128)) {
            this.f16821h = aVar.f16821h;
            this.f16820g = null;
            this.f16814a &= -65;
        }
        int i2 = aVar.f16814a;
        if (m14350aa(i2, 256)) {
            this.f16822i = aVar.f16822i;
        }
        if (m14350aa(i2, 512)) {
            this.f16824k = aVar.f16824k;
            this.f16823j = aVar.f16823j;
        }
        if (m14350aa(i2, 1024)) {
            this.f16825l = aVar.f16825l;
        }
        if (m14350aa(i2, 4096)) {
            this.f16831r = aVar.f16831r;
        }
        if (m14350aa(i2, 8192)) {
            this.f16828o = aVar.f16828o;
            this.f16837x = 0;
            this.f16814a &= -16385;
        }
        if (m14350aa(aVar.f16814a, 16384)) {
            int i3 = aVar.f16837x;
            this.f16837x = 0;
            this.f16828o = null;
            this.f16814a &= -8193;
        }
        int i4 = aVar.f16814a;
        if (m14350aa(i4, 32768)) {
            Resources.Theme theme = aVar.f16838y;
            this.f16838y = null;
        }
        if (m14350aa(i4, 65536)) {
            this.f16827n = aVar.f16827n;
        }
        if (m14350aa(i4, C89885b.S3REQUEST_VALUE)) {
            this.f16826m = aVar.f16826m;
        }
        if (m14350aa(i4, 2048)) {
            this.f16830q.putAll(aVar.f16830q);
            this.f16835v = aVar.f16835v;
        }
        if (m14350aa(aVar.f16814a, 524288)) {
            this.f16834u = aVar.f16834u;
        }
        if (!this.f16827n) {
            this.f16830q.clear();
            int i5 = this.f16814a;
            this.f16826m = false;
            this.f16814a = i5 & -133121;
            this.f16835v = true;
        }
        this.f16814a |= aVar.f16814a;
        this.f16829p.mo12402c(aVar.f16829p);
        mo11977ae();
        return this;
    }

    /* renamed from: p */
    public C5558a clone() {
        try {
            C5558a aVar = (C5558a) super.clone();
            C5960s sVar = new C5960s();
            aVar.f16829p = sVar;
            sVar.mo12402c(this.f16829p);
            C5617d dVar = new C5617d();
            aVar.f16830q = dVar;
            dVar.putAll(this.f16830q);
            aVar.f16832s = false;
            aVar.f16833t = false;
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: v */
    public C5558a mo11985v() {
        return m14349a(C5873v.f17471b, new C5861j(), true);
    }

    /* renamed from: w */
    public C5558a mo11986w() {
        return mo11972Y(C5873v.f17471b, new C5862k());
    }

    /* renamed from: y */
    public C5558a mo11988y() {
        return mo11966S(C5876y.f17480d, false);
    }

    /* renamed from: u */
    public C5558a mo11984u() {
        if (!this.f16832s || this.f16833t) {
            this.f16833t = true;
            mo11976ad();
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: x */
    public C5558a mo11987x(Class cls) {
        if (this.f16833t) {
            return clone().mo11987x(cls);
        }
        this.f16831r = cls;
        this.f16814a |= 4096;
        mo11977ae();
        return this;
    }

    /* renamed from: z */
    public C5558a mo11989z(C5731x xVar) {
        if (this.f16833t) {
            return clone().mo11989z(xVar);
        }
        this.f16816c = xVar;
        this.f16814a |= 4;
        mo11977ae();
        return this;
    }

    /* renamed from: R */
    public C5558a mo11965R(C5997p pVar) {
        if (this.f16833t) {
            return clone().mo11965R(pVar);
        }
        C5630q.m14607d(pVar, "Argument must not be null");
        this.f16817d = pVar;
        this.f16814a |= 8;
        mo11977ae();
        return this;
    }

    /* renamed from: T */
    public C5558a mo11967T(C5955n nVar) {
        if (this.f16833t) {
            return clone().mo11967T(nVar);
        }
        C5630q.m14607d(nVar, "Argument must not be null");
        this.f16825l = nVar;
        this.f16814a |= 1024;
        mo11977ae();
        return this;
    }

    /* renamed from: S */
    public C5558a mo11966S(C5959r rVar, Object obj) {
        if (this.f16833t) {
            return clone().mo11966S(rVar, obj);
        }
        C5630q.m14607d(rVar, "Argument must not be null");
        this.f16829p.f17620b.put(rVar, obj);
        mo11977ae();
        return this;
    }
}
