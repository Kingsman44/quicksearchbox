package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aiu */
/* compiled from: PG */
public final class aiu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aiu f135194c;

    /* renamed from: d */
    private static volatile C63010eb f135195d;

    /* renamed from: a */
    public int f135196a;

    /* renamed from: b */
    public boolean f135197b;

    static {
        aiu aiu = new aiu();
        f135194c = aiu;
        C62942bv.registerDefaultInstance(aiu.class, aiu);
    }

    private aiu() {
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
                return newMessageInfo(f135194c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aiu();
            case 4:
                return new ait();
            case 5:
                return f135194c;
            case 6:
                C63010eb ebVar = f135195d;
                if (ebVar == null) {
                    synchronized (aiu.class) {
                        ebVar = f135195d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135194c);
                            f135195d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
