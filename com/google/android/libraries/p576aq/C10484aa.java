package com.google.android.libraries.p576aq;

/* renamed from: com.google.android.libraries.aq.aa */
/* compiled from: PG */
public final /* synthetic */ class C10484aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f35253a;

    public /* synthetic */ C10484aa(String str) {
        this.f35253a = str;
    }

    public final void run() {
        String str = this.f35253a;
        throw new IllegalStateException("No call to end() within 500 ms for SourceGroup with label \"" + str + "\"");
    }
}
