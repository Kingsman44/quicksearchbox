package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.bs */
/* compiled from: PG */
public final class C57394bs extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C57394bs f153311c;

    /* renamed from: f */
    private static volatile C63010eb f153312f;

    /* renamed from: a */
    public String f153313a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f153314b = emptyProtobufList();

    /* renamed from: d */
    private int f153315d;

    /* renamed from: e */
    private byte f153316e = 2;

    static {
        C57394bs bsVar = new C57394bs();
        f153311c = bsVar;
        C62942bv.registerDefaultInstance(C57394bs.class, bsVar);
    }

    private C57394bs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153316e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153316e = b;
                return null;
            case 2:
                return newMessageInfo(f153311c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"d", "a", "b", C57357ai.class});
            case 3:
                return new C57394bs();
            case 4:
                return new C57393br();
            case 5:
                return f153311c;
            case 6:
                C63010eb ebVar = f153312f;
                if (ebVar == null) {
                    synchronized (C57394bs.class) {
                        ebVar = f153312f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153311c);
                            f153312f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
