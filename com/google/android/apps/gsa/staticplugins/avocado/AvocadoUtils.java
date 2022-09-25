package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import com.google.common.p4575r.C60761r;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67224bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
public final class AvocadoUtils {

    /* renamed from: a */
    public static final C59071e f263017a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils");

    /* compiled from: PG */
    class URLSpanNoUnderline extends URLSpan {

        /* renamed from: a */
        private final int f263018a;

        public URLSpanNoUnderline(String str, int i) {
            super(str);
            this.f263018a = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f263018a);
        }
    }

    /* renamed from: a */
    public static VibrationEffect m155377a(C90021c cVar, boolean z) {
        C58485gu guVar;
        C58485gu guVar2;
        if (z) {
            guVar = cVar.mo79750p(C90082eg.f249951bN);
        } else {
            guVar = cVar.mo79750p(C90082eg.f249949bL);
        }
        if (z) {
            guVar2 = cVar.mo79749o(C90082eg.f249950bM);
        } else {
            guVar2 = cVar.mo79749o(C90082eg.f249948bK);
        }
        return VibrationEffect.createWaveform(C60761r.m92761g(guVar), C60757n.m92752m(guVar2), -1);
    }

    /* renamed from: b */
    public static Spannable m155378b(String str, int i) {
        Spannable spannable = (Spannable) Html.fromHtml(str);
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            int spanFlags = spannable.getSpanFlags(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL(), i), spanStart, spanEnd, spanFlags);
        }
        return spannable;
    }

    /* renamed from: c */
    public static C94327n m155379c(C94303fa faVar) {
        C94326m mVar = (C94326m) C94327n.f263598g.createBuilder();
        mVar.copyOnWrite();
        C94327n nVar = (C94327n) mVar.instance;
        nVar.f263603e = faVar.f263529l;
        nVar.f263600a |= 2;
        return (C94327n) mVar.build();
    }

    /* renamed from: d */
    public static C58485gu m155380d(C83923j jVar) {
        ArrayList arrayList = new ArrayList();
        for (C83917d dVar : jVar.f228573b) {
            arrayList.add(dVar.f228555b);
        }
        return C58485gu.m89842j(arrayList);
    }

    /* renamed from: e */
    public static C58495hd m155381e(Collection collection) {
        C58490gz gzVar = new C58490gz(4);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C83917d dVar = (C83917d) it.next();
            gzVar.mo55429h(dVar.f228555b, C49875cf.m85755a(dVar.f228562i));
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: f */
    public static String m155382f(C66611ci ciVar) {
        Object obj;
        StringBuilder sb = new StringBuilder("S3Response[");
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        int i = a.f181205e;
        sb.append("status=" + i);
        C66610ch a2 = C66610ch.m97260a(ciVar.f181209b);
        if (a2 == null) {
            a2 = C66610ch.IN_PROGRESS;
        }
        if (a2 == C66610ch.DONE_ERROR) {
            int i2 = ciVar.f181210c;
            sb.append(",errorCode=" + i2);
            sb.append(",errorDescription=".concat(String.valueOf(ciVar.f181211d)));
        }
        sb.append(",");
        C62940bt r1 = C62942bv.checkIsLite(C67224bo.f182701c);
        ciVar.mo58887l(r1);
        if (ciVar.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(C67224bo.f182701c);
            ciVar.mo58887l(r12);
            Object l = ciVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l);
            }
            sb.append("WriterResponse[versionInfo: ");
            sb.append(((C67224bo) obj).f182703a);
            sb.append("]");
        }
        sb.append("]\n");
        return sb.toString();
    }

    /* renamed from: g */
    public static void m155383g(Vibrator vibrator, VibrationEffect vibrationEffect) {
        if (vibrator != null && vibrator.hasVibrator() && vibrationEffect != null) {
            vibrator.vibrate(vibrationEffect);
        }
    }
}
