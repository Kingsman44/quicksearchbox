package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h;

import android.os.Bundle;
import com.google.android.apps.auto.p450a.p451a.C8898bp;
import com.google.android.gearhead.sdk.assistant.VoiceSessionConfig;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.d */
/* compiled from: PG */
public final class C11793d {
    /* renamed from: a */
    public static C8898bp m27457a(VoiceSessionConfig voiceSessionConfig) {
        Bundle bundle;
        if (voiceSessionConfig.f387130a != 4 || (bundle = voiceSessionConfig.f387137h) == null) {
            return null;
        }
        return C8898bp.m23511a(bundle.getInt("DIRECT_QUERY_TRIGGER_ID", 0));
    }

    /* renamed from: b */
    public static C37254c m27458b(C8898bp bpVar) {
        if (bpVar == null) {
            return null;
        }
        int ordinal = bpVar.ordinal();
        if (ordinal == 2) {
            return C37179a.f97567cg;
        }
        switch (ordinal) {
            case 16:
            case 17:
            case 18:
            case 19:
                return C37179a.f97568ch;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static String m27459c(C8898bp bpVar) {
        if (bpVar == null) {
            return null;
        }
        int ordinal = bpVar.ordinal();
        if (ordinal == 2) {
            return "and.gsa.fusion.dialer.nudge";
        }
        switch (ordinal) {
            case 16:
            case 17:
            case 18:
            case 19:
                return "and.gsa.fusion.launcher.shortcut";
            default:
                return null;
        }
    }
}
