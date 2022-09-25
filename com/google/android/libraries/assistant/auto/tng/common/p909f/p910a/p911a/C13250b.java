package com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C13250b implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C13250b f40910a = new C13250b();

    private /* synthetic */ C13250b() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        HashMap hashMap = new HashMap();
        if (cursor == null) {
            C59104x d = C13254f.f40921a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RedialRetriever");
            ((C59052c) ((C59052c) d).mo56372aa(44719)).mo56386p("phone lookup cursor is null");
        } else if (cursor.moveToFirst()) {
            String c = C13254f.m29511c(cursor, "_id");
            String c2 = C13254f.m29511c(cursor, "display_name");
            hashMap.put("_id", c);
            hashMap.put("display_name", c2);
            int columnIndex = cursor.getColumnIndex("photo_thumb_uri");
            String string = columnIndex >= 0 ? cursor.getString(columnIndex) : null;
            if (!TextUtils.isEmpty(string)) {
                hashMap.put("photo_thumb_uri", string);
            }
            C58976aa aaVar = C58975e.f156826a;
        }
        return hashMap;
    }
}
