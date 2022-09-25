package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.aa */
/* compiled from: PG */
public final class C119779aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119779aa f333642c;

    /* renamed from: d */
    private static volatile C63010eb f333643d;

    /* renamed from: a */
    public int f333644a;

    /* renamed from: b */
    public C119906y f333645b;

    static {
        C119779aa aaVar = new C119779aa();
        f333642c = aaVar;
        C62942bv.registerDefaultInstance(C119779aa.class, aaVar);
    }

    private C119779aa() {
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
                return newMessageInfo(f333642c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C119779aa();
            case 4:
                return new C119907z();
            case 5:
                return f333642c;
            case 6:
                C63010eb ebVar = f333643d;
                if (ebVar == null) {
                    synchronized (C119779aa.class) {
                        ebVar = f333643d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333642c);
                            f333643d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
