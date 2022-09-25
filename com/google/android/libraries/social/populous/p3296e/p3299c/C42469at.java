package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.ContactsContract;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.social.populous.e.c.at */
/* compiled from: PG */
public final /* synthetic */ class C42469at implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42472aw f111402a;

    /* renamed from: b */
    public final /* synthetic */ C42549n f111403b;

    public /* synthetic */ C42469at(C42472aw awVar, C42549n nVar) {
        this.f111402a = awVar;
        this.f111403b = nVar;
    }

    public final C60870cx apply(Object obj) {
        C42472aw awVar = this.f111402a;
        C42549n nVar = this.f111403b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60866ct.f164955a;
        }
        Context context = awVar.f111408a;
        C42468as asVar = (C42468as) axVar.mo56107c();
        Executor executor = awVar.f111409b;
        ContentResolver contentResolver = context.getContentResolver();
        String str = nVar.f111605b;
        int b = nVar.f111609f.mo45105b();
        String[] strArr = C42467ar.f111395a;
        return C42451ab.m74843a(contentResolver, executor, ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI.buildUpon().appendPath(str).appendQueryParameter("directory", String.valueOf(asVar.f111397b)).appendQueryParameter("limit", String.valueOf(b)).appendQueryParameter("name_for_primary_account", asVar.f111399d).appendQueryParameter("type_for_primary_account", asVar.f111400e).build(), C42467ar.f111395a).mo57272e(C42466aq.f111394a, executor).mo57275g();
    }
}
