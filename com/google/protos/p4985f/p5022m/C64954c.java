package com.google.protos.p4985f.p5022m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.m.c */
/* compiled from: PG */
public final class C64954c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64954c f175904e;

    /* renamed from: f */
    private static volatile C63010eb f175905f;

    /* renamed from: a */
    public int f175906a;

    /* renamed from: b */
    public String f175907b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f175908c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f175909d = BuildConfig.FLAVOR;

    static {
        C64954c cVar = new C64954c();
        f175904e = cVar;
        C62942bv.registerDefaultInstance(C64954c.class, cVar);
    }

    private C64954c() {
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
                return newMessageInfo(f175904e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64954c();
            case 4:
                return new C64953b();
            case 5:
                return f175904e;
            case 6:
                C63010eb ebVar = f175905f;
                if (ebVar == null) {
                    synchronized (C64954c.class) {
                        ebVar = f175905f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175904e);
                            f175905f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
