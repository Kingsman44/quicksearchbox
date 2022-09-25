package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127746g;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.ak */
/* compiled from: PG */
public final /* synthetic */ class C127761ak implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C127763am f351678a;

    /* renamed from: b */
    public final /* synthetic */ Duration f351679b;

    public /* synthetic */ C127761ak(C127763am amVar, Duration duration) {
        this.f351678a = amVar;
        this.f351679b = duration;
    }

    public final Object apply(Object obj) {
        C127763am amVar = this.f351678a;
        Duration duration = this.f351679b;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return C127746g.MODE_NEW_USER_INPUT_PLATE;
        }
        Duration between = Duration.between((Instant) C58557jl.m90131l(guVar), amVar.f351682a.mo57444a());
        if (between.compareTo(duration) <= 0) {
            return C127746g.MODE_UNSPECIFIED;
        }
        between.toMillis();
        duration.toMillis();
        return C127746g.MODE_ACTIVATED_USER_INPUT_PLATE;
    }
}
