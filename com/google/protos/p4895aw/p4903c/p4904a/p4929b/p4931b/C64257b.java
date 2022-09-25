package com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4931b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.b.b.b */
/* compiled from: PG */
public final class C64257b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64257b f173740c;

    /* renamed from: d */
    private static volatile C63010eb f173741d;

    /* renamed from: a */
    public int f173742a;

    /* renamed from: b */
    public String f173743b = BuildConfig.FLAVOR;

    static {
        C64257b bVar = new C64257b();
        f173740c = bVar;
        C62942bv.registerDefaultInstance(C64257b.class, bVar);
    }

    private C64257b() {
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
                return newMessageInfo(f173740c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64257b();
            case 4:
                return new C64256a();
            case 5:
                return f173740c;
            case 6:
                C63010eb ebVar = f173741d;
                if (ebVar == null) {
                    synchronized (C64257b.class) {
                        ebVar = f173741d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173740c);
                            f173741d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
