package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.p8889z.p8917f.C119071a;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88206tb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.p4152bb.p4153a.C54946ad;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.ai */
/* compiled from: PG */
final class C93303ai extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C88206tb f260192a;

    /* renamed from: b */
    final /* synthetic */ Query f260193b;

    /* renamed from: c */
    final /* synthetic */ C93304aj f260194c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93303ai(C93304aj ajVar, C88206tb tbVar, Query query) {
        super("Process remote action request data", 1, 8);
        this.f260194c = ajVar;
        this.f260192a = tbVar;
        this.f260193b = query;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C119071a aVar = (C119071a) this.f260194c.f260195a.mo27525b();
        C54946ad adVar = this.f260192a.f238428c;
        if (adVar == null) {
            adVar = C54946ad.f144531h;
        }
        List b = aVar.mo87635b(adVar, this.f260193b, (PlaybackStatus) null);
        if (!b.isEmpty()) {
            return (VoiceAction) b.get(0);
        }
        return null;
    }
}
