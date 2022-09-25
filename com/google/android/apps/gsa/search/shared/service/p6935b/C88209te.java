package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.search.shared.actions.modular.C87470i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.te */
/* compiled from: PG */
public final class C88209te extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88209te f238431e;

    /* renamed from: g */
    private static volatile C63010eb f238432g;

    /* renamed from: a */
    public int f238433a;

    /* renamed from: b */
    public int f238434b;

    /* renamed from: c */
    public C54946ad f238435c;

    /* renamed from: d */
    public C87470i f238436d;

    /* renamed from: f */
    private byte f238437f = 2;

    static {
        C88209te teVar = new C88209te();
        f238431e = teVar;
        C62942bv.registerDefaultInstance(C88209te.class, teVar);
    }

    private C88209te() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238437f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238437f = b;
                return null;
            case 2:
                return newMessageInfo(f238431e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001င\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88209te();
            case 4:
                return new C88208td();
            case 5:
                return f238431e;
            case 6:
                C63010eb ebVar = f238432g;
                if (ebVar == null) {
                    synchronized (C88209te.class) {
                        ebVar = f238432g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238431e);
                            f238432g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
