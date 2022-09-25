package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.at */
/* compiled from: PG */
public final class C123726at extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C123726at f341743h;

    /* renamed from: i */
    public static final C62940bt f341744i;

    /* renamed from: j */
    private static volatile C63010eb f341745j;

    /* renamed from: a */
    public int f341746a;

    /* renamed from: b */
    public C62971cq f341747b = emptyProtobufList();

    /* renamed from: c */
    public boolean f341748c;

    /* renamed from: d */
    public int f341749d;

    /* renamed from: e */
    public int f341750e;

    /* renamed from: f */
    public int f341751f;

    /* renamed from: g */
    public C62910ar f341752g;

    static {
        C123726at atVar = new C123726at();
        f341743h = atVar;
        C62942bv.registerDefaultInstance(C123726at.class, atVar);
        f341744i = C62942bv.newSingularGeneratedExtension(C123777f.f341922a, atVar, atVar, (C62958ce) null, 317624935, C63066gd.MESSAGE, C123726at.class);
    }

    private C123726at() {
        C62942bv.emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo106111a() {
        C62971cq cqVar = this.f341747b;
        if (!cqVar.mo58948c()) {
            this.f341747b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f341743h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0000\u0002ဇ\u0000\u0003င\u0001\u0004\u001b\u0006ဌ\u0002\u0007ဌ\u0003\bဉ\u0004", new Object[]{"a", C45240c.f118157a, "d", "b", C123723aq.class, "e", C123724ar.f341742a, C10662f.f35572a, C123720an.f341736a, C30325g.f82003a});
            case 3:
                return new C123726at();
            case 4:
                return new C123719am();
            case 5:
                return f341743h;
            case 6:
                C63010eb ebVar = f341745j;
                if (ebVar == null) {
                    synchronized (C123726at.class) {
                        ebVar = f341745j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341743h);
                            f341745j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
