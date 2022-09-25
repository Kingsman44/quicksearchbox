package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.r */
/* compiled from: PG */
final class C11617r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C11622w f37560a;

    /* renamed from: b */
    final /* synthetic */ C11610k f37561b;

    public C11617r(C11622w wVar, C11610k kVar) {
        this.f37560a = wVar;
        this.f37561b = kVar;
    }

    public final void run() {
        boolean isEmpty = this.f37560a.f37576h.isEmpty();
        this.f37560a.f37576h.remove(this.f37561b);
        if ((!isEmpty) && this.f37560a.f37576h.isEmpty()) {
            C11622w wVar = this.f37560a;
            wVar.f37571c.unregisterReceiver(wVar.f37572d);
        }
    }
}
