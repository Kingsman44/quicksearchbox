package com.google.android.apps.search.googleapp.search.srp.p10431a;

import android.net.Uri;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.a.b */
/* compiled from: PG */
public final /* synthetic */ class C137694b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137696d f374519a;

    /* renamed from: b */
    public final /* synthetic */ Uri f374520b;

    public /* synthetic */ C137694b(C137696d dVar, Uri uri) {
        this.f374519a = dVar;
        this.f374520b = uri;
    }

    public final Object apply(Object obj) {
        C137696d dVar = this.f374519a;
        Uri uri = this.f374520b;
        C137697e eVar = (C137697e) obj;
        try {
            String a = eVar.f374529a.mo117450a(dVar.f374523b, uri.getQueryParameter("ai"));
            return uri.buildUpon().appendQueryParameter(eVar.f374529a.f387150a.mo117449e(), a).build();
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C137696d.f374522a.mo56226d()).mo56382g(e)).mo56372aa(41035)).mo56386p("Error adding gestures to uri click");
            return uri;
        }
    }
}
