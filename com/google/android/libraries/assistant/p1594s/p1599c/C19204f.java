package com.google.android.libraries.assistant.p1594s.p1599c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.c.f */
/* compiled from: PG */
public final class C19204f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19204f f53768f;

    /* renamed from: g */
    private static volatile C63010eb f53769g;

    /* renamed from: a */
    public int f53770a;

    /* renamed from: b */
    public String f53771b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f53772c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f53773d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f53774e = C62942bv.emptyProtobufList();

    static {
        C19204f fVar = new C19204f();
        f53768f = fVar;
        C62942bv.registerDefaultInstance(C19204f.class, fVar);
    }

    private C19204f() {
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
                return newMessageInfo(f53768f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C19204f();
            case 4:
                return new C19203e();
            case 5:
                return f53768f;
            case 6:
                C63010eb ebVar = f53769g;
                if (ebVar == null) {
                    synchronized (C19204f.class) {
                        ebVar = f53769g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53768f);
                            f53769g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
