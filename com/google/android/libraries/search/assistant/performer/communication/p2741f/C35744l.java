package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.database.Cursor;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.l */
/* compiled from: PG */
public final /* synthetic */ class C35744l implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C35744l f93671a = new C35744l();

    private /* synthetic */ C35744l() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Optional optional;
        Cursor cursor = (Cursor) obj;
        C35738f fVar = C35738f.f93665a;
        if (cursor == null) {
            optional = Optional.empty();
        } else {
            try {
                if (cursor.moveToFirst()) {
                    int columnIndex = cursor.getColumnIndex("starred");
                    if (cursor.isNull(columnIndex)) {
                        optional = Optional.empty();
                    } else {
                        optional = Optional.ofNullable(fVar.apply(cursor, Integer.valueOf(columnIndex)));
                    }
                } else {
                    cursor.close();
                    optional = Optional.empty();
                }
            } finally {
                cursor.close();
            }
        }
        return optional.map(C35749q.f93676a);
    }
}
