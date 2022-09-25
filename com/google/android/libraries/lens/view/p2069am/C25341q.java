package com.google.android.libraries.lens.view.p2069am;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.q */
/* compiled from: PG */
public final class C25341q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C25341q f68965d;

    /* renamed from: e */
    private static volatile C63010eb f68966e;

    /* renamed from: a */
    public int f68967a;

    /* renamed from: b */
    public String f68968b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f68969c = true;

    static {
        C25341q qVar = new C25341q();
        f68965d = qVar;
        C62942bv.registerDefaultInstance(C25341q.class, qVar);
    }

    private C25341q() {
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
                return newMessageInfo(f68965d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C25341q();
            case 4:
                return new C25340p();
            case 5:
                return f68965d;
            case 6:
                C63010eb ebVar = f68966e;
                if (ebVar == null) {
                    synchronized (C25341q.class) {
                        ebVar = f68966e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68965d);
                            f68966e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
