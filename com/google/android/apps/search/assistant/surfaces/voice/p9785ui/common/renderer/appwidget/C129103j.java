package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget;

import android.appwidget.AppWidgetHost;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32482o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.agj;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.j */
/* compiled from: PG */
public final /* synthetic */ class C129103j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129104k f354672a;

    public /* synthetic */ C129103j(C129104k kVar) {
        this.f354672a = kVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C129104k kVar = this.f354672a;
        agj agj = (agj) obj;
        int generateViewId = View.generateViewId();
        Function function = ((C32482o) kVar.f354675b).f87046a;
        Integer valueOf = Integer.valueOf(generateViewId);
        AppWidgetHost appWidgetHost = (AppWidgetHost) function.apply(valueOf);
        appWidgetHost.deleteHost();
        appWidgetHost.stopListening();
        int allocateAppWidgetId = ((AppWidgetHost) ((C32482o) kVar.f354675b).f87046a.apply(valueOf)).allocateAppWidgetId();
        AccountId accountId = kVar.f354674a;
        C129095c cVar = (C129095c) C129096d.f354643e.createBuilder();
        cVar.copyOnWrite();
        C129096d dVar = (C129096d) cVar.instance;
        agj.getClass();
        dVar.f354646b = agj;
        dVar.f354645a |= 1;
        cVar.copyOnWrite();
        C129096d dVar2 = (C129096d) cVar.instance;
        dVar2.f354645a |= 2;
        dVar2.f354647c = allocateAppWidgetId;
        cVar.copyOnWrite();
        C129096d dVar3 = (C129096d) cVar.instance;
        dVar3.f354645a |= 4;
        dVar3.f354648d = generateViewId;
        C129094b bVar = new C129094b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, (C129096d) cVar.build());
        C129228e eVar = C129228e.f354973a;
        return C129163d.m210837a(bVar, (String) null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
