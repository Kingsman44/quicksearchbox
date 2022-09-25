package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.bu */
/* compiled from: PG */
public final class C68185bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C68185bu f184497d;

    /* renamed from: e */
    private static volatile C63010eb f184498e;

    /* renamed from: a */
    public String f184499a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f184500b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f184501c = BuildConfig.FLAVOR;

    static {
        C68185bu buVar = new C68185bu();
        f184497d = buVar;
        C62942bv.registerDefaultInstance(C68185bu.class, buVar);
    }

    private C68185bu() {
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
                return newMessageInfo(f184497d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C68185bu();
            case 4:
                return new C68184bt();
            case 5:
                return f184497d;
            case 6:
                C63010eb ebVar = f184498e;
                if (ebVar == null) {
                    synchronized (C68185bu.class) {
                        ebVar = f184498e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184497d);
                            f184498e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
