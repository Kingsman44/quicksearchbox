package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aw */
/* compiled from: PG */
public final class C49838aw extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49838aw f129504g;

    /* renamed from: h */
    private static volatile C63010eb f129505h;

    /* renamed from: a */
    public int f129506a;

    /* renamed from: b */
    public String f129507b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129508c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f129509d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f129510e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f129511f = BuildConfig.FLAVOR;

    static {
        C49838aw awVar = new C49838aw();
        f129504g = awVar;
        C62942bv.registerDefaultInstance(C49838aw.class, awVar);
    }

    private C49838aw() {
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
                return newMessageInfo(f129504g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C49838aw();
            case 4:
                return new C49837av();
            case 5:
                return f129504g;
            case 6:
                C63010eb ebVar = f129505h;
                if (ebVar == null) {
                    synchronized (C49838aw.class) {
                        ebVar = f129505h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129504g);
                            f129505h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
