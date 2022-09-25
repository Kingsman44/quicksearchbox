package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.b.c */
/* compiled from: PG */
public final /* synthetic */ class C129017c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C129019e f354463a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f354464b;

    /* renamed from: c */
    public final /* synthetic */ int f354465c;

    public /* synthetic */ C129017c(C129019e eVar, C58485gu guVar, int i) {
        this.f354463a = eVar;
        this.f354464b = guVar;
        this.f354465c = i;
    }

    public final C60870cx apply(Object obj) {
        C129019e eVar = this.f354463a;
        C58485gu guVar = this.f354464b;
        int i = this.f354465c;
        return ((Boolean) obj).booleanValue() ? C60856cj.m92900i(Optional.m71637of((C129023i) ((C69464a) ((Map.Entry) guVar.get(i)).getValue()).mo17428b())) : eVar.mo108806a(guVar, i + 1);
    }
}
