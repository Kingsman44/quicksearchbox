package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.ax */
/* compiled from: PG */
public final class C80203ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80203ax f220047c;

    /* renamed from: d */
    private static volatile C63010eb f220048d;

    /* renamed from: a */
    public int f220049a = 0;

    /* renamed from: b */
    public Object f220050b;

    static {
        C80203ax axVar = new C80203ax();
        f220047c = axVar;
        C62942bv.registerDefaultInstance(C80203ax.class, axVar);
    }

    private C80203ax() {
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
                return newMessageInfo(f220047c, "\u0001\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001်\u0000\u0002ဿ\u0000\u0003်\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ျ\u0000\bြ\u0000\t်\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000", new Object[]{"b", "a", C80239cf.f220132a, C80227bu.class, C80199at.class, C80215bi.class, C80236cc.class, C80238ce.class, C80210bd.class, C80242ci.class});
            case 3:
                return new C80203ax();
            case 4:
                return new C80202aw();
            case 5:
                return f220047c;
            case 6:
                C63010eb ebVar = f220048d;
                if (ebVar == null) {
                    synchronized (C80203ax.class) {
                        ebVar = f220048d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220047c);
                            f220048d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
