package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.dl */
/* compiled from: PG */
public final class C49019dl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49019dl f126792f;

    /* renamed from: h */
    private static volatile C63010eb f126793h;

    /* renamed from: a */
    public int f126794a;

    /* renamed from: b */
    public int f126795b;

    /* renamed from: c */
    public String f126796c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C49116ha f126797d;

    /* renamed from: e */
    public C62971cq f126798e = emptyProtobufList();

    /* renamed from: g */
    private byte f126799g = 2;

    static {
        C49019dl dlVar = new C49019dl();
        f126792f = dlVar;
        C62942bv.registerDefaultInstance(C49019dl.class, dlVar);
    }

    private C49019dl() {
    }

    /* renamed from: a */
    public final void mo53210a() {
        C62971cq cqVar = this.f126798e;
        if (!cqVar.mo58948c()) {
            this.f126798e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126799g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126799g = b;
                return null;
            case 2:
                return newMessageInfo(f126792f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001င\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004Л", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C49109gu.class});
            case 3:
                return new C49019dl();
            case 4:
                return new C49018dk();
            case 5:
                return f126792f;
            case 6:
                C63010eb ebVar = f126793h;
                if (ebVar == null) {
                    synchronized (C49019dl.class) {
                        ebVar = f126793h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126792f);
                            f126793h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
