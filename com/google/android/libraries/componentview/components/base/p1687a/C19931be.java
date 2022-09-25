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

/* renamed from: com.google.android.libraries.componentview.components.base.a.be */
/* compiled from: PG */
public final class C19931be extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19931be f55772f;

    /* renamed from: g */
    public static final C62940bt f55773g;

    /* renamed from: i */
    private static volatile C63010eb f55774i;

    /* renamed from: a */
    public int f55775a;

    /* renamed from: b */
    public C62971cq f55776b = emptyProtobufList();

    /* renamed from: c */
    public C19916aq f55777c;

    /* renamed from: d */
    public boolean f55778d;

    /* renamed from: e */
    public boolean f55779e;

    /* renamed from: h */
    private byte f55780h = 2;

    static {
        C19931be beVar = new C19931be();
        f55772f = beVar;
        C62942bv.registerDefaultInstance(C19931be.class, beVar);
        f55773g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, beVar, beVar, (C62958ce) null, 109097386, C63066gd.MESSAGE, C19931be.class);
    }

    private C19931be() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55780h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55780h = b;
                return null;
            case 2:
                return newMessageInfo(f55772f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C19931be();
            case 4:
                return new C19930bd();
            case 5:
                return f55772f;
            case 6:
                C63010eb ebVar = f55774i;
                if (ebVar == null) {
                    synchronized (C19931be.class) {
                        ebVar = f55774i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55772f);
                            f55774i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
