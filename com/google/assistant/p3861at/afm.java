package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.afm */
/* compiled from: PG */
public final class afm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final afm f129160c;

    /* renamed from: e */
    private static volatile C63010eb f129161e;

    /* renamed from: a */
    public int f129162a;

    /* renamed from: b */
    public C62971cq f129163b = emptyProtobufList();

    /* renamed from: d */
    private int f129164d;

    static {
        afm afm = new afm();
        f129160c = afm;
        C62942bv.registerDefaultInstance(afm.class, afm);
    }

    private afm() {
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
                return newMessageInfo(f129160c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"d", "a", afk.f129159a, "b", afq.class});
            case 3:
                return new afm();
            case 4:
                return new afj();
            case 5:
                return f129160c;
            case 6:
                C63010eb ebVar = f129161e;
                if (ebVar == null) {
                    synchronized (afm.class) {
                        ebVar = f129161e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129160c);
                            f129161e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
