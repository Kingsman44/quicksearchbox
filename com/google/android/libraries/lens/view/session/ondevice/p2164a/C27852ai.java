package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.C24823o;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27815ac;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27830m;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27837t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4709l.p4710a.C62614b;
import java.util.Collection;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.ai */
/* compiled from: PG */
public final class C27852ai {

    /* renamed from: a */
    public static final C58974d f75920a = C58974d.m91135i("CascadeManager");

    /* renamed from: b */
    public final C26244b f75921b;

    /* renamed from: c */
    public final C24823o f75922c;

    /* renamed from: d */
    public final C27815ac f75923d;

    /* renamed from: e */
    public final C27892i f75924e;

    /* renamed from: f */
    public final C27837t f75925f;

    /* renamed from: g */
    public final C27896m f75926g;

    /* renamed from: h */
    public final boolean f75927h;

    /* renamed from: i */
    public final boolean f75928i;

    /* renamed from: j */
    public final boolean f75929j;

    /* renamed from: k */
    public final boolean f75930k;

    /* renamed from: l */
    public final boolean f75931l;

    /* renamed from: m */
    private final boolean f75932m;

    /* renamed from: n */
    private final boolean f75933n;

    public C27852ai(C26244b bVar, C24823o oVar, C27815ac acVar, C27892i iVar, C27837t tVar, C27896m mVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f75921b = bVar;
        this.f75922c = oVar;
        this.f75923d = acVar;
        this.f75924e = iVar;
        this.f75925f = tVar;
        this.f75926g = mVar;
        this.f75927h = z;
        this.f75932m = z2;
        this.f75933n = z3;
        this.f75928i = z4;
        this.f75929j = z5;
        this.f75930k = z6;
        this.f75931l = z7;
    }

    /* renamed from: b */
    public static C58485gu m51872b(Collection collection) {
        return (C58485gu) Collection.EL.stream(collection).filter(C27845ab.f75915a).map(C27846ac.f75916a).collect(C58370cn.f155946a);
    }

    /* renamed from: a */
    public final C27855al mo33332a(C58495hd hdVar, C58833ax axVar, C58833ax axVar2, boolean z) {
        C58480gp e = C58485gu.m89837e();
        C27830m b = this.f75923d.mo33319c().mo33315b();
        if (this.f75933n || this.f75932m) {
            e.mo55395g(this.f75924e.mo33369b(this.f75925f.mo33326a(hdVar, C62614b.LOTS_FEATURE_HYBRID_GANSLATE), C62614b.LOTS_FEATURE_HYBRID_GANSLATE, axVar, axVar2, z));
            e.mo55395g(this.f75924e.mo33368a(b, C62614b.LOTS_FEATURE_HYBRID_GANSLATE, axVar, axVar2, z));
        }
        e.mo55395g(this.f75924e.mo33369b(this.f75925f.mo33326a(hdVar, C62614b.LOTS_FEATURE_HYBRID_TRANSLATE), C62614b.LOTS_FEATURE_HYBRID_TRANSLATE, axVar, axVar2, this.f75928i || z));
        e.mo55395g(this.f75924e.mo33368a(b, C62614b.LOTS_FEATURE_HYBRID_TRANSLATE, axVar, axVar2, z));
        C27854ak c = C27855al.m51882c();
        c.mo33338c(true);
        c.mo33337b(m51872b(e.mo55394f()));
        return c.mo33336a();
    }

    /* renamed from: c */
    public final C60870cx mo33333c(C58485gu guVar, boolean z, boolean z2) {
        C58495hd hdVar = (C58495hd) Collection.EL.stream(guVar).map(new C27848ae(this)).collect(C58370cn.m89403c(C27849af.f75919a, C27900q.f76007a, C27901r.f76008a));
        return C47638k.m84750a(hdVar.values()).mo51520a(new C27902s(this, hdVar, guVar, z, z2), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo33334d() {
        C60870cx e = mo33335e();
        C27906w wVar = C27906w.f76017a;
        return C60922j.m93044g(e, C47810es.m84963c(wVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo33335e() {
        C60870cx b = this.f75925f.mo33327b();
        C27905v vVar = new C27905v(this);
        return C60922j.m93044g(b, C47810es.m84963c(vVar), C60826bg.f164896a);
    }
}
