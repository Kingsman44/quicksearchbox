package com.google.android.libraries.storage.protostore;

import android.content.Context;
import android.os.Handler;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.storage.protostore.i */
/* compiled from: PG */
public final class C43006i implements C42940ch {

    /* renamed from: a */
    public static final TimeUnit f112464a = TimeUnit.SECONDS;

    /* renamed from: b */
    public final Context f112465b;

    /* renamed from: c */
    public final String f112466c;

    /* renamed from: d */
    public final String f112467d = "com.google.android.apps.gsa.nga.permissions.EDIT_PREFERENCES";

    /* renamed from: e */
    public final Handler f112468e;

    /* renamed from: f */
    public final C60888db f112469f;

    public C43006i(Context context, Handler handler, C60888db dbVar) {
        this.f112465b = context;
        this.f112466c = context.getPackageName();
        this.f112468e = handler;
        this.f112469f = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo46013a(C60870cx cxVar, String str) {
        return C60922j.m93045h(cxVar, new C42991e(this, str), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo46014b(C60870cx cxVar, Runnable runnable, String str) {
        return C60922j.m93044g(cxVar, new C43003f(this, runnable, str), C60826bg.f164896a);
    }
}
