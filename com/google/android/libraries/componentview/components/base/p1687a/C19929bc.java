package com.google.android.libraries.componentview.components.base.p1687a;

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

/* renamed from: com.google.android.libraries.componentview.components.base.a.bc */
/* compiled from: PG */
public final class C19929bc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19929bc f55765d;

    /* renamed from: e */
    public static final C62940bt f55766e;

    /* renamed from: g */
    private static volatile C63010eb f55767g;

    /* renamed from: a */
    public int f55768a;

    /* renamed from: b */
    public C19943bq f55769b;

    /* renamed from: c */
    public C19920au f55770c;

    /* renamed from: f */
    private byte f55771f = 2;

    static {
        C19929bc bcVar = new C19929bc();
        f55765d = bcVar;
        C62942bv.registerDefaultInstance(C19929bc.class, bcVar);
        f55766e = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bcVar, bcVar, (C62958ce) null, 109097385, C63066gd.MESSAGE, C19929bc.class);
    }

    private C19929bc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55771f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55771f = b;
                return null;
            case 2:
                return newMessageInfo(f55765d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004ဉ\u0001\u0005ᐉ\u0000", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C19929bc();
            case 4:
                return new C19928bb();
            case 5:
                return f55765d;
            case 6:
                C63010eb ebVar = f55767g;
                if (ebVar == null) {
                    synchronized (C19929bc.class) {
                        ebVar = f55767g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55765d);
                            f55767g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
