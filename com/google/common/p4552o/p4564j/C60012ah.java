package com.google.common.p4552o.p4564j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.j.ah */
/* compiled from: PG */
public final class C60012ah extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C60012ah f162194m;

    /* renamed from: q */
    private static volatile C63010eb f162195q;

    /* renamed from: a */
    public int f162196a;

    /* renamed from: b */
    public int f162197b = 1;

    /* renamed from: c */
    public C60027b f162198c;

    /* renamed from: d */
    public C60024at f162199d;

    /* renamed from: e */
    public C60019ao f162200e;

    /* renamed from: f */
    public C60008ad f162201f;

    /* renamed from: g */
    public C60043r f162202g;

    /* renamed from: h */
    public boolean f162203h;

    /* renamed from: i */
    public String f162204i;

    /* renamed from: j */
    public String f162205j;

    /* renamed from: k */
    public int f162206k;

    /* renamed from: l */
    public String f162207l;

    /* renamed from: n */
    private C60031f f162208n;

    /* renamed from: o */
    private C60047v f162209o;

    /* renamed from: p */
    private byte f162210p = 2;

    static {
        C60012ah ahVar = new C60012ah();
        f162194m = ahVar;
        C62942bv.registerDefaultInstance(C60012ah.class, ahVar);
    }

    private C60012ah() {
        emptyProtobufList();
        emptyProtobufList();
        this.f162204i = BuildConfig.FLAVOR;
        this.f162205j = BuildConfig.FLAVOR;
        this.f162207l = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162210p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162210p = b;
                return null;
            case 2:
                return newMessageInfo(f162194m, "\u0001\r\u0000\u0001\u0001!\r\u0000\u0000\u0003\u0001ဌ\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0005ᐉ\u0006\bᐉ\b\u000eဉ\n\u0012ဉ\u000e\u0018ဉ\u0017\u001bဇ\u0018\u001cဈ\u0019\u001eဈ\u001b ဌ\u001d!ဈ\u001e", new Object[]{"a", "b", C60010af.f162192a, C45240c.f118157a, C48004n.f124238a, "d", C66412o.f180592a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C60011ag.f162193a, "l"});
            case 3:
                return new C60012ah();
            case 4:
                return new C60009ae();
            case 5:
                return f162194m;
            case 6:
                C63010eb ebVar = f162195q;
                if (ebVar == null) {
                    synchronized (C60012ah.class) {
                        ebVar = f162195q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162194m);
                            f162195q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
