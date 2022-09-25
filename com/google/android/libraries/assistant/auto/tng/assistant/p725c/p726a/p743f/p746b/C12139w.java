package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.w */
/* compiled from: PG */
public final /* synthetic */ class C12139w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12142z f38807a;

    public /* synthetic */ C12139w(C12142z zVar) {
        this.f38807a = zVar;
    }

    public final void run() {
        C12142z zVar = this.f38807a;
        while (!zVar.f38813b.isEmpty() && !zVar.f38814c.isEmpty()) {
            byte[] bArr = (byte[]) zVar.f38814c.remove();
            if (bArr == C12142z.f38812a) {
                zVar.mo20455d(((Integer) zVar.f38813b.remove()).intValue(), new byte[0], true);
            } else {
                zVar.mo20455d(((Integer) zVar.f38813b.remove()).intValue(), bArr, false);
            }
        }
    }
}
