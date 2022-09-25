package com.google.android.libraries.search.video.p3192b;

import com.google.android.libraries.search.video.p3194d.C41500k;
import com.google.android.libraries.search.video.players.C41553ae;
import com.google.android.libraries.search.video.players.C41554af;
import com.google.android.libraries.search.video.players.YouTubeWrapper;
import com.google.android.youtube.player.C45512h;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57145bb;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57193x;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.video.b.h */
/* compiled from: PG */
public final /* synthetic */ class C41464h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C57145bb f108305a;

    /* renamed from: b */
    public final /* synthetic */ C41500k f108306b;

    public /* synthetic */ C41464h(C57145bb bbVar, C41500k kVar) {
        this.f108305a = bbVar;
        this.f108306b = kVar;
    }

    public final void accept(Object obj) {
        C57193x xVar;
        C57145bb bbVar = this.f108305a;
        C41500k kVar = this.f108306b;
        C41553ae aeVar = (C41553ae) obj;
        C57128al alVar = bbVar.f152554f;
        if (alVar == null) {
            alVar = C57128al.f152495c;
        }
        YouTubeWrapper youTubeWrapper = aeVar.f108637a;
        C57194y b = aeVar.f108638b.mo43983b(alVar);
        int i = 1;
        if (b.f152695b == 1) {
            xVar = (C57193x) b.f152696c;
        } else {
            xVar = C57193x.f152688b;
        }
        String str = xVar.f152690a;
        if (alVar.f152497a == 2) {
            i = 2;
        }
        C45512h hVar = new C45512h(str, i);
        if (youTubeWrapper.mo44071g()) {
            youTubeWrapper.f108607o = new C41554af(youTubeWrapper, hVar, kVar);
            int i2 = youTubeWrapper.f108610r;
            if (i2 == 0) {
                throw null;
            } else if (i2 == 5) {
                Runnable runnable = youTubeWrapper.f108607o;
                runnable.getClass();
                runnable.run();
                youTubeWrapper.f108607o = null;
            } else {
                youTubeWrapper.mo44067c();
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
