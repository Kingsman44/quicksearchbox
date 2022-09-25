package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import java.util.ArrayDeque;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.w */
/* compiled from: PG */
public final class C127034w {

    /* renamed from: a */
    public final C34053bp f349810a;

    /* renamed from: b */
    public final ArrayDeque f349811b;

    /* renamed from: c */
    public final C119904w f349812c;

    /* renamed from: d */
    public final C119834cb f349813d;

    /* renamed from: e */
    public final Set f349814e;

    /* renamed from: f */
    public final C119885dz f349815f;

    /* renamed from: g */
    public final C119844cl f349816g;

    public C127034w(C34053bp bpVar, ArrayDeque arrayDeque, C119904w wVar, C119834cb cbVar, Set set, C119885dz dzVar, C119844cl clVar) {
        C69664n.m101061g(arrayDeque, "tokensToCancel");
        C69664n.m101061g(wVar, "currentAssistantState");
        C69664n.m101061g(cbVar, "currentInteractionId");
        C69664n.m101061g(set, "canceledInteractionIds");
        C69664n.m101061g(dzVar, "transcription");
        C69664n.m101061g(clVar, "lastInteractionResult");
        this.f349810a = bpVar;
        this.f349811b = arrayDeque;
        this.f349812c = wVar;
        this.f349813d = cbVar;
        this.f349814e = set;
        this.f349815f = dzVar;
        this.f349816g = clVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C127034w m207781b(C127034w wVar, C34053bp bpVar, C119904w wVar2, C119834cb cbVar, C119885dz dzVar, C119844cl clVar, int i) {
        if ((i & 1) != 0) {
            bpVar = wVar.f349810a;
        }
        C34053bp bpVar2 = bpVar;
        ArrayDeque arrayDeque = (i & 2) != 0 ? wVar.f349811b : null;
        if ((i & 4) != 0) {
            wVar2 = wVar.f349812c;
        }
        C119904w wVar3 = wVar2;
        if ((i & 8) != 0) {
            cbVar = wVar.f349813d;
        }
        C119834cb cbVar2 = cbVar;
        Set set = (i & 16) != 0 ? wVar.f349814e : null;
        if ((i & 32) != 0) {
            dzVar = wVar.f349815f;
        }
        C119885dz dzVar2 = dzVar;
        if ((i & 64) != 0) {
            clVar = wVar.f349816g;
        }
        C119844cl clVar2 = clVar;
        C69664n.m101061g(arrayDeque, "tokensToCancel");
        C69664n.m101061g(wVar3, "currentAssistantState");
        C69664n.m101061g(cbVar2, "currentInteractionId");
        C69664n.m101061g(set, "canceledInteractionIds");
        C69664n.m101061g(dzVar2, "transcription");
        C69664n.m101061g(clVar2, "lastInteractionResult");
        return new C127034w(bpVar2, arrayDeque, wVar3, cbVar2, set, dzVar2, clVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo107901a() {
        /*
            r11 = this;
            com.google.android.libraries.search.assistant.invocation.o.a.bp r0 = r11.f349810a
            if (r0 == 0) goto L_0x0010
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r1)
            if (r0 != 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            java.lang.String r0 = "{}"
            goto L_0x001e
        L_0x0010:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r0 = r11.f349810a
            if (r0 == 0) goto L_0x0019
            com.google.frameworks.client.a.a.b r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r0)
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x001e:
            com.google.android.apps.search.assistant.platform.b.a.d.w r1 = r11.f349812c
            int r1 = r1.f333911a
            int r1 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s.m198775b(r1)
            com.google.android.apps.search.assistant.platform.b.a.d.w r2 = r11.f349812c
            int r3 = r2.f333911a
            r4 = 2
            if (r3 != r4) goto L_0x0032
            java.lang.Object r2 = r2.f333912b
            com.google.android.apps.search.assistant.platform.b.a.d.v r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v) r2
            goto L_0x0034
        L_0x0032:
            com.google.android.apps.search.assistant.platform.b.a.d.v r2 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v.f333904d
        L_0x0034:
            int r2 = r2.f333906a
            int r2 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u.m198776a(r2)
            com.google.android.apps.search.assistant.platform.b.a.d.cb r3 = r11.f349813d
            java.lang.String r3 = r3.f333767a
            com.google.android.apps.search.assistant.platform.b.a.d.cl r5 = r11.f349816g
            int r5 = r5.f333790a
            int r5 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119841ci.m198738b(r5)
            com.google.android.apps.search.assistant.platform.b.a.d.dz r6 = r11.f349815f
            int r6 = r6.f333870d
            int r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119884dy.m198758a(r6)
            r7 = 4
            r8 = 3
            if (r6 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            if (r6 == r4) goto L_0x0062
            if (r6 == r8) goto L_0x005f
            if (r6 == r7) goto L_0x005c
        L_0x0059:
            java.lang.String r6 = "UNRECOGNIZED"
            goto L_0x0064
        L_0x005c:
            java.lang.String r6 = "FINAL"
            goto L_0x0064
        L_0x005f:
            java.lang.String r6 = "PARTIAL"
            goto L_0x0064
        L_0x0062:
            java.lang.String r6 = "EMPTY"
        L_0x0064:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "{invocationToken: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r0 = ",assistantState: "
            r9.append(r0)
            java.lang.String r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s.m198774a(r1)
            r9.append(r0)
            java.lang.String r0 = ",workingState: "
            r9.append(r0)
            r0 = 1
            if (r2 == r0) goto L_0x0094
            if (r2 == r4) goto L_0x0091
            if (r2 == r8) goto L_0x008e
            if (r2 == r7) goto L_0x008b
            java.lang.String r0 = "null"
            goto L_0x0096
        L_0x008b:
            java.lang.String r0 = "STATE_NOT_SET"
            goto L_0x0096
        L_0x008e:
            java.lang.String r0 = "EXECUTING"
            goto L_0x0096
        L_0x0091:
            java.lang.String r0 = "THINKING"
            goto L_0x0096
        L_0x0094:
            java.lang.String r0 = "LISTENING"
        L_0x0096:
            r9.append(r0)
            java.lang.String r0 = ",currentInteraction_id: "
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = ",lastResult: "
            r9.append(r0)
            java.lang.String r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119841ci.m198737a(r5)
            r9.append(r0)
            java.lang.String r0 = ",lastTranscriptionState: "
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = "}"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c.C127034w.mo107901a():java.lang.String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127034w)) {
            return false;
        }
        C127034w wVar = (C127034w) obj;
        return C69664n.m101066l(this.f349810a, wVar.f349810a) && C69664n.m101066l(this.f349811b, wVar.f349811b) && C69664n.m101066l(this.f349812c, wVar.f349812c) && C69664n.m101066l(this.f349813d, wVar.f349813d) && C69664n.m101066l(this.f349814e, wVar.f349814e) && C69664n.m101066l(this.f349815f, wVar.f349815f) && C69664n.m101066l(this.f349816g, wVar.f349816g);
    }

    public final int hashCode() {
        C34053bp bpVar = this.f349810a;
        return ((((((((((((bpVar == null ? 0 : bpVar.hashCode()) * 31) + this.f349811b.hashCode()) * 31) + this.f349812c.hashCode()) * 31) + this.f349813d.hashCode()) * 31) + this.f349814e.hashCode()) * 31) + this.f349815f.hashCode()) * 31) + this.f349816g.hashCode();
    }

    public final String toString() {
        C34053bp bpVar = this.f349810a;
        ArrayDeque arrayDeque = this.f349811b;
        C119904w wVar = this.f349812c;
        C119834cb cbVar = this.f349813d;
        Set set = this.f349814e;
        C119885dz dzVar = this.f349815f;
        C119844cl clVar = this.f349816g;
        return "ConversationControllerState(activeInvocationToken=" + bpVar + ", tokensToCancel=" + arrayDeque + ", currentAssistantState=" + wVar + ", currentInteractionId=" + cbVar + ", canceledInteractionIds=" + set + ", transcription=" + dzVar + ", lastInteractionResult=" + clVar + ")";
    }
}
