package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.storage.protostore.bo */
/* compiled from: PG */
public final /* synthetic */ class C42919bo implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42929by f112277a;

    /* renamed from: b */
    public final /* synthetic */ Uri f112278b;

    /* renamed from: c */
    public final /* synthetic */ MappedCounterCacheVersion f112279c;

    public /* synthetic */ C42919bo(C42929by byVar, Uri uri, MappedCounterCacheVersion mappedCounterCacheVersion) {
        this.f112277a = byVar;
        this.f112278b = uri;
        this.f112279c = mappedCounterCacheVersion;
    }

    public final C60870cx apply(Object obj) {
        Void voidR = (Void) obj;
        return C60856cj.m92900i(this.f112277a.mo46000i(this.f112278b, this.f112279c));
    }
}
