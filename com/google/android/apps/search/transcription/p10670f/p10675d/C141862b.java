package com.google.android.apps.search.transcription.p10670f.p10675d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.transcription.f.d.b */
/* compiled from: PG */
public final class C141862b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141862b f384956d;

    /* renamed from: e */
    private static volatile C63010eb f384957e;

    /* renamed from: a */
    public int f384958a;

    /* renamed from: b */
    public int f384959b;

    /* renamed from: c */
    public String f384960c = BuildConfig.FLAVOR;

    static {
        C141862b bVar = new C141862b();
        f384956d = bVar;
        C62942bv.registerDefaultInstance(C141862b.class, bVar);
    }

    private C141862b() {
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
                return newMessageInfo(f384956d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141862b();
            case 4:
                return new C141861a();
            case 5:
                return f384956d;
            case 6:
                C63010eb ebVar = f384957e;
                if (ebVar == null) {
                    synchronized (C141862b.class) {
                        ebVar = f384957e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384956d);
                            f384957e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
