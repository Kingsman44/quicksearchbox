package p5488io.grpc.binder;

import android.content.Context;
import androidx.core.content.C1881g;
import com.google.common.base.C58838bb;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70159aw;
import p5488io.grpc.C70287cp;
import p5488io.grpc.p5525e.C70446dh;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70544gy;
import p5488io.grpc.p5525e.C70549hc;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70669lo;

/* renamed from: io.grpc.binder.e */
/* compiled from: PG */
public final class C70225e extends C70159aw {

    /* renamed from: a */
    public final C70549hc f187197a;

    /* renamed from: b */
    public Executor f187198b;

    /* renamed from: c */
    public C70567hu f187199c = new C70669lo(C70460dv.f187798q);

    /* renamed from: d */
    public C70235o f187200d;

    /* renamed from: e */
    public C70229i f187201e;

    /* renamed from: f */
    public final C70222b f187202f;

    private C70225e(C70175a aVar, Context context) {
        C58838bb.m90866a(context, "sourceContext");
        this.f187198b = C1881g.m5136a(context);
        this.f187200d = C70234n.m102384a();
        this.f187201e = C70229i.f187211a;
        this.f187202f = C70222b.f187184a;
        this.f187197a = new C70549hc((SocketAddress) aVar, aVar.f187028a.getComponent().getPackageName(), (C70544gy) new C70223c(this, context));
    }

    /* renamed from: a */
    public static C70225e m102371a(C70175a aVar, Context context) {
        C58838bb.m90866a(aVar, "directAddress");
        return new C70225e(aVar, context);
    }

    /* renamed from: b */
    public final void mo61888b(ScheduledExecutorService scheduledExecutorService) {
        C58838bb.m90866a(scheduledExecutorService, "scheduledExecutorService");
        this.f187199c = new C70446dh(scheduledExecutorService);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C70287cp mo57964d() {
        return this.f187197a;
    }

    /* renamed from: e */
    public final void mo61889e(C70235o oVar) {
        C58838bb.m90866a(oVar, "securityPolicy");
        this.f187200d = oVar;
    }
}
