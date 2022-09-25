package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.bc */
/* compiled from: PG */
public final class C51842bc extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51842bc f135998g;

    /* renamed from: h */
    private static volatile C63010eb f135999h;

    /* renamed from: a */
    public int f136000a;

    /* renamed from: b */
    public long f136001b;

    /* renamed from: c */
    public String f136002c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f136003d;

    /* renamed from: e */
    public String f136004e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f136005f = BuildConfig.FLAVOR;

    static {
        C51842bc bcVar = new C51842bc();
        f135998g = bcVar;
        C62942bv.registerDefaultInstance(C51842bc.class, bcVar);
    }

    private C51842bc() {
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
                return newMessageInfo(f135998g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0006ဌ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C52431rm.m86629c(), "e", C10662f.f35572a});
            case 3:
                return new C51842bc();
            case 4:
                return new C51841bb();
            case 5:
                return f135998g;
            case 6:
                C63010eb ebVar = f135999h;
                if (ebVar == null) {
                    synchronized (C51842bc.class) {
                        ebVar = f135999h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135998g);
                            f135999h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
