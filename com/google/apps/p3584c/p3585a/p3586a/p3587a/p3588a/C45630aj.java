package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.aj */
/* compiled from: PG */
public final class C45630aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45630aj f120016d;

    /* renamed from: e */
    private static volatile C63010eb f120017e;

    /* renamed from: a */
    public int f120018a;

    /* renamed from: b */
    public String f120019b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f120020c = BuildConfig.FLAVOR;

    static {
        C45630aj ajVar = new C45630aj();
        f120016d = ajVar;
        C62942bv.registerDefaultInstance(C45630aj.class, ajVar);
    }

    private C45630aj() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f120016d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45630aj();
            case 4:
                return new C45629ai();
            case 5:
                return f120016d;
            case 6:
                C63010eb ebVar = f120017e;
                if (ebVar == null) {
                    synchronized (C45630aj.class) {
                        ebVar = f120017e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120016d);
                            f120017e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
