package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.database.Cursor;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C35853j implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C35862s f93943a;

    /* renamed from: b */
    public final /* synthetic */ String f93944b;

    public /* synthetic */ C35853j(C35862s sVar, String str) {
        this.f93943a = sVar;
        this.f93944b = str;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C35862s sVar = this.f93943a;
        String str = this.f93944b;
        Cursor cursor = (Cursor) obj;
        if (cursor == null || !cursor.moveToFirst()) {
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51885)).mo56389s("Unable to query setting when modifying setting: %s", sVar.f93955c);
        } else {
            boolean equals = "0".equals(cursor.getString(2));
            sVar.f93959g = equals;
            if (equals) {
                return Boolean.valueOf(str.equals(cursor.getString(0)));
            }
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51886)).mo56386p("Setting not available when modifying setting values.");
        }
        return Boolean.valueOf(sVar.f93959g);
    }
}
