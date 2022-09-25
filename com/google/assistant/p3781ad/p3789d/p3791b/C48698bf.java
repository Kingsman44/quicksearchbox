package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bf */
/* compiled from: PG */
public final class C48698bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48698bf f125984c;

    /* renamed from: d */
    private static volatile C63010eb f125985d;

    /* renamed from: a */
    public int f125986a;

    /* renamed from: b */
    public String f125987b = BuildConfig.FLAVOR;

    static {
        C48698bf bfVar = new C48698bf();
        f125984c = bfVar;
        C62942bv.registerDefaultInstance(C48698bf.class, bfVar);
    }

    private C48698bf() {
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
                return newMessageInfo(f125984c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48698bf();
            case 4:
                return new C48697be();
            case 5:
                return f125984c;
            case 6:
                C63010eb ebVar = f125985d;
                if (ebVar == null) {
                    synchronized (C48698bf.class) {
                        ebVar = f125985d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125984c);
                            f125985d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
