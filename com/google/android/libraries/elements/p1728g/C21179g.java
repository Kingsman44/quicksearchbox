package com.google.android.libraries.elements.p1728g;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.C6007z;
import com.facebook.litho.C6128bi;
import com.facebook.litho.C6176cx;
import com.facebook.litho.C6258fa;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.C6564z;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p333i.C6396a;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21265bh;
import com.google.android.libraries.elements.interfaces.C21266bi;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import com.google.android.libraries.elements.internal.C21341b;
import com.google.android.libraries.elements.p1705a.p1706a.C20682f;
import com.google.android.libraries.elements.p1714d.p1717c.C20848e;

/* renamed from: com.google.android.libraries.elements.g.g */
/* compiled from: PG */
public final class C21179g extends C6407q {

    /* renamed from: H */
    public static final /* synthetic */ int f59406H = 0;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: A */
    C21266bi f59407A;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: B */
    float f59408B;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: C */
    int f59409C;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: D */
    C21259bb f59410D;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: E */
    boolean f59411E;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: F */
    boolean f59412F;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: G */
    C20848e f59413G;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    Boolean f59414a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    C21341b f59415b;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    C21319z f59416c;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    ImageProxy f59417d;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: e */
    ImageProxy f59418e;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: f */
    ImageProxy f59419f;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: g */
    C21265bh f59420g;

    public C21179g() {
        super("GlideImage");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 30;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return C21193u.m39818a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo12803W(C6411u uVar, C6564z zVar) {
        C6258fa faVar = new C6258fa();
        C6258fa faVar2 = new C6258fa();
        C21193u.m39820c(uVar, zVar, this.f59419f, this.f59409C, this.f59410D, this.f59417d, this.f59418e, this.f59416c, this.f59411E, faVar, faVar2);
        C21178f fVar = (C21178f) this.f19000w;
        fVar.f59404a = (C6007z) faVar.f18496a;
        fVar.f59405b = (C6276fs) faVar2.f18496a;
    }

    /* renamed from: X */
    public final void mo12804X(C6411u uVar, C6564z zVar, int i, int i2, C6276fs fsVar) {
        float f;
        ImageProxy imageProxy = this.f59419f;
        int i3 = C21193u.f59456a;
        C20682f fVar = (C20682f) imageProxy;
        if (fVar.f57966b.isEmpty()) {
            f = 1.0f;
        } else {
            ImageSourceProxy imageSourceProxy = (ImageSourceProxy) fVar.f57966b.get(0);
            f = ((float) imageSourceProxy.width()) / ((float) imageSourceProxy.height());
        }
        C6396a.m17150b(i, i2, f, fsVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        ImageProxy imageProxy = this.f59419f;
        ImageProxy imageProxy2 = this.f59417d;
        ImageProxy imageProxy3 = this.f59418e;
        C21266bi biVar = this.f59407A;
        C21265bh bhVar = this.f59420g;
        Boolean bool = this.f59414a;
        C21319z zVar = this.f59416c;
        C21341b bVar = this.f59415b;
        C21178f fVar = (C21178f) this.f19000w;
        C21193u.m39825h(uVar, (ImageView) obj, imageProxy, imageProxy2, imageProxy3, biVar, bhVar, bool, zVar, bVar, fVar.f59404a, fVar.f59405b, this.f59410D, this.f59413G, this.f59412F);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo12806Z(C6411u uVar) {
        int i = C21193u.f59456a;
        C21193u.m39821d(uVar, this.f59408B);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo12810aa(C6411u uVar, Object obj) {
        C21193u.m39822e(uVar, (ImageView) obj, this.f59407A, this.f59414a, this.f59415b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo12815af() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public final boolean mo12821al() {
        return true;
    }

    /* renamed from: am */
    public final boolean mo12822am() {
        return true;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 3;
    }

    /* renamed from: ap */
    public final void mo12825ap(String str) {
        if (((str.hashCode() == 12951634 && str.equals("imageprefetch")) ? (char) 0 : 65535) == 0) {
            int i = C21193u.f59456a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public final boolean mo12828as(C6407q qVar, C6407q qVar2) {
        ImageProxy imageProxy;
        ImageProxy imageProxy2;
        C21179g gVar = (C21179g) qVar;
        C21179g gVar2 = (C21179g) qVar2;
        ImageProxy imageProxy3 = null;
        if (gVar == null) {
            imageProxy = null;
        } else {
            imageProxy = gVar.f59419f;
        }
        C6128bi biVar = new C6128bi(imageProxy, gVar2.f59419f);
        if (gVar == null) {
            imageProxy2 = null;
        } else {
            imageProxy2 = gVar.f59417d;
        }
        C6128bi biVar2 = new C6128bi(imageProxy2, gVar2.f59417d);
        if (gVar != null) {
            imageProxy3 = gVar.f59418e;
        }
        return C21193u.m39823f(biVar, biVar2, new C6128bi(imageProxy3, gVar2.f59418e));
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C21179g gVar = (C21179g) qVar;
        Boolean bool = this.f59414a;
        if (bool == null ? gVar.f59414a != null : !bool.equals(gVar.f59414a)) {
            return false;
        }
        C21341b bVar = this.f59415b;
        if (bVar == null ? gVar.f59415b != null : !bVar.equals(gVar.f59415b)) {
            return false;
        }
        C21319z zVar = this.f59416c;
        if (zVar == null ? gVar.f59416c != null : !zVar.equals(gVar.f59416c)) {
            return false;
        }
        ImageProxy imageProxy = this.f59417d;
        if (imageProxy == null ? gVar.f59417d != null : !imageProxy.equals(gVar.f59417d)) {
            return false;
        }
        ImageProxy imageProxy2 = this.f59418e;
        if (imageProxy2 == null ? gVar.f59418e != null : !imageProxy2.equals(gVar.f59418e)) {
            return false;
        }
        ImageProxy imageProxy3 = this.f59419f;
        if (imageProxy3 == null ? gVar.f59419f != null : !imageProxy3.equals(gVar.f59419f)) {
            return false;
        }
        C21265bh bhVar = this.f59420g;
        if (bhVar == null ? gVar.f59420g != null : !bhVar.equals(gVar.f59420g)) {
            return false;
        }
        C21266bi biVar = this.f59407A;
        if (biVar == null ? gVar.f59407A != null : !biVar.equals(gVar.f59407A)) {
            return false;
        }
        if (Float.compare(this.f59408B, gVar.f59408B) != 0) {
            return false;
        }
        C20848e eVar = this.f59413G;
        if (eVar == null ? gVar.f59413G != null : !eVar.equals(gVar.f59413G)) {
            return false;
        }
        if (this.f59409C != gVar.f59409C) {
            return false;
        }
        C21259bb bbVar = this.f59410D;
        if (bbVar == null ? gVar.f59410D == null : bbVar.equals(gVar.f59410D)) {
            return this.f59411E == gVar.f59411E && this.f59412F == gVar.f59412F;
        }
        return false;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C6407q mo13318j() {
        C21179g gVar = (C21179g) super.mo13318j();
        gVar.f19000w = new C21178f();
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final /* synthetic */ C6176cx mo13459n() {
        return new C21178f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo13462r(C6176cx cxVar, C6176cx cxVar2) {
        C21178f fVar = (C21178f) cxVar;
        C21178f fVar2 = (C21178f) cxVar2;
        fVar.f59404a = fVar2.f59404a;
        fVar.f59405b = fVar2.f59405b;
    }

    /* renamed from: at */
    public final void mo12829at(String str) {
        if (((str.hashCode() == 12951634 && str.equals("imageprefetch")) ? (char) 0 : 65535) == 0) {
            C21178f fVar = (C21178f) this.f19000w;
            C21193u.m39824g(fVar.f59404a, fVar.f59405b, this.f59419f);
        }
    }
}
