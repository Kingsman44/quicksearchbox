package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.cm */
/* compiled from: PG */
public final class C122448cm extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C122448cm f339454i;

    /* renamed from: j */
    private static volatile C63010eb f339455j;

    /* renamed from: a */
    public int f339456a;

    /* renamed from: b */
    public C62971cq f339457b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f339458c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f339459d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f339460e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public int f339461f;

    /* renamed from: g */
    public long f339462g;

    /* renamed from: h */
    public C62995dn f339463h = C62995dn.f170057a;

    static {
        C122448cm cmVar = new C122448cm();
        f339454i = cmVar;
        C62942bv.registerDefaultInstance(C122448cm.class, cmVar);
    }

    private C122448cm() {
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
                return newMessageInfo(f339454i, "\u0000\b\u0000\u0000\u0001\u000b\b\u0001\u0004\u0000\u0001\u0004\u0003\u001b\u0006\u001b\u0007Ț\bȚ\t\u0004\n\u0002\u000b2", new Object[]{"a", "b", C122384ac.class, C45240c.f118157a, C122416bh.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C122447cl.f339453a});
            case 3:
                return new C122448cm();
            case 4:
                return new C122446ck();
            case 5:
                return f339454i;
            case 6:
                C63010eb ebVar = f339455j;
                if (ebVar == null) {
                    synchronized (C122448cm.class) {
                        ebVar = f339455j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339454i);
                            f339455j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
