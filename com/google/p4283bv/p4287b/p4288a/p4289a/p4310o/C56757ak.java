package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p2259n.p2260a.C29763b;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.b.a.a.o.ak */
/* compiled from: PG */
public final class C56757ak extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C56757ak f151469k;

    /* renamed from: l */
    private static volatile C63010eb f151470l;

    /* renamed from: a */
    public int f151471a;

    /* renamed from: b */
    public C63088z f151472b = C63088z.f170246b;

    /* renamed from: c */
    public String f151473c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151474d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56751ae f151475e;

    /* renamed from: f */
    public C56753ag f151476f;

    /* renamed from: g */
    public int f151477g;

    /* renamed from: h */
    public C56756aj f151478h;

    /* renamed from: i */
    public int f151479i;

    /* renamed from: j */
    public boolean f151480j;

    static {
        C56757ak akVar = new C56757ak();
        f151469k = akVar;
        C62942bv.registerDefaultInstance(C56757ak.class, akVar);
    }

    private C56757ak() {
        emptyIntList();
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
                return newMessageInfo(f151469k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ည\u0000\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဌ\u0005\u0006ဉ\u0006\u0007င\u0007\bဈ\u0001\tဈ\u0002\nဇ\b", new Object[]{"a", "b", "e", C10662f.f35572a, C30325g.f82003a, C29763b.m54881b(), C19618h.f54585a, "i", C45240c.f118157a, "d", "j"});
            case 3:
                return new C56757ak();
            case 4:
                return new C56754ah();
            case 5:
                return f151469k;
            case 6:
                C63010eb ebVar = f151470l;
                if (ebVar == null) {
                    synchronized (C56757ak.class) {
                        ebVar = f151470l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151469k);
                            f151470l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
