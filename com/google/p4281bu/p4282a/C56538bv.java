package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bv */
/* compiled from: PG */
public final class C56538bv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56538bv f150975c;

    /* renamed from: d */
    private static volatile C63010eb f150976d;

    /* renamed from: a */
    public String f150977a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f150978b = BuildConfig.FLAVOR;

    static {
        C56538bv bvVar = new C56538bv();
        f150975c = bvVar;
        C62942bv.registerDefaultInstance(C56538bv.class, bvVar);
    }

    private C56538bv() {
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
                return newMessageInfo(f150975c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C56538bv();
            case 4:
                return new C56537bu();
            case 5:
                return f150975c;
            case 6:
                C63010eb ebVar = f150976d;
                if (ebVar == null) {
                    synchronized (C56538bv.class) {
                        ebVar = f150976d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150975c);
                            f150976d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
