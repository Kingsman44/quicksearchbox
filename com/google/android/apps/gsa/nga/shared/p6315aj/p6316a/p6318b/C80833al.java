package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.al */
/* compiled from: PG */
public final class C80833al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80833al f221756c;

    /* renamed from: e */
    private static volatile C63010eb f221757e;

    /* renamed from: a */
    public int f221758a = 0;

    /* renamed from: b */
    public Object f221759b;

    /* renamed from: d */
    private byte f221760d = 2;

    static {
        C80833al alVar = new C80833al();
        f221756c = alVar;
        C62942bv.registerDefaultInstance(C80833al.class, alVar);
    }

    private C80833al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221760d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221760d = b;
                return null;
            case 2:
                return newMessageInfo(f221756c, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"b", "a", C80831aj.class, C80838aq.class, C80840as.class, C80836ao.class, C80854bf.class, C80856bh.class, C80858d.class, C80848b.class});
            case 3:
                return new C80833al();
            case 4:
                return new C80832ak();
            case 5:
                return f221756c;
            case 6:
                C63010eb ebVar = f221757e;
                if (ebVar == null) {
                    synchronized (C80833al.class) {
                        ebVar = f221757e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221756c);
                            f221757e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
