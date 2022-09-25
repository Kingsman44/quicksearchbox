package com.google.android.libraries.assistant.auto.tng.p1026k.p1027a;

import android.content.Intent;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.k.a.c */
/* compiled from: PG */
public final /* synthetic */ class C13712c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f41819a;

    public /* synthetic */ C13712c(Intent intent) {
        this.f41819a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f41819a;
        C59104x c = C13713d.f41820a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AapCrashRprtPerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(44967)).mo56389s("Failed to start activity for intent: %s", intent);
        return C22402a.m41822b(C52235kf.INTERNAL, "Failed to start activity for feedback intent.");
    }
}
