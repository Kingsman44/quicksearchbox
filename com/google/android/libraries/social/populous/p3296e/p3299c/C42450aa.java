package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.social.populous.e.c.aa */
/* compiled from: PG */
final class C42450aa implements C60804al {

    /* renamed from: a */
    final ContentResolver f111356a;

    /* renamed from: b */
    final Executor f111357b;

    /* renamed from: c */
    final Uri f111358c;

    /* renamed from: d */
    final String[] f111359d;

    public C42450aa(ContentResolver contentResolver, Executor executor, Uri uri, String[] strArr) {
        this.f111356a = contentResolver;
        this.f111357b = executor;
        this.f111358c = uri;
        this.f111359d = strArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20085a(C60812at atVar, Object obj) {
        Bundle bundle = new Bundle();
        bundle.putString("android:query-arg-sql-selection", (String) null);
        bundle.putStringArray("android:query-arg-sql-selection-args", (String[]) null);
        bundle.putString("android:query-arg-sql-sort-order", (String) null);
        Cursor query = this.f111356a.query(this.f111358c, this.f111359d, bundle, (CancellationSignal) obj);
        atVar.mo57268a(query, this.f111357b);
        return query;
    }
}
