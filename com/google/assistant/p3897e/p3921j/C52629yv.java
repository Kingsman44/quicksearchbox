package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yv */
/* compiled from: PG */
public final class C52629yv extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52629yv f138180g;

    /* renamed from: h */
    private static volatile C63010eb f138181h;

    /* renamed from: a */
    public int f138182a;

    /* renamed from: b */
    public C52625yr f138183b;

    /* renamed from: c */
    public String f138184c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f138185d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f138186e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f138187f = BuildConfig.FLAVOR;

    static {
        C52629yv yvVar = new C52629yv();
        f138180g = yvVar;
        C62942bv.registerDefaultInstance(C52629yv.class, yvVar);
    }

    private C52629yv() {
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
                return newMessageInfo(f138180g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C52629yv();
            case 4:
                return new C52628yu();
            case 5:
                return f138180g;
            case 6:
                C63010eb ebVar = f138181h;
                if (ebVar == null) {
                    synchronized (C52629yv.class) {
                        ebVar = f138181h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138180g);
                            f138181h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
