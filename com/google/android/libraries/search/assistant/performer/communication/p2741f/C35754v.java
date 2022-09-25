package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.database.Cursor;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.HashSet;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.v */
/* compiled from: PG */
public final /* synthetic */ class C35754v implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C35754v f93682a = new C35754v();

    private /* synthetic */ C35754v() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        HashSet hashSet = new HashSet();
        try {
            int columnIndex = cursor.getColumnIndex("data1");
            int columnIndex2 = cursor.getColumnIndex("data4");
            int columnIndex3 = cursor.getColumnIndex("data2");
            int columnIndex4 = cursor.getColumnIndex("data3");
            int columnIndex5 = cursor.getColumnIndex("is_primary");
            while (cursor.moveToNext()) {
                String string = cursor.getString(columnIndex);
                if (string != null) {
                    String string2 = cursor.getString(columnIndex2);
                    if (string2 != null) {
                        string = string2;
                    }
                    if (!hashSet.contains(string)) {
                        hashSet.add(string);
                        Integer valueOf = cursor.isNull(columnIndex3) ? null : Integer.valueOf(cursor.getInt(columnIndex3));
                        String string3 = cursor.getString(columnIndex4);
                        boolean z = cursor.getInt(columnIndex5) == 1;
                        C35732a aVar = new C35732a();
                        aVar.f93644a = string;
                        aVar.mo39813a(false);
                        aVar.f93645b = Optional.ofNullable(valueOf);
                        aVar.f93646c = Optional.ofNullable(string3);
                        aVar.mo39813a(z);
                        if (aVar.f93648e == 1) {
                            String str = aVar.f93644a;
                            if (str != null) {
                                e.mo55395g(new C35734b(str, aVar.f93645b, aVar.f93646c, aVar.f93647d));
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        if (aVar.f93644a == null) {
                            sb.append(" number");
                        }
                        if (aVar.f93648e == 0) {
                            sb.append(" isPrimary");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    continue;
                }
            }
            cursor.close();
            return e.mo55394f();
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }
}
