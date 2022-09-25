package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54781a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.cm */
/* compiled from: PG */
public final class C7586cm extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C7586cm f26206k;

    /* renamed from: l */
    private static volatile C63010eb f26207l;

    /* renamed from: a */
    public int f26208a;

    /* renamed from: b */
    public String f26209b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f26210c;

    /* renamed from: d */
    public C62971cq f26211d = emptyProtobufList();

    /* renamed from: e */
    public String f26212e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f26213f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f26214g;

    /* renamed from: h */
    public C62971cq f26215h = emptyProtobufList();

    /* renamed from: i */
    public String f26216i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f26217j = BuildConfig.FLAVOR;

    static {
        C7586cm cmVar = new C7586cm();
        f26206k = cmVar;
        C62942bv.registerDefaultInstance(C7586cm.class, cmVar);
    }

    private C7586cm() {
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
                return newMessageInfo(f26206k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007\u001b\bဈ\u0005\tဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C7818lb.class, "e", C10662f.f35572a, C30325g.f82003a, C54781a.f143722a, C19618h.f54585a, C7584ck.class, "i", "j"});
            case 3:
                return new C7586cm();
            case 4:
                return new C7585cl();
            case 5:
                return f26206k;
            case 6:
                C63010eb ebVar = f26207l;
                if (ebVar == null) {
                    synchronized (C7586cm.class) {
                        ebVar = f26207l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26206k);
                            f26207l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
