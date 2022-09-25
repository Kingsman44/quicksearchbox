package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.gsa.store.C118311b;
import com.google.android.apps.gsa.store.C118313d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.ax */
/* compiled from: PG */
final class C100145ax {

    /* renamed from: a */
    public static final C59071e f280032a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.du.b.ax");

    /* renamed from: a */
    public static boolean m165970a(SQLiteDatabase sQLiteDatabase, long j, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C118311b bVar = (C118311b) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("attribute_id", Integer.valueOf(bVar.f328396a.f328381a));
            Boolean bool = bVar.f328400e;
            String str = bVar.f328397b;
            Long l = bVar.f328398c;
            Double d = bVar.f328399d;
            if (bool != null) {
                contentValues.put("boolean_attribute_value", Long.valueOf(C100164bp.m165988a(bool.booleanValue())));
            } else if (str != null) {
                contentValues.put("text_attribute_value", str);
            } else if (l != null) {
                contentValues.put("long_attribute_value", l);
            } else if (d != null) {
                contentValues.put("real_attribute_value", d);
            } else {
                throw new IllegalStateException("AttributeValue has no non-null value");
            }
            contentValues.put("blob_id", Long.valueOf(j));
            try {
                if (sQLiteDatabase.insertWithOnConflict("attribute_table", (String) null, contentValues, 5) == -1) {
                    return false;
                }
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f280032a.mo56225c()).mo56382g(e)).mo56372aa(33217)).mo56386p("Error during insert");
                throw new C118313d("Error during insert", e);
            }
        }
        return true;
    }
}
