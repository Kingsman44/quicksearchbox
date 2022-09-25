package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.s.a.gv */
/* compiled from: PG */
public final class C53247gv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53247gv f139580b;

    /* renamed from: c */
    public static final C62940bt f139581c;

    /* renamed from: d */
    private static volatile C63010eb f139582d;

    /* renamed from: a */
    public C62971cq f139583a = emptyProtobufList();

    static {
        C53247gv gvVar = new C53247gv();
        f139580b = gvVar;
        C62942bv.registerDefaultInstance(C53247gv.class, gvVar);
        f139581c = C62942bv.newSingularGeneratedExtension(C53153di.f139315c, gvVar, gvVar, (C62958ce) null, 119, C63066gd.MESSAGE, C53247gv.class);
    }

    private C53247gv() {
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
                return newMessageInfo(f139580b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53175ed.class});
            case 3:
                return new C53247gv();
            case 4:
                return new C53246gu();
            case 5:
                return f139580b;
            case 6:
                C63010eb ebVar = f139582d;
                if (ebVar == null) {
                    synchronized (C53247gv.class) {
                        ebVar = f139582d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139580b);
                            f139582d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
