package com.google.apps.tiktok.account.data.manager.p3615a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.apps.tiktok.account.data.C46160al;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.data.manager.a.h */
/* compiled from: PG */
public final class C46227h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C46227h f121183e;

    /* renamed from: g */
    private static volatile C63010eb f121184g;

    /* renamed from: a */
    public int f121185a;

    /* renamed from: b */
    public int f121186b;

    /* renamed from: c */
    public C46215j f121187c;

    /* renamed from: d */
    public int f121188d;

    /* renamed from: f */
    private byte f121189f = 2;

    static {
        C46227h hVar = new C46227h();
        f121183e = hVar;
        C62942bv.registerDefaultInstance(C46227h.class, hVar);
    }

    private C46227h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f121189f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f121189f = b;
                return null;
            case 2:
                return newMessageInfo(f121183e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C46160al.f121081a});
            case 3:
                return new C46227h();
            case 4:
                return new C46226g();
            case 5:
                return f121183e;
            case 6:
                C63010eb ebVar = f121184g;
                if (ebVar == null) {
                    synchronized (C46227h.class) {
                        ebVar = f121184g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f121183e);
                            f121184g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
