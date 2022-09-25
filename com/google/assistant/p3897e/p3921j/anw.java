package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.anw */
/* compiled from: PG */
public final class anw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final anw f135464d;

    /* renamed from: e */
    private static volatile C63010eb f135465e;

    /* renamed from: a */
    public int f135466a;

    /* renamed from: b */
    public aom f135467b;

    /* renamed from: c */
    public long f135468c;

    static {
        anw anw = new anw();
        f135464d = anw;
        C62942bv.registerDefaultInstance(anw.class, anw);
    }

    private anw() {
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
                return newMessageInfo(f135464d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new anw();
            case 4:
                return new anv();
            case 5:
                return f135464d;
            case 6:
                C63010eb ebVar = f135465e;
                if (ebVar == null) {
                    synchronized (anw.class) {
                        ebVar = f135465e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135464d);
                            f135465e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
