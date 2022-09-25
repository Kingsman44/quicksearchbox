package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.cm */
/* compiled from: PG */
public final class C19966cm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19966cm f55909d;

    /* renamed from: f */
    private static volatile C63010eb f55910f;

    /* renamed from: a */
    public int f55911a;

    /* renamed from: b */
    public float f55912b;

    /* renamed from: c */
    public float f55913c;

    /* renamed from: e */
    private int f55914e;

    static {
        C19966cm cmVar = new C19966cm();
        f55909d = cmVar;
        C62942bv.registerDefaultInstance(C19966cm.class, cmVar);
    }

    private C19966cm() {
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
                return newMessageInfo(f55909d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"e", "a", C19964ck.f55908a, "b", C45240c.f118157a});
            case 3:
                return new C19966cm();
            case 4:
                return new C19963cj();
            case 5:
                return f55909d;
            case 6:
                C63010eb ebVar = f55910f;
                if (ebVar == null) {
                    synchronized (C19966cm.class) {
                        ebVar = f55910f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55909d);
                            f55910f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
