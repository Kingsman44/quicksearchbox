package com.google.assistant.p3745ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.l */
/* compiled from: PG */
public final class C48352l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48352l f125017d;

    /* renamed from: e */
    private static volatile C63010eb f125018e;

    /* renamed from: a */
    public C48358n f125019a;

    /* renamed from: b */
    public String f125020b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f125021c;

    static {
        C48352l lVar = new C48352l();
        f125017d = lVar;
        C62942bv.registerDefaultInstance(C48352l.class, lVar);
    }

    private C48352l() {
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
                return newMessageInfo(f125017d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48352l();
            case 4:
                return new C48349k();
            case 5:
                return f125017d;
            case 6:
                C63010eb ebVar = f125018e;
                if (ebVar == null) {
                    synchronized (C48352l.class) {
                        ebVar = f125018e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125017d);
                            f125018e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
