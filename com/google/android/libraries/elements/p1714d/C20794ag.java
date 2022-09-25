package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21233ac;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21264bg;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21287cc;
import com.google.android.libraries.elements.interfaces.C21290cf;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21294cj;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentElement;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.DevResourceManager;
import com.google.android.libraries.elements.interfaces.EntitiesObserverConfig;
import com.google.android.libraries.elements.interfaces.EntitiesProcessorResolver;
import com.google.android.libraries.elements.p1714d.p1724f.p1725a.C21092p;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.C66061aw;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.elements.C66232es;
import com.google.protos.youtube.elements.C66244fd;
import com.google.protos.youtube.elements.C66248fh;
import com.google.protos.youtube.elements.p5166b.C66086at;
import com.google.protos.youtube.elements.p5166b.C66091ay;
import com.google.protos.youtube.elements.p5166b.C66092az;
import com.google.protos.youtube.elements.p5166b.C66096bc;
import com.google.protos.youtube.elements.p5166b.C66097bd;
import com.google.protos.youtube.elements.p5166b.C66105j;
import com.youtube.p5283a.p5284a.C68039ab;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68098t;
import dagger.C68214a;
import java.nio.ByteBuffer;
import java.util.List;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C70120l;

/* renamed from: com.google.android.libraries.elements.d.ag */
/* compiled from: PG */
public final class C20794ag implements C20870cu {

    /* renamed from: n */
    public static final /* synthetic */ int f58177n = 0;

    /* renamed from: o */
    private static final C62921ba f58178o;

    /* renamed from: a */
    public final C21232ab f58179a;

    /* renamed from: b */
    public final C21259bb f58180b;

    /* renamed from: c */
    public final C21294cj f58181c;

    /* renamed from: d */
    public final C21287cc f58182d;

    /* renamed from: e */
    public final C68214a f58183e;

    /* renamed from: f */
    public final C21092p f58184f;

    /* renamed from: g */
    public final boolean f58185g;

    /* renamed from: h */
    public final boolean f58186h;

    /* renamed from: i */
    public final boolean f58187i;

    /* renamed from: j */
    public final ComponentConfig f58188j;

    /* renamed from: k */
    public final boolean f58189k;

    /* renamed from: l */
    public final C69464a f58190l;

    /* renamed from: m */
    public final C21233ac f58191m;

    /* renamed from: p */
    private final C58833ax f58192p;

    /* renamed from: q */
    private final boolean f58193q;

    /* renamed from: r */
    private final C58833ax f58194r;

    /* renamed from: s */
    private final C58833ax f58195s;

    /* renamed from: t */
    private final boolean f58196t;

    /* renamed from: u */
    private final boolean f58197u;

    static {
        C62921ba baVar = new C62921ba();
        baVar.mo58832e(C66248fh.f180141d);
        baVar.mo58832e(C66061aw.f179649f);
        f58178o = baVar;
    }

    public C20794ag(C21294cj cjVar, C21232ab abVar, C58833ax axVar, C21259bb bbVar, C21287cc ccVar, C68214a aVar, C21092p pVar, C69464a aVar2, C21233ac acVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9, C58833ax axVar10, C58833ax axVar11, C58833ax axVar12, C58833ax axVar13, C58833ax axVar14, C58833ax axVar15, C58833ax axVar16) {
        this.f58181c = cjVar;
        this.f58179a = abVar;
        this.f58192p = axVar;
        this.f58180b = bbVar;
        this.f58182d = ccVar;
        this.f58184f = pVar;
        this.f58187i = ((Boolean) axVar2.mo56109e(false)).booleanValue();
        this.f58193q = ((Boolean) axVar3.mo56109e(false)).booleanValue();
        this.f58185g = ((Boolean) axVar5.mo56109e(true)).booleanValue();
        this.f58186h = ((Boolean) axVar4.mo56109e(false)).booleanValue();
        this.f58183e = aVar;
        this.f58188j = new ComponentConfig(((Boolean) axVar6.mo56109e(false)).booleanValue(), ((Integer) axVar7.mo56109e(0)).intValue(), ((Boolean) axVar9.mo56109e(false)).booleanValue(), ((Boolean) axVar12.mo56109e(false)).booleanValue(), ((Boolean) axVar13.mo56109e(false)).booleanValue(), ((Boolean) axVar14.mo56109e(false)).booleanValue());
        this.f58189k = ((Boolean) axVar8.mo56109e(false)).booleanValue();
        this.f58194r = axVar10;
        this.f58190l = aVar2;
        this.f58191m = acVar;
        this.f58195s = axVar11;
        this.f58196t = ((Boolean) axVar15.mo56109e(false)).booleanValue();
        this.f58197u = ((Boolean) axVar16.mo56109e(false)).booleanValue();
    }

    /* renamed from: c */
    static String m39030c(ByteBuffer byteBuffer) {
        Object obj;
        Object obj2;
        if (byteBuffer == null) {
            return "Unknown template";
        }
        try {
            C66244fd fdVar = ((C66166ck) C62942bv.parseFrom((C62942bv) C66166ck.f179921e, byteBuffer, f58178o)).f179924b;
            if (fdVar == null) {
                fdVar = C66244fd.f180131a;
            }
            C62940bt r1 = C62942bv.checkIsLite(C66061aw.f179649f);
            fdVar.mo58887l(r1);
            Object l = fdVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l);
            }
            C66232es esVar = ((C66061aw) obj).f179652b;
            if (esVar == null) {
                esVar = C66232es.f180105a;
            }
            C62940bt r12 = C62942bv.checkIsLite(C66248fh.f180141d);
            esVar.mo58887l(r12);
            Object l2 = esVar.f169962ag.mo58854l(r12.f169971d);
            if (l2 == null) {
                obj2 = r12.f169969b;
            } else {
                obj2 = r12.mo58889c(l2);
            }
            C66248fh fhVar = (C66248fh) obj2;
            if ((fhVar.f180143a & 1) != 0) {
                return fhVar.f180144b;
            }
            return "Unknown template";
        } catch (C62974ct unused) {
            return "Unknown template";
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6405o mo25823a(C6411u uVar, C21319z zVar, Object obj, String str, C68045ah ahVar, C21125o oVar, List list) {
        C68098t tVar = (C68098t) obj;
        C21290cf cfVar = C21290cf.f59626b;
        if (!(zVar == null || zVar.mo26809j() == null)) {
            cfVar = zVar.mo26809j();
        }
        C21292ch a = cfVar.mo26261a();
        C70120l g = C70120l.m102048g(new C20788aa(this, uVar, zVar, tVar, str, ahVar, a));
        C21126p pVar = new C21126p();
        pVar.mo26161c(uVar, new C21128r());
        pVar.f59236a.f59247a = zVar;
        pVar.f59237d.set(0);
        pVar.f59236a.f59252f = g;
        pVar.f59237d.set(5);
        pVar.f59236a.f59253g = this.f58180b;
        pVar.f59237d.set(6);
        pVar.f59236a.f59242A = a;
        pVar.f59237d.set(7);
        pVar.f59236a.f59248b = this.f58193q;
        pVar.f59237d.set(1);
        pVar.f59236a.f59243B = new C20798ak(tVar, ahVar);
        pVar.f59237d.set(8);
        pVar.f59236a.f59251e = this.f58187i;
        pVar.f59237d.set(4);
        pVar.f59236a.f59250d = this.f58191m;
        pVar.f59237d.set(3);
        pVar.f59236a.f59249c = this.f58190l;
        pVar.f59237d.set(2);
        return pVar;
    }

    /* renamed from: b */
    public final C70120l mo25877b(C6411u uVar, ByteBuffer byteBuffer, C21319z zVar, C21292ch chVar, String str, boolean z) {
        C20910df dfVar;
        ByteStore byteStore = (ByteStore) ((C69464a) ((C58847bk) this.f58192p).f156646a).mo17428b();
        Integer num = null;
        if (z) {
            C21319z zVar2 = zVar;
            dfVar = new C20910df(this.f58184f.mo26149c(zVar));
        } else {
            C21319z zVar3 = zVar;
            dfVar = null;
        }
        C69464a aVar = (C69464a) this.f58194r.mo56111f();
        DevResourceManager devResourceManager = (!this.f58187i || !this.f58189k || aVar == null) ? null : (DevResourceManager) aVar.mo17428b();
        boolean z2 = this.f58196t;
        if (this.f58197u) {
            num = Integer.valueOf(zVar.mo26799b());
        }
        EntitiesProcessorResolver entitiesProcessorResolver = (EntitiesProcessorResolver) EntitiesProcessorResolver.create(byteStore, dfVar, new EntitiesObserverConfig(z2, num)).mo60269a(C21130t.f59259a);
        C69464a aVar2 = (C69464a) this.f58195s.mo56111f();
        if (aVar2 != null) {
            ((C21264bg) aVar2.mo17428b()).mo26747a();
        }
        ComponentElement create = ComponentElement.create(byteBuffer);
        if (create != null) {
            return C70120l.m102047f(new C21131u(this, uVar, zVar, create, devResourceManager, entitiesProcessorResolver, str, chVar, byteBuffer));
        }
        throw new C21260bc("Failed to create C++ Component");
    }

    /* renamed from: d */
    public final void mo25878d(C21292ch chVar, C66086at atVar, Component component, C68039ab abVar, C21319z zVar) {
        C66105j e;
        chVar.mo26276d();
        if (atVar != null) {
            C66091ay ayVar = (C66091ay) C66092az.f179718d.createBuilder();
            ayVar.copyOnWrite();
            C66092az azVar = (C66092az) ayVar.instance;
            azVar.f179721b = atVar;
            azVar.f179720a |= 1;
            if (!(abVar == null || (e = C21168q.m39751e(abVar, C21279bv.m40118b(component.debugLatestModel()), component.latestEntitiesConfig(), zVar.mo26814o())) == null)) {
                ayVar.copyOnWrite();
                C66092az azVar2 = (C66092az) ayVar.instance;
                azVar2.f179722c = e;
                azVar2.f179720a |= 2;
            }
            C66096bc bcVar = (C66096bc) C66097bd.f179735e.createBuilder();
            C63042fg d = C21168q.m39750d();
            bcVar.copyOnWrite();
            C66097bd bdVar = (C66097bd) bcVar.instance;
            d.getClass();
            bdVar.f179740d = d;
            bdVar.f179737a |= 1;
            bcVar.copyOnWrite();
            C66097bd bdVar2 = (C66097bd) bcVar.instance;
            C66092az azVar3 = (C66092az) ayVar.build();
            azVar3.getClass();
            bdVar2.f179739c = azVar3;
            bdVar2.f179738b = 3;
            ((DebuggerClient) this.f58190l.mo17428b()).sendTimelineEvent(((C66097bd) bcVar.build()).toByteArray());
        }
    }
}
