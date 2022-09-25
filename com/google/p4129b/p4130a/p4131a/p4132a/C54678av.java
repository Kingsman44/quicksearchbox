package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.av */
/* compiled from: PG */
public final class C54678av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54678av f143526c;

    /* renamed from: d */
    private static volatile C63010eb f143527d;

    /* renamed from: a */
    public String f143528a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f143529b = C63088z.f170246b;

    static {
        C54678av avVar = new C54678av();
        f143526c = avVar;
        C62942bv.registerDefaultInstance(C54678av.class, avVar);
    }

    private C54678av() {
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
                return newMessageInfo(f143526c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\n", new Object[]{"a", "b"});
            case 3:
                return new C54678av();
            case 4:
                return new C54677au();
            case 5:
                return f143526c;
            case 6:
                C63010eb ebVar = f143527d;
                if (ebVar == null) {
                    synchronized (C54678av.class) {
                        ebVar = f143527d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143526c);
                            f143527d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
