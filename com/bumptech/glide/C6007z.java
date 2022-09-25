package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.p287f.C5558a;
import com.bumptech.glide.p287f.C5576b;
import com.bumptech.glide.p287f.C5587d;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p287f.C5590g;
import com.bumptech.glide.p287f.C5591h;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p287f.C5595l;
import com.bumptech.glide.p287f.C5596m;
import com.bumptech.glide.p287f.p288a.C5567i;
import com.bumptech.glide.p287f.p288a.C5569k;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p290g.C5598a;
import com.bumptech.glide.p290g.C5599b;
import com.bumptech.glide.p291h.C5622i;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.C5632s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.z */
/* compiled from: PG */
public class C6007z extends C5558a implements Cloneable {

    /* renamed from: A */
    private final C5636l f17696A;

    /* renamed from: B */
    private C5515ae f17697B;

    /* renamed from: C */
    private Object f17698C;

    /* renamed from: D */
    private List f17699D;

    /* renamed from: E */
    private C6007z f17700E;

    /* renamed from: F */
    private C6007z f17701F;

    /* renamed from: G */
    private boolean f17702G = true;

    /* renamed from: H */
    private boolean f17703H;

    /* renamed from: I */
    private boolean f17704I;

    /* renamed from: x */
    private final Context f17705x;

    /* renamed from: y */
    private final C5514ad f17706y;

    /* renamed from: z */
    private final Class f17707z;

    static {
        C5593j jVar = (C5593j) ((C5593j) ((C5593j) new C5593j().mo11989z(C5731x.f17284c)).mo11965R(C5997p.LOW)).mo11978af();
    }

    protected C6007z(C5543d dVar, C5514ad adVar, Class cls, Context context) {
        this.f17706y = adVar;
        this.f17707z = cls;
        this.f17705x = context;
        C5636l lVar = adVar.f16689a.f16789b;
        C5515ae aeVar = (C5515ae) lVar.f16996e.get(cls);
        if (aeVar == null) {
            for (Map.Entry entry : lVar.f16996e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aeVar = (C5515ae) entry.getValue();
                }
            }
        }
        this.f17697B = aeVar == null ? C5636l.f16992a : aeVar;
        this.f17696A = dVar.f16789b;
        for (C5592i a : adVar.f16692d) {
            mo12439a(a);
        }
        mo11982o(adVar.mo11875m());
    }

    /* renamed from: ag */
    private final C5588e m15438ag(Object obj, C5572n nVar, C5592i iVar, C5590g gVar, C5515ae aeVar, C5997p pVar, int i, int i2, C5558a aVar, Executor executor) {
        C5576b bVar;
        C5576b bVar2;
        C5596m mVar;
        int i3;
        int i4;
        C5997p pVar2;
        int i5;
        int i6;
        Object obj2 = obj;
        C5558a aVar2 = aVar;
        if (this.f17701F != null) {
            bVar2 = new C5576b(obj2, gVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = gVar;
        }
        C6007z zVar = this.f17700E;
        if (zVar == null) {
            mVar = m15439ah(obj, nVar, iVar, aVar, bVar2, aeVar, pVar, i, i2, executor);
        } else if (!this.f17704I) {
            C5515ae aeVar2 = true == zVar.f17702G ? aeVar : zVar.f17697B;
            if (C5558a.m14350aa(zVar.f16814a, 8)) {
                pVar2 = zVar.f16817d;
            } else {
                int i7 = C6006y.f17695b[pVar.ordinal()];
                if (i7 == 1) {
                    pVar2 = C5997p.NORMAL;
                } else if (i7 == 2) {
                    pVar2 = C5997p.HIGH;
                } else if (i7 == 3 || i7 == 4) {
                    pVar2 = C5997p.IMMEDIATE;
                } else {
                    throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.f16817d))));
                }
            }
            C5997p pVar3 = pVar2;
            C6007z zVar2 = this.f17700E;
            int i8 = zVar2.f16824k;
            int i9 = zVar2.f16823j;
            if (!C5632s.m14622o(i, i2) || this.f17700E.mo11974ab()) {
                i5 = i9;
                i6 = i8;
            } else {
                i6 = aVar2.f16824k;
                i5 = aVar2.f16823j;
            }
            C5596m mVar2 = new C5596m(obj2, bVar2);
            Object obj3 = obj;
            C5572n nVar2 = nVar;
            C5592i iVar2 = iVar;
            C5596m mVar3 = mVar2;
            C5588e ah = m15439ah(obj3, nVar2, iVar2, aVar, mVar2, aeVar, pVar, i, i2, executor);
            this.f17704I = true;
            C6007z zVar3 = this.f17700E;
            C5588e ag = zVar3.m15438ag(obj3, nVar2, iVar2, mVar3, aeVar2, pVar3, i6, i5, zVar3, executor);
            this.f17704I = false;
            C5596m mVar4 = mVar3;
            mVar4.f16926a = ah;
            mVar4.f16927b = ag;
            mVar = mVar4;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return mVar;
        }
        C6007z zVar4 = this.f17701F;
        int i10 = zVar4.f16824k;
        int i11 = zVar4.f16823j;
        if (!C5632s.m14622o(i, i2) || this.f17701F.mo11974ab()) {
            i3 = i11;
            i4 = i10;
        } else {
            i4 = aVar2.f16824k;
            i3 = aVar2.f16823j;
        }
        C6007z zVar5 = this.f17701F;
        C5588e ag2 = zVar5.m15438ag(obj, nVar, iVar, bVar, zVar5.f17697B, zVar5.f16817d, i4, i3, zVar5, executor);
        bVar.f16863a = mVar;
        bVar.f16864b = ag2;
        return bVar;
    }

    /* renamed from: ah */
    private final C5588e m15439ah(Object obj, C5572n nVar, C5592i iVar, C5558a aVar, C5590g gVar, C5515ae aeVar, C5997p pVar, int i, int i2, Executor executor) {
        C5558a aVar2 = aVar;
        C5997p pVar2 = pVar;
        int i3 = i;
        int i4 = i2;
        Context context = this.f17705x;
        C5636l lVar = this.f17696A;
        return new C5595l(context, lVar, obj, this.f17698C, this.f17707z, aVar2, i3, i4, pVar2, nVar, iVar, this.f17699D, gVar, lVar.f16997f, aeVar.f16699a, executor);
    }

    /* renamed from: a */
    public C6007z mo12439a(C5592i iVar) {
        if (this.f16833t) {
            return mo11983p().mo12439a(iVar);
        }
        if (iVar != null) {
            if (this.f17699D == null) {
                this.f17699D = new ArrayList();
            }
            this.f17699D.add(iVar);
        }
        mo11977ae();
        return this;
    }

    /* renamed from: b */
    public C6007z mo11982o(C5558a aVar) {
        C5630q.m14607d(aVar, "Argument must not be null");
        return (C6007z) super.mo11982o(aVar);
    }

    /* renamed from: c */
    public C6007z mo11983p() {
        C6007z zVar = (C6007z) super.clone();
        zVar.f17697B = zVar.f17697B.clone();
        List list = zVar.f17699D;
        if (list != null) {
            zVar.f17699D = new ArrayList(list);
        }
        C6007z zVar2 = zVar.f17700E;
        if (zVar2 != null) {
            zVar.f17700E = zVar2.mo11983p();
        }
        C6007z zVar3 = zVar.f17701F;
        if (zVar3 != null) {
            zVar.f17701F = zVar3.mo11983p();
        }
        return zVar;
    }

    /* renamed from: d */
    public C6007z mo12442d(C5592i iVar) {
        if (this.f16833t) {
            return mo11983p().mo12442d(iVar);
        }
        this.f17699D = null;
        return mo12439a(iVar);
    }

    /* renamed from: e */
    public C6007z mo12443e(Bitmap bitmap) {
        return mo12450l(bitmap).mo11982o(C5593j.m14520d(C5731x.f17283b));
    }

    /* renamed from: f */
    public C6007z mo12444f(Drawable drawable) {
        return mo12450l(drawable).mo11982o(C5593j.m14520d(C5731x.f17283b));
    }

    /* renamed from: g */
    public C6007z mo12445g(Uri uri) {
        return mo12450l(uri);
    }

    /* renamed from: h */
    public C6007z mo12446h(Integer num) {
        C6007z l = mo12450l(num);
        Context context = this.f17705x;
        int i = C5598a.f16933b;
        return l.mo11982o(C5593j.m14524h(new C5598a(context.getResources().getConfiguration().uiMode & 48, C5599b.m14563a(context))));
    }

    /* renamed from: i */
    public C6007z mo12447i(Object obj) {
        return mo12450l(obj);
    }

    /* renamed from: j */
    public C6007z mo12448j(String str) {
        return mo12450l(str);
    }

    /* renamed from: k */
    public C6007z mo12449k(byte[] bArr) {
        C6007z l = mo12450l(bArr);
        if (!C5558a.m14350aa(l.f16814a, 4)) {
            l = l.mo11982o(C5593j.m14520d(C5731x.f17283b));
        }
        return !C5558a.m14350aa(l.f16814a, 256) ? l.mo11982o(C5593j.m14525i()) : l;
    }

    /* renamed from: l */
    public final C6007z mo12450l(Object obj) {
        if (this.f16833t) {
            return mo11983p().mo12450l(obj);
        }
        this.f17698C = obj;
        this.f17703H = true;
        mo11977ae();
        return this;
    }

    /* renamed from: m */
    public C6007z mo12451m(C6007z zVar) {
        if (this.f16833t) {
            return mo11983p().mo12451m(zVar);
        }
        this.f17700E = zVar;
        mo11977ae();
        return this;
    }

    /* renamed from: q */
    public final C5587d mo12453q(int i, int i2) {
        C5591h hVar = new C5591h(i, i2);
        mo12455s(hVar, hVar, this, C5622i.f16960b);
        return hVar;
    }

    /* renamed from: r */
    public final void mo12454r(ImageView imageView) {
        C5558a aVar;
        C5632s.m14617j();
        C5630q.m14607d(imageView, "Argument must not be null");
        if (!C5558a.m14350aa(this.f16814a, 2048) && this.f16827n && imageView.getScaleType() != null) {
            switch (C6006y.f17694a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo11957J();
                    break;
                case 2:
                    aVar = clone().mo11958K();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo11959L();
                    break;
                case 6:
                    aVar = clone().mo11958K();
                    break;
            }
        }
        aVar = this;
        C5636l lVar = this.f17696A;
        Class cls = this.f17707z;
        C5567i iVar = lVar.f16994c;
        mo12455s(C5567i.m14435a(imageView, cls), (C5592i) null, aVar, C5622i.f16959a);
    }

    /* renamed from: s */
    public final void mo12455s(C5572n nVar, C5592i iVar, C5558a aVar, Executor executor) {
        C5572n nVar2 = nVar;
        C5558a aVar2 = aVar;
        C5630q.m14607d(nVar2, "Argument must not be null");
        if (this.f17703H) {
            C5588e ag = m15438ag(new Object(), nVar, iVar, (C5590g) null, this.f17697B, aVar2.f16817d, aVar2.f16824k, aVar2.f16823j, aVar, executor);
            C5588e d = nVar.mo11990d();
            if (!ag.mo12025m(d) || (!aVar2.f16822i && d.mo12024l())) {
                this.f17706y.mo11877o(nVar2);
                nVar2.mo11993h(ag);
                this.f17706y.mo11889w(nVar2, ag);
                return;
            }
            C5630q.m14607d(d, "Argument must not be null");
            if (!d.mo12026n()) {
                d.mo12014b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: t */
    public final void mo12456t(int i, int i2) {
        mo12455s(new C5569k(this.f17706y, i, i2), (C5592i) null, this, C5622i.f16959a);
    }

    /* renamed from: n */
    public C6007z mo12452n(C5515ae aeVar) {
        if (this.f16833t) {
            return mo11983p().mo12452n(aeVar);
        }
        C5630q.m14607d(aeVar, "Argument must not be null");
        this.f17697B = aeVar;
        this.f17702G = false;
        mo11977ae();
        return this;
    }
}
