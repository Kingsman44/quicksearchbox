package com.google.p395al.p417d.p418a;

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

/* renamed from: com.google.al.d.a.aa */
/* compiled from: PG */
public final class C8521aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8521aa f29558d;

    /* renamed from: e */
    public static final C62940bt f29559e;

    /* renamed from: f */
    private static volatile C63010eb f29560f;

    /* renamed from: a */
    public int f29561a;

    /* renamed from: b */
    public boolean f29562b;

    /* renamed from: c */
    public C62971cq f29563c = C62942bv.emptyProtobufList();

    static {
        C8521aa aaVar = new C8521aa();
        f29558d = aaVar;
        C62942bv.registerDefaultInstance(C8521aa.class, aaVar);
        f29559e = C62942bv.newSingularGeneratedExtension(C8523ac.f29564e, aaVar, aaVar, (C62958ce) null, 105, C63066gd.MESSAGE, C8521aa.class);
    }

    private C8521aa() {
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
                return newMessageInfo(f29558d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8521aa();
            case 4:
                return new C8599z();
            case 5:
                return f29558d;
            case 6:
                C63010eb ebVar = f29560f;
                if (ebVar == null) {
                    synchronized (C8521aa.class) {
                        ebVar = f29560f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29558d);
                            f29560f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
