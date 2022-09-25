package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.p091b.C1874w;
import androidx.core.p096h.C1950c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.ModularCard;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.h */
/* compiled from: PG */
public final class C93677h implements C93684o {

    /* renamed from: a */
    public final ClockResult f261471a;

    /* renamed from: b */
    public final C93671b f261472b;

    /* renamed from: c */
    private final LayoutInflater f261473c;

    /* renamed from: d */
    private final Context f261474d;

    public C93677h(ClockResult clockResult, C93671b bVar, LayoutInflater layoutInflater, Context context) {
        this.f261471a = clockResult;
        this.f261472b = bVar;
        this.f261473c = layoutInflater;
        this.f261474d = context;
    }

    /* renamed from: d */
    private static boolean m154578d(char c) {
        return Character.isSpaceChar(c) || Character.isDigit(c);
    }

    /* renamed from: a */
    public final View mo88141a(ViewGroup viewGroup) {
        int i;
        ModularCard modularCard = (ModularCard) this.f261473c.inflate(R.layout.qp_now_card, viewGroup, false);
        this.f261473c.inflate(R.layout.qp_now_card_clock, modularCard, true);
        ViewGroup viewGroup2 = (ViewGroup) modularCard.findViewById(R.id.clock_primary_info);
        viewGroup2.getClass();
        C58485gu guVar = this.f261471a.f260531a;
        if (guVar != null) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.clock_time_info);
            viewGroup3.getClass();
            int b = (int) C91115n.m148870b(12.0f, this.f261474d);
            int size = guVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ClockResult.TimeInfo timeInfo = (ClockResult.TimeInfo) guVar.get(i2);
                TextView textView = new TextView(this.f261474d);
                textView.setText(timeInfo.f260537a);
                textView.setPadding(0, b, 0, b);
                textView.setTextSize(2, 32.0f);
                textView.setTypeface(Typeface.create("sans-serif-thin", 0));
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                viewGroup3.addView(textView);
                TextView textView2 = new TextView(this.f261474d);
                textView2.setText(timeInfo.f260538b);
                textView2.setPadding(0, b, 0, b);
                textView2.setTextSize(2, 16.0f);
                textView2.setTypeface(Typeface.create("sans-serif-thin", 0));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int b2 = (int) C91115n.m148870b(4.0f, this.f261474d);
                layoutParams.setMargins(b2, 0, b2, 0);
                textView2.setLayoutParams(layoutParams);
                viewGroup3.addView(textView2);
            }
        }
        TextView textView3 = (TextView) viewGroup2.findViewById(R.id.clock_status);
        textView3.getClass();
        if (!TextUtils.isEmpty(this.f261471a.f260532b)) {
            textView3.setText(this.f261471a.f260532b);
        }
        ViewGroup viewGroup4 = (ViewGroup) modularCard.findViewById(R.id.clock_label_and_customized_info);
        viewGroup4.getClass();
        TextView textView4 = (TextView) viewGroup4.findViewById(R.id.clock_label);
        if (!TextUtils.isEmpty(this.f261471a.f260533c)) {
            textView4.setText(this.f261471a.f260533c);
            textView4.setVisibility(0);
        }
        TextView textView5 = (TextView) viewGroup4.findViewById(R.id.clock_customized_info);
        textView5.getClass();
        if (!TextUtils.isEmpty(this.f261471a.f260534d)) {
            String str = this.f261471a.f260534d;
            ArrayList arrayList = new ArrayList();
            C1950c b3 = C1950c.m5273b(Locale.US);
            for (int i3 = 0; i3 < str.length(); i3 = i) {
                i = i3 + 1;
                if (!m154578d(str.charAt(i3))) {
                    while (i < str.length() && !m154578d(str.charAt(i))) {
                        i++;
                    }
                } else {
                    while (i < str.length() && m154578d(str.charAt(i))) {
                        i++;
                    }
                }
                arrayList.add(b3.mo5101f(str.substring(i3, i), b3.f5867d));
            }
            textView5.setText(new C58827ar(BuildConfig.FLAVOR).mo56097d(arrayList));
        }
        modularCard.f256427k = false;
        modularCard.setOnClickListener(new C93675f(this));
        return modularCard;
    }

    /* renamed from: b */
    public final void mo88142b(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setDividerDrawable(C1874w.m5109f(this.f261474d.getResources(), R.drawable.qp_reminder_answer_divider, (Resources.Theme) null));
    }

    /* renamed from: c */
    public final View mo88143c() {
        C93671b bVar = this.f261472b;
        C88507a aVar = bVar.f239232a;
        aVar.getClass();
        View a = bVar.mo88138a(((ModularAnswerImpl) ((C93674e) aVar).f239226b).mo87665P());
        if (a != null) {
            a.setOnClickListener(new C93676g(this));
        }
        return a;
    }
}
