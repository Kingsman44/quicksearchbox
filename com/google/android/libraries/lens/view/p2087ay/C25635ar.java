package com.google.android.libraries.lens.view.p2087ay;

import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.vision.C28172n;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.ay.ar */
/* compiled from: PG */
public final /* synthetic */ class C25635ar implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C25637at f69734a;

    public /* synthetic */ C25635ar(C25637at atVar) {
        this.f69734a = atVar;
    }

    public final void accept(Object obj) {
        C25637at atVar = this.f69734a;
        List<C26504ci> list = (List) obj;
        C28172n nVar = atVar.f69742d;
        if (nVar != null && atVar.f69744f != null) {
            for (C26504ci ciVar : list) {
                if (ciVar.f72213g) {
                    nVar.mo33605u(ciVar.f72215i.mo33664h());
                }
            }
            C25663x xVar = atVar.f69744f;
            synchronized (xVar.f69784a.f69790f) {
                xVar.f69784a.f69791g.removeAll(list);
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
