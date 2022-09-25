package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.a.a.bs */
/* compiled from: PG */
public final class C48085bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48085bs f124444c;

    /* renamed from: d */
    private static volatile C63010eb f124445d;

    /* renamed from: a */
    public long f124446a;

    /* renamed from: b */
    public C63088z f124447b = C63088z.f170246b;

    static {
        C48085bs bsVar = new C48085bs();
        f124444c = bsVar;
        C62942bv.registerDefaultInstance(C48085bs.class, bsVar);
    }

    private C48085bs() {
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
                return newMessageInfo(f124444c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new C48085bs();
            case 4:
                return new C48084br();
            case 5:
                return f124444c;
            case 6:
                C63010eb ebVar = f124445d;
                if (ebVar == null) {
                    synchronized (C48085bs.class) {
                        ebVar = f124445d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124444c);
                            f124445d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
