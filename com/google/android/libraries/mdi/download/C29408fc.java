package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.fc */
/* compiled from: PG */
public final class C29408fc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C29408fc f79727b;

    /* renamed from: c */
    private static volatile C63010eb f79728c;

    /* renamed from: a */
    public C62995dn f79729a = C62995dn.f170057a;

    static {
        C29408fc fcVar = new C29408fc();
        f79727b = fcVar;
        C62942bv.registerDefaultInstance(C29408fc.class, fcVar);
    }

    private C29408fc() {
    }

    /* renamed from: a */
    public final C62995dn mo34711a() {
        C62995dn dnVar = this.f79729a;
        if (!dnVar.f170058b) {
            this.f79729a = dnVar.mo58980a();
        }
        return this.f79729a;
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
                return newMessageInfo(f79727b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C29407fb.f79726a});
            case 3:
                return new C29408fc();
            case 4:
                return new C29406fa();
            case 5:
                return f79727b;
            case 6:
                C63010eb ebVar = f79728c;
                if (ebVar == null) {
                    synchronized (C29408fc.class) {
                        ebVar = f79728c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79727b);
                            f79728c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
