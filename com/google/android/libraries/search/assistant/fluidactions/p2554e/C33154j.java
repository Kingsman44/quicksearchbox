package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import android.database.Cursor;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.C52620ym;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52626ys;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.j */
/* compiled from: PG */
public final /* synthetic */ class C33154j implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C33154j f88697a = new C33154j();

    private /* synthetic */ C33154j() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        Optional empty = Optional.empty();
        if (cursor == null || !cursor.moveToNext()) {
            return empty;
        }
        long j = cursor.getLong(0);
        String string = cursor.getString(2);
        if (string == null) {
            string = BuildConfig.FLAVOR;
        }
        C52622yo yoVar = (C52622yo) C52623yp.f138162g.createBuilder();
        C52620ym ymVar = (C52620ym) C52621yn.f138154g.createBuilder();
        ymVar.copyOnWrite();
        C52621yn ynVar = (C52621yn) ymVar.instance;
        ynVar.f138156a = 2 | ynVar.f138156a;
        ynVar.f138158c = string;
        yoVar.mo53892e(ymVar);
        C52626ys ysVar = (C52626ys) C52627yt.f138176c.createBuilder();
        ysVar.mo53900b(j);
        yoVar.copyOnWrite();
        C52623yp ypVar = (C52623yp) yoVar.instance;
        C52627yt ytVar = (C52627yt) ysVar.build();
        ytVar.getClass();
        ypVar.f138165b = ytVar;
        ypVar.f138164a |= 1;
        return Optional.m71637of((C52623yp) yoVar.build());
    }
}
