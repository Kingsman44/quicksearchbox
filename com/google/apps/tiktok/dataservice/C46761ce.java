package com.google.apps.tiktok.dataservice;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.base.C58881cr;
import java.io.FileNotFoundException;
import java.util.Arrays;

/* renamed from: com.google.apps.tiktok.dataservice.ce */
/* compiled from: PG */
public final class C46761ce {

    /* renamed from: a */
    public final Context f122114a;

    /* renamed from: b */
    private final PackageManager f122115b;

    public C46761ce(Context context, PackageManager packageManager) {
        this.f122114a = context;
        this.f122115b = packageManager;
    }

    /* renamed from: b */
    static String m83304b(String[] strArr, Uri uri, Bundle bundle) {
        return m83305c(strArr, uri, bundle.getString("android:query-arg-sql-selection"), bundle.getString("android:query-arg-sql-sort-order"));
    }

    /* renamed from: c */
    static String m83305c(String[] strArr, Uri uri, String str, String str2) {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(Arrays.toString(strArr));
        sb.append(" FROM ");
        sb.append(uri.getAuthority());
        if (str != null) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        if (str2 != null) {
            sb.append(" ORDER BY ");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: e */
    private final ContentProviderClient m83306e(Uri uri) {
        String authority = uri.getAuthority();
        C46733bq bqVar = new C46733bq(this, uri);
        ContentProviderClient contentProviderClient = null;
        try {
            ContentProviderClient contentProviderClient2 = (ContentProviderClient) bqVar.mo6453a();
            e = null;
            contentProviderClient = contentProviderClient2;
        } catch (SecurityException e) {
            e = e;
        }
        if (contentProviderClient != null) {
            return contentProviderClient;
        }
        ProviderInfo resolveContentProvider = this.f122115b.resolveContentProvider(authority, 786944);
        if (resolveContentProvider == null) {
            throw new C46757ca(authority, e);
        }
        throw new C46760cd(resolveContentProvider, e);
    }

    /* renamed from: a */
    public final Object mo50774a(Uri uri, C46759cc ccVar) {
        ContentProviderClient e = m83306e(uri);
        try {
            Object a = ccVar.mo50753a(e);
            e.close();
            return a;
        } catch (OperationApplicationException | RemoteException | FileNotFoundException | RuntimeException e2) {
            throw new C46740bx(e2);
        } catch (Throwable th) {
            e.close();
            throw th;
        }
    }

    /* renamed from: d */
    public final Cursor mo50775d(Uri uri, C46738bv bvVar, C58881cr crVar) {
        ContentProviderClient e = m83306e(uri);
        try {
            Cursor a = bvVar.mo50752a(e);
            if (a != null) {
                return new C46739bw(a, e);
            }
            throw new C46758cb("Null returned from query: " + ((String) crVar.mo6453a()));
        } catch (RemoteException | C46758cb | RuntimeException e2) {
            e.close();
            throw new C46740bx(e2);
        } catch (Error e3) {
            e.close();
            throw e3;
        }
    }
}
