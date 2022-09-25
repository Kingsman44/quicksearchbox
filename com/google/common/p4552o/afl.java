package com.google.common.p4552o;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afl */
/* compiled from: PG */
public final class afl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final afl f158547d;

    /* renamed from: e */
    private static volatile C63010eb f158548e;

    /* renamed from: a */
    public int f158549a;

    /* renamed from: b */
    public int f158550b;

    /* renamed from: c */
    public C62961ch f158551c = emptyIntList();

    static {
        afl afl = new afl();
        f158547d = afl;
        C62942bv.registerDefaultInstance(afl.class, afl);
    }

    private afl() {
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
                return newMessageInfo(f158547d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"a", "b", C82831ca.m132407b(), C45240c.f118157a, C82835ce.m132410b()});
            case 3:
                return new afl();
            case 4:
                return new afk();
            case 5:
                return f158547d;
            case 6:
                C63010eb ebVar = f158548e;
                if (ebVar == null) {
                    synchronized (afl.class) {
                        ebVar = f158548e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158547d);
                            f158548e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
