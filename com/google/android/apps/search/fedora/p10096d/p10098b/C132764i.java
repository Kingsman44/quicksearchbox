package com.google.android.apps.search.fedora.p10096d.p10098b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.d.b.i */
/* compiled from: PG */
public final class C132764i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132764i f362209c;

    /* renamed from: d */
    private static volatile C63010eb f362210d;

    /* renamed from: a */
    public int f362211a;

    /* renamed from: b */
    public boolean f362212b;

    static {
        C132764i iVar = new C132764i();
        f362209c = iVar;
        C62942bv.registerDefaultInstance(C132764i.class, iVar);
    }

    private C132764i() {
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
                return newMessageInfo(f362209c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C132764i();
            case 4:
                return new C132763h();
            case 5:
                return f362209c;
            case 6:
                C63010eb ebVar = f362210d;
                if (ebVar == null) {
                    synchronized (C132764i.class) {
                        ebVar = f362210d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362209c);
                            f362210d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
