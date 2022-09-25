package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.database.Cursor;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.ak */
/* compiled from: PG */
final class C61874ak {

    /* renamed from: a */
    public static final String[] f167318a = {"sourceid", "account_type", "account_name", "contact_id", "mimetype", "is_primary", "is_super_primary", "display_name", "data1", "data2", "data3", "data1", "data1", "data1"};

    /* renamed from: a */
    public static final void m94538a(String str, int i, C61873aj ajVar, Map map) {
        C61944d dVar = new C61944d(str, i);
        if (map.containsKey(dVar)) {
            ajVar.mo58319a((String) map.get(dVar));
        }
    }

    /* renamed from: b */
    public static final void m94539b(String str, int i, Cursor cursor, Map map, Map map2, Set set) {
        C61872ai aiVar;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            String string = cursor.getString(cursor.getColumnIndex("contact_id"));
            if (cursor.getInt(cursor.getColumnIndex("is_super_primary")) == 1) {
                aiVar = C61872ai.SUPER_PRIMARY;
            } else if (cursor.getInt(cursor.getColumnIndex("is_primary")) == 1) {
                aiVar = C61872ai.PRIMARY;
            } else {
                aiVar = C61872ai.REGULAR;
            }
            C61944d dVar = new C61944d(string, i);
            if (!map.containsKey(dVar) || aiVar.compareTo((C61872ai) map2.get(dVar)) > 0) {
                map.put(dVar, cursor.getString(columnIndex));
                map2.put(dVar, aiVar);
                set.add(string);
            }
        }
    }
}
