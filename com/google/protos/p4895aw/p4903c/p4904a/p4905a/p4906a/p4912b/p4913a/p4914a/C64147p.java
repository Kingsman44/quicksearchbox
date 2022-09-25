package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.a.p */
/* compiled from: PG */
public final class C64147p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64147p f173436c;

    /* renamed from: e */
    private static volatile C63010eb f173437e;

    /* renamed from: a */
    public String f173438a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f173439b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f173440d;

    static {
        C64147p pVar = new C64147p();
        f173436c = pVar;
        C62942bv.registerDefaultInstance(C64147p.class, pVar);
    }

    private C64147p() {
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
                return newMessageInfo(f173436c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C64147p();
            case 4:
                return new C64146o();
            case 5:
                return f173436c;
            case 6:
                C63010eb ebVar = f173437e;
                if (ebVar == null) {
                    synchronized (C64147p.class) {
                        ebVar = f173437e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173436c);
                            f173437e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
