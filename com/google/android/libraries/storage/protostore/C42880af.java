package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.base.C58880cq;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.af */
/* compiled from: PG */
public final class C42880af {

    /* renamed from: a */
    private final Map f112186a = new HashMap();

    /* renamed from: b */
    private final Map f112187b = new HashMap();

    /* renamed from: c */
    private final Executor f112188c;

    /* renamed from: d */
    private final C42813k f112189d;

    /* renamed from: e */
    private final C60931s f112190e;

    /* renamed from: f */
    private final Map f112191f;

    /* renamed from: g */
    private final C42932a f112192g;

    public C42880af(Executor executor, C42813k kVar, C42932a aVar, Map map) {
        executor.getClass();
        this.f112188c = executor;
        kVar.getClass();
        this.f112189d = kVar;
        this.f112192g = aVar;
        this.f112191f = map;
        C58838bb.m90868c(!map.isEmpty());
        this.f112190e = C42879ae.f112185a;
    }

    /* renamed from: a */
    public final synchronized C42876ab mo45979a(C42878ad adVar) {
        C42876ab abVar;
        String str;
        Uri a = adVar.mo45971a();
        abVar = (C42876ab) this.f112186a.get(a);
        boolean z = true;
        if (abVar == null) {
            Uri a2 = adVar.mo45971a();
            C58838bb.m90873h(a2.isHierarchical(), "Uri must be hierarchical: %s", a2);
            String g = C58837ba.m90858g(a2.getLastPathSegment());
            int lastIndexOf = g.lastIndexOf(46);
            if (lastIndexOf == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = g.substring(lastIndexOf + 1);
            }
            C58838bb.m90873h(str.equals("pb"), "Uri extension must be .pb: %s", a2);
            C58838bb.m90869d(adVar.mo45976f() != null, "Proto schema cannot be null");
            C58838bb.m90869d(adVar.mo45972b() != null, "Handler cannot be null");
            String i = adVar.mo45974d().mo45993i();
            C43002ei eiVar = (C43002ei) this.f112191f.get(i);
            if (eiVar == null) {
                z = false;
            }
            C58838bb.m90873h(z, "No XDataStoreVariantFactory registered for ID %s", i);
            String g2 = C58837ba.m90858g(adVar.mo45971a().getLastPathSegment());
            int lastIndexOf2 = g2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                g2 = g2.substring(0, lastIndexOf2);
            }
            C42876ab abVar2 = new C42876ab(eiVar.mo45981a(adVar, g2, this.f112188c, this.f112189d), this.f112192g, C60922j.m93045h(C60856cj.m92900i(adVar.mo45971a()), this.f112190e, C60826bg.f164896a), adVar.mo45977g());
            eiVar.mo45983c(adVar, abVar2);
            C58485gu e = adVar.mo45975e();
            if (!e.isEmpty()) {
                abVar2.mo46041c(new C42875aa(e, this.f112188c));
            }
            this.f112186a.put(a, abVar2);
            this.f112187b.put(a, adVar);
            abVar = abVar2;
        } else {
            C42878ad adVar2 = (C42878ad) this.f112187b.get(a);
            if (!adVar.equals(adVar2)) {
                String a3 = C58880cq.m90965a("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", adVar.mo45976f().getClass().getSimpleName(), adVar.mo45971a());
                C58838bb.m90873h(adVar.mo45971a().equals(adVar2.mo45971a()), a3, "uri");
                C58838bb.m90873h(adVar.mo45976f().equals(adVar2.mo45976f()), a3, "schema");
                C58838bb.m90873h(adVar.mo45972b().equals(adVar2.mo45972b()), a3, "handler");
                C58838bb.m90873h(C58597ky.m90218i(adVar.mo45975e(), adVar2.mo45975e()), a3, "migrations");
                C58838bb.m90873h(adVar.mo45974d().equals(adVar2.mo45974d()), a3, "variantConfig");
                C58838bb.m90873h(adVar.mo45978h() == adVar2.mo45978h(), a3, "useGeneratedExtensionRegistry");
                C58838bb.m90873h(adVar.mo45977g() == adVar2.mo45977g(), a3, "enableTracing");
                throw new IllegalArgumentException(C58880cq.m90965a(a3, "unknown"));
            }
        }
        return abVar;
    }
}
