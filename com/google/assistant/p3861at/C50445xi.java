package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.xi */
/* compiled from: PG */
public final class C50445xi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50445xi f131294b;

    /* renamed from: d */
    private static volatile C63010eb f131295d;

    /* renamed from: a */
    public C50402vt f131296a;

    /* renamed from: c */
    private int f131297c;

    static {
        C50445xi xiVar = new C50445xi();
        f131294b = xiVar;
        C62942bv.registerDefaultInstance(C50445xi.class, xiVar);
    }

    private C50445xi() {
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
                return newMessageInfo(f131294b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50445xi();
            case 4:
                return new C50444xh();
            case 5:
                return f131294b;
            case 6:
                C63010eb ebVar = f131295d;
                if (ebVar == null) {
                    synchronized (C50445xi.class) {
                        ebVar = f131295d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131294b);
                            f131295d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
