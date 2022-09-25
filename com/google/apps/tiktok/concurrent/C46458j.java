package com.google.apps.tiktok.concurrent;

import com.google.apps.tiktok.tracing.C47822fd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.apps.tiktok.concurrent.j */
/* compiled from: PG */
final class C46458j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f121562a;

    /* renamed from: b */
    final /* synthetic */ String f121563b;

    public C46458j(C60870cx cxVar, String str) {
        this.f121562a = cxVar;
        this.f121563b = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if ((th instanceof TimeoutException) && !this.f121562a.isDone()) {
            ((C59052c) ((C59052c) ((C59052c) C46459k.f121564a.mo56225c()).mo56382g(C47822fd.m84995a(th))).mo56372aa(54722)).mo56389s("exceeded timeout: %s", this.f121563b);
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
    }
}
