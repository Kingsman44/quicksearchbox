package com.google.android.libraries.componentview.components.p1682a.p1683a;

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

/* renamed from: com.google.android.libraries.componentview.components.a.a.z */
/* compiled from: PG */
public final class C19781z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19781z f55275b;

    /* renamed from: c */
    public static final C62940bt f55276c;

    /* renamed from: e */
    private static volatile C63010eb f55277e;

    /* renamed from: a */
    public C62971cq f55278a = emptyProtobufList();

    /* renamed from: d */
    private byte f55279d = 2;

    static {
        C19781z zVar = new C19781z();
        f55275b = zVar;
        C62942bv.registerDefaultInstance(C19781z.class, zVar);
        f55276c = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, zVar, zVar, (C62958ce) null, 188943159, C63066gd.MESSAGE, C19781z.class);
    }

    private C19781z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55279d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55279d = b;
                return null;
            case 2:
                return newMessageInfo(f55275b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C56425d.class});
            case 3:
                return new C19781z();
            case 4:
                return new C19780y();
            case 5:
                return f55275b;
            case 6:
                C63010eb ebVar = f55277e;
                if (ebVar == null) {
                    synchronized (C19781z.class) {
                        ebVar = f55277e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55275b);
                            f55277e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
