package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.aa */
/* compiled from: PG */
public final class C28695aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28695aa f77965b;

    /* renamed from: c */
    private static volatile C63010eb f77966c;

    /* renamed from: a */
    public C62995dn f77967a = C62995dn.f170057a;

    static {
        C28695aa aaVar = new C28695aa();
        f77965b = aaVar;
        C62942bv.registerDefaultInstance(C28695aa.class, aaVar);
    }

    private C28695aa() {
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
                return newMessageInfo(f77965b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C29688z.f80401a});
            case 3:
                return new C28695aa();
            case 4:
                return new C29687y();
            case 5:
                return f77965b;
            case 6:
                C63010eb ebVar = f77966c;
                if (ebVar == null) {
                    synchronized (C28695aa.class) {
                        ebVar = f77966c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77965b);
                            f77966c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
