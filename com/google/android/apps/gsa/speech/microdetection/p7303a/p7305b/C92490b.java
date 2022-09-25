package com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.b.b */
/* compiled from: PG */
public final class C92490b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C92490b f258114f;

    /* renamed from: g */
    private static volatile C63010eb f258115g;

    /* renamed from: a */
    public int f258116a;

    /* renamed from: b */
    public long f258117b;

    /* renamed from: c */
    public String f258118c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f258119d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f258120e;

    static {
        C92490b bVar = new C92490b();
        f258114f = bVar;
        C62942bv.registerDefaultInstance(C92490b.class, bVar);
    }

    private C92490b() {
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
                return newMessageInfo(f258114f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C92490b();
            case 4:
                return new C92489a();
            case 5:
                return f258114f;
            case 6:
                C63010eb ebVar = f258115g;
                if (ebVar == null) {
                    synchronized (C92490b.class) {
                        ebVar = f258115g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f258114f);
                            f258115g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
