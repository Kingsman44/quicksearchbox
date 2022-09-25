package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.x */
/* compiled from: PG */
public final class C57663x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57663x f153984d;

    /* renamed from: f */
    private static volatile C63010eb f153985f;

    /* renamed from: a */
    public int f153986a = 0;

    /* renamed from: b */
    public Object f153987b;

    /* renamed from: c */
    public int f153988c;

    /* renamed from: e */
    private byte f153989e = 2;

    static {
        C57663x xVar = new C57663x();
        f153984d = xVar;
        C62942bv.registerDefaultInstance(C57663x.class, xVar);
    }

    private C57663x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153989e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153989e = b;
                return null;
            case 2:
                return newMessageInfo(f153984d, "\u0000\u0011\u0001\u0000\u0001\u0012\u0011\u0000\u0000\u0003\u0001\f\u0002м\u0000\u0003м\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȼ\u0000\bȻ\u0000\t<\u0000\u000bȻ\u0000\fм\u0000\rȻ\u0000\u000eȻ\u0000\u000fȻ\u0000\u0010Ȼ\u0000\u0011Ȼ\u0000\u0012Ȼ\u0000", new Object[]{"b", "a", C45240c.f118157a, C8242v.class, C8213ab.class, C57621ck.class, C57624cn.class});
            case 3:
                return new C57663x();
            case 4:
                return new C57662w();
            case 5:
                return f153984d;
            case 6:
                C63010eb ebVar = f153985f;
                if (ebVar == null) {
                    synchronized (C57663x.class) {
                        ebVar = f153985f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153984d);
                            f153985f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
