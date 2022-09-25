package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.jc */
/* compiled from: PG */
public final class C67048jc extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C67048jc f182253h;

    /* renamed from: i */
    private static volatile C63010eb f182254i;

    /* renamed from: a */
    public int f182255a;

    /* renamed from: b */
    public String f182256b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f182257c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public float f182258d;

    /* renamed from: e */
    public boolean f182259e;

    /* renamed from: f */
    public boolean f182260f;

    /* renamed from: g */
    public String f182261g = BuildConfig.FLAVOR;

    static {
        C67048jc jcVar = new C67048jc();
        f182253h = jcVar;
        C62942bv.registerDefaultInstance(C67048jc.class, jcVar);
    }

    private C67048jc() {
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
                return newMessageInfo(f182253h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C67048jc();
            case 4:
                return new C67047jb();
            case 5:
                return f182253h;
            case 6:
                C63010eb ebVar = f182254i;
                if (ebVar == null) {
                    synchronized (C67048jc.class) {
                        ebVar = f182254i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182253h);
                            f182254i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
