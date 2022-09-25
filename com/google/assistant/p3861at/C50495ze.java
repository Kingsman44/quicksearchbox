package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ze */
/* compiled from: PG */
public final class C50495ze extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50495ze f131401g;

    /* renamed from: h */
    private static volatile C63010eb f131402h;

    /* renamed from: a */
    public int f131403a;

    /* renamed from: b */
    public String f131404b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131405c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f131406d = 1;

    /* renamed from: e */
    public String f131407e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f131408f;

    static {
        C50495ze zeVar = new C50495ze();
        f131401g = zeVar;
        C62942bv.registerDefaultInstance(C50495ze.class, zeVar);
    }

    private C50495ze() {
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
                return newMessageInfo(f131401g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0005ဈ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", acg.f128848a, "e", C10662f.f35572a});
            case 3:
                return new C50495ze();
            case 4:
                return new C50494zd();
            case 5:
                return f131401g;
            case 6:
                C63010eb ebVar = f131402h;
                if (ebVar == null) {
                    synchronized (C50495ze.class) {
                        ebVar = f131402h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131401g);
                            f131402h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
