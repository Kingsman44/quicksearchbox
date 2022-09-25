package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14559ns;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14561nu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14562nv;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.assistant.p3994s.p3995a.C53437nw;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C14687b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14562nv f44367a;

    public /* synthetic */ C14687b(C14562nv nvVar) {
        this.f44367a = nvVar;
    }

    public final void accept(Object obj) {
        C14562nv nvVar = this.f44367a;
        C53435nu nuVar = (C53435nu) obj;
        C14559ns nsVar = (C14559ns) C14561nu.f44022f.createBuilder();
        String str = nuVar.f140240e;
        nsVar.copyOnWrite();
        str.getClass();
        ((C14561nu) nsVar.instance).f44024a = str;
        C53437nw nwVar = nuVar.f140247l;
        if (nwVar == null) {
            nwVar = C53437nw.f140250i;
        }
        int i = nwVar.f140258g == C16327aa.NAVIGATE_HOME.f48064H ? 5 : 7;
        nsVar.copyOnWrite();
        ((C14561nu) nsVar.instance).f44027d = i - 2;
        C14492lf f = C14704e.m30893f(nuVar);
        nsVar.copyOnWrite();
        f.getClass();
        ((C14561nu) nsVar.instance).f44025b = f;
        nvVar.mo21559a(nsVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
