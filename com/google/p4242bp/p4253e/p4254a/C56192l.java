package com.google.p4242bp.p4253e.p4254a;

import com.evernote.android.state.BuildConfig;
import com.google.p335a.p336a.C6584f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.e.a.l */
/* compiled from: PG */
public final class C56192l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56192l f149716c;

    /* renamed from: e */
    private static volatile C63010eb f149717e;

    /* renamed from: a */
    public int f149718a;

    /* renamed from: b */
    public String f149719b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f149720d;

    static {
        C56192l lVar = new C56192l();
        f149716c = lVar;
        C62942bv.registerDefaultInstance(C56192l.class, lVar);
    }

    private C56192l() {
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
                return newMessageInfo(f149716c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C6584f.f19579a, "b"});
            case 3:
                return new C56192l();
            case 4:
                return new C56191k();
            case 5:
                return f149716c;
            case 6:
                C63010eb ebVar = f149717e;
                if (ebVar == null) {
                    synchronized (C56192l.class) {
                        ebVar = f149717e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149716c);
                            f149717e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
