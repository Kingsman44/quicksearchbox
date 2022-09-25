package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48735q;
import com.google.assistant.p3781ad.p3789d.p3791b.C48737s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.e */
/* compiled from: PG */
public final class C54914e extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C54914e f144340k;

    /* renamed from: m */
    private static volatile C63010eb f144341m;

    /* renamed from: a */
    public int f144342a;

    /* renamed from: b */
    public String f144343b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62961ch f144344c = emptyIntList();

    /* renamed from: d */
    public int f144345d;

    /* renamed from: e */
    public int f144346e;

    /* renamed from: f */
    public C54828au f144347f;

    /* renamed from: g */
    public C54913dy f144348g;

    /* renamed from: h */
    public C62971cq f144349h = emptyProtobufList();

    /* renamed from: i */
    public boolean f144350i;

    /* renamed from: j */
    public int f144351j;

    /* renamed from: l */
    private byte f144352l = 2;

    static {
        C54914e eVar = new C54914e();
        f144340k = eVar;
        C62942bv.registerDefaultInstance(C54914e.class, eVar);
    }

    private C54914e() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144352l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144352l = b;
                return null;
            case 2:
                return newMessageInfo(f144340k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0000\u0001ဉ\u0003\u0002ဉ\u0004\u0003ဈ\u0000\u0004\u0016\u0005ဌ\u0001\u0006\u001b\u0007ဌ\u0002\tဇ\u0005\nဌ\u0006", new Object[]{"a", C10662f.f35572a, C30325g.f82003a, "b", C45240c.f118157a, "d", C54834b.f143895a, C19618h.f54585a, C54888d.class, "e", C48735q.f126116a, "i", "j", C48737s.f126117a});
            case 3:
                return new C54914e();
            case 4:
                return new C54807a();
            case 5:
                return f144340k;
            case 6:
                C63010eb ebVar = f144341m;
                if (ebVar == null) {
                    synchronized (C54914e.class) {
                        ebVar = f144341m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144340k);
                            f144341m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
