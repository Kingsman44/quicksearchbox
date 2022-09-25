package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: d.b.a.a.ag */
/* compiled from: PG */
public final class C68144ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68144ag f184427b;

    /* renamed from: c */
    private static volatile C63010eb f184428c;

    /* renamed from: a */
    public String f184429a = BuildConfig.FLAVOR;

    static {
        C68144ag agVar = new C68144ag();
        f184427b = agVar;
        C62942bv.registerDefaultInstance(C68144ag.class, agVar);
    }

    private C68144ag() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f184427b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"a"});
            case 3:
                return new C68144ag();
            case 4:
                return new C68143af();
            case 5:
                return f184427b;
            case 6:
                C63010eb ebVar = f184428c;
                if (ebVar == null) {
                    synchronized (C68144ag.class) {
                        ebVar = f184428c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184427b);
                            f184428c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
