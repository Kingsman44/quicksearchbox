package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91904b;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91909g;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9248ec;
import com.google.android.apps.p489g.p494d.C9249ed;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9275s;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.bs */
/* compiled from: PG */
public final class C104948bs extends C104348l {

    /* renamed from: y */
    private final C105070g f292432y;

    public C104948bs(Context context, C104350n nVar, C105070g gVar) {
        super(context, nVar);
        this.f292432y = gVar;
    }

    /* renamed from: M */
    private static void m173993M(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(600);
        alphaAnimation.setAnimationListener(new C104946bq(view));
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: N */
    private final void m173994N(boolean z) {
        int i;
        View view = this.f290311f;
        View findViewById = view.findViewById(R.id.checked_container);
        View findViewById2 = view.findViewById(R.id.neutral_container);
        C9249ed edVar = this.f290310e.f32214u;
        if (edVar == null) {
            edVar = C9249ed.f31979g;
        }
        if (edVar.f31986f) {
            if (z) {
                m173993M(findViewById);
            }
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            i = R.id.checked_content;
        } else {
            if (z) {
                m173993M(findViewById2);
            }
            findViewById2.setVisibility(0);
            findViewById.setVisibility(8);
            i = R.id.neutral_content;
        }
        if (z) {
            view.findViewById(i).sendAccessibilityEvent(8);
        }
    }

    /* renamed from: L */
    public final void mo94410L(boolean z) {
        int i;
        C9249ed edVar = this.f290310e.f32214u;
        if (edVar == null) {
            edVar = C9249ed.f31979g;
        }
        C9273q qVar = (C9273q) this.f290310e.toBuilder();
        C9248ec ecVar = (C9248ec) edVar.toBuilder();
        ecVar.copyOnWrite();
        C9249ed edVar2 = (C9249ed) ecVar.instance;
        edVar2.f31981a |= 4;
        edVar2.f31986f = z;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        C9249ed edVar3 = (C9249ed) ecVar.build();
        edVar3.getClass();
        vVar.f32214u = edVar3;
        vVar.f32192a |= C89885b.HTTP_VALUE;
        C9278v vVar2 = (C9278v) qVar.build();
        this.f290310e = vVar2;
        if (z) {
            C9141ad adVar = edVar.f31985e;
            if (adVar == null) {
                adVar = C9141ad.f31521K;
            }
            i = adVar.f31538d;
        } else {
            C9141ad adVar2 = edVar.f31983c;
            if (adVar2 == null) {
                adVar2 = C9141ad.f31521K;
            }
            i = adVar2.f31538d;
        }
        C7718hj hjVar = vVar2.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C91909g i2 = LoggingRequest.m150674y(hjVar, C7681g.m22802a(i), (C7526an) null, this.f290314i.f290342l.mo85966a()).mo86500i();
        C91904b bVar = new C91904b();
        C9277u a = C9277u.m23705a(vVar2.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        bVar.f256311h = a;
        i2.mo86547k(bVar.mo86554a());
        i2.mo86548l(this.f290314i.f290342l.mo85966a());
        this.f290314i.f290342l.mo85967b(i2.mo86537a());
        m173994N(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_toggle_action_module, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_toggle_action_module, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        View view = this.f290311f;
        View findViewById = view.findViewById(R.id.checked_container);
        mo94125r(findViewById, this.f290307b.getResources().getDrawable(R.drawable.qp_clickable_module_background));
        View findViewById2 = view.findViewById(R.id.neutral_container);
        mo94125r(findViewById2, this.f290307b.getResources().getDrawable(R.drawable.qp_clickable_module_background));
        C105069f a = this.f292432y.mo94516a(this.f290307b, this.f290308c.f256406b, (Map) null, mo94120n());
        C9249ed edVar = this.f290310e.f32214u;
        if (edVar == null) {
            edVar = C9249ed.f31979g;
        }
        if (edVar.f31982b.size() != 0) {
            ((MetadataLineView) view.findViewById(R.id.neutral_content)).mo94502d(a, edVar.f31982b, this.f290314i.f290349s);
        }
        if (edVar.f31984d.size() != 0) {
            ((MetadataLineView) view.findViewById(R.id.checked_content)).mo94502d(a, edVar.f31984d, this.f290314i.f290349s);
        }
        findViewById.setOnClickListener(new C104944bo(this));
        findViewById2.setOnClickListener(new C104945bp(this));
        m173994N(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo94129x() {
        View findViewById;
        View findViewById2;
        C9278v vVar = this.f290310e;
        C9249ed edVar = vVar.f32214u;
        if (edVar == null) {
            edVar = C9249ed.f31979g;
        }
        C9141ad adVar = edVar.f31983c;
        if (adVar == null) {
            adVar = C9141ad.f31521K;
        }
        int i = 1;
        if (!((adVar.f31535a & 4) == 0 || (findViewById2 = this.f290311f.findViewById(R.id.neutral_container)) == null)) {
            C9141ad adVar2 = edVar.f31983c;
            if (adVar2 == null) {
                adVar2 = C9141ad.f31521K;
            }
            C9164b bVar = adVar2.f31539e;
            if (bVar == null) {
                bVar = C9164b.f31642o;
            }
            int a = C9275s.m23704a(vVar.f32178L);
            if (a == 0) {
                a = 1;
            }
            mo94111J(findViewById2, bVar, a);
        }
        C9141ad adVar3 = edVar.f31985e;
        if (adVar3 == null) {
            adVar3 = C9141ad.f31521K;
        }
        if ((adVar3.f31535a & 4) != 0 && (findViewById = this.f290311f.findViewById(R.id.checked_container)) != null) {
            C9141ad adVar4 = edVar.f31985e;
            if (adVar4 == null) {
                adVar4 = C9141ad.f31521K;
            }
            C9164b bVar2 = adVar4.f31539e;
            if (bVar2 == null) {
                bVar2 = C9164b.f31642o;
            }
            int a2 = C9275s.m23704a(vVar.f32178L);
            if (a2 != 0) {
                i = a2;
            }
            mo94111J(findViewById, bVar2, i);
        }
    }
}
