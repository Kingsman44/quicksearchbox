package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4225bm.p4229c.C56113b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4828e.C63244b;

/* renamed from: com.google.common.o.pz */
/* compiled from: PG */
public final class C60431pz extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60431pz f163541h;

    /* renamed from: k */
    private static volatile C63010eb f163542k;

    /* renamed from: a */
    public int f163543a;

    /* renamed from: b */
    public int f163544b;

    /* renamed from: c */
    public C60439qb f163545c;

    /* renamed from: d */
    public C60429px f163546d;

    /* renamed from: e */
    public String f163547e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f163548f;

    /* renamed from: g */
    public C60441qd f163549g;

    /* renamed from: i */
    private C63244b f163550i;

    /* renamed from: j */
    private byte f163551j = 2;

    static {
        C60431pz pzVar = new C60431pz();
        f163541h = pzVar;
        C62942bv.registerDefaultInstance(C60431pz.class, pzVar);
    }

    private C60431pz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163551j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163551j = b;
                return null;
            case 2:
                return newMessageInfo(f163541h, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0001\u0002င\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ᐉ\u0003\u0006ဈ\u0004\bဌ\u0006\tဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "i", "e", C10662f.f35572a, C56113b.m87895b(), C30325g.f82003a});
            case 3:
                return new C60431pz();
            case 4:
                return new C60430py();
            case 5:
                return f163541h;
            case 6:
                C63010eb ebVar = f163542k;
                if (ebVar == null) {
                    synchronized (C60431pz.class) {
                        ebVar = f163542k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163541h);
                            f163542k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
