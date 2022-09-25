package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.animation.ObjectAnimator;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14128bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14426iu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ar */
/* compiled from: PG */
public final class C15181ar {

    /* renamed from: a */
    public final C14986h f45552a;

    /* renamed from: b */
    public ObjectAnimator f45553b;

    /* renamed from: c */
    private final C15352z f45554c;

    /* renamed from: d */
    private final C14132bf f45555d;

    /* renamed from: e */
    private final C86124t f45556e;

    /* renamed from: f */
    private ViewGroup f45557f;

    /* renamed from: g */
    private TextView f45558g;

    /* renamed from: h */
    private ImageView f45559h;

    /* renamed from: i */
    private CircularProgressIndicator f45560i;

    /* renamed from: j */
    private C14568oa f45561j;

    /* renamed from: k */
    private TextView f45562k;

    /* renamed from: l */
    private ImageView f45563l;

    public C15181ar(C14986h hVar, C15352z zVar, C14132bf bfVar, C86124t tVar) {
        this.f45552a = hVar;
        this.f45554c = zVar;
        this.f45555d = bfVar;
        this.f45556e = tVar;
    }

    /* renamed from: a */
    public final void mo22057a(C14568oa oaVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        C14348fx fxVar;
        C58976aa aaVar = C58975e.f156826a;
        boolean z = oaVar.f44049c;
        if (this.f45558g == null) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(z ? this.f45556e.mo79746e(C90051dc.f248768C) ? R.layout.incoming_message_with_glow : R.layout.incoming_message : R.layout.incoming_message_inactionable, viewGroup, true)).findViewById(R.id.incoming_message_container);
            this.f45557f = viewGroup2;
            this.f45555d.mo21444a(viewGroup2, true != z ? 137600 : 105765);
            ViewGroup viewGroup3 = this.f45557f;
            viewGroup3.getClass();
            viewGroup3.setOnClickListener(new C15179ap(this, z));
            ViewGroup viewGroup4 = this.f45557f;
            viewGroup4.getClass();
            viewGroup4.setOnTouchListener(new C14144n(contextThemeWrapper, this.f45555d, new C15180aq(this)));
            if (z) {
                ViewGroup viewGroup5 = this.f45557f;
                viewGroup5.getClass();
                TextView textView = (TextView) viewGroup5.findViewById(R.id.play_message_button);
                this.f45555d.mo21444a(textView, 105764);
                textView.setOnClickListener(new C14128bb(this.f45555d, new C15175al(this)));
            }
            ViewGroup viewGroup6 = this.f45557f;
            viewGroup6.getClass();
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewGroup6.findViewById(R.id.cancel_fuse);
            this.f45560i = circularProgressIndicator;
            this.f45555d.mo21444a(circularProgressIndicator, 105763);
            this.f45560i.setOnClickListener(new C14129bc(this.f45555d, Optional.empty(), new C15176am(this)));
            ViewGroup viewGroup7 = this.f45557f;
            viewGroup7.getClass();
            this.f45558g = (TextView) viewGroup7.findViewById(R.id.incoming_message_sender_name);
            ViewGroup viewGroup8 = this.f45557f;
            viewGroup8.getClass();
            this.f45559h = (ImageView) viewGroup8.findViewById(R.id.incoming_message_sender_avatar);
            ViewGroup viewGroup9 = this.f45557f;
            viewGroup9.getClass();
            this.f45562k = (TextView) viewGroup9.findViewById(R.id.new_message_text);
            ViewGroup viewGroup10 = this.f45557f;
            viewGroup10.getClass();
            this.f45563l = (ImageView) viewGroup10.findViewById(R.id.message_app_icon);
            ViewGroup viewGroup11 = this.f45557f;
            viewGroup11.getClass();
            viewGroup11.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_shelf_in));
            ViewGroup viewGroup12 = this.f45557f;
            viewGroup12.getClass();
            viewGroup12.findViewById(R.id.incoming_message_sender_avatar).startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_photo_text_in));
            ViewGroup viewGroup13 = this.f45557f;
            viewGroup13.getClass();
            viewGroup13.findViewById(R.id.message_app_icon).startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_photo_text_in));
            ViewGroup viewGroup14 = this.f45557f;
            viewGroup14.getClass();
            viewGroup14.findViewById(R.id.incoming_message_sender_name).startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_photo_text_in));
            ViewGroup viewGroup15 = this.f45557f;
            viewGroup15.getClass();
            viewGroup15.findViewById(R.id.new_message_text).startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_photo_text_in));
            if (z) {
                ViewGroup viewGroup16 = this.f45557f;
                viewGroup16.getClass();
                viewGroup16.findViewById(R.id.play_message_button).startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_icon_in));
            }
            ViewGroup viewGroup17 = this.f45557f;
            viewGroup17.getClass();
            viewGroup17.findViewById(R.id.cancel_fuse).startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.incoming_task_icon_in));
        }
        C14348fx fxVar2 = oaVar.f44047a;
        if (fxVar2 == null) {
            fxVar2 = C14348fx.f43414h;
        }
        C14568oa oaVar2 = this.f45561j;
        if (oaVar2 == null || (fxVar = oaVar2.f44047a) == null || fxVar2.f43417b != fxVar.f43417b) {
            TextView textView2 = this.f45558g;
            textView2.getClass();
            textView2.setText(fxVar2.f43416a);
            C15352z zVar = this.f45554c;
            ImageView imageView = this.f45559h;
            imageView.getClass();
            C14361gj gjVar = fxVar2.f43419d;
            if (gjVar == null) {
                gjVar = C14361gj.f43456e;
            }
            zVar.mo22229l(imageView, gjVar, C15177an.f45547a);
            C15352z zVar2 = this.f45554c;
            ImageView imageView2 = this.f45563l;
            imageView2.getClass();
            zVar2.mo22228k(imageView2, fxVar2.f43418c);
            TextView textView3 = this.f45562k;
            textView3.getClass();
            textView3.setText(C5114a.m13987a(contextThemeWrapper, R.string.new_message_text, "count", Integer.valueOf(fxVar2.f43421f)));
            CircularProgressIndicator circularProgressIndicator2 = this.f45560i;
            circularProgressIndicator2.getClass();
            circularProgressIndicator2.setProgress(0);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f45560i, "progress", new int[]{100});
            this.f45553b = ofInt;
            ofInt.getClass();
            ofInt.setDuration(15000).start();
            ObjectAnimator objectAnimator = this.f45553b;
            objectAnimator.getClass();
            objectAnimator.addListener(new C15178ao(this));
            if (oaVar.f44048b) {
                C14986h hVar = this.f45552a;
                C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
                C14426iu iuVar = (C14426iu) C14427iv.f43643o.createBuilder();
                iuVar.copyOnWrite();
                ((C14427iv) iuVar.instance).f43645a = 19;
                gtVar.copyOnWrite();
                C14492lf lfVar = (C14492lf) gtVar.instance;
                C14427iv ivVar = (C14427iv) iuVar.build();
                ivVar.getClass();
                lfVar.f43801d = ivVar;
                lfVar.f43800c = 5;
                hVar.mo21875g((C14492lf) gtVar.build());
            }
            this.f45561j = oaVar;
            return;
        }
        int i = fxVar2.f43421f;
        if (i != fxVar.f43421f) {
            TextView textView4 = this.f45562k;
            textView4.getClass();
            textView4.setText(C5114a.m13987a(contextThemeWrapper, R.string.new_message_text, "count", Integer.valueOf(i)));
        }
    }

    /* renamed from: b */
    public final void mo22058b() {
        this.f45557f = null;
        this.f45558g = null;
        this.f45559h = null;
        this.f45561j = null;
        this.f45560i = null;
        this.f45553b = null;
        this.f45562k = null;
        this.f45563l = null;
    }
}
