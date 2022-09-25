package p5602o.p5607c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.y */
/* compiled from: PG */
public final class C71954y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71954y f191649c;

    /* renamed from: d */
    private static volatile C63010eb f191650d;

    /* renamed from: a */
    public int f191651a;

    /* renamed from: b */
    public String f191652b = BuildConfig.FLAVOR;

    static {
        C71954y yVar = new C71954y();
        f191649c = yVar;
        C62942bv.registerDefaultInstance(C71954y.class, yVar);
    }

    private C71954y() {
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
                return newMessageInfo(f191649c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71954y();
            case 4:
                return new C71953x();
            case 5:
                return f191649c;
            case 6:
                C63010eb ebVar = f191650d;
                if (ebVar == null) {
                    synchronized (C71954y.class) {
                        ebVar = f191650d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191649c);
                            f191650d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
