package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.b */
/* compiled from: PG */
public final class C50899b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50899b f132522f;

    /* renamed from: g */
    private static volatile C63010eb f132523g;

    /* renamed from: a */
    public int f132524a;

    /* renamed from: b */
    public String f132525b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f132526c;

    /* renamed from: d */
    public int f132527d;

    /* renamed from: e */
    public C50911n f132528e;

    static {
        C50899b bVar = new C50899b();
        f132522f = bVar;
        C62942bv.registerDefaultInstance(C50899b.class, bVar);
    }

    private C50899b() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f132522f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0005ဌ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C50904g.f132538a, "e"});
            case 3:
                return new C50899b();
            case 4:
                return new C50892a();
            case 5:
                return f132522f;
            case 6:
                C63010eb ebVar = f132523g;
                if (ebVar == null) {
                    synchronized (C50899b.class) {
                        ebVar = f132523g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132522f);
                            f132523g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
