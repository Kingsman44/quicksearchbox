package com.google.android.apps.gsa.staticplugins.bisto.p7490h;

import android.content.Context;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.h.b */
/* compiled from: PG */
public final class C95456b {
    /* renamed from: a */
    public static Uri m157878a(Context context, Uri uri) {
        int columnIndex;
        Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
        Uri uri2 = null;
        if (query == null) {
            return null;
        }
        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) >= 0) {
            C58976aa aaVar = C58975e.f156826a;
            Uri parse = Uri.parse(query.getString(columnIndex));
            query.close();
            if (parse != null) {
                uri2 = m157882e(parse) ? m157879b(context, parse) : parse;
            }
        }
        query.close();
        return uri2;
    }

    /* renamed from: b */
    public static Uri m157879b(Context context, Uri uri) {
        int columnIndex;
        Cursor query = context.getContentResolver().query(uri, new String[]{"value"}, (String) null, (String[]) null, (String) null);
        Uri uri2 = null;
        if (query == null) {
            return null;
        }
        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("value")) >= 0) {
            C58976aa aaVar = C58975e.f156826a;
            Uri parse = Uri.parse(query.getString(columnIndex));
            query.close();
            if (parse != null) {
                uri2 = m157880c(parse) ? m157878a(context, parse) : parse;
            }
        }
        query.close();
        return uri2;
    }

    /* renamed from: c */
    public static boolean m157880c(Uri uri) {
        return uri.toString().startsWith("content://media/");
    }

    /* renamed from: d */
    public static boolean m157881d(Uri uri) {
        return m157882e(uri) || m157880c(uri) || RingtoneManager.isDefault(uri);
    }

    /* renamed from: e */
    public static boolean m157882e(Uri uri) {
        String authority = uri.getAuthority();
        return authority != null && authority.equals("settings");
    }
}
