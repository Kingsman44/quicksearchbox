package com.google.android.apps.search.assistant.surfaces.notification;

import android.content.Intent;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36269h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.search.assistant.surfaces.notification.b */
/* compiled from: PG */
public final /* synthetic */ class C126628b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126630d f348723a;

    /* renamed from: b */
    public final /* synthetic */ Intent f348724b;

    public /* synthetic */ C126628b(C126630d dVar, Intent intent) {
        this.f348723a = dVar;
        this.f348724b = intent;
    }

    public final void run() {
        C126630d dVar = this.f348723a;
        try {
            byte[] byteArrayExtra = this.f348724b.getByteArrayExtra("intent.dismiss");
            if (byteArrayExtra == null) {
                C59104x d = C126630d.f348727a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NTF.IntentProcessor");
                ((C59052c) ((C59052c) d).mo56372aa(37070)).mo56386p("Cannot read dismiss payload bytes.");
                return;
            }
            C62921ba a = C62921ba.m95368a();
            dVar.f348728b.mo40073c((C36269h) C62942bv.parseFrom((C62942bv) C36269h.f94733k, byteArrayExtra, a));
        } catch (C62974ct e) {
            C59104x d2 = C126630d.f348727a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NTF.IntentProcessor");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(37069)).mo56386p("Cannot decode ProactiveNotificationDismissedContext.");
        }
    }
}
