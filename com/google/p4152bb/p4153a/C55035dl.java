package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.dl */
/* compiled from: PG */
public final class C55035dl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55035dl f144790f;

    /* renamed from: g */
    public static final C62940bt f144791g;

    /* renamed from: i */
    private static volatile C63010eb f144792i;

    /* renamed from: a */
    public int f144793a;

    /* renamed from: b */
    public String f144794b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f144795c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f144796d = emptyProtobufList();

    /* renamed from: e */
    public int f144797e;

    /* renamed from: h */
    private byte f144798h = 2;

    static {
        C55035dl dlVar = new C55035dl();
        f144790f = dlVar;
        C62942bv.registerDefaultInstance(C55035dl.class, dlVar);
        f144791g = C62942bv.newSingularGeneratedExtension(C55029df.f144771d, dlVar, dlVar, (C62958ce) null, 66768280, C63066gd.MESSAGE, C55035dl.class);
    }

    private C55035dl() {
    }

    /* renamed from: a */
    public final void mo54173a() {
        C62971cq cqVar = this.f144796d;
        if (!cqVar.mo58948c()) {
            this.f144796d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144798h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144798h = b;
                return null;
            case 2:
                return newMessageInfo(f144790f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0005ဈ\u0001\u0006Л\u0007ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C55032di.class, "e", C55033dj.f144789a});
            case 3:
                return new C55035dl();
            case 4:
                return new C55030dg();
            case 5:
                return f144790f;
            case 6:
                C63010eb ebVar = f144792i;
                if (ebVar == null) {
                    synchronized (C55035dl.class) {
                        ebVar = f144792i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144790f);
                            f144792i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
