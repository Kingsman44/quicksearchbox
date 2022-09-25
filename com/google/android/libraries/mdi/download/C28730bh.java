package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.bh */
/* compiled from: PG */
public final class C28730bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28730bh f78048d;

    /* renamed from: e */
    private static volatile C63010eb f78049e;

    /* renamed from: a */
    public int f78050a;

    /* renamed from: b */
    public String f78051b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f78052c = BuildConfig.FLAVOR;

    static {
        C28730bh bhVar = new C28730bh();
        f78048d = bhVar;
        C62942bv.registerDefaultInstance(C28730bh.class, bhVar);
    }

    private C28730bh() {
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
                return newMessageInfo(f78048d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C28730bh();
            case 4:
                return new C28729bg();
            case 5:
                return f78048d;
            case 6:
                C63010eb ebVar = f78049e;
                if (ebVar == null) {
                    synchronized (C28730bh.class) {
                        ebVar = f78049e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78048d);
                            f78049e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
