package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104534ab;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104535ac;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104681x;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104682y;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105189ak;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105270dk;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105271dl;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7941pq;
import com.google.p375ai.p378b.C8178yk;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.c.s */
/* compiled from: PG */
public final class C105449s implements C23113i {

    /* renamed from: a */
    private final C105447q f294065a;

    public C105449s(C105447q qVar) {
        this.f294065a = qVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("ReactionEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onCollapsedLess")) {
                C104682y yVar = ((C105271dl) this.f294065a).f293699m;
                if (yVar != null) {
                    C104534ab abVar = yVar.f291513c.f290760g;
                    if (abVar == null || yVar.f291512b == null) {
                        C59104x d = C104535ac.f290753a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "BaseModuleController");
                        ((C59052c) ((C59052c) d).mo56372aa(21979)).mo56386p("No ReactionListener set.");
                        int i = C90755l.f253831a;
                        return;
                    }
                    abVar.mo94231a(new C104681x(yVar));
                }
            } else if (str.equals("onCollapsedMore")) {
                C105271dl dlVar = (C105271dl) this.f294065a;
                dlVar.f293695i = dlVar.f293691e.mo28208h("showMoreSuccessSnackbar", 50, new C105270dk(dlVar));
            } else if (str.equals("onExpanded")) {
                ((C105189ak) ((C105271dl) this.f294065a).f293687a).f293363c.mo28730f(C58833ax.m90834k(C105450t.EXPANDED), false);
            } else {
                C8178yk ykVar = null;
                if (str.equals("onLessReaction")) {
                    C105271dl dlVar2 = (C105271dl) this.f294065a;
                    if (!dlVar2.f293697k) {
                        C7681g gVar = C7681g.FEED_STORY_LESS;
                        C7941pq pqVar = dlVar2.f293694h;
                        if (!(pqVar == null || (pqVar.f27882a & 2) == 0 || (ykVar = pqVar.f27884c) != null)) {
                            ykVar = C8178yk.f28736g;
                        }
                        dlVar2.mo94696e(gVar, ykVar);
                        ((C105189ak) dlVar2.f293687a).f293363c.mo28730f(C58833ax.m90834k(C105450t.COLLAPSING_FROM_LESS), false);
                        dlVar2.f293697k = true;
                    }
                    C7941pq pqVar2 = dlVar2.f293694h;
                    if (pqVar2 != null) {
                        int i2 = pqVar2.f27882a;
                        if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                            C8178yk ykVar2 = pqVar2.f27883b;
                            if (ykVar2 == null) {
                                ykVar2 = C8178yk.f28736g;
                            }
                            C8178yk ykVar3 = dlVar2.f293694h.f27884c;
                            if (ykVar3 == null) {
                                ykVar3 = C8178yk.f28736g;
                            }
                            dlVar2.mo94698h(ykVar2, ykVar3);
                        }
                    }
                    dlVar2.mo94697f();
                } else if (str.equals("onMoreReaction")) {
                    C105271dl dlVar3 = (C105271dl) this.f294065a;
                    C104682y yVar2 = dlVar3.f293699m;
                    if (yVar2 != null) {
                        yVar2.f291513c.mo94244M(yVar2.f291511a, 2);
                    }
                    if (!dlVar3.f293697k) {
                        C7681g gVar2 = C7681g.FEED_STORY_MORE;
                        C7941pq pqVar3 = dlVar3.f293694h;
                        if (!(pqVar3 == null || (pqVar3.f27882a & 1) == 0 || (ykVar = pqVar3.f27883b) != null)) {
                            ykVar = C8178yk.f28736g;
                        }
                        dlVar3.mo94696e(gVar2, ykVar);
                        ((C105189ak) dlVar3.f293687a).f293363c.mo28730f(C58833ax.m90834k(C105450t.COLLAPSING_FROM_MORE), false);
                        dlVar3.f293697k = true;
                    }
                    C7941pq pqVar4 = dlVar3.f293694h;
                    if (pqVar4 != null) {
                        int i3 = pqVar4.f27882a;
                        if (!((i3 & 1) == 0 || (i3 & 2) == 0)) {
                            C8178yk ykVar4 = pqVar4.f27884c;
                            if (ykVar4 == null) {
                                ykVar4 = C8178yk.f28736g;
                            }
                            C8178yk ykVar5 = dlVar3.f293694h.f27883b;
                            if (ykVar5 == null) {
                                ykVar5 = C8178yk.f28736g;
                            }
                            dlVar3.mo94698h(ykVar4, ykVar5);
                        }
                    }
                    dlVar3.mo94697f();
                } else if (str.equals("onTouchOutsideWidget")) {
                    C105271dl dlVar4 = (C105271dl) this.f294065a;
                    C104682y yVar3 = dlVar4.f293699m;
                    if (yVar3 != null) {
                        yVar3.mo94294a();
                    }
                    dlVar4.mo94697f();
                }
            }
        }
    }
}
