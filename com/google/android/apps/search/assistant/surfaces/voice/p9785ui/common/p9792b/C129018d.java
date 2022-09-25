package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b;

import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.b.d */
/* compiled from: PG */
public final class C129018d implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C129021g f354466a;

    /* renamed from: b */
    final /* synthetic */ C129019e f354467b;

    public C129018d(C129019e eVar, C129021g gVar) {
        this.f354467b = eVar;
        this.f354466a = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C46691ai mo20330a() {
        C129021g gVar = this.f354466a;
        C129021g gVar2 = C129021g.POSITION_UNDEFINED;
        int ordinal = gVar.ordinal();
        if (ordinal == 1) {
            return new C46885y("UiComponentDataService.POSITION_ABOVE_HEADER");
        }
        if (ordinal == 2) {
            return new C46885y("UiComponentDataService.POSITION_BELOW_HEADER");
        }
        if (ordinal != 3) {
            return new C46885y("UiComponentDataService.POSITION_UNDEFINED");
        }
        return new C46885y("UiComponentDataService.POSITION_BELOW_BOTTOM");
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C129019e eVar = this.f354467b;
        C129021g gVar = this.f354466a;
        C58480gp e = C58485gu.m89837e();
        for (Map.Entry entry : eVar.f354468a.entrySet()) {
            if (((C129020f) entry.getKey()).mo108184a().equals(gVar)) {
                e.mo55395g(entry);
            }
        }
        C58485gu F = C58485gu.m89836F(Comparator.CC.comparingInt(C129016b.f354462a), e.mo55394f());
        eVar.f354468a.size();
        int i = ((C58724pq) F).f156474d;
        return eVar.mo108806a(F, 0);
    }
}
