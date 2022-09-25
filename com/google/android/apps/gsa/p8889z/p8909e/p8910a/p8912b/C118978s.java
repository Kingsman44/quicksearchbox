package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b;

import android.text.Annotation;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C60418pm;
import com.google.common.p4552o.C60420po;
import com.google.common.p4552o.C60421pp;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.z.e.a.b.s */
/* compiled from: PG */
public final class C118978s {
    /* renamed from: a */
    public static Pair m197518a(C58485gu guVar, String str) {
        guVar.size();
        if (guVar.isEmpty()) {
            return Pair.create((Object) null, (Object) null);
        }
        SpannedString valueOf = SpannedString.valueOf((CharSequence) guVar.get(0));
        if (!TextUtils.isEmpty(str)) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(valueOf);
            valueOf2.setSpan(new Annotation("recognizerLanguage", str), 0, valueOf.length(), 0);
            valueOf = new SpannedString(valueOf2);
        }
        C58480gp e = C58485gu.m89837e();
        for (int i = 1; i < guVar.size(); i++) {
            e.mo55395g((String) guVar.get(i));
        }
        return Pair.create(valueOf, e.mo55394f());
    }

    /* renamed from: b */
    public static C60421pp m197519b(C67438ag agVar, long j, boolean z) {
        long j2;
        C60418pm pmVar = (C60418pm) C60421pp.f163510e.createBuilder();
        C67442ak akVar = agVar.f183263f;
        if (akVar == null) {
            akVar = C67442ak.f183276i;
        }
        if (z && (agVar.f183258a & 4096) != 0) {
            j2 = agVar.f183266i;
            C60420po poVar = C60420po.S3_TRUE_EOQ;
            pmVar.copyOnWrite();
            C60421pp ppVar = (C60421pp) pmVar.instance;
            ppVar.f163514c = poVar.f163509l;
            ppVar.f163512a |= 2;
        } else if (akVar.f183281d.size() <= 0 || (((C67468p) akVar.f183281d.get(0)).f183366a & 8192) == 0) {
            j2 = TimeUnit.MICROSECONDS.toMillis(akVar.f183280c);
            C60420po poVar2 = C60420po.S3_ENDPOINTER_FALLBACK;
            pmVar.copyOnWrite();
            C60421pp ppVar2 = (C60421pp) pmVar.instance;
            ppVar2.f163514c = poVar2.f163509l;
            ppVar2.f163512a |= 2;
        } else {
            j2 = TimeUnit.MICROSECONDS.toMillis((long) ((C67468p) akVar.f183281d.get(0)).f183370e);
            C60420po poVar3 = C60420po.S3_NATIVE;
            pmVar.copyOnWrite();
            C60421pp ppVar3 = (C60421pp) pmVar.instance;
            ppVar3.f163514c = poVar3.f163509l;
            ppVar3.f163512a |= 2;
        }
        if ((akVar.f183278a & 256) != 0 && akVar.f183283f) {
            j2 = Math.max(j2 - j, 0);
        }
        pmVar.copyOnWrite();
        C60421pp ppVar4 = (C60421pp) pmVar.instance;
        ppVar4.f163512a |= 1;
        ppVar4.f163513b = j2;
        return (C60421pp) pmVar.build();
    }
}
