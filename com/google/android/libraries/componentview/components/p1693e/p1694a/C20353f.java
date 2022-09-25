package com.google.android.libraries.componentview.components.p1693e.p1694a;

import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.e.a.f */
/* compiled from: PG */
public final class C20353f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C20353f f57214a;

    /* renamed from: b */
    public static final C62940bt f57215b;

    /* renamed from: c */
    private static volatile C63010eb f57216c;

    static {
        C20353f fVar = new C20353f();
        f57214a = fVar;
        C62942bv.registerDefaultInstance(C20353f.class, fVar);
        f57215b = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, fVar, fVar, (C62958ce) null, 117883300, C63066gd.MESSAGE, C20353f.class);
    }

    private C20353f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f57214a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C20353f();
            case 4:
                return new C20352e();
            case 5:
                return f57214a;
            case 6:
                C63010eb ebVar = f57216c;
                if (ebVar == null) {
                    synchronized (C20353f.class) {
                        ebVar = f57216c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57214a);
                            f57216c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
