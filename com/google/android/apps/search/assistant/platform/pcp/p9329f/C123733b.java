package com.google.android.apps.search.assistant.platform.pcp.p9329f;

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

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.b */
/* compiled from: PG */
public final class C123733b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C123733b f341776d;

    /* renamed from: e */
    public static final C62940bt f341777e;

    /* renamed from: f */
    private static volatile C63010eb f341778f;

    /* renamed from: a */
    public int f341779a;

    /* renamed from: b */
    public C123791t f341780b;

    /* renamed from: c */
    public C62971cq f341781c = C62942bv.emptyProtobufList();

    static {
        C123733b bVar = new C123733b();
        f341776d = bVar;
        C62942bv.registerDefaultInstance(C123733b.class, bVar);
        f341777e = C62942bv.newSingularGeneratedExtension(C123777f.f341922a, bVar, bVar, (C62958ce) null, 369646014, C63066gd.MESSAGE, C123733b.class);
    }

    private C123733b() {
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
                return newMessageInfo(f341776d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C123733b();
            case 4:
                return new C123702a();
            case 5:
                return f341776d;
            case 6:
                C63010eb ebVar = f341778f;
                if (ebVar == null) {
                    synchronized (C123733b.class) {
                        ebVar = f341778f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341776d);
                            f341778f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
