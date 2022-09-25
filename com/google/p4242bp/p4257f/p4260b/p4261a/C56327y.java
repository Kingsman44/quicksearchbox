package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62442bs;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62488dk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.y */
/* compiled from: PG */
public final class C56327y extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C56327y f150136i;

    /* renamed from: k */
    private static volatile C63010eb f150137k;

    /* renamed from: a */
    public int f150138a;

    /* renamed from: b */
    public int f150139b = 0;

    /* renamed from: c */
    public Object f150140c;

    /* renamed from: d */
    public long f150141d;

    /* renamed from: e */
    public C62488dk f150142e;

    /* renamed from: f */
    public C62971cq f150143f = emptyProtobufList();

    /* renamed from: g */
    public C56324v f150144g;

    /* renamed from: h */
    public int f150145h;

    /* renamed from: j */
    private byte f150146j = 2;

    static {
        C56327y yVar = new C56327y();
        f150136i = yVar;
        C62942bv.registerDefaultInstance(C56327y.class, yVar);
    }

    private C56327y() {
    }

    /* renamed from: a */
    public final void mo54355a() {
        C62971cq cqVar = this.f150143f;
        if (!cqVar.mo58948c()) {
            this.f150143f = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150146j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150146j = b;
                return null;
            case 2:
                return newMessageInfo(f150136i, "\u0001\u0007\u0001\u0001\u0001\u000b\u0007\u0000\u0001\u0001\u0001ဂ\u0000\u0002ြ\u0000\u0003Л\u0004ဉ\u0005\u0007ြ\u0000\bဉ\u0004\u000bဌ\b", new Object[]{C45240c.f118157a, "b", "a", "d", C56273c.class, C10662f.f35572a, C56320r.class, C30325g.f82003a, C62445bv.class, "e", C19618h.f54585a, C62442bs.f168617a});
            case 3:
                return new C56327y();
            case 4:
                return new C56219a();
            case 5:
                return f150136i;
            case 6:
                C63010eb ebVar = f150137k;
                if (ebVar == null) {
                    synchronized (C56327y.class) {
                        ebVar = f150137k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150136i);
                            f150137k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
