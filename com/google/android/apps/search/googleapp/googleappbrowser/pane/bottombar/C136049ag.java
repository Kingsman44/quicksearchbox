package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135767j;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136072b;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136073c;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136074d;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ag */
/* compiled from: PG */
public final /* synthetic */ class C136049ag implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C136049ag f370509a = new C136049ag();

    private /* synthetic */ C136049ag() {
    }

    public final void accept(Object obj) {
        C136072b bVar = ((C135767j) obj).f369809c;
        C19559g.m37304c();
        C136074d dVar = (C136074d) bVar.f370594b.mo47045a();
        if (!C69664n.m101066l(dVar.f370599b, "GoogleOnContentEmbeddedFragment")) {
            C136073c cVar = (C136073c) dVar.toBuilder();
            cVar.copyOnWrite();
            C136074d dVar2 = (C136074d) cVar.instance;
            dVar2.f370598a |= 1;
            dVar2.f370599b = "GoogleOnContentEmbeddedFragment";
            C62942bv build = cVar.build();
            C69664n.m101060f(build, "currentState.toBuilder()…dFragmentKey(key).build()");
            bVar.mo112731b((C136074d) build);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
