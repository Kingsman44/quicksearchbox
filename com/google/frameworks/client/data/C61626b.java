package com.google.frameworks.client.data;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.frameworks.client.data.b */
/* compiled from: PG */
public final class C61626b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61626b f166504d;

    /* renamed from: e */
    public static final C62940bt f166505e;

    /* renamed from: f */
    private static volatile C63010eb f166506f;

    /* renamed from: a */
    public int f166507a;

    /* renamed from: b */
    public long f166508b;

    /* renamed from: c */
    public C62971cq f166509c = C62942bv.emptyProtobufList();

    static {
        C61626b bVar = new C61626b();
        f166504d = bVar;
        C62942bv.registerDefaultInstance(C61626b.class, bVar);
        f166505e = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, bVar, bVar, (C62958ce) null, 182135729, C63066gd.MESSAGE, C61626b.class);
    }

    private C61626b() {
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
                return newMessageInfo(f166504d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61626b();
            case 4:
                return new C61330a();
            case 5:
                return f166504d;
            case 6:
                C63010eb ebVar = f166506f;
                if (ebVar == null) {
                    synchronized (C61626b.class) {
                        ebVar = f166506f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166504d);
                            f166506f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
