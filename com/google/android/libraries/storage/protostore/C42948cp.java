package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.storage.protostore.cp */
/* compiled from: PG */
public final /* synthetic */ class C42948cp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42966db f112347a;

    /* renamed from: b */
    public final /* synthetic */ Uri f112348b;

    /* renamed from: c */
    public final /* synthetic */ C42954cv f112349c;

    public /* synthetic */ C42948cp(C42966db dbVar, C42954cv cvVar, Uri uri) {
        this.f112347a = dbVar;
        this.f112349c = cvVar;
        this.f112348b = uri;
    }

    public final C60870cx apply(Object obj) {
        Void voidR = (Void) obj;
        return C60856cj.m92900i(this.f112347a.mo46028j(this.f112349c, this.f112348b));
    }
}
