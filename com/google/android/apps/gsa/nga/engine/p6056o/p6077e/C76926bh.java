package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.CallLog;
import android.text.TextUtils;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bh */
/* compiled from: PG */
public final /* synthetic */ class C76926bh implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ boolean f212394a;

    /* renamed from: b */
    public final /* synthetic */ boolean f212395b;

    /* renamed from: c */
    public final /* synthetic */ boolean f212396c;

    /* renamed from: d */
    public final /* synthetic */ ContentResolver f212397d;

    public /* synthetic */ C76926bh(boolean z, boolean z2, boolean z3, ContentResolver contentResolver) {
        this.f212394a = z;
        this.f212395b = z2;
        this.f212396c = z3;
        this.f212397d = contentResolver;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        String str;
        String str2;
        boolean z = this.f212394a;
        boolean z2 = this.f212395b;
        boolean z3 = this.f212396c;
        Cursor query = this.f212397d.query(CallLog.Calls.CONTENT_URI, (String[]) null, (String) null, (String[]) null, "date DESC");
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            str = null;
            if (!query.moveToNext() || hashSet.size() >= 30 || i >= 200) {
                str2 = null;
            } else {
                int i2 = query.getInt(query.getColumnIndex("type"));
                str = query.getString(query.getColumnIndex("number"));
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                    if (C76927bi.m123561b(z, z2, z3, i2)) {
                        str2 = query.getString(query.getColumnIndex("name"));
                        break;
                    }
                }
                i++;
            }
        }
        query.close();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("number", str);
        }
        if (str2 != null) {
            hashMap.put("name", str2);
        }
        return C76927bi.m123560a(hashMap);
    }
}
