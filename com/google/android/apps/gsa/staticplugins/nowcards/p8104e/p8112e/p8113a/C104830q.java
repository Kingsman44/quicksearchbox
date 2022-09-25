package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.gsa.now.shared.p6421ui.C83412a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91774j;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91775k;
import com.google.android.apps.gsa.sidekick.shared.monet.p7252h.C91845d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7252h.C91846e;
import com.google.android.apps.gsa.sidekick.shared.monet.p7252h.C91850i;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104313ao;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104314ap;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104337bl;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104444g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104467c;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104845f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8115f.C104852a;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7693gl;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62921ba;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.q */
/* compiled from: PG */
public final class C104830q extends C104823j implements C91850i {

    /* renamed from: c */
    private final C104467c f292089c;

    /* renamed from: d */
    private final Context f292090d;

    /* renamed from: e */
    private final C104444g f292091e;

    /* renamed from: f */
    private final C68214a f292092f;

    /* renamed from: g */
    private final C91845d f292093g;

    /* renamed from: h */
    private final C58833ax f292094h;

    /* renamed from: i */
    private final boolean f292095i;

    /* renamed from: j */
    private final C104780di f292096j;

    /* renamed from: k */
    private final CardRenderingContext f292097k;

    /* renamed from: l */
    private C104314ap f292098l;

    /* renamed from: m */
    private C83412a f292099m;

    /* renamed from: n */
    private C104779dh f292100n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104830q(C22945j jVar, C104467c cVar, Context context, C104444g gVar, C68214a aVar, C91846e eVar, C58833ax axVar, C58833ax axVar2, C91866h hVar, C58833ax axVar3, CardRenderingContext cardRenderingContext, boolean z, C104780di diVar, C104337bl blVar, C104845f fVar, boolean z2) {
        super(jVar, cVar, gVar, axVar, axVar2, hVar, C91774j.m150380a(jVar), z, blVar, fVar, z2);
        this.f292089c = cVar;
        this.f292090d = context;
        this.f292091e = gVar;
        this.f292092f = aVar;
        this.f292093g = eVar.mo86333a("CapModuleRenderer", this.f292071a);
        this.f292094h = axVar3;
        this.f292095i = z;
        this.f292096j = diVar;
        this.f292097k = cardRenderingContext;
    }

    /* renamed from: d */
    public final boolean mo86334d() {
        return this.f292093g.mo86332c();
    }

    /* renamed from: im */
    public final void mo28298im() {
        super.mo28298im();
        C83412a aVar = this.f292099m;
        if (aVar != null) {
            aVar.removeOnLayoutChangeListener(this.f292071a.f255921d);
        }
        C104779dh dhVar = this.f292100n;
        dhVar.mo94347a();
        dhVar.mo94349c();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f292098l = ((C104313ao) this.f292092f.mo27525b()).mo94016a(this.f292090d);
        mo94362v();
        C104314ap apVar = this.f292098l;
        apVar.f290316k = new C104825l(this);
        apVar.f290317l = new C104826m(this);
        C104444g gVar = this.f292091e;
        apVar.f290319n = gVar;
        apVar.f290320o = gVar;
        apVar.f290322q = gVar;
        apVar.f290324s = gVar;
        apVar.f290323r = gVar;
        apVar.f290321p = gVar;
        apVar.f290325t = gVar;
        C83412a aVar = new C83412a(this.f292090d);
        this.f292099m = aVar;
        aVar.mo76747e(this.f292097k.mo49316k());
        this.f292099m.mo76745d(this.f292095i);
        this.f292099m.mo76744c(this.f292098l.mo94113g(C9277u.CAP_MODULE, this.f292099m));
        this.f292099m.mo76751i(2);
        mo28295iC(this.f292099m);
        C104779dh a = this.f292096j.mo94350a(this.f292090d, this.f63126Q, this.f292098l, "CapModuleRenderer", this.f292094h, this.f292091e, this.f292089c);
        this.f292100n = a;
        a.mo94348b(this.f292095i);
        ((C104774dc) this.f292089c).f291859b.mo28726b(new C104827n(this));
        ((C104774dc) this.f292089c).f291858a.mo28726b(new C104828o(this));
        ((C104774dc) this.f292089c).f291861d.mo28726b(new C104829p(this));
        super.mo28299iw();
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        if (!this.f292098l.mo94106E()) {
            C9278v vVar = (C9278v) C23245b.m43557b((ProtoParcelable) ((C58833ax) ((C104774dc) this.f292089c).f291859b.f63720e).mo56107c(), C9278v.f32165Z.getParserForType(), C62921ba.m95368a(), true);
            vVar.getClass();
            mo94363w(vVar);
            mo94364x();
            mo94365y();
        }
        super.mo28300ix();
    }

    /* renamed from: ja */
    public final void mo86336ja() {
    }

    /* renamed from: jb */
    public final void mo86337jb(int i, int i2, int i3, int i4, int i5, boolean z) {
        C104337bl blVar = this.f292072b;
        C7718hj hjVar = mo94302p().f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        blVar.mo94097a(hjVar);
        if (((Boolean) ((C104774dc) this.f292089c).f291860c.f63720e).booleanValue()) {
            this.f292093g.mo86330a(i4, i5, z);
        }
    }

    /* renamed from: jc */
    public final void mo86338jc(boolean z, C91775k kVar, int i, int i2, int i3) {
        if (((Boolean) ((C104774dc) this.f292089c).f291860c.f63720e).booleanValue()) {
            this.f292093g.mo86331b(new C104824k(this), z, kVar);
        } else {
            this.f292093g.f256138a = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final View mo94300k() {
        return this.f292099m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C104348l mo94301m() {
        return this.f292098l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C9278v mo94302p() {
        C9278v vVar = (C9278v) C23245b.m43557b((ProtoParcelable) ((C58833ax) ((C104774dc) this.f292089c).f291859b.f63720e).mo56107c(), C9278v.f32165Z.getParserForType(), C62921ba.m95368a(), true);
        vVar.getClass();
        return vVar;
    }

    /* renamed from: s */
    public final void mo94303s() {
        this.f292098l.mo94036q();
        C83412a aVar = this.f292099m;
        if (aVar != null) {
            aVar.mo76743b(-1);
            this.f292099m.mo76749g(-1);
        }
    }

    /* renamed from: w */
    public final void mo94363w(C9278v vVar) {
        C104852a aVar = new C104852a(vVar);
        C83412a aVar2 = this.f292099m;
        int a = C7693gl.m22807a(aVar.f292195a.f32184R);
        if (a == 0) {
            a = 1;
        }
        aVar2.mo76751i(a);
        this.f292099m.mo76748f(aVar.f292195a.f32183Q);
        this.f292098l.mo94036q();
        this.f292098l.mo94110I(aVar);
        this.f292100n.f291883j = vVar;
    }

    /* renamed from: x */
    public final void mo94364x() {
        C58833ax axVar = (C58833ax) ((C104774dc) this.f292089c).f291858a.f63720e;
        if (axVar.mo56113h() && ((Integer) axVar.mo56107c()).intValue() >= 0) {
            int applyDimension = (int) TypedValue.applyDimension(1, (float) ((Integer) axVar.mo56107c()).intValue(), this.f292090d.getResources().getDisplayMetrics());
            C83412a aVar = this.f292099m;
            if (aVar != null) {
                aVar.mo76743b(applyDimension);
            }
        }
    }

    /* renamed from: y */
    public final void mo94365y() {
        C58833ax axVar = (C58833ax) ((C104774dc) this.f292089c).f291861d.f63720e;
        if (axVar.mo56113h() && ((Integer) axVar.mo56107c()).intValue() >= 0) {
            int applyDimension = (int) TypedValue.applyDimension(1, (float) ((Integer) axVar.mo56107c()).intValue(), this.f292090d.getResources().getDisplayMetrics());
            C83412a aVar = this.f292099m;
            if (aVar != null) {
                aVar.mo76749g(applyDimension);
            }
        }
    }
}
