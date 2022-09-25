package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.s */
/* compiled from: PG */
public final class C56593s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56593s f151090c;

    /* renamed from: d */
    private static volatile C63010eb f151091d;

    /* renamed from: a */
    public String f151092a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f151093b = BuildConfig.FLAVOR;

    static {
        C56593s sVar = new C56593s();
        f151090c = sVar;
        C62942bv.registerDefaultInstance(C56593s.class, sVar);
    }

    private C56593s() {
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
                return newMessageInfo(f151090c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C56593s();
            case 4:
                return new C56592r();
            case 5:
                return f151090c;
            case 6:
                C63010eb ebVar = f151091d;
                if (ebVar == null) {
                    synchronized (C56593s.class) {
                        ebVar = f151091d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151090c);
                            f151091d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
