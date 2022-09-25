package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.ap */
/* compiled from: PG */
public final class C91792ap extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C91792ap f255967i;

    /* renamed from: k */
    private static volatile C63010eb f255968k;

    /* renamed from: a */
    public int f255969a;

    /* renamed from: b */
    public boolean f255970b;

    /* renamed from: c */
    public boolean f255971c;

    /* renamed from: d */
    public boolean f255972d;

    /* renamed from: e */
    public int f255973e;

    /* renamed from: f */
    public C7669fo f255974f;

    /* renamed from: g */
    public C62971cq f255975g = emptyProtobufList();

    /* renamed from: h */
    public boolean f255976h;

    /* renamed from: j */
    private byte f255977j = 2;

    static {
        C91792ap apVar = new C91792ap();
        f255967i = apVar;
        C62942bv.registerDefaultInstance(C91792ap.class, apVar);
    }

    private C91792ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f255977j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f255977j = b;
                return null;
            case 2:
                return newMessageInfo(f255967i, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0001\u0001\u0001ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဌ\u0003\nဉ\u0005\fЛ\u000eဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C8142xb.m22955b(), C10662f.f35572a, C30325g.f82003a, C90273b.class, C19618h.f54585a});
            case 3:
                return new C91792ap();
            case 4:
                return new C91791ao();
            case 5:
                return f255967i;
            case 6:
                C63010eb ebVar = f255968k;
                if (ebVar == null) {
                    synchronized (C91792ap.class) {
                        ebVar = f255968k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255967i);
                            f255968k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
