package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.bf */
/* compiled from: PG */
public final class C83644bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83644bf f228009c;

    /* renamed from: d */
    private static volatile C63010eb f228010d;

    /* renamed from: a */
    public int f228011a;

    /* renamed from: b */
    public C52091ex f228012b;

    static {
        C83644bf bfVar = new C83644bf();
        f228009c = bfVar;
        C62942bv.registerDefaultInstance(C83644bf.class, bfVar);
    }

    private C83644bf() {
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
                return newMessageInfo(f228009c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83644bf();
            case 4:
                return new C83643be();
            case 5:
                return f228009c;
            case 6:
                C63010eb ebVar = f228010d;
                if (ebVar == null) {
                    synchronized (C83644bf.class) {
                        ebVar = f228010d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228009c);
                            f228010d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
