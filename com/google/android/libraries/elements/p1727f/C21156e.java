package com.google.android.libraries.elements.p1727f;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.p5166b.C66075ai;
import com.google.protos.youtube.elements.p5166b.C66076aj;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.f.e */
/* compiled from: PG */
final class C21156e extends Observer {

    /* renamed from: a */
    final /* synthetic */ C21160i f59342a;

    public C21156e(C21160i iVar) {
        this.f59342a = iVar;
    }

    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        if (transactionRecord == null) {
            return Status.f186906d;
        }
        Snapshot endState = transactionRecord.endState();
        if (endState == null) {
            return Status.f186906d;
        }
        C21160i iVar = this.f59342a;
        C66075ai f = C21160i.m39731f(endState, transactionRecord.keys());
        f.copyOnWrite();
        C66076aj ajVar = (C66076aj) f.instance;
        C66076aj ajVar2 = C66076aj.f179680e;
        ajVar.f179682a |= 2;
        ajVar.f179684c = true;
        C63042fg d = C21168q.m39750d();
        f.copyOnWrite();
        C66076aj ajVar3 = (C66076aj) f.instance;
        d.getClass();
        ajVar3.f179685d = d;
        ajVar3.f179682a |= 4;
        iVar.mo26181g((C66076aj) f.build());
        return Status.f186902OK;
    }
}
