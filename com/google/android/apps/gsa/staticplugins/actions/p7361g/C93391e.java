package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.CalendarContract;
import com.google.android.apps.gsa.shared.p7009b.C89336a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.e */
/* compiled from: PG */
public final class C93391e {

    /* renamed from: a */
    public static final C59071e f260474a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.g.e");

    /* renamed from: d */
    private static final String[] f260475d = {"_id"};

    /* renamed from: b */
    public final C89336a f260476b;

    /* renamed from: c */
    public final ContentResolver f260477c;

    public C93391e(C89336a aVar, ContentResolver contentResolver) {
        this.f260476b = aVar;
        this.f260477c = contentResolver;
    }

    /* renamed from: a */
    public final long mo87654a(String str) {
        str.getClass();
        C59071e eVar = f260474a;
        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(13672)).mo56386p("Calendar was null, so setting calendar to owner.");
        Cursor query = this.f260477c.query(CalendarContract.Calendars.CONTENT_URI, f260475d, "((account_name = ?) AND (account_type = ?) AND (ownerAccount = ?))", new String[]{str, "com.google", str}, (String) null);
        if (query == null) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(13671)).mo56386p("Cursor is null, cannot retrieve calendar id.");
            return -1;
        } else if (!query.moveToFirst()) {
            query.close();
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(13670)).mo56386p("First in cursor is null, cannot retrieve calendar id.");
            return -1;
        } else {
            long j = query.getLong(0);
            query.close();
            return j;
        }
    }
}
