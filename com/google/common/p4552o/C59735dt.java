package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p001a.p007b.p011b.p012a.C0027c;

/* renamed from: com.google.common.o.dt */
/* compiled from: PG */
public final class C59735dt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59735dt f160335e;

    /* renamed from: f */
    private static volatile C63010eb f160336f;

    /* renamed from: a */
    public int f160337a;

    /* renamed from: b */
    public String f160338b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f160339c;

    /* renamed from: d */
    public int f160340d;

    static {
        C59735dt dtVar = new C59735dt();
        f160335e = dtVar;
        C62942bv.registerDefaultInstance(C59735dt.class, dtVar);
    }

    private C59735dt() {
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
                return newMessageInfo(f160335e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C0027c.m10b(), "d", C51474ja.m86197b()});
            case 3:
                return new C59735dt();
            case 4:
                return new C59734ds();
            case 5:
                return f160335e;
            case 6:
                C63010eb ebVar = f160336f;
                if (ebVar == null) {
                    synchronized (C59735dt.class) {
                        ebVar = f160336f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160335e);
                            f160336f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
