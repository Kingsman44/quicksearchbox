package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bv */
/* compiled from: PG */
public final class C20152bv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C20152bv f56523d;

    /* renamed from: e */
    public static final C62940bt f56524e;

    /* renamed from: g */
    private static volatile C63010eb f56525g;

    /* renamed from: a */
    public int f56526a;

    /* renamed from: b */
    public C56425d f56527b;

    /* renamed from: c */
    public C20154bx f56528c;

    /* renamed from: f */
    private byte f56529f = 2;

    static {
        C20152bv bvVar = new C20152bv();
        f56523d = bvVar;
        C62942bv.registerDefaultInstance(C20152bv.class, bvVar);
        f56524e = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bvVar, bvVar, (C62958ce) null, 116775172, C63066gd.MESSAGE, C20152bv.class);
    }

    private C20152bv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56529f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56529f = b;
                return null;
            case 2:
                return newMessageInfo(f56523d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C20152bv();
            case 4:
                return new C20151bu();
            case 5:
                return f56523d;
            case 6:
                C63010eb ebVar = f56525g;
                if (ebVar == null) {
                    synchronized (C20152bv.class) {
                        ebVar = f56525g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56523d);
                            f56525g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
