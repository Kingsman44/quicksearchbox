package com.google.p4242bp.p4253e.p4254a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.e.a.d */
/* compiled from: PG */
public final class C56184d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56184d f149696c;

    /* renamed from: e */
    private static volatile C63010eb f149697e;

    /* renamed from: a */
    public String f149698a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f149699b;

    /* renamed from: d */
    private int f149700d;

    static {
        C56184d dVar = new C56184d();
        f149696c = dVar;
        C62942bv.registerDefaultInstance(C56184d.class, dVar);
    }

    private C56184d() {
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
                return newMessageInfo(f149696c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C56185e.f149701a});
            case 3:
                return new C56184d();
            case 4:
                return new C56183c();
            case 5:
                return f149696c;
            case 6:
                C63010eb ebVar = f149697e;
                if (ebVar == null) {
                    synchronized (C56184d.class) {
                        ebVar = f149697e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149696c);
                            f149697e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
