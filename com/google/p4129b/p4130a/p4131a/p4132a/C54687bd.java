package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bd */
/* compiled from: PG */
public final class C54687bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54687bd f143547c;

    /* renamed from: d */
    private static volatile C63010eb f143548d;

    /* renamed from: a */
    public String f143549a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f143550b = BuildConfig.FLAVOR;

    static {
        C54687bd bdVar = new C54687bd();
        f143547c = bdVar;
        C62942bv.registerDefaultInstance(C54687bd.class, bdVar);
    }

    private C54687bd() {
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
                return newMessageInfo(f143547c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54687bd();
            case 4:
                return new C54686bc();
            case 5:
                return f143547c;
            case 6:
                C63010eb ebVar = f143548d;
                if (ebVar == null) {
                    synchronized (C54687bd.class) {
                        ebVar = f143548d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143547c);
                            f143548d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
