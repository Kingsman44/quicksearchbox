package p5488io.grpc.p5523c;

import com.google.common.base.C58838bb;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;
import p5488io.grpc.C70287cp;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70465e;
import p5488io.grpc.p5525e.C70544gy;
import p5488io.grpc.p5525e.C70549hc;
import p5488io.grpc.p5525e.C70678lx;
import p5488io.grpc.p5525e.C70679ly;

/* renamed from: io.grpc.c.e */
/* compiled from: PG */
public final class C70261e extends C70465e {

    /* renamed from: a */
    public ScheduledExecutorService f187273a;

    /* renamed from: b */
    public final CronetEngine f187274b;

    /* renamed from: c */
    public final C70549hc f187275c;

    /* renamed from: d */
    public final C70678lx f187276d = C70679ly.f188407a;

    /* renamed from: e */
    public int f187277e = 4194304;

    /* renamed from: f */
    public boolean f187278f;

    /* renamed from: g */
    public int f187279g;

    /* renamed from: h */
    public boolean f187280h;

    /* renamed from: i */
    public int f187281i;

    private C70261e(String str, int i, CronetEngine cronetEngine) {
        this.f187275c = new C70549hc((SocketAddress) InetSocketAddress.createUnresolved(str, i), C70460dv.m102876d(str, i), (C70544gy) new C70257a(this));
        C58838bb.m90866a(cronetEngine, "cronetEngine");
        this.f187274b = cronetEngine;
    }

    /* renamed from: b */
    public static C70261e m102411b(String str, int i, CronetEngine cronetEngine) {
        C58838bb.m90866a(cronetEngine, "cronetEngine");
        return new C70261e(str, i, cronetEngine);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C70287cp mo61905a() {
        return this.f187275c;
    }

    /* renamed from: d */
    public final void mo61906d(ScheduledExecutorService scheduledExecutorService) {
        C58838bb.m90866a(scheduledExecutorService, "scheduledExecutorService");
        this.f187273a = scheduledExecutorService;
    }
}
