package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.f.a.as */
/* compiled from: PG */
public final class C64665as extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64665as f175275b;

    /* renamed from: c */
    public static final C62940bt f175276c;

    /* renamed from: e */
    private static volatile C63010eb f175277e;

    /* renamed from: a */
    public C64657ak f175278a;

    /* renamed from: d */
    private int f175279d;

    static {
        C64665as asVar = new C64665as();
        f175275b = asVar;
        C62942bv.registerDefaultInstance(C64665as.class, asVar);
        f175276c = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, asVar, asVar, (C62958ce) null, 281982535, C63066gd.MESSAGE, C64665as.class);
    }

    private C64665as() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f175275b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"d", "a"});
            case 3:
                return new C64665as();
            case 4:
                return new C64664ar();
            case 5:
                return f175275b;
            case 6:
                C63010eb ebVar = f175277e;
                if (ebVar == null) {
                    synchronized (C64665as.class) {
                        ebVar = f175277e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175275b);
                            f175277e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
