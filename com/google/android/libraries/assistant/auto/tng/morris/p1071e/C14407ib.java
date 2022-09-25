package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ib */
/* compiled from: PG */
public final class C14407ib extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14407ib f43577c;

    /* renamed from: d */
    private static volatile C63010eb f43578d;

    /* renamed from: a */
    public String f43579a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f43580b = BuildConfig.FLAVOR;

    static {
        C14407ib ibVar = new C14407ib();
        f43577c = ibVar;
        C62942bv.registerDefaultInstance(C14407ib.class, ibVar);
    }

    private C14407ib() {
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
                return newMessageInfo(f43577c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C14407ib();
            case 4:
                return new C14406ia();
            case 5:
                return f43577c;
            case 6:
                C63010eb ebVar = f43578d;
                if (ebVar == null) {
                    synchronized (C14407ib.class) {
                        ebVar = f43578d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43577c);
                            f43578d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
