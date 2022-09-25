package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.content.Intent;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.ae */
/* compiled from: PG */
public final /* synthetic */ class C13939ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f42427a;

    public /* synthetic */ C13939ae(Intent intent) {
        this.f42427a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f42427a;
        C59104x c = C13946al.f42444a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(45216)).mo56389s("Failed to start activity on intent : %s", intent);
        return C22402a.m41822b(C52235kf.NOT_FOUND, "Fallback to intent failed.");
    }
}
