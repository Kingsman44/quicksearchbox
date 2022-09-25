package com.google.android.libraries.assistant.auto.tng.common.p933q;

import android.content.Context;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.text.format.DateUtils;
import com.google.common.base.C58838bb;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.u */
/* compiled from: PG */
public final class C13337u {
    /* renamed from: a */
    public static String m29582a(Context context, long j) {
        if (DateUtils.isToday(j)) {
            return DateUtils.formatDateTime(context, j, 1);
        }
        return DateUtils.getRelativeDateTimeString(context, j, 86400000, 172800000, 16).toString();
    }

    /* renamed from: b */
    public static String m29583b(long j) {
        C58838bb.m90868c(j >= 0);
        Duration ofSeconds = Duration.ofSeconds(j);
        MeasureFormat instance = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.WIDE);
        if (ofSeconds.toHoursPart() > 0) {
            return instance.formatMeasures(new Measure[]{new Measure(Integer.valueOf(ofSeconds.toHoursPart()), MeasureUnit.HOUR), new Measure(Integer.valueOf(ofSeconds.toMinutesPart()), MeasureUnit.MINUTE), new Measure(Integer.valueOf(ofSeconds.toSecondsPart()), MeasureUnit.SECOND)});
        }
        return instance.formatMeasures(new Measure[]{new Measure(Integer.valueOf(ofSeconds.toMinutesPart()), MeasureUnit.MINUTE), new Measure(Integer.valueOf(ofSeconds.toSecondsPart()), MeasureUnit.SECOND)});
    }
}
