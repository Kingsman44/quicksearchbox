package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C130143o implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C130143o f356810a = new C130143o();

    private /* synthetic */ C130143o() {
    }

    public final void accept(Object obj) {
        FragmentManager childFragmentManager = ((C130136h) obj).f356800a.getChildFragmentManager();
        C0154a aVar = new C0154a(childFragmentManager);
        Stream stream = Collection.EL.stream(childFragmentManager.f634a.mo677i());
        Objects.requireNonNull(aVar);
        stream.forEach(new C130135g(aVar));
        aVar.mo509f();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
