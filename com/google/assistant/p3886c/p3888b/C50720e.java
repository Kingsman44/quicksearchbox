package com.google.assistant.p3886c.p3888b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.b.e */
/* compiled from: PG */
public final class C50720e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50720e f131985f;

    /* renamed from: g */
    private static volatile C63010eb f131986g;

    /* renamed from: a */
    public int f131987a;

    /* renamed from: b */
    public String f131988b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f131989c;

    /* renamed from: d */
    public int f131990d;

    /* renamed from: e */
    public boolean f131991e;

    static {
        C50720e eVar = new C50720e();
        f131985f = eVar;
        C62942bv.registerDefaultInstance(C50720e.class, eVar);
    }

    private C50720e() {
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
                return newMessageInfo(f131985f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, C50722g.m85894b(), "d", C50719d.m85892b(), "e"});
            case 3:
                return new C50720e();
            case 4:
                return new C50717b();
            case 5:
                return f131985f;
            case 6:
                C63010eb ebVar = f131986g;
                if (ebVar == null) {
                    synchronized (C50720e.class) {
                        ebVar = f131986g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131985f);
                            f131986g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
