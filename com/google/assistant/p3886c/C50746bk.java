package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.bk */
/* compiled from: PG */
public final class C50746bk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50746bk f132059b;

    /* renamed from: c */
    public static final C62940bt f132060c;

    /* renamed from: d */
    private static volatile C63010eb f132061d;

    /* renamed from: a */
    public C62971cq f132062a = C62942bv.emptyProtobufList();

    static {
        C50746bk bkVar = new C50746bk();
        f132059b = bkVar;
        C62942bv.registerDefaultInstance(C50746bk.class, bkVar);
        f132060c = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, bkVar, bkVar, (C62958ce) null, 354938225, C63066gd.MESSAGE, C50746bk.class);
    }

    private C50746bk() {
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
                return newMessageInfo(f132059b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C50746bk();
            case 4:
                return new C50745bj();
            case 5:
                return f132059b;
            case 6:
                C63010eb ebVar = f132061d;
                if (ebVar == null) {
                    synchronized (C50746bk.class) {
                        ebVar = f132061d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132059b);
                            f132061d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
