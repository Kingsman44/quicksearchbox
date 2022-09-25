package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.fk */
/* compiled from: PG */
public final class C7665fk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7665fk f26611e;

    /* renamed from: g */
    private static volatile C63010eb f26612g;

    /* renamed from: a */
    public int f26613a;

    /* renamed from: b */
    public String f26614b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f26615c = emptyProtobufList();

    /* renamed from: d */
    public C8178yk f26616d;

    /* renamed from: f */
    private byte f26617f = 2;

    static {
        C7665fk fkVar = new C7665fk();
        f26611e = fkVar;
        C62942bv.registerDefaultInstance(C7665fk.class, fkVar);
    }

    private C7665fk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26617f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26617f = b;
                return null;
            case 2:
                return newMessageInfo(f26611e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0003Л\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C7664fj.class, "d"});
            case 3:
                return new C7665fk();
            case 4:
                return new C7662fh();
            case 5:
                return f26611e;
            case 6:
                C63010eb ebVar = f26612g;
                if (ebVar == null) {
                    synchronized (C7665fk.class) {
                        ebVar = f26612g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26611e);
                            f26612g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
