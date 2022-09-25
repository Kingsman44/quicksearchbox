package com.google.p381aj.p382a.p383a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8217af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.j */
/* compiled from: PG */
public final class C8255j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8255j f28992a;

    /* renamed from: f */
    private static volatile C63010eb f28993f;

    /* renamed from: b */
    private int f28994b;

    /* renamed from: c */
    private C8217af f28995c;

    /* renamed from: d */
    private C8217af f28996d;

    /* renamed from: e */
    private byte f28997e = 2;

    static {
        C8255j jVar = new C8255j();
        f28992a = jVar;
        C62942bv.registerDefaultInstance(C8255j.class, jVar);
    }

    private C8255j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28997e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28997e = b;
                return null;
            case 2:
                return newMessageInfo(f28992a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C8255j();
            case 4:
                return new C8254i();
            case 5:
                return f28992a;
            case 6:
                C63010eb ebVar = f28993f;
                if (ebVar == null) {
                    synchronized (C8255j.class) {
                        ebVar = f28993f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28992a);
                            f28993f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
