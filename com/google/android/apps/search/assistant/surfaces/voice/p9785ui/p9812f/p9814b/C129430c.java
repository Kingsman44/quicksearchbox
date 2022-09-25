package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c */
/* compiled from: PG */
public final class C129430c extends C129444k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129439f f355389a;

    /* renamed from: c */
    private Context f355390c;

    /* renamed from: d */
    private final C2393x f355391d = new C2393x(this);

    /* renamed from: e */
    private boolean f355392e;

    @Deprecated
    public C129430c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129439f mo17754z() {
        C129439f fVar = this.f355389a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f355392e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109032b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f355390c == null) {
            this.f355390c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f355390c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f355391d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129421b.m211297a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.lang.String r0 = "newBuilder()"
            com.google.apps.tiktok.tracing.ab r1 = r12.f122869b
            r1.mo51381i()
            r12.mo51119t(r13, r14, r15)     // Catch:{ all -> 0x01f4 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.f r15 = r12.mo17754z()     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r1)     // Catch:{ all -> 0x01f4 }
            r1 = 2131624250(0x7f0e013a, float:1.8875674E38)
            r2 = 0
            android.view.View r13 = r13.inflate(r1, r14, r2)     // Catch:{ all -> 0x01f4 }
            r14 = 2131428497(0x7f0b0491, float:1.847864E38)
            android.view.View r1 = r13.findViewById(r14)     // Catch:{ all -> 0x01f4 }
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.AssistantChipsView r1 = (com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips.AssistantChipsView) r1     // Catch:{ all -> 0x01f4 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.a r3 = r15.f355412c     // Catch:{ all -> 0x01f4 }
            r4 = 158653(0x26bbd, float:2.2232E-40)
            r3.mo108810b(r4, r1)     // Catch:{ all -> 0x01f4 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.j r1 = r15.f355411b     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.q r1 = r1.f355418b     // Catch:{ all -> 0x01f4 }
            if (r1 != 0) goto L_0x0034
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.q r1 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65559q.f178162b     // Catch:{ all -> 0x01f4 }
        L_0x0034:
            com.google.protobuf.cq r1 = r1.f178164a     // Catch:{ all -> 0x01f4 }
            java.lang.String r3 = "chipsInputData.chips.chipsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x01f4 }
            com.google.common.b.gu r1 = com.google.common.p4522b.C58479go.m89810b(r1)     // Catch:{ all -> 0x01f4 }
            r15.f355414e = r1     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "this"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r1)     // Catch:{ all -> 0x01f4 }
            com.google.common.b.gu r1 = r15.f355414e     // Catch:{ all -> 0x01f4 }
            java.lang.String r3 = "inputChips"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.f r3 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65497f.f178057b     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.a r3 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65492a) r3     // Catch:{ all -> 0x01f4 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r0)     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.l r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")     // Catch:{ all -> 0x01f4 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01f4 }
        L_0x0060:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x01f4 }
            if (r4 == 0) goto L_0x01b3
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.p r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65558p) r4     // Catch:{ all -> 0x01f4 }
            r3.mo59393c()     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.e r5 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e.f178050f     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.b r5 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65493b) r5     // Catch:{ all -> 0x01f4 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.h r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")     // Catch:{ all -> 0x01f4 }
            int r6 = r4.f178155a     // Catch:{ all -> 0x01f4 }
            r6 = r6 & 32
            if (r6 == 0) goto L_0x0097
            int r6 = r4.f178161g     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.b r7 = r5.f178060a     // Catch:{ all -> 0x01f4 }
            r7.copyOnWrite()     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bv r7 = r7.instance     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.e r7 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e) r7     // Catch:{ all -> 0x01f4 }
            int r8 = r7.f178052a     // Catch:{ all -> 0x01f4 }
            r8 = r8 | 8
            r7.f178052a = r8     // Catch:{ all -> 0x01f4 }
            r7.f178056e = r6     // Catch:{ all -> 0x01f4 }
        L_0x0097:
            int r6 = r4.f178155a     // Catch:{ all -> 0x01f4 }
            r7 = 2
            r6 = r6 & r7
            if (r6 == 0) goto L_0x00a7
            java.lang.String r6 = r4.f178157c     // Catch:{ all -> 0x01f4 }
            java.lang.String r8 = "it.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)     // Catch:{ all -> 0x01f4 }
            r5.mo59388d(r6)     // Catch:{ all -> 0x01f4 }
        L_0x00a7:
            int r6 = r4.f178155a     // Catch:{ all -> 0x01f4 }
            r8 = 1
            r6 = r6 & r8
            if (r6 == 0) goto L_0x00be
            int r6 = r4.f178156b     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.o r6 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65557o.m96724a(r6)     // Catch:{ all -> 0x01f4 }
            if (r6 != 0) goto L_0x00b7
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.o r6 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65557o.UNDEFINED     // Catch:{ all -> 0x01f4 }
        L_0x00b7:
            java.lang.String r6 = r6.name()     // Catch:{ all -> 0x01f4 }
            r5.mo59387c(r6)     // Catch:{ all -> 0x01f4 }
        L_0x00be:
            int r6 = r4.f178155a     // Catch:{ all -> 0x01f4 }
            r9 = r6 & 4
            if (r9 == 0) goto L_0x01aa
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00cb
            boolean r6 = r4.f178159e     // Catch:{ all -> 0x01f4 }
            goto L_0x00cc
        L_0x00cb:
            r6 = 0
        L_0x00cc:
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.m r4 = r4.f178158d     // Catch:{ all -> 0x01f4 }
            if (r4 != 0) goto L_0x00d2
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.m r4 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65555m.f178142c     // Catch:{ all -> 0x01f4 }
        L_0x00d2:
            int r9 = r4.f178144a     // Catch:{ all -> 0x01f4 }
            java.lang.String r10 = ""
            r11 = 3
            if (r9 != r11) goto L_0x0125
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r7 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d.f178044e     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.c r7 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65494c) r7     // Catch:{ all -> 0x01f4 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.j r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")     // Catch:{ all -> 0x01f4 }
            int r9 = r4.f178144a     // Catch:{ all -> 0x01f4 }
            if (r9 != r11) goto L_0x00f1
            java.lang.Object r4 = r4.f178145b     // Catch:{ all -> 0x01f4 }
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01f4 }
        L_0x00f1:
            java.lang.String r4 = "ic.appPackage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)     // Catch:{ all -> 0x01f4 }
            java.lang.String r4 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r4)     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.c r4 = r7.f178061a     // Catch:{ all -> 0x01f4 }
            r4.copyOnWrite()     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bv r4 = r4.instance     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d) r4     // Catch:{ all -> 0x01f4 }
            r10.getClass()     // Catch:{ all -> 0x01f4 }
            r4.f178047b = r8     // Catch:{ all -> 0x01f4 }
            r4.f178048c = r10     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.c r4 = r7.f178061a     // Catch:{ all -> 0x01f4 }
            r4.copyOnWrite()     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bv r4 = r4.instance     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d) r4     // Catch:{ all -> 0x01f4 }
            int r8 = r4.f178046a     // Catch:{ all -> 0x01f4 }
            r8 = r8 | 8
            r4.f178046a = r8     // Catch:{ all -> 0x01f4 }
            r4.f178049d = r6     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r4 = r7.mo59389a()     // Catch:{ all -> 0x01f4 }
            r5.mo59386b(r4)     // Catch:{ all -> 0x01f4 }
            goto L_0x01aa
        L_0x0125:
            r8 = 4
            if (r9 != r8) goto L_0x016f
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r9 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d.f178044e     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.c r9 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65494c) r9     // Catch:{ all -> 0x01f4 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r0)     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.j r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")     // Catch:{ all -> 0x01f4 }
            int r10 = r4.f178144a     // Catch:{ all -> 0x01f4 }
            if (r10 != r8) goto L_0x0144
            java.lang.Object r4 = r4.f178145b     // Catch:{ all -> 0x01f4 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x01f4 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x01f4 }
            goto L_0x0145
        L_0x0144:
            r4 = 0
        L_0x0145:
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.c r8 = r9.f178061a     // Catch:{ all -> 0x01f4 }
            r8.copyOnWrite()     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bv r8 = r8.instance     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r8 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d) r8     // Catch:{ all -> 0x01f4 }
            r8.f178047b = r7     // Catch:{ all -> 0x01f4 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01f4 }
            r8.f178048c = r4     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.c r4 = r9.f178061a     // Catch:{ all -> 0x01f4 }
            r4.copyOnWrite()     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bv r4 = r4.instance     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d) r4     // Catch:{ all -> 0x01f4 }
            int r7 = r4.f178046a     // Catch:{ all -> 0x01f4 }
            r7 = r7 | 8
            r4.f178046a = r7     // Catch:{ all -> 0x01f4 }
            r4.f178049d = r6     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r4 = r9.mo59389a()     // Catch:{ all -> 0x01f4 }
            r5.mo59386b(r4)     // Catch:{ all -> 0x01f4 }
            goto L_0x01aa
        L_0x016f:
            r7 = 5
            if (r9 != r7) goto L_0x01aa
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r8 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d.f178044e     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.c r8 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65494c) r8     // Catch:{ all -> 0x01f4 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.j r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")     // Catch:{ all -> 0x01f4 }
            int r9 = r4.f178144a     // Catch:{ all -> 0x01f4 }
            if (r9 != r7) goto L_0x018a
            java.lang.Object r4 = r4.f178145b     // Catch:{ all -> 0x01f4 }
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01f4 }
        L_0x018a:
            java.lang.String r4 = "ic.iconUrl"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)     // Catch:{ all -> 0x01f4 }
            r8.mo59390b(r10)     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.c r4 = r8.f178061a     // Catch:{ all -> 0x01f4 }
            r4.copyOnWrite()     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.bv r4 = r4.instance     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d) r4     // Catch:{ all -> 0x01f4 }
            int r7 = r4.f178046a     // Catch:{ all -> 0x01f4 }
            r7 = r7 | 8
            r4.f178046a = r7     // Catch:{ all -> 0x01f4 }
            r4.f178049d = r6     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r4 = r8.mo59389a()     // Catch:{ all -> 0x01f4 }
            r5.mo59386b(r4)     // Catch:{ all -> 0x01f4 }
        L_0x01aa:
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.e r4 = r5.mo59385a()     // Catch:{ all -> 0x01f4 }
            r3.mo59392b(r4)     // Catch:{ all -> 0x01f4 }
            goto L_0x0060
        L_0x01b3:
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.f r0 = r3.mo59391a()     // Catch:{ all -> 0x01f4 }
            android.view.View r14 = r13.findViewById(r14)     // Catch:{ all -> 0x01f4 }
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.AssistantChipsView r14 = (com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips.AssistantChipsView) r14     // Catch:{ all -> 0x01f4 }
            if (r14 == 0) goto L_0x01eb
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.f r14 = r14.mo17754z()     // Catch:{ all -> 0x01f4 }
            r14.mo108549a(r0)     // Catch:{ all -> 0x01f4 }
            com.google.protobuf.cq r0 = r0.f178059a     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "assistantChips.chipsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ all -> 0x01f4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01f4 }
        L_0x01d1:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01f4 }
            if (r1 == 0) goto L_0x01eb
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01f4 }
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.e r1 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e) r1     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "chip"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x01f4 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.e r2 = new com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.e     // Catch:{ all -> 0x01f4 }
            r2.<init>(r15)     // Catch:{ all -> 0x01f4 }
            r14.mo108550b(r1, r2)     // Catch:{ all -> 0x01f4 }
            goto L_0x01d1
        L_0x01eb:
            java.lang.String r14 = "inflater\n      .inflate(…this, inputChips)\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ all -> 0x01f4 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r13
        L_0x01f4:
            r13 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x01f9 }
            goto L_0x01fd
        L_0x01f9:
            r14 = move-exception
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.C129421b.m211297a(r13, r14)
        L_0x01fd:
            goto L_0x01ff
        L_0x01fe:
            throw r13
        L_0x01ff:
            goto L_0x01fe
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.C129430c.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f355392e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129421b.m211297a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C129421b.m211297a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f355392e) {
                super.onAttach(context);
                if (this.f355389a == null) {
                    this.f355389a = ((C129440g) mo109037d().mo17653jN()).mo109035aF();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f355391d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C129421b.m211297a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
