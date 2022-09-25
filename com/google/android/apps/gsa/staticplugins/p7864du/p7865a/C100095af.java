package com.google.android.apps.gsa.staticplugins.p7864du.p7865a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91001j;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91002k;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118308af;
import com.google.android.apps.gsa.store.C118312c;
import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118316g;
import com.google.android.apps.gsa.store.C118326q;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118329t;
import com.google.android.apps.gsa.store.C118332u;
import com.google.android.apps.gsa.store.C118333v;
import com.google.android.apps.gsa.store.C118335x;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4537i.C59277b;
import com.google.common.p4537i.C59290o;
import com.google.common.p4537i.C59294s;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.a.af */
/* compiled from: PG */
public final class C100095af implements C86051l, C91002k {

    /* renamed from: a */
    public static final /* synthetic */ int f279923a = 0;

    /* renamed from: b */
    private static final C118302a f279924b = C118302a.m196461a(1);

    /* renamed from: c */
    private static final C118302a f279925c = C118302a.m196461a(2);

    /* renamed from: d */
    private static final C118302a f279926d = C118302a.m196461a(3);

    /* renamed from: e */
    private static final C59071e f279927e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.du.a.af");

    /* renamed from: f */
    private final C21370a f279928f;

    /* renamed from: g */
    private final C118312c f279929g;

    /* renamed from: h */
    private final C86054o f279930h;

    /* renamed from: i */
    private final Object f279931i = new Object();

    /* renamed from: j */
    private final ArrayList f279932j = new ArrayList();

    public C100095af(C118312c cVar, C21370a aVar, C86054o oVar) {
        this.f279928f = aVar;
        this.f279929g = cVar;
        this.f279930h = oVar;
        oVar.mo79675i(this);
    }

    /* renamed from: f */
    private static String m165870f(Account account) {
        return account == null ? "anon" : account.name;
    }

    /* renamed from: g */
    private final void m165871g() {
        C58557jl.m90145z(this.f279932j, C100093ad.f279921a);
    }

    /* renamed from: c */
    public final C58485gu mo85272c(C91001j jVar) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f279931i) {
            C60856cj.m92910s(C60856cj.m92892a(this.f279932j).mo57334a(C100094ae.f279922a, C60826bg.f164896a));
            this.f279932j.clear();
        }
        C118335x g = this.f279929g.mo91761g();
        if (jVar.f254224q) {
            C118302a aVar = f279924b;
            String f = m165870f(this.f279930h.mo79668a());
            ArrayList arrayList = new ArrayList();
            arrayList.add(C118308af.m196477k(aVar));
            arrayList.add(C118308af.m196479m(f));
            g.f328476c.mo55395g(C118326q.m196505a(arrayList, 5));
        }
        g.f328476c.mo55395g(C118328s.m196511c(f279925c, jVar.f254225r));
        g.f328475b.mo55395g(f279926d);
        C118314e eVar = (C118314e) C60856cj.m92910s(this.f279929g.mo91763i(g.mo103674a()));
        C58480gp e = C58485gu.m89837e();
        while (eVar.hasNext()) {
            try {
                e.mo55395g((C91000i) C62942bv.parseFrom((C62942bv) C91000i.f254200e, ((C118332u) eVar.next()).mo103671b(), C62921ba.m95368a()));
            } catch (C62974ct e2) {
                C59104x c = f279927e.mo56225c();
                c.mo56378ag(C58975e.f156826a, "StateDumpEventStore");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(33178)).mo56386p("Could not parse StateDumpEvent from content store");
            }
        }
        eVar.mo91755c().mo91751b();
        return e.mo55394f();
    }

    /* renamed from: d */
    public final String mo85273d(C91000i iVar, C91001j jVar) {
        C59290o c = C59294s.m92133c();
        byte[] byteArray = iVar.toByteArray();
        String nVar = ((C59277b) c).mo56761d(byteArray, byteArray.length).toString();
        mo85274e(nVar, iVar, jVar);
        return nVar;
    }

    /* renamed from: e */
    public final void mo85274e(String str, C91000i iVar, C91001j jVar) {
        C58976aa aaVar = C58975e.f156826a;
        String f = m165870f(this.f279930h.mo79668a());
        C118329t e = this.f279929g.mo91760e();
        C118333v b = e.mo103668b(str, iVar.toByteArray(), jVar.f254223p.f191964b / 3600000, TimeUnit.HOURS);
        b.mo103672a(f279925c, Long.valueOf(jVar.f254225r));
        b.mo103672a(f279926d, Long.valueOf(this.f279928f.mo26870b()));
        if (jVar.f254224q) {
            b.mo103673b(f279924b, f);
        }
        synchronized (this.f279931i) {
            m165871g();
            this.f279932j.add(this.f279929g.mo91762h(e.mo103669c()));
        }
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        String f = m165870f(account);
        C58976aa aaVar = C58975e.f156826a;
        C118316g c = this.f279929g.mo91759c();
        C118302a aVar = f279924b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C118308af.m196477k(aVar));
        arrayList.add(C118308af.m196479m(f));
        c.f328433a.mo55395g(C118326q.m196505a(arrayList, 6));
        synchronized (this.f279931i) {
            m165871g();
            this.f279932j.add(this.f279929g.mo91762h(c.mo103660a()));
        }
    }

    /* renamed from: iR */
    public final void mo79704iR(Account[] accountArr) {
    }
}
