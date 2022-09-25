package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C35850g implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C35862s f93940a;

    public /* synthetic */ C35850g(C35862s sVar) {
        this.f93940a = sVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C35862s sVar = this.f93940a;
        Cursor cursor = (Cursor) obj;
        boolean z = false;
        if (cursor == null || !cursor.moveToFirst()) {
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51876)).mo56389s("Unable to query dependent setting id for setting %s", sVar.f93955c);
            sVar.f93959g = false;
            return Optional.empty();
        }
        String string = cursor.getString(1);
        if (!TextUtils.isEmpty(string) && string.equals("0")) {
            z = true;
        }
        sVar.f93959g = z;
        return Optional.ofNullable(cursor.getString(cursor.getColumnIndex("dependent_setting")));
    }
}
