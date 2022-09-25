package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.cc */
/* compiled from: PG */
public final class C57613cc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57613cc f153895b;

    /* renamed from: c */
    private static volatile C63010eb f153896c;

    /* renamed from: a */
    public C62961ch f153897a = emptyIntList();

    static {
        C57613cc ccVar = new C57613cc();
        f153895b = ccVar;
        C62942bv.registerDefaultInstance(C57613cc.class, ccVar);
    }

    private C57613cc() {
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
                return newMessageInfo(f153895b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            case 3:
                return new C57613cc();
            case 4:
                return new C57612cb();
            case 5:
                return f153895b;
            case 6:
                C63010eb ebVar = f153896c;
                if (ebVar == null) {
                    synchronized (C57613cc.class) {
                        ebVar = f153896c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153895b);
                            f153896c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
