package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aea */
/* compiled from: PG */
public final class aea extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aea f134921c;

    /* renamed from: d */
    private static volatile C63010eb f134922d;

    /* renamed from: a */
    public int f134923a;

    /* renamed from: b */
    public String f134924b = BuildConfig.FLAVOR;

    static {
        aea aea = new aea();
        f134921c = aea;
        C62942bv.registerDefaultInstance(aea.class, aea);
    }

    private aea() {
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
                return newMessageInfo(f134921c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aea();
            case 4:
                return new adz();
            case 5:
                return f134921c;
            case 6:
                C63010eb ebVar = f134922d;
                if (ebVar == null) {
                    synchronized (aea.class) {
                        ebVar = f134922d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134921c);
                            f134922d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
