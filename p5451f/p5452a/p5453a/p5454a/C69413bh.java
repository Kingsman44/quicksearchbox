package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.bh */
/* compiled from: PG */
public final class C69413bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69413bh f185724c;

    /* renamed from: d */
    private static volatile C63010eb f185725d;

    /* renamed from: a */
    public int f185726a = 0;

    /* renamed from: b */
    public Object f185727b;

    static {
        C69413bh bhVar = new C69413bh();
        f185724c = bhVar;
        C62942bv.registerDefaultInstance(C69413bh.class, bhVar);
    }

    private C69413bh() {
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
                return newMessageInfo(f185724c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001့\u0000\u0002ံ\u0000\u0003ျ\u0000\u0004်\u0000\u0005ဳ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C69413bh();
            case 4:
                return new C69412bg();
            case 5:
                return f185724c;
            case 6:
                C63010eb ebVar = f185725d;
                if (ebVar == null) {
                    synchronized (C69413bh.class) {
                        ebVar = f185725d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185724c);
                            f185725d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
