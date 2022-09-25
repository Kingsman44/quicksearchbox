package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4109av.p4110a.p4111a.C54603b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pp */
/* compiled from: PG */
public final class C50236pp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50236pp f130618f;

    /* renamed from: h */
    private static volatile C63010eb f130619h;

    /* renamed from: a */
    public int f130620a;

    /* renamed from: b */
    public boolean f130621b;

    /* renamed from: c */
    public long f130622c;

    /* renamed from: d */
    public C54603b f130623d;

    /* renamed from: e */
    public C62971cq f130624e;

    /* renamed from: g */
    private byte f130625g = 2;

    static {
        C50236pp ppVar = new C50236pp();
        f130618f = ppVar;
        C62942bv.registerDefaultInstance(C50236pp.class, ppVar);
    }

    private C50236pp() {
        emptyProtobufList();
        emptyProtobufList();
        this.f130624e = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f130625g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f130625g = b;
                return null;
            case 2:
                return newMessageInfo(f130618f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0001\u0001\u0002ဇ\u0001\u0005ဂ\u0002\u0006Л\u0007ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "e", C50235po.class, "d"});
            case 3:
                return new C50236pp();
            case 4:
                return new C50222pb();
            case 5:
                return f130618f;
            case 6:
                C63010eb ebVar = f130619h;
                if (ebVar == null) {
                    synchronized (C50236pp.class) {
                        ebVar = f130619h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130618f);
                            f130619h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
