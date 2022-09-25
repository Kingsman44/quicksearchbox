package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66624cv;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.h */
/* compiled from: PG */
public final class C81473h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81473h f222889c;

    /* renamed from: d */
    private static volatile C63010eb f222890d;

    /* renamed from: a */
    public String f222891a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C66624cv f222892b;

    static {
        C81473h hVar = new C81473h();
        f222889c = hVar;
        C62942bv.registerDefaultInstance(C81473h.class, hVar);
    }

    private C81473h() {
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
                return newMessageInfo(f222889c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C81473h();
            case 4:
                return new C81472g();
            case 5:
                return f222889c;
            case 6:
                C63010eb ebVar = f222890d;
                if (ebVar == null) {
                    synchronized (C81473h.class) {
                        ebVar = f222890d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222889c);
                            f222890d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
