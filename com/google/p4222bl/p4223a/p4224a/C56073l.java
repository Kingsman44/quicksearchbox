package com.google.p4222bl.p4223a.p4224a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.l */
/* compiled from: PG */
public final class C56073l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56073l f149405c;

    /* renamed from: d */
    private static volatile C63010eb f149406d;

    /* renamed from: a */
    public String f149407a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f149408b = BuildConfig.FLAVOR;

    static {
        C56073l lVar = new C56073l();
        f149405c = lVar;
        C62942bv.registerDefaultInstance(C56073l.class, lVar);
    }

    private C56073l() {
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
                return newMessageInfo(f149405c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C56073l();
            case 4:
                return new C56072k();
            case 5:
                return f149405c;
            case 6:
                C63010eb ebVar = f149406d;
                if (ebVar == null) {
                    synchronized (C56073l.class) {
                        ebVar = f149406d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149405c);
                            f149406d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
