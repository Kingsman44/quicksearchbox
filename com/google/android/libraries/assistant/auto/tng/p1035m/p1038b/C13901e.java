package com.google.android.libraries.assistant.auto.tng.p1035m.p1038b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67030il;
import com.google.speech.p5218j.C67048jc;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67085km;

/* renamed from: com.google.android.libraries.assistant.auto.tng.m.b.e */
/* compiled from: PG */
public final class C13901e extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C13901e f42330j;

    /* renamed from: k */
    private static volatile C63010eb f42331k;

    /* renamed from: a */
    public int f42332a;

    /* renamed from: b */
    public C67073ka f42333b;

    /* renamed from: c */
    public C13899c f42334c;

    /* renamed from: d */
    public C67048jc f42335d;

    /* renamed from: e */
    public long f42336e;

    /* renamed from: f */
    public long f42337f;

    /* renamed from: g */
    public int f42338g;

    /* renamed from: h */
    public C67085km f42339h;

    /* renamed from: i */
    public C67030il f42340i;

    static {
        C13901e eVar = new C13901e();
        f42330j = eVar;
        C62942bv.registerDefaultInstance(C13901e.class, eVar);
    }

    private C13901e() {
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
                return newMessageInfo(f42330j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C13897a.f42323a, C19618h.f54585a, "i"});
            case 3:
                return new C13901e();
            case 4:
                return new C13900d();
            case 5:
                return f42330j;
            case 6:
                C63010eb ebVar = f42331k;
                if (ebVar == null) {
                    synchronized (C13901e.class) {
                        ebVar = f42331k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42330j);
                            f42331k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
