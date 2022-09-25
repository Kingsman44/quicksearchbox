package com.google.common.p4552o.p4554b.p4555a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.z */
/* compiled from: PG */
public final class C59646z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59646z f159917c;

    /* renamed from: d */
    private static volatile C63010eb f159918d;

    /* renamed from: a */
    public int f159919a;

    /* renamed from: b */
    public String f159920b = BuildConfig.FLAVOR;

    static {
        C59646z zVar = new C59646z();
        f159917c = zVar;
        C62942bv.registerDefaultInstance(C59646z.class, zVar);
    }

    private C59646z() {
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
                return newMessageInfo(f159917c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59646z();
            case 4:
                return new C59645y();
            case 5:
                return f159917c;
            case 6:
                C63010eb ebVar = f159918d;
                if (ebVar == null) {
                    synchronized (C59646z.class) {
                        ebVar = f159918d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159917c);
                            f159918d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
