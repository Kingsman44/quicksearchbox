package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.g */
/* compiled from: PG */
public final class C106279g extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C106279g f296506g;

    /* renamed from: i */
    private static volatile C63010eb f296507i;

    /* renamed from: a */
    public int f296508a;

    /* renamed from: b */
    public String f296509b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52081en f296510c;

    /* renamed from: d */
    public C60218r f296511d;

    /* renamed from: e */
    public String f296512e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f296513f;

    /* renamed from: h */
    private byte f296514h = 2;

    static {
        C106279g gVar = new C106279g();
        f296506g = gVar;
        C62942bv.registerDefaultInstance(C106279g.class, gVar);
    }

    private C106279g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f296514h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f296514h = b;
                return null;
            case 2:
                return newMessageInfo(f296506g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C106279g();
            case 4:
                return new C106278f();
            case 5:
                return f296506g;
            case 6:
                C63010eb ebVar = f296507i;
                if (ebVar == null) {
                    synchronized (C106279g.class) {
                        ebVar = f296507i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296506g);
                            f296507i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
