package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.dy */
/* compiled from: PG */
public final class C51034dy extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51034dy f132878i;

    /* renamed from: k */
    private static volatile C63010eb f132879k;

    /* renamed from: a */
    public int f132880a;

    /* renamed from: b */
    public String f132881b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f132882c;

    /* renamed from: d */
    public C52541vo f132883d;

    /* renamed from: e */
    public C51016dg f132884e;

    /* renamed from: f */
    public int f132885f;

    /* renamed from: g */
    public String f132886g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C51012dc f132887h;

    /* renamed from: j */
    private byte f132888j = 2;

    static {
        C51034dy dyVar = new C51034dy();
        f132878i = dyVar;
        C62942bv.registerDefaultInstance(C51034dy.class, dyVar);
    }

    private C51034dy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132888j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132888j = b;
                return null;
            case 2:
                return newMessageInfo(f132878i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C51032dw.f132877a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C51034dy();
            case 4:
                return new C51031dv();
            case 5:
                return f132878i;
            case 6:
                C63010eb ebVar = f132879k;
                if (ebVar == null) {
                    synchronized (C51034dy.class) {
                        ebVar = f132879k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132878i);
                            f132879k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
