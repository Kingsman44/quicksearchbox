package com.google.android.youtube.player.p3561b;

import android.os.Handler;
import android.os.Message;
import com.google.android.youtube.player.C45510f;

/* renamed from: com.google.android.youtube.player.b.y */
final class C45505y extends Handler {

    /* renamed from: a */
    final /* synthetic */ C45446ae f118948a;

    public C45505y(C45446ae aeVar) {
        this.f118948a = aeVar;
    }

    public final void handleMessage(Message message) {
        Object obj;
        if (message.what == 3) {
            this.f118948a.mo49601k((C45510f) message.obj);
        } else if (message.what == 4) {
            synchronized (this.f118948a.f118857c) {
                C45446ae aeVar = this.f118948a;
                if (aeVar.f118861g && aeVar.mo49602l() && aeVar.f118857c.contains(message.obj)) {
                    ((C45481bm) message.obj).mo49633a();
                }
            }
        } else if (message.what == 2 && !this.f118948a.mo49602l()) {
        } else {
            if (message.what == 2 || message.what == 1) {
                C45442aa aaVar = (C45442aa) message.obj;
                synchronized (aaVar) {
                    obj = aaVar.f118849a;
                }
                aaVar.mo49589a(obj);
            }
        }
    }
}
