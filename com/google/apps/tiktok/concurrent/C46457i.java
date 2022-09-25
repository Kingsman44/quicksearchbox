package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.concurrent.i */
/* compiled from: PG */
public final /* synthetic */ class C46457i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f121559a;

    /* renamed from: b */
    public final /* synthetic */ String f121560b;

    /* renamed from: c */
    public final /* synthetic */ Object[] f121561c;

    public /* synthetic */ C46457i(C60870cx cxVar, String str, Object[] objArr) {
        this.f121559a = cxVar;
        this.f121560b = str;
        this.f121561c = objArr;
    }

    public final void run() {
        C46459k.m82828a(this.f121559a, this.f121560b, this.f121561c);
    }
}
