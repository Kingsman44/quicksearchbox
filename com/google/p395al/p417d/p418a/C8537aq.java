package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.aq */
/* compiled from: PG */
public final class C8537aq extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C8537aq f29619c;

    /* renamed from: e */
    private static volatile C63010eb f29620e;

    /* renamed from: a */
    public int f29621a;

    /* renamed from: b */
    public String f29622b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f29623d = 2;

    static {
        C8537aq aqVar = new C8537aq();
        f29619c = aqVar;
        C62942bv.registerDefaultInstance(C8537aq.class, aqVar);
    }

    private C8537aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29623d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29623d = b;
                return null;
            case 2:
                return newMessageInfo(f29619c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8537aq();
            case 4:
                return new C8536ap();
            case 5:
                return f29619c;
            case 6:
                C63010eb ebVar = f29620e;
                if (ebVar == null) {
                    synchronized (C8537aq.class) {
                        ebVar = f29620e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29619c);
                            f29620e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
