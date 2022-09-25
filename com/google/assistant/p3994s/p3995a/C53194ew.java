package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ew */
/* compiled from: PG */
public final class C53194ew extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53194ew f139416d;

    /* renamed from: e */
    private static volatile C63010eb f139417e;

    /* renamed from: a */
    public int f139418a;

    /* renamed from: b */
    public String f139419b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139420c = BuildConfig.FLAVOR;

    static {
        C53194ew ewVar = new C53194ew();
        f139416d = ewVar;
        C62942bv.registerDefaultInstance(C53194ew.class, ewVar);
    }

    private C53194ew() {
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
                return newMessageInfo(f139416d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53194ew();
            case 4:
                return new C53193ev();
            case 5:
                return f139416d;
            case 6:
                C63010eb ebVar = f139417e;
                if (ebVar == null) {
                    synchronized (C53194ew.class) {
                        ebVar = f139417e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139416d);
                            f139417e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
