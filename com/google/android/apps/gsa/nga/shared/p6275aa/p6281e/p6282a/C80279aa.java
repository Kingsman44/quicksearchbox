package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.aa */
/* compiled from: PG */
public final class C80279aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80279aa f220294c;

    /* renamed from: d */
    private static volatile C63010eb f220295d;

    /* renamed from: a */
    public int f220296a = 0;

    /* renamed from: b */
    public Object f220297b;

    static {
        C80279aa aaVar = new C80279aa();
        f220294c = aaVar;
        C62942bv.registerDefaultInstance(C80279aa.class, aaVar);
    }

    private C80279aa() {
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
                return newMessageInfo(f220294c, "\u0000\u0002\u0001\u0000\u0007\t\u0002\u0000\u0000\u0000\u0007<\u0000\t<\u0000", new Object[]{"b", "a", C80369z.class, C80367x.class});
            case 3:
                return new C80279aa();
            case 4:
                return new C80365v();
            case 5:
                return f220294c;
            case 6:
                C63010eb ebVar = f220295d;
                if (ebVar == null) {
                    synchronized (C80279aa.class) {
                        ebVar = f220295d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220294c);
                            f220295d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
