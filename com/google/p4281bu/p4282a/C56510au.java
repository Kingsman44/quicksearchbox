package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.au */
/* compiled from: PG */
public final class C56510au extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56510au f150919b;

    /* renamed from: c */
    private static volatile C63010eb f150920c;

    /* renamed from: a */
    public C56513ax f150921a;

    static {
        C56510au auVar = new C56510au();
        f150919b = auVar;
        C62942bv.registerDefaultInstance(C56510au.class, auVar);
    }

    private C56510au() {
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
                return newMessageInfo(f150919b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C56510au();
            case 4:
                return new C56509at();
            case 5:
                return f150919b;
            case 6:
                C63010eb ebVar = f150920c;
                if (ebVar == null) {
                    synchronized (C56510au.class) {
                        ebVar = f150920c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150919b);
                            f150920c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
