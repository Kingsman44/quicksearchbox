package com.google.p4184bj.p4193c.p4200e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.e.b */
/* compiled from: PG */
public final class C55994b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55994b f149106h;

    /* renamed from: i */
    private static volatile C63010eb f149107i;

    /* renamed from: a */
    public int f149108a;

    /* renamed from: b */
    public String f149109b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f149110c;

    /* renamed from: d */
    public int f149111d;

    /* renamed from: e */
    public C55996d f149112e;

    /* renamed from: f */
    public int f149113f;

    /* renamed from: g */
    public int f149114g;

    static {
        C55994b bVar = new C55994b();
        f149106h = bVar;
        C62942bv.registerDefaultInstance(C55994b.class, bVar);
    }

    private C55994b() {
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
                return newMessageInfo(f149106h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001င\u0001\u0002ဉ\u0004\u0003ဌ\u0003\u0004ဈ\u0000\tဌ\b\u000bင\n", new Object[]{"a", C45240c.f118157a, "e", "d", C55998f.m87879b(), "b", C10662f.f35572a, C52431rm.m86629c(), C30325g.f82003a});
            case 3:
                return new C55994b();
            case 4:
                return new C55993a();
            case 5:
                return f149106h;
            case 6:
                C63010eb ebVar = f149107i;
                if (ebVar == null) {
                    synchronized (C55994b.class) {
                        ebVar = f149107i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149106h);
                            f149107i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
