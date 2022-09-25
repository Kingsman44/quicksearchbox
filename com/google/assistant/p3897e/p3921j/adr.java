package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.adr */
/* compiled from: PG */
public final class adr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final adr f134901c;

    /* renamed from: e */
    private static volatile C63010eb f134902e;

    /* renamed from: a */
    public String f134903a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f134904b;

    /* renamed from: d */
    private int f134905d;

    static {
        adr adr = new adr();
        f134901c = adr;
        C62942bv.registerDefaultInstance(adr.class, adr);
    }

    private adr() {
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
                return newMessageInfo(f134901c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new adr();
            case 4:
                return new adq();
            case 5:
                return f134901c;
            case 6:
                C63010eb ebVar = f134902e;
                if (ebVar == null) {
                    synchronized (adr.class) {
                        ebVar = f134902e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134901c);
                            f134902e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
