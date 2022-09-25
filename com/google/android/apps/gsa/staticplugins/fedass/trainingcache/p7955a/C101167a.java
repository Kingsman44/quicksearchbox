package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7955a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5228m.C67292aw;
import com.google.speech.p5228m.C67293ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.a.a */
/* compiled from: PG */
public final /* synthetic */ class C101167a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101173g f282416a;

    /* renamed from: b */
    public final /* synthetic */ e f282417b;

    public /* synthetic */ C101167a(C101173g gVar, e eVar) {
        this.f282416a = gVar;
        this.f282417b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C101173g gVar = this.f282416a;
        e eVar = this.f282417b;
        if (!((Boolean) obj).booleanValue()) {
            return C118826c.f331423b;
        }
        C67292aw awVar = (C67292aw) C67293ax.f182915c.createBuilder();
        int i = eVar.ca;
        awVar.copyOnWrite();
        C67293ax axVar = (C67293ax) awVar.instance;
        axVar.f182917a |= 1;
        axVar.f182918b = i;
        return C60922j.m93044g(((C84235h) gVar.f282425b.mo27525b()).mo77721k(1013, ((C67293ax) awVar.build()).toByteArray()), C101172f.f282423a, C60826bg.f164896a);
    }
}
