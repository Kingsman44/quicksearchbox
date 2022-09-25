package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.ad */
/* compiled from: PG */
public final class C56493ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f150887e = new C56490aa();

    /* renamed from: f */
    public static final C56493ad f150888f;

    /* renamed from: g */
    private static volatile C63010eb f150889g;

    /* renamed from: a */
    public String f150890a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f150891b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f150892c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62961ch f150893d = emptyIntList();

    static {
        C56493ad adVar = new C56493ad();
        f150888f = adVar;
        C62942bv.registerDefaultInstance(C56493ad.class, adVar);
    }

    private C56493ad() {
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
                return newMessageInfo(f150888f, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56493ad();
            case 4:
                return new C56491ab();
            case 5:
                return f150888f;
            case 6:
                C63010eb ebVar = f150889g;
                if (ebVar == null) {
                    synchronized (C56493ad.class) {
                        ebVar = f150889g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150888f);
                            f150889g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
