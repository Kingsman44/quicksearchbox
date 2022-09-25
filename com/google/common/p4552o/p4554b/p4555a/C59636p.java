package com.google.common.p4552o.p4554b.p4555a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.p */
/* compiled from: PG */
public final class C59636p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59636p f159895c;

    /* renamed from: d */
    private static volatile C63010eb f159896d;

    /* renamed from: a */
    public int f159897a;

    /* renamed from: b */
    public String f159898b = BuildConfig.FLAVOR;

    static {
        C59636p pVar = new C59636p();
        f159895c = pVar;
        C62942bv.registerDefaultInstance(C59636p.class, pVar);
    }

    private C59636p() {
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
                return newMessageInfo(f159895c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59636p();
            case 4:
                return new C59635o();
            case 5:
                return f159895c;
            case 6:
                C63010eb ebVar = f159896d;
                if (ebVar == null) {
                    synchronized (C59636p.class) {
                        ebVar = f159896d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159895c);
                            f159896d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
