package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p417d.p418a.C8590q;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ye */
/* compiled from: PG */
public final class C60662ye extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60662ye f164563d;

    /* renamed from: e */
    private static volatile C63010eb f164564e;

    /* renamed from: a */
    public int f164565a;

    /* renamed from: b */
    public int f164566b;

    /* renamed from: c */
    public int f164567c;

    static {
        C60662ye yeVar = new C60662ye();
        f164563d = yeVar;
        C62942bv.registerDefaultInstance(C60662ye.class, yeVar);
    }

    private C60662ye() {
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
                return newMessageInfo(f164563d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C8590q.m23278c(), C45240c.f118157a, C8590q.m23278c()});
            case 3:
                return new C60662ye();
            case 4:
                return new C60661yd();
            case 5:
                return f164563d;
            case 6:
                C63010eb ebVar = f164564e;
                if (ebVar == null) {
                    synchronized (C60662ye.class) {
                        ebVar = f164564e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164563d);
                            f164564e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
