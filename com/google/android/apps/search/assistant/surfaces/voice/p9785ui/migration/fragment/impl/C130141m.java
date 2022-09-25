package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.m */
/* compiled from: PG */
public final /* synthetic */ class C130141m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C130127c f356807a;

    public /* synthetic */ C130141m(C130127c cVar) {
        this.f356807a = cVar;
    }

    public final void accept(Object obj) {
        C130136h hVar = (C130136h) obj;
        View view = (View) hVar.f356802c.get(this.f356807a);
        if (view != null) {
            FragmentManager childFragmentManager = hVar.f356800a.getChildFragmentManager();
            Fragment b = childFragmentManager.f634a.mo670b(view.getId());
            if (b != null) {
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo516m(b);
                aVar.mo509f();
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
