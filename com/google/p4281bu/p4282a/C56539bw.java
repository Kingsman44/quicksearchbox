package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bw */
/* compiled from: PG */
public final class C56539bw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56539bw f150979c;

    /* renamed from: d */
    private static volatile C63010eb f150980d;

    /* renamed from: a */
    public C62971cq f150981a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f150982b = C62942bv.emptyProtobufList();

    static {
        C56539bw bwVar = new C56539bw();
        f150979c = bwVar;
        C62942bv.registerDefaultInstance(C56539bw.class, bwVar);
    }

    private C56539bw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f150979c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"a", C56538bv.class, "b"});
            case 3:
                return new C56539bw();
            case 4:
                return new C56536bt();
            case 5:
                return f150979c;
            case 6:
                C63010eb ebVar = f150980d;
                if (ebVar == null) {
                    synchronized (C56539bw.class) {
                        ebVar = f150980d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150979c);
                            f150980d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
