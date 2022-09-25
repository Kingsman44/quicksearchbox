package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62480dc;
import com.google.lens.p4707j.C62592z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.be */
/* compiled from: PG */
public final class C56251be extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56251be f149845d;

    /* renamed from: e */
    private static volatile C63010eb f149846e;

    /* renamed from: a */
    public int f149847a;

    /* renamed from: b */
    public C62592z f149848b;

    /* renamed from: c */
    public C62480dc f149849c;

    static {
        C56251be beVar = new C56251be();
        f149845d = beVar;
        C62942bv.registerDefaultInstance(C56251be.class, beVar);
    }

    private C56251be() {
        emptyProtobufList();
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
                return newMessageInfo(f149845d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56251be();
            case 4:
                return new C56250bd();
            case 5:
                return f149845d;
            case 6:
                C63010eb ebVar = f149846e;
                if (ebVar == null) {
                    synchronized (C56251be.class) {
                        ebVar = f149846e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149845d);
                            f149846e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
