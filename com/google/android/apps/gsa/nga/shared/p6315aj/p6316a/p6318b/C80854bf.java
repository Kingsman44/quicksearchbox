package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.bf */
/* compiled from: PG */
public final class C80854bf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80854bf f221795b;

    /* renamed from: c */
    private static volatile C63010eb f221796c;

    /* renamed from: a */
    public boolean f221797a;

    static {
        C80854bf bfVar = new C80854bf();
        f221795b = bfVar;
        C62942bv.registerDefaultInstance(C80854bf.class, bfVar);
    }

    private C80854bf() {
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
                return newMessageInfo(f221795b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C80854bf();
            case 4:
                return new C80853be();
            case 5:
                return f221795b;
            case 6:
                C63010eb ebVar = f221796c;
                if (ebVar == null) {
                    synchronized (C80854bf.class) {
                        ebVar = f221796c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221795b);
                            f221796c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
