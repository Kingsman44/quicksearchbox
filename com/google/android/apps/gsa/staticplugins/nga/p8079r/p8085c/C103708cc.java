package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.cd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.cc */
/* compiled from: PG */
public final class C103708cc implements C103651a {

    /* renamed from: a */
    private final cd f288836a;

    public C103708cc(cd cdVar) {
        this.f288836a = cdVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        this.f288836a.b(bnVar.f219917a == 3 ? (String) bnVar.f219918b : BuildConfig.FLAVOR);
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C62912at atVar = C62912at.f169862a;
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        atVar.getClass();
        ddVar.f220291b = atVar;
        ddVar.f220290a = 2;
        return C60856cj.m92900i((C80275dd) buVar.build());
    }
}
