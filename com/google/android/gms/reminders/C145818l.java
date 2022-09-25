package com.google.android.gms.reminders;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.reminders.l */
/* compiled from: PG */
final class C145818l extends C144861c {

    /* renamed from: a */
    final /* synthetic */ C145819m f394237a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145818l(C145819m mVar, Looper looper) {
        super(looper);
        this.f394237a = mVar;
    }

    public final void handleMessage(Message message) {
        this.f394237a.mo122104f((Intent) message.obj);
        this.f394237a.stopSelf(message.arg1);
    }
}
