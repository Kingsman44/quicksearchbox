package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f;

import com.google.common.p4522b.C58495hd;
import java.util.Map;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.f.a */
/* compiled from: PG */
final class C128032a extends C128041j {

    /* renamed from: a */
    public byte f352312a;

    /* renamed from: c */
    private C58495hd f352313c;

    /* renamed from: d */
    private Duration f352314d;

    /* renamed from: a */
    public final C128042k mo108307a() {
        C58495hd hdVar;
        Duration duration;
        if (this.f352312a == 1 && (hdVar = this.f352313c) != null && (duration = this.f352314d) != null) {
            return new C128033b(hdVar, duration);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f352312a == 0) {
            sb.append(" sensorDelayType");
        }
        if (this.f352313c == null) {
            sb.append(" sensorsWithEventsCount");
        }
        if (this.f352314d == null) {
            sb.append(" sensorCollectionTimeout");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo108308b(Duration duration) {
        if (duration != null) {
            this.f352314d = duration;
            return;
        }
        throw new NullPointerException("Null sensorCollectionTimeout");
    }

    /* renamed from: c */
    public final void mo108309c(Map map) {
        this.f352313c = C58495hd.m89898l(map);
    }
}
