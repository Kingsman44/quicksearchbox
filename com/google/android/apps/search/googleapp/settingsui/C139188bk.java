package com.google.android.apps.search.googleapp.settingsui;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p5462h.p5463a.C69498ao;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bk */
/* compiled from: PG */
final class C139188bk implements C46464p {

    /* renamed from: a */
    final /* synthetic */ C139189bl f378543a;

    public C139188bk(C139189bl blVar) {
        this.f378543a = blVar;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        C139194bq bqVar = this.f378543a.f378545b;
        Map map = bqVar.f378564b;
        if (map != null) {
            return new C46463o(new C60817ay(C60856cj.m92900i((Set) Map.EL.getOrDefault(map, bqVar.f378563a, C69498ao.f185920a))));
        }
        throw new IllegalStateException("Required value was null.");
    }
}
