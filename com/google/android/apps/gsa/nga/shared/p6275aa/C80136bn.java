package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80205az;
import com.google.assistant.p3825an.p3830c.p3831a.C49333j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67007hp;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bn */
/* compiled from: PG */
public final class C80136bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80136bn f219915c;

    /* renamed from: e */
    private static volatile C63010eb f219916e;

    /* renamed from: a */
    public int f219917a = 0;

    /* renamed from: b */
    public Object f219918b;

    /* renamed from: d */
    private byte f219919d = 2;

    static {
        C80136bn bnVar = new C80136bn();
        f219915c = bnVar;
        C62942bv.registerDefaultInstance(C80136bn.class, bnVar);
    }

    private C80136bn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219919d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219919d = b;
                return null;
            case 2:
                return newMessageInfo(f219915c, "\u0001\u001d\u0001\u0000\u0003$\u001d\u0000\u0000\u0004\u0003ျ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bᐼ\u0000\tြ\u0000\nြ\u0000\u000bᐼ\u0000\rြ\u0000\u000eᐼ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0013ြ\u0000\u0015ြ\u0000\u0016ြ\u0000\u0017ြ\u0000\u0018ြ\u0000\u0019ြ\u0000\u001bြ\u0000\u001cြ\u0000\u001dြ\u0000\u001fြ\u0000 ြ\u0000!ြ\u0000\"ြ\u0000#ᐼ\u0000$ြ\u0000", new Object[]{"b", "a", C80097al.class, C80095aj.class, C80101ap.class, C80107av.class, C80205az.class, C80469j.class, C80529z.class, C80527x.class, C80093ah.class, C80087ab.class, C80133bk.class, C80105at.class, C80103ar.class, C80525v.class, C49333j.class, C80519p.class, C80109ax.class, C80404f.class, C80126bd.class, C67007hp.class, C80521r.class, C80447h.class, C80128bf.class, C80135bm.class, C80111az.class, C80099an.class, C80131bi.class, C80091af.class});
            case 3:
                return new C80136bn();
            case 4:
                return new C80472k();
            case 5:
                return f219915c;
            case 6:
                C63010eb ebVar = f219916e;
                if (ebVar == null) {
                    synchronized (C80136bn.class) {
                        ebVar = f219916e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219915c);
                            f219916e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
