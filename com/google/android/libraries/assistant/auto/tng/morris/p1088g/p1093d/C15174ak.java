package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchplate.C88911am;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.C14748c;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14117ar;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14128bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15328b;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import com.google.android.libraries.search.p6glow.C39882m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ak */
/* compiled from: PG */
public final class C15174ak {

    /* renamed from: a */
    public static final C59071e f45529a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.d.ak");

    /* renamed from: b */
    public final C14986h f45530b;

    /* renamed from: c */
    public final C14117ar f45531c;

    /* renamed from: d */
    public final C21370a f45532d;

    /* renamed from: e */
    public C39882m f45533e;

    /* renamed from: f */
    public C14565ny f45534f;

    /* renamed from: g */
    public C14350fz f45535g = C14350fz.MIC_UNKNOWN;

    /* renamed from: h */
    private final C14132bf f45536h;

    /* renamed from: i */
    private final C14748c f45537i;

    /* renamed from: j */
    private final C86124t f45538j;

    /* renamed from: k */
    private LogoView f45539k;

    /* renamed from: l */
    private ViewGroup f45540l;

    /* renamed from: m */
    private TextView f45541m;

    /* renamed from: n */
    private ImageView f45542n;

    /* renamed from: o */
    private AssistantP6GlowView f45543o;

    /* renamed from: p */
    private final C147783f f45544p;

    public C15174ak(C14986h hVar, C14132bf bfVar, C14748c cVar, C14117ar arVar, C21370a aVar, C86124t tVar, C147783f fVar) {
        this.f45530b = hVar;
        this.f45536h = bfVar;
        this.f45537i = cVar;
        this.f45531c = arVar;
        this.f45532d = aVar;
        this.f45538j = tVar;
        this.f45544p = fVar;
    }

    /* renamed from: a */
    public final void mo22049a(C14565ny nyVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        C58976aa aaVar = C58975e.f156826a;
        int i = 11;
        if (this.f45541m == null) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(true != this.f45538j.mo79746e(C90051dc.f248768C) ? R.layout.incoming_call : R.layout.incoming_call_with_glow, viewGroup, true)).findViewById(R.id.incoming_call_container);
            this.f45540l = viewGroup2;
            this.f45536h.mo21444a(viewGroup2, 105761);
            ViewGroup viewGroup3 = this.f45540l;
            viewGroup3.getClass();
            viewGroup3.setOnTouchListener(new C14144n(contextThemeWrapper, this.f45536h, new C15173aj(this)));
            ViewGroup viewGroup4 = this.f45540l;
            viewGroup4.getClass();
            ImageView imageView = (ImageView) viewGroup4.findViewById(R.id.incoming_call_answer_call_button);
            this.f45536h.mo21444a(imageView, 105759);
            imageView.setOnClickListener(new C14129bc(this.f45536h, Optional.empty(), new C15170ag(this)));
            ViewGroup viewGroup5 = this.f45540l;
            viewGroup5.getClass();
            ImageView imageView2 = (ImageView) viewGroup5.findViewById(R.id.incoming_call_end_call_button);
            this.f45536h.mo21444a(imageView2, 105762);
            imageView2.setOnClickListener(new C14129bc(this.f45536h, Optional.empty(), new C15171ah(this)));
            ViewGroup viewGroup6 = this.f45540l;
            viewGroup6.getClass();
            this.f45541m = (TextView) viewGroup6.findViewById(R.id.incoming_call_caller_name);
            ViewGroup viewGroup7 = this.f45540l;
            viewGroup7.getClass();
            this.f45542n = (ImageView) viewGroup7.findViewById(R.id.incoming_call_caller_avatar);
            if (!this.f45538j.mo79746e(C90051dc.f248768C) || this.f45533e != null) {
                ViewGroup viewGroup8 = this.f45540l;
                viewGroup8.getClass();
                LogoView logoView = (LogoView) viewGroup8.findViewById(R.id.incoming_call_logo_view);
                this.f45539k = logoView;
                C14132bf bfVar = this.f45536h;
                logoView.getClass();
                bfVar.mo21444a(logoView, 104385);
                C88911am amVar = new C88911am();
                amVar.f240858a = this.f45537i;
                LogoView logoView2 = this.f45539k;
                logoView2.getClass();
                logoView2.f63000g.mo28247c(amVar, 2);
                LogoView logoView3 = this.f45539k;
                logoView3.getClass();
                logoView3.mo28225e(11, false);
                LogoView logoView4 = this.f45539k;
                logoView4.getClass();
                logoView4.mo28223c((float) contextThemeWrapper.getResources().getInteger(R.integer.energy_bar_logo_view_logo_width), (float) contextThemeWrapper.getResources().getInteger(R.integer.energy_bar_logo_view_logo_height));
                LogoView logoView5 = this.f45539k;
                logoView5.getClass();
                logoView5.setOnClickListener(new C14128bb(this.f45536h, new C15172ai(this)));
            } else {
                ViewGroup viewGroup9 = this.f45540l;
                viewGroup9.getClass();
                this.f45543o = (AssistantP6GlowView) viewGroup9.findViewById(R.id.voice_plate_glow);
                this.f45533e = new C39882m(this.f45543o, this.f45544p);
                AssistantP6GlowView assistantP6GlowView = this.f45543o;
                assistantP6GlowView.getClass();
                int i2 = contextThemeWrapper.getResources().getDisplayMetrics().widthPixels;
                int b = C15352z.m31950b(contextThemeWrapper, R.dimen.incoming_task_card_margin_horizontal);
                assistantP6GlowView.mo42037n((float) (i2 - (b + b)));
            }
            ViewGroup viewGroup10 = this.f45540l;
            viewGroup10.getClass();
            viewGroup10.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_shelf_in));
            int[] iArr = {R.id.incoming_call_caller_avatar, R.id.incoming_call_caller_name, R.id.incoming_call_type};
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                ViewGroup viewGroup11 = this.f45540l;
                viewGroup11.getClass();
                viewGroup11.findViewById(i4).startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_photo_text_in));
            }
            int[] iArr2 = {R.id.incoming_call_logo_view, R.id.incoming_call_answer_call_button, R.id.incoming_call_end_call_button};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                if (!this.f45538j.mo79746e(C90051dc.f248768C) || i6 != R.id.incoming_call_logo_view) {
                    ViewGroup viewGroup12 = this.f45540l;
                    viewGroup12.getClass();
                    viewGroup12.findViewById(i6).startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_icon_in));
                }
            }
        }
        if (!nyVar.equals(this.f45534f)) {
            C14350fz a = C14350fz.m30611a(nyVar.f44039d);
            if (a == null) {
                a = C14350fz.UNRECOGNIZED;
            }
            this.f45535g = a;
            if (this.f45538j.mo79746e(C90051dc.f248768C)) {
                C14350fz fzVar = this.f45535g;
                C39882m mVar = this.f45533e;
                mVar.getClass();
                C15328b.m31910a(fzVar, mVar);
            } else {
                C14350fz a2 = C14350fz.m30611a(nyVar.f44039d);
                if (a2 == null) {
                    a2 = C14350fz.UNRECOGNIZED;
                }
                switch (a2.ordinal()) {
                    case 0:
                    case 1:
                    case 5:
                    case 6:
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 4;
                        break;
                    default:
                        i = 7;
                        break;
                }
                LogoView logoView6 = this.f45539k;
                logoView6.getClass();
                logoView6.mo28225e(i, false);
                if (this.f45535g.equals(C14350fz.MIC_OPEN) || this.f45535g.equals(C14350fz.MIC_RECORDING)) {
                    LogoView logoView7 = this.f45539k;
                    logoView7.getClass();
                    logoView7.setImportantForAccessibility(1);
                } else {
                    LogoView logoView8 = this.f45539k;
                    logoView8.getClass();
                    logoView8.setImportantForAccessibility(2);
                }
            }
            TextView textView = this.f45541m;
            textView.getClass();
            textView.setText(nyVar.f44036a);
            C14361gj gjVar = nyVar.f44038c;
            if (gjVar != null) {
                ImageView imageView3 = this.f45542n;
                imageView3.getClass();
                imageView3.setImageBitmap(C15375c.m31983a(gjVar));
            } else {
                ImageView imageView4 = this.f45542n;
                imageView4.getClass();
                imageView4.setImageResource(R.drawable.caller_avatar);
            }
            this.f45534f = nyVar;
            this.f45531c.mo21434b(C37182a.f97832bK.mo40815i(C62722b.OK));
        }
    }

    /* renamed from: b */
    public final void mo22050b() {
        this.f45540l = null;
        this.f45541m = null;
        this.f45542n = null;
        this.f45534f = null;
        this.f45533e = null;
        this.f45543o = null;
    }
}
