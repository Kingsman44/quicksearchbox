package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80112b;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ne */
/* compiled from: PG */
public final class C88047ne extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88047ne f238081c;

    /* renamed from: e */
    private static volatile C63010eb f238082e;

    /* renamed from: a */
    public int f238083a = 0;

    /* renamed from: b */
    public Object f238084b;

    /* renamed from: d */
    private byte f238085d = 2;

    static {
        C88047ne neVar = new C88047ne();
        f238081c = neVar;
        C62942bv.registerDefaultInstance(C88047ne.class, neVar);
    }

    private C88047ne() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238085d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238085d = b;
                return null;
            case 2:
                return newMessageInfo(f238081c, "\u0001\b\u0001\u0000\u0003\u0013\b\u0000\u0000\u0002\u0003ြ\u0000\u0007ြ\u0000\tᐼ\u0000\nျ\u0000\u000bြ\u0000\rᐼ\u0000\u0012ြ\u0000\u0013ြ\u0000", new Object[]{"b", "a", C80112b.class, C88368zb.class, C87843fq.class, C87698ag.class, C80136bn.class, C87789dq.class, C87877gx.class});
            case 3:
                return new C88047ne();
            case 4:
                return new C88046nd();
            case 5:
                return f238081c;
            case 6:
                C63010eb ebVar = f238082e;
                if (ebVar == null) {
                    synchronized (C88047ne.class) {
                        ebVar = f238082e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238081c);
                            f238082e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
