package com.google.android.apps.gsa.speech.settingsui.hotword.base;

import android.preference.Preference;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92557j;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.base.f */
/* compiled from: PG */
public final class C92607f {

    /* renamed from: a */
    private static final C58495hd f258450a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("hotwordDetector", 1);
        gzVar.mo55429h("voiceEverywhereEnabled", 2);
        gzVar.mo55429h("alwaysOnHotword", 3);
        gzVar.mo55429h("opa_hotword_enabled", 4);
        gzVar.mo55429h("hotword_from_lock_screen", 5);
        gzVar.mo55429h("hotword_from_lock_screen_2", 6);
        gzVar.mo55429h("lockscreen_personal_response", 7);
        gzVar.mo55429h("hotwordInNav", 8);
        gzVar.mo55429h("speaker_id_retrain_voice_model", 9);
        gzVar.mo55429h("speaker_id_delete_voice_model", 10);
        gzVar.mo55429h("pref_assistant_speaker_id_enroll", 11);
        f258450a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static int m152511a(Preference preference) {
        return m152513c(preference.getKey());
    }

    /* renamed from: b */
    public static int m152512b(C92557j jVar) {
        return m152513c(jVar.mo87330f());
    }

    /* renamed from: c */
    public static int m152513c(String str) {
        C58495hd hdVar = f258450a;
        if (hdVar.containsKey(str)) {
            return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}[((Integer) hdVar.get(str)).intValue()];
        }
        return 1;
    }
}
