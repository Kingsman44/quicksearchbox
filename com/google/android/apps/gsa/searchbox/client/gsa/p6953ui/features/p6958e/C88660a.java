package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.p6958e;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.google.android.apps.gsa.searchbox.p6960ui.C88706g;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.util.CorrectionSpan;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41705e;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.base.C58838bb;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.e.a */
/* compiled from: PG */
public final class C88660a implements C89200e, C41705e {

    /* renamed from: b */
    private static final Pattern f239719b = Pattern.compile("<sc>(.*?)</sc>");

    /* renamed from: c */
    private static final Pattern f239720c = Pattern.compile("<se>(.*?)</se>");

    /* renamed from: a */
    boolean f239721a = false;

    /* renamed from: d */
    private C88706g f239722d;

    /* renamed from: a */
    public final int mo44295a() {
        return 1;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239722d = ((C88715p) obj).f239940l;
    }

    /* renamed from: hM */
    public final void mo44296hM(Response response) {
        C54231at atVar = response.f108868h;
        String str = atVar.f142367g;
        String str2 = atVar.f142368h;
        int i = 0;
        if (!str.isEmpty() && !str2.isEmpty()) {
            this.f239721a = true;
            Matcher matcher = f239719b.matcher(str);
            Matcher matcher2 = f239720c.matcher(str2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(response.f108861a);
            while (matcher2.find()) {
                String group = matcher2.group(1);
                group.getClass();
                int start = matcher2.start() - i;
                int length = group.length() + start;
                i += (matcher2.end() - matcher2.start()) - group.length();
                C58838bb.m90883r(matcher.find());
                String group2 = matcher.group(1);
                group2.getClass();
                CorrectionSpan correctionSpan = new CorrectionSpan(group2);
                if (length <= response.f108861a.length()) {
                    spannableStringBuilder.setSpan(correctionSpan, start, length, 33);
                } else {
                    return;
                }
            }
            this.f239722d.mo82431g(spannableStringBuilder);
        } else if (this.f239721a) {
            this.f239722d.mo82431g((Spanned) null);
            this.f239721a = false;
        }
    }
}
