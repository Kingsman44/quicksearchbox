package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.abh */
/* compiled from: PG */
public final class abh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final abh f128770e;

    /* renamed from: g */
    private static volatile C63010eb f128771g;

    /* renamed from: a */
    public int f128772a;

    /* renamed from: b */
    public abf f128773b;

    /* renamed from: c */
    public C62971cq f128774c = emptyProtobufList();

    /* renamed from: d */
    public String f128775d;

    /* renamed from: f */
    private byte f128776f = 2;

    static {
        abh abh = new abh();
        f128770e = abh;
        C62942bv.registerDefaultInstance(abh.class, abh);
    }

    private abh() {
        emptyProtobufList();
        this.f128775d = BuildConfig.FLAVOR;
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128776f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128776f = b;
                return null;
            case 2:
                return newMessageInfo(f128770e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0006ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C50498zh.class, "d"});
            case 3:
                return new abh();
            case 4:
                return new abg();
            case 5:
                return f128770e;
            case 6:
                C63010eb ebVar = f128771g;
                if (ebVar == null) {
                    synchronized (abh.class) {
                        ebVar = f128771g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128770e);
                            f128771g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
