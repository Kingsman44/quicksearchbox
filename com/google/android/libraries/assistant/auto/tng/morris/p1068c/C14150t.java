package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.t */
/* compiled from: PG */
public final /* synthetic */ class C14150t implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C14152v f42876a;

    public /* synthetic */ C14150t(C14152v vVar) {
        this.f42876a = vVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C37252a aVar;
        C14152v vVar = this.f42876a;
        String str = vVar.f42892n;
        str.getClass();
        if (str.equals(C14152v.f42884f)) {
            aVar = C37182a.f97842bU.mo40805c(C62722b.DEADLINE_EXCEEDED);
        } else {
            C58528ij ijVar = C14152v.f42886h;
            String str2 = vVar.f42892n;
            str2.getClass();
            if (ijVar.contains(str2)) {
                aVar = C37182a.f97847bZ.mo40805c(C62722b.DEADLINE_EXCEEDED);
            } else {
                throw new AssertionError("This class was used with an unsupported flow event");
            }
        }
        C14151u uVar = new C14151u(vVar, aVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(uVar), vVar.f42889k), "Error finishing flow", new Object[0]);
        C59104x d = C14152v.f42879a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MedPlAppFlow");
        ((C59052c) ((C59052c) d).mo56372aa(45783)).mo56387q("MORRIS_MEDIA_PLAYBACK flow is timeout on event: [%s]", ((C37253b) aVar).f98999a.f98876a.f98906a);
        return C60866ct.f164955a;
    }
}
