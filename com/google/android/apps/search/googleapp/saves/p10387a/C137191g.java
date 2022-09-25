package com.google.android.apps.search.googleapp.saves.p10387a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.a.g */
/* compiled from: PG */
public final class C137191g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137191g f373305c;

    /* renamed from: e */
    private static volatile C63010eb f373306e;

    /* renamed from: a */
    public long f373307a;

    /* renamed from: b */
    public C57578av f373308b;

    /* renamed from: d */
    private byte f373309d = 2;

    static {
        C137191g gVar = new C137191g();
        f373305c = gVar;
        C62942bv.registerDefaultInstance(C137191g.class, gVar);
    }

    private C137191g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373309d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373309d = b;
                return null;
            case 2:
                return newMessageInfo(f373305c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u0003\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C137191g();
            case 4:
                return new C137190f();
            case 5:
                return f373305c;
            case 6:
                C63010eb ebVar = f373306e;
                if (ebVar == null) {
                    synchronized (C137191g.class) {
                        ebVar = f373306e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373305c);
                            f373306e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
