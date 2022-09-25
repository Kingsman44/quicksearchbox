package com.google.p4283bv.p4287b.p4288a.p4289a.p4312q;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.q.d */
/* compiled from: PG */
public final class C56796d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56796d f151566c;

    /* renamed from: e */
    private static volatile C63010eb f151567e;

    /* renamed from: a */
    public String f151568a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f151569b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f151570d;

    static {
        C56796d dVar = new C56796d();
        f151566c = dVar;
        C62942bv.registerDefaultInstance(C56796d.class, dVar);
    }

    private C56796d() {
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
                return newMessageInfo(f151566c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C56796d();
            case 4:
                return new C56795c();
            case 5:
                return f151566c;
            case 6:
                C63010eb ebVar = f151567e;
                if (ebVar == null) {
                    synchronized (C56796d.class) {
                        ebVar = f151567e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151566c);
                            f151567e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
