package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4820d.p4831g.p4832a.p4833a.C63271b;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71276de;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg;

/* compiled from: PG */
public final class NativeCrashHandlerImpl implements C31367o {

    /* renamed from: c */
    private static final C59071e f84382c = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl");

    /* renamed from: a */
    final CountDownLatch f84383a = new CountDownLatch(1);

    /* renamed from: b */
    final CountDownLatch f84384b = new CountDownLatch(1);

    /* renamed from: d */
    private boolean f84385d;

    /* renamed from: e */
    private final C58833ax f84386e;

    public NativeCrashHandlerImpl(C58833ax axVar) {
        this.f84386e = axVar;
    }

    private static native ByteBuffer awaitSignal();

    static native void doDiscardNativeCrashes();

    private static native boolean initializeSignalHandler();

    private static native void unblockSignalHandler();

    /* renamed from: a */
    public final synchronized void mo37043a(C31357e eVar) {
        if (!this.f84385d) {
            this.f84385d = true;
            Thread thread = new Thread(new C31368p(this, eVar), "Primes-nativecrash-sidecar");
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo37044b(C31357e eVar) {
        if (this.f84386e.mo56113h() && !((Boolean) ((C69464a) this.f84386e.mo56107c()).mo17428b()).booleanValue()) {
            this.f84384b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler()) {
                ((C59052c) ((C59052c) f84382c.mo56226d()).mo56372aa(50377)).mo56386p("unable to initialize signal handler");
                return;
            }
            try {
                this.f84383a.countDown();
                ByteBuffer awaitSignal = awaitSignal();
                C63271b bVar = null;
                if (awaitSignal != null) {
                    try {
                        bVar = (C63271b) C62942bv.parseFrom((C62942bv) C63271b.f171003a, awaitSignal, C62921ba.f169869a);
                    } catch (Throwable unused) {
                    }
                }
                C71276de f = ((C31360h) eVar).mo37070f();
                f.copyOnWrite();
                C71278dg dgVar = (C71278dg) f.instance;
                C71278dg dgVar2 = C71278dg.f190307j;
                dgVar.f190314f = 5;
                dgVar.f190309a |= 16;
                if (bVar != null) {
                    f.copyOnWrite();
                    C71278dg dgVar3 = (C71278dg) f.instance;
                    dgVar3.f190317i = bVar;
                    dgVar3.f190309a |= 512;
                }
                ((C31360h) eVar).mo37071g((C71278dg) f.build());
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((C59052c) ((C59052c) ((C59052c) f84382c.mo56226d()).mo56382g(e)).mo56372aa(50378)).mo56386p("unable to load native_crash_handler_jni");
        }
    }
}
