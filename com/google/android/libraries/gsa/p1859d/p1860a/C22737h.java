package com.google.android.libraries.gsa.p1859d.p1860a;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.p445a.C8850c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.d.a.h */
/* compiled from: PG */
public final class C22737h extends C22741l {

    /* renamed from: a */
    final /* synthetic */ int f62559a;

    /* renamed from: b */
    final /* synthetic */ boolean f62560b;

    /* renamed from: c */
    final /* synthetic */ long f62561c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22737h(SettableFuture settableFuture, int i, boolean z, long j) {
        super(settableFuture);
        this.f62559a = i;
        this.f62560b = z;
        this.f62561c = j;
    }

    /* renamed from: a */
    public final void mo27887a(C22730a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_child_index", this.f62559a);
        bundle.putBoolean("key_single_content_visibility", this.f62560b);
        bundle.putLong("key_single_content_visibility_timestamp", this.f62561c);
        Parcel gA = aVar.mo17260gA();
        C8850c.m23497f(gA, bundle);
        aVar.mo17263hf(4, gA);
        Log.d("PomoConnector", "Sending single content visibility change notification to provider app.");
    }
}
