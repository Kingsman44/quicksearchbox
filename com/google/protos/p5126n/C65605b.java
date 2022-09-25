package com.google.protos.p5126n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.n.b */
/* compiled from: PG */
public final class C65605b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65605b f178308a;

    /* renamed from: b */
    public static final C62940bt f178309b;

    /* renamed from: c */
    private static volatile C63010eb f178310c;

    static {
        C65605b bVar = new C65605b();
        f178308a = bVar;
        C62942bv.registerDefaultInstance(C65605b.class, bVar);
        f178309b = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, bVar, bVar, (C62958ce) null, 109222580, C63066gd.MESSAGE, C65605b.class);
    }

    private C65605b() {
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
                return newMessageInfo(f178308a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65605b();
            case 4:
                return new C65604a();
            case 5:
                return f178308a;
            case 6:
                C63010eb ebVar = f178310c;
                if (ebVar == null) {
                    synchronized (C65605b.class) {
                        ebVar = f178310c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178308a);
                            f178310c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
