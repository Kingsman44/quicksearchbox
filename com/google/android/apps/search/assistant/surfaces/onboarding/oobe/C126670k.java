package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import p3186j$.util.function.IntConsumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.k */
/* compiled from: PG */
public final /* synthetic */ class C126670k implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f348818a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f348819b;

    /* renamed from: c */
    public final /* synthetic */ LayoutInflater f348820c;

    public /* synthetic */ C126670k(ViewGroup viewGroup, C58485gu guVar, LayoutInflater layoutInflater) {
        this.f348818a = viewGroup;
        this.f348819b = guVar;
        this.f348820c = layoutInflater;
    }

    public final void accept(int i) {
        ViewGroup viewGroup = this.f348818a;
        C58485gu guVar = this.f348819b;
        LayoutInflater layoutInflater = this.f348820c;
        viewGroup.addView((View) guVar.get(i));
        if (i < ((C58724pq) guVar).f156474d - 1) {
            layoutInflater.inflate(R.layout.assistant_component_divider, viewGroup, true);
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
