package com.google.p4283bv.p4354e.p4355a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.a.f */
/* compiled from: PG */
public final class C57048f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57048f f152293f;

    /* renamed from: g */
    private static volatile C63010eb f152294g;

    /* renamed from: a */
    public int f152295a;

    /* renamed from: b */
    public String f152296b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f152297c;

    /* renamed from: d */
    public int f152298d;

    /* renamed from: e */
    public boolean f152299e;

    static {
        C57048f fVar = new C57048f();
        f152293f = fVar;
        C62942bv.registerDefaultInstance(C57048f.class, fVar);
    }

    private C57048f() {
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
                return newMessageInfo(f152293f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57048f();
            case 4:
                return new C57047e();
            case 5:
                return f152293f;
            case 6:
                C63010eb ebVar = f152294g;
                if (ebVar == null) {
                    synchronized (C57048f.class) {
                        ebVar = f152294g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152293f);
                            f152294g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
