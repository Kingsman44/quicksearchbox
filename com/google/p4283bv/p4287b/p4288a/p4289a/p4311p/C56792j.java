package com.google.p4283bv.p4287b.p4288a.p4289a.p4311p;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.p.j */
/* compiled from: PG */
public final class C56792j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56792j f151548c;

    /* renamed from: e */
    private static volatile C63010eb f151549e;

    /* renamed from: a */
    public String f151550a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f151551b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f151552d;

    static {
        C56792j jVar = new C56792j();
        f151548c = jVar;
        C62942bv.registerDefaultInstance(C56792j.class, jVar);
    }

    private C56792j() {
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
                return newMessageInfo(f151548c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C56792j();
            case 4:
                return new C56791i();
            case 5:
                return f151548c;
            case 6:
                C63010eb ebVar = f151549e;
                if (ebVar == null) {
                    synchronized (C56792j.class) {
                        ebVar = f151549e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151548c);
                            f151549e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
