package com.google.android.apps.gsa.nga.engine.p6144ui.p6148c;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.google.android.apps.gsa.nga.engine.ax.d.a;
import com.google.android.apps.gsa.nga.engine.p5961at.C75045b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83335x;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.c.g */
/* compiled from: PG */
public final class C78097g implements C83335x {

    /* renamed from: a */
    public static final int f215085a = Color.parseColor("#757575");

    /* renamed from: b */
    public static final int f215086b = Color.parseColor("#EF9B0F");

    /* renamed from: c */
    public static final C58528ij f215087c = C58528ij.m90015O(C82887ec.ACTIVE_STATE, C82887ec.HARDWARE_SENSOR, C82887ec.GESTURE_RECOGNIZER, C82887ec.QUERY_SENSITIVE, C82887ec.DELIBERATE_INPUT_DETECTOR_SENSITIVE, C82887ec.REWRITERS, C82887ec.FULFILLMENT_RESULT_SENSITIVE, C82887ec.EXECUTION_SENSITIVE, C82887ec.END_OF_USER_SPEECH, C82887ec.SYSTEM_HEALTH, C82887ec.JINN);

    /* renamed from: d */
    public final C78091a f215088d;

    /* renamed from: e */
    public final C75045b f215089e;

    /* renamed from: f */
    public final a f215090f;

    /* renamed from: g */
    public int f215091g = 1;

    /* renamed from: h */
    private final C22871g f215092h;

    public C78097g(Context context, C22871g gVar, C75045b bVar, a aVar) {
        this.f215092h = gVar;
        this.f215088d = new C78091a(context);
        this.f215089e = bVar;
        this.f215090f = aVar;
    }

    /* renamed from: b */
    public static SpannableStringBuilder m125402b(CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String valueOf = String.valueOf(charSequence);
        SpannableString g = m125405g(String.valueOf(valueOf).concat(": "), new StyleSpan(1));
        int i = f215085a;
        spannableStringBuilder.append(m125404f(g, i));
        if (charSequence2 != null) {
            if (charSequence2 instanceof SpannableString) {
                spannableStringBuilder.append(charSequence2);
            } else {
                spannableStringBuilder.append(m125404f(charSequence2, i));
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public static String m125403c(long j) {
        return new SimpleDateFormat("HH:mm:ss.SSS", Locale.US).format(new Date(j));
    }

    /* renamed from: f */
    private static SpannableString m125404f(CharSequence charSequence, int i) {
        return m125405g(charSequence, new ForegroundColorSpan(i));
    }

    /* renamed from: g */
    private static SpannableString m125405g(CharSequence charSequence, Object obj) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(obj, 0, charSequence.length(), 256);
        return spannableString;
    }

    /* renamed from: a */
    public final void mo73068a(C82889ee eeVar) {
        this.f215092h.mo28212l("[NGA] DebugHistoryEventPageController.onNewEventLogged", new C78096f(this, eeVar));
    }

    /* renamed from: d */
    public final void mo73069d(CharSequence charSequence) {
        this.f215092h.mo28212l("[NGA] DebugHistoryEventPageController.addString", new C78092b(this, charSequence));
    }

    /* renamed from: e */
    public final void mo73070e(CharSequence charSequence, CharSequence charSequence2, long j) {
        mo73069d(m125402b(charSequence, charSequence2).append(" ").append(m125404f(String.format("[%s]", new Object[]{m125403c(j)}), -16711936)));
    }
}
