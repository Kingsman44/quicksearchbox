package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.p */
/* compiled from: PG */
public final /* synthetic */ class C35962p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f94137a;

    public /* synthetic */ C35962p(Intent intent) {
        this.f94137a = intent;
    }

    public final Object apply(Object obj) {
        ((C59052c) ((C59052c) ((C59052c) C35981t.f94162a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(51784)).mo56389s("Failed to open camera app for intent: %s", this.f94137a);
        return C36180b.m64579c(C52235kf.INTERNAL, "Camera failed to start.");
    }
}
