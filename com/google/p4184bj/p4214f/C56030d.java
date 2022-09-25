package com.google.p4184bj.p4214f;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.f.d */
/* compiled from: PG */
public final class C56030d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56030d f149209c;

    /* renamed from: e */
    private static volatile C63010eb f149210e;

    /* renamed from: a */
    public String f149211a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f149212b = emptyProtobufList();

    /* renamed from: d */
    private int f149213d;

    static {
        C56030d dVar = new C56030d();
        f149209c = dVar;
        C62942bv.registerDefaultInstance(C56030d.class, dVar);
    }

    private C56030d() {
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
                return newMessageInfo(f149209c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C56028b.class});
            case 3:
                return new C56030d();
            case 4:
                return new C56029c();
            case 5:
                return f149209c;
            case 6:
                C63010eb ebVar = f149210e;
                if (ebVar == null) {
                    synchronized (C56030d.class) {
                        ebVar = f149210e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149209c);
                            f149210e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
