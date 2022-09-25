package com.google.android.libraries.search.video.players;

import android.view.View;
import com.google.android.libraries.search.video.conductor.AutoplayConductorImpl;
import com.google.android.libraries.search.video.conductor.C41478a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.video.players.e */
/* compiled from: PG */
public final /* synthetic */ class C41570e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C41571f f108677a;

    /* renamed from: b */
    public final /* synthetic */ View f108678b;

    /* renamed from: c */
    public final /* synthetic */ C41478a f108679c;

    public /* synthetic */ C41570e(C41571f fVar, View view, C41478a aVar) {
        this.f108677a = fVar;
        this.f108678b = view;
        this.f108679c = aVar;
    }

    public final void accept(Object obj) {
        C41571f fVar = this.f108677a;
        View view = this.f108678b;
        C41478a aVar = this.f108679c;
        if (((Boolean) obj).booleanValue() && view == ((AutoplayConductorImpl) aVar).f108349f) {
            fVar.f108680a.mo43993a(aVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
