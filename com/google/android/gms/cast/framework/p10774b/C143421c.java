package com.google.android.gms.cast.framework.p10774b;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.b.c */
/* compiled from: PG */
final class C143421c extends C144861c {

    /* renamed from: a */
    final /* synthetic */ C143424f f388922a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143421c(C143424f fVar, Looper looper) {
        super(looper);
        this.f388922a = fVar;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f388922a.mo118633m((List) message.obj);
        }
    }
}
