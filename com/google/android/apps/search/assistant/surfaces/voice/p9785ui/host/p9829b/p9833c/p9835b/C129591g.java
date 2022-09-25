package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.animation.C147768a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.g */
/* compiled from: PG */
final class C129591g implements C147768a {

    /* renamed from: a */
    final /* synthetic */ View f355688a;

    public C129591g(View view) {
        this.f355688a = view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42047a(Object obj) {
        Integer num = (Integer) obj;
        View view = this.f355688a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            C69664n.m101060f(num, "value");
            layoutParams.height = num.intValue();
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
