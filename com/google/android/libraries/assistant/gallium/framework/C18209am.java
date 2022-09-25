package com.google.android.libraries.assistant.gallium.framework;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.am */
/* compiled from: PG */
public final /* synthetic */ class C18209am {
    /* renamed from: a */
    public static C60870cx m35463a(C60870cx cxVar, C18213aq aqVar, String str) {
        if (cxVar == null) {
            return C60856cj.m92899h(new NullPointerException(String.valueOf(str).concat("(...) returned a NULL Future. Gallium Interface methods are not allowed to return NULL!")));
        }
        SettableFuture settableFuture = new SettableFuture();
        C60856cj.m92911t(cxVar, new C18210an(settableFuture, str, aqVar), C60826bg.f164896a);
        return settableFuture;
    }
}
