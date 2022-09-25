package com.google.android.apps.gsa.search.core.google;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.gsa.contentprovider.a;
import com.google.android.apps.gsa.shared.p7008az.C89334c;
import com.google.android.apps.gsa.shared.search.C90494d;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.search.core.google.ad */
/* compiled from: PG */
public class C85845ad extends C90494d {

    /* renamed from: a */
    public a f232117a;

    /* renamed from: b */
    public C89334c f232118b;

    /* renamed from: c */
    private boolean f232119c;

    /* renamed from: com.google.android.apps.gsa.search.core.google.ad$a */
    /* compiled from: PG */
    public interface C85846a {
        /* renamed from: pZ */
        void mo79484pZ(C85845ad adVar);
    }

    /* renamed from: b */
    private final synchronized void m137931b() {
        if (!this.f232119c) {
            ((C85846a) C47266f.m84076a(getContext(), C85846a.class)).mo79484pZ(this);
            this.f232119c = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Uri mo79478a(Uri uri) {
        return this.f232118b.mo83282a("google_suggestion", "com.google.android.googlequicksearchbox.google").mo83278a(uri);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        m137931b();
        return this.f232117a.e(mo79478a(uri));
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m137931b();
        return this.f232117a.g(mo79478a(uri), strArr, str, strArr2, str2);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
