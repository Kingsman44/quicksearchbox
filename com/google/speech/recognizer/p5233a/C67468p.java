package com.google.speech.recognizer.p5233a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.speech.p5195a.C66453h;
import com.google.speech.p5197b.p5198a.C66455b;

/* renamed from: com.google.speech.recognizer.a.p */
/* compiled from: PG */
public final class C67468p extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C67468p f183364g;

    /* renamed from: m */
    private static volatile C63010eb f183365m;

    /* renamed from: a */
    public int f183366a;

    /* renamed from: b */
    public String f183367b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f183368c;

    /* renamed from: d */
    public C66453h f183369d;

    /* renamed from: e */
    public int f183370e;

    /* renamed from: f */
    public C67444am f183371f;

    /* renamed from: h */
    private C66455b f183372h;

    /* renamed from: i */
    private C66455b f183373i;

    /* renamed from: j */
    private C66455b f183374j;

    /* renamed from: k */
    private C66455b f183375k;

    /* renamed from: l */
    private byte f183376l = 2;

    static {
        C67468p pVar = new C67468p();
        f183364g = pVar;
        C62942bv.registerDefaultInstance(C67468p.class, pVar);
    }

    private C67468p() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183376l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183376l = b;
                return null;
            case 2:
                return newMessageInfo(f183364g, "\u0001\t\u0000\u0001\u0001\u0015\t\u0000\u0000\u0006\u0001ဈ\u0000\u0002ခ\u0003\u0003ᐉ\u0007\u0004ᐉ\b\u0006ᐉ\u000b\u0007ᐉ\u0013\nᐉ\u0006\u000fင\r\u0015ᐉ\t", new Object[]{"a", "b", C45240c.f118157a, "i", "j", "d", C10662f.f35572a, C19618h.f54585a, "e", C19621k.f54601a});
            case 3:
                return new C67468p();
            case 4:
                return new C67467o();
            case 5:
                return f183364g;
            case 6:
                C63010eb ebVar = f183365m;
                if (ebVar == null) {
                    synchronized (C67468p.class) {
                        ebVar = f183365m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183364g);
                            f183365m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
