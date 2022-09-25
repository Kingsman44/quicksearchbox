package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.abn */
/* compiled from: PG */
public final class abn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final abn f128782d;

    /* renamed from: f */
    private static volatile C63010eb f128783f;

    /* renamed from: a */
    public int f128784a;

    /* renamed from: b */
    public int f128785b;

    /* renamed from: c */
    public C50498zh f128786c;

    /* renamed from: e */
    private byte f128787e = 2;

    static {
        abn abn = new abn();
        f128782d = abn;
        C62942bv.registerDefaultInstance(abn.class, abn);
    }

    private abn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128787e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128787e = b;
                return null;
            case 2:
                return newMessageInfo(f128782d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", abl.f128781a, C45240c.f118157a});
            case 3:
                return new abn();
            case 4:
                return new abk();
            case 5:
                return f128782d;
            case 6:
                C63010eb ebVar = f128783f;
                if (ebVar == null) {
                    synchronized (abn.class) {
                        ebVar = f128783f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128782d);
                            f128783f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
