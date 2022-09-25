package com.google.android.libraries.search.assistant.performer.p2767j;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.g */
/* compiled from: PG */
public final /* synthetic */ class C36185g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f94547a;

    public /* synthetic */ C36185g(Intent intent) {
        this.f94547a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f94547a;
        ((C59052c) ((C59052c) ((C59052c) C36186h.f94548a.mo56225c()).mo56382g((ActivityNotFoundException) obj)).mo56372aa(52199)).mo56354G("Activity not found to start with Intent action: %s, for package: %s", intent.getAction(), intent.getPackage());
        return C36180b.m64578b(C52235kf.INTERNAL);
    }
}
