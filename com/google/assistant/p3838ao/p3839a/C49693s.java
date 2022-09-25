package com.google.assistant.p3838ao.p3839a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3838ao.p3839a.p3845e.C49534ar;
import com.google.assistant.p3838ao.p3839a.p3845e.C49538av;
import com.google.assistant.p3838ao.p3839a.p3845e.C49564bu;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.s */
/* compiled from: PG */
public final class C49693s extends C49503d {

    /* renamed from: a */
    public Optional f128265a = Optional.empty();

    /* renamed from: j */
    public Optional f128266j = Optional.empty();

    /* renamed from: k */
    public Optional f128267k = Optional.empty();

    /* renamed from: l */
    public Optional f128268l = Optional.empty();

    /* renamed from: m */
    public int f128269m = 0;

    /* renamed from: n */
    public C49564bu f128270n = null;

    /* renamed from: a */
    public final int mo53267a() {
        return 1;
    }

    /* renamed from: b */
    public final void mo53334b(C49538av avVar) {
        if ((avVar.f127821a & 1) != 0) {
            this.f128265a = Optional.ofNullable(avVar.f127822b);
        }
        if ((avVar.f127821a & 2) != 0) {
            this.f128266j = Optional.ofNullable(avVar.f127823c);
        }
        if ((avVar.f127821a & 32) != 0) {
            C49534ar arVar = avVar.f127825e;
            if (arVar == null) {
                arVar = C49534ar.f127808c;
            }
            this.f128268l = Optional.ofNullable(arVar);
        }
        if ((avVar.f127821a & 16) != 0) {
            this.f128269m = avVar.f127824d;
        }
    }

    public final String toString() {
        return (String) this.f128265a.orElse(BuildConfig.FLAVOR);
    }
}
