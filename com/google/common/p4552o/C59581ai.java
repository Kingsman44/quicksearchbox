package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ai */
/* compiled from: PG */
public final class C59581ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59581ai f158792c;

    /* renamed from: d */
    private static volatile C63010eb f158793d;

    /* renamed from: a */
    public int f158794a;

    /* renamed from: b */
    public boolean f158795b;

    static {
        C59581ai aiVar = new C59581ai();
        f158792c = aiVar;
        C62942bv.registerDefaultInstance(C59581ai.class, aiVar);
    }

    private C59581ai() {
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
                return newMessageInfo(f158792c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59581ai();
            case 4:
                return new C59580ah();
            case 5:
                return f158792c;
            case 6:
                C63010eb ebVar = f158793d;
                if (ebVar == null) {
                    synchronized (C59581ai.class) {
                        ebVar = f158793d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158792c);
                            f158793d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
