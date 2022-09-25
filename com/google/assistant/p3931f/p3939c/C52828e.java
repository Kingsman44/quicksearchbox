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

/* renamed from: com.google.assistant.f.c.e */
/* compiled from: PG */
public final class C52828e extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52828e f138602h;

    /* renamed from: i */
    private static volatile C63010eb f138603i;

    /* renamed from: a */
    public String f138604a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f138605b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f138606c = emptyProtobufList();

    /* renamed from: d */
    public boolean f138607d;

    /* renamed from: e */
    public boolean f138608e;

    /* renamed from: f */
    public boolean f138609f;

    /* renamed from: g */
    public boolean f138610g;

    static {
        C52828e eVar = new C52828e();
        f138602h = eVar;
        C62942bv.registerDefaultInstance(C52828e.class, eVar);
    }

    private C52828e() {
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
                return newMessageInfo(f138602h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0002\u0000\u0001Ȉ\u0003\u001b\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u001b\b\u0007", new Object[]{"a", C45240c.f118157a, C52838o.class, "d", "e", C10662f.f35572a, "b", C52832i.class, C30325g.f82003a});
            case 3:
                return new C52828e();
            case 4:
                return new C52827d();
            case 5:
                return f138602h;
            case 6:
                C63010eb ebVar = f138603i;
                if (ebVar == null) {
                    synchronized (C52828e.class) {
                        ebVar = f138603i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138602h);
                            f138603i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
