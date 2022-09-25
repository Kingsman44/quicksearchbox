package com.google.android.apps.gsa.nga.shared.p6274a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.ag */
/* compiled from: PG */
public final class C80053ag extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80053ag f219675f;

    /* renamed from: g */
    private static volatile C63010eb f219676g;

    /* renamed from: a */
    public String f219677a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f219678b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f219679c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f219680d = emptyProtobufList();

    /* renamed from: e */
    public C80068n f219681e;

    static {
        C80053ag agVar = new C80053ag();
        f219675f = agVar;
        C62942bv.registerDefaultInstance(C80053ag.class, agVar);
    }

    private C80053ag() {
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
                return newMessageInfo(f219675f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004\u001b\u0005\t", new Object[]{"a", "b", C45240c.f118157a, "d", C80055ai.class, "e"});
            case 3:
                return new C80053ag();
            case 4:
                return new C80052af();
            case 5:
                return f219675f;
            case 6:
                C63010eb ebVar = f219676g;
                if (ebVar == null) {
                    synchronized (C80053ag.class) {
                        ebVar = f219676g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219675f);
                            f219676g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
