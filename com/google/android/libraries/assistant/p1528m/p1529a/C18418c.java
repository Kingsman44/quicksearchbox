package com.google.android.libraries.assistant.p1528m.p1529a;

/* renamed from: com.google.android.libraries.assistant.m.a.c */
/* compiled from: PG */
public final /* synthetic */ class C18418c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18431p f52266a;

    /* renamed from: b */
    public final /* synthetic */ String f52267b;

    public /* synthetic */ C18418c(C18431p pVar, String str) {
        this.f52266a = pVar;
        this.f52267b = str;
    }

    public final void run() {
        C18431p pVar = this.f52266a;
        String str = this.f52267b;
        C18429n nVar = pVar.f52320l;
        nVar.f52295c = str;
        nVar.f52293a.set(C18422g.LOADED);
        nVar.f52294b.mo57356n((Object) null);
        for (C18427l b : pVar.f52316h.values()) {
            b.mo23948b();
        }
    }
}
