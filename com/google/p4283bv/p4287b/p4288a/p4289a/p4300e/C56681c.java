package com.google.p4283bv.p4287b.p4288a.p4289a.p4300e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4887at.p4888a.C63797a;

/* renamed from: com.google.bv.b.a.a.e.c */
/* compiled from: PG */
public final class C56681c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56681c f151292c;

    /* renamed from: e */
    private static volatile C63010eb f151293e;

    /* renamed from: a */
    public int f151294a;

    /* renamed from: b */
    public String f151295b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f151296d;

    static {
        C56681c cVar = new C56681c();
        f151292c = cVar;
        C62942bv.registerDefaultInstance(C56681c.class, cVar);
    }

    private C56681c() {
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
                return newMessageInfo(f151292c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C63797a.f172562a, "b"});
            case 3:
                return new C56681c();
            case 4:
                return new C56680b();
            case 5:
                return f151292c;
            case 6:
                C63010eb ebVar = f151293e;
                if (ebVar == null) {
                    synchronized (C56681c.class) {
                        ebVar = f151293e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151292c);
                            f151293e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
