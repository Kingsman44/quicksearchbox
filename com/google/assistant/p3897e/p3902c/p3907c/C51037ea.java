package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ea */
/* compiled from: PG */
public final class C51037ea extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51037ea f132889e;

    /* renamed from: g */
    private static volatile C63010eb f132890g;

    /* renamed from: a */
    public int f132891a;

    /* renamed from: b */
    public String f132892b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f132893c = emptyProtobufList();

    /* renamed from: d */
    public C51034dy f132894d;

    /* renamed from: f */
    private byte f132895f = 2;

    static {
        C51037ea eaVar = new C51037ea();
        f132889e = eaVar;
        C62942bv.registerDefaultInstance(C51037ea.class, eaVar);
    }

    private C51037ea() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132895f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132895f = b;
                return null;
            case 2:
                return newMessageInfo(f132889e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C51034dy.class, "d"});
            case 3:
                return new C51037ea();
            case 4:
                return new C51035dz();
            case 5:
                return f132889e;
            case 6:
                C63010eb ebVar = f132890g;
                if (ebVar == null) {
                    synchronized (C51037ea.class) {
                        ebVar = f132890g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132889e);
                            f132890g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
