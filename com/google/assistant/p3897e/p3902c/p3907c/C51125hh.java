package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.hh */
/* compiled from: PG */
public final class C51125hh extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51125hh f133077g;

    /* renamed from: h */
    private static volatile C63010eb f133078h;

    /* renamed from: a */
    public int f133079a;

    /* renamed from: b */
    public String f133080b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52397qf f133081c;

    /* renamed from: d */
    public C52397qf f133082d;

    /* renamed from: e */
    public boolean f133083e;

    /* renamed from: f */
    public String f133084f = BuildConfig.FLAVOR;

    static {
        C51125hh hhVar = new C51125hh();
        f133077g = hhVar;
        C62942bv.registerDefaultInstance(C51125hh.class, hhVar);
    }

    private C51125hh() {
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
                return newMessageInfo(f133077g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C51125hh();
            case 4:
                return new C51124hg();
            case 5:
                return f133077g;
            case 6:
                C63010eb ebVar = f133078h;
                if (ebVar == null) {
                    synchronized (C51125hh.class) {
                        ebVar = f133078h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133077g);
                            f133078h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
