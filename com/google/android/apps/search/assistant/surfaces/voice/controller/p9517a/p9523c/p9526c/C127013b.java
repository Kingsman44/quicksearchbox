package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126998s;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69677g;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.b */
/* compiled from: PG */
final class C127013b extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C127018g f349751a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127013b(C127018g gVar) {
        super(1);
        this.f349751a = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C126998s sVar;
        C127050h hVar;
        C126988i iVar = (C126988i) obj;
        C69664n.m101061g(iVar, "error");
        C127018g gVar = this.f349751a;
        C69664n.m101061g(iVar, "errorData");
        if (iVar.f349672b == 3) {
            sVar = C126998s.m207732a(((Integer) iVar.f349673c).intValue());
            if (sVar == null) {
                sVar = C126998s.TIMEOUT_UNKNOWN_REASON;
            }
        } else {
            sVar = C126998s.TIMEOUT_UNKNOWN_REASON;
        }
        int ordinal = sVar.ordinal();
        if (ordinal == 0) {
            hVar = C127050h.UNSPECIFIED;
        } else if (ordinal == 1) {
            hVar = C127050h.FULL_LISTENING_TIMEOUT;
        } else if (ordinal == 2) {
            hVar = C127050h.FINAL_RECOGNITION_CANDIDATE_TIMEOUT;
        } else if (ordinal == 3) {
            hVar = C127050h.EXECUTION_TIMEOUT;
        } else if (ordinal == 4) {
            hVar = C127050h.MIC_NOT_OPENED_TIMEOUT;
        } else {
            throw new C69677g();
        }
        C71803m.m105043d(gVar.f349764b, (C69585o) null, (C71424ay) null, new C127006a(gVar, iVar, hVar, (C69577g) null), 3);
        return C69788q.f186170a;
    }
}
