package com.google.protos.youtube.elements;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.x */
/* compiled from: PG */
public final class C66266x extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C66266x f180207h;

    /* renamed from: i */
    public static final C62940bt f180208i;

    /* renamed from: j */
    private static volatile C63010eb f180209j;

    /* renamed from: a */
    public int f180210a;

    /* renamed from: b */
    public int f180211b;

    /* renamed from: c */
    public float f180212c;

    /* renamed from: d */
    public boolean f180213d = true;

    /* renamed from: e */
    public int f180214e;

    /* renamed from: f */
    public String f180215f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C66262t f180216g;

    static {
        C66266x xVar = new C66266x();
        f180207h = xVar;
        C62942bv.registerDefaultInstance(C66266x.class, xVar);
        f180208i = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, xVar, xVar, (C62958ce) null, 281539545, C63066gd.MESSAGE, C66266x.class);
    }

    private C66266x() {
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
                return newMessageInfo(f180207h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C66267y.f180217a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C66266x();
            case 4:
                return new C66265w();
            case 5:
                return f180207h;
            case 6:
                C63010eb ebVar = f180209j;
                if (ebVar == null) {
                    synchronized (C66266x.class) {
                        ebVar = f180209j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180207h);
                            f180209j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
