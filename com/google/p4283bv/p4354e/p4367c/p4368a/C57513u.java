package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.u */
/* compiled from: PG */
public final class C57513u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57513u f153626b;

    /* renamed from: d */
    private static volatile C63010eb f153627d;

    /* renamed from: a */
    public String f153628a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f153629c;

    static {
        C57513u uVar = new C57513u();
        f153626b = uVar;
        C62942bv.registerDefaultInstance(C57513u.class, uVar);
    }

    private C57513u() {
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
                return newMessageInfo(f153626b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57513u();
            case 4:
                return new C57512t();
            case 5:
                return f153626b;
            case 6:
                C63010eb ebVar = f153627d;
                if (ebVar == null) {
                    synchronized (C57513u.class) {
                        ebVar = f153627d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153626b);
                            f153627d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
