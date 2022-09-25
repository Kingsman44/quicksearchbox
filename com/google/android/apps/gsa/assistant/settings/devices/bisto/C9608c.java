package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import androidx.preference.SeekBarPreference;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.c */
/* compiled from: PG */
public final /* synthetic */ class C9608c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C9624g f33217a;

    /* renamed from: b */
    public final /* synthetic */ SeekBarPreference f33218b;

    /* renamed from: c */
    public final /* synthetic */ int f33219c;

    /* renamed from: d */
    public final /* synthetic */ int f33220d;

    public /* synthetic */ C9608c(C9624g gVar, SeekBarPreference seekBarPreference, int i, int i2) {
        this.f33217a = gVar;
        this.f33218b = seekBarPreference;
        this.f33219c = i;
        this.f33220d = i2;
    }

    public final void run() {
        C9624g gVar = this.f33217a;
        SeekBarPreference seekBarPreference = this.f33218b;
        int i = this.f33219c;
        int i2 = this.f33220d;
        seekBarPreference.mo8385j(i, true);
        seekBarPreference.mo8347N(gVar.mo17797h(i2, Integer.valueOf(i * 50)));
    }
}
