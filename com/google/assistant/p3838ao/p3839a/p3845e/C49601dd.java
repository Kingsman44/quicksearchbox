package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.dd */
/* compiled from: PG */
public final class C49601dd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49601dd f127995f;

    /* renamed from: h */
    private static volatile C63010eb f127996h;

    /* renamed from: a */
    public long f127997a;

    /* renamed from: b */
    public C62971cq f127998b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f127999c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f128000d = emptyProtobufList();

    /* renamed from: e */
    public C62995dn f128001e = C62995dn.f170057a;

    /* renamed from: g */
    private byte f128002g = 2;

    static {
        C49601dd ddVar = new C49601dd();
        f127995f = ddVar;
        C62942bv.registerDefaultInstance(C49601dd.class, ddVar);
    }

    private C49601dd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128002g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128002g = b;
                return null;
            case 2:
                return newMessageInfo(f127995f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0003\u0002\u0001\u001b\u0002Л\u0003Л\u00042\u0005\u0002", new Object[]{"b", C49607dj.class, C45240c.f118157a, C49585co.class, "d", C49577cg.class, "e", C49600dc.f127994a, "a"});
            case 3:
                return new C49601dd();
            case 4:
                return new C49599db();
            case 5:
                return f127995f;
            case 6:
                C63010eb ebVar = f127996h;
                if (ebVar == null) {
                    synchronized (C49601dd.class) {
                        ebVar = f127996h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127995f);
                            f127996h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
