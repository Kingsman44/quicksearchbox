package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.at */
/* compiled from: PG */
public final class C45640at extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C45640at f120065g;

    /* renamed from: h */
    private static volatile C63010eb f120066h;

    /* renamed from: a */
    public int f120067a;

    /* renamed from: b */
    public C45634an f120068b;

    /* renamed from: c */
    public String f120069c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f120070d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f120071e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f120072f = BuildConfig.FLAVOR;

    static {
        C45640at atVar = new C45640at();
        f120065g = atVar;
        C62942bv.registerDefaultInstance(C45640at.class, atVar);
    }

    private C45640at() {
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
                return newMessageInfo(f120065g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C45640at();
            case 4:
                return new C45639as();
            case 5:
                return f120065g;
            case 6:
                C63010eb ebVar = f120066h;
                if (ebVar == null) {
                    synchronized (C45640at.class) {
                        ebVar = f120066h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120065g);
                            f120066h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
