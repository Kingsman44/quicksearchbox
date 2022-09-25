package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.me */
/* compiled from: PG */
public final class C60264me extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60264me f163045e;

    /* renamed from: f */
    private static volatile C63010eb f163046f;

    /* renamed from: a */
    public int f163047a;

    /* renamed from: b */
    public int f163048b;

    /* renamed from: c */
    public C60305nr f163049c;

    /* renamed from: d */
    public int f163050d;

    static {
        C60264me meVar = new C60264me();
        f163045e = meVar;
        C62942bv.registerDefaultInstance(C60264me.class, meVar);
    }

    private C60264me() {
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
                return newMessageInfo(f163045e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", C60263md.f163044a, C45240c.f118157a, "d"});
            case 3:
                return new C60264me();
            case 4:
                return new C60262mc();
            case 5:
                return f163045e;
            case 6:
                C63010eb ebVar = f163046f;
                if (ebVar == null) {
                    synchronized (C60264me.class) {
                        ebVar = f163046f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163045e);
                            f163046f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
