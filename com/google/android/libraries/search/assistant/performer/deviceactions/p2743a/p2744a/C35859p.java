package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C35859p implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C35862s f93950a;

    public /* synthetic */ C35859p(C35862s sVar) {
        this.f93950a = sVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C35862s sVar = this.f93950a;
        Cursor cursor = (Cursor) obj;
        if (cursor == null || !cursor.moveToFirst()) {
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51879)).mo56389s("Unable to query setting value: %s.", sVar.f93955c);
        } else {
            boolean z = true;
            String string = cursor.getString(1);
            if (TextUtils.isEmpty(string) || !string.equals("0")) {
                z = false;
            }
            sVar.f93959g = z;
            if (z) {
                return Optional.ofNullable(cursor.getString(0));
            }
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51880)).mo56389s("Setting %s not available when querying setting values", sVar.f93955c);
        }
        sVar.f93959g = false;
        return Optional.m71637of(Boolean.toString(false));
    }
}
