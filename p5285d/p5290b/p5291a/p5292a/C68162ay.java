package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.ay */
/* compiled from: PG */
public final class C68162ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68162ay f184449b;

    /* renamed from: c */
    private static volatile C63010eb f184450c;

    /* renamed from: a */
    public String f184451a = BuildConfig.FLAVOR;

    static {
        C68162ay ayVar = new C68162ay();
        f184449b = ayVar;
        C62942bv.registerDefaultInstance(C68162ay.class, ayVar);
    }

    private C68162ay() {
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
                return newMessageInfo(f184449b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C68162ay();
            case 4:
                return new C68161ax();
            case 5:
                return f184449b;
            case 6:
                C63010eb ebVar = f184450c;
                if (ebVar == null) {
                    synchronized (C68162ay.class) {
                        ebVar = f184450c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184449b);
                            f184450c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
