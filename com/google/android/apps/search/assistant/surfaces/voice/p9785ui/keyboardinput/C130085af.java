package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130057b;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.af */
/* compiled from: PG */
public final class C130085af {

    /* renamed from: a */
    public static final C46690ah f356700a = new C46885y("suggestions");

    /* renamed from: b */
    public final C130057b f356701b;

    /* renamed from: c */
    public final C46778cv f356702c;

    /* renamed from: d */
    public final AtomicReference f356703d = new AtomicReference(BuildConfig.FLAVOR);

    /* renamed from: e */
    public final AtomicReference f356704e = new AtomicReference(Optional.empty());

    public C130085af(C130057b bVar, C46778cv cvVar) {
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f356701b = bVar;
        this.f356702c = cvVar;
    }

    /* renamed from: a */
    public final void mo109484a(String str, Optional optional) {
        C69664n.m101061g(str, "query");
        C69664n.m101061g(optional, "correctionOptional");
        this.f356703d.set(str);
        this.f356704e.set(optional);
        this.f356702c.mo50787a(C60866ct.f164955a, f356700a);
    }
}
