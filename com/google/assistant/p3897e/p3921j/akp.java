package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.akp */
/* compiled from: PG */
public final class akp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final akp f135279f;

    /* renamed from: g */
    private static volatile C63010eb f135280g;

    /* renamed from: a */
    public int f135281a;

    /* renamed from: b */
    public String f135282b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f135283c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public boolean f135284d;

    /* renamed from: e */
    public int f135285e;

    static {
        akp akp = new akp();
        f135279f = akp;
        C62942bv.registerDefaultInstance(akp.class, akp);
    }

    private akp() {
    }

    /* renamed from: a */
    public static C63010eb m86320a() {
        return f135279f.getParserForType();
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
                return newMessageInfo(f135279f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002ဈ\u0000\u0003\u001a\u0004ဇ\u0001\u0006င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new akp();
            case 4:
                return new ako();
            case 5:
                return f135279f;
            case 6:
                C63010eb ebVar = f135280g;
                if (ebVar == null) {
                    synchronized (akp.class) {
                        ebVar = f135280g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135279f);
                            f135280g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
