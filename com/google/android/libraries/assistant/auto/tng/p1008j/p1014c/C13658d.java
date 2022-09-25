package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d */
/* compiled from: PG */
public final class C13658d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13658d f41703c;

    /* renamed from: e */
    private static volatile C63010eb f41704e;

    /* renamed from: a */
    public int f41705a;

    /* renamed from: b */
    public C51715bm f41706b;

    /* renamed from: d */
    private byte f41707d = 2;

    static {
        C13658d dVar = new C13658d();
        f41703c = dVar;
        C62942bv.registerDefaultInstance(C13658d.class, dVar);
    }

    private C13658d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f41707d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f41707d = b;
                return null;
            case 2:
                return newMessageInfo(f41703c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13658d();
            case 4:
                return new C13652c();
            case 5:
                return f41703c;
            case 6:
                C63010eb ebVar = f41704e;
                if (ebVar == null) {
                    synchronized (C13658d.class) {
                        ebVar = f41704e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41703c);
                            f41704e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
