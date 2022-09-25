package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ag */
/* compiled from: PG */
public final class C51819ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51819ag f135952b;

    /* renamed from: d */
    private static volatile C63010eb f135953d;

    /* renamed from: a */
    public String f135954a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f135955c;

    static {
        C51819ag agVar = new C51819ag();
        f135952b = agVar;
        C62942bv.registerDefaultInstance(C51819ag.class, agVar);
    }

    private C51819ag() {
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
                return newMessageInfo(f135952b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51819ag();
            case 4:
                return new C51818af();
            case 5:
                return f135952b;
            case 6:
                C63010eb ebVar = f135953d;
                if (ebVar == null) {
                    synchronized (C51819ag.class) {
                        ebVar = f135953d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135952b);
                            f135953d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
