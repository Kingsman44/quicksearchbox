package com.google.android.apps.search.googleapp.activity;

import android.app.assist.AssistContent;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.activity.v */
/* compiled from: PG */
public final /* synthetic */ class C133443v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ AssistContent f363590a;

    public /* synthetic */ C133443v(AssistContent assistContent) {
        this.f363590a = assistContent;
    }

    public final void accept(Object obj) {
        AssistContent assistContent = this.f363590a;
        C58974d dVar = C133444w.f363591a;
        ((C133416bc) obj).mo111136a(assistContent);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
