package com.google.android.libraries.componentview.components.elements.p1696a;

import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
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

/* renamed from: com.google.android.libraries.componentview.components.elements.a.f */
/* compiled from: PG */
public final class C20381f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20381f f57303f;

    /* renamed from: g */
    public static final C62940bt f57304g;

    /* renamed from: i */
    private static volatile C63010eb f57305i;

    /* renamed from: a */
    public int f57306a;

    /* renamed from: b */
    public C62971cq f57307b = emptyProtobufList();

    /* renamed from: c */
    public int f57308c;

    /* renamed from: d */
    public C19995r f57309d;

    /* renamed from: e */
    public boolean f57310e;

    /* renamed from: h */
    private byte f57311h = 2;

    static {
        C20381f fVar = new C20381f();
        f57303f = fVar;
        C62942bv.registerDefaultInstance(C20381f.class, fVar);
        f57304g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, fVar, fVar, (C62958ce) null, 136648012, C63066gd.MESSAGE, C20381f.class);
    }

    private C20381f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57311h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57311h = b;
                return null;
            case 2:
                return newMessageInfo(f57303f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဉ\u0001\u0006ဇ\u0002", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C20381f();
            case 4:
                return new C20380e();
            case 5:
                return f57303f;
            case 6:
                C63010eb ebVar = f57305i;
                if (ebVar == null) {
                    synchronized (C20381f.class) {
                        ebVar = f57305i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57303f);
                            f57305i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
