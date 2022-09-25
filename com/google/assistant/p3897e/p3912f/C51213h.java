package com.google.assistant.p3897e.p3912f;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.f.h */
/* compiled from: PG */
public final class C51213h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51213h f133336c;

    /* renamed from: d */
    private static volatile C63010eb f133337d;

    /* renamed from: a */
    public int f133338a;

    /* renamed from: b */
    public String f133339b = BuildConfig.FLAVOR;

    static {
        C51213h hVar = new C51213h();
        f133336c = hVar;
        C62942bv.registerDefaultInstance(C51213h.class, hVar);
    }

    private C51213h() {
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
                return newMessageInfo(f133336c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51213h();
            case 4:
                return new C51212g();
            case 5:
                return f133336c;
            case 6:
                C63010eb ebVar = f133337d;
                if (ebVar == null) {
                    synchronized (C51213h.class) {
                        ebVar = f133337d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133336c);
                            f133337d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
