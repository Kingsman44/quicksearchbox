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

/* renamed from: com.google.android.libraries.componentview.components.base.a.bq */
/* compiled from: PG */
public final class C19943bq extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19943bq f55812f;

    /* renamed from: g */
    public static final C62940bt f55813g;

    /* renamed from: i */
    private static volatile C63010eb f55814i;

    /* renamed from: a */
    public int f55815a;

    /* renamed from: b */
    public C56425d f55816b;

    /* renamed from: c */
    public C20003z f55817c;

    /* renamed from: d */
    public C20003z f55818d;

    /* renamed from: e */
    public C19945bs f55819e;

    /* renamed from: h */
    private byte f55820h = 2;

    static {
        C19943bq bqVar = new C19943bq();
        f55812f = bqVar;
        C62942bv.registerDefaultInstance(C19943bq.class, bqVar);
        f55813g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bqVar, bqVar, (C62958ce) null, 108390337, C63066gd.MESSAGE, C19943bq.class);
    }

    private C19943bq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55820h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55820h = b;
                return null;
            case 2:
                return newMessageInfo(f55812f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C19943bq();
            case 4:
                return new C19942bp();
            case 5:
                return f55812f;
            case 6:
                C63010eb ebVar = f55814i;
                if (ebVar == null) {
                    synchronized (C19943bq.class) {
                        ebVar = f55814i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55812f);
                            f55814i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
