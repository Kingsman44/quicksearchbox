package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12114c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.p4449cd.p4456g.C57974a;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.h */
/* compiled from: PG */
public final /* synthetic */ class C12124h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12126j f38755a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f38756b;

    /* renamed from: c */
    public final /* synthetic */ C57974a f38757c;

    public /* synthetic */ C12124h(C12126j jVar, byte[] bArr, C57974a aVar) {
        this.f38755a = jVar;
        this.f38756b = bArr;
        this.f38757c = aVar;
    }

    public final void run() {
        C12126j jVar = this.f38755a;
        byte[] bArr = this.f38756b;
        C57974a aVar = this.f38757c;
        if (!jVar.f38762c.f38768f) {
            jVar.f38760a += bArr.length;
            C12114c cVar = (C12114c) C12115d.f38733c.createBuilder();
            C63088z A = C63088z.m96139A(bArr);
            cVar.copyOnWrite();
            C12115d dVar = (C12115d) cVar.instance;
            dVar.f38735a |= 1;
            dVar.f38736b = A;
            aVar.mo20337c(cVar.build());
        }
    }
}
