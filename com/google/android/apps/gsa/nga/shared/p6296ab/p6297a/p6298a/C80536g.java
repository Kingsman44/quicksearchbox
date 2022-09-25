package com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.a.a.g */
/* compiled from: PG */
public final class C80536g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80536g f221076c;

    /* renamed from: d */
    private static volatile C63010eb f221077d;

    /* renamed from: a */
    public int f221078a = 0;

    /* renamed from: b */
    public Object f221079b;

    static {
        C80536g gVar = new C80536g();
        f221076c = gVar;
        C62942bv.registerDefaultInstance(C80536g.class, gVar);
    }

    private C80536g() {
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
                return newMessageInfo(f221076c, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C80531b.class, C80538i.class, C80533d.class});
            case 3:
                return new C80536g();
            case 4:
                return new C80534e();
            case 5:
                return f221076c;
            case 6:
                C63010eb ebVar = f221077d;
                if (ebVar == null) {
                    synchronized (C80536g.class) {
                        ebVar = f221077d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221076c);
                            f221077d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
