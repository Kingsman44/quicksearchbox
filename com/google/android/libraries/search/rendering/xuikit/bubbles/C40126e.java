package com.google.android.libraries.search.rendering.xuikit.bubbles;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4342b.C56947k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e */
/* compiled from: PG */
public final class C40126e extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C40126e f105385i;

    /* renamed from: k */
    private static volatile C63010eb f105386k;

    /* renamed from: a */
    public int f105387a;

    /* renamed from: b */
    public C56947k f105388b;

    /* renamed from: c */
    public int f105389c;

    /* renamed from: d */
    public C40101b f105390d;

    /* renamed from: e */
    public String f105391e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f105392f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f105393g;

    /* renamed from: h */
    public String f105394h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private byte f105395j = 2;

    static {
        C40126e eVar = new C40126e();
        f105385i = eVar;
        C62942bv.registerDefaultInstance(C40126e.class, eVar);
    }

    private C40126e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f105395j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f105395j = b;
                return null;
            case 2:
                return newMessageInfo(f105385i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C40126e();
            case 4:
                return new C40114d();
            case 5:
                return f105385i;
            case 6:
                C63010eb ebVar = f105386k;
                if (ebVar == null) {
                    synchronized (C40126e.class) {
                        ebVar = f105386k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f105385i);
                            f105386k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
