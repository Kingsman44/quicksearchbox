package com.google.assistant.p3996t.p3997a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.t.a.d */
/* compiled from: PG */
public final class C53477d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53477d f140352b;

    /* renamed from: c */
    private static volatile C63010eb f140353c;

    /* renamed from: a */
    public C62961ch f140354a = emptyIntList();

    static {
        C53477d dVar = new C53477d();
        f140352b = dVar;
        C62942bv.registerDefaultInstance(C53477d.class, dVar);
    }

    private C53477d() {
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
                return newMessageInfo(f140352b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            case 3:
                return new C53477d();
            case 4:
                return new C53476c();
            case 5:
                return f140352b;
            case 6:
                C63010eb ebVar = f140353c;
                if (ebVar == null) {
                    synchronized (C53477d.class) {
                        ebVar = f140353c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140352b);
                            f140353c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
