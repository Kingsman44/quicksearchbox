package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.s */
/* compiled from: PG */
public final /* synthetic */ class C105878s implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C105878s f295509a = new C105878s();

    private /* synthetic */ C105878s() {
    }

    public final Object apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        axVar.mo56113h();
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C105881v vVar = (C105881v) axVar.mo56107c();
        List b = C105863d.m176360b(vVar.mo95116a().toLanguageTag(), vVar.mo95117b().toLanguageTag(), vVar.mo95118c().toLanguageTag());
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en a = C105863d.m176359a(b);
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        a.getClass();
        jVar.f133275j = a;
        jVar.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar.build());
    }
}
