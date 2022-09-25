package com.google.assistant.p4016z;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.z.s */
/* compiled from: PG */
public final class C53734s extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53734s f141066i;

    /* renamed from: k */
    private static volatile C63010eb f141067k;

    /* renamed from: a */
    public int f141068a;

    /* renamed from: b */
    public C63042fg f141069b;

    /* renamed from: c */
    public C62910ar f141070c;

    /* renamed from: d */
    public boolean f141071d;

    /* renamed from: e */
    public C58079k f141072e;

    /* renamed from: f */
    public C53676aa f141073f;

    /* renamed from: g */
    public C62971cq f141074g = emptyProtobufList();

    /* renamed from: h */
    public int f141075h;

    /* renamed from: j */
    private byte f141076j = 2;

    static {
        C53734s sVar = new C53734s();
        f141066i = sVar;
        C62942bv.registerDefaultInstance(C53734s.class, sVar);
    }

    private C53734s() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo54012a() {
        C62971cq cqVar = this.f141074g;
        if (!cqVar.mo58948c()) {
            this.f141074g = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141076j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141076j = b;
                return null;
            case 2:
                return newMessageInfo(f141066i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဇ\u0002\u0006ဉ\u0004\u0007ဉ\u0005\u000bЛ\fဌ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C53708bf.class, C19618h.f54585a, C53733r.f141065a});
            case 3:
                return new C53734s();
            case 4:
                return new C53732q();
            case 5:
                return f141066i;
            case 6:
                C63010eb ebVar = f141067k;
                if (ebVar == null) {
                    synchronized (C53734s.class) {
                        ebVar = f141067k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141066i);
                            f141067k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
