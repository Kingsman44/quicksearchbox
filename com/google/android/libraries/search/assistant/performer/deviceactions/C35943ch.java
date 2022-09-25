package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ch */
/* compiled from: PG */
public final /* synthetic */ class C35943ch implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f94116a;

    public /* synthetic */ C35943ch(Intent intent) {
        this.f94116a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f94116a;
        C59104x c = C35944ci.f94117a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SetupAssistantDevicePerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(51864)).mo56389s("Failed to start intent: %s", intent);
        return C36180b.m64578b(C52235kf.INTERNAL);
    }
}
