package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9836c;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129668f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129624h;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.c.c */
/* compiled from: PG */
public final class C129608c implements C129609d {

    /* renamed from: a */
    private final C129624h f355722a;

    /* renamed from: b */
    private final Fragment f355723b;

    /* renamed from: c */
    private final Fragment f355724c;

    /* renamed from: d */
    private final C129668f f355725d;

    public C129608c(C129624h hVar, Fragment fragment, Fragment fragment2, C129668f fVar) {
        C69664n.m101061g(fragment, "hostFragment");
        C69664n.m101061g(fragment2, "sourceFragment");
        C69664n.m101061g(fVar, "transitionType");
        this.f355722a = hVar;
        this.f355723b = fragment;
        this.f355724c = fragment2;
        this.f355725d = fVar;
    }

    /* renamed from: a */
    public final Object mo109128a(C69577g gVar) {
        return this.f355722a.mo109134a(this.f355725d).mo109122b(this.f355724c.requireView(), gVar);
    }

    /* renamed from: b */
    public final void mo109129b() {
        this.f355724c.getClass().getName();
        C0154a aVar = new C0154a(this.f355723b.getChildFragmentManager());
        aVar.mo516m(this.f355724c);
        aVar.mo509f();
    }
}
