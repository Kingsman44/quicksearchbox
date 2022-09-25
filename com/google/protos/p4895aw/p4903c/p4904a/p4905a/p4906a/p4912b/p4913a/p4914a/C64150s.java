package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.a.s */
/* compiled from: PG */
public final class C64150s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64150s f173442c;

    /* renamed from: e */
    private static volatile C63010eb f173443e;

    /* renamed from: a */
    public String f173444a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f173445b;

    /* renamed from: d */
    private int f173446d;

    static {
        C64150s sVar = new C64150s();
        f173442c = sVar;
        C62942bv.registerDefaultInstance(C64150s.class, sVar);
    }

    private C64150s() {
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
                return newMessageInfo(f173442c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C64149r.f173441a});
            case 3:
                return new C64150s();
            case 4:
                return new C64148q();
            case 5:
                return f173442c;
            case 6:
                C63010eb ebVar = f173443e;
                if (ebVar == null) {
                    synchronized (C64150s.class) {
                        ebVar = f173443e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173442c);
                            f173443e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
