package p5451f.p5452a.p5453a.p5454a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.bo */
/* compiled from: PG */
public final class C69420bo extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C69420bo f185736d;

    /* renamed from: f */
    private static volatile C63010eb f185737f;

    /* renamed from: a */
    public int f185738a;

    /* renamed from: b */
    public int f185739b;

    /* renamed from: c */
    public C62995dn f185740c = C62995dn.f170057a;

    /* renamed from: e */
    private byte f185741e = 2;

    static {
        C69420bo boVar = new C69420bo();
        f185736d = boVar;
        C62942bv.registerDefaultInstance(C69420bo.class, boVar);
    }

    private C69420bo() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f185741e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f185741e = b;
                return null;
            case 2:
                return newMessageInfo(f185736d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001ᔌ\u0000\u00022", new Object[]{"a", "b", C69407bb.f185718a, C45240c.f118157a, C69419bn.f185735a});
            case 3:
                return new C69420bo();
            case 4:
                return new C69418bm();
            case 5:
                return f185736d;
            case 6:
                C63010eb ebVar = f185737f;
                if (ebVar == null) {
                    synchronized (C69420bo.class) {
                        ebVar = f185737f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185736d);
                            f185737f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
