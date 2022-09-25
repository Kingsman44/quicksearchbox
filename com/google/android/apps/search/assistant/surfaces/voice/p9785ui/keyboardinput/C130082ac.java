package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.alh;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.ac */
/* compiled from: PG */
public final class C130082ac {

    /* renamed from: a */
    public static final /* synthetic */ int f356693a = 0;

    /* renamed from: b */
    private static final Pattern f356694b = Pattern.compile("<(/?b)>");

    /* renamed from: c */
    private static final MetricAffectingSpan f356695c = new C130081ab();

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        if (r1 != 83) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        if (new com.google.protobuf.C62963cj(r4.f356685e, com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130078w.f356678f).contains(com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL) != false) goto L_0x0063;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m212377a(com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130078w r4) {
        /*
            com.google.at.h.d.a.aq r0 = r4.f356686g
            if (r0 != 0) goto L_0x0006
            com.google.at.h.d.a.aq r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0006:
            com.google.at.h.d.a.ae r0 = r0.f142334f
            if (r0 != 0) goto L_0x000c
            com.google.at.h.d.a.ae r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x000c:
            int r0 = r0.f142290a
            r0 = r0 & 2
            r1 = 1
            r2 = -1
            if (r0 == 0) goto L_0x0031
            com.google.at.h.d.a.aq r0 = r4.f356686g
            if (r0 != 0) goto L_0x001a
            com.google.at.h.d.a.aq r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x001a:
            com.google.at.h.d.a.ae r0 = r0.f142334f
            if (r0 != 0) goto L_0x0020
            com.google.at.h.d.a.ae r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0020:
            int r0 = r0.f142292c
            int r0 = com.google.protos.p4948ba.C64380j.m96396a(r0)
            if (r0 != 0) goto L_0x0029
            r0 = 1
        L_0x0029:
            int r0 = m212380d(r0)
            if (r0 != r2) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            int r0 = r4.f356684d
            int r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130077v.m212376a(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = r0
        L_0x003b:
            int r1 = r1 + r2
            r0 = 44
            if (r1 == 0) goto L_0x0069
            r2 = 5
            if (r1 == r2) goto L_0x0066
            r2 = 35
            r3 = 28
            if (r1 == r2) goto L_0x0063
            r2 = 46
            if (r1 == r2) goto L_0x0052
            r4 = 83
            if (r1 == r4) goto L_0x0066
            goto L_0x007c
        L_0x0052:
            com.google.protobuf.cj r1 = new com.google.protobuf.cj
            com.google.protobuf.ch r4 = r4.f356685e
            com.google.protobuf.ci r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130078w.f356678f
            r1.<init>(r4, r2)
            com.google.protos.ba.a.b r4 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x007c
        L_0x0063:
            r0 = 28
            goto L_0x007c
        L_0x0066:
            r0 = 8
            goto L_0x007c
        L_0x0069:
            com.google.protobuf.cj r1 = new com.google.protobuf.cj
            com.google.protobuf.ch r4 = r4.f356685e
            com.google.protobuf.ci r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130078w.f356678f
            r1.<init>(r4, r2)
            com.google.protos.ba.a.b r4 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_TRENDS
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x007c
            r0 = 34
        L_0x007c:
            int r4 = m212380d(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130082ac.m212377a(com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.w):int");
    }

    /* renamed from: b */
    public static Spanned m212378b(Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = f356694b.matcher(str);
        int i = 0;
        boolean z = false;
        while (matcher.find()) {
            m212381e(context, spannableStringBuilder, str.substring(i, matcher.start()), z);
            i = matcher.end();
            z = !z;
        }
        m212381e(context, spannableStringBuilder, str.substring(i), z);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public static Spanned m212379c(Context context, alf alf) {
        String str = alf.f135317b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C58485gu guVar = (C58485gu) Collection.EL.stream(alf.f135318c).filter(C130117z.f356773a).sorted(Comparator.CC.comparingInt(C130080aa.f356692a)).collect(C58370cn.f155946a);
        int size = guVar.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            alh alh = (alh) guVar.get(i);
            int i3 = alh.f135322b;
            int i4 = alh.f135323c;
            m212381e(context, spannableStringBuilder, str.substring(i2, i3), false);
            m212381e(context, spannableStringBuilder, str.substring(i3, i4), true);
            i++;
            i2 = i4;
        }
        m212381e(context, spannableStringBuilder, str.substring(i2), false);
        return spannableStringBuilder;
    }

    /* renamed from: d */
    public static int m212380d(int i) {
        int i2 = i - 1;
        if (i2 == 7) {
            return R.drawable.quantum_gm_ic_public_vd_theme_24;
        }
        if (i2 == 27) {
            return R.drawable.quantum_ic_access_time_vd_theme_24;
        }
        if (i2 == 33) {
            return R.drawable.quantum_gm_ic_trending_up_vd_theme_24;
        }
        if (i2 != 43) {
            return -1;
        }
        return R.drawable.quantum_ic_search_vd_theme_24;
    }

    /* renamed from: e */
    private static void m212381e(Context context, SpannableStringBuilder spannableStringBuilder, String str, boolean z) {
        if (!str.isEmpty()) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(str);
            int a = C19391a.m36980a(context, R.attr.assistantOnBackground);
            int a2 = C19391a.m36980a(context, R.attr.colorOutline);
            if (true != z) {
                a = a2;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(a), length, spannableStringBuilder.length(), 0);
            spannableStringBuilder.setSpan(f356695c, length, spannableStringBuilder.length(), 0);
        }
    }
}
