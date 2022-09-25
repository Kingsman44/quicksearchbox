package com.google.android.libraries.surveys.internal.view;

/* renamed from: com.google.android.libraries.surveys.internal.view.bc */
/* compiled from: PG */
public final /* synthetic */ class C43101bc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C43108bj f112727a;

    /* renamed from: b */
    public final /* synthetic */ int f112728b;

    public /* synthetic */ C43101bc(C43108bj bjVar, int i) {
        this.f112727a = bjVar;
        this.f112728b = i;
    }

    public final void run() {
        C43108bj bjVar = this.f112727a;
        int i = this.f112728b;
        C43107bi biVar = bjVar.f112747a;
        if (biVar != null) {
            biVar.mo46133a(i);
            bjVar.f112747a = null;
        }
    }
}
