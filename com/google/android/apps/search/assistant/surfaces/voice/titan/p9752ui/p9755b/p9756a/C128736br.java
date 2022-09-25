package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.assistant.p1525l.p1526a.p1527a.C18409d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.br */
/* compiled from: PG */
final class C128736br {

    /* renamed from: a */
    public final C119904w f353894a;

    /* renamed from: b */
    public final String f353895b;

    /* renamed from: c */
    public final boolean f353896c;

    /* renamed from: d */
    public final C18409d f353897d;

    /* renamed from: e */
    public final boolean f353898e;

    /* renamed from: f */
    private final double f353899f;

    public C128736br(C119904w wVar, double d, String str, boolean z, C18409d dVar) {
        C69664n.m101061g(wVar, "assistantState");
        C69664n.m101061g(str, "transcriptionText");
        C69664n.m101061g(dVar, "voiceSession");
        this.f353894a = wVar;
        this.f353899f = d;
        this.f353895b = str;
        this.f353896c = z;
        this.f353897d = dVar;
        this.f353898e = d > 30.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128736br)) {
            return false;
        }
        C128736br brVar = (C128736br) obj;
        return C69664n.m101066l(this.f353894a, brVar.f353894a) && C69664n.m101066l(Double.valueOf(this.f353899f), Double.valueOf(brVar.f353899f)) && C69664n.m101066l(this.f353895b, brVar.f353895b) && this.f353896c == brVar.f353896c && C69664n.m101066l(this.f353897d, brVar.f353897d);
    }

    public final int hashCode() {
        int hashCode = this.f353894a.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f353899f);
        return (((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f353895b.hashCode()) * 31) + (this.f353896c ? 1 : 0)) * 31) + this.f353897d.hashCode();
    }

    public final String toString() {
        int i = this.f353894a.f333911a;
        double d = this.f353899f;
        String str = this.f353895b;
        boolean z = this.f353896c;
        C18409d dVar = this.f353897d;
        return "assistantState case: " + C119900s.m198774a(C119900s.m198775b(i)) + "\naverageAudioLevel: " + d + "\ntranscriptionText: " + str + "\nisGreetingEnabled: " + z + "\nvoiceSession: " + dVar;
    }
}
