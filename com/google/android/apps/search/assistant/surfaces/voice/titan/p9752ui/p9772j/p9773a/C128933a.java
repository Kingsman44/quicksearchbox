package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9772j.p9773a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9772j.C128932a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.j.a.a */
/* compiled from: PG */
public final class C128933a implements C128932a {

    /* renamed from: a */
    private static final C59071e f354302a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.titan.ui.j.a.a");

    public C128933a() {
        Optional.empty();
    }

    /* renamed from: d */
    private final synchronized void m210452d() {
        Optional.empty();
    }

    /* renamed from: a */
    public final synchronized void mo108758a() {
        ((C59052c) ((C59052c) f354302a.mo56226d()).mo56372aa(38061)).mo56386p("No need to log voice plate UI visibility but it was requested!");
    }

    /* renamed from: b */
    public final synchronized void mo108759b() {
        ((C59052c) ((C59052c) f354302a.mo56224b()).mo56372aa(38062)).mo56386p("No need to log UI visibility for full voice plate. Could be because soft voice plate visibility event has already been logged");
        m210452d();
    }

    /* renamed from: c */
    public final synchronized void mo108760c() {
        ((C59052c) ((C59052c) f354302a.mo56224b()).mo56372aa(38063)).mo56386p("No need to log UI visibility for soft voice plate. Could be because full voice plate visibility event has already been logged");
        m210452d();
    }
}
