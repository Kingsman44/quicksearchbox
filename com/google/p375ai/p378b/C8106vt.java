package com.google.p375ai.p378b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.vt */
/* compiled from: PG */
public final class C8106vt extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C8106vt f28494a;

    /* renamed from: h */
    private static volatile C63010eb f28495h;

    /* renamed from: b */
    private int f28496b;

    /* renamed from: c */
    private int f28497c = 1;

    /* renamed from: d */
    private int f28498d;

    /* renamed from: e */
    private C7963ql f28499e;

    /* renamed from: f */
    private C63088z f28500f = C63088z.f170246b;

    /* renamed from: g */
    private byte f28501g = 2;

    static {
        C8106vt vtVar = new C8106vt();
        f28494a = vtVar;
        C62942bv.registerDefaultInstance(C8106vt.class, vtVar);
    }

    private C8106vt() {
    }

    /* renamed from: e */
    public static C8106vt m22942e(byte[] bArr, C62921ba baVar) {
        return (C8106vt) C62942bv.parseFrom((C62942bv) f28494a, bArr, baVar);
    }

    /* renamed from: a */
    public final boolean mo17013a() {
        return (this.f28496b & 2) != 0;
    }

    /* renamed from: b */
    public final boolean mo17014b() {
        return (this.f28496b & 4) != 0;
    }

    /* renamed from: c */
    public final C7963ql mo17015c() {
        C7963ql qlVar = this.f28499e;
        return qlVar == null ? C7963ql.f27969i : qlVar;
    }

    /* renamed from: d */
    public final C63088z mo17016d() {
        return this.f28500f;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28501g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28501g = b;
                return null;
            case 2:
                return newMessageInfo(f28494a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"b", C45240c.f118157a, C8104vr.f28493a, "d", C8099vm.f28485a, "e", C10662f.f35572a});
            case 3:
                return new C8106vt();
            case 4:
                return new C8103vq();
            case 5:
                return f28494a;
            case 6:
                C63010eb ebVar = f28495h;
                if (ebVar == null) {
                    synchronized (C8106vt.class) {
                        ebVar = f28495h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28494a);
                            f28495h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    public final int mo17017f() {
        int a = C8105vs.m22941a(this.f28497c);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: g */
    public final int mo17018g() {
        int c = C8100vn.m22939c(this.f28498d);
        if (c == 0) {
            return 1;
        }
        return c;
    }
}
