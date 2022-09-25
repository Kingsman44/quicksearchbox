package com.google.android.libraries.componentview.components.p1682a.p1683a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.a.a.r */
/* compiled from: PG */
public final class C19773r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19773r f55239e;

    /* renamed from: f */
    public static final C62940bt f55240f;

    /* renamed from: h */
    private static volatile C63010eb f55241h;

    /* renamed from: a */
    public int f55242a;

    /* renamed from: b */
    public C62971cq f55243b = emptyProtobufList();

    /* renamed from: c */
    public int f55244c;

    /* renamed from: d */
    public int f55245d;

    /* renamed from: g */
    private byte f55246g = 2;

    static {
        C19773r rVar = new C19773r();
        f55239e = rVar;
        C62942bv.registerDefaultInstance(C19773r.class, rVar);
        f55240f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, rVar, rVar, (C62958ce) null, 152322674, C63066gd.MESSAGE, C19773r.class);
    }

    private C19773r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55246g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55246g = b;
                return null;
            case 2:
                return newMessageInfo(f55239e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d", C19771p.f55238a});
            case 3:
                return new C19773r();
            case 4:
                return new C19770o();
            case 5:
                return f55239e;
            case 6:
                C63010eb ebVar = f55241h;
                if (ebVar == null) {
                    synchronized (C19773r.class) {
                        ebVar = f55241h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55239e);
                            f55241h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
