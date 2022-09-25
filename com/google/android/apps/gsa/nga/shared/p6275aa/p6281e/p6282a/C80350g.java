package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.g */
/* compiled from: PG */
public final class C80350g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80350g f220472c;

    /* renamed from: d */
    private static volatile C63010eb f220473d;

    /* renamed from: a */
    public int f220474a = 0;

    /* renamed from: b */
    public Object f220475b;

    static {
        C80350g gVar = new C80350g();
        f220472c = gVar;
        C62942bv.registerDefaultInstance(C80350g.class, gVar);
    }

    private C80350g() {
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
                return newMessageInfo(f220472c, "\u0000\u0011\u0001\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001:\u0000\u0002Ȼ\u0000\u00037\u0000\u00047\u0000\u00057\u0000\u00065\u0000\u00074\u0000\b3\u0000\t<\u0000\n<\u0000\u000b<\u0000\f=\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", new Object[]{"b", "a", C80348e.class, C80305b.class, C80360q.class, C80356m.class, C80356m.class, C80358o.class, C80354k.class, C80352i.class});
            case 3:
                return new C80350g();
            case 4:
                return new C80349f();
            case 5:
                return f220472c;
            case 6:
                C63010eb ebVar = f220473d;
                if (ebVar == null) {
                    synchronized (C80350g.class) {
                        ebVar = f220473d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220472c);
                            f220473d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
