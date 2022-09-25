package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.n */
/* compiled from: PG */
public final class C137256n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137256n f373416c;

    /* renamed from: e */
    private static volatile C63010eb f373417e;

    /* renamed from: a */
    public C57578av f373418a;

    /* renamed from: b */
    public C57569am f373419b;

    /* renamed from: d */
    private byte f373420d = 2;

    static {
        C137256n nVar = new C137256n();
        f373416c = nVar;
        C62942bv.registerDefaultInstance(C137256n.class, nVar);
    }

    private C137256n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373420d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373420d = b;
                return null;
            case 2:
                return newMessageInfo(f373416c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001Љ\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C137256n();
            case 4:
                return new C137255m();
            case 5:
                return f373416c;
            case 6:
                C63010eb ebVar = f373417e;
                if (ebVar == null) {
                    synchronized (C137256n.class) {
                        ebVar = f373417e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373416c);
                            f373417e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
