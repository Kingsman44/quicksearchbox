package com.google.protos.p4816ai.p4820d.p4824c.p4825a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.ai.d.c.a.b */
/* compiled from: PG */
public final class C63227b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63227b f170820d;

    /* renamed from: e */
    public static final C62940bt f170821e;

    /* renamed from: f */
    private static volatile C63010eb f170822f;

    /* renamed from: a */
    public int f170823a;

    /* renamed from: b */
    public String f170824b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f170825c = BuildConfig.FLAVOR;

    static {
        C63227b bVar = new C63227b();
        f170820d = bVar;
        C62942bv.registerDefaultInstance(C63227b.class, bVar);
        f170821e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, bVar, bVar, (C62958ce) null, 357249269, C63066gd.MESSAGE, C63227b.class);
    }

    private C63227b() {
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
                return newMessageInfo(f170820d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63227b();
            case 4:
                return new C63226a();
            case 5:
                return f170820d;
            case 6:
                C63010eb ebVar = f170822f;
                if (ebVar == null) {
                    synchronized (C63227b.class) {
                        ebVar = f170822f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170820d);
                            f170822f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
