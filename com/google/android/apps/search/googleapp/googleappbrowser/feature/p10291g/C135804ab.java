package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import android.net.Uri;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.ab */
/* compiled from: PG */
public final /* synthetic */ class C135804ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C135808af f369906a;

    public /* synthetic */ C135804ab(C135808af afVar) {
        this.f369906a = afVar;
    }

    public final void accept(Object obj) {
        C135808af afVar = this.f369906a;
        C6007z g = afVar.f369921j.mo51286a().mo11864b().mo12445g(Uri.parse((String) obj));
        g.mo12455s(new C135807ae(afVar), (C5592i) null, g, C5622i.f16959a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
