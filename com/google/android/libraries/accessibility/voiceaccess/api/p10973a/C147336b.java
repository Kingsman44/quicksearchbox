package com.google.android.libraries.accessibility.voiceaccess.api.p10973a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.accessibility.voiceaccess.api.a.b */
/* compiled from: PG */
public final class C147336b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C147336b f397726f;

    /* renamed from: g */
    private static volatile C63010eb f397727g;

    /* renamed from: a */
    public int f397728a;

    /* renamed from: b */
    public int f397729b = 1;

    /* renamed from: c */
    public C62971cq f397730c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f397731d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f397732e;

    static {
        C147336b bVar = new C147336b();
        f397726f = bVar;
        C62942bv.registerDefaultInstance(C147336b.class, bVar);
    }

    private C147336b() {
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
                return newMessageInfo(f397726f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", C147337c.f397733a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C147336b();
            case 4:
                return new C147335a();
            case 5:
                return f397726f;
            case 6:
                C63010eb ebVar = f397727g;
                if (ebVar == null) {
                    synchronized (C147336b.class) {
                        ebVar = f397727g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f397726f);
                            f397727g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
