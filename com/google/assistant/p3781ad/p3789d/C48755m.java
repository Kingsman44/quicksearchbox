package com.google.assistant.p3781ad.p3789d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.m */
/* compiled from: PG */
public final class C48755m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48755m f126152c;

    /* renamed from: e */
    private static volatile C63010eb f126153e;

    /* renamed from: a */
    public String f126154a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f126155b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f126156d;

    static {
        C48755m mVar = new C48755m();
        f126152c = mVar;
        C62942bv.registerDefaultInstance(C48755m.class, mVar);
    }

    private C48755m() {
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
                return newMessageInfo(f126152c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C48755m();
            case 4:
                return new C48754l();
            case 5:
                return f126152c;
            case 6:
                C63010eb ebVar = f126153e;
                if (ebVar == null) {
                    synchronized (C48755m.class) {
                        ebVar = f126153e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126152c);
                            f126153e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
