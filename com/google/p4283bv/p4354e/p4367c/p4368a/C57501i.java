package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.i */
/* compiled from: PG */
public final class C57501i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57501i f153593f;

    /* renamed from: h */
    private static volatile C63010eb f153594h;

    /* renamed from: a */
    public int f153595a;

    /* renamed from: b */
    public C57499g f153596b;

    /* renamed from: c */
    public C57499g f153597c;

    /* renamed from: d */
    public C62971cq f153598d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f153599e = emptyProtobufList();

    /* renamed from: g */
    private byte f153600g = 2;

    static {
        C57501i iVar = new C57501i();
        f153593f = iVar;
        C62942bv.registerDefaultInstance(C57501i.class, iVar);
    }

    private C57501i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153600g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153600g = b;
                return null;
            case 2:
                return newMessageInfo(f153593f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004Л", new Object[]{"a", "b", C45240c.f118157a, "d", C57503k.class, "e", C57503k.class});
            case 3:
                return new C57501i();
            case 4:
                return new C57500h();
            case 5:
                return f153593f;
            case 6:
                C63010eb ebVar = f153594h;
                if (ebVar == null) {
                    synchronized (C57501i.class) {
                        ebVar = f153594h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153593f);
                            f153594h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
