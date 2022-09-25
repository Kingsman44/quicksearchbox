package com.google.protos.p4948ba;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ba.d */
/* compiled from: PG */
public final class C64374d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64374d f174588c;

    /* renamed from: f */
    private static volatile C63010eb f174589f;

    /* renamed from: a */
    public String f174590a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f174591b;

    /* renamed from: d */
    private int f174592d;

    /* renamed from: e */
    private byte f174593e = 2;

    static {
        C64374d dVar = new C64374d();
        f174588c = dVar;
        C62942bv.registerDefaultInstance(C64374d.class, dVar);
    }

    private C64374d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f174593e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f174593e = b;
                return null;
            case 2:
                return newMessageInfo(f174588c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C64372b.f174587a});
            case 3:
                return new C64374d();
            case 4:
                return new C64367a();
            case 5:
                return f174588c;
            case 6:
                C63010eb ebVar = f174589f;
                if (ebVar == null) {
                    synchronized (C64374d.class) {
                        ebVar = f174589f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174588c);
                            f174589f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
