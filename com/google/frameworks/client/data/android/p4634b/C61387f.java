package com.google.frameworks.client.data.android.p4634b;

import android.app.Application;
import android.content.Context;
import androidx.core.content.C1881g;
import androidx.lifecycle.C2384o;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70159aw;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70287cp;
import p5488io.grpc.C70911z;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70222b;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70234n;
import p5488io.grpc.binder.C70235o;
import p5488io.grpc.p5525e.C70446dh;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70543gx;
import p5488io.grpc.p5525e.C70544gy;
import p5488io.grpc.p5525e.C70549hc;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70669lo;

@Deprecated
/* renamed from: com.google.frameworks.client.data.android.b.f */
/* compiled from: PG */
public final class C61387f extends C70159aw {

    /* renamed from: a */
    public static final C59071e f165988a = C59071e.m91332i("com.google.frameworks.client.data.android.b.f");

    /* renamed from: b */
    public final Context f165989b;

    /* renamed from: c */
    public final C2384o f165990c;

    /* renamed from: d */
    public final C70549hc f165991d;

    /* renamed from: e */
    public C70567hu f165992e = new C70669lo(C70460dv.f187798q);

    /* renamed from: f */
    public C70235o f165993f;

    /* renamed from: g */
    public C70229i f165994g;

    /* renamed from: h */
    public Executor f165995h;

    /* renamed from: i */
    public final C70222b f165996i = C70222b.f187184a;

    private C61387f(C70175a aVar, Context context, C2384o oVar) {
        this.f165989b = context;
        this.f165990c = oVar;
        this.f165993f = C70234n.m102384a();
        this.f165991d = new C70549hc((SocketAddress) aVar, aVar.f187028a.getComponent().getPackageName(), (C70544gy) new C61385d(this));
        m93918g();
    }

    /* renamed from: a */
    public static synchronized C61387f m93916a(Application application, C70175a aVar) {
        C61387f fVar;
        synchronized (C61387f.class) {
            fVar = new C61387f(aVar, (Context) application, (C2384o) null);
        }
        return fVar;
    }

    /* renamed from: b */
    public static synchronized C61387f m93917b(Application application, String str) {
        C61387f fVar;
        synchronized (C61387f.class) {
            fVar = new C61387f(str, (Context) application, (C2384o) null);
        }
        return fVar;
    }

    /* renamed from: g */
    private final void m93918g() {
        this.f165991d.mo62289d(new C70156at());
        C70911z a = C70911z.m103842a();
        C70549hc hcVar = this.f165991d;
        hcVar.f188043k = a;
        hcVar.f188052t = false;
        hcVar.f188048p = false;
        this.f165991d.mo62291f(1, TimeUnit.MINUTES);
        Executor a2 = C1881g.m5136a(this.f165989b);
        C58838bb.m90866a(a2, "androidMainThreadExecutor");
        this.f165995h = a2;
    }

    /* renamed from: c */
    public final C70286co mo57963c() {
        C70286co c = this.f165991d.mo57963c();
        if (this.f165990c != null) {
            this.f165995h.execute(new C61384c(this, c));
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C70287cp mo57964d() {
        return this.f165991d;
    }

    /* renamed from: e */
    public final void mo57965e(ScheduledExecutorService scheduledExecutorService) {
        C58838bb.m90866a(scheduledExecutorService, "scheduledExecutorService");
        this.f165992e = new C70446dh(scheduledExecutorService);
    }

    /* renamed from: f */
    public final void mo57966f(C70235o oVar) {
        C58838bb.m90866a(oVar, "securityPolicy");
        this.f165993f = oVar;
    }

    private C61387f(String str, Context context, C2384o oVar) {
        this.f165989b = context;
        this.f165990c = oVar;
        this.f165993f = C70234n.m102384a();
        this.f165994g = C70229i.f187211a;
        if (!str.startsWith("ondevice://") && !str.startsWith("android-app:")) {
            str = "ondevice://".concat(String.valueOf(str));
        }
        this.f165991d = new C70549hc(str, (C70544gy) new C61385d(this), (C70543gx) null);
        m93918g();
    }
}
