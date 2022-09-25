package com.google.android.libraries.assistant.p1467d;

import android.util.Log;
import com.google.android.libraries.assistant.p1467d.p1472c.C17837a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.d.j */
/* compiled from: PG */
final class C17932j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f51365a;

    public C17932j(String str) {
        this.f51365a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        String str = this.f51365a;
        String message = th.getMessage();
        Log.w("AssistantIntegClient", "#" + str + "() - sendData failed with msg: " + message);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C17837a aVar = (C17837a) obj;
        String str = this.f51365a;
        boolean z = aVar == C17837a.f51179a;
        Log.v("AssistantIntegClient", "#" + str + "() - sendData successful: " + z);
    }
}
