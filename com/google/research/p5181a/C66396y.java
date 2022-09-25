package com.google.research.p5181a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.research.a.y */
/* compiled from: PG */
public final class C66396y extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C66396y f180539n;

    /* renamed from: p */
    private static volatile C63010eb f180540p;

    /* renamed from: a */
    public int f180541a;

    /* renamed from: b */
    public String f180542b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f180543c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public float f180544d;

    /* renamed from: e */
    public float f180545e;

    /* renamed from: f */
    public float f180546f;

    /* renamed from: g */
    public float f180547g;

    /* renamed from: h */
    public float f180548h;

    /* renamed from: i */
    public float f180549i;

    /* renamed from: j */
    public float f180550j;

    /* renamed from: k */
    public String f180551k;

    /* renamed from: l */
    public float f180552l;

    /* renamed from: m */
    public float f180553m;

    /* renamed from: o */
    private C62995dn f180554o = C62995dn.f170057a;

    static {
        C66396y yVar = new C66396y();
        f180539n = yVar;
        C62942bv.registerDefaultInstance(C66396y.class, yVar);
    }

    private C66396y() {
        C62942bv.emptyProtobufList();
        this.f180551k = BuildConfig.FLAVOR;
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
                return newMessageInfo(f180539n, "\u0001\r\u0000\u0001\u0001\u000f\r\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\fဈ\n\rခ\u000b\u000eခ\f\u000f2", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C66412o.f180592a, C66395x.f180538a});
            case 3:
                return new C66396y();
            case 4:
                return new C66394w();
            case 5:
                return f180539n;
            case 6:
                C63010eb ebVar = f180540p;
                if (ebVar == null) {
                    synchronized (C66396y.class) {
                        ebVar = f180540p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180539n);
                            f180540p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
