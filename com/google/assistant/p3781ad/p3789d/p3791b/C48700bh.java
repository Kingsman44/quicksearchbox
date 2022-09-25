package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bh */
/* compiled from: PG */
public final class C48700bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48700bh f125988c;

    /* renamed from: d */
    private static volatile C63010eb f125989d;

    /* renamed from: a */
    public int f125990a;

    /* renamed from: b */
    public String f125991b = BuildConfig.FLAVOR;

    static {
        C48700bh bhVar = new C48700bh();
        f125988c = bhVar;
        C62942bv.registerDefaultInstance(C48700bh.class, bhVar);
    }

    private C48700bh() {
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
                return newMessageInfo(f125988c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48700bh();
            case 4:
                return new C48699bg();
            case 5:
                return f125988c;
            case 6:
                C63010eb ebVar = f125989d;
                if (ebVar == null) {
                    synchronized (C48700bh.class) {
                        ebVar = f125989d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125988c);
                            f125989d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
