package com.google.p395al.p408c.p414c.p416b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.C28730bh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.au */
/* compiled from: PG */
public final class C8478au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8478au f29430c;

    /* renamed from: e */
    private static volatile C63010eb f29431e;

    /* renamed from: a */
    public String f29432a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C28730bh f29433b;

    /* renamed from: d */
    private int f29434d;

    static {
        C8478au auVar = new C8478au();
        f29430c = auVar;
        C62942bv.registerDefaultInstance(C8478au.class, auVar);
    }

    private C8478au() {
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
                return newMessageInfo(f29430c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C8478au();
            case 4:
                return new C8477at();
            case 5:
                return f29430c;
            case 6:
                C63010eb ebVar = f29431e;
                if (ebVar == null) {
                    synchronized (C8478au.class) {
                        ebVar = f29431e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29430c);
                            f29431e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
