package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ls */
/* compiled from: PG */
public final class C50131ls extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50131ls f130322b;

    /* renamed from: d */
    private static volatile C63010eb f130323d;

    /* renamed from: a */
    public boolean f130324a;

    /* renamed from: c */
    private int f130325c;

    static {
        C50131ls lsVar = new C50131ls();
        f130322b = lsVar;
        C62942bv.registerDefaultInstance(C50131ls.class, lsVar);
    }

    private C50131ls() {
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
                return newMessageInfo(f130322b, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဇ\b", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50131ls();
            case 4:
                return new C50130lr();
            case 5:
                return f130322b;
            case 6:
                C63010eb ebVar = f130323d;
                if (ebVar == null) {
                    synchronized (C50131ls.class) {
                        ebVar = f130323d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130322b);
                            f130323d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
