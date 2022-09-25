package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.du */
/* compiled from: PG */
public final class C51805du extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51805du f135924e;

    /* renamed from: f */
    private static volatile C63010eb f135925f;

    /* renamed from: a */
    public int f135926a;

    /* renamed from: b */
    public String f135927b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135928c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62995dn f135929d = C62995dn.f170057a;

    static {
        C51805du duVar = new C51805du();
        f135924e = duVar;
        C62942bv.registerDefaultInstance(C51805du.class, duVar);
    }

    private C51805du() {
    }

    /* renamed from: a */
    public final C62995dn mo53730a() {
        C62995dn dnVar = this.f135929d;
        if (!dnVar.f170058b) {
            this.f135929d = dnVar.mo58980a();
        }
        return this.f135929d;
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
                return newMessageInfo(f135924e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u00022\u0003ဈ\u0001", new Object[]{"a", "b", "d", C51804dt.f135923a, C45240c.f118157a});
            case 3:
                return new C51805du();
            case 4:
                return new C51803ds();
            case 5:
                return f135924e;
            case 6:
                C63010eb ebVar = f135925f;
                if (ebVar == null) {
                    synchronized (C51805du.class) {
                        ebVar = f135925f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135924e);
                            f135925f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
