package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hz */
/* compiled from: PG */
public final class C52027hz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52027hz f136550c;

    /* renamed from: f */
    private static volatile C63010eb f136551f;

    /* renamed from: a */
    public C62971cq f136552a = emptyProtobufList();

    /* renamed from: b */
    public String f136553b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f136554d;

    /* renamed from: e */
    private byte f136555e = 2;

    static {
        C52027hz hzVar = new C52027hz();
        f136550c = hzVar;
        C62942bv.registerDefaultInstance(C52027hz.class, hzVar);
    }

    private C52027hz() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public static C63010eb m86470a() {
        return f136550c.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136555e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136555e = b;
                return null;
            case 2:
                return newMessageInfo(f136550c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004ဈ\u0002", new Object[]{"d", "a", C52026hy.class, "b"});
            case 3:
                return new C52027hz();
            case 4:
                return new C52024hw();
            case 5:
                return f136550c;
            case 6:
                C63010eb ebVar = f136551f;
                if (ebVar == null) {
                    synchronized (C52027hz.class) {
                        ebVar = f136551f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136550c);
                            f136551f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
