package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.f */
/* compiled from: PG */
public final class C55570f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55570f f146622e;

    /* renamed from: f */
    private static volatile C63010eb f146623f;

    /* renamed from: a */
    public int f146624a;

    /* renamed from: b */
    public String f146625b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55526af f146626c;

    /* renamed from: d */
    public C55558bk f146627d;

    static {
        C55570f fVar = new C55570f();
        f146622e = fVar;
        C62942bv.registerDefaultInstance(C55570f.class, fVar);
    }

    private C55570f() {
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
                return newMessageInfo(f146622e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55570f();
            case 4:
                return new C55569e();
            case 5:
                return f146622e;
            case 6:
                C63010eb ebVar = f146623f;
                if (ebVar == null) {
                    synchronized (C55570f.class) {
                        ebVar = f146623f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146622e);
                            f146623f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
