package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.f */
/* compiled from: PG */
public final class C137248f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C137248f f373394b;

    /* renamed from: d */
    private static volatile C63010eb f373395d;

    /* renamed from: a */
    public C57578av f373396a;

    /* renamed from: c */
    private byte f373397c = 2;

    static {
        C137248f fVar = new C137248f();
        f373394b = fVar;
        C62942bv.registerDefaultInstance(C137248f.class, fVar);
    }

    private C137248f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373397c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f373397c = b;
                return null;
            case 2:
                return newMessageInfo(f373394b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C137248f();
            case 4:
                return new C137247e();
            case 5:
                return f373394b;
            case 6:
                C63010eb ebVar = f373395d;
                if (ebVar == null) {
                    synchronized (C137248f.class) {
                        ebVar = f373395d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373394b);
                            f373395d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
