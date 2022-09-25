package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55351pd;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.p */
/* compiled from: PG */
public final class C118040p extends C68247h {

    /* renamed from: a */
    private final C68283d f327611a;

    /* renamed from: c */
    private final C68283d f327612c;

    /* renamed from: d */
    private final C68283d f327613d;

    /* renamed from: e */
    private final C68283d f327614e;

    /* renamed from: f */
    private final C68283d f327615f;

    public C118040p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C118040p.class), aVar);
        this.f327611a = C68236af.m98549d(dVar);
        this.f327612c = C68236af.m98549d(dVar2);
        this.f327613d = C68236af.m98549d(dVar3);
        this.f327614e = C68236af.m98549d(dVar4);
        this.f327615f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        String str;
        SettableFuture settableFuture;
        String str2;
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C58833ax axVar2 = (C58833ax) list.get(2);
        C117967ak akVar = (C117967ak) list.get(4);
        C58976aa aaVar = C58975e.f156826a;
        if (!((C87421i) list.get(3)).mo81198c()) {
            return C118826c.f331423b;
        }
        ActionData actionData = (ActionData) axVar.mo56107c();
        CardDecision cardDecision = (CardDecision) axVar2.mo56107c();
        cardDecision.f236266t.isEmpty();
        C55349pb pbVar = actionData.f235993c;
        TtsRequest ttsRequest = null;
        if (pbVar == null || (pbVar.f145832a & 8) == 0) {
            str = null;
        } else {
            if (pbVar.f145834c == null) {
                C55351pd pdVar = C55351pd.f145839f;
            }
            C55351pd pdVar2 = pbVar.f145834c;
            if (pdVar2 == null) {
                pdVar2 = C55351pd.f145839f;
            }
            ttsRequest = new TtsRequest(pdVar2.f145843c, false);
            C55351pd pdVar3 = pbVar.f145834c;
            if (pdVar3 == null) {
                pdVar3 = C55351pd.f145839f;
            }
            str = pdVar3.f145843c;
        }
        TtsRequest ttsRequest2 = cardDecision.f236250d;
        if (ttsRequest2 != null && !ttsRequest2.mo81450a().isEmpty()) {
            ttsRequest = ttsRequest2;
        }
        if (!TtsRequest.m141979c(ttsRequest)) {
            SettableFuture settableFuture2 = new SettableFuture();
            if (actionData.mo81092e() != null) {
                String e = actionData.mo81092e();
                if (!TextUtils.isEmpty(e)) {
                    str2 = e.replace('-', '_');
                    akVar.mo103489e(4, str2, query, ttsRequest, str, new C117964ah(settableFuture2));
                    settableFuture = settableFuture2;
                }
            }
            str2 = akVar.mo103487c();
            akVar.mo103489e(4, str2, query, ttsRequest, str, new C117964ah(settableFuture2));
            settableFuture = settableFuture2;
        } else {
            settableFuture = C60856cj.m92900i(C87421i.m141588a(2));
        }
        return C60922j.m93044g(settableFuture, C118031g.f327581a, C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327611a.mo60297gq(), this.f327612c.mo60297gq(), this.f327613d.mo60297gq(), this.f327614e.mo60297gq(), this.f327615f.mo60297gq());
    }
}
