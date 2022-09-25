package com.google.assistant.p3838ao.p3839a.p3842c;

import android.content.Intent;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.C49693s;
import com.google.assistant.p3838ao.p3839a.p3845e.C49531ao;
import com.google.assistant.p3838ao.p3839a.p3845e.C49534ar;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.c.au */
/* compiled from: PG */
public final class C49466au {
    /* renamed from: a */
    public static C49693s m85522a(String str, String str2, C49692r rVar) {
        String s = rVar.mo53332s(R.drawable.quantum_ic_settings_grey600_18);
        C49693s e = C49681l.m85672e(str2, str);
        C49531ao aoVar = (C49531ao) C49534ar.f127808c.createBuilder();
        aoVar.copyOnWrite();
        C49534ar arVar = (C49534ar) aoVar.instance;
        s.getClass();
        arVar.f127810a = 1;
        arVar.f127811b = s;
        e.f128268l = Optional.ofNullable((C49534ar) aoVar.build());
        return e;
    }

    /* renamed from: b */
    public static C49693s m85523b(C49692r rVar) {
        return m85522a(rVar.mo53333t(R.string.nga_suggestion_chip_open_sound_settings, new Object[0]), m85524c("android.settings.SOUND_SETTINGS"), rVar);
    }

    /* renamed from: c */
    public static String m85524c(String str) {
        return new Intent(str).toUri(0);
    }
}
