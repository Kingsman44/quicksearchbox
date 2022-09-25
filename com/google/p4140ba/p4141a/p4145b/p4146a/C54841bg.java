package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.bg */
/* compiled from: PG */
public final class C54841bg extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C54841bg f143970k;

    /* renamed from: l */
    private static volatile C63010eb f143971l;

    /* renamed from: a */
    public int f143972a;

    /* renamed from: b */
    public String f143973b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f143974c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f143975d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public float f143976e;

    /* renamed from: f */
    public C62971cq f143977f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public boolean f143978g;

    /* renamed from: h */
    public boolean f143979h;

    /* renamed from: i */
    public float f143980i;

    /* renamed from: j */
    public String f143981j = BuildConfig.FLAVOR;

    static {
        C54841bg bgVar = new C54841bg();
        f143970k = bgVar;
        C62942bv.registerDefaultInstance(C54841bg.class, bgVar);
    }

    private C54841bg() {
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
                return newMessageInfo(f143970k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ခ\u0003\u0005\u001a\u0006ဇ\u0004\u0007ဇ\u0005\bခ\u0006\tဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C54841bg();
            case 4:
                return new C54840bf();
            case 5:
                return f143970k;
            case 6:
                C63010eb ebVar = f143971l;
                if (ebVar == null) {
                    synchronized (C54841bg.class) {
                        ebVar = f143971l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143970k);
                            f143971l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
