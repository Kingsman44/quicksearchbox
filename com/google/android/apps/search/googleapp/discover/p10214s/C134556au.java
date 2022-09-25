package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.au */
/* compiled from: PG */
public final class C134556au extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C134556au f366435f;

    /* renamed from: h */
    private static volatile C63010eb f366436h;

    /* renamed from: a */
    public int f366437a;

    /* renamed from: b */
    public C134558aw f366438b;

    /* renamed from: c */
    public int f366439c;

    /* renamed from: d */
    public C63042fg f366440d;

    /* renamed from: e */
    public C134548am f366441e;

    /* renamed from: g */
    private byte f366442g = 2;

    static {
        C134556au auVar = new C134556au();
        f366435f = auVar;
        C62942bv.registerDefaultInstance(C134556au.class, auVar);
    }

    private C134556au() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366442g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366442g = b;
                return null;
            case 2:
                return newMessageInfo(f366435f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဌ\u0001\u0007ဉ\u0003\tဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, C134555at.m218284b(), "d", "e"});
            case 3:
                return new C134556au();
            case 4:
                return new C134553ar();
            case 5:
                return f366435f;
            case 6:
                C63010eb ebVar = f366436h;
                if (ebVar == null) {
                    synchronized (C134556au.class) {
                        ebVar = f366436h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366435f);
                            f366436h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
