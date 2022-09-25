package com.google.android.apps.search.transcription.p10670f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.transcription.f.ay */
/* compiled from: PG */
public final class C141806ay extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141806ay f384845d;

    /* renamed from: e */
    private static volatile C63010eb f384846e;

    /* renamed from: a */
    public int f384847a;

    /* renamed from: b */
    public String f384848b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f384849c = BuildConfig.FLAVOR;

    static {
        C141806ay ayVar = new C141806ay();
        f384845d = ayVar;
        C62942bv.registerDefaultInstance(C141806ay.class, ayVar);
    }

    private C141806ay() {
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
                return newMessageInfo(f384845d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141806ay();
            case 4:
                return new C141805ax();
            case 5:
                return f384845d;
            case 6:
                C63010eb ebVar = f384846e;
                if (ebVar == null) {
                    synchronized (C141806ay.class) {
                        ebVar = f384846e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384845d);
                            f384846e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
