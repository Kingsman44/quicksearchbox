package com.google.protos.p4985f.p5048z.p5049a.p5050a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.a.a.e */
/* compiled from: PG */
public final class C65386e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65386e f177794c;

    /* renamed from: e */
    private static volatile C63010eb f177795e;

    /* renamed from: a */
    public C49267am f177796a;

    /* renamed from: b */
    public String f177797b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f177798d;

    static {
        C65386e eVar = new C65386e();
        f177794c = eVar;
        C62942bv.registerDefaultInstance(C65386e.class, eVar);
    }

    private C65386e() {
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
                return newMessageInfo(f177794c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C65386e();
            case 4:
                return new C65385d();
            case 5:
                return f177794c;
            case 6:
                C63010eb ebVar = f177795e;
                if (ebVar == null) {
                    synchronized (C65386e.class) {
                        ebVar = f177795e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177794c);
                            f177795e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
