package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.dd */
/* compiled from: PG */
public final /* synthetic */ class C115288dd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f319910a;

    public /* synthetic */ C115288dd(C60870cx cxVar) {
        this.f319910a = cxVar;
    }

    public final void run() {
        try {
            C52176ia iaVar = (C52176ia) C60856cj.m92909r(this.f319910a);
            if (iaVar.f136914b.size() == 0) {
                C59104x d = C115315ed.f319953a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SpeakrOMPAdapter");
                ((C59052c) ((C59052c) d).mo56372aa(29850)).mo56386p("mediaData has no media items.");
                return;
            }
            C59104x b = C115315ed.f319953a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SpeakrOMPAdapter");
            ((C59052c) ((C59052c) b).mo56372aa(29849)).mo56389s("Playing. OpaMediaPlayer URL: %s", ((C52174hz) iaVar.f136914b.get(0)).f136895b);
        } catch (ExecutionException unused) {
        }
    }
}
