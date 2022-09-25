package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53289ij;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ab */
/* compiled from: PG */
public final class C114617ab implements C114750d {

    /* renamed from: b */
    private static final C59071e f317961b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ab");

    /* renamed from: a */
    public final C91097g f317962a;

    /* renamed from: c */
    private final C68214a f317963c;

    /* renamed from: d */
    private final C114839ci f317964d;

    /* renamed from: e */
    private final C86124t f317965e;

    /* renamed from: f */
    private final C53289ij f317966f;

    /* renamed from: g */
    private final LayoutInflater f317967g;

    /* renamed from: h */
    private final C58881cr f317968h = C58886cw.m90973a(new C114616aa(this));

    /* renamed from: i */
    private C28293k f317969i;

    public C114617ab(Context context, C68214a aVar, C114839ci ciVar, C86124t tVar, C53289ij ijVar, C91097g gVar) {
        this.f317963c = aVar;
        this.f317964d = ciVar;
        this.f317965e = tVar;
        this.f317966f = ijVar;
        this.f317962a = gVar;
        this.f317967g = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        return (View) this.f317968h.mo6453a();
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        return this.f317969i;
    }

    /* renamed from: d */
    public final /* synthetic */ C53420nf mo101466d() {
        return null;
    }

    /* renamed from: e */
    public final void mo101467e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101468f(C53287ih ihVar, AnimatorSet animatorSet) {
        animatorSet.start();
    }

    /* renamed from: g */
    public final View mo101469g() {
        ViewGroup viewGroup = (ViewGroup) this.f317967g.inflate(R.layout.zero_state_external_button_card, (ViewGroup) null);
        C28292j jVar = new C28292j(84395);
        jVar.mo33795i(5);
        viewGroup.getClass();
        C28295m.m52919e(viewGroup, jVar);
        this.f317969i = C28293k.m52908e(jVar, new C28293k[0]);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.zero_state_external_button_card);
        if (this.f317965e.mo79746e(C90014bt.f247289eO)) {
            this.f317964d.mo101653f(linearLayout);
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.external_button_icon);
        if ((this.f317966f.f139709a & 4) != 0) {
            ((C91189au) this.f317963c.mo27525b()).mo85421i(this.f317966f.f139712d, imageView);
        } else {
            imageView.setVisibility(8);
        }
        ((TextView) viewGroup.findViewById(R.id.external_button_text)).setText(this.f317966f.f139710b);
        C58833ax axVar = C58836b.f156633a;
        C53289ij ijVar = this.f317966f;
        if ((ijVar.f139709a & 2) != 0) {
            try {
                axVar = C58833ax.m90834k(Intent.parseUri(ijVar.f139711c, 1));
            } catch (URISyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f317961b.mo56226d()).mo56382g(e)).mo56372aa(29275)).mo56389s("Trying to open invalid url: %s", this.f317966f.f139711c);
            }
        }
        if (axVar.mo56113h()) {
            viewGroup.setOnClickListener(new C89943l(new C114700z(this, (Intent) axVar.mo56107c())));
        }
        return viewGroup;
    }
}
