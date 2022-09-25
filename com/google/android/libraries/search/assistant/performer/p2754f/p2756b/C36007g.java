package com.google.android.libraries.search.assistant.performer.p2754f.p2756b;

import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.performer.f.b.g */
/* compiled from: PG */
public final /* synthetic */ class C36007g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36009i f94208a;

    /* renamed from: b */
    public final /* synthetic */ C70862aj f94209b;

    public /* synthetic */ C36007g(C36009i iVar, C70862aj ajVar) {
        this.f94208a = iVar;
        this.f94209b = ajVar;
    }

    public final void run() {
        C36009i iVar = this.f94208a;
        iVar.f94213b.remove(this.f94209b);
        ((C59052c) ((C59052c) C36009i.f94212a.mo56224b()).mo56372aa(52080)).mo56387q("Removed a connection, size(%d)", iVar.f94213b.size());
    }
}
