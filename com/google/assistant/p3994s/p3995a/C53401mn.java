package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mn */
/* compiled from: PG */
public final class C53401mn extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53401mn f140126f;

    /* renamed from: g */
    private static volatile C63010eb f140127g;

    /* renamed from: a */
    public int f140128a;

    /* renamed from: b */
    public String f140129b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140130c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f140131d = emptyProtobufList();

    /* renamed from: e */
    public int f140132e;

    static {
        C53401mn mnVar = new C53401mn();
        f140126f = mnVar;
        C62942bv.registerDefaultInstance(C53401mn.class, mnVar);
    }

    private C53401mn() {
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
                return newMessageInfo(f140126f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003င\u0003\u0005ဈ\u0001", new Object[]{"a", "b", "d", C53368lh.class, "e", C45240c.f118157a});
            case 3:
                return new C53401mn();
            case 4:
                return new C53400mm();
            case 5:
                return f140126f;
            case 6:
                C63010eb ebVar = f140127g;
                if (ebVar == null) {
                    synchronized (C53401mn.class) {
                        ebVar = f140127g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140126f);
                            f140127g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
