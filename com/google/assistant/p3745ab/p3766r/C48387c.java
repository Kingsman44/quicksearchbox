package com.google.assistant.p3745ab.p3766r;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14267cx;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.r.c */
/* compiled from: PG */
public final class C48387c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48387c f125069d;

    /* renamed from: e */
    private static volatile C63010eb f125070e;

    /* renamed from: a */
    public int f125071a;

    /* renamed from: b */
    public String f125072b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f125073c;

    static {
        C48387c cVar = new C48387c();
        f125069d = cVar;
        C62942bv.registerDefaultInstance(C48387c.class, cVar);
    }

    private C48387c() {
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
                return newMessageInfo(f125069d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C14267cx.f43163a});
            case 3:
                return new C48387c();
            case 4:
                return new C48386b();
            case 5:
                return f125069d;
            case 6:
                C63010eb ebVar = f125070e;
                if (ebVar == null) {
                    synchronized (C48387c.class) {
                        ebVar = f125070e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125069d);
                            f125070e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
