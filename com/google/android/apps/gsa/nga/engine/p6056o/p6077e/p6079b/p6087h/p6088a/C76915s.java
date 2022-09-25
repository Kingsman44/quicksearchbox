package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a;

import com.google.android.apps.gsa.nga.engine.am.l.c.r;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18101b;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1499a.C18112b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a.s */
/* compiled from: PG */
public final class C76915s extends C76900d {

    /* renamed from: a */
    private final String f212375a;

    /* renamed from: d */
    private final Function f212376d;

    /* renamed from: e */
    private final C76905i f212377e;

    /* renamed from: f */
    private final C18101b f212378f;

    /* renamed from: g */
    private final int f212379g;

    public C76915s(String str, r rVar, C22871g gVar, C18101b bVar, Function function, int i, C76905i iVar) {
        super(rVar, gVar);
        this.f212375a = str;
        this.f212378f = bVar;
        this.f212376d = function;
        this.f212379g = i;
        this.f212377e = iVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SIMPLE_ACTION_SENDING));
        h.mo72244c(C58485gu.m89846n(mo72350e()));
        C76541a aVar = (C76541a) h;
        aVar.f211766c = this.f212379g;
        aVar.f211765b = Optional.m71637of(String.format("%s(%s)", new Object[]{this.f212375a, ((C18112b) this.f212378f).f51578a}));
        Objects.requireNonNull(h);
        Map.EL.forEach((C58495hd) ((C76902f) this.f212377e).f212360b.map(new C76903g(this)).orElse(C58729pv.f156485a), new C76904h(h));
        return h.mo72276f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Optional mo72333d(C76590bg bgVar) {
        return (Optional) this.f212376d.apply(bgVar);
    }

    /* renamed from: e */
    public final String mo72350e() {
        return (String) ((C76902f) this.f212377e).f212359a.orElse(C76917u.m123539a(((C18112b) this.f212378f).f51578a));
    }
}
