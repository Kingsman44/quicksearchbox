package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.bh */
/* compiled from: PG */
public final class C134570bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134570bh f366480d;

    /* renamed from: g */
    private static volatile C63010eb f366481g;

    /* renamed from: a */
    public int f366482a;

    /* renamed from: b */
    public C62971cq f366483b = emptyProtobufList();

    /* renamed from: c */
    public C57696b f366484c;

    /* renamed from: e */
    private C60214n f366485e;

    /* renamed from: f */
    private byte f366486f = 2;

    static {
        C134570bh bhVar = new C134570bh();
        f366480d = bhVar;
        C62942bv.registerDefaultInstance(C134570bh.class, bhVar);
    }

    private C134570bh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366486f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366486f = b;
                return null;
            case 2:
                return newMessageInfo(f366480d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u001b\u0002ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", C134567be.class, "e", C45240c.f118157a});
            case 3:
                return new C134570bh();
            case 4:
                return new C134565bc();
            case 5:
                return f366480d;
            case 6:
                C63010eb ebVar = f366481g;
                if (ebVar == null) {
                    synchronized (C134570bh.class) {
                        ebVar = f366481g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366480d);
                            f366481g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
