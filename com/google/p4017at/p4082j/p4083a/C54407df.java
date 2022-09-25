package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.df */
/* compiled from: PG */
public final class C54407df extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54407df f142895c;

    /* renamed from: d */
    private static volatile C63010eb f142896d;

    /* renamed from: a */
    public String f142897a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f142898b;

    static {
        C54407df dfVar = new C54407df();
        f142895c = dfVar;
        C62942bv.registerDefaultInstance(C54407df.class, dfVar);
    }

    private C54407df() {
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
                return newMessageInfo(f142895c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C54407df();
            case 4:
                return new C54405dd();
            case 5:
                return f142895c;
            case 6:
                C63010eb ebVar = f142896d;
                if (ebVar == null) {
                    synchronized (C54407df.class) {
                        ebVar = f142896d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142895c);
                            f142896d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
