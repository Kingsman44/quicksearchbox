package com.google.android.apps.gsa.staticplugins.bubble.p7582f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.b */
/* compiled from: PG */
public final class C96982b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C96982b f271034d;

    /* renamed from: e */
    public static final C62940bt f271035e;

    /* renamed from: f */
    private static volatile C63010eb f271036f;

    /* renamed from: a */
    public int f271037a;

    /* renamed from: b */
    public String f271038b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f271039c = BuildConfig.FLAVOR;

    static {
        C96982b bVar = new C96982b();
        f271034d = bVar;
        C62942bv.registerDefaultInstance(C96982b.class, bVar);
        f271035e = C62942bv.newSingularGeneratedExtension(C88474x.f239172h, bVar, bVar, (C62958ce) null, 193208644, C63066gd.MESSAGE, C96982b.class);
    }

    private C96982b() {
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
                return newMessageInfo(f271034d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C96982b();
            case 4:
                return new C96969a();
            case 5:
                return f271034d;
            case 6:
                C63010eb ebVar = f271036f;
                if (ebVar == null) {
                    synchronized (C96982b.class) {
                        ebVar = f271036f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271034d);
                            f271036f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
