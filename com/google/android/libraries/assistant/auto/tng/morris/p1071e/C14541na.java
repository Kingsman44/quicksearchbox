package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.na */
/* compiled from: PG */
public final class C14541na extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14541na f43978e;

    /* renamed from: f */
    private static volatile C63010eb f43979f;

    /* renamed from: a */
    public C52686as f43980a;

    /* renamed from: b */
    public String f43981b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f43982c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f43983d;

    static {
        C14541na naVar = new C14541na();
        f43978e = naVar;
        C62942bv.registerDefaultInstance(C14541na.class, naVar);
    }

    private C14541na() {
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
                return newMessageInfo(f43978e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14541na();
            case 4:
                return new C14539mz();
            case 5:
                return f43978e;
            case 6:
                C63010eb ebVar = f43979f;
                if (ebVar == null) {
                    synchronized (C14541na.class) {
                        ebVar = f43979f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43978e);
                            f43979f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
