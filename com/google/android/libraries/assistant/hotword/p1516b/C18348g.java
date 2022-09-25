package com.google.android.libraries.assistant.hotword.p1516b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.hotword.b.g */
/* compiled from: PG */
public final class C18348g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C18348g f52035e;

    /* renamed from: f */
    private static volatile C63010eb f52036f;

    /* renamed from: a */
    public int f52037a;

    /* renamed from: b */
    public int f52038b = 16000;

    /* renamed from: c */
    public int f52039c = 1;

    /* renamed from: d */
    public int f52040d = 1;

    static {
        C18348g gVar = new C18348g();
        f52035e = gVar;
        C62942bv.registerDefaultInstance(C18348g.class, gVar);
    }

    private C18348g() {
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
                return newMessageInfo(f52035e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C18347f.f52034a});
            case 3:
                return new C18348g();
            case 4:
                return new C18346e();
            case 5:
                return f52035e;
            case 6:
                C63010eb ebVar = f52036f;
                if (ebVar == null) {
                    synchronized (C18348g.class) {
                        ebVar = f52036f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52035e);
                            f52036f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
