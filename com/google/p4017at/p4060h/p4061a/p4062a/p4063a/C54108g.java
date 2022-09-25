package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.g */
/* compiled from: PG */
public final class C54108g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54108g f141968d;

    /* renamed from: i */
    private static volatile C63010eb f141969i;

    /* renamed from: a */
    public String f141970a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f141971b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f141972c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f141973e;

    /* renamed from: f */
    private C54106e f141974f;

    /* renamed from: g */
    private C51805du f141975g;

    /* renamed from: h */
    private byte f141976h = 2;

    static {
        C54108g gVar = new C54108g();
        f141968d = gVar;
        C62942bv.registerDefaultInstance(C54108g.class, gVar);
    }

    private C54108g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141976h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141976h = b;
                return null;
            case 2:
                return newMessageInfo(f141968d, "\u0001\u0005\u0000\u0001\u0001\u000e\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0003\u0005ဈ\t\nဉ\u000f\u000eဉ\u000e", new Object[]{"e", "a", "b", C45240c.f118157a, C30325g.f82003a, C10662f.f35572a});
            case 3:
                return new C54108g();
            case 4:
                return new C54107f();
            case 5:
                return f141968d;
            case 6:
                C63010eb ebVar = f141969i;
                if (ebVar == null) {
                    synchronized (C54108g.class) {
                        ebVar = f141969i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141968d);
                            f141969i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
