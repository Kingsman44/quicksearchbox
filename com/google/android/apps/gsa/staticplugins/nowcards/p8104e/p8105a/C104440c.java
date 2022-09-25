package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91403b;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91405d;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91909g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104532a;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104535ac;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104579bt;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104664g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104683z;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C7529aq;
import com.google.p375ai.p378b.C7530ar;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8178yk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.c */
/* compiled from: PG */
public final class C104440c implements C23113i {

    /* renamed from: a */
    private final C104423a f290569a;

    public C104440c(C104423a aVar) {
        this.f290569a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("AdDismissSurveyEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            int i = 1;
            if (str.equals("dialogDismissed")) {
                C104532a aVar = (C104532a) this.f290569a;
                C7530ar arVar = (C7530ar) ((C58833ax) ((C104579bt) aVar.f290746a).f291058a.f63720e).mo56107c();
                ((C104579bt) aVar.f290746a).f291058a.mo28730f(C58836b.f156633a, false);
                C7529aq aqVar = (C7529aq) ((C58833ax) ((C104579bt) aVar.f290746a).f291059b.f63720e).mo56111f();
                ((C104579bt) aVar.f290746a).f291059b.mo28730f(C58836b.f156633a, false);
                boolean booleanValue = ((Boolean) ((C104579bt) aVar.f290746a).f291060c.f63720e).booleanValue();
                C58833ax axVar = C58836b.f156633a;
                C91405d dVar = aVar.f290748c;
                if (dVar != null) {
                    if (booleanValue) {
                        C8178yk ykVar = arVar.f26074d;
                        if (ykVar == null) {
                            ykVar = C8178yk.f28736g;
                        }
                        axVar = C58833ax.m90834k(ykVar);
                        if (aqVar != null) {
                            i = aqVar.f26065b;
                            C8178yk ykVar2 = aqVar.f26066c;
                            if (ykVar2 == null) {
                                ykVar2 = C8178yk.f28736g;
                            }
                            axVar = C58833ax.m90834k(ykVar2);
                        }
                        C91403b bVar = aVar.f290747b;
                        C91405d dVar2 = aVar.f290748c;
                        dVar2.getClass();
                        C91909g b = bVar.f254988b.mo86565b(dVar2.f254994c, C7681g.AD_DISMISS_SURVEY_SELECTION);
                        b.mo86538b(Optional.m71637of(Integer.valueOf(i)));
                        b.mo86548l(bVar.f254987a.mo85966a());
                        bVar.f254987a.mo85967b(b.mo86537a());
                    } else {
                        C8178yk ykVar3 = arVar.f26075e;
                        if (ykVar3 == null) {
                            ykVar3 = C8178yk.f28736g;
                        }
                        dVar.mo85749i(ykVar3);
                    }
                    C91405d dVar3 = aVar.f290748c;
                    dVar3.getClass();
                    C8178yk ykVar4 = arVar.f26073c;
                    if (ykVar4 == null) {
                        ykVar4 = C8178yk.f28736g;
                    }
                    dVar3.mo85748h(ykVar4);
                }
                C104664g gVar = aVar.f290749d;
                if (gVar != null) {
                    C104535ac acVar = gVar.f291485a;
                    String str3 = gVar.f291486b;
                    ((C23186f) acVar.f290755b.mo94184b()).mo28627h();
                    if (booleanValue) {
                        C7718hj z = acVar.mo94246z();
                        z.getClass();
                        acVar.f290757d.mo85763a(acVar, z, true, true, true, str3, new C104683z(acVar, axVar));
                    }
                }
            } else if (str.equals("onDialogShown")) {
                C104532a aVar2 = (C104532a) this.f290569a;
                if (aVar2.f290748c != null) {
                    C91405d dVar4 = aVar2.f290748c;
                    dVar4.getClass();
                    C8178yk ykVar5 = ((C7530ar) ((C58833ax) ((C104579bt) aVar2.f290746a).f291058a.f63720e).mo56107c()).f26073c;
                    if (ykVar5 == null) {
                        ykVar5 = C8178yk.f28736g;
                    }
                    dVar4.mo85750j(ykVar5);
                }
            } else if (str.equals("optionSelected_int")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("which")).intValue();
                C104532a aVar3 = (C104532a) this.f290569a;
                if (((C58833ax) ((C104579bt) aVar3.f290746a).f291058a.f63720e).mo56113h()) {
                    C7530ar arVar2 = (C7530ar) ((C58833ax) ((C104579bt) aVar3.f290746a).f291058a.f63720e).mo56107c();
                    C58838bb.m90868c(intValue >= 0 && intValue <= arVar2.f26071a.size());
                    ((C104579bt) aVar3.f290746a).f291060c.mo28730f(true, false);
                    if (intValue != arVar2.f26071a.size()) {
                        ((C104579bt) aVar3.f290746a).f291059b.mo28730f(C58833ax.m90834k((C7529aq) arVar2.f26071a.get(intValue)), false);
                    }
                }
            }
        }
    }
}
