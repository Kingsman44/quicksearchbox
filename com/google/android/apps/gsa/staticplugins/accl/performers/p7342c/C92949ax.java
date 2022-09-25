package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.ax */
/* compiled from: PG */
public final /* synthetic */ class C92949ax implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C92949ax f259297a = new C92949ax();

    private /* synthetic */ C92949ax() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        C59071e eVar = C92950ay.f259298a;
        if (th instanceof TimeoutException) {
            return C22402a.m41822b(C52235kf.DEADLINE_EXCEEDED, th.getMessage());
        }
        return C22402a.m41822b(C52235kf.INTERNAL, th.getMessage());
    }
}
