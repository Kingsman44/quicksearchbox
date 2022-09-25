package com.google.p4242bp.p4267h;

import com.google.p4152bb.p4153a.C55365pr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.u */
/* compiled from: PG */
public final class C56414u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56414u f150448c;

    /* renamed from: f */
    private static volatile C63010eb f150449f;

    /* renamed from: a */
    public int f150450a;

    /* renamed from: b */
    public C62971cq f150451b = emptyProtobufList();

    /* renamed from: d */
    private int f150452d;

    /* renamed from: e */
    private byte f150453e = 2;

    static {
        C56414u uVar = new C56414u();
        f150448c = uVar;
        C62942bv.registerDefaultInstance(C56414u.class, uVar);
    }

    private C56414u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150453e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150453e = b;
                return null;
            case 2:
                return newMessageInfo(f150448c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л", new Object[]{"d", "a", C56419z.m87987b(), "b", C55365pr.class});
            case 3:
                return new C56414u();
            case 4:
                return new C56413t();
            case 5:
                return f150448c;
            case 6:
                C63010eb ebVar = f150449f;
                if (ebVar == null) {
                    synchronized (C56414u.class) {
                        ebVar = f150449f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150448c);
                            f150449f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
