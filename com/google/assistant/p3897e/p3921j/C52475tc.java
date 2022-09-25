package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.tc */
/* compiled from: PG */
public final class C52475tc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52475tc f137744c;

    /* renamed from: d */
    private static volatile C63010eb f137745d;

    /* renamed from: a */
    public int f137746a;

    /* renamed from: b */
    public boolean f137747b;

    static {
        C52475tc tcVar = new C52475tc();
        f137744c = tcVar;
        C62942bv.registerDefaultInstance(C52475tc.class, tcVar);
    }

    private C52475tc() {
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
                return newMessageInfo(f137744c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52475tc();
            case 4:
                return new C52474tb();
            case 5:
                return f137744c;
            case 6:
                C63010eb ebVar = f137745d;
                if (ebVar == null) {
                    synchronized (C52475tc.class) {
                        ebVar = f137745d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137744c);
                            f137745d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
