package com.google.android.libraries.assistant.p1528m.p1529a;

/* renamed from: com.google.android.libraries.assistant.m.a.b */
/* compiled from: PG */
public final /* synthetic */ class C18417b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18431p f52264a;

    /* renamed from: b */
    public final /* synthetic */ String f52265b;

    public /* synthetic */ C18417b(C18431p pVar, String str) {
        this.f52264a = pVar;
        this.f52265b = str;
    }

    public final void run() {
        C18431p pVar = this.f52264a;
        String str = this.f52265b;
        C18427l lVar = (C18427l) pVar.f52316h.get(str);
        if (lVar != null) {
            pVar.f52316h.remove(str);
            C18422g gVar = C18422g.NO_CONTENT;
            int i = lVar.f52291e;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0 || i2 == 1) {
                lVar.f52291e = 3;
                lVar.f52289c.mo57356n((Object) null);
                lVar.f52290d.f52311c.removeCallbacksAndMessages(lVar);
            }
        }
    }
}
