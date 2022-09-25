package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10081a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47267g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.d */
/* compiled from: PG */
public final class C132578d implements C47267g {

    /* renamed from: a */
    private static final C59071e f361807a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.d");

    /* renamed from: b */
    private final C132576b f361808b;

    public C132578d(C132576b bVar) {
        ((C59052c) ((C59052c) f361807a.mo56224b()).mo56372aa(39758)).mo56386p("#WeatherWidgetStartupAfterPackageReplacedListener()");
        this.f361808b = bVar;
    }

    /* renamed from: e */
    public final void mo35389e() {
        C59071e eVar = f361807a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39759)).mo56386p("#onStartupAfterPackageReplaced()");
        if (!this.f361808b.f361802b.booleanValue()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39760)).mo56386p("#onStartupAfterPackageReplaced() is disabled by mendel flag.");
            return;
        }
        C46459k.m82829b(this.f361808b.mo110822a(), "%s: update failed", getClass().getSimpleName());
    }
}
