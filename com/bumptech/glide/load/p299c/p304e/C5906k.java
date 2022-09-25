package com.bumptech.glide.load.p299c.p304e;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.c.e.k */
/* compiled from: PG */
final class C5906k implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C5907l f17532a;

    public C5906k(C5907l lVar) {
        this.f17532a = lVar;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f17532a.mo12368c((C5904i) message.obj);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            this.f17532a.f17535c.mo11877o((C5904i) message.obj);
            return false;
        }
    }
}
