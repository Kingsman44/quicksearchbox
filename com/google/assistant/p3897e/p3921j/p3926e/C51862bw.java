package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51007cy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.bw */
/* compiled from: PG */
public final class C51862bw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51862bw f136037a;

    /* renamed from: e */
    private static volatile C63010eb f136038e;

    /* renamed from: b */
    private int f136039b;

    /* renamed from: c */
    private C51007cy f136040c;

    /* renamed from: d */
    private byte f136041d = 2;

    static {
        C51862bw bwVar = new C51862bw();
        f136037a = bwVar;
        C62942bv.registerDefaultInstance(C51862bw.class, bwVar);
    }

    private C51862bw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136041d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136041d = b;
                return null;
            case 2:
                return newMessageInfo(f136037a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C51862bw();
            case 4:
                return new C51861bv();
            case 5:
                return f136037a;
            case 6:
                C63010eb ebVar = f136038e;
                if (ebVar == null) {
                    synchronized (C51862bw.class) {
                        ebVar = f136038e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136037a);
                            f136038e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
