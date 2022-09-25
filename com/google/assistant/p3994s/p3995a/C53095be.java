package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.s.a.be */
/* compiled from: PG */
public final class C53095be extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53095be f139140g;

    /* renamed from: h */
    private static volatile C63010eb f139141h;

    /* renamed from: a */
    public int f139142a;

    /* renamed from: b */
    public String f139143b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139144c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63042fg f139145d;

    /* renamed from: e */
    public int f139146e;

    /* renamed from: f */
    public String f139147f = BuildConfig.FLAVOR;

    static {
        C53095be beVar = new C53095be();
        f139140g = beVar;
        C62942bv.registerDefaultInstance(C53095be.class, beVar);
    }

    private C53095be() {
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
                return newMessageInfo(f139140g, "\u0001\u0005\u0000\u0001\u0005\t\u0005\u0000\u0000\u0000\u0005ဈ\u0004\u0006ဉ\u0006\u0007ဈ\b\bဈ\u0005\tင\u0007", new Object[]{"a", "b", "d", C10662f.f35572a, C45240c.f118157a, "e"});
            case 3:
                return new C53095be();
            case 4:
                return new C53094bd();
            case 5:
                return f139140g;
            case 6:
                C63010eb ebVar = f139141h;
                if (ebVar == null) {
                    synchronized (C53095be.class) {
                        ebVar = f139141h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139140g);
                            f139141h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
