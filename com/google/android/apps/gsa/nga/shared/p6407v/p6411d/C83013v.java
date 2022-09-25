package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.v */
/* compiled from: PG */
public final class C83013v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83013v f226526c;

    /* renamed from: d */
    private static volatile C63010eb f226527d;

    /* renamed from: a */
    public int f226528a;

    /* renamed from: b */
    public int f226529b;

    static {
        C83013v vVar = new C83013v();
        f226526c = vVar;
        C62942bv.registerDefaultInstance(C83013v.class, vVar);
    }

    private C83013v() {
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
                return newMessageInfo(f226526c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C83012u.f226525a});
            case 3:
                return new C83013v();
            case 4:
                return new C83011t();
            case 5:
                return f226526c;
            case 6:
                C63010eb ebVar = f226527d;
                if (ebVar == null) {
                    synchronized (C83013v.class) {
                        ebVar = f226527d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226526c);
                            f226527d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
