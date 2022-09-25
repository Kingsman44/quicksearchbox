package com.google.protos.p4985f.p5002e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.e.f */
/* compiled from: PG */
public final class C64837f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64837f f175694c;

    /* renamed from: d */
    private static volatile C63010eb f175695d;

    /* renamed from: a */
    public int f175696a;

    /* renamed from: b */
    public String f175697b = BuildConfig.FLAVOR;

    static {
        C64837f fVar = new C64837f();
        f175694c = fVar;
        C62942bv.registerDefaultInstance(C64837f.class, fVar);
    }

    private C64837f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f175694c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64837f();
            case 4:
                return new C64836e();
            case 5:
                return f175694c;
            case 6:
                C63010eb ebVar = f175695d;
                if (ebVar == null) {
                    synchronized (C64837f.class) {
                        ebVar = f175695d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175694c);
                            f175695d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
