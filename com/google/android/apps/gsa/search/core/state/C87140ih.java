package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.p6865b.C86831a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91030n;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.state.ih */
/* compiled from: PG */
public class C87140ih implements C86831a, C91007g, C86897cs {

    /* renamed from: h */
    private static final C59071e f235430h = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.ih");

    /* renamed from: a */
    protected final List f235431a;

    /* renamed from: b */
    public final C58485gu f235432b;

    /* renamed from: c */
    public final C58485gu f235433c;

    /* renamed from: d */
    public final C87000dz f235434d;

    /* renamed from: e */
    public final BitSet f235435e;

    /* renamed from: f */
    public boolean f235436f;

    /* renamed from: g */
    public C87117hl f235437g;

    /* renamed from: i */
    private final String f235438i;

    /* renamed from: j */
    private final C86124t f235439j;

    /* renamed from: k */
    private final C87135ic f235440k;

    /* renamed from: l */
    private final C90476a f235441l;

    /* renamed from: m */
    private final C90479a f235442m;

    /* renamed from: n */
    private final C87116hk f235443n;

    /* renamed from: o */
    private final C58881cr f235444o;

    /* renamed from: p */
    private final C68214a f235445p;

    /* renamed from: q */
    private boolean f235446q;

    /* renamed from: r */
    private Object f235447r;

    /* renamed from: s */
    private int f235448s;

    /* renamed from: t */
    private Throwable f235449t;

    public C87140ih(C86124t tVar, C58528ij ijVar, C68214a aVar, C87116hk hkVar, C87116hk hkVar2, C90476a aVar2, C90479a aVar3, String str) {
        this.f235439j = tVar;
        this.f235445p = aVar;
        C58485gu u = ijVar.mo55229u();
        this.f235432b = u;
        C58480gp gpVar = new C58480gp(4);
        int size = u.size();
        for (int i = 0; i < size; i++) {
            C87143ik ikVar = (C87143ik) u.get(i);
            gpVar.mo55395g(ikVar.mo80512a());
            C58838bb.m90883r(hkVar.f235369a.get(ikVar.mo80512a().f235452J));
        }
        this.f235433c = gpVar.mo55394f();
        this.f235443n = hkVar;
        this.f235434d = new C87000dz();
        this.f235441l = aVar2;
        this.f235442m = aVar3;
        this.f235438i = str;
        this.f235431a = aVar3.mo84235j() ? new ArrayList() : null;
        this.f235440k = new C87136id(this.f235437g, hkVar2);
        this.f235435e = new BitSet(250);
        this.f235444o = C58886cw.m90973a(new C87134ib(this));
    }

    /* renamed from: b */
    public final void mo80526b(Bundle bundle) {
        C58485gu guVar = this.f235433c;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C87141ii) guVar.get(i2)).mo80521hs(bundle);
        }
    }

    /* renamed from: c */
    public final void mo80554c() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f235441l.mo84225b()) {
            C91030n.m148695a("VelvetEventBus.resumeNotifications", this.f235441l);
        }
        C58838bb.m90883r(this.f235436f);
        this.f235436f = false;
        if (!this.f235435e.isEmpty()) {
            mo80565n(-1);
        }
        if (this.f235441l.mo84225b()) {
            C91030n.m148696b(this.f235441l);
        }
    }

    /* renamed from: e */
    public final void mo80555e() {
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90883r(!this.f235436f);
        this.f235436f = true;
    }

    /* renamed from: f */
    public final boolean mo80556f() {
        return this.f235436f;
    }

    /* renamed from: g */
    public final void mo80557g(C88433bd bdVar, int i) {
        C58485gu guVar = this.f235433c;
        int i2 = ((C58724pq) guVar).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            ((C87141ii) guVar.get(i3)).mo80407hq(bdVar, i);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("VelvetEventBus");
        fVar.mo85279c("Notifications suspended").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f235436f)));
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Observers");
        C86999dy dyVar = new C86999dy(this.f235434d);
        while (dyVar.hasNext()) {
            C87138if ifVar = (C87138if) dyVar.next();
            String canonicalName = ifVar.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = ifVar.getClass().getName();
            }
            if (ifVar instanceof C91007g) {
                e.mo85290q(canonicalName, (C91007g) ifVar);
            } else {
                e.mo85279c(canonicalName).mo85276a(C90752i.m148233g(ifVar.toString()));
            }
        }
        ArrayList arrayList = new ArrayList(this.f235433c);
        Collections.sort(arrayList, C87133ia.f235421a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fVar.mo85287n((C87141ii) arrayList.get(i));
        }
        if (this.f235442m.mo84235j()) {
            this.f235431a.getClass();
            fVar.mo85291r("VelvetEventBus observers calling back in during the inner loop");
            for (C87139ig igVar : this.f235431a) {
                fVar.mo85292s(C90752i.m148229c(igVar.toString()));
            }
        }
    }

    /* renamed from: h */
    public final void mo80558h(C88432bc bcVar) {
        C58485gu guVar = this.f235433c;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C87141ii) guVar.get(i2)).mo80406hn(bcVar);
        }
    }

    /* renamed from: i */
    public final Bundle mo80527i(Query query) {
        Bundle bundle = new Bundle();
        C58485gu guVar = this.f235433c;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C87141ii) guVar.get(i2)).mo80709hm(query, bundle);
        }
        return bundle;
    }

    /* renamed from: j */
    public final C58512hu mo80758j() {
        return (C58512hu) this.f235444o.mo6453a();
    }

    /* renamed from: k */
    public final EnumMap mo80759k() {
        EnumMap enumMap = new EnumMap(C87739bu.class);
        C58485gu guVar = this.f235433c;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C87141ii iiVar = (C87141ii) guVar.get(i2);
            C87739bu[] ag = iiVar.mo80403ag();
            if (ag != null) {
                for (C87739bu buVar : ag) {
                    C58838bb.m90887v(!enumMap.containsKey(buVar), "Multiple states for ClientEvent %s", buVar);
                    enumMap.put(buVar, iiVar);
                }
            }
        }
        return enumMap;
    }

    /* renamed from: l */
    public final void mo80760l(C87138if ifVar) {
        C22872h.m42743c(C86593a.class);
        if (!this.f235434d.mo80630c(ifVar)) {
            this.f235434d.mo80629b(ifVar);
            if (this.f235436f) {
                this.f235435e.clear();
                this.f235435e.or(((C87136id) this.f235440k).f235424b.mo80741b());
            } else if (this.f235446q) {
                ifVar.mo80223d(this.f235440k);
            } else {
                C58838bb.m90884s(this.f235435e.isEmpty(), "Pending state changes should be empty but contains ".concat(this.f235435e.toString()));
                this.f235446q = true;
                try {
                    ifVar.mo80223d(this.f235440k);
                    this.f235446q = false;
                    if (!this.f235435e.isEmpty()) {
                        mo80565n(-1);
                    }
                } catch (Error | RuntimeException e) {
                    ((C89911f) this.f235445p.mo27525b()).mo83755a(e, 65371542, 29).mo83721a();
                    throw e;
                } catch (Throwable th) {
                    this.f235446q = false;
                    throw th;
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo80528m(int i) {
        if (this.f235441l.mo84225b()) {
            C91030n.m148695a("VelvetEventBus.notifyStateChanged " + i, this.f235441l);
        }
        boolean z = this.f235443n.f235369a.get(i);
        String valueOf = String.valueOf(this.f235443n);
        C58838bb.m90884s(z, "State " + i + " notifying changed is not in " + valueOf);
        this.f235435e.set(i);
        mo80565n(i);
        if (this.f235441l.mo84225b()) {
            C91030n.m148696b(this.f235441l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo80565n(int i) {
        if (this.f235446q) {
            C58976aa aaVar = C58975e.f156826a;
            Object obj = this.f235447r;
            if (this.f235442m.mo84235j() && obj != null) {
                this.f235431a.getClass();
                C87139ig igVar = new C87139ig(this, obj, i, this.f235448s);
                long a = this.f235439j.mo79743a(C90120fr.f250762B);
                this.f235431a.add(igVar);
                if (this.f235448s >= ((int) a)) {
                    C59052c cVar = (C59052c) f235430h.mo56226d();
                    cVar.mo56378ag(C58975e.f156826a, this.f235438i);
                    ((C59052c) cVar.mo56372aa(9014)).mo56386p("Sequence of observers calling back into VelvetEventBus leading to infinite loop:");
                    for (C87139ig s : this.f235431a) {
                        C59052c cVar2 = (C59052c) f235430h.mo56226d();
                        cVar2.mo56378ag(C58975e.f156826a, this.f235438i);
                        ((C59052c) cVar2.mo56372aa(9015)).mo56389s("%s", s);
                    }
                    ((C89911f) this.f235445p.mo27525b()).mo83755a((Throwable) null, 19362047, 29).mo83721a();
                    throw new RuntimeException("VelvetEventBus inner infinite loop detected");
                }
                return;
            }
            return;
        }
        Throwable th = this.f235449t;
        if (th != null) {
            ((C89911f) this.f235445p.mo27525b()).mo83755a(th, 70273422, 29).mo83721a();
            this.f235449t = null;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C22872h.m42743c(C86593a.class);
        this.f235446q = true;
        try {
            this.f235448s = 0;
            while (true) {
                if (this.f235435e.isEmpty() || this.f235436f) {
                    break;
                }
                C87137ie ieVar = new C87137ie(this.f235437g, (BitSet) this.f235435e.clone());
                this.f235448s++;
                this.f235435e.clear();
                C58485gu guVar = this.f235432b;
                int size = guVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C87143ik ikVar = (C87143ik) guVar.get(i2);
                    if (this.f235442m.mo84235j()) {
                        this.f235447r = ikVar;
                    }
                    ikVar.mo80513b(ieVar);
                    if (this.f235442m.mo84235j()) {
                        this.f235447r = null;
                    }
                    C87141ii a2 = ikVar.mo80512a();
                    boolean z = a2.f235453K;
                    a2.f235453K = false;
                    if (z) {
                        ieVar.f235425b.set(a2.f235452J);
                    }
                }
                if (!this.f235435e.isEmpty()) {
                    this.f235435e.or(ieVar.f235425b);
                } else if (this.f235436f) {
                    this.f235435e.or(ieVar.f235425b);
                    break;
                } else {
                    C87136id idVar = new C87136id((C87117hl) null, C87116hk.m140776a(ieVar.f235425b));
                    C58485gu guVar2 = this.f235433c;
                    int i3 = ((C58724pq) guVar2).f156474d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((C87141ii) guVar2.get(i4)).mo80748ho();
                    }
                    C86999dy dyVar = new C86999dy(this.f235434d);
                    while (dyVar.hasNext()) {
                        C87138if ifVar = (C87138if) dyVar.next();
                        if (idVar.f235424b.f235369a.intersects(ifVar.mo80220a().f235369a)) {
                            if (this.f235442m.mo84235j()) {
                                this.f235447r = ifVar;
                            }
                            ifVar.mo80223d(idVar);
                            if (this.f235442m.mo84235j()) {
                                this.f235447r = null;
                            }
                        }
                    }
                }
            }
            this.f235446q = false;
            if (this.f235442m.mo84235j()) {
                List list = this.f235431a;
                list.getClass();
                list.clear();
            }
        } catch (Error | RuntimeException e) {
            this.f235435e.clear();
            this.f235449t = e;
            ((C89911f) this.f235445p.mo27525b()).mo83755a(e, 65371542, 29).mo83721a();
            throw e;
        } catch (Throwable th2) {
            this.f235446q = false;
            throw th2;
        }
    }

    /* renamed from: o */
    public final void mo80761o(C87138if ifVar) {
        C22872h.m42743c(C86593a.class);
        C87000dz dzVar = this.f235434d;
        int indexOf = dzVar.f234985a.indexOf(ifVar);
        if (indexOf != -1) {
            if (dzVar.f234986b == 0) {
                dzVar.f234985a.remove(ifVar);
            } else {
                dzVar.f234985a.set(indexOf, (Object) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo80762p(C87135ic icVar) {
        this.f235435e.or(((C87136id) icVar).f235424b.mo80741b());
        mo80565n(-1);
    }

    /* renamed from: q */
    public final boolean mo80763q() {
        return !this.f235436f && !this.f235446q && this.f235435e.isEmpty();
    }
}
