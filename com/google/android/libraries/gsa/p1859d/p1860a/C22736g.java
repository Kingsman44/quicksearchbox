package com.google.android.libraries.gsa.p1859d.p1860a;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.p445a.C8850c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.d.a.g */
/* compiled from: PG */
public final class C22736g extends C22741l {

    /* renamed from: a */
    final /* synthetic */ boolean f62557a;

    /* renamed from: b */
    final /* synthetic */ long f62558b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22736g(SettableFuture settableFuture, boolean z, long j) {
        super(settableFuture);
        this.f62557a = z;
        this.f62558b = j;
    }

    /* renamed from: a */
    public final void mo27887a(C22730a aVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_partner_contents_visibility", this.f62557a);
        bundle.putLong("key_partner_contents_visibility_timestamp", this.f62558b);
        Parcel gA = aVar.mo17260gA();
        C8850c.m23497f(gA, bundle);
        aVar.mo17263hf(3, gA);
        Log.d("PomoConnector", "Sending partner contents visibility change notification to provider app.");
    }
}
