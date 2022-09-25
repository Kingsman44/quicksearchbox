package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.bo */
/* compiled from: PG */
public final class C49558bo extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49558bo f127872f;

    /* renamed from: g */
    private static volatile C63010eb f127873g;

    /* renamed from: a */
    public int f127874a;

    /* renamed from: b */
    public String f127875b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f127876c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f127877d = emptyProtobufList();

    /* renamed from: e */
    public C49591cu f127878e;

    static {
        C49558bo boVar = new C49558bo();
        f127872f = boVar;
        C62942bv.registerDefaultInstance(C49558bo.class, boVar);
    }

    private C49558bo() {
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
                return newMessageInfo(f127872f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0003\u001a\u0004\u001b\u0005ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", C49542az.class, "e"});
            case 3:
                return new C49558bo();
            case 4:
                return new C49557bn();
            case 5:
                return f127872f;
            case 6:
                C63010eb ebVar = f127873g;
                if (ebVar == null) {
                    synchronized (C49558bo.class) {
                        ebVar = f127873g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127872f);
                            f127873g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
