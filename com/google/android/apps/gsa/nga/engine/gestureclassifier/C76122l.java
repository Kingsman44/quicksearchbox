package com.google.android.apps.gsa.nga.engine.gestureclassifier;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.gestureclassifier.l */
/* compiled from: PG */
public final class C76122l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C76122l f211055e;

    /* renamed from: g */
    private static volatile C63010eb f211056g;

    /* renamed from: a */
    public int f211057a;

    /* renamed from: b */
    public C76116f f211058b;

    /* renamed from: c */
    public boolean f211059c;

    /* renamed from: d */
    public boolean f211060d;

    /* renamed from: f */
    private byte f211061f = 2;

    static {
        C76122l lVar = new C76122l();
        f211055e = lVar;
        C62942bv.registerDefaultInstance(C76122l.class, lVar);
    }

    private C76122l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f211061f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f211061f = b;
                return null;
            case 2:
                return newMessageInfo(f211055e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C76122l();
            case 4:
                return new C76121k();
            case 5:
                return f211055e;
            case 6:
                C63010eb ebVar = f211056g;
                if (ebVar == null) {
                    synchronized (C76122l.class) {
                        ebVar = f211056g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211055e);
                            f211056g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
