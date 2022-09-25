package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.content.pm.PackageManager;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.n */
/* compiled from: PG */
public final /* synthetic */ class C109117n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C109100ar f303866a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f303867b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f303868c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f303869d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f303870e;

    /* renamed from: f */
    public final /* synthetic */ boolean f303871f;

    /* renamed from: g */
    public final /* synthetic */ int f303872g;

    /* renamed from: h */
    public final /* synthetic */ boolean f303873h;

    public /* synthetic */ C109117n(C109100ar arVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, boolean z, int i, boolean z2) {
        this.f303866a = arVar;
        this.f303867b = cxVar;
        this.f303868c = cxVar2;
        this.f303869d = cxVar3;
        this.f303870e = cxVar4;
        this.f303871f = z;
        this.f303872g = i;
        this.f303873h = z2;
    }

    public final Object call() {
        String str;
        C109100ar arVar = this.f303866a;
        C60870cx cxVar = this.f303867b;
        C60870cx cxVar2 = this.f303868c;
        C60870cx cxVar3 = this.f303869d;
        C60870cx cxVar4 = this.f303870e;
        boolean z = this.f303871f;
        int i = this.f303872g;
        boolean z2 = this.f303873h;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        boolean z3 = false;
        if (guVar.size() == 1) {
            arVar.mo97600p((C53593bz) guVar.get(0), false);
        } else {
            arVar.f303779l.setText(arVar.mo97587c().getString(R.string.opa_first_time_greeting_query_suggestion_message_try_saying));
            arVar.f303770c.setGravity(3);
            arVar.f303773f.setGravity(3);
            arVar.f303779l.setTextAppearance(R.style.GreetingSmallTitleStyle);
            if (arVar.f303791x.mo79746e(C90037cp.f248542cQ)) {
                ViewGroup.LayoutParams layoutParams = arVar.f303752Q.getLayoutParams();
                layoutParams.width = -2;
                arVar.f303752Q.setLayoutParams(layoutParams);
            }
            int size = guVar.size();
            C53593bz bzVar = null;
            int i2 = 0;
            boolean z4 = false;
            while (i2 < size) {
                C53593bz bzVar2 = (C53593bz) guVar.get(i2);
                C58485gu guVar2 = guVar;
                TextView textView = (TextView) arVar.f303751P.inflate(R.layout.greeting_suggestion_text_view_small, arVar.f303752Q, z3);
                arVar.f303752Q.addView(textView);
                arVar.mo97591g(textView, bzVar2);
                if (!z4) {
                    z4 = C109100ar.m181605u(bzVar2);
                    bzVar = bzVar2;
                }
                if (!arVar.f303791x.mo79746e(C90037cp.f248539cN)) {
                    textView.setOnClickListener(new C109115l(arVar, textView, bzVar2));
                }
                int i3 = size;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(arVar.mo97587c().getString(R.string.opa_first_time_greeting_query_suggestion_quote, new Object[]{bzVar2.f140661b}));
                spannableStringBuilder.setSpan(arVar.mo97588d(false), 0, spannableStringBuilder.length(), 18);
                textView.setText(spannableStringBuilder);
                i2++;
                guVar = guVar2;
                size = i3;
                z3 = false;
            }
            if (z4) {
                bzVar.getClass();
                arVar.mo97601q(bzVar);
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) arVar.f303774g.getLayoutParams();
            layoutParams2.bottomMargin = (int) arVar.f303790w.getResources().getDimension(R.dimen.greeting_opa_logo_margin_bottom_multi_suggestion);
            arVar.f303774g.setLayoutParams(layoutParams2);
            if (arVar.f303788u == C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION && arVar.f303750O != null) {
                try {
                    PackageManager packageManager = arVar.f303790w.getPackageManager();
                    arVar.f303779l.setText(arVar.f303790w.getResources().getString(R.string.overapp_greeting, new Object[]{packageManager.getApplicationLabel(packageManager.getApplicationInfo(arVar.f303750O, 0))}));
                } catch (PackageManager.NameNotFoundException unused) {
                    C58976aa aaVar = C58975e.f156826a;
                }
            }
            arVar.f303739D.mo97608b(arVar.f303788u, false);
            arVar.f303770c.requestLayout();
            arVar.mo97596l();
        }
        try {
            int intValue = ((Integer) C60856cj.m92909r(cxVar2)).intValue();
            int intValue2 = ((Integer) C60856cj.m92909r(cxVar3)).intValue();
            int intValue3 = ((Integer) C60856cj.m92909r(cxVar4)).intValue();
            long a = arVar.f303791x.mo79743a(C90037cp.f248581dC);
            long a2 = arVar.f303791x.mo79743a(C90037cp.f248580dB);
            if (!z || ((long) intValue) >= a || ((long) intValue2) >= a2 || (intValue2 >= i && intValue3 < i)) {
                if (z2 && ((long) intValue3) < arVar.f303791x.mo79743a(C90037cp.f248431aL)) {
                    arVar.f303755T.setVisibility(0);
                    ((Button) arVar.f303755T.findViewById(R.id.greeting_optin_button)).setText(((C73841bf) arVar.f303736A.mo27525b()).mo65322a().getText(R.string.opa_add_shortcut));
                    arVar.f303758W.mo101394d("opa_entry_point_button_impression_count", Integer.valueOf(intValue3 + 1));
                    arVar.mo97590f(new C109092aj(arVar), 105439);
                }
                arVar.mo97595k();
                return true;
            }
            arVar.f303755T.setVisibility(0);
            Button button = (Button) arVar.f303755T.findViewById(R.id.greeting_optin_button);
            if (arVar.f303760Y.mo83834w()) {
                str = ((C92486a) arVar.f303757V.mo27525b()).mo87227A(C90584f.OK_HEY_GOOGLE, Locale.getDefault().toString(), 2, 1);
            } else {
                str = ((C92486a) arVar.f303757V.mo27525b()).mo87230d();
            }
            String replace = str.replace(' ', 160);
            button.setText(((C73841bf) arVar.f303736A.mo27525b()).mo65322a().getString(R.string.greeting_voice_match_promo_button_text, new Object[]{replace}));
            arVar.f303758W.mo101394d("opa_voice_match_button_impression_count", Integer.valueOf(intValue2 + 1));
            arVar.mo97590f(new C109083aa(arVar, intValue), 105440);
            arVar.mo97596l();
            arVar.mo97595k();
            return true;
        } catch (Exception e) {
            C59104x c = C109100ar.f303734a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24511)).mo56386p("error showing the promo chip on FRE");
        }
    }
}
