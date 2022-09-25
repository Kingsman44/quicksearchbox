package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.aqa */
/* compiled from: PG */
public final class aqa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aqa f135600c;

    /* renamed from: d */
    private static volatile C63010eb f135601d;

    /* renamed from: a */
    public int f135602a;

    /* renamed from: b */
    public C63088z f135603b = C63088z.f170246b;

    static {
        aqa aqa = new aqa();
        f135600c = aqa;
        C62942bv.registerDefaultInstance(aqa.class, aqa);
    }

    private aqa() {
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
                return newMessageInfo(f135600c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqa();
            case 4:
                return new apz();
            case 5:
                return f135600c;
            case 6:
                C63010eb ebVar = f135601d;
                if (ebVar == null) {
                    synchronized (aqa.class) {
                        ebVar = f135601d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135600c);
                            f135601d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
