package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.p4500cm.p4514b.C58170d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.wg */
/* compiled from: PG */
public final class C88292wg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88292wg f238791c;

    /* renamed from: e */
    private static volatile C63010eb f238792e;

    /* renamed from: a */
    public int f238793a;

    /* renamed from: b */
    public C58170d f238794b;

    /* renamed from: d */
    private byte f238795d = 2;

    static {
        C88292wg wgVar = new C88292wg();
        f238791c = wgVar;
        C62942bv.registerDefaultInstance(C88292wg.class, wgVar);
    }

    private C88292wg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238795d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238795d = b;
                return null;
            case 2:
                return newMessageInfo(f238791c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88292wg();
            case 4:
                return new C88291wf();
            case 5:
                return f238791c;
            case 6:
                C63010eb ebVar = f238792e;
                if (ebVar == null) {
                    synchronized (C88292wg.class) {
                        ebVar = f238792e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238791c);
                            f238792e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
