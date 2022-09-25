package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.common.base.C58833ax;
import p5488io.grpc.Status;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69977g;

/* renamed from: com.google.android.libraries.elements.d.f.a.d */
/* compiled from: PG */
final class C21080d extends Observer {

    /* renamed from: a */
    final /* synthetic */ String f59088a;

    /* renamed from: b */
    final /* synthetic */ C69977g f59089b;

    public C21080d(C69977g gVar, String str) {
        this.f59089b = gVar;
        this.f59088a = str;
    }

    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        if (transactionRecord == null) {
            return Status.f186906d;
        }
        Snapshot endState = transactionRecord.endState();
        if (endState == null) {
            return Status.f186906d;
        }
        this.f59089b.mo61552b(C58833ax.m90833j(endState.find(this.f59088a)));
        return Status.f186902OK;
    }
}
