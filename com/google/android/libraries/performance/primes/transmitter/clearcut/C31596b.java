package com.google.android.libraries.performance.primes.transmitter.clearcut;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.performance.primes.transmitter.C31617i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.b */
/* compiled from: PG */
public final class C31596b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C31596b f85041i;

    /* renamed from: j */
    public static final C62940bt f85042j;

    /* renamed from: k */
    private static volatile C63010eb f85043k;

    /* renamed from: a */
    public int f85044a;

    /* renamed from: b */
    public String f85045b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f85046c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f85047d;

    /* renamed from: e */
    public String f85048e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f85049f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62961ch f85050g = emptyIntList();

    /* renamed from: h */
    public boolean f85051h;

    static {
        C31596b bVar = new C31596b();
        f85041i = bVar;
        C62942bv.registerDefaultInstance(C31596b.class, bVar);
        f85042j = C62942bv.newSingularGeneratedExtension(C31617i.f85086c, bVar, bVar, (C62958ce) null, 334728578, C63066gd.MESSAGE, C31596b.class);
    }

    private C31596b() {
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
                return newMessageInfo(f85041i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006'\u0007ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C31596b();
            case 4:
                return new C31595a();
            case 5:
                return f85041i;
            case 6:
                C63010eb ebVar = f85043k;
                if (ebVar == null) {
                    synchronized (C31596b.class) {
                        ebVar = f85043k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85041i);
                            f85043k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
