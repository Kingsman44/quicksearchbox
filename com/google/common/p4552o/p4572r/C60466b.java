package com.google.common.p4552o.p4572r;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.integrations.p3022f.p3023a.C38513a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.apr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.r.b */
/* compiled from: PG */
public final class C60466b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C60466b f163636i;

    /* renamed from: j */
    public static final C62940bt f163637j;

    /* renamed from: k */
    private static volatile C63010eb f163638k;

    /* renamed from: a */
    public int f163639a;

    /* renamed from: b */
    public int f163640b;

    /* renamed from: c */
    public int f163641c;

    /* renamed from: d */
    public boolean f163642d;

    /* renamed from: e */
    public boolean f163643e;

    /* renamed from: f */
    public boolean f163644f;

    /* renamed from: g */
    public long f163645g;

    /* renamed from: h */
    public String f163646h = BuildConfig.FLAVOR;

    static {
        C60466b bVar = new C60466b();
        f163636i = bVar;
        C62942bv.registerDefaultInstance(C60466b.class, bVar);
        f163637j = C62942bv.newSingularGeneratedExtension(apr.f159695c, bVar, bVar, (C62958ce) null, 459094135, C63066gd.MESSAGE, C60466b.class);
    }

    private C60466b() {
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
                return newMessageInfo(f163636i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C60467c.f163647a, C45240c.f118157a, C38513a.f101874a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C60466b();
            case 4:
                return new C60465a();
            case 5:
                return f163636i;
            case 6:
                C63010eb ebVar = f163638k;
                if (ebVar == null) {
                    synchronized (C60466b.class) {
                        ebVar = f163638k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163636i);
                            f163638k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
