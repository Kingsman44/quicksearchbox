package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* compiled from: PG */
public final class EnrollmentHelper {

    /* renamed from: a */
    public final Resources f257596a;

    /* renamed from: b */
    private final C92371d f257597b;

    /* compiled from: PG */
    class URLSpanNoUnderline extends URLSpan {
        public URLSpanNoUnderline(String str) {
            super(str);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(EnrollmentHelper.this.f257596a.getColor(R.color.hotword_enrollment_primary_action_text));
        }
    }

    public EnrollmentHelper(C92371d dVar, Resources resources) {
        this.f257597b = dVar;
        this.f257596a = resources;
    }

    /* renamed from: a */
    public final Spannable mo87038a(String str) {
        Spannable spannable = (Spannable) Html.fromHtml(str);
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            int spanFlags = spannable.getSpanFlags(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
        }
        return spannable;
    }

    /* renamed from: b */
    public final void mo87039b(int i, C9439b bVar, long j, C90584f fVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164109aP = bVar.f32835aq;
        ufVar2.f164251f |= 16;
        String b = C39191a.m68623b(j);
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar3.f164093a |= 4;
        ufVar3.f164259n = b;
        boolean z = this.f257597b.f257556a;
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        ufVar4.f164254i |= 8;
        ufVar4.f164163bQ = z;
        boolean h = this.f257597b.f257558c.mo56113h();
        tzVar.copyOnWrite();
        C60555uf ufVar5 = (C60555uf) tzVar.instance;
        ufVar5.f164254i |= 16384;
        ufVar5.f164167bU = h;
        tzVar.copyOnWrite();
        C60555uf ufVar6 = (C60555uf) tzVar.instance;
        ufVar6.f164160bN = fVar.f253255d;
        ufVar6.f164253h |= 536870912;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
