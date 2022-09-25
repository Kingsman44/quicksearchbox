package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3781ad.p3789d.C48745c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.ai */
/* compiled from: PG */
public final class C54816ai extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54816ai f143818i;

    /* renamed from: j */
    private static volatile C63010eb f143819j;

    /* renamed from: a */
    public int f143820a;

    /* renamed from: b */
    public String f143821b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f143822c;

    /* renamed from: d */
    public int f143823d;

    /* renamed from: e */
    public String f143824e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f143825f;

    /* renamed from: g */
    public String f143826g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f143827h;

    static {
        C54816ai aiVar = new C54816ai();
        f143818i = aiVar;
        C62942bv.registerDefaultInstance(C54816ai.class, aiVar);
    }

    private C54816ai() {
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
                return newMessageInfo(f143818i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"a", "b", C45240c.f118157a, C48582b.m85244b(), "d", C48745c.f126137a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C54816ai();
            case 4:
                return new C54815ah();
            case 5:
                return f143818i;
            case 6:
                C63010eb ebVar = f143819j;
                if (ebVar == null) {
                    synchronized (C54816ai.class) {
                        ebVar = f143819j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143818i);
                            f143819j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
