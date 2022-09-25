package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.ci */
/* compiled from: PG */
public final class C49579ci extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C49579ci f127929h;

    /* renamed from: i */
    public static final C62940bt f127930i;

    /* renamed from: j */
    private static volatile C63010eb f127931j;

    /* renamed from: a */
    public int f127932a;

    /* renamed from: b */
    public C62971cq f127933b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f127934c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f127935d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f127936e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f127937f = emptyProtobufList();

    /* renamed from: g */
    public String f127938g = BuildConfig.FLAVOR;

    static {
        C49579ci ciVar = new C49579ci();
        f127929h = ciVar;
        C62942bv.registerDefaultInstance(C49579ci.class, ciVar);
        f127930i = C62942bv.newSingularGeneratedExtension(C49598da.f127991a, ciVar, ciVar, (C62958ce) null, 286895995, C63066gd.MESSAGE, C49579ci.class);
    }

    private C49579ci() {
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
                return newMessageInfo(f127929h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0005\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005ဈ\u0000\u0006\u001b\u0007\u001b", new Object[]{"a", "b", C49589cs.class, "d", C49558bo.class, C10662f.f35572a, C49589cs.class, C30325g.f82003a, "e", C49558bo.class, C45240c.f118157a, C49589cs.class});
            case 3:
                return new C49579ci();
            case 4:
                return new C49578ch();
            case 5:
                return f127929h;
            case 6:
                C63010eb ebVar = f127931j;
                if (ebVar == null) {
                    synchronized (C49579ci.class) {
                        ebVar = f127931j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127929h);
                            f127931j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
