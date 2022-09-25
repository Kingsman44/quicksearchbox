package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5042u.C65342d;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.s */
/* compiled from: PG */
public final class C80873s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80873s f221822b;

    /* renamed from: d */
    private static volatile C63010eb f221823d;

    /* renamed from: a */
    public C65342d f221824a;

    /* renamed from: c */
    private byte f221825c = 2;

    static {
        C80873s sVar = new C80873s();
        f221822b = sVar;
        C62942bv.registerDefaultInstance(C80873s.class, sVar);
    }

    private C80873s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221825c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f221825c = b;
                return null;
            case 2:
                return newMessageInfo(f221822b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C80873s();
            case 4:
                return new C80872r();
            case 5:
                return f221822b;
            case 6:
                C63010eb ebVar = f221823d;
                if (ebVar == null) {
                    synchronized (C80873s.class) {
                        ebVar = f221823d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221822b);
                            f221823d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
