package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.bh */
/* compiled from: PG */
public final class C82811bh extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C82811bh f225645j;

    /* renamed from: k */
    private static volatile C63010eb f225646k;

    /* renamed from: a */
    public int f225647a;

    /* renamed from: b */
    public C82808be f225648b;

    /* renamed from: c */
    public int f225649c;

    /* renamed from: d */
    public String f225650d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f225651e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f225652f = emptyProtobufList();

    /* renamed from: g */
    public long f225653g;

    /* renamed from: h */
    public long f225654h;

    /* renamed from: i */
    public long f225655i;

    static {
        C82811bh bhVar = new C82811bh();
        f225645j = bhVar;
        C62942bv.registerDefaultInstance(C82811bh.class, bhVar);
    }

    private C82811bh() {
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
                return newMessageInfo(f225645j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001b\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"a", "b", C45240c.f118157a, C82810bg.f225644a, "d", "e", C10662f.f35572a, C82808be.class, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C82811bh();
            case 4:
                return new C82809bf();
            case 5:
                return f225645j;
            case 6:
                C63010eb ebVar = f225646k;
                if (ebVar == null) {
                    synchronized (C82811bh.class) {
                        ebVar = f225646k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225645j);
                            f225646k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
