package com.google.android.apps.search.googleapp.discover.channels;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.bh */
/* compiled from: PG */
public final class C134146bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134146bh f365429d;

    /* renamed from: f */
    private static volatile C63010eb f365430f;

    /* renamed from: a */
    public int f365431a;

    /* renamed from: b */
    public C57246ba f365432b;

    /* renamed from: c */
    public C57246ba f365433c;

    /* renamed from: e */
    private byte f365434e = 2;

    static {
        C134146bh bhVar = new C134146bh();
        f365429d = bhVar;
        C62942bv.registerDefaultInstance(C134146bh.class, bhVar);
    }

    private C134146bh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f365434e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f365434e = b;
                return null;
            case 2:
                return newMessageInfo(f365429d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134146bh();
            case 4:
                return new C134145bg();
            case 5:
                return f365429d;
            case 6:
                C63010eb ebVar = f365430f;
                if (ebVar == null) {
                    synchronized (C134146bh.class) {
                        ebVar = f365430f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365429d);
                            f365430f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
