package com.google.android.libraries.componentview.components.base.p1687a;

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

/* renamed from: com.google.android.libraries.componentview.components.base.a.ci */
/* compiled from: PG */
public final class C19962ci extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19962ci f55900e;

    /* renamed from: f */
    public static final C62940bt f55901f;

    /* renamed from: h */
    private static volatile C63010eb f55902h;

    /* renamed from: a */
    public int f55903a;

    /* renamed from: b */
    public C62971cq f55904b = emptyProtobufList();

    /* renamed from: c */
    public C19916aq f55905c;

    /* renamed from: d */
    public boolean f55906d = true;

    /* renamed from: g */
    private byte f55907g = 2;

    static {
        C19962ci ciVar = new C19962ci();
        f55900e = ciVar;
        C62942bv.registerDefaultInstance(C19962ci.class, ciVar);
        f55901f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, ciVar, ciVar, (C62958ce) null, 108390333, C63066gd.MESSAGE, C19962ci.class);
    }

    private C19962ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55907g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55907g = b;
                return null;
            case 2:
                return newMessageInfo(f55900e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d"});
            case 3:
                return new C19962ci();
            case 4:
                return new C19961ch();
            case 5:
                return f55900e;
            case 6:
                C63010eb ebVar = f55902h;
                if (ebVar == null) {
                    synchronized (C19962ci.class) {
                        ebVar = f55902h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55900e);
                            f55902h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
