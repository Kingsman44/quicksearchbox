package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C35861r implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C35862s f93952a;

    public /* synthetic */ C35861r(C35862s sVar) {
        this.f93952a = sVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C35862s sVar = this.f93952a;
        Cursor cursor = (Cursor) obj;
        int i = -1;
        if (cursor == null || !cursor.moveToFirst()) {
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51889)).mo56386p("Unable to query setting when querying range current value.");
        } else {
            boolean equals = "0".equals(cursor.getString(1));
            sVar.f93959g = equals;
            if (equals) {
                String string = cursor.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    i = Integer.parseInt(string);
                }
                return Integer.valueOf(i);
            }
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51890)).mo56386p("Setting not available when querying range current value.");
        }
        sVar.f93959g = false;
        return -1;
    }
}
