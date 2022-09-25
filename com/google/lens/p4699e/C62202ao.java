package com.google.lens.p4699e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.ao */
/* compiled from: PG */
public final class C62202ao extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62202ao f167942f;

    /* renamed from: g */
    private static volatile C63010eb f167943g;

    /* renamed from: a */
    public int f167944a;

    /* renamed from: b */
    public float f167945b;

    /* renamed from: c */
    public int f167946c;

    /* renamed from: d */
    public String f167947d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f167948e;

    static {
        C62202ao aoVar = new C62202ao();
        f167942f = aoVar;
        C62942bv.registerDefaultInstance(C62202ao.class, aoVar);
    }

    private C62202ao() {
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
                return newMessageInfo(f167942f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C62202ao();
            case 4:
                return new C62201an();
            case 5:
                return f167942f;
            case 6:
                C63010eb ebVar = f167943g;
                if (ebVar == null) {
                    synchronized (C62202ao.class) {
                        ebVar = f167943g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167942f);
                            f167943g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
