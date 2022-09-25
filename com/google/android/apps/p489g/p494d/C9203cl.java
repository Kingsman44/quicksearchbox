package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57436dg;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.cl */
/* compiled from: PG */
public final class C9203cl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9203cl f31796e;

    /* renamed from: g */
    private static volatile C63010eb f31797g;

    /* renamed from: a */
    public int f31798a;

    /* renamed from: b */
    public C57438di f31799b;

    /* renamed from: c */
    public C57436dg f31800c;

    /* renamed from: d */
    public C62971cq f31801d = emptyProtobufList();

    /* renamed from: f */
    private byte f31802f = 2;

    static {
        C9203cl clVar = new C9203cl();
        f31796e = clVar;
        C62942bv.registerDefaultInstance(C9203cl.class, clVar);
    }

    private C9203cl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31802f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31802f = b;
                return null;
            case 2:
                return newMessageInfo(f31796e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C7669fo.class});
            case 3:
                return new C9203cl();
            case 4:
                return new C9202ck();
            case 5:
                return f31796e;
            case 6:
                C63010eb ebVar = f31797g;
                if (ebVar == null) {
                    synchronized (C9203cl.class) {
                        ebVar = f31797g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31796e);
                            f31797g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
