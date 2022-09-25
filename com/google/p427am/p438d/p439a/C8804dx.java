package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.dx */
/* compiled from: PG */
public final class C8804dx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8804dx f30181b;

    /* renamed from: c */
    private static volatile C63010eb f30182c;

    /* renamed from: a */
    public String f30183a = BuildConfig.FLAVOR;

    static {
        C8804dx dxVar = new C8804dx();
        f30181b = dxVar;
        C62942bv.registerDefaultInstance(C8804dx.class, dxVar);
    }

    private C8804dx() {
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
                return newMessageInfo(f30181b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C8804dx();
            case 4:
                return new C8803dw();
            case 5:
                return f30181b;
            case 6:
                C63010eb ebVar = f30182c;
                if (ebVar == null) {
                    synchronized (C8804dx.class) {
                        ebVar = f30182c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30181b);
                            f30182c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
