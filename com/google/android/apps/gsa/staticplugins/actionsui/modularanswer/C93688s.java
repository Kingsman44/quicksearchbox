package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.provider.Telephony;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.ModularCard;
import com.google.android.apps.gsa.sidekick.shared.util.C91960ak;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult;
import com.google.android.apps.gsa.staticplugins.actionsui.C93447an;
import com.google.android.apps.gsa.staticplugins.actionsui.C93448ao;
import com.google.android.apps.gsa.staticplugins.actionsui.C93497c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.s */
/* compiled from: PG */
public final class C93688s implements C93684o {

    /* renamed from: a */
    public final C93671b f261490a;

    /* renamed from: b */
    public final SmsResult f261491b;

    /* renamed from: c */
    private final LayoutInflater f261492c;

    public C93688s(SmsResult smsResult, C93671b bVar, LayoutInflater layoutInflater) {
        this.f261491b = smsResult;
        this.f261490a = bVar;
        this.f261492c = layoutInflater;
    }

    /* renamed from: d */
    private final void m154595d(ImageView imageView) {
        Resources resources = imageView.getResources();
        String str = this.f261491b.f260549b;
        if (C93448ao.f260825a == null) {
            C93448ao.f260825a = resources.obtainTypedArray(R.array.actionsui_letter_tile_colors);
            C93448ao.f260826b = resources.getInteger(R.integer.actionsui_letter_tile_colors_length);
            C93448ao.f260827c = resources.getColor(R.color.letter_tile_default_color);
        }
        imageView.setImageDrawable(new C93447an(imageView.getResources(), (String) null, C93448ao.m153828a(str), true, false));
    }

    /* renamed from: e */
    private final void m154596e(View view, int i) {
        C89941l.m146512c(view, i);
        view.setOnClickListener(new C93687r(this));
    }

    /* renamed from: g */
    private static final String m154598g(Context context, String[] strArr) {
        String string = context.getResources().getString(R.string.action_message_to_recipients_label);
        String d = new C58827ar(", ").mo56097d(Arrays.asList(strArr));
        return string + " " + d;
    }

    /* renamed from: h */
    private static final Drawable m154599h(ModularCard modularCard) {
        try {
            return modularCard.getContext().getPackageManager().getApplicationIcon(Telephony.Sms.getDefaultSmsPackage(modularCard.getContext()));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final View mo88141a(ViewGroup viewGroup) {
        String str;
        String str2;
        CharSequence charSequence;
        ModularCard modularCard = (ModularCard) this.f261492c.inflate(R.layout.qp_now_card, viewGroup, false);
        this.f261492c.inflate(true != m154597f() ? R.layout.qp_now_card_message : R.layout.qp_now_card_message_immersive_actions, modularCard, true);
        modularCard.f256427k = false;
        int i = this.f261491b.f260553g;
        String string = modularCard.getResources().getString(R.string.action_me_label);
        SmsResult smsResult = this.f261491b;
        Person person = smsResult.f260548a;
        if (person != null) {
            str = person.f236373d;
        } else {
            str = smsResult.f260549b;
        }
        if (i == 101) {
            Context context = modularCard.getContext();
            String[] strArr = new String[1];
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            strArr[0] = str;
            str2 = m154598g(context, strArr);
        } else {
            str2 = m154598g(modularCard.getContext(), new String[]{string.toLowerCase(Locale.getDefault())});
            string = str;
        }
        C91985d.m150954a(modularCard, R.id.message_sender_name, string);
        if (!m154597f()) {
            C91985d.m150954a(modularCard, R.id.message_recipients, str2);
        }
        if (m154597f()) {
            charSequence = C89407a.m145424g(this.f261490a.getContext(), this.f261491b.f260552f);
        } else {
            charSequence = C89407a.m145418a(this.f261490a.getContext(), this.f261491b.f260552f, 1, true);
        }
        C91985d.m150954a(modularCard, R.id.message_timestamp, charSequence.toString());
        CompactMultiTextLinearLayout compactMultiTextLinearLayout = (CompactMultiTextLinearLayout) modularCard.findViewById(R.id.message_body_container);
        compactMultiTextLinearLayout.f261460a = new C93686q(modularCard);
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = this.f261491b.f260551d;
        int color = this.f261490a.getResources().getColor(R.color.qp_text_b1);
        for (String a : this.f261491b.f260550c) {
            arrayList.add(C93672c.m154572a(a, guVar, color));
        }
        compactMultiTextLinearLayout.mo88132a(true != m154597f() ? 9 : 3);
        compactMultiTextLinearLayout.mo88133b();
        int i2 = 0;
        while (i2 < arrayList.size() && i2 < 6) {
            CharSequence charSequence2 = (CharSequence) arrayList.get(i2);
            TextView textView = (TextView) this.f261492c.inflate(R.layout.qp_modular_answer_body_text, compactMultiTextLinearLayout, false);
            if (i2 != arrayList.size() - 1) {
                if (i2 == 5) {
                    i2 = 5;
                } else {
                    textView.setText(charSequence2);
                    compactMultiTextLinearLayout.addView(textView);
                    i2++;
                }
            }
            textView.setPadding(0, 0, 0, 0);
            textView.setText(charSequence2);
            compactMultiTextLinearLayout.addView(textView);
            i2++;
        }
        if (arrayList.size() > 6) {
            modularCard.findViewById(R.id.message_overflow).setVisibility(0);
        }
        Drawable h = m154599h(modularCard);
        if (!m154597f() || h == null) {
            C91960ak.m150916b(modularCard, R.drawable.ic_reply_grey);
        } else {
            ImageView a2 = C91960ak.m150915a(modularCard);
            if (a2 != null) {
                a2.setImageDrawable(h);
                a2.setColorFilter(0);
                a2.setAlpha(1.0f);
            }
        }
        ((TextView) modularCard.findViewById(R.id.title)).setText(modularCard.getResources().getString(R.string.e100_reply_command));
        SmsResult smsResult2 = this.f261491b;
        if (smsResult2.f260553g == 101) {
            m154595d((ImageView) modularCard.findViewById(R.id.sender_icon));
        } else if (smsResult2.f260548a == null) {
            m154595d((ImageView) modularCard.findViewById(R.id.sender_icon));
        } else {
            new C93497c(modularCard.getResources(), (ImageView) modularCard.findViewById(R.id.sender_icon), true, false, false, false).execute(new Person[]{this.f261491b.f260548a});
        }
        if (!m154597f()) {
            Drawable h2 = m154599h(modularCard);
            if (h2 == null) {
                modularCard.findViewById(R.id.sender_source_badge).setVisibility(4);
            } else {
                ((ImageView) modularCard.findViewById(R.id.sender_source_badge)).setImageDrawable(h2);
            }
        }
        m154596e(modularCard.findViewById(R.id.modular_answer_background), 11061);
        m154596e(modularCard.findViewById(R.id.modular_answer_primary_action), 11062);
        modularCard.f256427k = false;
        return modularCard;
    }

    /* renamed from: b */
    public final void mo88142b(ViewGroup viewGroup) {
        if (m154597f()) {
            int dimensionPixelSize = this.f261490a.getResources().getDimensionPixelSize(R.dimen.qp_personal_answer_top_padding);
            int dimensionPixelSize2 = this.f261490a.getResources().getDimensionPixelSize(R.dimen.qp_personal_answer_horizontal_padding);
            viewGroup.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, viewGroup.getPaddingBottom());
        }
    }

    /* renamed from: c */
    public final View mo88143c() {
        return null;
    }

    /* renamed from: f */
    private final boolean m154597f() {
        C88507a aVar = this.f261490a.f239232a;
        aVar.getClass();
        return ((C93674e) aVar).mo82061x();
    }
}
