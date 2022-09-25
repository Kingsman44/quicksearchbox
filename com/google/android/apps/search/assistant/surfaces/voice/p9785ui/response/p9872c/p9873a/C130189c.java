package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.p9873a;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127173g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.C130186a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.c.a.c */
/* compiled from: PG */
public final class C130189c implements C130186a {

    /* renamed from: a */
    public static final C46690ah f356937a = new C46885y("TRANSCRIPTION_HIGHLIGHT_ARGS_KEY");

    /* renamed from: b */
    public final AtomicReference f356938b = new AtomicReference(C51656n.f134597e);

    /* renamed from: c */
    public final C127173g f356939c;

    /* renamed from: d */
    private final C46778cv f356940d;

    public C130189c(C127173g gVar, C46778cv cvVar) {
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f356939c = gVar;
        this.f356940d = cvVar;
    }

    /* renamed from: a */
    public final C46851e mo109564a() {
        return new C130187a(this);
    }

    /* renamed from: b */
    public final C46851e mo109565b() {
        return new C130188b(this);
    }

    /* renamed from: c */
    public final void mo109566c(C51656n nVar) {
        C69664n.m101061g(nVar, "newHighlightArgs");
        this.f356938b.set(nVar);
        this.f356940d.mo50787a(C60866ct.f164955a, f356937a);
    }
}
