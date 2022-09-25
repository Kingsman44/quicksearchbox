package com.google.android.apps.gsa.staticplugins.p8774u.p8775a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87302aa;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87304ac;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87306ae;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87307af;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87320c;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87321d;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87343z;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90232h;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91776a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91795b;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.a.p */
/* compiled from: PG */
public final class C117480p implements C87334q {

    /* renamed from: a */
    public static final C59071e f326078a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.u.a.p");

    /* renamed from: b */
    public final C117481q f326079b = new C117481q();

    /* renamed from: c */
    public C117469e f326080c;

    /* renamed from: d */
    final PriorityQueue f326081d;

    /* renamed from: e */
    C117473i f326082e;

    /* renamed from: f */
    boolean f326083f = false;

    /* renamed from: g */
    boolean f326084g;

    /* renamed from: h */
    public boolean f326085h = false;

    /* renamed from: i */
    int f326086i = 3;

    /* renamed from: j */
    public int f326087j;

    /* renamed from: k */
    private final Comparator f326088k;

    /* renamed from: l */
    private final C21370a f326089l;

    /* renamed from: m */
    private final C86124t f326090m;

    public C117480p(C21370a aVar, C90229e eVar, C86124t tVar) {
        C117474j jVar = new C117474j();
        this.f326088k = jVar;
        this.f326081d = new PriorityQueue(10, jVar);
        this.f326089l = aVar;
        if (eVar == C90229e.MINUS_ONE) {
            this.f326084g = true;
        }
        this.f326090m = tVar;
    }

    /* renamed from: f */
    public static void m195260f(C117473i iVar, C87306ae aeVar, Throwable th) {
        C59071e eVar = f326078a;
        ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(18261)).mo56354G("Failed to show bottom sheet %s due to %s", iVar.f326062c.mo80957c(), aeVar);
        if (th != null) {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(18262)).mo56389s("Failed to show bottom sheet with throwable %s", th.getMessage());
            iVar.f326062c.mo80958d().mo80952a(new C87307af(aeVar, th));
            return;
        }
        iVar.f326062c.mo80958d().mo80952a(new C87307af(aeVar));
    }

    /* renamed from: n */
    private static void m195261n(C117473i iVar, C87306ae aeVar) {
        if (iVar == null) {
            ((C59052c) ((C59052c) f326078a.mo56226d()).mo56372aa(18258)).mo56386p("Bottom sheet element shouldn't be null");
            int i = C90755l.f253831a;
            return;
        }
        m195260f(iVar, aeVar, (Throwable) null);
    }

    /* renamed from: o */
    private final void m195262o(C117473i iVar) {
        if (iVar == null) {
            ((C59052c) ((C59052c) f326078a.mo56226d()).mo56372aa(18273)).mo56386p("bottom sheet element shouldn't be null");
            int i = C90755l.f253831a;
            return;
        }
        this.f326081d.add(iVar);
        iVar.f326062c.mo80958d();
    }

    /* renamed from: p */
    private static boolean m195263p(C87321d dVar, C87321d dVar2) {
        return C87320c.PREEMPTIVE == dVar.mo80956b() && dVar.mo80956b() == dVar2.mo80956b() && dVar.mo80967a() > dVar2.mo80967a();
    }

    /* renamed from: q */
    private static final boolean m195264q(C87321d dVar, C87321d dVar2) {
        return dVar.mo80956b().f235826d - dVar2.mo80956b().f235826d > 0;
    }

    /* renamed from: c */
    public final void mo80980c(C87321d dVar) {
        C117473i iVar = new C117473i(dVar, this.f326089l, this.f326080c, this.f326090m);
        if (this.f326080c == null) {
            m195261n(iVar, C87306ae.BOTTOM_SHEET_UNREGISTERED);
            return;
        }
        C23052c f = dVar.mo80960f();
        C117478n nVar = new C117478n(this, f);
        f.mo28427o(nVar);
        iVar.f326069j = nVar;
        if (!this.f326084g) {
            mo103325j(iVar);
        }
        if (this.f326083f || this.f326082e != null) {
            C117473i iVar2 = this.f326082e;
            if (iVar2 != null) {
                C87321d dVar2 = iVar2.f326062c;
                if (C87320c.PREEMPTIVE.equals(dVar2.mo80956b())) {
                    if (m195263p(dVar, dVar2)) {
                        m195261n(this.f326082e, C87306ae.LOW_PRIORITY);
                        mo103324i(iVar);
                        return;
                    }
                    m195261n(iVar, C87306ae.LOW_PRIORITY);
                } else if (C87320c.PREEMPTIVE.equals(dVar.mo80956b())) {
                    m195262o(this.f326082e);
                    mo103324i(iVar);
                } else if (m195264q(dVar, dVar2)) {
                    m195262o(this.f326082e);
                    mo103324i(iVar);
                } else {
                    m195262o(iVar);
                }
            } else {
                C117473i iVar3 = this.f326079b.f326091a;
                if (iVar3 == null) {
                    ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18272)).mo56386p("Bottom sheet element is not present in the state");
                    return;
                }
                C87321d dVar3 = iVar3.f326062c;
                if (C87320c.PREEMPTIVE.equals(dVar.mo80956b())) {
                    if (m195263p(dVar3, dVar)) {
                        m195260f(iVar, C87306ae.LOW_PRIORITY, new Throwable("Failed to show bottom sheet: a higher priority persistent sheet is showing at the moment "));
                        return;
                    }
                    if (C87320c.PREEMPTIVE == dVar3.mo80956b()) {
                        this.f326086i = 2;
                    } else {
                        this.f326086i = 1;
                    }
                    mo103324i(iVar);
                } else if (m195264q(dVar, dVar3)) {
                    this.f326086i = 1;
                    mo103324i(iVar);
                } else {
                    m195262o(iVar);
                }
            }
        } else {
            this.f326086i = 3;
            mo103324i(iVar);
        }
    }

    /* renamed from: d */
    public final void mo80981d(C87321d dVar, int i) {
        mo103327l(dVar, i);
        mo103328m(dVar, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo103322g(C23056g gVar) {
        if (gVar instanceof C90232h) {
            C90232h hVar = (C90232h) gVar;
            this.f326079b.f326092b = this.f326089l.mo26870b();
            return;
        }
        ((C59052c) ((C59052c) f326078a.mo56226d()).mo56372aa(18268)).mo56389s("Bottom sheet controller %s didn't implement expected interface", gVar.mo28495P().f63478c);
        int i = C90755l.f253831a;
    }

    /* renamed from: h */
    public final void mo103323h() {
        if (!this.f326083f && this.f326084g) {
            C117473i iVar = this.f326082e;
            if (iVar != null) {
                mo103324i(iVar);
                return;
            }
            this.f326086i = 3;
            if (!this.f326081d.isEmpty()) {
                C117473i iVar2 = (C117473i) this.f326081d.poll();
                iVar2.getClass();
                mo103324i(iVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo103324i(C117473i iVar) {
        C87304ac acVar;
        C87304ac acVar2;
        C87343z zVar;
        C117469e eVar = this.f326080c;
        if (eVar == null || eVar != iVar.f326065f) {
            m195261n(iVar, C87306ae.BOTTOM_SHEET_UNREGISTERED);
        } else if (!iVar.f326062c.mo80958d().mo80955d()) {
            m195261n(iVar, C87306ae.SHEET_IS_NOT_LONGER_VALID);
            if (this.f326082e == iVar) {
                this.f326082e = null;
            }
            mo103323h();
        } else {
            C117473i iVar2 = this.f326082e;
            if (iVar2 == null || iVar2 == iVar) {
                this.f326082e = iVar;
                if (this.f326083f) {
                    mo103321e();
                    return;
                }
                this.f326079b.f326091a = iVar;
                C117477m mVar = new C117477m(this);
                C117469e eVar2 = this.f326080c;
                if (eVar2 == null) {
                    m195261n(iVar, C87306ae.BOTTOM_SHEET_UNREGISTERED);
                    return;
                }
                this.f326085h = true;
                C23129y yVar = iVar.f326066g;
                if (yVar == null) {
                    C87302aa c = iVar.f326062c.mo80957c();
                    int i = c.f235770a;
                    if (i == 2) {
                        C87343z zVar2 = C87343z.UNKNOWN_TYPE;
                        if (c.f235770a == 2) {
                            zVar = C87343z.m141303a(((Integer) c.f235771b).intValue());
                            if (zVar == null) {
                                zVar = C87343z.UNKNOWN_TYPE;
                            }
                        } else {
                            zVar = C87343z.UNKNOWN_TYPE;
                        }
                        int ordinal = zVar.ordinal();
                        if (ordinal == 1) {
                            iVar.f326066g = new C23129y("now_stream", "TYPE_SNACKBAR_BOTTOMSHEET");
                        } else if (ordinal == 2) {
                            iVar.f326066g = new C23129y("now_stream", "TYPE_NEW_CONTENT_TIP");
                        } else if (ordinal == 3) {
                            iVar.f326066g = new C23129y("bottombartooltip", "bottombartooltip");
                        } else if (ordinal == 4) {
                            iVar.f326066g = new C23129y("bottomsheet", "TYPE_BOTTOM_SHEET_DIALOG");
                        } else if (ordinal != 5) {
                            ((C59052c) ((C59052c) C117473i.f326060a.mo56225c()).mo56372aa(18250)).mo56389s("Unexpected bottom sheet type: %s", c);
                        } else {
                            iVar.f326066g = new C23129y("now_stream", "TYPE_SMILE_SCALE_SURVEY");
                        }
                    } else {
                        if (i == 1) {
                            acVar = (C87304ac) c.f235771b;
                        } else {
                            acVar = C87304ac.f235772c;
                        }
                        String str = acVar.f235774a;
                        if (c.f235770a == 1) {
                            acVar2 = (C87304ac) c.f235771b;
                        } else {
                            acVar2 = C87304ac.f235772c;
                        }
                        iVar.f326066g = new C23129y(str, acVar2.f235775b);
                    }
                    yVar = iVar.f326066g;
                }
                if (yVar == null) {
                    ((C59052c) ((C59052c) C117469e.f326040a.mo56225c()).mo56372aa(18242)).mo56386p("Monet type is not found");
                } else if (!iVar.f326062c.mo80971n() || eVar2.f326042c.getResources().getConfiguration().orientation != 2) {
                    eVar2.f326044e = iVar;
                    ((C23251a) eVar2.f326041b.mo103333f()).mo28730f(Boolean.valueOf(iVar.f326062c.mo80968i()), false);
                    ((C23251a) eVar2.f326041b.mo103338k()).mo28730f(Boolean.valueOf(iVar.f326062c.mo80966k()), false);
                    ((C23251a) eVar2.f326041b.mo103337j()).mo28730f(Boolean.valueOf(iVar.f326062c.mo80969j()), false);
                    ((C23251a) eVar2.f326041b.mo103335h()).mo28730f(Boolean.valueOf(iVar.f326062c.mo80961h()), false);
                    ((C23251a) eVar2.f326041b.mo103334g()).mo28730f(Boolean.valueOf(iVar.f326062c.mo80964o()), false);
                    ((C23251a) eVar2.f326041b.mo103336i()).mo28730f(Boolean.valueOf(iVar.f326062c.mo80972p()), false);
                    ((C23186f) eVar2.f326041b.mo103329b()).mo28630k(new C117467c(eVar2, mVar, iVar));
                    C23186f fVar = (C23186f) eVar2.f326041b.mo103329b();
                    if (!((C23186f) eVar2.f326041b.mo103329b()).mo28631l()) {
                        C91776a aVar = (C91776a) C91795b.f255983c.createBuilder();
                        aVar.copyOnWrite();
                        C91795b bVar = (C91795b) aVar.instance;
                        bVar.f255986b = ((C90229e) ((C58833ax) ((C23251a) eVar2.f326041b.mo103339l()).f63720e).mo56107c()).f252076h;
                        bVar.f255985a |= 2;
                        ((C23186f) eVar2.f326041b.mo103329b()).mo28623d(yVar, C23245b.m43556a((C91795b) aVar.build()));
                        return;
                    }
                    Throwable th = new Throwable("Child has already been created.");
                    if (this.f326082e == iVar) {
                        this.f326082e = null;
                        ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18259)).mo56386p("Unexpected exception type");
                        m195260f(iVar, C87306ae.UNKNOWN, th);
                    }
                    mo103323h();
                }
            } else {
                this.f326082e = iVar;
            }
        }
    }

    /* renamed from: iy */
    public final void mo80982iy() {
        this.f326084g = true;
        if (!this.f326083f && !this.f326085h && !this.f326081d.isEmpty()) {
            C117473i iVar = (C117473i) this.f326081d.poll();
            iVar.getClass();
            mo103324i(iVar);
        }
    }

    /* renamed from: iz */
    public final void mo80983iz() {
        this.f326084g = false;
    }

    /* renamed from: j */
    public final void mo103325j(C117473i iVar) {
        if (C87320c.PREEMPTIVE.equals(iVar.f326062c.mo80956b())) {
            m195260f(iVar, C87306ae.SURFACE_INACTIVE, (Throwable) null);
        } else {
            m195262o(iVar);
        }
    }

    /* renamed from: l */
    public final void mo103327l(C87321d dVar, int i) {
        C117473i iVar = this.f326079b.f326091a;
        if (iVar == null) {
            ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18275)).mo56386p("Trying to dismiss a sheet when the current state is empty");
        } else if (iVar.f326062c != dVar) {
            ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18274)).mo56386p("Failed to dismiss the current sheet because it does not match with the current sheet");
        } else {
            mo103326k(i);
        }
    }

    /* renamed from: m */
    public final void mo103328m(C87321d dVar, int i) {
        Iterator it = this.f326081d.iterator();
        while (it.hasNext()) {
            C117473i iVar = (C117473i) it.next();
            if (dVar == iVar.f326062c) {
                it.remove();
                iVar.f326062c.mo80958d().mo80953b(i);
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo103321e() {
        int i = this.f326086i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    mo103326k(4);
                }
            } else if (!this.f326083f) {
                ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18265)).mo56386p("Try to hide when the state is empty or the sheet has been dismissed");
            } else {
                C117481q qVar = this.f326079b;
                C117473i iVar = qVar.f326091a;
                if (iVar == null) {
                    ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18264)).mo56386p("bottom sheet element is not present in bottom sheet state during hide");
                } else {
                    long j = qVar.f326092b;
                    if (iVar.f326064e) {
                        long b = iVar.f326063d.mo26870b() - j;
                        iVar.f326067h += b;
                        iVar.f326068i -= b;
                    }
                    C117469e eVar = this.f326080c;
                    if (eVar == null) {
                        ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18263)).mo56386p("Bottom sheet controller has already been destroyed");
                        m195261n(iVar, C87306ae.BOTTOM_SHEET_UNREGISTERED);
                    } else {
                        eVar.mo103314e(new C117476l(this, iVar));
                    }
                }
            }
            this.f326086i = 3;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo103326k(int i) {
        boolean z = this.f326083f;
        if (z && i == 8) {
            C117473i iVar = this.f326079b.f326091a;
            if (iVar == null) {
                ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18257)).mo56386p("bottom sheet element is not present in the state during dismiss");
            } else {
                new C117475k(this, iVar, 8).mo103320a();
            }
        } else if (this.f326085h) {
            this.f326087j = i;
        } else {
            this.f326085h = true;
            if (!z) {
                mo103323h();
                return;
            }
            C117473i iVar2 = this.f326079b.f326091a;
            if (iVar2 == null) {
                ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18253)).mo56386p("bottom sheet element is not present in the state during dismiss");
                return;
            }
            C117469e eVar = this.f326080c;
            if (eVar == null) {
                ((C59052c) ((C59052c) f326078a.mo56225c()).mo56372aa(18252)).mo56386p("bottom sheet feature has been destroyed");
            } else {
                eVar.mo103314e(new C117475k(this, iVar2, i));
            }
        }
    }
}
