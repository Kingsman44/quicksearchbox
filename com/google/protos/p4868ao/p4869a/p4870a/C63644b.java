package com.google.protos.p4868ao.p4869a.p4870a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4868ao.p4871b.p4872a.C63647a;
import com.google.protos.p4868ao.p4871b.p4872a.C63649c;
import com.google.protos.p4868ao.p4871b.p4872a.C63651e;
import com.google.protos.p4868ao.p4871b.p4872a.C63652f;

/* renamed from: com.google.protos.ao.a.a.b */
/* compiled from: PG */
public final class C63644b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63644b f172119g;

    /* renamed from: h */
    private static volatile C63010eb f172120h;

    /* renamed from: a */
    public int f172121a;

    /* renamed from: b */
    public int f172122b;

    /* renamed from: c */
    public int f172123c;

    /* renamed from: d */
    public int f172124d;

    /* renamed from: e */
    public int f172125e;

    /* renamed from: f */
    public String f172126f = BuildConfig.FLAVOR;

    static {
        C63644b bVar = new C63644b();
        f172119g = bVar;
        C62942bv.registerDefaultInstance(C63644b.class, bVar);
    }

    private C63644b() {
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
                return newMessageInfo(f172119g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဌ\u0003\u0006ဌ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C63652f.f172134a, C45240c.f118157a, C63649c.f172132a, "d", C63651e.f172133a, "e", C63647a.f172131a, C10662f.f35572a});
            case 3:
                return new C63644b();
            case 4:
                return new C63643a();
            case 5:
                return f172119g;
            case 6:
                C63010eb ebVar = f172120h;
                if (ebVar == null) {
                    synchronized (C63644b.class) {
                        ebVar = f172120h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172119g);
                            f172120h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
