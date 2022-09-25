package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116421a;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116431b;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116434e;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.imageviewer.p1874a.C22822a;
import com.google.android.libraries.gsa.imageviewer.p1874a.C22823b;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.aj */
/* compiled from: PG */
public final class C116446aj extends C22939d {

    /* renamed from: a */
    public static final Interpolator f322883a = new DecelerateInterpolator();

    /* renamed from: b */
    public final Activity f322884b;

    /* renamed from: c */
    public FrameLayout f322885c;

    /* renamed from: d */
    public Interstitial f322886d;

    /* renamed from: e */
    public ConfirmationTray f322887e;

    /* renamed from: f */
    public Snackbar f322888f;

    /* renamed from: g */
    private final C116421a f322889g;

    /* renamed from: h */
    private final C116434e f322890h;

    /* renamed from: i */
    private final Context f322891i;

    /* renamed from: j */
    private final C90323a f322892j;

    /* renamed from: k */
    private final C91189au f322893k;

    /* renamed from: l */
    private final C22822a f322894l = new C116444ah(this);

    /* renamed from: m */
    private boolean f322895m = false;

    /* renamed from: n */
    private boolean f322896n = false;

    /* renamed from: o */
    private C90324b f322897o;

    public C116446aj(C22945j jVar, C116421a aVar, C116434e eVar, Context context, C58833ax axVar, C90323a aVar2, C91189au auVar) {
        super(jVar);
        this.f322889g = aVar;
        this.f322890h = eVar;
        this.f322891i = context;
        this.f322892j = aVar2;
        this.f322893k = auVar;
        C58838bb.m90883r(axVar.mo56113h());
        this.f322884b = (Activity) axVar.mo56107c();
    }

    /* renamed from: e */
    public final void mo102714e() {
        if (!this.f322896n) {
            this.f322896n = true;
            this.f322885c.animate().alpha(0.0f).setDuration(200).withEndAction(new C116470w(this)).start();
            this.f322884b.getWindow().clearFlags(2);
        }
    }

    /* renamed from: g */
    public final void mo102715g() {
        View view;
        if (!this.f322896n) {
            if (this.f322888f.getVisibility() != 0) {
                if (this.f322886d.getVisibility() == 0) {
                    view = this.f322886d;
                } else {
                    view = this.f322887e;
                }
                C89949q.m146521e(C28285c.m52882i(view, 27, (Integer) null), false);
            }
            mo102714e();
        }
    }

    /* renamed from: h */
    public final void mo102716h() {
        if (!this.f322895m) {
            this.f322884b.getWindow().addFlags(2);
            this.f322884b.getWindow().setDimAmount(0.6f);
            View decorView = this.f322884b.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
            this.f322884b.getWindow().setNavigationBarColor(this.f322891i.getResources().getColor(R.color.agsa_color_surface));
            this.f322895m = true;
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f322891i).inflate(R.layout.save_root, (ViewGroup) null);
        this.f322885c = frameLayout;
        this.f322886d = (Interstitial) frameLayout.findViewById(R.id.save_interstitial_v2);
        this.f322887e = (ConfirmationTray) this.f322885c.findViewById(R.id.save_confirmation_tray);
        this.f322888f = (Snackbar) this.f322885c.findViewById(R.id.save_snackbar);
        C28295m.m52919e(this.f322885c, new C28292j(39250));
        Interstitial interstitial = this.f322886d;
        C28292j jVar = new C28292j(38841);
        jVar.mo33795i(27);
        jVar.mo33794h(2);
        C28295m.m52919e(interstitial, jVar);
        ConfirmationTray confirmationTray = this.f322887e;
        C28292j jVar2 = new C28292j(35896);
        jVar2.mo33795i(27);
        jVar2.mo33794h(2);
        C28295m.m52919e(confirmationTray, jVar2);
        View findViewById = this.f322885c.findViewById(R.id.save_snackbar_error);
        C28292j jVar3 = new C28292j(39253);
        jVar3.mo33794h(2);
        C28295m.m52919e(findViewById, jVar3);
        View findViewById2 = this.f322885c.findViewById(R.id.save_snackbar_unsaved);
        C28292j jVar4 = new C28292j(39254);
        jVar4.mo33794h(2);
        C28295m.m52919e(findViewById2, jVar4);
        Interstitial interstitial2 = this.f322886d;
        interstitial2.f322865g = this.f322893k;
        interstitial2.f322866h = new AlertDialog.Builder(this.f322891i);
        Interstitial interstitial3 = this.f322886d;
        interstitial3.f322868j = new C116471x(this);
        interstitial3.f322863e = new C22823b(this.f322894l);
        interstitial3.setOnTouchListener(interstitial3.f322863e);
        ConfirmationTray confirmationTray2 = this.f322887e;
        C116421a aVar = this.f322889g;
        Objects.requireNonNull(aVar);
        confirmationTray2.f322856e = new C116472y(aVar);
        ConfirmationTray confirmationTray3 = this.f322887e;
        C116421a aVar2 = this.f322889g;
        Objects.requireNonNull(aVar2);
        confirmationTray3.f322857f = new C116473z(aVar2);
        ConfirmationTray confirmationTray4 = this.f322887e;
        confirmationTray4.f322855d = new C22823b(this.f322894l);
        confirmationTray4.setOnTouchListener(confirmationTray4.f322855d);
        mo28295iC(this.f322885c);
        ((C116468u) this.f322890h).f322934c.mo28726b(new C116438ab(this));
        ((C116468u) this.f322890h).f322932a.mo28726b(new C116439ac(this));
        ((C116468u) this.f322890h).f322936e.mo28726b(new C116440ad(this));
        C23251a aVar3 = ((C116468u) this.f322890h).f322935d;
        Snackbar snackbar = this.f322888f;
        Objects.requireNonNull(snackbar);
        aVar3.mo28726b(new C116441ae(snackbar));
        this.f322885c.setOnTouchListener(new C116437aa(this));
        C116445ai aiVar = new C116445ai(this);
        this.f322897o = aiVar;
        this.f322892j.mo84004a(aiVar);
        C89949q.m146522f(this.f322885c);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        if (((Boolean) ((C116468u) this.f322890h).f322933b.f63720e).booleanValue()) {
            this.f322888f.setBackground(this.f322891i.getDrawable(R.drawable.floating_snackbar_background));
            int dimensionPixelOffset = this.f322891i.getResources().getDimensionPixelOffset(R.dimen.floating_snackbar_margin);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f322888f.getLayoutParams();
            marginLayoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            this.f322888f.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: j */
    public final void mo102717j(C116424c cVar, boolean z) {
        C116421a aVar = this.f322889g;
        Boolean valueOf = Boolean.valueOf(z);
        Bundle bundle = new Bundle();
        C116424c.f322815o.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("list", C23245b.m43556a(cVar));
        bundle.putBoolean("createList", valueOf.booleanValue());
        ((C116431b) aVar).f322843a.mo28345s("listSelected_com.google.android.apps.gsa.staticplugins.save.shared.proto.ModelProto.ListSelectorItem_java.lang.Boolean", "SaveEventsDispatcher", bundle);
    }

    /* renamed from: js */
    public final void mo28301js() {
        C90324b bVar = this.f322897o;
        if (bVar != null) {
            this.f322892j.mo84005b(bVar);
            this.f322897o = null;
        }
    }

    /* renamed from: k */
    public final void mo102718k(boolean z) {
        C89949q.m146521e(C28285c.m52881h(2, C28295m.m52916b(this.f322885c.findViewById(true != z ? R.id.save_snackbar_unsaved : R.id.save_snackbar_error)), (View) null), false);
        Snackbar snackbar = this.f322888f;
        snackbar.setTranslationY((float) snackbar.getHeight());
        snackbar.setVisibility(0);
        snackbar.animate().translationY(0.0f).setDuration(350).start();
        this.f322885c.postDelayed(new C116469v(this), 3000);
    }
}
