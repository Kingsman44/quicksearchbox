package com.google.android.libraries.search.assistant.performer.communication.p2734b;

import android.database.Cursor;
import com.google.android.libraries.search.assistant.performer.communication.C35514ag;
import com.google.android.libraries.search.assistant.performer.communication.C35515ah;
import com.google.android.libraries.search.assistant.performer.communication.C35598d;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.b.e */
/* compiled from: PG */
public final /* synthetic */ class C35539e implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C35539e f93328a = new C35539e();

    private /* synthetic */ C35539e() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        Optional empty = Optional.empty();
        if (!cursor.moveToFirst()) {
            return empty;
        }
        String d = C35540f.m63891d(cursor, "_id");
        String d2 = C35540f.m63891d(cursor, "display_name");
        if (d == null || d2 == null) {
            return empty;
        }
        C35514ag d3 = C35515ah.m63872d();
        C35598d dVar = (C35598d) d3;
        dVar.f93432a = d;
        dVar.f93433b = d2;
        return Optional.m71637of(d3.mo39685a());
    }
}
