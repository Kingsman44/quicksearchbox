package com.google.android.youtube.player.p3561b;

import android.os.Handler;
import android.os.IBinder;

/* renamed from: com.google.android.youtube.player.b.ac */
public final class C45444ac extends C45473be {

    /* renamed from: a */
    final /* synthetic */ C45446ae f118853a;

    protected C45444ac(C45446ae aeVar) {
        this.f118853a = aeVar;
    }

    /* renamed from: a */
    public final void mo49590a(String str, IBinder iBinder) {
        C45446ae aeVar = this.f118853a;
        Handler handler = aeVar.f118855a;
        handler.sendMessage(handler.obtainMessage(1, new C45443ab(aeVar, str, iBinder)));
    }
}
