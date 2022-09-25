package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126934b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C127001v;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127147g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.af */
/* compiled from: PG */
public final class C127012af implements C126934b {

    /* renamed from: a */
    public static final C59071e f349742a = C59071e.m91331h();

    /* renamed from: b */
    public final C127020i f349743b;

    /* renamed from: c */
    public final C127147g f349744c;

    /* renamed from: d */
    public final C71422aw f349745d;

    /* renamed from: e */
    public final C71548cy f349746e;

    /* renamed from: f */
    public boolean f349747f;

    /* renamed from: g */
    public final C127001v f349748g;

    /* renamed from: h */
    private final C37215b f349749h;

    /* renamed from: i */
    private final Executor f349750i;

    public C127012af(C127020i iVar, C37215b bVar, C127147g gVar, C127001v vVar, C71422aw awVar, Executor executor) {
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(gVar, "conversationDataClient");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "sequentialExecutor");
        this.f349743b = iVar;
        this.f349749h = bVar;
        this.f349744c = gVar;
        this.f349748g = vVar;
        this.f349745d = awVar;
        this.f349750i = executor;
        ArrayDeque arrayDeque = new ArrayDeque();
        C119904w wVar = C119904w.f333909c;
        C69664n.m101060f(wVar, "getDefaultInstance()");
        C119834cb cbVar = C119834cb.f333765b;
        C69664n.m101060f(cbVar, "getDefaultInstance()");
        HashSet hashSet = new HashSet();
        C119885dz dzVar = C119885dz.f333865f;
        C69664n.m101060f(dzVar, "getDefaultInstance()");
        C119844cl clVar = C119844cl.f333788d;
        C69664n.m101060f(clVar, "getDefaultInstance()");
        this.f349746e = C71574dx.m104480b(new C127034w((C34053bp) null, arrayDeque, wVar, cbVar, hashSet, dzVar, clVar));
    }

    /* renamed from: a */
    public final void mo107858a(C119904w wVar) {
        C119903v vVar;
        C119903v vVar2;
        C119903v vVar3;
        C119903v vVar4;
        C69664n.m101061g(wVar, "assistantState");
        if (wVar.f333911a == 2) {
            vVar = (C119903v) wVar.f333912b;
        } else {
            vVar = C119903v.f333904d;
        }
        C119834cb cbVar = vVar.f333908c;
        if (cbVar == null) {
            cbVar = C119834cb.f333765b;
        }
        String str = cbVar.f333767a;
        C69664n.m101060f(str, "assistantState.working.activityId.id");
        if (str.length() != 0) {
            C119904w wVar2 = ((C127034w) this.f349746e.mo62784e()).f349812c;
            if (wVar2.f333911a == 2) {
                vVar2 = (C119903v) wVar2.f333912b;
            } else {
                vVar2 = C119903v.f333904d;
            }
            C119834cb cbVar2 = vVar2.f333908c;
            if (cbVar2 == null) {
                cbVar2 = C119834cb.f333765b;
            }
            String str2 = cbVar2.f333767a;
            C69664n.m101060f(str2, "_conversationControllerS…ate.working.activityId.id");
            if (str2.length() != 0) {
                if (wVar.f333911a == 2) {
                    vVar3 = (C119903v) wVar.f333912b;
                } else {
                    vVar3 = C119903v.f333904d;
                }
                C119834cb cbVar3 = vVar3.f333908c;
                if (cbVar3 == null) {
                    cbVar3 = C119834cb.f333765b;
                }
                if (!C69664n.m101066l(str2, cbVar3.f333767a)) {
                    C59052c cVar = (C59052c) f349742a.mo56224b();
                    if (wVar.f333911a == 2) {
                        vVar4 = (C119903v) wVar.f333912b;
                    } else {
                        vVar4 = C119903v.f333904d;
                    }
                    C119834cb cbVar4 = vVar4.f333908c;
                    if (cbVar4 == null) {
                        cbVar4 = C119834cb.f333765b;
                    }
                    String str3 = cbVar4.f333767a;
                    cVar.mo56379ah(new C59094n(37362));
                    cVar.mo56354G("Received a follow up interaction. Previous interactionId: %s, New InteractionId: %s.", str2, str3);
                    this.f349747f = false;
                }
            }
        }
        mo107893d(new C127035x(this, wVar));
    }

    /* renamed from: b */
    public final void mo107859b(C119844cl clVar) {
        C69664n.m101061g(clVar, "interactionResult");
        C59052c cVar = (C59052c) f349742a.mo56224b();
        cVar.mo56379ah(new C59094n(37363));
        cVar.mo56386p("Interaction finished. Cancelling FullListeningTimeout.");
        mo107893d(new C127007aa(this, clVar));
    }

    /* renamed from: c */
    public final void mo107860c(C119885dz dzVar) {
        C69664n.m101061g(dzVar, "transcription");
        mo107893d(new C127010ad(this, dzVar));
        if (!this.f349747f) {
            String str = dzVar.f333868b;
            C69664n.m101060f(str, "transcription.text");
            if (str.length() != 0) {
                this.f349749h.mo19974a(C37176a.f97040dz);
                this.f349747f = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo107893d(C69615a aVar) {
        C127011ae aeVar = new C127011ae(aVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(aeVar), this.f349750i), "Failed to time out", new Object[0]);
    }

    /* renamed from: e */
    public final void mo107894e(C127034w wVar) {
        if (!C69664n.m101066l(wVar.f349813d, C119834cb.f333765b)) {
            wVar.f349814e.add(((C127034w) this.f349746e.mo62784e()).f349813d);
        }
    }
}
