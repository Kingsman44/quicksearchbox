package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114870dm;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.p */
/* compiled from: PG */
public final class C114690p implements C114750d {

    /* renamed from: a */
    public static final C59071e f318228a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.p");

    /* renamed from: b */
    public final Context f318229b;

    /* renamed from: c */
    public final C68214a f318230c;

    /* renamed from: d */
    public final LayoutInflater f318231d;

    /* renamed from: e */
    public final C58833ax f318232e;

    /* renamed from: f */
    public final C53245gt f318233f;

    /* renamed from: g */
    public final C91097g f318234g;

    /* renamed from: h */
    public C28293k f318235h;

    /* renamed from: i */
    private final Activity f318236i;

    /* renamed from: j */
    private final C58881cr f318237j = C58886cw.m90973a(new C114689o(this));

    /* renamed from: k */
    private final C58833ax f318238k;

    public C114690p(Context context, Activity activity, C68214a aVar, C58833ax axVar, C58833ax axVar2, C53245gt gtVar, C91097g gVar) {
        this.f318231d = LayoutInflater.from(context);
        this.f318229b = context;
        this.f318236i = activity;
        this.f318230c = aVar;
        this.f318238k = axVar;
        this.f318232e = axVar2;
        this.f318233f = gtVar;
        this.f318234g = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        C58976aa aaVar = C58975e.f156826a;
        return (View) this.f318237j.mo6453a();
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        if (this.f318235h == null) {
            View view = (View) this.f318237j.mo6453a();
        }
        return this.f318235h;
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
    public final void mo101522g(TextView textView) {
        C53245gt gtVar = this.f318233f;
        if ((gtVar.f139567a & 64) != 0) {
            String str = gtVar.f139575i;
            C58833ax axVar = C58836b.f156633a;
            try {
                axVar = C58833ax.m90834k(Intent.parseUri(str, 1));
            } catch (URISyntaxException e) {
                C59104x d = f318228a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AMWeatherCard");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29267)).mo56389s("Trying to open invalid url: %s", str);
            }
            if (axVar.mo56113h()) {
                textView.setOnClickListener(new C89943l(new C114870dm(this.f318236i, this.f318238k, new C114688n(this, (Intent) axVar.mo56107c()), this.f318234g)));
            }
        }
    }
}
