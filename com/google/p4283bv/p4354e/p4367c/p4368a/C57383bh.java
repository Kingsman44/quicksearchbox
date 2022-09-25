package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.bh */
/* compiled from: PG */
public final class C57383bh extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C57383bh f153290b;

    /* renamed from: d */
    private static volatile C63010eb f153291d;

    /* renamed from: a */
    public C62971cq f153292a = emptyProtobufList();

    /* renamed from: c */
    private byte f153293c = 2;

    static {
        C57383bh bhVar = new C57383bh();
        f153290b = bhVar;
        C62942bv.registerDefaultInstance(C57383bh.class, bhVar);
    }

    private C57383bh() {
    }

    /* renamed from: a */
    public final void mo54480a() {
        C62971cq cqVar = this.f153292a;
        if (!cqVar.mo58948c()) {
            this.f153292a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153293c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153293c = b;
                return null;
            case 2:
                return newMessageInfo(f153290b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C57376ba.class});
            case 3:
                return new C57383bh();
            case 4:
                return new C57382bg();
            case 5:
                return f153290b;
            case 6:
                C63010eb ebVar = f153291d;
                if (ebVar == null) {
                    synchronized (C57383bh.class) {
                        ebVar = f153291d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153290b);
                            f153291d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
