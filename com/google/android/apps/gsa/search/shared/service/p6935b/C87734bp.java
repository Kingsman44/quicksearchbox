package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bp */
/* compiled from: PG */
public final class C87734bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87734bp f237219c;

    /* renamed from: e */
    private static volatile C63010eb f237220e;

    /* renamed from: a */
    public int f237221a;

    /* renamed from: b */
    public String f237222b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f237223d;

    static {
        C87734bp bpVar = new C87734bp();
        f237219c = bpVar;
        C62942bv.registerDefaultInstance(C87734bp.class, bpVar);
    }

    private C87734bp() {
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
                return newMessageInfo(f237219c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C88219to.f238455a, "b"});
            case 3:
                return new C87734bp();
            case 4:
                return new C87733bo();
            case 5:
                return f237219c;
            case 6:
                C63010eb ebVar = f237220e;
                if (ebVar == null) {
                    synchronized (C87734bp.class) {
                        ebVar = f237220e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237219c);
                            f237220e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
