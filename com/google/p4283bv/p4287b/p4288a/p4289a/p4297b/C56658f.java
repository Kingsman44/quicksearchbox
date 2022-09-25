package com.google.p4283bv.p4287b.p4288a.p4289a.p4297b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.b.f */
/* compiled from: PG */
public final class C56658f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56658f f151251c;

    /* renamed from: e */
    private static volatile C63010eb f151252e;

    /* renamed from: a */
    public String f151253a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f151254b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f151255d;

    static {
        C56658f fVar = new C56658f();
        f151251c = fVar;
        C62942bv.registerDefaultInstance(C56658f.class, fVar);
    }

    private C56658f() {
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
                return newMessageInfo(f151251c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C56658f();
            case 4:
                return new C56657e();
            case 5:
                return f151251c;
            case 6:
                C63010eb ebVar = f151252e;
                if (ebVar == null) {
                    synchronized (C56658f.class) {
                        ebVar = f151252e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151251c);
                            f151252e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
