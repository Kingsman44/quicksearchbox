package com.google.p4283bv.p4287b.p4288a.p4289a.p4320y;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.y.e */
/* compiled from: PG */
public final class C56840e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56840e f151648f;

    /* renamed from: g */
    private static volatile C63010eb f151649g;

    /* renamed from: a */
    public int f151650a;

    /* renamed from: b */
    public String f151651b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151652c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151653d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f151654e = BuildConfig.FLAVOR;

    static {
        C56840e eVar = new C56840e();
        f151648f = eVar;
        C62942bv.registerDefaultInstance(C56840e.class, eVar);
    }

    private C56840e() {
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
                return newMessageInfo(f151648f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56840e();
            case 4:
                return new C56839d();
            case 5:
                return f151648f;
            case 6:
                C63010eb ebVar = f151649g;
                if (ebVar == null) {
                    synchronized (C56840e.class) {
                        ebVar = f151649g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151648f);
                            f151649g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
