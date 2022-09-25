package com.google.assistant.p3931f.p3939c;

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

/* renamed from: com.google.assistant.f.c.b */
/* compiled from: PG */
public final class C52825b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52825b f138593h;

    /* renamed from: i */
    private static volatile C63010eb f138594i;

    /* renamed from: a */
    public int f138595a;

    /* renamed from: b */
    public String f138596b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f138597c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f138598d = emptyProtobufList();

    /* renamed from: e */
    public int f138599e;

    /* renamed from: f */
    public C52820aj f138600f;

    /* renamed from: g */
    public boolean f138601g;

    static {
        C52825b bVar = new C52825b();
        f138593h = bVar;
        C62942bv.registerDefaultInstance(C52825b.class, bVar);
    }

    private C52825b() {
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
                return newMessageInfo(f138593h, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0005င\u0000\u0006ဉ\u0001\u0007\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C52828e.class, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C52825b();
            case 4:
                return new C52810a();
            case 5:
                return f138593h;
            case 6:
                C63010eb ebVar = f138594i;
                if (ebVar == null) {
                    synchronized (C52825b.class) {
                        ebVar = f138594i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138593h);
                            f138594i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
