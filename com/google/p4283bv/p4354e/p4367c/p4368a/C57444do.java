package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.do */
/* compiled from: PG */
public final class C57444do extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57444do f153440c;

    /* renamed from: e */
    private static volatile C63010eb f153441e;

    /* renamed from: a */
    public C62971cq f153442a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f153443b = emptyProtobufList();

    /* renamed from: d */
    private byte f153444d = 2;

    static {
        C57444do doVar = new C57444do();
        f153440c = doVar;
        C62942bv.registerDefaultInstance(C57444do.class, doVar);
    }

    private C57444do() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153444d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153444d = b;
                return null;
            case 2:
                return newMessageInfo(f153440c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001a\u0002Л", new Object[]{"a", "b", C57442dm.class});
            case 3:
                return new C57444do();
            case 4:
                return new C57443dn();
            case 5:
                return f153440c;
            case 6:
                C63010eb ebVar = f153441e;
                if (ebVar == null) {
                    synchronized (C57444do.class) {
                        ebVar = f153441e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153440c);
                            f153441e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
