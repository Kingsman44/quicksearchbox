package com.google.android.apps.search.googleapp.search.p10420k;

import android.os.Bundle;
import androidx.savedstate.C4087c;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.search.k.a */
/* compiled from: PG */
final class C137538a implements C4087c {

    /* renamed from: a */
    final /* synthetic */ C137543b f374083a;

    public C137538a(C137543b bVar) {
        this.f374083a = bVar;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        Bundle bundle = new Bundle();
        ProtoParsers.m95532o(bundle, "search_query", this.f374083a.mo113804a());
        return bundle;
    }
}
