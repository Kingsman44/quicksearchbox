package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.wy */
/* compiled from: PG */
public final class C50434wy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50434wy f131249b;

    /* renamed from: d */
    private static volatile C63010eb f131250d;

    /* renamed from: a */
    public int f131251a = 2;

    /* renamed from: c */
    private int f131252c;

    static {
        C50434wy wyVar = new C50434wy();
        f131249b = wyVar;
        C62942bv.registerDefaultInstance(C50434wy.class, wyVar);
    }

    private C50434wy() {
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
                return newMessageInfo(f131249b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C50432ww.f131248a});
            case 3:
                return new C50434wy();
            case 4:
                return new C50431wv();
            case 5:
                return f131249b;
            case 6:
                C63010eb ebVar = f131250d;
                if (ebVar == null) {
                    synchronized (C50434wy.class) {
                        ebVar = f131250d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131249b);
                            f131250d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
