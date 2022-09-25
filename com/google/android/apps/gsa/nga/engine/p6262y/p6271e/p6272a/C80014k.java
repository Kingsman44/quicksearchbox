package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
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

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.k */
/* compiled from: PG */
public final class C80014k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80014k f219570d;

    /* renamed from: e */
    public static final C62940bt f219571e;

    /* renamed from: f */
    private static volatile C63010eb f219572f;

    /* renamed from: a */
    public int f219573a;

    /* renamed from: b */
    public C79955bc f219574b;

    /* renamed from: c */
    public C62971cq f219575c = emptyProtobufList();

    static {
        C80014k kVar = new C80014k();
        f219570d = kVar;
        C62942bv.registerDefaultInstance(C80014k.class, kVar);
        f219571e = C62942bv.newSingularGeneratedExtension(C79891m.f218975e, kVar, kVar, (C62958ce) null, 298882222, C63066gd.MESSAGE, C80014k.class);
    }

    private C80014k() {
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
                return newMessageInfo(f219570d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C80006d.class});
            case 3:
                return new C80014k();
            case 4:
                return new C80013j();
            case 5:
                return f219570d;
            case 6:
                C63010eb ebVar = f219572f;
                if (ebVar == null) {
                    synchronized (C80014k.class) {
                        ebVar = f219572f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219570d);
                            f219572f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
