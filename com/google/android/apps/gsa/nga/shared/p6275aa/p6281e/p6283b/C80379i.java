package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.i */
/* compiled from: PG */
public final class C80379i extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C80379i f220555h;

    /* renamed from: i */
    private static volatile C63010eb f220556i;

    /* renamed from: a */
    public C62971cq f220557a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public boolean f220558b;

    /* renamed from: c */
    public boolean f220559c;

    /* renamed from: d */
    public boolean f220560d;

    /* renamed from: e */
    public boolean f220561e;

    /* renamed from: f */
    public boolean f220562f;

    /* renamed from: g */
    public boolean f220563g;

    static {
        C80379i iVar = new C80379i();
        f220555h = iVar;
        C62942bv.registerDefaultInstance(C80379i.class, iVar);
    }

    private C80379i() {
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
                return newMessageInfo(f220555h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001Ț\u0002\u0007\u0003\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, "e", C30325g.f82003a});
            case 3:
                return new C80379i();
            case 4:
                return new C80378h();
            case 5:
                return f220555h;
            case 6:
                C63010eb ebVar = f220556i;
                if (ebVar == null) {
                    synchronized (C80379i.class) {
                        ebVar = f220556i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220555h);
                            f220556i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
