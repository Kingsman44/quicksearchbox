package com.google.android.apps.gsa.assist;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.assist.ac */
/* compiled from: PG */
public final class C9332ac extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C9332ac f32378j;

    /* renamed from: l */
    private static volatile C63010eb f32379l;

    /* renamed from: a */
    public int f32380a;

    /* renamed from: b */
    public C63088z f32381b = C63088z.f170246b;

    /* renamed from: c */
    public int f32382c;

    /* renamed from: d */
    public int f32383d;

    /* renamed from: e */
    public int f32384e;

    /* renamed from: f */
    public int f32385f;

    /* renamed from: g */
    public int f32386g;

    /* renamed from: h */
    public int f32387h;

    /* renamed from: i */
    public boolean f32388i;

    /* renamed from: k */
    private byte f32389k = 2;

    static {
        C9332ac acVar = new C9332ac();
        f32378j = acVar;
        C62942bv.registerDefaultInstance(C9332ac.class, acVar);
    }

    private C9332ac() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32389k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32389k = b;
                return null;
            case 2:
                return newMessageInfo(f32378j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ည\u0001\u0002ဌ\u0004\u0003င\u0005\u0004င\u0006\u0005င\u0007\u0007င\u0002\bင\u0003\tဇ\b", new Object[]{"a", "b", "e", C9331ab.f32377a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C45240c.f118157a, "d", "i"});
            case 3:
                return new C9332ac();
            case 4:
                return new C9433w();
            case 5:
                return f32378j;
            case 6:
                C63010eb ebVar = f32379l;
                if (ebVar == null) {
                    synchronized (C9332ac.class) {
                        ebVar = f32379l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32378j);
                            f32379l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
