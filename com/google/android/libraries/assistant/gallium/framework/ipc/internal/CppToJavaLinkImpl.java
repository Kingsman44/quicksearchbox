package com.google.android.libraries.assistant.gallium.framework.ipc.internal;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18219aw;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protos.p5127o.C65648ac;
import com.google.protos.p5127o.C65655aj;
import com.google.protos.p5127o.C65669ax;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65698x;
import com.google.protos.p5127o.C65699y;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
public final class CppToJavaLinkImpl implements C18300a {

    /* renamed from: a */
    private final Runnable f51920a;

    /* renamed from: b */
    private final long f51921b;

    /* renamed from: c */
    private final C62921ba f51922c;

    /* renamed from: d */
    private final ReentrantReadWriteLock f51923d = new ReentrantReadWriteLock();

    /* renamed from: e */
    private boolean f51924e = false;

    /* renamed from: f */
    private final CppBackedObjectImpl f51925f;

    /* renamed from: g */
    private C18303d f51926g;

    public CppToJavaLinkImpl(Runnable runnable, long j, CppBackedObjectImpl cppBackedObjectImpl) {
        this.f51921b = j;
        this.f51925f = cppBackedObjectImpl;
        C62921ba baVar = new C62921ba();
        this.f51922c = baVar;
        baVar.mo58832e(C65669ax.f178435d);
        baVar.mo58832e(C65655aj.f178400d);
        baVar.mo58832e(C65674bb.f178443d);
        this.f51920a = runnable;
    }

    public static native long nativeGetJavaObjectBacker(long j);

    private native void nativeUnregisterJavaSide(long j);

    private byte[] receive(byte[] bArr) {
        if (!this.f51923d.readLock().tryLock()) {
            return C18219aw.m35485c(10, "CppToJavaLinkImpl is being disposed!").toByteArray();
        }
        try {
            if (this.f51924e) {
                return C18219aw.m35485c(10, "CppToJavaLinkImpl is disposed!").toByteArray();
            }
            C18303d dVar = this.f51926g;
            if (dVar == null) {
                byte[] byteArray = C18219aw.m35485c(9, "CppToJavaLink message handler not set.").toByteArray();
                this.f51923d.readLock().unlock();
                return byteArray;
            }
            C65648ac acVar = (C65648ac) C62942bv.parseFrom((C62942bv) C65648ac.f178380e, bArr, this.f51922c);
            C18306g gVar = dVar.f51937a;
            boolean z = true;
            if (gVar.f51945f != null) {
                long j = acVar.f178385d;
                int i = acVar.f178383b;
                if (i == 1) {
                    gVar.f51944e.execute(new C18301b(gVar, acVar, j));
                } else if (i == 2) {
                    gVar.f51944e.execute(new C18302c(gVar, acVar, j));
                } else {
                    C65698x xVar = (C65698x) C65699y.f178500e.createBuilder();
                    xVar.copyOnWrite();
                    C65699y yVar = (C65699y) xVar.instance;
                    yVar.f178502a |= 1;
                    yVar.f178503b = 13;
                    long j2 = acVar.f178385d;
                    int i2 = acVar.f178383b;
                    boolean z2 = i2 == 1;
                    boolean z3 = i2 == 2;
                    if (i2 != 3) {
                        z = false;
                    }
                    String concat = "JNI bridge received an unrecognized message in Java; message=".concat("FfiBridgeEnvelope { ipcCallId=" + j2 + ", hasRequest=" + z2 + ", hasResponse=" + z3 + ", hasNotification=" + z + " }");
                    xVar.copyOnWrite();
                    C65699y yVar2 = (C65699y) xVar.instance;
                    yVar2.f178502a = yVar2.f178502a | 2;
                    yVar2.f178504c = concat;
                    throw new C18218av((C65699y) xVar.build());
                }
                return C18219aw.m35484b().toByteArray();
            }
            C65698x xVar2 = (C65698x) C65699y.f178500e.createBuilder();
            xVar2.copyOnWrite();
            C65699y yVar3 = (C65699y) xVar2.instance;
            yVar3.f178502a |= 1;
            yVar3.f178503b = 9;
            xVar2.copyOnWrite();
            C65699y yVar4 = (C65699y) xVar2.instance;
            yVar4.f178502a |= 2;
            yVar4.f178504c = "C++ request handler of JNI bridge (Java side) is not set: cannot receive messages in Java.";
            throw new C18218av((C65699y) xVar2.build());
        } catch (Exception e) {
            return C18218av.m35482e(e).f51741a.toByteArray();
        } finally {
            this.f51923d.readLock().unlock();
        }
    }

    private void reportPotentialDeadlock() {
        this.f51920a.run();
    }

    /* renamed from: a */
    public final void mo23763a() {
        this.f51923d.writeLock().lock();
        try {
            if (!this.f51924e) {
                this.f51925f.mo23762c();
                this.f51924e = true;
                nativeUnregisterJavaSide(this.f51921b);
                this.f51925f.mo23761b();
                return;
            }
            throw new IllegalStateException("CppToJavaLinkImpl is already disposed!");
        } finally {
            this.f51923d.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public final void mo23764b(C18303d dVar) {
        this.f51923d.writeLock().lock();
        try {
            if (this.f51926g == null) {
                this.f51926g = dVar;
                return;
            }
            throw new IllegalStateException("Message handler already set.");
        } finally {
            this.f51923d.writeLock().unlock();
        }
    }

    public native void nativeRegisterJavaSide(long j);
}
