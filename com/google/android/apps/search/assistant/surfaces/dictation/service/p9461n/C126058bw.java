package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.a;
import com.google.android.apps.gsa.nga.api.a.b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.bw */
/* compiled from: PG */
public final /* synthetic */ class C126058bw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347420a;

    /* renamed from: b */
    public final /* synthetic */ C63122a f347421b;

    public /* synthetic */ C126058bw(C126081cs csVar, C63122a aVar) {
        this.f347420a = csVar;
        this.f347421b = aVar;
    }

    public final void run() {
        C126081cs csVar = this.f347420a;
        C63122a aVar = this.f347421b;
        ((C59052c) ((C59052c) C126081cs.f347463a.mo56224b()).mo56372aa(36806)).mo56389s("#onDictationEnded: %s [SD]", C126288a.m206493e(aVar));
        C125969b bVar = csVar.f347471i;
        if (csVar.f347469g.mo107338c().mo107329d()) {
            C126054bs bsVar = bVar.f347191a;
            a createBuilder = b.c.createBuilder();
            createBuilder.copyOnWrite();
            createBuilder.instance.b = true;
            String g = bsVar.mo107273g(R.string.assistant_accessibility_voice_typing_stopped, new Object[0]);
            createBuilder.copyOnWrite();
            g.getClass();
            createBuilder.instance.a = g;
            bVar.mo107212a(createBuilder.build());
        }
        bVar.f347193c.set(C58733pz.f156496a);
        csVar.f347469g.mo107340e(C126095df.f347513a);
        csVar.f347474l.mo107361e(false);
        C126114dy dyVar = csVar.f347474l;
        C126038bc bcVar = csVar.f347470h;
        bcVar.f347377w.set(C58485gu.m89845m());
        bcVar.f347378x.set(false);
        if (aVar.equals(C63122a.SUCCESS_SEND)) {
            bcVar.f347365k.mo107389g();
            bcVar.f347367m.mo107389g();
        }
        C60870cx f = C126309ar.m206527f(C126309ar.m206525d(Arrays.asList(new C60870cx[]{bcVar.f347365k.mo107383a(), bcVar.f347367m.mo107383a(), bcVar.f347368n.mo107386d(), bcVar.f347369o.mo107386d(), bcVar.f347371q.mo107386d(), bcVar.f347372r.mo107386d(), bcVar.f347373s.mo107386d(), bcVar.f347374t.mo107386d(), bcVar.f347375u.mo107386d()})), Optional.empty());
        if (aVar.equals(C63122a.SUCCESS_SEND) && bcVar.f347357c.mo107202a().mo107196o()) {
            f = C126038bc.m206091c(f, bcVar.f347365k, new C125945ac(bcVar));
        }
        if (bcVar.f347363i) {
            f = C126038bc.m206091c(f, bcVar.f347367m, new C125946ad(bcVar));
        }
        C125947ae aeVar = new C125947ae(f);
        dyVar.mo107358b(C60856cj.m92902k(C47810es.m84965e(aeVar), C126038bc.f347356b.toMillis(), TimeUnit.MILLISECONDS, bcVar.f347361g));
    }
}
