package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aoe */
/* compiled from: PG */
public final class aoe extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aoe f135487d;

    /* renamed from: e */
    private static volatile C63010eb f135488e;

    /* renamed from: a */
    public int f135489a;

    /* renamed from: b */
    public aom f135490b;

    /* renamed from: c */
    public long f135491c;

    static {
        aoe aoe = new aoe();
        f135487d = aoe;
        C62942bv.registerDefaultInstance(aoe.class, aoe);
    }

    private aoe() {
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
                return newMessageInfo(f135487d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aoe();
            case 4:
                return new aod();
            case 5:
                return f135487d;
            case 6:
                C63010eb ebVar = f135488e;
                if (ebVar == null) {
                    synchronized (aoe.class) {
                        ebVar = f135488e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135487d);
                            f135488e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
