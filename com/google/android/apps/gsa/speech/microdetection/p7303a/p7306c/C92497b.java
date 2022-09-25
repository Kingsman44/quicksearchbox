package com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.c.b */
/* compiled from: PG */
public final class C92497b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C92497b f258129f;

    /* renamed from: g */
    private static volatile C63010eb f258130g;

    /* renamed from: a */
    public int f258131a;

    /* renamed from: b */
    public String f258132b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f258133c = 16000;

    /* renamed from: d */
    public int f258134d = 1;

    /* renamed from: e */
    public int f258135e;

    static {
        C92497b bVar = new C92497b();
        f258129f = bVar;
        C62942bv.registerDefaultInstance(C92497b.class, bVar);
    }

    private C92497b() {
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
                return newMessageInfo(f258129f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C92497b();
            case 4:
                return new C92496a();
            case 5:
                return f258129f;
            case 6:
                C63010eb ebVar = f258130g;
                if (ebVar == null) {
                    synchronized (C92497b.class) {
                        ebVar = f258130g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f258129f);
                            f258130g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
