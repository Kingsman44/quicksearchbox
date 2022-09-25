package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gd */
/* compiled from: PG */
public final class C14355gd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14355gd f43438d;

    /* renamed from: f */
    private static volatile C63010eb f43439f;

    /* renamed from: a */
    public C14603pi f43440a;

    /* renamed from: b */
    public C14603pi f43441b;

    /* renamed from: c */
    public C14603pi f43442c;

    /* renamed from: e */
    private byte f43443e = 2;

    static {
        C14355gd gdVar = new C14355gd();
        f43438d = gdVar;
        C62942bv.registerDefaultInstance(C14355gd.class, gdVar);
    }

    private C14355gd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43443e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43443e = b;
                return null;
            case 2:
                return newMessageInfo(f43438d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001Љ\u0002Љ\u0003Љ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14355gd();
            case 4:
                return new C14354gc();
            case 5:
                return f43438d;
            case 6:
                C63010eb ebVar = f43439f;
                if (ebVar == null) {
                    synchronized (C14355gd.class) {
                        ebVar = f43439f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43438d);
                            f43439f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
