package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.auto.p450a.p451a.C8916i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12113b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.d */
/* compiled from: PG */
public final class C13042d extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C13042d f40480m;

    /* renamed from: n */
    public static final C62940bt f40481n;

    /* renamed from: o */
    private static volatile C63010eb f40482o;

    /* renamed from: a */
    public int f40483a;

    /* renamed from: b */
    public C12113b f40484b;

    /* renamed from: c */
    public boolean f40485c;

    /* renamed from: d */
    public C13044f f40486d;

    /* renamed from: e */
    public String f40487e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f40488f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f40489g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62971cq f40490h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public boolean f40491i;

    /* renamed from: j */
    public boolean f40492j;

    /* renamed from: k */
    public boolean f40493k;

    /* renamed from: l */
    public int f40494l;

    static {
        C13042d dVar = new C13042d();
        f40480m = dVar;
        C62942bv.registerDefaultInstance(C13042d.class, dVar);
        f40481n = C62942bv.newSingularGeneratedExtension(C12991i.f40380k, dVar, dVar, (C62958ce) null, 353908888, C63066gd.MESSAGE, C13042d.class);
    }

    private C13042d() {
    }

    /* renamed from: a */
    public final void mo20876a() {
        C62971cq cqVar = this.f40490h;
        if (!cqVar.mo58948c()) {
            this.f40490h = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f40480m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006\u001a\u0007ဇ\u0006\bဈ\u0004\tဇ\u0007\nဇ\b\u000bဌ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", C10662f.f35572a, "j", C19621k.f54601a, "l", C8916i.f30940a});
            case 3:
                return new C13042d();
            case 4:
                return new C13041c();
            case 5:
                return f40480m;
            case 6:
                C63010eb ebVar = f40482o;
                if (ebVar == null) {
                    synchronized (C13042d.class) {
                        ebVar = f40482o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40480m);
                            f40482o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
