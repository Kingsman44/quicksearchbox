package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bb */
/* compiled from: PG */
public final /* synthetic */ class C35906bb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Intent f94048a;

    public /* synthetic */ C35906bb(Intent intent) {
        this.f94048a = intent;
    }

    public final C60870cx apply(Object obj) {
        Intent intent = this.f94048a;
        C59104x c = C35907bc.f94049a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpenDeviceSetting");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(51846)).mo56389s("Failed to start activity for intent: %s", intent);
        return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Setting activity failed to start."));
    }
}
