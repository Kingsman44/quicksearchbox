package com.google.speech.recognizer.p5233a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.speech.p5195a.C66449d;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5202d.p5203a.C66489b;

/* renamed from: com.google.speech.recognizer.a.av */
/* compiled from: PG */
public final class C67453av extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C67453av f183322n;

    /* renamed from: p */
    private static volatile C63010eb f183323p;

    /* renamed from: a */
    public int f183324a;

    /* renamed from: b */
    public int f183325b;

    /* renamed from: c */
    public int f183326c;

    /* renamed from: d */
    public float f183327d = 8000.0f;

    /* renamed from: e */
    public boolean f183328e = true;

    /* renamed from: f */
    public boolean f183329f;

    /* renamed from: g */
    public C66449d f183330g;

    /* renamed from: h */
    public boolean f183331h = true;

    /* renamed from: i */
    public int f183332i = 1;

    /* renamed from: j */
    public C66489b f183333j;

    /* renamed from: k */
    public C66422b f183334k;

    /* renamed from: l */
    public boolean f183335l;

    /* renamed from: m */
    public C63088z f183336m;

    /* renamed from: o */
    private byte f183337o = 2;

    static {
        C67453av avVar = new C67453av();
        f183322n = avVar;
        C62942bv.registerDefaultInstance(C67453av.class, avVar);
    }

    private C67453av() {
        C63088z zVar = C63088z.f170246b;
        C62942bv.emptyProtobufList();
        this.f183336m = C63088z.f170246b;
        emptyFloatList();
        emptyFloatList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183337o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183337o = b;
                return null;
            case 2:
                return newMessageInfo(f183322n, "\u0001\u000b\u0000\u0002\u00010\u000b\u0000\u0000\u0002\u0001ဌ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0007ဇ\u0006\nင\u000b\u001eᐉ% ᐉ'%ဇ*0ည+", new Object[]{"a", "b", C45240c.f118157a, C67451at.m97474b(), "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C67453av();
            case 4:
                return new C67452au();
            case 5:
                return f183322n;
            case 6:
                C63010eb ebVar = f183323p;
                if (ebVar == null) {
                    synchronized (C67453av.class) {
                        ebVar = f183323p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183322n);
                            f183323p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
