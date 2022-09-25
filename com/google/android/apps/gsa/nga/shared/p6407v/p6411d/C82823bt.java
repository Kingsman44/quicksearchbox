package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.bt */
/* compiled from: PG */
public final class C82823bt extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C82823bt f225680i;

    /* renamed from: k */
    private static volatile C63010eb f225681k;

    /* renamed from: a */
    public int f225682a;

    /* renamed from: b */
    public C82988hw f225683b;

    /* renamed from: c */
    public C80513b f225684c;

    /* renamed from: d */
    public String f225685d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f225686e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f225687f;

    /* renamed from: g */
    public int f225688g;

    /* renamed from: h */
    public boolean f225689h;

    /* renamed from: j */
    private byte f225690j = 2;

    static {
        C82823bt btVar = new C82823bt();
        f225680i = btVar;
        C62942bv.registerDefaultInstance(C82823bt.class, btVar);
    }

    private C82823bt() {
    }

    /* renamed from: a */
    public final boolean mo76621a() {
        return (this.f225682a & 16) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225690j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225690j = b;
                return null;
            case 2:
                return newMessageInfo(f225680i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဌ\u0004\u0005ဈ\u0003\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C80517f.m128188b(), "e", C30325g.f82003a, C82831ca.m132407b(), C19618h.f54585a});
            case 3:
                return new C82823bt();
            case 4:
                return new C82822bs();
            case 5:
                return f225680i;
            case 6:
                C63010eb ebVar = f225681k;
                if (ebVar == null) {
                    synchronized (C82823bt.class) {
                        ebVar = f225681k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225680i);
                            f225681k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
