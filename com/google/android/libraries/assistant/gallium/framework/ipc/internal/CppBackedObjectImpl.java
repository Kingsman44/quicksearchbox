package com.google.android.libraries.assistant.gallium.framework.ipc.internal;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18219aw;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p5127o.C65699y;

/* compiled from: PG */
public final class CppBackedObjectImpl {

    /* renamed from: a */
    private long f51918a;

    /* renamed from: b */
    private int f51919b;

    private CppBackedObjectImpl(long j) {
        this.f51918a = j;
    }

    /* renamed from: a */
    public static CppBackedObjectImpl m35617a(long j) {
        CppBackedObjectImpl cppBackedObjectImpl = new CppBackedObjectImpl(j);
        byte[] nativeRegisterCounterpart = cppBackedObjectImpl.nativeRegisterCounterpart(j);
        try {
            C65699y yVar = (C65699y) C62942bv.parseFrom((C62942bv) C65699y.f178500e, nativeRegisterCounterpart, C62921ba.f169869a);
            if (yVar.f178503b == 0) {
                cppBackedObjectImpl.f51919b = 1;
                return cppBackedObjectImpl;
            }
            throw new C18218av(yVar);
        } catch (C62974ct e) {
            throw C18218av.m35480c(e);
        }
    }

    private native byte[] nativeRegisterCounterpart(long j);

    private native byte[] nativeUnregisterCounterpart(long j);

    private void setDependencyFreedTooEarly() {
        this.f51919b = 3;
    }

    /* renamed from: b */
    public final void mo23761b() {
        C65699y yVar;
        mo23762c();
        byte[] nativeUnregisterCounterpart = nativeUnregisterCounterpart(this.f51918a);
        try {
            yVar = (C65699y) C62942bv.parseFrom((C62942bv) C65699y.f178500e, nativeUnregisterCounterpart, C62921ba.f169869a);
            if (yVar.f178503b != 13) {
                int i = yVar.f178503b;
                if (i == 0) {
                    this.f51919b = 2;
                    this.f51918a = 0;
                    return;
                }
                String str = yVar.f178504c;
                throw new IllegalStateException("Unexpected status: code=" + i + " message=" + str);
            }
            throw new IllegalStateException(yVar.f178504c);
        } catch (C62974ct unused) {
            yVar = C18219aw.m35483a();
        }
    }

    /* renamed from: c */
    public final void mo23762c() {
        int i = this.f51919b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            throw new IllegalStateException("Object already disposed.");
        } else if (i2 == 2) {
            throw new IllegalStateException("C++ object disposed before Java counterpart.");
        }
    }
}
