package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.p4522b.C58485gu;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.hz */
/* compiled from: PG */
public final /* synthetic */ class C112626hz implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f312228a;

    /* renamed from: b */
    public final /* synthetic */ int f312229b;

    /* renamed from: c */
    public final /* synthetic */ Map f312230c;

    /* renamed from: d */
    public final /* synthetic */ int f312231d;

    /* renamed from: e */
    public final /* synthetic */ Map f312232e;

    /* renamed from: f */
    public final /* synthetic */ int f312233f;

    public /* synthetic */ C112626hz(Map map, int i, Map map2, int i2, Map map3, int i3) {
        this.f312228a = map;
        this.f312229b = i;
        this.f312230c = map2;
        this.f312231d = i2;
        this.f312232e = map3;
        this.f312233f = i3;
    }

    public final void accept(Object obj) {
        Map map = this.f312228a;
        int i = this.f312229b;
        Map map2 = this.f312230c;
        int i2 = this.f312231d;
        Map map3 = this.f312232e;
        int i3 = this.f312233f;
        C58485gu o = ((C113408es) obj).mo100053o();
        int size = o.size();
        for (int i4 = 0; i4 < size; i4++) {
            C113415ez ezVar = (C113415ez) o.get(i4);
            Map.EL.merge(map, Integer.valueOf(ezVar.mo100204d()), Integer.valueOf(i - 1), C112634ig.f312240a);
            Map.EL.merge(map2, ezVar.mo100210j(), Integer.valueOf(i2 - 1), C112635ih.f312241a);
            Map.EL.merge(map3, ezVar.mo100211k(), Integer.valueOf(i3 - 1), C112624hx.f312226a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
