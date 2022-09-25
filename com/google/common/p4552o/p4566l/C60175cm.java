package com.google.common.p4552o.p4566l;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.cm */
/* compiled from: PG */
public final class C60175cm extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60175cm f162772g;

    /* renamed from: h */
    private static volatile C63010eb f162773h;

    /* renamed from: a */
    public int f162774a;

    /* renamed from: b */
    public long f162775b;

    /* renamed from: c */
    public long f162776c;

    /* renamed from: d */
    public long f162777d;

    /* renamed from: e */
    public long f162778e;

    /* renamed from: f */
    public boolean f162779f;

    static {
        C60175cm cmVar = new C60175cm();
        f162772g = cmVar;
        C62942bv.registerDefaultInstance(C60175cm.class, cmVar);
    }

    private C60175cm() {
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
                return newMessageInfo(f162772g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0000\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\bဃ\u0006\tဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C60175cm();
            case 4:
                return new C60174cl();
            case 5:
                return f162772g;
            case 6:
                C63010eb ebVar = f162773h;
                if (ebVar == null) {
                    synchronized (C60175cm.class) {
                        ebVar = f162773h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162772g);
                            f162773h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
