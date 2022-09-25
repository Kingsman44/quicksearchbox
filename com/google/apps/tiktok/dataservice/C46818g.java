package com.google.apps.tiktok.dataservice;

import android.content.ContentValues;
import android.net.Uri;

/* renamed from: com.google.apps.tiktok.dataservice.g */
/* compiled from: PG */
public final /* synthetic */ class C46818g implements C46875o {

    /* renamed from: a */
    public final /* synthetic */ Uri f122202a;

    /* renamed from: b */
    public final /* synthetic */ ContentValues f122203b;

    public /* synthetic */ C46818g(Uri uri, ContentValues contentValues) {
        this.f122202a = uri;
        this.f122203b = contentValues;
    }

    /* renamed from: a */
    public final Object mo50824a(C46761ce ceVar) {
        Uri uri = this.f122202a;
        return (Uri) ceVar.mo50774a(uri, new C46737bu(uri, this.f122203b));
    }
}
