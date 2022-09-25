package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hh */
/* compiled from: PG */
public final class C52009hh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52009hh f136493d;

    /* renamed from: e */
    private static volatile C63010eb f136494e;

    /* renamed from: a */
    public int f136495a;

    /* renamed from: b */
    public String f136496b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f136497c;

    static {
        C52009hh hhVar = new C52009hh();
        f136493d = hhVar;
        C62942bv.registerDefaultInstance(C52009hh.class, hhVar);
    }

    private C52009hh() {
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
                return newMessageInfo(f136493d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52007hf.f136492a});
            case 3:
                return new C52009hh();
            case 4:
                return new C52006he();
            case 5:
                return f136493d;
            case 6:
                C63010eb ebVar = f136494e;
                if (ebVar == null) {
                    synchronized (C52009hh.class) {
                        ebVar = f136494e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136493d);
                            f136494e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
