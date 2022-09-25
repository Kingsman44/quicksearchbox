package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.y */
/* compiled from: PG */
public final /* synthetic */ class C93053y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259568a;

    public /* synthetic */ C93053y(ChatPerformer chatPerformer) {
        this.f259568a = chatPerformer;
    }

    public final Object apply(Object obj) {
        new Handler(Looper.getMainLooper()).post(new C92995af(this.f259568a));
        throw new RuntimeException(((Exception) obj).getMessage());
    }
}
