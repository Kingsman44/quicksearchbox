package com.google.knowledge.p4671b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55164if;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.am */
/* compiled from: PG */
public final class C61794am extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C61794am f166922f;

    /* renamed from: g */
    private static volatile C63010eb f166923g;

    /* renamed from: a */
    public int f166924a;

    /* renamed from: b */
    public String f166925b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f166926c;

    /* renamed from: d */
    public long f166927d;

    /* renamed from: e */
    public int f166928e;

    static {
        C61794am amVar = new C61794am();
        f166922f = amVar;
        C62942bv.registerDefaultInstance(C61794am.class, amVar);
    }

    private C61794am() {
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
                return newMessageInfo(f166922f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဈ\u0000\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C55164if.f145239a});
            case 3:
                return new C61794am();
            case 4:
                return new C61793al();
            case 5:
                return f166922f;
            case 6:
                C63010eb ebVar = f166923g;
                if (ebVar == null) {
                    synchronized (C61794am.class) {
                        ebVar = f166923g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166922f);
                            f166923g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
