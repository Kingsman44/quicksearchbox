package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4900a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;

/* renamed from: com.google.protos.aw.a.a.a.a.a.h */
/* compiled from: PG */
public final class C63866h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63866h f172697c;

    /* renamed from: d */
    public static final C62940bt f172698d;

    /* renamed from: f */
    private static volatile C63010eb f172699f;

    /* renamed from: a */
    public String f172700a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f172701b = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f172702e;

    static {
        C63866h hVar = new C63866h();
        f172697c = hVar;
        C62942bv.registerDefaultInstance(C63866h.class, hVar);
        f172698d = C62942bv.newSingularGeneratedExtension(C63944h.f172933b, hVar, hVar, (C62958ce) null, 1006, C63066gd.MESSAGE, C63866h.class);
    }

    private C63866h() {
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
                return newMessageInfo(f172697c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C63866h();
            case 4:
                return new C63865g();
            case 5:
                return f172697c;
            case 6:
                C63010eb ebVar = f172699f;
                if (ebVar == null) {
                    synchronized (C63866h.class) {
                        ebVar = f172699f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172697c);
                            f172699f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
