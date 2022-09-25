package com.google.common.p4552o.p4570p;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.ar */
/* compiled from: PG */
public final class C60362ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60362ar f163366c;

    /* renamed from: e */
    private static volatile C63010eb f163367e;

    /* renamed from: a */
    public String f163368a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f163369b;

    /* renamed from: d */
    private int f163370d;

    static {
        C60362ar arVar = new C60362ar();
        f163366c = arVar;
        C62942bv.registerDefaultInstance(C60362ar.class, arVar);
    }

    private C60362ar() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f163366c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"d", "a", "b", C60360ap.f163365a});
            case 3:
                return new C60362ar();
            case 4:
                return new C60359ao();
            case 5:
                return f163366c;
            case 6:
                C63010eb ebVar = f163367e;
                if (ebVar == null) {
                    synchronized (C60362ar.class) {
                        ebVar = f163367e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163366c);
                            f163367e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
