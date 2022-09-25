package com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.h.a.c.h */
/* compiled from: PG */
public final class C33454h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C33454h f89556d;

    /* renamed from: e */
    private static volatile C63010eb f89557e;

    /* renamed from: a */
    public int f89558a;

    /* renamed from: b */
    public String f89559b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52070ec f89560c;

    static {
        C33454h hVar = new C33454h();
        f89556d = hVar;
        C62942bv.registerDefaultInstance(C33454h.class, hVar);
    }

    private C33454h() {
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
                return newMessageInfo(f89556d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C33454h();
            case 4:
                return new C33453g();
            case 5:
                return f89556d;
            case 6:
                C63010eb ebVar = f89557e;
                if (ebVar == null) {
                    synchronized (C33454h.class) {
                        ebVar = f89557e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89556d);
                            f89557e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
