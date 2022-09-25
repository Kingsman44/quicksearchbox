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

/* renamed from: com.google.android.libraries.componentview.components.a.a.t */
/* compiled from: PG */
public final class C19775t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19775t f55247e;

    /* renamed from: f */
    public static final C62940bt f55248f;

    /* renamed from: h */
    private static volatile C63010eb f55249h;

    /* renamed from: a */
    public int f55250a;

    /* renamed from: b */
    public C62971cq f55251b = emptyProtobufList();

    /* renamed from: c */
    public boolean f55252c;

    /* renamed from: d */
    public boolean f55253d;

    /* renamed from: g */
    private byte f55254g = 2;

    static {
        C19775t tVar = new C19775t();
        f55247e = tVar;
        C62942bv.registerDefaultInstance(C19775t.class, tVar);
        f55248f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, tVar, tVar, (C62958ce) null, 150019164, C63066gd.MESSAGE, C19775t.class);
    }

    private C19775t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55254g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55254g = b;
                return null;
            case 2:
                return newMessageInfo(f55247e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d"});
            case 3:
                return new C19775t();
            case 4:
                return new C19774s();
            case 5:
                return f55247e;
            case 6:
                C63010eb ebVar = f55249h;
                if (ebVar == null) {
                    synchronized (C19775t.class) {
                        ebVar = f55249h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55247e);
                            f55249h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
