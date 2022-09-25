package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.d */
/* compiled from: PG */
public final class C137246d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C137246d f373390b;

    /* renamed from: d */
    private static volatile C63010eb f373391d;

    /* renamed from: a */
    public C137250h f373392a;

    /* renamed from: c */
    private byte f373393c = 2;

    static {
        C137246d dVar = new C137246d();
        f373390b = dVar;
        C62942bv.registerDefaultInstance(C137246d.class, dVar);
    }

    private C137246d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373393c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f373393c = b;
                return null;
            case 2:
                return newMessageInfo(f373390b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C137246d();
            case 4:
                return new C137245c();
            case 5:
                return f373390b;
            case 6:
                C63010eb ebVar = f373391d;
                if (ebVar == null) {
                    synchronized (C137246d.class) {
                        ebVar = f373391d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373390b);
                            f373391d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
