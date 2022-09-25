package com.google.android.libraries.assistant.gallium.framework.ipc.internal;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p5127o.C65648ac;
import com.google.protos.p5127o.C65699y;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
public final class JavaToCppLinkImpl {

    /* renamed from: a */
    public final ReentrantReadWriteLock f51927a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public boolean f51928b = false;

    /* renamed from: c */
    public final CppBackedObjectImpl f51929c;

    /* renamed from: d */
    private final long f51930d;

    public JavaToCppLinkImpl(long j, CppBackedObjectImpl cppBackedObjectImpl) {
        this.f51930d = j;
        this.f51929c = cppBackedObjectImpl;
    }

    public static native long nativeGetJavaObjectBacker(long j);

    private static native byte[] nativeSend(long j, byte[] bArr);

    /* renamed from: a */
    public final void mo23766a(C65648ac acVar) {
        if (this.f51927a.readLock().tryLock()) {
            try {
                if (!this.f51928b) {
                    this.f51929c.mo23762c();
                    byte[] nativeSend = nativeSend(this.f51930d, acVar.toByteArray());
                    C65699y yVar = (C65699y) C62942bv.parseFrom((C62942bv) C65699y.f178500e, nativeSend, C62921ba.f169869a);
                    if (yVar.f178503b == 0) {
                        this.f51927a.readLock().unlock();
                        return;
                    }
                    throw new C18218av(yVar);
                }
                throw C18218av.m35478a(10, "JavaToCppLinkImpl is disposed!");
            } catch (C62974ct e) {
                throw C18218av.m35480c(e);
            } catch (Throwable th) {
                this.f51927a.readLock().unlock();
                throw th;
            }
        } else {
            throw C18218av.m35478a(10, "JavaToCppLinkImpl is being disposed!");
        }
    }
}
