package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.bw */
/* compiled from: PG */
public final class C68187bw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68187bw f184502b;

    /* renamed from: c */
    private static volatile C63010eb f184503c;

    /* renamed from: a */
    public String f184504a = BuildConfig.FLAVOR;

    static {
        C68187bw bwVar = new C68187bw();
        f184502b = bwVar;
        C62942bv.registerDefaultInstance(C68187bw.class, bwVar);
    }

    private C68187bw() {
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
                return newMessageInfo(f184502b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C68187bw();
            case 4:
                return new C68186bv();
            case 5:
                return f184502b;
            case 6:
                C63010eb ebVar = f184503c;
                if (ebVar == null) {
                    synchronized (C68187bw.class) {
                        ebVar = f184503c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184502b);
                            f184503c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
