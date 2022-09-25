package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.l */
/* compiled from: PG */
public final class C65298l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65298l f176620c;

    /* renamed from: d */
    private static volatile C63010eb f176621d;

    /* renamed from: a */
    public int f176622a;

    /* renamed from: b */
    public String f176623b = BuildConfig.FLAVOR;

    static {
        C65298l lVar = new C65298l();
        f176620c = lVar;
        C62942bv.registerDefaultInstance(C65298l.class, lVar);
    }

    private C65298l() {
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
                return newMessageInfo(f176620c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65298l();
            case 4:
                return new C65297k();
            case 5:
                return f176620c;
            case 6:
                C63010eb ebVar = f176621d;
                if (ebVar == null) {
                    synchronized (C65298l.class) {
                        ebVar = f176621d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176620c);
                            f176621d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
