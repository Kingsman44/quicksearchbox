package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;

/* renamed from: com.google.protos.aw.a.a.a.a.b.h */
/* compiled from: PG */
public final class C63876h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63876h f172719b;

    /* renamed from: c */
    public static final C62940bt f172720c;

    /* renamed from: e */
    private static volatile C63010eb f172721e;

    /* renamed from: a */
    public String f172722a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f172723d;

    static {
        C63876h hVar = new C63876h();
        f172719b = hVar;
        C62942bv.registerDefaultInstance(C63876h.class, hVar);
        f172720c = C62942bv.newSingularGeneratedExtension(C63955s.f172966b, hVar, hVar, (C62958ce) null, 1005, C63066gd.MESSAGE, C63876h.class);
    }

    private C63876h() {
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
                return newMessageInfo(f172719b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C63876h();
            case 4:
                return new C63875g();
            case 5:
                return f172719b;
            case 6:
                C63010eb ebVar = f172721e;
                if (ebVar == null) {
                    synchronized (C63876h.class) {
                        ebVar = f172721e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172719b);
                            f172721e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
