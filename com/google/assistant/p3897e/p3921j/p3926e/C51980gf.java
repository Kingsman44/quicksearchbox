package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3838ao.p3839a.p3845e.C49521ae;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5042u.C65346h;

/* renamed from: com.google.assistant.e.j.e.gf */
/* compiled from: PG */
public final class C51980gf extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51980gf f136403g;

    /* renamed from: h */
    private static volatile C63010eb f136404h;

    /* renamed from: a */
    public int f136405a;

    /* renamed from: b */
    public int f136406b;

    /* renamed from: c */
    public String f136407c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f136408d;

    /* renamed from: e */
    public String f136409e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f136410f;

    static {
        C51980gf gfVar = new C51980gf();
        f136403g = gfVar;
        C62942bv.registerDefaultInstance(C51980gf.class, gfVar);
    }

    private C51980gf() {
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
                return newMessageInfo(f136403g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C49521ae.f127761a, C45240c.f118157a, "d", "e", C10662f.f35572a, C65346h.m96673c()});
            case 3:
                return new C51980gf();
            case 4:
                return new C51979ge();
            case 5:
                return f136403g;
            case 6:
                C63010eb ebVar = f136404h;
                if (ebVar == null) {
                    synchronized (C51980gf.class) {
                        ebVar = f136404h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136403g);
                            f136404h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
