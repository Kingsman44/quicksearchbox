package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80014k;
import com.google.android.apps.gsa.opa.p6448i.C83709a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59508ce;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Instant;
import p3186j$.util.OptionalInt;

/* compiled from: PG */
public class TapasJni {

    /* renamed from: a */
    public static final AtomicBoolean f310687a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final AtomicReference f310688b = new AtomicReference(C59508ce.LOADING_NOT_STARTED);

    /* renamed from: c */
    public static final Object f310689c = new Object();

    /* renamed from: d */
    public static C60870cx f310690d = null;

    /* renamed from: g */
    private static final C59071e f310691g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.TapasJni");

    /* renamed from: h */
    private static final C121537f f310692h = C121537f.m200840b("Tapas/TapasJni", C121511c.f337208a);

    /* renamed from: e */
    public final C86124t f310693e;

    /* renamed from: f */
    public OptionalInt f310694f = OptionalInt.empty();

    /* renamed from: i */
    private final C62921ba f310695i;

    public TapasJni(C86124t tVar) {
        C62921ba baVar = new C62921ba();
        this.f310695i = baVar;
        this.f310693e = tVar;
        baVar.mo58832e(C80014k.f219571e);
    }

    /* renamed from: e */
    public static boolean m185632e(long j) {
        AtomicReference atomicReference = f310688b;
        atomicReference.set(C59508ce.JNI_LOADING);
        C121537f fVar = f310692h;
        C121509q l = fVar.mo105243l("loadNativeLibraryCheck");
        try {
            C60948g gVar = C60948g.f165068a;
            long epochMilli = Instant.now().toEpochMilli();
            fVar.mo105241j("loadNativeLibrary", C111828as.f310793a);
            if (Instant.now().minusMillis(epochMilli).toEpochMilli() > j) {
                fVar.mo105240i("TapasJniLoad_timeout");
                atomicReference.set(C59508ce.JNI_TIMEOUT);
                l.close();
                return false;
            }
            fVar.mo105240i("TapasJniLoad_success");
            atomicReference.set(C59508ce.JNI_LOADED);
            f310687a.set(true);
            l.close();
            return true;
        } catch (UnsatisfiedLinkError e) {
            try {
                f310692h.mo105240i("TapasJniLoad_fail");
                ((C59052c) ((C59052c) ((C59052c) f310691g.mo56225c()).mo56382g(e)).mo56372aa(27408)).mo56386p("Unable to load native library cortex_native_jni.");
                f310688b.set(C59508ce.ERROR);
                l.close();
                return false;
            } catch (Throwable th) {
                C111827ar.m185690a(th, th);
            }
        }
        throw th;
    }

    private native void nativeInit();

    private native boolean nativeModelIsAvailable(int i);

    private native byte[] nativeRun(byte[] bArr);

    /* renamed from: a */
    public final C79891m mo99230a(C79885g gVar) {
        C121509q l;
        if (!f310687a.get()) {
            return null;
        }
        byte[] nativeRun = nativeRun(gVar.toByteArray());
        try {
            l = f310692h.mo105243l("parseResponse");
            C79891m mVar = (C79891m) C62942bv.parseFrom((C62942bv) C79891m.f218975e, nativeRun, this.f310695i);
            l.close();
            return mVar;
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f310691g.mo56225c()).mo56382g(e)).mo56372aa(27407)).mo56386p("Failed to parse ModelResponse from native code");
            return null;
        } catch (Throwable th) {
            C111827ar.m185690a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final C59508ce mo99231b() {
        return (C59508ce) f310688b.get();
    }

    /* renamed from: c */
    public final boolean mo99232c() {
        return f310687a.get() && nativeModelIsAvailable(6);
    }

    /* renamed from: d */
    public final boolean mo99233d() {
        return C83709a.m133281a(this.f310693e) && mo99232c();
    }

    public native boolean nativeLoadResources(int i, ByteBuffer byteBuffer);
}
