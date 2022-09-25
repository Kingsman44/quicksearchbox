package com.google.android.libraries.surveys.internal.view;

/* renamed from: com.google.android.libraries.surveys.internal.view.az */
/* compiled from: PG */
public final /* synthetic */ class C43097az implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C43108bj f112716a;

    /* renamed from: b */
    public final /* synthetic */ int f112717b;

    public /* synthetic */ C43097az(C43108bj bjVar, int i) {
        this.f112716a = bjVar;
        this.f112717b = i;
    }

    public final void run() {
        C43108bj bjVar = this.f112716a;
        int i = this.f112717b;
        C43107bi biVar = bjVar.f112747a;
        if (biVar != null) {
            biVar.mo46133a(i);
            bjVar.f112747a = null;
        }
    }
}
