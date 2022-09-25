package com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a;

import android.content.Intent;
import android.databinding.C0118a;
import com.google.android.apps.auto.sdk.C8971c;
import com.google.android.libraries.assistant.auto.jumpboost.p664b.p665a.C11447a;
import com.google.android.libraries.assistant.auto.jumpboost.p666c.p667a.C11449a;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.voiceplate.p892a.C13173b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.h.a.i */
/* compiled from: PG */
final class C11814i implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C11812g f37997a;

    public C11814i(C11812g gVar) {
        this.f37997a = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C13173b bVar2 = (C13173b) bVar;
        C11812g gVar = this.f37997a;
        if (!bVar2.mo20948a() && gVar.f37995s) {
            C59104x c = C11812g.f37977a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AsProjectedFP");
            C0118a.m108p(c, "onDismissFragmentHostEvent with the fragment already stopped.", 43486, C38505d.f101864b, 199433493);
        }
        if (gVar.f37983g.getHost() instanceof C11447a) {
            Object host = gVar.f37983g.getHost();
            host.getClass();
            C8971c cVar = ((C11447a) host).f37238e;
            cVar.getClass();
            boolean z = true;
            if (!gVar.f37995s && !cVar.mo118018H()) {
                z = false;
            }
            gVar.f37995s = z;
        }
        if (bVar2.mo20948a() || gVar.f37995s) {
            return C47392e.f123115a;
        }
        C11449a aVar = gVar.f37978b;
        Intent intent = new Intent("com.google.android.googlequicksearchbox.HOTWORD_STATUS_CHANGED");
        intent.putExtra("audio_active", false);
        intent.putExtra("audio_source_type", 2);
        intent.setPackage(aVar.f37239a.getPackageName());
        aVar.f37239a.sendBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
        C58976aa aaVar = C58975e.f156826a;
        gVar.f37984h.mo50445g(C46438d.m82809a(gVar.f37981e.mo20064b()), new C46436b((Object) null), gVar.f37988l);
        gVar.f37984h.mo50445g(C46438d.m82810b(gVar.f37981e.mo20066d()), new C46436b((Object) null), gVar.f37986j);
        return C47392e.f123115a;
    }
}
