package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.nk */
/* compiled from: PG */
public final class C88053nk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88053nk f238090c;

    /* renamed from: e */
    private static volatile C63010eb f238091e;

    /* renamed from: a */
    public int f238092a = 0;

    /* renamed from: b */
    public Object f238093b;

    /* renamed from: d */
    private byte f238094d = 2;

    static {
        C88053nk nkVar = new C88053nk();
        f238090c = nkVar;
        C62942bv.registerDefaultInstance(C88053nk.class, nkVar);
    }

    private C88053nk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238094d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238094d = b;
                return null;
            case 2:
                return newMessageInfo(f238090c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"b", "a", C80275dd.class});
            case 3:
                return new C88053nk();
            case 4:
                return new C88052nj();
            case 5:
                return f238090c;
            case 6:
                C63010eb ebVar = f238091e;
                if (ebVar == null) {
                    synchronized (C88053nk.class) {
                        ebVar = f238091e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238090c);
                            f238091e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
