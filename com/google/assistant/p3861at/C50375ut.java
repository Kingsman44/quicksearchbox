package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ut */
/* compiled from: PG */
public final class C50375ut extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50375ut f131127e;

    /* renamed from: g */
    private static volatile C63010eb f131128g;

    /* renamed from: a */
    public String f131129a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f131130b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131131c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f131132d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f131133f;

    static {
        C50375ut utVar = new C50375ut();
        f131127e = utVar;
        C62942bv.registerDefaultInstance(C50375ut.class, utVar);
    }

    private C50375ut() {
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
                return newMessageInfo(f131127e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50375ut();
            case 4:
                return new C50374us();
            case 5:
                return f131127e;
            case 6:
                C63010eb ebVar = f131128g;
                if (ebVar == null) {
                    synchronized (C50375ut.class) {
                        ebVar = f131128g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131127e);
                            f131128g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
