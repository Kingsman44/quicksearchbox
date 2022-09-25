package com.google.assistant.p3862au;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.au.f */
/* compiled from: PG */
public final class C50522f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50522f f131501d;

    /* renamed from: e */
    private static volatile C63010eb f131502e;

    /* renamed from: a */
    public String f131503a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f131504b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62995dn f131505c = C62995dn.f170057a;

    static {
        C50522f fVar = new C50522f();
        f131501d = fVar;
        C62942bv.registerDefaultInstance(C50522f.class, fVar);
    }

    private C50522f() {
    }

    /* renamed from: a */
    public final C62995dn mo53405a() {
        C62995dn dnVar = this.f131505c;
        if (!dnVar.f170058b) {
            this.f131505c = dnVar.mo58980a();
        }
        return this.f131505c;
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
                return newMessageInfo(f131501d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"a", "b", C45240c.f118157a, C50521e.f131500a});
            case 3:
                return new C50522f();
            case 4:
                return new C50520d();
            case 5:
                return f131501d;
            case 6:
                C63010eb ebVar = f131502e;
                if (ebVar == null) {
                    synchronized (C50522f.class) {
                        ebVar = f131502e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131501d);
                            f131502e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
