package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6893d.C87300a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87305ad;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87319b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90223c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90224d;
import com.google.android.apps.gsa.shared.p7020bd.C89408a;
import com.google.android.apps.gsa.shared.p7020bd.C89409b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62974ct;
import java.util.HashSet;
import java.util.Set;
import p5451f.p5452a.p5453a.p5454a.C69381ac;
import p5451f.p5452a.p5453a.p5454a.C69395aq;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69421bp;
import p5451f.p5452a.p5453a.p5454a.C69431bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.c */
/* compiled from: PG */
public final class C99406c implements C87300a {

    /* renamed from: a */
    public static final C59071e f278168a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.de.b.c");

    /* renamed from: b */
    public final C86338r f278169b;

    /* renamed from: c */
    public final C85536a f278170c;

    /* renamed from: d */
    public final C89409b f278171d;

    /* renamed from: e */
    public final C86124t f278172e;

    /* renamed from: f */
    private final Set f278173f = new HashSet();

    /* renamed from: g */
    private C87319b f278174g;

    /* renamed from: h */
    private String f278175h;

    /* renamed from: i */
    private C90224d f278176i;

    /* renamed from: j */
    private C23052c f278177j;

    /* renamed from: k */
    private C87305ad f278178k;

    /* renamed from: l */
    private C58833ax f278179l;

    /* renamed from: m */
    private C87334q f278180m;

    public C99406c(C86338r rVar, C85536a aVar, C89409b bVar, C86124t tVar) {
        this.f278169b = rVar;
        this.f278170c = aVar;
        this.f278171d = bVar;
        this.f278172e = tVar;
    }

    /* renamed from: f */
    private final void m164875f(C23052c cVar, C90224d dVar, C87305ad adVar) {
        Set set = this.f278173f;
        C90208n a = C90208n.m146767a(dVar.f252057f);
        if (a == null) {
            a = C90208n.UNKNOWN_TAB;
        }
        if (set.contains(a)) {
            if (dVar.f252062k) {
                adVar.getClass();
                this.f278174g = new C87319b(cVar, dVar, adVar);
            } else {
                C86338r rVar = this.f278169b;
                int a2 = C90223c.m146769a(dVar.f252053b);
                int i = 1;
                if (a2 == 0) {
                    a2 = 1;
                }
                String str = Integer.toString(a2 - 1) + "_" + dVar.f252054c + "_dismissed";
                this.f278175h = str;
                if (!rVar.getBoolean(str, false)) {
                    int a3 = C90223c.m146769a(dVar.f252053b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    String concat = "bottom_bar_tooltip_version_".concat(Integer.toString(a3 - 1));
                    if (dVar.f252054c != this.f278169b.getInt(concat, 0)) {
                        C58976aa aaVar = C58975e.f156826a;
                        int i2 = dVar.f252053b;
                        C86337q b = this.f278169b.mo80076b();
                        b.mo80070e(concat, dVar.f252054c);
                        int a4 = C90223c.m146769a(dVar.f252053b);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        b.mo80070e("bottom_bar_tooltip_remaining_times_to_show_".concat(Integer.toString(a4 - 1)), dVar.f252056e);
                        b.apply();
                    }
                    int a5 = C90223c.m146769a(dVar.f252053b);
                    if (a5 != 0) {
                        i = a5;
                    }
                    if (mo91435e(i) <= 0) {
                        C58976aa aaVar2 = C58975e.f156826a;
                        int i3 = dVar.f252053b;
                        return;
                    }
                    this.f278174g = new C87319b(cVar, dVar, new C99383a(this, dVar, adVar));
                } else {
                    return;
                }
            }
            C87334q qVar = this.f278180m;
            if (qVar != null) {
                qVar.mo80980c(this.f278174g);
            }
        }
    }

    /* renamed from: a */
    public final void mo80948a(C23052c cVar, C69381ac acVar) {
        C69431bz bzVar;
        C90224d dVar;
        try {
            C69381ac acVar2 = C69381ac.UNRESOLVED;
            int ordinal = acVar.ordinal();
            if (ordinal == 1) {
                bzVar = C69431bz.SEARCH_TAB;
            } else if (ordinal == 2) {
                bzVar = C69431bz.INTERESTS_TAB;
            } else if (ordinal == 3) {
                bzVar = C69431bz.RECENTS_TAB;
            } else if (ordinal != 4) {
                C59104x c = f278168a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                ((C59052c) ((C59052c) c).mo56372aa(32595)).mo56386p("invalid bottom sheet surface");
                return;
            } else {
                bzVar = C69431bz.COLLECTIONS_TAB;
            }
            C58833ax b = this.f278171d.mo83326b(C69395aq.BOTTOM_BAR_TOOLTIP, bzVar);
            this.f278179l = b;
            if (!b.mo56113h()) {
                C59104x d = f278168a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                ((C59052c) ((C59052c) d).mo56372aa(32599)).mo56386p("Next bottom bar tooltip id does not exist");
                return;
            }
            int intValue = ((Integer) this.f278179l.mo56107c()).intValue();
            if (!((Boolean) C90877ak.m148475i(this.f278170c.mo79049a(intValue), false)).booleanValue()) {
                C59104x c2 = f278168a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                ((C59052c) ((C59052c) c2).mo56372aa(32598)).mo56387q("Tip triggering conditions not met for id: %d", intValue);
                return;
            }
            C69396ar arVar = C69396ar.f185678d;
            try {
                C69396ar c3 = this.f278171d.mo83327c(intValue);
                if (c3.f185680a == 8) {
                    dVar = (C90224d) c3.f185681b;
                } else {
                    dVar = C90224d.f252050l;
                }
                C69421bp bpVar = c3.f185682c;
                if (bpVar == null) {
                    bpVar = C69421bp.f185742q;
                }
                C99405b bVar = new C99405b(this, intValue, bpVar.f185749f);
                if (this.f278180m != null) {
                    int a = C90223c.m146769a(dVar.f252053b);
                    if (a == 0 || a == 1) {
                        C59104x c4 = f278168a.mo56225c();
                        c4.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                        ((C59052c) ((C59052c) c4).mo56372aa(32604)).mo56386p("Invalid feature identifier passed for tooltip");
                    } else if ((dVar.f252052a & 16) != 0) {
                        if (dVar.f252055d.isEmpty()) {
                            C90208n nVar = C90208n.UPDATES_TAB;
                            C90208n a2 = C90208n.m146767a(dVar.f252057f);
                            if (a2 == null) {
                                a2 = C90208n.UNKNOWN_TAB;
                            }
                            if (nVar != a2) {
                                C59104x c5 = f278168a.mo56225c();
                                c5.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                                ((C59052c) ((C59052c) c5).mo56372aa(32602)).mo56386p("Tooltip title is null or empty");
                                return;
                            }
                        }
                        if (dVar.f252058g == 0) {
                            C59104x c6 = f278168a.mo56225c();
                            c6.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                            ((C59052c) ((C59052c) c6).mo56372aa(32601)).mo56386p("Invalid Visual element data passed for tooltip");
                        } else if (dVar.f252054c == 0 && !dVar.f252062k) {
                            C59104x c7 = f278168a.mo56225c();
                            c7.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                            ((C59052c) ((C59052c) c7).mo56372aa(32600)).mo56386p("Tooltip version must be non-zero");
                        } else if (this.f278173f.isEmpty()) {
                            this.f278176i = dVar;
                            this.f278177j = cVar;
                            this.f278178k = bVar;
                        } else {
                            m164875f(cVar, dVar, bVar);
                        }
                    } else {
                        C59104x c8 = f278168a.mo56225c();
                        c8.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                        ((C59052c) ((C59052c) c8).mo56372aa(32603)).mo56386p("Missing tabType to point the tooltip at");
                    }
                } else {
                    C59104x d2 = f278168a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                    ((C59052c) ((C59052c) d2).mo56372aa(32594)).mo56386p("BottomSheetManager must be set first");
                    int i = C90755l.f253831a;
                }
            } catch (C89408a | C62974ct e) {
                C59104x c9 = f278168a.mo56225c();
                c9.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
                ((C59052c) ((C59052c) ((C59052c) c9).mo56382g(e)).mo56372aa(32597)).mo56386p("Error retrieving next bottom bar tooltip");
            }
        } catch (C89408a | C62974ct e2) {
            C59104x c10 = f278168a.mo56225c();
            c10.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
            ((C59052c) ((C59052c) ((C59052c) c10).mo56382g(e2)).mo56372aa(32596)).mo56386p("Error retrieving next bottom bar tooltip id");
        }
    }

    /* renamed from: b */
    public final void mo80949b(C90208n nVar) {
        C87319b bVar;
        if (this.f278180m != null && (bVar = this.f278174g) != null) {
            C90224d dVar = bVar.f235819a;
            if (dVar.f252062k || this.f278175h != null) {
                C90208n a = C90208n.m146767a(dVar.f252057f);
                if (a == null) {
                    a = C90208n.UNKNOWN_TAB;
                }
                if (a == nVar) {
                    C87319b bVar2 = this.f278174g;
                    bVar2.getClass();
                    if (bVar2.f235819a.f252062k) {
                        C58833ax axVar = this.f278179l;
                        if (axVar != null && axVar.mo56113h()) {
                            this.f278170c.mo79051c(((Integer) axVar.mo56107c()).intValue());
                            C87334q qVar = this.f278180m;
                            C87319b bVar3 = this.f278174g;
                            bVar3.getClass();
                            qVar.mo80981d(bVar3, 3);
                        }
                    } else if (!this.f278169b.getBoolean(this.f278175h, false)) {
                        C86337q b = this.f278169b.mo80076b();
                        String str = this.f278175h;
                        str.getClass();
                        b.mo80067b(str, true);
                        b.apply();
                        C87334q qVar2 = this.f278180m;
                        C87319b bVar4 = this.f278174g;
                        bVar4.getClass();
                        qVar2.mo80981d(bVar4, 9);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo80950c(C87334q qVar) {
        this.f278180m = qVar;
    }

    /* renamed from: d */
    public final void mo80951d(Set set) {
        C23052c cVar;
        this.f278173f.clear();
        this.f278173f.addAll(set);
        C90224d dVar = this.f278176i;
        if (dVar != null && (cVar = this.f278177j) != null) {
            m164875f(cVar, dVar, this.f278178k);
            this.f278177j = null;
            this.f278176i = null;
            this.f278178k = null;
        }
    }

    /* renamed from: e */
    public final int mo91435e(int i) {
        return this.f278169b.getInt("bottom_bar_tooltip_remaining_times_to_show_".concat(Integer.toString(i - 1)), 0);
    }
}
