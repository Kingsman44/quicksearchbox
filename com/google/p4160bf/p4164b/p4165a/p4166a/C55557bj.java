package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.bj */
/* compiled from: PG */
public final class C55557bj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55557bj f146585b;

    /* renamed from: c */
    private static volatile C63010eb f146586c;

    /* renamed from: a */
    public C62971cq f146587a = emptyProtobufList();

    static {
        C55557bj bjVar = new C55557bj();
        f146585b = bjVar;
        C62942bv.registerDefaultInstance(C55557bj.class, bjVar);
    }

    private C55557bj() {
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
                return newMessageInfo(f146585b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C55556bi.class});
            case 3:
                return new C55557bj();
            case 4:
                return new C55554bg();
            case 5:
                return f146585b;
            case 6:
                C63010eb ebVar = f146586c;
                if (ebVar == null) {
                    synchronized (C55557bj.class) {
                        ebVar = f146586c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146585b);
                            f146586c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
