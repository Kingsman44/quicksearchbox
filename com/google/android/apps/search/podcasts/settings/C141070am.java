package com.google.android.apps.search.podcasts.settings;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import com.google.android.apps.search.podcasts.settings.p10612a.C141051d;
import java.util.List;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.am */
/* compiled from: PG */
final class C141070am implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Consumer f382985a;

    /* renamed from: b */
    final /* synthetic */ List f382986b;

    public C141070am(Consumer consumer, List list) {
        this.f382985a = consumer;
        this.f382986b = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C69664n.m101061g(dialogInterface, "dialogInterface");
        this.f382985a.accept(((C141051d) this.f382986b.get(((C0392m) dialogInterface).f1349a.f1106f.getCheckedItemPosition())).f382951f);
    }
}
