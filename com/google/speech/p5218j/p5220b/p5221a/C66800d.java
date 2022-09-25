package com.google.speech.p5218j.p5220b.p5221a;

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
import com.google.speech.p5218j.p5219a.C66702af;

/* renamed from: com.google.speech.j.b.a.d */
/* compiled from: PG */
public final class C66800d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66800d f181660d;

    /* renamed from: e */
    public static final C62940bt f181661e;

    /* renamed from: f */
    private static volatile C63010eb f181662f;

    /* renamed from: a */
    public int f181663a;

    /* renamed from: b */
    public float f181664b;

    /* renamed from: c */
    public C62971cq f181665c = emptyProtobufList();

    static {
        C66800d dVar = new C66800d();
        f181660d = dVar;
        C62942bv.registerDefaultInstance(C66800d.class, dVar);
        f181661e = C62942bv.newSingularGeneratedExtension(C66702af.f181445c, dVar, dVar, (C62958ce) null, 249057565, C63066gd.MESSAGE, C66800d.class);
    }

    private C66800d() {
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
                return newMessageInfo(f181660d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ခ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C66799c.class});
            case 3:
                return new C66800d();
            case 4:
                return new C66787a();
            case 5:
                return f181660d;
            case 6:
                C63010eb ebVar = f181662f;
                if (ebVar == null) {
                    synchronized (C66800d.class) {
                        ebVar = f181662f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181660d);
                            f181662f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
