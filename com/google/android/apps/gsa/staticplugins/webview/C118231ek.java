package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ek */
/* compiled from: PG */
public final /* synthetic */ class C118231ek implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328229a;

    /* renamed from: b */
    public final /* synthetic */ long f328230b;

    /* renamed from: c */
    public final /* synthetic */ long f328231c;

    public /* synthetic */ C118231ek(C118248fa faVar, long j, long j2) {
        this.f328229a = faVar;
        this.f328230b = j;
        this.f328231c = j2;
    }

    public final void run() {
        C118248fa faVar = this.f328229a;
        long j = this.f328230b;
        long j2 = this.f328231c;
        C118119ai c = faVar.f328278g.mo103561c(j);
        if (c != null) {
            c.f327806Y = j2;
        } else {
            faVar.f328275b.put(j, Long.valueOf(j2));
        }
    }
}
