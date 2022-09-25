package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125097by;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126225bl;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126233bt;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63070h;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.ai */
/* compiled from: PG */
public final /* synthetic */ class C125381ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C125383ak f345811a;

    /* renamed from: b */
    public final /* synthetic */ C125097by f345812b;

    public /* synthetic */ C125381ai(C125383ak akVar, C125097by byVar) {
        this.f345811a = akVar;
        this.f345812b = byVar;
    }

    public final void run() {
        C125383ak akVar = this.f345811a;
        C125097by byVar = this.f345812b;
        C125374ab abVar = akVar.f345818d;
        if (abVar == null) {
            C59052c cVar = (C59052c) ((C59052c) C125383ak.f345815a.mo56226d()).mo56372aa(36524);
            C63070h hVar = byVar.f345098a;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            cVar.mo56389s("Ignoring button press outside dictation: %s [SD]", C126288a.m206492d(C126336m.m206590a(hVar)));
            return;
        }
        C63070h hVar2 = byVar.f345098a;
        if (hVar2 == null) {
            hVar2 = C63070h.f170215c;
        }
        C125044j a = C126336m.m206590a(hVar2);
        ((C59052c) ((C59052c) C125374ab.f345782a.mo56224b()).mo56372aa(36511)).mo56389s("Handling ButtonPressedEvent: %s [SD]", C126288a.m206492d(a));
        if (a.equals(C125044j.CLOSE)) {
            abVar.mo106943f(C63122a.SUCCESS_KEYBOARD_STOP_REQUEST);
            return;
        }
        C126233bt btVar = abVar.f345784c;
        btVar.f347843d.execute(C47810es.m84977q(new C126225bl(btVar, byVar)));
    }
}
