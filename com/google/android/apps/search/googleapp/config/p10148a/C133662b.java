package com.google.android.apps.search.googleapp.config.p10148a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.config.a.b */
/* compiled from: PG */
public final class C133662b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133662b f364072c;

    /* renamed from: d */
    private static volatile C63010eb f364073d;

    /* renamed from: a */
    public int f364074a;

    /* renamed from: b */
    public String f364075b = BuildConfig.FLAVOR;

    static {
        C133662b bVar = new C133662b();
        f364072c = bVar;
        C62942bv.registerDefaultInstance(C133662b.class, bVar);
    }

    private C133662b() {
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
                return newMessageInfo(f364072c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C133662b();
            case 4:
                return new C133661a();
            case 5:
                return f364072c;
            case 6:
                C63010eb ebVar = f364073d;
                if (ebVar == null) {
                    synchronized (C133662b.class) {
                        ebVar = f364073d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364072c);
                            f364073d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
