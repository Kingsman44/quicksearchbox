package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jy */
/* compiled from: PG */
public final class C50083jy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50083jy f130208b;

    /* renamed from: d */
    private static volatile C63010eb f130209d;

    /* renamed from: a */
    public boolean f130210a;

    /* renamed from: c */
    private int f130211c;

    static {
        C50083jy jyVar = new C50083jy();
        f130208b = jyVar;
        C62942bv.registerDefaultInstance(C50083jy.class, jyVar);
    }

    private C50083jy() {
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
                return newMessageInfo(f130208b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50083jy();
            case 4:
                return new C50082jx();
            case 5:
                return f130208b;
            case 6:
                C63010eb ebVar = f130209d;
                if (ebVar == null) {
                    synchronized (C50083jy.class) {
                        ebVar = f130209d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130208b);
                            f130209d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
