package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.dy */
/* compiled from: PG */
public final class C80750dy extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C80750dy f221646i;

    /* renamed from: j */
    private static volatile C63010eb f221647j;

    /* renamed from: a */
    public int f221648a = 0;

    /* renamed from: b */
    public Object f221649b;

    /* renamed from: c */
    public C80736dk f221650c;

    /* renamed from: d */
    public int f221651d;

    /* renamed from: e */
    public boolean f221652e;

    /* renamed from: f */
    public String f221653f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f221654g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f221655h;

    static {
        C80750dy dyVar = new C80750dy();
        f221646i = dyVar;
        C62942bv.registerDefaultInstance(C80750dy.class, dyVar);
    }

    private C80750dy() {
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
                return newMessageInfo(f221646i, "\u0000\b\u0001\u0000\u0002\n\b\u0000\u0000\u0000\u0002\u0004\u0003\u0007\u0005Ȉ\u0006<\u0000\u0007<\u0000\b\f\tȈ\n\t", new Object[]{"b", "a", "d", "e", C10662f.f35572a, C80747dv.class, C80800fu.class, C19618h.f54585a, C30325g.f82003a, C45240c.f118157a});
            case 3:
                return new C80750dy();
            case 4:
                return new C80748dw();
            case 5:
                return f221646i;
            case 6:
                C63010eb ebVar = f221647j;
                if (ebVar == null) {
                    synchronized (C80750dy.class) {
                        ebVar = f221647j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221646i);
                            f221647j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
