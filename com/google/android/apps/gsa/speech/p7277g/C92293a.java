package com.google.android.apps.gsa.speech.p7277g;

import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7277g.p7278a.C92294a;
import com.google.android.apps.gsa.speech.p7277g.p7278a.C92295b;
import com.google.android.apps.gsa.speech.p7277g.p7278a.C92296c;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62940bt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.g.a */
/* compiled from: PG */
final class C92293a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f257365a;

    /* renamed from: b */
    final /* synthetic */ C92249k f257366b;

    /* renamed from: c */
    final /* synthetic */ C118561t f257367c;

    /* renamed from: d */
    final /* synthetic */ boolean f257368d;

    /* renamed from: e */
    final /* synthetic */ long f257369e;

    public C92293a(String str, C92249k kVar, C118561t tVar, boolean z, long j) {
        this.f257365a = str;
        this.f257366b = kVar;
        this.f257367c = tVar;
        this.f257368d = z;
        this.f257369e = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C92297b.f257376a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GrammarCompilationSvcCt");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(12432)).mo56386p("Error when checking availability of SODA recognition context task!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        if (!booleanValue) {
            String str = this.f257365a;
            C92249k kVar = this.f257366b;
            C118561t tVar = this.f257367c;
            boolean z = this.f257368d;
            long j = this.f257369e;
            C59071e eVar = C92297b.f257376a;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 2;
            agVar.f328823c = j;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 8;
            agVar2.f328825e = !z;
            C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
            C62940bt btVar = C92296c.f257375a;
            C92294a aVar = (C92294a) C92295b.f257370d.createBuilder();
            if (str != null) {
                aVar.copyOnWrite();
                C92295b bVar = (C92295b) aVar.instance;
                bVar.f257372a = 1 | bVar.f257372a;
                bVar.f257373b = str;
            }
            if (kVar != null) {
                String str2 = kVar.f257209i;
                aVar.copyOnWrite();
                C92295b bVar2 = (C92295b) aVar.instance;
                str2.getClass();
                bVar2.f257372a |= 2;
                bVar2.f257374c = str2;
            }
            ajVar.mo58885m(btVar, (C92295b) aVar.build());
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            C118476ak akVar = (C118476ak) ajVar.build();
            akVar.getClass();
            agVar3.f328827g = akVar;
            agVar3.f328821a |= 32;
            tVar.mo103751b(C118522by.SPEECH_GRAMMAR_COMPILER, (C118472ag) afVar.build());
        } else if (booleanValue2) {
            C118561t tVar2 = this.f257367c;
            boolean z2 = this.f257368d;
            long j2 = this.f257369e;
            C59104x b = C92297b.f257376a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GrammarCompilationSvcCt");
            ((C59052c) ((C59052c) b).mo56372aa(12435)).mo56386p("#startSodaGrammarUpdateTask");
            C118471af afVar2 = (C118471af) C118472ag.f328819i.createBuilder();
            afVar2.copyOnWrite();
            C118472ag agVar4 = (C118472ag) afVar2.instance;
            agVar4.f328821a |= 2;
            agVar4.f328823c = j2;
            afVar2.copyOnWrite();
            C118472ag agVar5 = (C118472ag) afVar2.instance;
            agVar5.f328821a |= 8;
            agVar5.f328825e = !z2;
            tVar2.mo103751b(C118522by.UPDATE_SODA_RECOGNITION_CONTEXT, (C118472ag) afVar2.build());
        }
    }
}
