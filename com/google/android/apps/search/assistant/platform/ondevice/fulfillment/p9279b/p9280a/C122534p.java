package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122412bd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17593c;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17594d;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17596f;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.common.util.concurrent.C60887da;
import java.util.Arrays;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.p */
/* compiled from: PG */
public final /* synthetic */ class C122534p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122532n f339652a;

    /* renamed from: b */
    public final /* synthetic */ C60887da f339653b;

    /* renamed from: c */
    public final /* synthetic */ C122520bt f339654c;

    /* renamed from: d */
    public final /* synthetic */ C122542x f339655d;

    /* renamed from: e */
    public final /* synthetic */ C122412bd f339656e;

    public /* synthetic */ C122534p(C122532n nVar, C60887da daVar, C122520bt btVar, C122542x xVar, C122412bd bdVar) {
        this.f339652a = nVar;
        this.f339653b = daVar;
        this.f339654c = btVar;
        this.f339655d = xVar;
        this.f339656e = bdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122532n nVar = this.f339652a;
        C60887da daVar = this.f339653b;
        C122520bt btVar = this.f339654c;
        C122542x xVar = this.f339655d;
        C122412bd bdVar = this.f339656e;
        xVar.f339665a = new C17602l(daVar, C70876o.m103761b(bdVar.f189039a.mo39510a(C122413be.m201884j(), bdVar.f189040b), new C17596f(Arrays.asList(new C70862aj[]{new C17593c(C122539u.f339662a, new C17594d(C122538t.f339661a, nVar)), new C17593c(C122541w.f339664a, new C17594d(C122540v.f339663a, new C17602l(daVar, (C70862aj) obj))), btVar})), true));
        return "get intent";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
