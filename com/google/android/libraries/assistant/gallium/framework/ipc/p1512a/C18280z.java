package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9290f.C122878e;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18297q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protos.p5127o.C65670ay;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65681g;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65699y;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70884w;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.z */
/* compiled from: PG */
final class C18280z implements AutoCloseable, C70884w {

    /* renamed from: a */
    public static final C59071e f51872a = C59071e.m91332i("com.google.android.libraries.assistant.gallium.framework.ipc.a.z");

    /* renamed from: b */
    public final ReentrantReadWriteLock f51873b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public final String f51874c;

    /* renamed from: d */
    public final String f51875d;

    /* renamed from: e */
    public Runnable f51876e;

    /* renamed from: f */
    public Optional f51877f = Optional.empty();

    /* renamed from: g */
    private final String f51878g;

    /* renamed from: h */
    private C60870cx f51879h = C60866ct.f164955a;

    /* renamed from: i */
    private C60870cx f51880i;

    /* renamed from: j */
    private final C122878e f51881j;

    public C18280z(C122878e eVar, String str, String str2, String str3) {
        this.f51881j = eVar;
        this.f51874c = str;
        this.f51875d = str2;
        this.f51878g = str3;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final C70862aj mo20118a(C70862aj ajVar) {
        C65681g gVar = (C65681g) C65682h.f178459f.createBuilder();
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        String str = this.f51874c;
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        str.getClass();
        lVar.f178472a |= 1;
        lVar.f178473b = str;
        String str2 = this.f51878g;
        kVar.copyOnWrite();
        C65686l lVar2 = (C65686l) kVar.instance;
        str2.getClass();
        lVar2.f178472a |= 2;
        lVar2.f178474c = str2;
        gVar.copyOnWrite();
        C65682h hVar = (C65682h) gVar.instance;
        C65686l lVar3 = (C65686l) kVar.build();
        lVar3.getClass();
        hVar.f178462b = lVar3;
        hVar.f178461a |= 1;
        C65682h hVar2 = (C65682h) gVar.build();
        C18297q qVar = new C18297q();
        qVar.f51916a = C58833ax.m90834k(new C18276v(ajVar));
        C60870cx a = this.f51881j.mo105772a();
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(new C18273s(this, hVar2, qVar)), C60826bg.f164896a);
        C60856cj.m92911t(a, C47810es.m84974n(new C18278x(this, hVar2)), C60826bg.f164896a);
        String str3 = this.f51875d;
        C18238f fVar = new C18238f();
        C62940bt btVar = C65674bb.f178443d;
        C65670ay ayVar = (C65670ay) C65674bb.f178442c.createBuilder();
        ayVar.copyOnWrite();
        C65674bb bbVar = (C65674bb) ayVar.instance;
        bbVar.f178446b = 1;
        bbVar.f178445a |= 1;
        fVar.f51797a.mo58885m(btVar, (C65674bb) ayVar.build());
        C60870cx h = C60922j.m93045h(C47638k.m84753d(a, g).mo51521b(new C18267m(this, a, hVar2, str3, g, fVar), C60826bg.f164896a), C47810es.m84966f(new C18270p(this)), C60826bg.f164896a);
        this.f51880i = h;
        this.f51873b.writeLock().lock();
        try {
            this.f51879h = h;
            this.f51873b.writeLock().unlock();
            return new C18279y(this, a, ajVar);
        } catch (Throwable th) {
            this.f51873b.writeLock().unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo23745b(C58881cr crVar, boolean z) {
        this.f51873b.writeLock().lock();
        if (z) {
            try {
                this.f51879h.cancel(false);
                this.f51879h = this.f51880i;
            } catch (Throwable th) {
                this.f51873b.writeLock().unlock();
                throw th;
            }
        }
        C60870cx cxVar = this.f51879h;
        C18268n nVar = new C18268n(this, crVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(nVar), C60826bg.f164896a);
        this.f51879h = h;
        this.f51873b.writeLock().unlock();
        return h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C60870cx mo23746c(C65699y yVar, C60870cx cxVar) {
        return mo23745b(new C18275u(this, cxVar, yVar), yVar.f178503b != 0);
    }

    public final void close() {
        C18253ak.m35566e(mo23745b(new C18269o(this), false), "close", Level.INFO, (C70862aj) null);
    }
}
