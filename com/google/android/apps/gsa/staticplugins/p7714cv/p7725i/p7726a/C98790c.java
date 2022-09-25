package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7726a;

import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.micro.GoogleEndpointerData;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.a.c */
/* compiled from: PG */
public final /* synthetic */ class C98790c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C92504i f275957a;

    /* renamed from: b */
    public final /* synthetic */ String f275958b;

    /* renamed from: c */
    public final /* synthetic */ C89994f f275959c;

    /* renamed from: d */
    public final /* synthetic */ SettableFuture f275960d;

    /* renamed from: e */
    public final /* synthetic */ int f275961e;

    public /* synthetic */ C98790c(C92504i iVar, String str, C89994f fVar, SettableFuture settableFuture, int i) {
        this.f275957a = iVar;
        this.f275958b = str;
        this.f275959c = fVar;
        this.f275960d = settableFuture;
        this.f275961e = i;
    }

    public final void run() {
        C92504i iVar = this.f275957a;
        String str = this.f275958b;
        C89994f fVar = this.f275959c;
        SettableFuture settableFuture = this.f275960d;
        int i = this.f275961e;
        byte[] m = iVar.mo87272m(str, fVar.mo83827p());
        if (m != null) {
            settableFuture.mo57356n(new GoogleEndpointerData(m, i));
        } else {
            settableFuture.mo57357o(new RuntimeException("endpointer model is null"));
        }
    }
}
