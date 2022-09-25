package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.binaries.satin.app.aol;
import com.google.android.apps.gsa.nga.api.a.a;
import com.google.android.apps.gsa.nga.api.a.ak;
import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.gsa.nga.api.a.b;
import com.google.android.apps.gsa.nga.api.a.e;
import com.google.android.apps.gsa.nga.api.a.f;
import com.google.android.apps.gsa.nga.api.a.n;
import com.google.android.apps.gsa.nga.api.a.o;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9462a.C125941c;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.bs */
/* compiled from: PG */
public final class C126054bs {

    /* renamed from: a */
    public final C125941c f347409a;

    /* renamed from: b */
    public final C125937z f347410b;

    /* renamed from: c */
    public final C62910ar f347411c;

    /* renamed from: d */
    public final aol f347412d;

    /* renamed from: e */
    private final boolean f347413e;

    /* renamed from: f */
    private final long f347414f;

    /* renamed from: g */
    private final boolean f347415g;

    public C126054bs(C125937z zVar, C125941c cVar, aol aol, C62910ar arVar, boolean z, long j, boolean z2) {
        this.f347412d = aol;
        this.f347409a = cVar;
        this.f347410b = zVar;
        this.f347411c = arVar;
        this.f347413e = z;
        this.f347414f = j;
        this.f347415g = z2;
    }

    /* renamed from: e */
    static C58485gu m206108e(C58485gu guVar) {
        return guVar.subList(0, Math.min(guVar.size(), true != Collection.EL.stream(guVar).anyMatch(C126046bk.f347401a) ? 2 : 5));
    }

    /* renamed from: f */
    static Optional m206109f(C58485gu guVar) {
        return Collection.EL.stream(guVar).filter(C126050bo.f347405a).findFirst().map(C126051bp.f347406a);
    }

    /* renamed from: i */
    static boolean m206110i(C58485gu guVar) {
        return Collection.EL.stream(guVar).anyMatch(C126052bq.f347407a);
    }

    /* renamed from: a */
    public final b mo107269a(List list) {
        if (list.isEmpty()) {
            return b.c;
        }
        Integer num = (Integer) C126055bt.f347418c.get(((C51809dy) list.get(0)).f135936b);
        if (num == null) {
            return b.c;
        }
        a createBuilder = b.c.createBuilder();
        String g = mo107273g(num.intValue(), new Object[0]);
        createBuilder.copyOnWrite();
        g.getClass();
        createBuilder.instance.a = g;
        createBuilder.copyOnWrite();
        createBuilder.instance.b = true;
        return createBuilder.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final al mo107270b(String str, C58485gu guVar, boolean z, C119299u uVar) {
        n createBuilder = o.g.createBuilder();
        createBuilder.copyOnWrite();
        createBuilder.instance.e = true;
        boolean equals = uVar.equals(C119299u.STICKY);
        createBuilder.copyOnWrite();
        createBuilder.instance.c = equals;
        createBuilder.copyOnWrite();
        str.getClass();
        createBuilder.instance.a = str;
        createBuilder.copyOnWrite();
        createBuilder.instance.f = z;
        if (this.f347413e && this.f347410b.mo107203b().f347148c.l >= this.f347414f) {
            f fVar = C126055bt.f347417b;
            createBuilder.copyOnWrite();
            fVar.getClass();
            createBuilder.instance.d = fVar;
        }
        createBuilder.copyOnWrite();
        o oVar = createBuilder.instance;
        C62971cq cqVar = oVar.b;
        if (!cqVar.mo58948c()) {
            oVar.b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) oVar.b);
        ak createBuilder2 = al.i.createBuilder();
        createBuilder2.copyOnWrite();
        o build = createBuilder.build();
        build.getClass();
        createBuilder2.instance.b = build;
        return createBuilder2.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58485gu mo107271c(C58485gu guVar) {
        return (C58485gu) Collection.EL.stream(guVar).filter(C126041bf.f347396a).map(new C126045bj(this)).collect(C58370cn.f155946a);
    }

    /* renamed from: d */
    public final C58485gu mo107272d(C58485gu guVar, C58485gu guVar2, int i) {
        if (guVar2.isEmpty() || (Collection.EL.stream(guVar2).allMatch(C126043bh.f347398a) && !Collection.EL.stream(guVar2).anyMatch(C126044bi.f347399a))) {
            return guVar;
        }
        String g = mo107273g(i, new Object[0]);
        C58480gp e = C58485gu.m89837e();
        e builder = ((f) guVar.get(0)).toBuilder();
        builder.copyOnWrite();
        builder.instance.f = String.valueOf(g).concat("%B");
        e.mo55395g(builder.build());
        e.mo55396h((Iterable) Collection.EL.stream(guVar).skip(1).collect(C58370cn.f155946a));
        return e.mo55394f();
    }

    /* renamed from: g */
    public final String mo107273g(int i, Object... objArr) {
        return this.f347409a.mo107211a(this.f347410b.mo107202a().mo107188g()).getString(i, objArr);
    }

    /* renamed from: h */
    public final String mo107274h(String str) {
        if (!this.f347415g) {
            return str;
        }
        return mo107273g(R.string.assistant_keyboard_voice_suggestion_quotes, str);
    }

    /* renamed from: j */
    public final int mo107275j() {
        return this.f347415g ? 5 : 4;
    }
}
