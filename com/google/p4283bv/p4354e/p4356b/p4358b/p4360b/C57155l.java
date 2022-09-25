package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.e.b.b.b.l */
/* compiled from: PG */
public final class C57155l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57155l f152582c;

    /* renamed from: g */
    private static volatile C63010eb f152583g;

    /* renamed from: a */
    public C57153j f152584a;

    /* renamed from: b */
    public C62910ar f152585b;

    /* renamed from: d */
    private int f152586d;

    /* renamed from: e */
    private CommandOuterClass$Command f152587e;

    /* renamed from: f */
    private byte f152588f = 2;

    static {
        C57155l lVar = new C57155l();
        f152582c = lVar;
        C62942bv.registerDefaultInstance(C57155l.class, lVar);
    }

    private C57155l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152588f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152588f = b;
                return null;
            case 2:
                return newMessageInfo(f152582c, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"d", "a", "b", "e"});
            case 3:
                return new C57155l();
            case 4:
                return new C57154k();
            case 5:
                return f152582c;
            case 6:
                C63010eb ebVar = f152583g;
                if (ebVar == null) {
                    synchronized (C57155l.class) {
                        ebVar = f152583g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152582c);
                            f152583g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
