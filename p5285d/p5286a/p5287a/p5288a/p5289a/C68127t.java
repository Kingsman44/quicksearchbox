package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.a.a.a.a.t */
/* compiled from: PG */
public final class C68127t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68127t f184386c;

    /* renamed from: d */
    private static volatile C63010eb f184387d;

    /* renamed from: a */
    public String f184388a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C68121n f184389b;

    static {
        C68127t tVar = new C68127t();
        f184386c = tVar;
        C62942bv.registerDefaultInstance(C68127t.class, tVar);
    }

    private C68127t() {
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
                return newMessageInfo(f184386c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C68127t();
            case 4:
                return new C68126s();
            case 5:
                return f184386c;
            case 6:
                C63010eb ebVar = f184387d;
                if (ebVar == null) {
                    synchronized (C68127t.class) {
                        ebVar = f184387d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184386c);
                            f184387d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
