package com.google.lens.p4695b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4699e.C62215ba;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.b.f */
/* compiled from: PG */
public final class C62160f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62160f f167804d;

    /* renamed from: g */
    private static volatile C63010eb f167805g;

    /* renamed from: a */
    public String f167806a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f167807b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62215ba f167808c;

    /* renamed from: e */
    private int f167809e;

    /* renamed from: f */
    private byte f167810f = 2;

    static {
        C62160f fVar = new C62160f();
        f167804d = fVar;
        C62942bv.registerDefaultInstance(C62160f.class, fVar);
    }

    private C62160f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167810f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167810f = b;
                return null;
            case 2:
                return newMessageInfo(f167804d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C62160f();
            case 4:
                return new C62159e();
            case 5:
                return f167804d;
            case 6:
                C63010eb ebVar = f167805g;
                if (ebVar == null) {
                    synchronized (C62160f.class) {
                        ebVar = f167805g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167804d);
                            f167805g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
