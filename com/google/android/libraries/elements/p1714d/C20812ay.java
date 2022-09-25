package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6154cb;
import com.facebook.litho.C6168cp;
import com.facebook.litho.C6268fk;
import com.facebook.litho.C6279fv;
import com.facebook.litho.C6281fx;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p329g.C6329h;
import com.facebook.litho.p329g.C6330i;
import com.facebook.litho.p329g.C6335n;
import com.facebook.litho.p329g.C6336o;
import com.facebook.litho.p329g.p330a.C6286a;
import com.facebook.litho.p329g.p330a.C6287b;
import com.facebook.litho.p329g.p330a.C6291f;
import com.facebook.litho.p329g.p330a.C6292g;
import com.facebook.litho.p329g.p330a.C6293h;
import com.facebook.litho.widget.C6544i;
import com.facebook.litho.widget.C6546k;
import com.google.android.libraries.elements.interfaces.C21239ai;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21262be;
import com.google.android.libraries.elements.interfaces.C21308o;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.common.p4522b.C58485gu;
import com.google.protos.youtube.elements.C66260r;
import com.youtube.android.libraries.elements.StatusOr;
import com.youtube.p5283a.p5284a.C68039ab;
import com.youtube.p5283a.p5284a.C68093o;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.Status;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.libraries.elements.d.ay */
/* compiled from: PG */
final class C20812ay extends C6335n {

    /* renamed from: u */
    public static final /* synthetic */ int f58277u = 0;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: m */
    C21308o f58278m;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: n */
    C68093o f58279n;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: o */
    C69802a f58280o;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: p */
    C21319z f58281p;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: q */
    C21239ai f58282q;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: r */
    C21249as f58283r;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: s */
    C21259bb f58284s;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: t */
    C21262be f58285t;

    public C20812ay() {
        super("DataDrivenCollectionSection");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13290f((C6335n) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C6279fv mo13347b() {
        return new C20811ax();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C6335n mo13297c(boolean z) {
        C20812ay ayVar = (C20812ay) super.mo13297c(z);
        if (!z) {
            ayVar.f18736g = new C20811ax();
        }
        return ayVar;
    }

    /* renamed from: f */
    public final boolean mo13290f(C6335n nVar) {
        if (this == nVar) {
            return true;
        }
        if (nVar == null || getClass() != nVar.getClass()) {
            return false;
        }
        C20812ay ayVar = (C20812ay) nVar;
        C21308o oVar = this.f58278m;
        if (oVar == null ? ayVar.f58278m != null : !oVar.equals(ayVar.f58278m)) {
            return false;
        }
        C68093o oVar2 = this.f58279n;
        if (oVar2 == null ? ayVar.f58279n != null : !oVar2.equals(ayVar.f58279n)) {
            return false;
        }
        C69802a aVar = this.f58280o;
        if (aVar == null ? ayVar.f58280o != null : !aVar.equals(ayVar.f58280o)) {
            return false;
        }
        C21319z zVar = this.f58281p;
        if (zVar == null ? ayVar.f58281p != null : !zVar.equals(ayVar.f58281p)) {
            return false;
        }
        C21239ai aiVar = this.f58282q;
        if (aiVar == null ? ayVar.f58282q != null : !aiVar.equals(ayVar.f58282q)) {
            return false;
        }
        C21249as asVar = this.f58283r;
        if (asVar == null ? ayVar.f58283r != null : !asVar.equals(ayVar.f58283r)) {
            return false;
        }
        C21259bb bbVar = this.f58284s;
        if (bbVar == null ? ayVar.f58284s != null : !bbVar.equals(ayVar.f58284s)) {
            return false;
        }
        C21262be beVar = this.f58285t;
        return beVar == null ? ayVar.f58285t == null : beVar.equals(ayVar.f58285t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C6330i mo13352g(C6336o oVar) {
        C20811ax axVar = (C20811ax) this.f18736g;
        Boolean bool = axVar.f58276e;
        C58485gu guVar = axVar.f58272a;
        axVar.f58275d.set(oVar);
        C6330i iVar = new C6330i();
        C6286a aVar = new C6286a();
        C6287b bVar = new C6287b();
        C6268fk fkVar = oVar.f19013f;
        aVar.f18551a = bVar;
        aVar.f18552b.clear();
        C6287b bVar2 = aVar.f18551a;
        bVar2.f18556n = bool;
        bVar2.f18555m = guVar;
        aVar.f18552b.set(0);
        Class<C20812ay> cls = C20812ay.class;
        aVar.f18551a.f18559q = m17003o(cls, oVar, 1463818325, new Object[]{oVar});
        aVar.f18551a.f18558p = m17003o(cls, oVar, 947264300, new Object[]{oVar});
        aVar.f18551a.f18557o = m17003o(cls, oVar, 851046848, new Object[]{oVar});
        C6329h.m16982a(aVar, iVar);
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Object mo13353h(C6154cb cbVar, Object obj) {
        int i = cbVar.f18198c;
        if (i == 851046848) {
            C6291f fVar = (C6291f) obj;
            C6168cp cpVar = cbVar.f18197b;
            C6336o oVar = (C6336o) cbVar.f18199d[0];
            String str = (String) fVar.f18567a;
            String str2 = (String) fVar.f18568b;
            C20812ay ayVar = (C20812ay) cpVar;
            return true;
        } else if (i == 947264300) {
            C6292g gVar = (C6292g) obj;
            C6168cp cpVar2 = cbVar.f18197b;
            C6336o oVar2 = (C6336o) cbVar.f18199d[0];
            C20812ay ayVar2 = (C20812ay) cpVar2;
            return Boolean.valueOf(((String) gVar.f18569a).equals((String) gVar.f18570b));
        } else if (i != 1463818325) {
            return null;
        } else {
            C6168cp cpVar3 = cbVar.f18197b;
            C6336o oVar3 = (C6336o) cbVar.f18199d[0];
            int i2 = ((C6293h) obj).f18571a;
            C20812ay ayVar3 = (C20812ay) cpVar3;
            C21319z zVar = ayVar3.f58281p;
            C21259bb bbVar = ayVar3.f58284s;
            C21249as asVar = ayVar3.f58283r;
            C21239ai aiVar = ayVar3.f58282q;
            C69802a aVar = ayVar3.f58280o;
            StatusOr elementAtIndex = ayVar3.f58278m.elementAtIndex(i2);
            if (!elementAtIndex.hasValue) {
                bbVar.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "Error getting Element bytes from CollectionDataSource", zVar, elementAtIndex.status.asException());
                return C6546k.m17818r();
            }
            byte[] bArr = (byte[]) elementAtIndex.value;
            if (bArr == null) {
                bbVar.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "Null Element bytes from CollectionDataSource", zVar, (Throwable) null);
                return C6546k.m17818r();
            }
            C6544i iVar = new C6544i();
            iVar.f19488b = asVar.mo26711a(oVar3, zVar, C68039ab.m98253j(ByteBuffer.wrap(bArr)), aiVar, aVar);
            return new C6546k(iVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo13354i(C6336o oVar) {
        C6281fx fxVar = new C6281fx();
        C6281fx fxVar2 = new C6281fx();
        C6281fx fxVar3 = new C6281fx();
        C6281fx fxVar4 = new C6281fx();
        C6281fx fxVar5 = new C6281fx();
        C21308o oVar2 = this.f58278m;
        C21262be beVar = this.f58285t;
        C21319z zVar = this.f58281p;
        C21259bb bbVar = this.f58284s;
        fxVar.f18496a = false;
        C58485gu j = C58485gu.m89842j(oVar2.identifiers());
        fxVar2.f18496a = j;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        fxVar3.f18496a = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        fxVar4.f18496a = atomicBoolean2;
        AtomicReference atomicReference = new AtomicReference(oVar);
        fxVar5.f18496a = atomicReference;
        C6281fx fxVar6 = fxVar5;
        C20817ba baVar = r6;
        AtomicReference atomicReference2 = atomicReference;
        C6281fx fxVar7 = fxVar4;
        AtomicBoolean atomicBoolean3 = atomicBoolean;
        C20817ba baVar2 = new C20817ba(atomicBoolean, atomicBoolean2, atomicReference, oVar2, bbVar, zVar);
        oVar2.mo25856b(baVar);
        if (beVar != null) {
            beVar.mo25873m(new C20813az(atomicReference2));
        }
        if (j.isEmpty() && oVar2.mo25855a() >= 0) {
            atomicBoolean3.set(true);
            oVar2.loadMore();
        }
        C20811ax axVar = (C20811ax) this.f18736g;
        axVar.f58276e = (Boolean) fxVar.f18496a;
        axVar.f58272a = (C58485gu) fxVar2.f18496a;
        axVar.f58273b = (AtomicBoolean) fxVar3.f18496a;
        axVar.f58274c = (AtomicBoolean) fxVar7.f18496a;
        axVar.f58275d = (AtomicReference) fxVar6.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo13355j(C6279fv fvVar, C6279fv fvVar2) {
        C20811ax axVar = (C20811ax) fvVar;
        C20811ax axVar2 = (C20811ax) fvVar2;
        axVar2.f58272a = axVar.f58272a;
        axVar2.f58273b = axVar.f58273b;
        axVar2.f58274c = axVar.f58274c;
        axVar2.f58275d = axVar.f58275d;
        axVar2.f58276e = axVar.f58276e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo13356p() {
        C21319z zVar = this.f58281p;
        C21259bb bbVar = this.f58284s;
        C21308o oVar = this.f58278m;
        ((C20811ax) this.f18736g).f58274c.set(true);
        Status reload = oVar.reload();
        if (!reload.mo61679g()) {
            bbVar.mo25782a(C66260r.LOG_TYPE_CONFIGURATION_ERROR, "Error reloading data driven collection (pull to refresh).", zVar, reload.asException());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo13357r(int i, int i2) {
        C21308o oVar = this.f58278m;
        AtomicBoolean atomicBoolean = ((C20811ax) this.f18736g).f58273b;
        if (oVar.mo25855a() >= 0 && (i2 - i) - 1 <= oVar.mo25855a() && atomicBoolean.compareAndSet(false, true)) {
            oVar.loadMore();
        }
    }
}
