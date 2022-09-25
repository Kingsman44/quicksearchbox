package com.google.apps.tiktok.dataservice;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: com.google.apps.tiktok.dataservice.h */
/* compiled from: PG */
public final /* synthetic */ class C46819h implements C46875o {

    /* renamed from: a */
    public final /* synthetic */ Uri f122204a;

    /* renamed from: b */
    public final /* synthetic */ String f122205b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f122206c;

    public /* synthetic */ C46819h(Uri uri, String str, Bundle bundle) {
        this.f122204a = uri;
        this.f122205b = str;
        this.f122206c = bundle;
    }

    /* renamed from: a */
    public final Object mo50824a(C46761ce ceVar) {
        return (Bundle) ceVar.mo50774a(this.f122204a, new C46734br(this.f122205b, this.f122206c));
    }
}
