package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.b */
/* compiled from: PG */
public final class C137244b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137244b f373386c;

    /* renamed from: d */
    private static volatile C63010eb f373387d;

    /* renamed from: a */
    public int f373388a;

    /* renamed from: b */
    public C57648i f373389b;

    static {
        C137244b bVar = new C137244b();
        f373386c = bVar;
        C62942bv.registerDefaultInstance(C137244b.class, bVar);
    }

    private C137244b() {
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
                return newMessageInfo(f373386c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C137244b();
            case 4:
                return new C137243a();
            case 5:
                return f373386c;
            case 6:
                C63010eb ebVar = f373387d;
                if (ebVar == null) {
                    synchronized (C137244b.class) {
                        ebVar = f373387d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373386c);
                            f373387d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
