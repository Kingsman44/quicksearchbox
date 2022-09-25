package com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C91717a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C91725i f255805a;

    /* renamed from: b */
    public final /* synthetic */ C7718hj f255806b;

    /* renamed from: c */
    public final /* synthetic */ boolean f255807c;

    public /* synthetic */ C91717a(C91725i iVar, C7718hj hjVar, boolean z) {
        this.f255805a = iVar;
        this.f255806b = hjVar;
        this.f255807c = z;
    }

    public final void run() {
        C91725i iVar = this.f255805a;
        C7718hj hjVar = this.f255806b;
        boolean z = this.f255807c;
        Bundle bundle = new Bundle();
        bundle.putParcelable("entry", new ProtoLiteParcelable((MessageLite) hjVar));
        bundle.putBoolean("record-action", z);
        iVar.mo86224k(1, bundle);
    }
}
