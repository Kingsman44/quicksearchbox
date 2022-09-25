package com.google.android.libraries.mdi.download.p2248h;

import android.content.Context;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2246f.C29404a;
import com.google.android.libraries.mdi.download.p2248h.p2253c.C29606b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.h.aw */
/* compiled from: PG */
public final class C29513aw {

    /* renamed from: a */
    public Context f79971a;

    /* renamed from: b */
    public C58881cr f79972b;

    /* renamed from: c */
    public C58881cr f79973c;

    /* renamed from: d */
    public C42813k f79974d;

    /* renamed from: e */
    public Executor f79975e;

    /* renamed from: f */
    public C42880af f79976f;

    /* renamed from: g */
    public C58833ax f79977g = C58836b.f156633a;

    /* renamed from: h */
    public final C28787cb f79978h = new C29512av();

    /* renamed from: i */
    public C29606b f79979i;

    /* renamed from: j */
    public C29404a f79980j;

    /* renamed from: a */
    public final C29514ax mo34752a() {
        C58838bb.m90866a(this.f79971a, "Must call setContext() before build().");
        C58838bb.m90866a(this.f79972b, "Must call setManifestFileFlagSupplier() before build().");
        C58838bb.m90866a(this.f79973c, "Must call setFileDownloader() before build().");
        C58838bb.m90866a(this.f79979i, "Must call setManifestConfigParser() before build().");
        C58838bb.m90866a(this.f79974d, "Must call setFileStorage() before build().");
        C58838bb.m90866a(this.f79975e, "Must call setBackgroundExecutor() before build().");
        C58838bb.m90866a(this.f79976f, "Must call setProtoDataStoreFactory() or setMetadataStore() before build().");
        C58838bb.m90866a(this.f79980j, "Must call setLogger() before build().");
        return new C29514ax(this);
    }
}
