package com.google.assistant.p3781ad.p3789d.p3790a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.m */
/* compiled from: PG */
public final class C48560m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48560m f125449c;

    /* renamed from: d */
    private static volatile C63010eb f125450d;

    /* renamed from: a */
    public int f125451a;

    /* renamed from: b */
    public String f125452b = BuildConfig.FLAVOR;

    static {
        C48560m mVar = new C48560m();
        f125449c = mVar;
        C62942bv.registerDefaultInstance(C48560m.class, mVar);
    }

    private C48560m() {
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
                return newMessageInfo(f125449c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48560m();
            case 4:
                return new C48559l();
            case 5:
                return f125449c;
            case 6:
                C63010eb ebVar = f125450d;
                if (ebVar == null) {
                    synchronized (C48560m.class) {
                        ebVar = f125450d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125449c);
                            f125450d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
