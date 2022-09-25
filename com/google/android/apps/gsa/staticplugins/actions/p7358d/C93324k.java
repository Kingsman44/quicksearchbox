package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction;
import com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer;
import com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.p4152bb.p4153a.C54945ac;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54947ae;
import com.google.p4152bb.p4153a.C54948af;
import com.google.p4152bb.p4153a.C55265lz;
import com.google.p4152bb.p4153a.C55324od;
import com.google.p4152bb.p4153a.C55400qz;
import com.google.p4152bb.p4153a.C55421x;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.k */
/* compiled from: PG */
public final class C93324k extends C93329p {
    /* renamed from: e */
    public final /* synthetic */ Object mo81498e(VoiceInteractionAction voiceInteractionAction) {
        return voiceInteractionAction.f236039f;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo81499f(ModularAction modularAction) {
        C54945ac acVar = (C54945ac) C54946ad.f144531h.createBuilder();
        acVar.mo58885m(C55265lz.f145556m, modularAction.mo81218Y(true, true));
        C54947ae aeVar = (C54947ae) C54948af.f144541h.createBuilder();
        C55421x xVar = modularAction.f236107m;
        aeVar.copyOnWrite();
        C54948af afVar = (C54948af) aeVar.instance;
        afVar.f144544b = xVar.f146230cP;
        afVar.f144543a |= 1;
        acVar.copyOnWrite();
        C54946ad adVar = (C54946ad) acVar.instance;
        C54948af afVar2 = (C54948af) aeVar.build();
        afVar2.getClass();
        adVar.f144536d = afVar2;
        adVar.f144533a |= 16;
        return (C54946ad) acVar.build();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo81164i(ModularAnswer modularAnswer) {
        C54945ac acVar = (C54945ac) C54946ad.f144531h.createBuilder();
        acVar.mo58885m(C55324od.f145746k, modularAnswer.mo81151N());
        return (C54946ad) acVar.build();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Object mo81168m(VoiceDelightAction voiceDelightAction) {
        C54945ac acVar = (C54945ac) C54946ad.f144531h.createBuilder();
        C54947ae aeVar = (C54947ae) C54948af.f144541h.createBuilder();
        C55421x xVar = C55421x.VOICE_DELIGHT;
        aeVar.copyOnWrite();
        C54948af afVar = (C54948af) aeVar.instance;
        afVar.f144544b = xVar.f146230cP;
        afVar.f144543a |= 1;
        acVar.copyOnWrite();
        C54946ad adVar = (C54946ad) acVar.instance;
        C54948af afVar2 = (C54948af) aeVar.build();
        afVar2.getClass();
        adVar.f144536d = afVar2;
        adVar.f144533a |= 16;
        acVar.mo58885m(C55400qz.f145968g, voiceDelightAction.f236064g);
        return (C54946ad) acVar.build();
    }
}
