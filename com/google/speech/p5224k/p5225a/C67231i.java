package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.i */
/* compiled from: PG */
public final class C67231i extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C67231i f182719l;

    /* renamed from: m */
    private static volatile C63010eb f182720m;

    /* renamed from: a */
    public int f182721a;

    /* renamed from: b */
    public String f182722b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f182723c;

    /* renamed from: d */
    public float f182724d;

    /* renamed from: e */
    public int f182725e;

    /* renamed from: f */
    public C62971cq f182726f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public int f182727g;

    /* renamed from: h */
    public boolean f182728h;

    /* renamed from: i */
    public boolean f182729i;

    /* renamed from: j */
    public float f182730j;

    /* renamed from: k */
    public int f182731k;

    static {
        C67231i iVar = new C67231i();
        f182719l = iVar;
        C62942bv.registerDefaultInstance(C67231i.class, iVar);
    }

    private C67231i() {
        emptyIntList();
        emptyFloatList();
        emptyLongList();
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
                return newMessageInfo(f182719l, "\u0001\n\u0000\u0001\u0001\u0014\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0005င\u0004\u0006\u001a\u0007ဌ\u0005\bဇ\u0006\u000fဇ\r\u0013ခ\u000e\u0014င\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C67229g.m97440b(), C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C67231i();
            case 4:
                return new C67230h();
            case 5:
                return f182719l;
            case 6:
                C63010eb ebVar = f182720m;
                if (ebVar == null) {
                    synchronized (C67231i.class) {
                        ebVar = f182720m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182719l);
                            f182720m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
