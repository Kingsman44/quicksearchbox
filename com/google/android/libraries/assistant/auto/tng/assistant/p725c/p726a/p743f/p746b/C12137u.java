package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.u */
/* compiled from: PG */
public final /* synthetic */ class C12137u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12142z f38803a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f38804b;

    /* renamed from: c */
    public final /* synthetic */ boolean f38805c;

    public /* synthetic */ C12137u(C12142z zVar, byte[] bArr, boolean z) {
        this.f38803a = zVar;
        this.f38804b = bArr;
        this.f38805c = z;
    }

    public final void run() {
        C12142z zVar = this.f38803a;
        byte[] bArr = this.f38804b;
        boolean z = this.f38805c;
        if (bArr.length > 0) {
            zVar.f38814c.add(bArr);
        }
        if (z) {
            zVar.f38814c.add(C12142z.f38812a);
        }
        zVar.mo20456e();
    }
}
