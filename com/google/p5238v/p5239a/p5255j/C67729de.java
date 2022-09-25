package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.de */
/* compiled from: PG */
public final class C67729de extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67729de f183760c;

    /* renamed from: d */
    private static volatile C63010eb f183761d;

    /* renamed from: a */
    public int f183762a;

    /* renamed from: b */
    public C62971cq f183763b = emptyProtobufList();

    static {
        C67729de deVar = new C67729de();
        f183760c = deVar;
        C62942bv.registerDefaultInstance(C67729de.class, deVar);
    }

    private C67729de() {
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
                return newMessageInfo(f183760c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "b", C67728dd.class});
            case 3:
                return new C67729de();
            case 4:
                return new C67726db();
            case 5:
                return f183760c;
            case 6:
                C63010eb ebVar = f183761d;
                if (ebVar == null) {
                    synchronized (C67729de.class) {
                        ebVar = f183761d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183760c);
                            f183761d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
