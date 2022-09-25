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

/* renamed from: com.google.android.libraries.componentview.components.base.a.cw */
/* compiled from: PG */
public final class C19976cw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19976cw f55967e;

    /* renamed from: f */
    public static final C62940bt f55968f;

    /* renamed from: h */
    private static volatile C63010eb f55969h;

    /* renamed from: a */
    public int f55970a;

    /* renamed from: b */
    public C19916aq f55971b;

    /* renamed from: c */
    public C62971cq f55972c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f55973d = emptyProtobufList();

    /* renamed from: g */
    private byte f55974g = 2;

    static {
        C19976cw cwVar = new C19976cw();
        f55967e = cwVar;
        C62942bv.registerDefaultInstance(C19976cw.class, cwVar);
        f55968f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, cwVar, cwVar, (C62958ce) null, 108390329, C63066gd.MESSAGE, C19976cw.class);
    }

    private C19976cw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55974g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55974g = b;
                return null;
            case 2:
                return newMessageInfo(f55967e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဉ\u0000\u0002Л\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C56425d.class, "d", C19975cv.class});
            case 3:
                return new C19976cw();
            case 4:
                return new C19973ct();
            case 5:
                return f55967e;
            case 6:
                C63010eb ebVar = f55969h;
                if (ebVar == null) {
                    synchronized (C19976cw.class) {
                        ebVar = f55969h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55967e);
                            f55969h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
