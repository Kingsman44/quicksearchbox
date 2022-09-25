package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114778ab;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53411mx;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bp */
/* compiled from: PG */
public final class C114659bp implements C114750d, C114778ab {

    /* renamed from: a */
    public final C114628am f318091a;

    /* renamed from: b */
    public final C91097g f318092b;

    /* renamed from: c */
    private final C68214a f318093c;

    /* renamed from: d */
    private final C114839ci f318094d;

    /* renamed from: e */
    private final C114796at f318095e;

    /* renamed from: f */
    private final View f318096f;

    /* renamed from: g */
    private final C114757k f318097g;

    /* renamed from: h */
    private final C58833ax f318098h;

    /* renamed from: i */
    private final C53420nf f318099i;

    /* renamed from: j */
    private boolean f318100j = false;

    public C114659bp(Context context, C68214a aVar, C114628am amVar, C114839ci ciVar, C114796at atVar, C114757k kVar, C53420nf nfVar, C58833ax axVar, C91097g gVar, C108226ax axVar2) {
        this.f318098h = axVar;
        this.f318093c = aVar;
        this.f318091a = amVar;
        this.f318094d = ciVar;
        this.f318095e = atVar;
        this.f318092b = gVar;
        this.f318097g = kVar;
        this.f318099i = nfVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.zero_state_native_wrapper_card, (ViewGroup) null);
        this.f318096f = inflate;
        C53411mx mxVar = nfVar.f140177k;
        mxVar = mxVar == null ? C53411mx.f140146e : mxVar;
        if ((mxVar.f140148a & 2) != 0) {
            ((TextView) inflate.findViewById(R.id.card_header_title)).setText(mxVar.f140150c);
        }
        if ((mxVar.f140148a & 1) != 0) {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.card_header_icon);
            imageView.setVisibility(0);
            ((C91189au) aVar.mo27525b()).mo85421i(mxVar.f140149b, imageView);
        }
        if ((mxVar.f140148a & 4) != 0) {
            View findViewById = inflate.findViewById(R.id.overflow_menu_icon);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C89943l(new C114658bo(this, mxVar)));
        }
        if (axVar.mo56113h()) {
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.zero_state_inner_card);
            View b = ((C114750d) axVar.mo56107c()).mo101464b();
            b.setPadding(0, 0, 0, 0);
            viewGroup.setVisibility(0);
            viewGroup.addView(b);
        }
        if ((mxVar.f140148a & 2) != 0) {
            inflate.findViewById(R.id.zero_state_native_wrapper_card).setOnClickListener(new C89943l(new C114657bn(axVar2, mxVar)));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        return this.f318096f;
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        C58833ax axVar = this.f318098h;
        if (axVar.mo56113h()) {
            return ((C114750d) axVar.mo56107c()).mo101465c();
        }
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ C53420nf mo101466d() {
        return null;
    }

    /* renamed from: e */
    public final void mo101467e() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101468f(C53287ih ihVar, AnimatorSet animatorSet) {
        animatorSet.start();
    }

    /* renamed from: g */
    public final void mo101487g(Intent intent) {
        this.f318095e.mo101594a(this.f318099i, intent);
    }

    /* renamed from: h */
    public final void mo101488h() {
        this.f318095e.mo101598e(this.f318099i);
    }

    /* renamed from: i */
    public final void mo101489i() {
        this.f318100j = true;
        this.f318094d.mo101650c(this.f318096f).start();
        this.f318097g.mo101582f();
    }

    /* renamed from: j */
    public final void mo101490j() {
        this.f318100j = false;
        this.f318094d.mo101649b(this.f318096f).start();
        this.f318097g.mo101581e();
    }

    /* renamed from: m */
    public final boolean mo101493m() {
        return this.f318100j;
    }
}
