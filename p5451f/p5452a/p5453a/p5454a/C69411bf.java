package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.bf */
/* compiled from: PG */
public final class C69411bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69411bf f185719c;

    /* renamed from: e */
    private static volatile C63010eb f185720e;

    /* renamed from: a */
    public int f185721a = 0;

    /* renamed from: b */
    public Object f185722b;

    /* renamed from: d */
    private byte f185723d = 2;

    static {
        C69411bf bfVar = new C69411bf();
        f185719c = bfVar;
        C62942bv.registerDefaultInstance(C69411bf.class, bfVar);
    }

    private C69411bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f185723d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f185723d = b;
                return null;
            case 2:
                return newMessageInfo(f185719c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ဿ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", C69415bj.class, C69407bb.f185718a, C69420bo.class});
            case 3:
                return new C69411bf();
            case 4:
                return new C69409bd();
            case 5:
                return f185719c;
            case 6:
                C63010eb ebVar = f185720e;
                if (ebVar == null) {
                    synchronized (C69411bf.class) {
                        ebVar = f185720e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185719c);
                            f185720e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
