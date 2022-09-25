package com.google.android.apps.search.googleapp.p10117aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.aa.l */
/* compiled from: PG */
public final class C133127l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C133127l f362932d;

    /* renamed from: e */
    private static volatile C63010eb f362933e;

    /* renamed from: a */
    public int f362934a;

    /* renamed from: b */
    public C62971cq f362935b = emptyProtobufList();

    /* renamed from: c */
    public String f362936c = BuildConfig.FLAVOR;

    static {
        C133127l lVar = new C133127l();
        f362932d = lVar;
        C62942bv.registerDefaultInstance(C133127l.class, lVar);
    }

    private C133127l() {
    }

    /* renamed from: a */
    public final void mo110990a() {
        C62971cq cqVar = this.f362935b;
        if (!cqVar.mo58948c()) {
            this.f362935b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f362932d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", C133125j.class, C45240c.f118157a});
            case 3:
                return new C133127l();
            case 4:
                return new C133126k();
            case 5:
                return f362932d;
            case 6:
                C63010eb ebVar = f362933e;
                if (ebVar == null) {
                    synchronized (C133127l.class) {
                        ebVar = f362933e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362932d);
                            f362933e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
