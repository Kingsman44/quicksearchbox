package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.apr */
/* compiled from: PG */
public final class apr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final apr f135577d;

    /* renamed from: e */
    private static volatile C63010eb f135578e;

    /* renamed from: a */
    public int f135579a;

    /* renamed from: b */
    public long f135580b;

    /* renamed from: c */
    public boolean f135581c;

    static {
        apr apr = new apr();
        f135577d = apr;
        C62942bv.registerDefaultInstance(apr.class, apr);
    }

    private apr() {
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
                return newMessageInfo(f135577d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new apr();
            case 4:
                return new apq();
            case 5:
                return f135577d;
            case 6:
                C63010eb ebVar = f135578e;
                if (ebVar == null) {
                    synchronized (apr.class) {
                        ebVar = f135578e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135577d);
                            f135578e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
