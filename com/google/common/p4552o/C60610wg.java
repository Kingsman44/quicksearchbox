package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.wg */
/* compiled from: PG */
public final class C60610wg extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C60610wg f164428k;

    /* renamed from: l */
    private static volatile C63010eb f164429l;

    /* renamed from: a */
    public int f164430a;

    /* renamed from: b */
    public C62961ch f164431b = emptyIntList();

    /* renamed from: c */
    public String f164432c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f164433d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f164434e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62971cq f164435f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public boolean f164436g;

    /* renamed from: h */
    public boolean f164437h;

    /* renamed from: i */
    public int f164438i;

    /* renamed from: j */
    public C59753ej f164439j;

    static {
        C60610wg wgVar = new C60610wg();
        f164428k = wgVar;
        C62942bv.registerDefaultInstance(C60610wg.class, wgVar);
    }

    private C60610wg() {
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
                return newMessageInfo(f164428k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001\u001e\u0002ဈ\u0000\u0003\u001a\u0004\u001a\u0005\u001a\u0006ဇ\u0001\u0007ဇ\u0002\bင\u0003\tဉ\u0004", new Object[]{"a", "b", C60609wf.m92629b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C60610wg();
            case 4:
                return new C60607wd();
            case 5:
                return f164428k;
            case 6:
                C63010eb ebVar = f164429l;
                if (ebVar == null) {
                    synchronized (C60610wg.class) {
                        ebVar = f164429l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164428k);
                            f164429l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
