package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.aq */
/* compiled from: PG */
public final class C49754aq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49754aq f128481b;

    /* renamed from: e */
    private static volatile C63010eb f128482e;

    /* renamed from: a */
    public C49758au f128483a;

    /* renamed from: c */
    private int f128484c;

    /* renamed from: d */
    private byte f128485d = 2;

    static {
        C49754aq aqVar = new C49754aq();
        f128481b = aqVar;
        C62942bv.registerDefaultInstance(C49754aq.class, aqVar);
    }

    private C49754aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128485d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128485d = b;
                return null;
            case 2:
                return newMessageInfo(f128481b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49754aq();
            case 4:
                return new C49753ap();
            case 5:
                return f128481b;
            case 6:
                C63010eb ebVar = f128482e;
                if (ebVar == null) {
                    synchronized (C49754aq.class) {
                        ebVar = f128482e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128481b);
                            f128482e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
