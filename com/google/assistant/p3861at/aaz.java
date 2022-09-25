package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aaz */
/* compiled from: PG */
public final class aaz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aaz f128747c;

    /* renamed from: e */
    private static volatile C63010eb f128748e;

    /* renamed from: a */
    public int f128749a;

    /* renamed from: b */
    public String f128750b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f128751d;

    static {
        aaz aaz = new aaz();
        f128747c = aaz;
        C62942bv.registerDefaultInstance(aaz.class, aaz);
    }

    private aaz() {
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
                return newMessageInfo(f128747c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C49875cf.m85756b(), "b"});
            case 3:
                return new aaz();
            case 4:
                return new aay();
            case 5:
                return f128747c;
            case 6:
                C63010eb ebVar = f128748e;
                if (ebVar == null) {
                    synchronized (aaz.class) {
                        ebVar = f128748e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128747c);
                            f128748e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
