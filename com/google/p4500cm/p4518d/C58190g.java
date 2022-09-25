package com.google.p4500cm.p4518d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.d.g */
/* compiled from: PG */
public final class C58190g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C58190g f155597d;

    /* renamed from: f */
    private static volatile C63010eb f155598f;

    /* renamed from: a */
    public int f155599a;

    /* renamed from: b */
    public long f155600b;

    /* renamed from: c */
    public C62971cq f155601c = emptyProtobufList();

    /* renamed from: e */
    private byte f155602e = 2;

    static {
        C58190g gVar = new C58190g();
        f155597d = gVar;
        C62942bv.registerDefaultInstance(C58190g.class, gVar);
    }

    private C58190g() {
    }

    /* renamed from: a */
    public final void mo54680a() {
        C62971cq cqVar = this.f155601c;
        if (!cqVar.mo58948c()) {
            this.f155601c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155602e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155602e = b;
                return null;
            case 2:
                return newMessageInfo(f155597d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဂ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C58186c.class});
            case 3:
                return new C58190g();
            case 4:
                return new C58189f();
            case 5:
                return f155597d;
            case 6:
                C63010eb ebVar = f155598f;
                if (ebVar == null) {
                    synchronized (C58190g.class) {
                        ebVar = f155598f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155597d);
                            f155598f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
