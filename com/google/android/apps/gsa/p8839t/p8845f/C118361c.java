package com.google.android.apps.gsa.p8839t.p8845f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.t.f.c */
/* compiled from: PG */
public final class C118361c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C118361c f328526e;

    /* renamed from: f */
    private static volatile C63010eb f328527f;

    /* renamed from: a */
    public int f328528a;

    /* renamed from: b */
    public boolean f328529b;

    /* renamed from: c */
    public int f328530c;

    /* renamed from: d */
    public String f328531d = BuildConfig.FLAVOR;

    static {
        C118361c cVar = new C118361c();
        f328526e = cVar;
        C62942bv.registerDefaultInstance(C118361c.class, cVar);
    }

    private C118361c() {
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
                return newMessageInfo(f328526e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C53306j.m86810b(), "d"});
            case 3:
                return new C118361c();
            case 4:
                return new C118360b();
            case 5:
                return f328526e;
            case 6:
                C63010eb ebVar = f328527f;
                if (ebVar == null) {
                    synchronized (C118361c.class) {
                        ebVar = f328527f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328526e);
                            f328527f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
