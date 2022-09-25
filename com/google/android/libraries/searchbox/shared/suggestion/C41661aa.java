package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.aa */
/* compiled from: PG */
public final class C41661aa extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C41661aa f108926g;

    /* renamed from: h */
    private static volatile C63010eb f108927h;

    /* renamed from: a */
    public int f108928a;

    /* renamed from: b */
    public String f108929b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f108930c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f108931d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f108932e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f108933f = BuildConfig.FLAVOR;

    static {
        C41661aa aaVar = new C41661aa();
        f108926g = aaVar;
        C62942bv.registerDefaultInstance(C41661aa.class, aaVar);
    }

    private C41661aa() {
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
                return newMessageInfo(f108926g, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0007ဈ\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C41661aa();
            case 4:
                return new C41700z();
            case 5:
                return f108926g;
            case 6:
                C63010eb ebVar = f108927h;
                if (ebVar == null) {
                    synchronized (C41661aa.class) {
                        ebVar = f108927h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108926g);
                            f108927h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
