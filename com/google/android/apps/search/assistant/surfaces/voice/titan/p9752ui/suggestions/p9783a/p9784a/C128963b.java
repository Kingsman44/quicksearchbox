package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.p9783a.p9784a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128831f;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128837l;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9761e.C128849a;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.a.a.b */
/* compiled from: PG */
public final class C128963b implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C128964c f354355a;

    public C128963b(C128964c cVar) {
        this.f354355a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C46691ai mo20330a() {
        return C128849a.f354156e;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        Duration duration;
        C128831f j = this.f354355a.f354356a.mo108673j();
        if (j instanceof C128837l) {
            duration = ((C128837l) j).f354127b;
        } else {
            duration = Duration.ZERO;
            C69664n.m101060f(duration, "ZERO");
        }
        return C60856cj.m92900i(duration);
    }
}
