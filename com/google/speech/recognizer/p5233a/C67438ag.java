package com.google.speech.recognizer.p5233a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.ag */
/* compiled from: PG */
public final class C67438ag extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C67438ag f183256k;

    /* renamed from: n */
    private static volatile C63010eb f183257n;

    /* renamed from: a */
    public int f183258a;

    /* renamed from: b */
    public int f183259b;

    /* renamed from: c */
    public int f183260c;

    /* renamed from: d */
    public C67442ak f183261d;

    /* renamed from: e */
    public C67476x f183262e;

    /* renamed from: f */
    public C67442ak f183263f;

    /* renamed from: g */
    public C67442ak f183264g;

    /* renamed from: h */
    public long f183265h;

    /* renamed from: i */
    public long f183266i;

    /* renamed from: j */
    public long f183267j;

    /* renamed from: l */
    private C67435ad f183268l;

    /* renamed from: m */
    private byte f183269m = 2;

    static {
        C67438ag agVar = new C67438ag();
        f183256k = agVar;
        C62942bv.registerDefaultInstance(C67438ag.class, agVar);
    }

    private C67438ag() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183269m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183269m = b;
                return null;
            case 2:
                return newMessageInfo(f183256k, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0004\u0001ဌ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005\bဂ\t\nဉ\b\fဂ\f\rဂ\r", new Object[]{"a", "b", C67436ae.f183255a, C45240c.f118157a, C67446ao.m97471b(), "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "l", "i", "j"});
            case 3:
                return new C67438ag();
            case 4:
                return new C67432aa();
            case 5:
                return f183256k;
            case 6:
                C63010eb ebVar = f183257n;
                if (ebVar == null) {
                    synchronized (C67438ag.class) {
                        ebVar = f183257n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183256k);
                            f183257n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
