package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.HashMap;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C35857n implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ Set f93948a;

    public /* synthetic */ C35857n(Set set) {
        this.f93948a = set;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Set set = this.f93948a;
        Cursor cursor = (Cursor) obj;
        C59071e eVar = C35862s.f93953a;
        if (cursor == null || cursor.getCount() == 0) {
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51882)).mo56386p("Null cursor on querying signals.");
            return Optional.empty();
        }
        HashMap hashMap = new HashMap();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            String string2 = cursor.getString(1);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && set.contains(string)) {
                hashMap.put(string, string2);
            }
        }
        return Optional.ofNullable(hashMap);
    }
}
