package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.p */
/* compiled from: PG */
final class C11615p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C11622w f37556a;

    /* renamed from: b */
    final /* synthetic */ C11610k f37557b;

    public C11615p(C11622w wVar, C11610k kVar) {
        this.f37556a = wVar;
        this.f37557b = kVar;
    }

    public final void run() {
        boolean isEmpty = this.f37556a.f37576h.isEmpty();
        this.f37556a.f37576h.add(this.f37557b);
        if (isEmpty && !this.f37556a.f37576h.isEmpty()) {
            C11622w wVar = this.f37556a;
            wVar.f37571c.registerReceiver(wVar.f37572d, wVar.f37574f);
        }
    }
}
