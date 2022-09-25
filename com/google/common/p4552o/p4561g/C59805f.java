package com.google.common.p4552o.p4561g;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.g.f */
/* compiled from: PG */
public final class C59805f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59805f f161622c;

    /* renamed from: d */
    private static volatile C63010eb f161623d;

    /* renamed from: a */
    public int f161624a;

    /* renamed from: b */
    public String f161625b = BuildConfig.FLAVOR;

    static {
        C59805f fVar = new C59805f();
        f161622c = fVar;
        C62942bv.registerDefaultInstance(C59805f.class, fVar);
    }

    private C59805f() {
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
                return newMessageInfo(f161622c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59805f();
            case 4:
                return new C59804e();
            case 5:
                return f161622c;
            case 6:
                C63010eb ebVar = f161623d;
                if (ebVar == null) {
                    synchronized (C59805f.class) {
                        ebVar = f161623d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161622c);
                            f161623d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
