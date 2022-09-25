package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ga */
/* compiled from: PG */
public final class C51393ga extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51393ga f133839c;

    /* renamed from: d */
    private static volatile C63010eb f133840d;

    /* renamed from: a */
    public int f133841a;

    /* renamed from: b */
    public String f133842b = BuildConfig.FLAVOR;

    static {
        C51393ga gaVar = new C51393ga();
        f133839c = gaVar;
        C62942bv.registerDefaultInstance(C51393ga.class, gaVar);
    }

    private C51393ga() {
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
                return newMessageInfo(f133839c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51393ga();
            case 4:
                return new C51391fz();
            case 5:
                return f133839c;
            case 6:
                C63010eb ebVar = f133840d;
                if (ebVar == null) {
                    synchronized (C51393ga.class) {
                        ebVar = f133840d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133839c);
                            f133840d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
