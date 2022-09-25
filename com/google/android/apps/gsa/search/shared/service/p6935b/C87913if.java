package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.p2012d.p2013a.C24180a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.if */
/* compiled from: PG */
public final class C87913if extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87913if f237803c;

    /* renamed from: e */
    private static volatile C63010eb f237804e;

    /* renamed from: a */
    public String f237805a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f237806b;

    /* renamed from: d */
    private int f237807d;

    static {
        C87913if ifVar = new C87913if();
        f237803c = ifVar;
        C62942bv.registerDefaultInstance(C87913if.class, ifVar);
    }

    private C87913if() {
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
                return newMessageInfo(f237803c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C24180a.f66089a});
            case 3:
                return new C87913if();
            case 4:
                return new C87912ie();
            case 5:
                return f237803c;
            case 6:
                C63010eb ebVar = f237804e;
                if (ebVar == null) {
                    synchronized (C87913if.class) {
                        ebVar = f237804e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237803c);
                            f237804e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
