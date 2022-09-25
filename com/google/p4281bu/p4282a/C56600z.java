package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.z */
/* compiled from: PG */
public final class C56600z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56600z f151115c;

    /* renamed from: d */
    private static volatile C63010eb f151116d;

    /* renamed from: a */
    public C56597w f151117a;

    /* renamed from: b */
    public C56599y f151118b;

    static {
        C56600z zVar = new C56600z();
        f151115c = zVar;
        C62942bv.registerDefaultInstance(C56600z.class, zVar);
    }

    private C56600z() {
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
                return newMessageInfo(f151115c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C56600z();
            case 4:
                return new C56591q();
            case 5:
                return f151115c;
            case 6:
                C63010eb ebVar = f151116d;
                if (ebVar == null) {
                    synchronized (C56600z.class) {
                        ebVar = f151116d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151115c);
                            f151116d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
