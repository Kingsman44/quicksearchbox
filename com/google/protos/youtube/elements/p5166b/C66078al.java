package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.protos.youtube.elements.b.al */
/* compiled from: PG */
public final class C66078al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66078al f179686c;

    /* renamed from: e */
    private static volatile C63010eb f179687e;

    /* renamed from: a */
    public String f179688a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63070h f179689b;

    /* renamed from: d */
    private int f179690d;

    static {
        C66078al alVar = new C66078al();
        f179686c = alVar;
        C62942bv.registerDefaultInstance(C66078al.class, alVar);
    }

    private C66078al() {
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
                return newMessageInfo(f179686c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C66078al();
            case 4:
                return new C66077ak();
            case 5:
                return f179686c;
            case 6:
                C63010eb ebVar = f179687e;
                if (ebVar == null) {
                    synchronized (C66078al.class) {
                        ebVar = f179687e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179686c);
                            f179687e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
