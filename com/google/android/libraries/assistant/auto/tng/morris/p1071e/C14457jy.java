package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jy */
/* compiled from: PG */
public final class C14457jy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14457jy f43725c;

    /* renamed from: d */
    private static volatile C63010eb f43726d;

    /* renamed from: a */
    public int f43727a;

    /* renamed from: b */
    public String f43728b = BuildConfig.FLAVOR;

    static {
        C14457jy jyVar = new C14457jy();
        f43725c = jyVar;
        C62942bv.registerDefaultInstance(C14457jy.class, jyVar);
    }

    private C14457jy() {
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
                return newMessageInfo(f43725c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C14457jy();
            case 4:
                return new C14456jx();
            case 5:
                return f43725c;
            case 6:
                C63010eb ebVar = f43726d;
                if (ebVar == null) {
                    synchronized (C14457jy.class) {
                        ebVar = f43726d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43725c);
                            f43726d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
