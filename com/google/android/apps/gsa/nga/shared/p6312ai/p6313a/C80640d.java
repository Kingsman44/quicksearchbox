package com.google.android.apps.gsa.nga.shared.p6312ai.p6313a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ai.a.d */
/* compiled from: PG */
public final class C80640d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80640d f221396c;

    /* renamed from: d */
    private static volatile C63010eb f221397d;

    /* renamed from: a */
    public int f221398a;

    /* renamed from: b */
    public int f221399b;

    static {
        C80640d dVar = new C80640d();
        f221396c = dVar;
        C62942bv.registerDefaultInstance(C80640d.class, dVar);
    }

    private C80640d() {
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
                return newMessageInfo(f221396c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80640d();
            case 4:
                return new C80639c();
            case 5:
                return f221396c;
            case 6:
                C63010eb ebVar = f221397d;
                if (ebVar == null) {
                    synchronized (C80640d.class) {
                        ebVar = f221397d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221396c);
                            f221397d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
