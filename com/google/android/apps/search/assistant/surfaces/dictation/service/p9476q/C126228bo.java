package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126332i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.bo */
/* compiled from: PG */
public final /* synthetic */ class C126228bo implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126233bt f347830a;

    /* renamed from: b */
    public final /* synthetic */ C126208av f347831b;

    /* renamed from: c */
    public final /* synthetic */ C126207au f347832c;

    public /* synthetic */ C126228bo(C126233bt btVar, C126208av avVar, C126207au auVar) {
        this.f347830a = btVar;
        this.f347831b = avVar;
        this.f347832c = auVar;
    }

    public final void run() {
        C126233bt btVar = this.f347830a;
        C126208av avVar = this.f347831b;
        C126207au auVar = this.f347832c;
        if (Objects.equals(btVar.f347845f, avVar)) {
            C63122a aVar = null;
            btVar.f347845f = null;
            if (!auVar.equals(C126207au.KICKED_OUT_BY_OTHER_ORATION) && !auVar.equals(C126207au.DICTATION_SHUTDOWN)) {
                switch (auVar.ordinal()) {
                    case 0:
                    case 5:
                    case 6:
                        break;
                    case 1:
                        aVar = C63122a.FAILURE_ORATION_CLEANUP_ERROR;
                        break;
                    case 2:
                        aVar = C63122a.FAILURE_UNCLASSIFIED_ASR_ERROR;
                        break;
                    case 3:
                        aVar = C63122a.FAILURE_ASR_START_TIMEOUT;
                        break;
                    case 4:
                        aVar = C63122a.FAILURE_KEYBOARD_RPC_ERROR;
                        break;
                    case 7:
                        aVar = C63122a.SUCCESS_SWITCH_TO_UNSUPPORTED_FIELD;
                        break;
                    case 8:
                        aVar = C63122a.FAILURE_ORATION_INIT_ERROR;
                        break;
                    default:
                        throw new AssertionError();
                }
                if (aVar != null) {
                    ((C59052c) ((C59052c) C126233bt.f347840a.mo56226d()).mo56372aa(36977)).mo56354G("Encountered an error %s during oration %s. Stopping dictation. [SD]", C126290c.m206496a(auVar), avVar.f347766o);
                    C46459k.m82829b(btVar.f347848i.f345896a.mo106939b(aVar), "Error when ending dictation after %s during %s [SD]", C126290c.m206496a(auVar), avVar.f347766o);
                } else if (!btVar.f347848i.f345896a.f345786e.get()) {
                    C126230bq bqVar = new C126230bq(btVar, new C126332i(btVar.f347848i.f345896a.f345793l.mo107514g(), BuildConfig.FLAVOR, btVar.f347848i));
                    C46459k.m82829b(C60856cj.m92905n(C47810es.m84965e(bqVar), btVar.f347843d), "Failed starting a new Oration [SD]", new Object[0]);
                }
            }
        }
    }
}
