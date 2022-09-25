package com.google.p5277z.p5282c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.ah */
/* compiled from: PG */
public final class C67998ah extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C67998ah f184236a;

    /* renamed from: j */
    private static volatile C63010eb f184237j;

    /* renamed from: b */
    private int f184238b;

    /* renamed from: c */
    private C62995dn f184239c = C62995dn.f170057a;

    /* renamed from: d */
    private C62995dn f184240d;

    /* renamed from: e */
    private C62995dn f184241e;

    /* renamed from: f */
    private C68005ao f184242f;

    /* renamed from: g */
    private C68022l f184243g;

    /* renamed from: h */
    private C62995dn f184244h;

    /* renamed from: i */
    private byte f184245i;

    static {
        C67998ah ahVar = new C67998ah();
        f184236a = ahVar;
        C62942bv.registerDefaultInstance(C67998ah.class, ahVar);
    }

    private C67998ah() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f184240d = dnVar;
        this.f184241e = dnVar;
        this.f184244h = dnVar;
        this.f184245i = 2;
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184245i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184245i = b;
                return null;
            case 2:
                return newMessageInfo(f184236a, "\u0001\u0006\u0000\u0001\u0006\u0014\u0006\u0004\u0000\u0003\u00062\bв\rᐉ\t\u000eᐉ\n\u00102\u00142", new Object[]{"b", C45240c.f118157a, C67994ad.f184232a, "d", C67997ag.f184235a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C67995ae.f184233a, "e", C67996af.f184234a});
            case 3:
                return new C67998ah();
            case 4:
                return new C67993ac();
            case 5:
                return f184236a;
            case 6:
                C63010eb ebVar = f184237j;
                if (ebVar == null) {
                    synchronized (C67998ah.class) {
                        ebVar = f184237j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184236a);
                            f184237j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
