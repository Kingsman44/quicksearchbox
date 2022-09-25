package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65811co;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.fq */
/* compiled from: PG */
public final class C87843fq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87843fq f237669c;

    /* renamed from: f */
    private static volatile C63010eb f237670f;

    /* renamed from: a */
    public C65811co f237671a;

    /* renamed from: b */
    public String f237672b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f237673d;

    /* renamed from: e */
    private byte f237674e = 2;

    static {
        C87843fq fqVar = new C87843fq();
        f237669c = fqVar;
        C62942bv.registerDefaultInstance(C87843fq.class, fqVar);
    }

    private C87843fq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237674e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237674e = b;
                return null;
            case 2:
                return newMessageInfo(f237669c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C87843fq();
            case 4:
                return new C87842fp();
            case 5:
                return f237669c;
            case 6:
                C63010eb ebVar = f237670f;
                if (ebVar == null) {
                    synchronized (C87843fq.class) {
                        ebVar = f237670f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237669c);
                            f237670f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
