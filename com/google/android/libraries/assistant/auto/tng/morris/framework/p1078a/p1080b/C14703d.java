package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14556np;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14559ns;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14561nu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14562nv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14563nw;
import com.google.assistant.p3994s.p3995a.C53435nu;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.d */
/* compiled from: PG */
public final /* synthetic */ class C14703d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14556np f44435a;

    public /* synthetic */ C14703d(C14556np npVar) {
        this.f44435a = npVar;
    }

    public final void accept(Object obj) {
        C14556np npVar = this.f44435a;
        C53435nu nuVar = (C53435nu) obj;
        C14562nv nvVar = (C14562nv) C14563nw.f44030b.createBuilder();
        C14559ns nsVar = (C14559ns) C14561nu.f44022f.createBuilder();
        String str = nuVar.f140240e;
        nsVar.copyOnWrite();
        str.getClass();
        ((C14561nu) nsVar.instance).f44024a = str;
        nsVar.copyOnWrite();
        ((C14561nu) nsVar.instance).f44027d = 6;
        C14492lf f = C14704e.m30893f(nuVar);
        nsVar.copyOnWrite();
        f.getClass();
        ((C14561nu) nsVar.instance).f44025b = f;
        nvVar.mo21559a(nsVar);
        npVar.mo21558a(nvVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
