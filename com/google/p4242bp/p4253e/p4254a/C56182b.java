package com.google.p4242bp.p4253e.p4254a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.e.a.b */
/* compiled from: PG */
public final class C56182b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56182b f149689f;

    /* renamed from: g */
    private static volatile C63010eb f149690g;

    /* renamed from: a */
    public int f149691a;

    /* renamed from: b */
    public String f149692b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f149693c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f149694d = emptyProtobufList();

    /* renamed from: e */
    public boolean f149695e;

    static {
        C56182b bVar = new C56182b();
        f149689f = bVar;
        C62942bv.registerDefaultInstance(C56182b.class, bVar);
    }

    private C56182b() {
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
                return newMessageInfo(f149689f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C56184d.class, "e"});
            case 3:
                return new C56182b();
            case 4:
                return new C56181a();
            case 5:
                return f149689f;
            case 6:
                C63010eb ebVar = f149690g;
                if (ebVar == null) {
                    synchronized (C56182b.class) {
                        ebVar = f149690g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149689f);
                            f149690g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
