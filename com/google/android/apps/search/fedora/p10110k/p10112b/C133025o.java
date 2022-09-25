package com.google.android.apps.search.fedora.p10110k.p10112b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.k.b.o */
/* compiled from: PG */
public final class C133025o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133025o f362743c;

    /* renamed from: d */
    private static volatile C63010eb f362744d;

    /* renamed from: a */
    public int f362745a;

    /* renamed from: b */
    public String f362746b = BuildConfig.FLAVOR;

    static {
        C133025o oVar = new C133025o();
        f362743c = oVar;
        C62942bv.registerDefaultInstance(C133025o.class, oVar);
    }

    private C133025o() {
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
                return newMessageInfo(f362743c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C133025o();
            case 4:
                return new C133024n();
            case 5:
                return f362743c;
            case 6:
                C63010eb ebVar = f362744d;
                if (ebVar == null) {
                    synchronized (C133025o.class) {
                        ebVar = f362744d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362743c);
                            f362744d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
