package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bg */
/* compiled from: PG */
public final /* synthetic */ class C76925bg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ boolean f212390a;

    /* renamed from: b */
    public final /* synthetic */ boolean f212391b;

    /* renamed from: c */
    public final /* synthetic */ boolean f212392c;

    /* renamed from: d */
    public final /* synthetic */ ContentResolver f212393d;

    public /* synthetic */ C76925bg(boolean z, boolean z2, boolean z3, ContentResolver contentResolver) {
        this.f212390a = z;
        this.f212391b = z2;
        this.f212392c = z3;
        this.f212393d = contentResolver;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        HashMap hashMap;
        String str;
        boolean z = this.f212390a;
        boolean z2 = this.f212391b;
        boolean z3 = this.f212392c;
        ContentResolver contentResolver = this.f212393d;
        HashSet hashSet = new HashSet((C58485gu) obj);
        HashSet hashSet2 = new HashSet();
        Cursor query = contentResolver.query(CallLog.Calls.CONTENT_URI, (String[]) null, (String) null, (String[]) null, "date DESC");
        char c = 0;
        int i = 0;
        while (true) {
            if (!query.moveToNext() || hashSet2.size() >= 30 || i >= 200) {
                query.close();
                hashMap = null;
            } else {
                int i2 = query.getInt(query.getColumnIndex("type"));
                String string = query.getString(query.getColumnIndex("number"));
                if (!TextUtils.isEmpty(string) && hashSet2.add(string) && C76927bi.m123561b(z, z2, z3, i2)) {
                    Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(string));
                    String[] strArr = new String[2];
                    strArr[c] = "display_name";
                    strArr[1] = "_id";
                    String str2 = "display_name";
                    String str3 = string;
                    Object obj2 = "number";
                    Cursor query2 = contentResolver.query(withAppendedPath, strArr, (String) null, (String[]) null, (String) null);
                    HashMap hashMap2 = new HashMap();
                    if (query2.moveToFirst()) {
                        String string2 = query2.getString(query2.getColumnIndex("_id"));
                        str = str2;
                        String string3 = query2.getString(query2.getColumnIndex(str));
                        hashMap2.put("_id", string2);
                        hashMap2.put(str, string3);
                    } else {
                        str = str2;
                    }
                    query2.close();
                    if (hashMap2.containsKey("_id")) {
                        String str4 = (String) hashMap2.get("_id");
                        if (hashSet.contains(Long.valueOf(Long.parseLong(str4)))) {
                            hashMap = new HashMap();
                            hashMap.put("_id", str4);
                            hashMap.put(obj2, str3);
                            hashMap.put("name", (String) hashMap2.get(str));
                            query.close();
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
                c = 0;
            }
        }
        query.close();
        hashMap = null;
        return C76927bi.m123560a(hashMap);
    }
}
