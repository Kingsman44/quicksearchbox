package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.app.FragmentManager;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88519m;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ep */
/* compiled from: PG */
public final class C93646ep extends C93641ek {
    public C93646ep(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    /* renamed from: b */
    private final CharSequence m154515b(String str) {
        SpannableString spannableString = new SpannableString(str);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.fluid_actions_display_subtext_size);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                if (i > i2) {
                    spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), i2, i, 0);
                }
                i2 = i + 1;
            }
            i++;
        }
        if (i > i2) {
            spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), i2, i, 0);
        }
        return spannableString;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo88095a() {
        this.f261451q.mo87961i(this.f261447m, "vdurationpicker_tag");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo88097c() {
        return false;
    }

    /* renamed from: f */
    public final void mo87732f() {
        C88519m mVar;
        super.mo87732f();
        TimeDurationArgument timeDurationArgument = (TimeDurationArgument) this.f261447m;
        if (timeDurationArgument.mo81263C()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(((Long) timeDurationArgument.f236203n).longValue());
            String c = C89407a.m145420c(mo88127l(), seconds, false);
            String c2 = C89407a.m145420c(mo88127l(), seconds, true);
            CharSequence b = m154515b(c.toUpperCase(Locale.US));
            this.f261397b.setVisibility(0);
            this.f261397b.setText(b);
            this.f261398c.setVisibility(4);
            this.f261397b.setContentDescription(c2);
        }
        FragmentManager c3 = this.f261451q.mo87959c();
        if (c3 != null && (mVar = (C88519m) c3.findFragmentByTag("vdurationpicker_tag")) != null) {
            mVar.f239239d = new C93645eo(this);
        }
    }

    /* renamed from: k */
    public final boolean mo88110k() {
        return false;
    }

    /* renamed from: m */
    public final CharSequence mo88098m() {
        return m154515b(mo88127l().getString(R.string.time_duration_hours_minutes_seconds, new Object[]{0, 0, 0}).toUpperCase(Locale.US));
    }
}
