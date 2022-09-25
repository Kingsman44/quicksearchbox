package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3775ac.p3779d.C48469i;
import com.google.common.p4552o.C60414pi;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bb */
/* compiled from: PG */
public final class C53569bb extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53569bb f140594i;

    /* renamed from: j */
    private static volatile C63010eb f140595j;

    /* renamed from: a */
    public int f140596a;

    /* renamed from: b */
    public String f140597b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140598c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f140599d;

    /* renamed from: e */
    public int f140600e;

    /* renamed from: f */
    public C62961ch f140601f = emptyIntList();

    /* renamed from: g */
    public C62961ch f140602g = emptyIntList();

    /* renamed from: h */
    public C60414pi f140603h;

    static {
        C53569bb bbVar = new C53569bb();
        f140594i = bbVar;
        C62942bv.registerDefaultInstance(C53569bb.class, bbVar);
    }

    private C53569bb() {
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
                return newMessageInfo(f140594i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဈ\u0001\u0004\u0016\u0005\u0016\u0006င\u0003\u0007ဉ\u0004", new Object[]{"a", "b", "d", C48469i.f125215a, C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, "e", C19618h.f54585a});
            case 3:
                return new C53569bb();
            case 4:
                return new C53568ba();
            case 5:
                return f140594i;
            case 6:
                C63010eb ebVar = f140595j;
                if (ebVar == null) {
                    synchronized (C53569bb.class) {
                        ebVar = f140595j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140594i);
                            f140595j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
