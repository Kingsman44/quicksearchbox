package p5451f.p5452a.p5453a.p5454a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90224d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.ar */
/* compiled from: PG */
public final class C69396ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C69396ar f185678d;

    /* renamed from: g */
    private static volatile C63010eb f185679g;

    /* renamed from: a */
    public int f185680a = 0;

    /* renamed from: b */
    public Object f185681b;

    /* renamed from: c */
    public C69421bp f185682c;

    /* renamed from: e */
    private int f185683e;

    /* renamed from: f */
    private byte f185684f = 2;

    static {
        C69396ar arVar = new C69396ar();
        f185678d = arVar;
        C62942bv.registerDefaultInstance(C69396ar.class, arVar);
    }

    private C69396ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f185684f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f185684f = b;
                return null;
            case 2:
                return newMessageInfo(f185678d, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C69438cf.class, C69400av.class, C69393ao.class, C69391am.class, C69425bt.class, C69459x.class, C90224d.class, C69429bx.class});
            case 3:
                return new C69396ar();
            case 4:
                return new C69394ap();
            case 5:
                return f185678d;
            case 6:
                C63010eb ebVar = f185679g;
                if (ebVar == null) {
                    synchronized (C69396ar.class) {
                        ebVar = f185679g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185678d);
                            f185679g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
