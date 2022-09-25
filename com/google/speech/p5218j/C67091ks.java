package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ks */
/* compiled from: PG */
public final class C67091ks extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C67091ks f182386h;

    /* renamed from: j */
    private static volatile C63010eb f182387j;

    /* renamed from: a */
    public int f182388a;

    /* renamed from: b */
    public boolean f182389b;

    /* renamed from: c */
    public String f182390c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public float f182391d;

    /* renamed from: e */
    public boolean f182392e;

    /* renamed from: f */
    public C62995dn f182393f = C62995dn.f170057a;

    /* renamed from: g */
    public C62971cq f182394g = C62942bv.emptyProtobufList();

    /* renamed from: i */
    private C62995dn f182395i = C62995dn.f170057a;

    static {
        C67091ks ksVar = new C67091ks();
        f182386h = ksVar;
        C62942bv.registerDefaultInstance(C67091ks.class, ksVar);
    }

    private C67091ks() {
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
                return newMessageInfo(f182386h, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0002\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u00062\u00072\b\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e", "i", C67090kr.f182385a, C10662f.f35572a, C67089kq.f182384a, C30325g.f82003a});
            case 3:
                return new C67091ks();
            case 4:
                return new C67088kp();
            case 5:
                return f182386h;
            case 6:
                C63010eb ebVar = f182387j;
                if (ebVar == null) {
                    synchronized (C67091ks.class) {
                        ebVar = f182387j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182386h);
                            f182387j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
