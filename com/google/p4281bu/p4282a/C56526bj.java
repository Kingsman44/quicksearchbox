package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bj */
/* compiled from: PG */
public final class C56526bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56526bj f150952c;

    /* renamed from: d */
    private static volatile C63010eb f150953d;

    /* renamed from: a */
    public boolean f150954a;

    /* renamed from: b */
    public String f150955b = BuildConfig.FLAVOR;

    static {
        C56526bj bjVar = new C56526bj();
        f150952c = bjVar;
        C62942bv.registerDefaultInstance(C56526bj.class, bjVar);
    }

    private C56526bj() {
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
                return newMessageInfo(f150952c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C56526bj();
            case 4:
                return new C56525bi();
            case 5:
                return f150952c;
            case 6:
                C63010eb ebVar = f150953d;
                if (ebVar == null) {
                    synchronized (C56526bj.class) {
                        ebVar = f150953d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150952c);
                            f150953d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
