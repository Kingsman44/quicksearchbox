package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.v */
/* compiled from: PG */
public final class C53811v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53811v f141229c;

    /* renamed from: d */
    private static volatile C63010eb f141230d;

    /* renamed from: a */
    public int f141231a = 0;

    /* renamed from: b */
    public Object f141232b;

    static {
        C53811v vVar = new C53811v();
        f141229c = vVar;
        C62942bv.registerDefaultInstance(C53811v.class, vVar);
    }

    private C53811v() {
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
                return newMessageInfo(f141229c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002်\u0000", new Object[]{"b", "a"});
            case 3:
                return new C53811v();
            case 4:
                return new C53810u();
            case 5:
                return f141229c;
            case 6:
                C63010eb ebVar = f141230d;
                if (ebVar == null) {
                    synchronized (C53811v.class) {
                        ebVar = f141230d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141229c);
                            f141230d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
