package com.google.protos.p4985f.p5007i.p5008a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.i.a.f */
/* compiled from: PG */
public final class C64865f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64865f f175770c;

    /* renamed from: d */
    private static volatile C63010eb f175771d;

    /* renamed from: a */
    public int f175772a;

    /* renamed from: b */
    public String f175773b = BuildConfig.FLAVOR;

    static {
        C64865f fVar = new C64865f();
        f175770c = fVar;
        C62942bv.registerDefaultInstance(C64865f.class, fVar);
    }

    private C64865f() {
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
                return newMessageInfo(f175770c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64865f();
            case 4:
                return new C64864e();
            case 5:
                return f175770c;
            case 6:
                C63010eb ebVar = f175771d;
                if (ebVar == null) {
                    synchronized (C64865f.class) {
                        ebVar = f175771d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175770c);
                            f175771d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
