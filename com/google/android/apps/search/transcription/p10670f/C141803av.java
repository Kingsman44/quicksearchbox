package com.google.android.apps.search.transcription.p10670f;

import android.content.Context;
import com.google.android.apps.search.transcription.p10665a.C141739e;
import com.google.android.apps.search.transcription.p10670f.p10671a.C141769a;
import com.google.android.apps.search.transcription.p10670f.p10671a.p10672a.C141780k;
import com.google.android.apps.search.transcription.p10670f.p10671a.p10672a.C141781l;
import com.google.android.apps.search.transcription.p10670f.p10674c.C141858c;
import com.google.android.apps.search.transcription.recording.AudioRecordingProvider;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.p2905a.C37324c;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37482d;
import com.google.android.libraries.search.p2904c.p2952o.p2955c.C37910a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.transcription.f.av */
/* compiled from: PG */
public final class C141803av {

    /* renamed from: a */
    public static final C59071e f384829a = C59071e.m91332i("com.google.android.apps.search.transcription.f.av");

    /* renamed from: b */
    public final Context f384830b;

    /* renamed from: c */
    public final C141739e f384831c;

    /* renamed from: d */
    public final C21370a f384832d;

    /* renamed from: e */
    public final C60888db f384833e;

    /* renamed from: f */
    public final C141851bs f384834f;

    /* renamed from: g */
    public final C141787af f384835g;

    /* renamed from: h */
    public final C141848bp f384836h;

    /* renamed from: i */
    public final C141769a f384837i;

    /* renamed from: j */
    private final C141847bo f384838j;

    public C141803av(Context context, C141739e eVar, C21370a aVar, C60888db dbVar, C141858c cVar, C141781l lVar, C141851bs bsVar, C141787af afVar, C141848bp bpVar) {
        C141847bo boVar;
        C141858c cVar2 = cVar;
        C141781l lVar2 = lVar;
        C141851bs bsVar2 = bsVar;
        this.f384830b = context;
        this.f384831c = eVar;
        this.f384832d = aVar;
        this.f384833e = dbVar;
        this.f384834f = bsVar2;
        this.f384835g = afVar;
        this.f384836h = bpVar;
        C141802au auVar = new C141802au(this);
        C37482d dVar = (C37482d) lVar2.f384761a.mo17428b();
        dVar.getClass();
        C69464a aVar2 = lVar2.f384762b;
        C37910a aVar3 = (C37910a) lVar2.f384763c.mo17428b();
        aVar3.getClass();
        AudioRecordingProvider audioRecordingProvider = (AudioRecordingProvider) lVar2.f384764d.mo17428b();
        audioRecordingProvider.getClass();
        C60888db dbVar2 = (C60888db) lVar2.f384765e.mo17428b();
        dbVar2.getClass();
        C60888db dbVar3 = (C60888db) lVar2.f384766f.mo17428b();
        dbVar3.getClass();
        C37324c cVar3 = (C37324c) lVar2.f384767g.mo17428b();
        cVar3.getClass();
        bsVar.getClass();
        this.f384837i = new C141780k(dVar, aVar2, aVar3, audioRecordingProvider, dbVar2, dbVar3, cVar3, bsVar, auVar);
        if (bsVar.mo116839u()) {
            boVar = cVar2.f384954a.mo116795a(bsVar2, auVar, auVar);
        } else {
            C141785ad adVar = cVar2.f384955b;
            C141795an anVar = (C141795an) adVar.f384783a.mo17428b();
            anVar.getClass();
            C141846bn bnVar = (C141846bn) adVar.f384784b.mo17428b();
            bnVar.getClass();
            C60888db dbVar4 = (C60888db) adVar.f384785c.mo17428b();
            dbVar4.getClass();
            bsVar.getClass();
            boVar = new C141784ac(anVar, bnVar, dbVar4, bsVar, auVar, auVar);
        }
        this.f384838j = boVar;
    }

    /* renamed from: d */
    public static boolean m230087d(C141921o oVar) {
        if (oVar.f385104a.size() == 0 || ((String) oVar.f385104a.get(0)).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo116754a() {
        this.f384837i.mo116720d();
        this.f384838j.mo116736a();
    }

    /* renamed from: b */
    public final void mo116755b() {
        this.f384837i.mo116721e();
        C141847bo boVar = this.f384838j;
        C141769a aVar = this.f384837i;
        Objects.requireNonNull(aVar);
        boVar.mo116738c(new C141796ao(aVar), this.f384837i.mo116718b(), Integer.bitCount(this.f384837i.mo116717a()));
    }

    /* renamed from: c */
    public final void mo116756c() {
        this.f384837i.mo116720d();
    }

    /* renamed from: e */
    public final boolean mo116757e() {
        return this.f384834f.mo116827i().isEmpty() && !this.f384834f.mo116837s();
    }
}
