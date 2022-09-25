package com.google.android.libraries.assistant.contexttrigger.p1455b.p1456a;

import com.google.android.libraries.assistant.contexttrigger.p1455b.C17620a;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17637b;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17641e;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17645i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.b.a.e */
/* compiled from: PG */
public final class C17625e implements C17620a {

    /* renamed from: a */
    public final Map f50743a;

    /* renamed from: b */
    private final C17637b f50744b;

    /* renamed from: c */
    private final Executor f50745c;

    public C17625e(Map map, C17637b bVar, Executor executor) {
        this.f50743a = map;
        this.f50744b = bVar;
        this.f50745c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo23415a() {
        C17637b bVar = this.f50744b;
        return C47633f.m84733g(C70876o.m103760a(bVar.f189039a.mo39510a(C17641e.m34938b(), bVar.f189040b), C17645i.f50767a)).mo51516i(new C17621a(this), this.f50745c).mo51515h(C17622b.f50740a, this.f50745c);
    }

    /* renamed from: b */
    public final C60870cx mo23416b() {
        return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(((C58495hd) this.f50743a).values()).map(C17623c.f50741a).collect(C58370cn.f155946a))).mo51515h(C17624d.f50742a, this.f50745c);
    }
}
