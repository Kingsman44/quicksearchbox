package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.d */
/* compiled from: PG */
public final /* synthetic */ class C9621d implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C9624g f33309a;

    /* renamed from: b */
    public final /* synthetic */ int f33310b;

    /* renamed from: c */
    public final /* synthetic */ SeekBarPreference f33311c;

    /* renamed from: d */
    public final /* synthetic */ int f33312d;

    public /* synthetic */ C9621d(C9624g gVar, int i, SeekBarPreference seekBarPreference, int i2) {
        this.f33309a = gVar;
        this.f33310b = i;
        this.f33311c = seekBarPreference;
        this.f33312d = i2;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C9624g gVar = this.f33309a;
        int i = this.f33310b;
        SeekBarPreference seekBarPreference = this.f33311c;
        int i2 = this.f33312d;
        synchronized (gVar) {
            int parseInt = Integer.parseInt(String.valueOf(obj));
            Map map = gVar.f33318l;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(parseInt * 50);
            map.put(valueOf, valueOf2);
            gVar.f33316j.mo83376R(gVar.f33317k, gVar.f33318l);
            seekBarPreference.mo8347N(gVar.mo17797h(i2, valueOf2));
        }
        return true;
    }
}
