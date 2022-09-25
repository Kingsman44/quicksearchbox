package com.google.android.apps.gsa.velvet.util;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.shared.p6925c.C87508a;
import com.google.android.apps.gsa.shared.search.C90494d;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.apps.tiktok.inject.C47266f;

/* compiled from: PG */
public class StateDumpProvider extends C90494d {

    /* renamed from: a */
    public C91022f f331085a;

    /* renamed from: b */
    private boolean f331086b = false;

    /* renamed from: com.google.android.apps.gsa.velvet.util.StateDumpProvider$a */
    /* compiled from: PG */
    public interface C118688a {
        /* renamed from: rd */
        void mo103874rd(StateDumpProvider stateDumpProvider);
    }

    /* renamed from: a */
    private final synchronized void m197027a() {
        if (!this.f331086b) {
            ((C118688a) C47266f.m84076a(getContext(), C118688a.class)).mo103874rd(this);
            this.f331086b = true;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete");
    }

    public final String getType(Uri uri) {
        if ("com.google.android.velvet.util.statedumpprovider".equals(uri.getAuthority())) {
            return "vnd.android.cursor.item/vnd.com.google.android.velvet.util.statedumpprovider";
        }
        throw new IllegalArgumentException(uri.toString());
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C74507e.m120471g(13);
        m197027a();
        if ("com.google.android.velvet.util.statedumpprovider".equals(uri.getAuthority())) {
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("sensitive", true);
            return C87508a.m142042a(this.f331085a, uri.getBooleanQueryParameter("reduced", false), booleanQueryParameter).mo85252a();
        }
        throw new IllegalArgumentException(uri.toString());
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update");
    }
}
