package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.y */
/* compiled from: PG */
public final class C89321y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C89321y f242160c;

    /* renamed from: d */
    private static volatile C63010eb f242161d;

    /* renamed from: a */
    public int f242162a;

    /* renamed from: b */
    public int f242163b;

    static {
        C89321y yVar = new C89321y();
        f242160c = yVar;
        C62942bv.registerDefaultInstance(C89321y.class, yVar);
    }

    private C89321y() {
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
                return newMessageInfo(f242160c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C89321y();
            case 4:
                return new C89320x();
            case 5:
                return f242160c;
            case 6:
                C63010eb ebVar = f242161d;
                if (ebVar == null) {
                    synchronized (C89321y.class) {
                        ebVar = f242161d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242160c);
                            f242161d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
