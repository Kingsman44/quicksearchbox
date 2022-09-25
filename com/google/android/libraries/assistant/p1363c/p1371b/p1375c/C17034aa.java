package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.aa */
/* compiled from: PG */
public final class C17034aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17034aa f49636c;

    /* renamed from: d */
    private static volatile C63010eb f49637d;

    /* renamed from: a */
    public int f49638a;

    /* renamed from: b */
    public boolean f49639b;

    static {
        C17034aa aaVar = new C17034aa();
        f49636c = aaVar;
        C62942bv.registerDefaultInstance(C17034aa.class, aaVar);
    }

    private C17034aa() {
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
                return newMessageInfo(f49636c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17034aa();
            case 4:
                return new C17081z();
            case 5:
                return f49636c;
            case 6:
                C63010eb ebVar = f49637d;
                if (ebVar == null) {
                    synchronized (C17034aa.class) {
                        ebVar = f49637d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49636c);
                            f49637d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
