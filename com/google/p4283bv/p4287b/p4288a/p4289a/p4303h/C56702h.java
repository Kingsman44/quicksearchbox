package com.google.p4283bv.p4287b.p4288a.p4289a.p4303h;

import com.google.p4283bv.p4412k.p4415c.p4416a.C57850h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.h.h */
/* compiled from: PG */
public final class C56702h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56702h f151348c;

    /* renamed from: e */
    private static volatile C63010eb f151349e;

    /* renamed from: a */
    public int f151350a;

    /* renamed from: b */
    public C57850h f151351b;

    /* renamed from: d */
    private byte f151352d = 2;

    static {
        C56702h hVar = new C56702h();
        f151348c = hVar;
        C62942bv.registerDefaultInstance(C56702h.class, hVar);
    }

    private C56702h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151352d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151352d = b;
                return null;
            case 2:
                return newMessageInfo(f151348c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56702h();
            case 4:
                return new C56701g();
            case 5:
                return f151348c;
            case 6:
                C63010eb ebVar = f151349e;
                if (ebVar == null) {
                    synchronized (C56702h.class) {
                        ebVar = f151349e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151348c);
                            f151349e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
