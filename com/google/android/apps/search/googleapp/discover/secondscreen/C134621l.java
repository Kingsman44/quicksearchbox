package com.google.android.apps.search.googleapp.discover.secondscreen;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57060ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.l */
/* compiled from: PG */
public final class C134621l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134621l f366592c;

    /* renamed from: e */
    private static volatile C63010eb f366593e;

    /* renamed from: a */
    public int f366594a;

    /* renamed from: b */
    public C57060ab f366595b;

    /* renamed from: d */
    private byte f366596d = 2;

    static {
        C134621l lVar = new C134621l();
        f366592c = lVar;
        C62942bv.registerDefaultInstance(C134621l.class, lVar);
    }

    private C134621l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366596d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366596d = b;
                return null;
            case 2:
                return newMessageInfo(f366592c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134621l();
            case 4:
                return new C134620k();
            case 5:
                return f366592c;
            case 6:
                C63010eb ebVar = f366593e;
                if (ebVar == null) {
                    synchronized (C134621l.class) {
                        ebVar = f366593e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366592c);
                            f366593e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
