package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92379c;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49891cv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.n */
/* compiled from: PG */
public final class C92408n {

    /* renamed from: a */
    public static final C59071e f257704a = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.enrollmentutils.n");

    /* renamed from: a */
    public static Intent m151739a(C92381e eVar) {
        Intent intent = new Intent();
        intent.putExtra("enrollment_errors_key", eVar);
        return intent;
    }

    /* renamed from: b */
    public static ClientConfig m151740b() {
        C88486g gVar = new C88486g(ClientConfig.f236948a);
        gVar.f239201c = amo.SPEAKER_ID_ENROLLMENT;
        gVar.f239204f = "assistant_settings";
        return new ClientConfig(gVar);
    }

    /* renamed from: c */
    public static String m151741c(List list) {
        int i;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C49879cj cjVar = (C49879cj) it.next();
            if ((cjVar.f129630a & 256) != 0) {
                C49891cv cvVar = cjVar.f129639j;
                if (cvVar == null) {
                    cvVar = C49891cv.f129647N;
                }
                String str = cvVar.f129669g;
                if (!str.isEmpty()) {
                    hashMap.put(str, Integer.valueOf(((Integer) Map.EL.getOrDefault(hashMap, str, 0)).intValue() + 1));
                }
            }
        }
        if (!hashMap.isEmpty()) {
            String str2 = null;
            for (String str3 : hashMap.keySet()) {
                int intValue = ((Integer) hashMap.get(str3)).intValue();
                int i2 = intValue > i ? intValue : i;
                if (intValue > i) {
                    str2 = str3;
                }
                i = i2;
            }
            if (str2 != null) {
                ((C59052c) ((C59052c) f257704a.mo56224b()).mo56372aa(12518)).mo56389s("Enrollment locale for retraining: %s", str2);
                return str2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static StringBuilder m151742d(C92380d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Enrollment Config:  Style-");
        int a = C92379c.m151713a(dVar.f257603b);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        sb.append(" AudioHistorySetting-");
        sb.append(dVar.f257604c);
        sb.append(" IsOpaHotwordAvailable-");
        sb.append(dVar.f257605d);
        sb.append(" WasHotwordDetectorEnabled-");
        sb.append(dVar.f257606e);
        sb.append(" FirstTimePhoneEnrollmentForOkHeyModel-");
        sb.append(dVar.f257607f);
        return sb;
    }

    /* renamed from: e */
    public static void m151743e(C92518d dVar, C91097g gVar, EventForDump eventForDump) {
        if (dVar != null) {
            dVar.mo87273a(new C92407m(dVar, gVar, eventForDump));
        }
    }

    /* renamed from: f */
    public static boolean m151744f(C90021c cVar, boolean z) {
        return cVar.mo79746e(C90082eg.f250016cZ) || !z;
    }

    /* renamed from: g */
    public static boolean m151745g(boolean z, boolean z2, C92371d dVar) {
        if (z) {
            return z2 || dVar.f257558c.mo56113h();
        }
        return false;
    }
}
