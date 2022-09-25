package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9778l;

import com.google.common.p4526f.C59071e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.l.b */
/* compiled from: PG */
public final class C128948b {

    /* renamed from: a */
    public static final C59071e f354328a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f354329b;

    /* renamed from: c */
    public final Duration f354330c;

    /* renamed from: d */
    public final C69615a f354331d;

    /* renamed from: e */
    public C71643cp f354332e;

    public C128948b(C71422aw awVar, Duration duration, C69615a aVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(duration, "duration");
        this.f354329b = awVar;
        this.f354330c = duration;
        this.f354331d = aVar;
    }

    /* renamed from: a */
    public final void mo108768a() {
        C71643cp cpVar = this.f354332e;
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        this.f354332e = null;
    }
}
