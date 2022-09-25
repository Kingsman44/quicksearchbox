package com.google.android.libraries.surveys.internal.view;

/* renamed from: com.google.android.libraries.surveys.internal.view.bd */
/* compiled from: PG */
public final /* synthetic */ class C43102bd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C43108bj f112729a;

    /* renamed from: b */
    public final /* synthetic */ int f112730b;

    public /* synthetic */ C43102bd(C43108bj bjVar, int i) {
        this.f112729a = bjVar;
        this.f112730b = i;
    }

    public final void run() {
        C43108bj bjVar = this.f112729a;
        int i = this.f112730b;
        C43107bi biVar = bjVar.f112747a;
        if (biVar != null) {
            biVar.mo46133a(i);
            bjVar.f112747a = null;
        }
    }
}
