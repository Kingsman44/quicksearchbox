package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables;

import android.animation.ValueAnimator;
import java.util.Map;
import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.h */
/* compiled from: PG */
public final class C130322h {

    /* renamed from: a */
    public final Duration f357208a;

    /* renamed from: b */
    public final Map f357209b;

    /* renamed from: c */
    public final Map f357210c;

    /* renamed from: d */
    public final C69626l f357211d;

    /* renamed from: e */
    public C130323i f357212e = C130323i.HIDDEN;

    /* renamed from: f */
    public float f357213f;

    /* renamed from: g */
    public float f357214g;

    /* renamed from: h */
    public ValueAnimator f357215h;

    /* renamed from: i */
    public ValueAnimator f357216i;

    public C130322h(Duration duration, Map map, Map map2, C69626l lVar) {
        C69664n.m101061g(duration, "animationDuration");
        C69664n.m101061g(map, "speedMap");
        C69664n.m101061g(map2, "strokeWidthPxMap");
        this.f357208a = duration;
        this.f357209b = map;
        this.f357210c = map2;
        this.f357211d = lVar;
    }
}
