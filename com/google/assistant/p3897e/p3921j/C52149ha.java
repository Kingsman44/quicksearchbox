package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ha */
/* compiled from: PG */
public final class C52149ha extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52149ha f136834h;

    /* renamed from: i */
    private static volatile C63010eb f136835i;

    /* renamed from: a */
    public int f136836a;

    /* renamed from: b */
    public String f136837b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f136838c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f136839d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f136840e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f136841f;

    /* renamed from: g */
    public String f136842g;

    static {
        C52149ha haVar = new C52149ha();
        f136834h = haVar;
        C62942bv.registerDefaultInstance(C52149ha.class, haVar);
    }

    private C52149ha() {
        C62942bv.emptyProtobufList();
        this.f136841f = emptyProtobufList();
        this.f136842g = BuildConfig.FLAVOR;
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
                return newMessageInfo(f136834h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0006\u001b\bဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C52146gy.class, C30325g.f82003a});
            case 3:
                return new C52149ha();
            case 4:
                return new C52147gz();
            case 5:
                return f136834h;
            case 6:
                C63010eb ebVar = f136835i;
                if (ebVar == null) {
                    synchronized (C52149ha.class) {
                        ebVar = f136835i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136834h);
                            f136835i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
