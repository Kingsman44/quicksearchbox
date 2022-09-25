package com.google.apps.tiktok.dataservice;

import android.content.ContentValues;
import android.net.Uri;

/* renamed from: com.google.apps.tiktok.dataservice.i */
/* compiled from: PG */
public final /* synthetic */ class C46820i implements C46875o {

    /* renamed from: a */
    public final /* synthetic */ Uri f122207a;

    /* renamed from: b */
    public final /* synthetic */ ContentValues f122208b;

    public /* synthetic */ C46820i(Uri uri, ContentValues contentValues) {
        this.f122207a = uri;
        this.f122208b = contentValues;
    }

    /* renamed from: a */
    public final Object mo50824a(C46761ce ceVar) {
        Uri uri = this.f122207a;
        return Integer.valueOf(((Integer) ceVar.mo50774a(uri, new C46731bo(uri, this.f122208b))).intValue());
    }
}
