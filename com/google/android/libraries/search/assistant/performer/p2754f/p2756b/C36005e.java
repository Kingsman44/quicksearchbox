package com.google.android.libraries.search.assistant.performer.p2754f.p2756b;

import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.performer.f.b.e */
/* compiled from: PG */
public final /* synthetic */ class C36005e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36009i f94204a;

    /* renamed from: b */
    public final /* synthetic */ C70862aj f94205b;

    public /* synthetic */ C36005e(C36009i iVar, C70862aj ajVar) {
        this.f94204a = iVar;
        this.f94205b = ajVar;
    }

    public final void run() {
        C36009i iVar = this.f94204a;
        iVar.f94213b.add(this.f94205b);
        ((C59052c) ((C59052c) C36009i.f94212a.mo56224b()).mo56372aa(52079)).mo56387q("Added a connection, size(%d)", iVar.f94213b.size());
    }
}
