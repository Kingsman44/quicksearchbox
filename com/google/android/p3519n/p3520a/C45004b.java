package com.google.android.p3519n.p3520a;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* renamed from: com.google.android.n.a.b */
/* compiled from: PG */
public abstract class C45004b extends ContentProvider {

    /* renamed from: a */
    private String f117605a;

    /* renamed from: b */
    private UriMatcher f117606b;

    /* renamed from: a */
    public abstract Cursor mo48669a();

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f117605a = providerInfo.authority;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f117606b = uriMatcher;
        uriMatcher.addURI(this.f117605a, "settings/indexables_xml_res", 1);
        this.f117606b.addURI(this.f117605a, "settings/indexables_raw", 2);
        this.f117606b.addURI(this.f117605a, "settings/non_indexables_key", 3);
        this.f117606b.addURI(this.f117605a, "settings/site_map_pairs", 4);
        this.f117606b.addURI(this.f117605a, "settings/slice_uri_pairs", 5);
        this.f117606b.addURI(this.f117605a, "settings/dynamic_indexables_raw", 6);
        if (!providerInfo.exported) {
            throw new SecurityException("Provider must be exported");
        } else if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grantUriPermissions");
        } else if ("android.permission.READ_SEARCH_INDEXABLES".equals(providerInfo.readPermission)) {
            super.attachInfo(context, providerInfo);
        } else {
            throw new SecurityException("Provider must be protected by READ_SEARCH_INDEXABLES");
        }
    }

    /* renamed from: b */
    public abstract Cursor mo48671b();

    /* renamed from: c */
    public abstract Cursor mo48672c();

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete not supported");
    }

    public final String getType(Uri uri) {
        int match = this.f117606b.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/indexables_xml_res";
        }
        if (match == 2) {
            return "vnd.android.cursor.dir/indexables_raw";
        }
        if (match == 3) {
            return "vnd.android.cursor.dir/non_indexables_key";
        }
        if (match == 6) {
            return "vnd.android.cursor.dir/indexables_raw";
        }
        throw new IllegalArgumentException("Unknown URI ".concat(String.valueOf(String.valueOf(uri))));
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            switch (this.f117606b.match(uri)) {
                case 1:
                    return mo48672c();
                case 2:
                    return mo48671b();
                case 3:
                    return mo48669a();
                case 4:
                case 5:
                case 6:
                    return null;
                default:
                    String valueOf = String.valueOf(uri);
                    throw new UnsupportedOperationException("Unknown Uri " + valueOf);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (Exception e2) {
            Log.e("IndexablesProvider", "Provider querying exception:", e2);
            return null;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not supported");
    }
}
