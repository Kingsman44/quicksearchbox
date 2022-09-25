package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a.C131829n;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130702a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130733c;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130734d;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9925d.p9926a.C130802e;
import com.google.android.apps.search.assistant.verticals.ambient.p9963r.p9964a.C131257d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3886c.C50744bi;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4528b.p4529a.C58994k;
import com.google.common.util.concurrent.C60887da;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.i */
/* compiled from: PG */
public final class C130629i extends C130621ab implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130639s f357759a;

    /* renamed from: c */
    private Context f357760c;

    /* renamed from: d */
    private final C2393x f357761d = new C2393x(this);

    /* renamed from: e */
    private boolean f357762e;

    @Deprecated
    public C130629i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C130639s mo17754z() {
        C130639s sVar = this.f357759a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f357762e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo109766b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f357760c == null) {
            this.f357760c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f357760c;
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
        return this.f357761d;
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
            C130628h.m213024a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            mo17754z().f357776d.setHasOptionsMenu(true);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130628h.m213024a(th, th);
        }
        throw th;
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        C130639s a = mo17754z();
        menuInflater.inflate(R.menu.assistant_ambient_feedback_action_bar, menu);
        a.f357775c.onCreateOptionsMenu(menu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x024a A[SYNTHETIC, Splitter:B:51:0x024a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            r19 = this;
            r0 = r20
            r1 = r19
            com.google.apps.tiktok.tracing.ab r2 = r1.f122869b
            r2.mo51381i()
            r19.mo51119t(r20, r21, r22)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.s r2 = r19.mo17754z()     // Catch:{ all -> 0x0252 }
            r3 = 2131624162(0x7f0e00e2, float:1.8875496E38)
            r4 = 0
            r5 = r21
            android.view.View r3 = r0.inflate(r3, r5, r4)     // Catch:{ all -> 0x0252 }
            com.google.assistant.c.bi r5 = r2.f357779g     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x020a
            com.google.protobuf.cq r5 = r5.f132058a     // Catch:{ all -> 0x0252 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x0028
            goto L_0x020a
        L_0x0028:
            r5 = 2131427942(0x7f0b0266, float:1.8477514E38)
            android.view.View r6 = r3.findViewById(r5)     // Catch:{ all -> 0x0252 }
            android.widget.RadioGroup r6 = (android.widget.RadioGroup) r6     // Catch:{ all -> 0x0252 }
            r7 = 2131427944(0x7f0b0268, float:1.8477519E38)
            android.view.View r7 = r3.findViewById(r7)     // Catch:{ all -> 0x0252 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0252 }
            com.google.assistant.c.bi r8 = r2.f357779g     // Catch:{ all -> 0x0252 }
            com.google.protobuf.cq r8 = r8.f132058a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r8)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.k r9 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130631k.f357765a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r8 = r8.filter(r9)     // Catch:{ all -> 0x0252 }
            j$.util.Optional r8 = r8.findAny()     // Catch:{ all -> 0x0252 }
            boolean r6 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.m213041c(r6, r7, r8, r0)     // Catch:{ all -> 0x0252 }
            if (r6 == 0) goto L_0x0244
            r6 = 2131427943(0x7f0b0267, float:1.8477517E38)
            android.view.View r7 = r3.findViewById(r6)     // Catch:{ all -> 0x0252 }
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7     // Catch:{ all -> 0x0252 }
            r8 = 2131427947(0x7f0b026b, float:1.8477525E38)
            android.view.View r8 = r3.findViewById(r8)     // Catch:{ all -> 0x0252 }
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch:{ all -> 0x0252 }
            com.google.assistant.c.bi r9 = r2.f357779g     // Catch:{ all -> 0x0252 }
            com.google.protobuf.cq r9 = r9.f132058a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.l r10 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130632l.f357766a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r9 = r9.filter(r10)     // Catch:{ all -> 0x0252 }
            j$.util.Optional r9 = r9.findAny()     // Catch:{ all -> 0x0252 }
            boolean r0 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.m213041c(r7, r8, r9, r0)     // Catch:{ all -> 0x0252 }
            if (r0 == 0) goto L_0x0244
            r0 = 2131427945(0x7f0b0269, float:1.847752E38)
            android.view.View r0 = r3.findViewById(r0)     // Catch:{ all -> 0x0252 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x0252 }
            com.google.assistant.c.bi r7 = r2.f357779g     // Catch:{ all -> 0x0252 }
            com.google.protobuf.cq r7 = r7.f132058a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.m r8 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130633m.f357767a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r7 = r7.filter(r8)     // Catch:{ all -> 0x0252 }
            j$.util.Optional r7 = r7.findAny()     // Catch:{ all -> 0x0252 }
            boolean r0 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.m213040b(r0, r7)     // Catch:{ all -> 0x0252 }
            if (r0 == 0) goto L_0x0244
            r0 = 2131427946(0x7f0b026a, float:1.8477523E38)
            android.view.View r0 = r3.findViewById(r0)     // Catch:{ all -> 0x0252 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x0252 }
            com.google.assistant.c.bi r7 = r2.f357779g     // Catch:{ all -> 0x0252 }
            com.google.protobuf.cq r7 = r7.f132058a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.n r8 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130634n.f357768a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r7 = r7.filter(r8)     // Catch:{ all -> 0x0252 }
            j$.util.Optional r7 = r7.findAny()     // Catch:{ all -> 0x0252 }
            boolean r0 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.m213040b(r0, r7)     // Catch:{ all -> 0x0252 }
            if (r0 == 0) goto L_0x0244
            r0 = 2131427951(0x7f0b026f, float:1.8477533E38)
            android.view.View r7 = r3.findViewById(r0)     // Catch:{ all -> 0x0252 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0252 }
            com.google.assistant.c.bi r8 = r2.f357779g     // Catch:{ all -> 0x0252 }
            com.google.protobuf.cq r8 = r8.f132058a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r8)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.o r9 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130635o.f357769a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r8 = r8.filter(r9)     // Catch:{ all -> 0x0252 }
            j$.util.Optional r8 = r8.findAny()     // Catch:{ all -> 0x0252 }
            boolean r7 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.m213040b(r7, r8)     // Catch:{ all -> 0x0252 }
            if (r7 == 0) goto L_0x0244
            r7 = 2131427953(0x7f0b0271, float:1.8477537E38)
            android.view.View r7 = r3.findViewById(r7)     // Catch:{ all -> 0x0252 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0252 }
            com.google.assistant.c.bi r8 = r2.f357779g     // Catch:{ all -> 0x0252 }
            com.google.protobuf.cq r8 = r8.f132058a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r8)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.p r9 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130636p.f357770a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r8 = r8.filter(r9)     // Catch:{ all -> 0x0252 }
            j$.util.Optional r8 = r8.findAny()     // Catch:{ all -> 0x0252 }
            boolean r7 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.m213040b(r7, r8)     // Catch:{ all -> 0x0252 }
            if (r7 == 0) goto L_0x0244
            r7 = 2131427950(0x7f0b026e, float:1.847753E38)
            android.view.View r7 = r3.findViewById(r7)     // Catch:{ all -> 0x0252 }
            android.widget.CheckBox r7 = (android.widget.CheckBox) r7     // Catch:{ all -> 0x0252 }
            r7.getClass()
            r8 = 2131427952(0x7f0b0270, float:1.8477535E38)
            android.view.View r8 = r3.findViewById(r8)     // Catch:{ all -> 0x0252 }
            android.widget.Spinner r8 = (android.widget.Spinner) r8     // Catch:{ all -> 0x0252 }
            r8.getClass()
            android.view.View r0 = r3.findViewById(r0)     // Catch:{ all -> 0x0252 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x0252 }
            r0.getClass()
            com.google.android.apps.search.assistant.verticals.ambient.u.a.n r9 = r2.f357780h     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.u.h r9 = r9.mo110327a()     // Catch:{ all -> 0x0252 }
            boolean r9 = r9.mo110332c()     // Catch:{ all -> 0x0252 }
            r10 = 8
            if (r9 != 0) goto L_0x013c
            r7.setChecked(r4)     // Catch:{ all -> 0x0252 }
            r7.setVisibility(r10)     // Catch:{ all -> 0x0252 }
            r8.setVisibility(r10)     // Catch:{ all -> 0x0252 }
            r0.setVisibility(r10)     // Catch:{ all -> 0x0252 }
            goto L_0x019c
        L_0x013c:
            com.google.android.apps.search.assistant.verticals.ambient.u.a.n r7 = r2.f357780h     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.u.h r7 = r7.mo110327a()     // Catch:{ all -> 0x0252 }
            boolean r7 = r7.mo110330a()     // Catch:{ all -> 0x0252 }
            if (r7 != 0) goto L_0x019c
            com.google.assistant.c.bi r7 = r2.f357779g     // Catch:{ all -> 0x0252 }
            com.google.protobuf.cq r7 = r7.f132058a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.q r9 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130637q.f357771a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r7 = r7.filter(r9)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.r r9 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130638r.f357772a     // Catch:{ all -> 0x0252 }
            j$.util.stream.Stream r7 = r7.map(r9)     // Catch:{ all -> 0x0252 }
            j$.util.Optional r7 = r7.findAny()     // Catch:{ all -> 0x0252 }
            boolean r9 = r7.isPresent()     // Catch:{ all -> 0x0252 }
            if (r9 == 0) goto L_0x019c
            com.google.android.apps.search.assistant.verticals.ambient.u.a.n r9 = r2.f357780h     // Catch:{ all -> 0x0252 }
            j$.time.Duration r9 = r9.mo110329c()     // Catch:{ all -> 0x0252 }
            long r11 = r9.toMinutes()     // Catch:{ all -> 0x0252 }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0252 }
            java.lang.String r13 = "%s (%d minute%s)"
            r14 = 3
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ all -> 0x0252 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0252 }
            r14[r4] = r7     // Catch:{ all -> 0x0252 }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0252 }
            r15 = 1
            r14[r15] = r7     // Catch:{ all -> 0x0252 }
            java.lang.String r7 = ""
            java.lang.String r15 = "s"
            r16 = 1
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x018f
            r7 = r15
        L_0x018f:
            r11 = 2
            r14[r11] = r7     // Catch:{ all -> 0x0252 }
            java.lang.String r7 = java.lang.String.format(r9, r13, r14)     // Catch:{ all -> 0x0252 }
            r0.setText(r7)     // Catch:{ all -> 0x0252 }
            r8.setVisibility(r10)     // Catch:{ all -> 0x0252 }
        L_0x019c:
            android.content.Context r0 = r2.f357774b     // Catch:{ all -> 0x0252 }
            r7 = 2130903046(0x7f030006, float:1.7412899E38)
            r9 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r0 = android.widget.ArrayAdapter.createFromResource(r0, r7, r9)     // Catch:{ all -> 0x0252 }
            r7 = 17367049(0x1090009, float:2.516295E-38)
            r0.setDropDownViewResource(r7)     // Catch:{ all -> 0x0252 }
            r8.setAdapter(r0)     // Catch:{ all -> 0x0252 }
            android.content.Context r0 = r2.f357774b     // Catch:{ all -> 0x0252 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x0252 }
            r7 = 2131492871(0x7f0c0007, float:1.8609206E38)
            int r0 = r0.getInteger(r7)     // Catch:{ all -> 0x0252 }
            r8.setSelection(r0)     // Catch:{ all -> 0x0252 }
            android.view.View r0 = r3.findViewById(r5)     // Catch:{ all -> 0x0252 }
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0     // Catch:{ all -> 0x0252 }
            r5 = 2131427936(0x7f0b0260, float:1.8477502E38)
            android.view.View r5 = r3.findViewById(r5)     // Catch:{ all -> 0x0252 }
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5     // Catch:{ all -> 0x0252 }
            r7 = 2131427937(0x7f0b0261, float:1.8477504E38)
            android.view.View r7 = r3.findViewById(r7)     // Catch:{ all -> 0x0252 }
            android.widget.EditText r7 = (android.widget.EditText) r7     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.m213039a(r0, r5, r7)     // Catch:{ all -> 0x0252 }
            android.view.View r0 = r3.findViewById(r6)     // Catch:{ all -> 0x0252 }
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0     // Catch:{ all -> 0x0252 }
            r5 = 2131427948(0x7f0b026c, float:1.8477527E38)
            android.view.View r5 = r3.findViewById(r5)     // Catch:{ all -> 0x0252 }
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5     // Catch:{ all -> 0x0252 }
            r6 = 2131427949(0x7f0b026d, float:1.8477529E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch:{ all -> 0x0252 }
            android.widget.EditText r6 = (android.widget.EditText) r6     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.m213039a(r0, r5, r6)     // Catch:{ all -> 0x0252 }
            r0 = 2131427957(0x7f0b0275, float:1.8477545E38)
            android.view.View r0 = r3.findViewById(r0)     // Catch:{ all -> 0x0252 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x0252 }
            boolean r2 = r2.f357778f     // Catch:{ all -> 0x0252 }
            if (r2 == 0) goto L_0x0244
            if (r0 == 0) goto L_0x0244
            r0.setVisibility(r4)     // Catch:{ all -> 0x0252 }
            goto L_0x0244
        L_0x020a:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130639s.f357773a     // Catch:{ all -> 0x0252 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0252 }
            java.lang.String r4 = "Feedback form string are absent."
            r5 = 38945(0x9821, float:5.4574E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x0252 }
            android.app.Activity r0 = r2.f357775c     // Catch:{ all -> 0x0252 }
            r0.finish()     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.u.a.n r0 = r2.f357780h     // Catch:{ all -> 0x0252 }
            com.google.android.apps.search.assistant.verticals.ambient.u.h r0 = r0.mo110327a()     // Catch:{ all -> 0x0252 }
            boolean r0 = r0.mo110332c()     // Catch:{ all -> 0x0252 }
            if (r0 == 0) goto L_0x0234
            com.google.android.apps.search.assistant.verticals.ambient.u.a.n r0 = r2.f357780h     // Catch:{ all -> 0x0252 }
            j$.time.Duration r0 = r0.mo110329c()     // Catch:{ all -> 0x0252 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x0252 }
            goto L_0x0238
        L_0x0234:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0252 }
        L_0x0238:
            r7 = r0
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.aa r4 = r2.f357777e     // Catch:{ all -> 0x0252 }
            java.lang.String r5 = "Smartspace feedback report."
            com.google.common.b.hd r6 = com.google.common.p4522b.C58729pv.f156485a     // Catch:{ all -> 0x0252 }
            r8 = 0
            r9 = 1
            r4.mo109765b(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0252 }
        L_0x0244:
            if (r3 == 0) goto L_0x024a
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r3
        L_0x024a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0252 }
            java.lang.String r2 = "Fragment cannot use Event annotations with null view!"
            r0.<init>(r2)     // Catch:{ all -> 0x0252 }
            throw r0     // Catch:{ all -> 0x0252 }
        L_0x0252:
            r0 = move-exception
            r2 = r0
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0258 }
            goto L_0x025d
        L_0x0258:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130628h.m213024a(r2, r3)
        L_0x025d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130629i.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f357762e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130628h.m213024a(th, th);
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
            C130628h.m213024a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0228 A[Catch:{ all -> 0x0246, all -> 0x024e }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x022a A[Catch:{ all -> 0x0246, all -> 0x024e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onOptionsItemSelected(android.view.MenuItem r17) {
        /*
            r16 = this;
            r1 = r16
            com.google.apps.tiktok.tracing.ab r0 = r1.f122869b
            java.lang.String r2 = "Fragment:onOptionsItemSelected"
            com.google.apps.tiktok.tracing.bx r2 = r0.mo51373a(r2)
            com.google.android.libraries.at.c.ar r0 = r1.f54442o     // Catch:{ all -> 0x0246 }
            r0.mo24732O()     // Catch:{ all -> 0x0246 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.s r0 = r16.mo17754z()     // Catch:{ all -> 0x0246 }
            int r3 = r17.getItemId()     // Catch:{ all -> 0x0246 }
            r4 = 2131427935(0x7f0b025f, float:1.84775E38)
            if (r3 != r4) goto L_0x0231
            android.app.Activity r3 = r0.f357775c     // Catch:{ all -> 0x0246 }
            r4 = 2131427942(0x7f0b0266, float:1.8477514E38)
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ all -> 0x0246 }
            android.widget.RadioGroup r3 = (android.widget.RadioGroup) r3     // Catch:{ all -> 0x0246 }
            int r4 = r3.getCheckedRadioButtonId()     // Catch:{ all -> 0x0246 }
            r6 = -1
            if (r4 != r6) goto L_0x002f
            goto L_0x0052
        L_0x002f:
            int r3 = r3.getCheckedRadioButtonId()     // Catch:{ all -> 0x0246 }
            r4 = 2131427936(0x7f0b0260, float:1.8477502E38)
            if (r3 != r4) goto L_0x0064
            android.app.Activity r3 = r0.f357775c     // Catch:{ all -> 0x0246 }
            r4 = 2131427937(0x7f0b0261, float:1.8477504E38)
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ all -> 0x0246 }
            android.widget.EditText r3 = (android.widget.EditText) r3     // Catch:{ all -> 0x0246 }
            android.text.Editable r3 = r3.getText()     // Catch:{ all -> 0x0246 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0246 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0246 }
            if (r3 != 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.i r0 = r0.f357776d     // Catch:{ all -> 0x0246 }
            android.view.View r0 = r0.requireView()     // Catch:{ all -> 0x0246 }
            r3 = 2132083327(0x7f15027f, float:1.9806793E38)
            com.google.android.material.snackbar.Snackbar r0 = com.google.android.material.snackbar.Snackbar.m79660p(r0, r3, r6)     // Catch:{ all -> 0x0246 }
            r0.mo48343h()     // Catch:{ all -> 0x0246 }
            goto L_0x023f
        L_0x0064:
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.i r3 = r0.f357776d     // Catch:{ all -> 0x0246 }
            android.view.View r3 = r3.requireView()     // Catch:{ all -> 0x0246 }
            r4 = 2131427938(0x7f0b0262, float:1.8477506E38)
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ all -> 0x0246 }
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3     // Catch:{ all -> 0x0246 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.aa r6 = r0.f357777e     // Catch:{ all -> 0x0246 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.i r4 = r0.f357776d     // Catch:{ all -> 0x0246 }
            android.view.View r4 = r4.requireView()     // Catch:{ all -> 0x0246 }
            r7 = 2131427939(0x7f0b0263, float:1.8477508E38)
            android.view.View r4 = r4.findViewById(r7)     // Catch:{ all -> 0x0246 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x0246 }
            if (r4 != 0) goto L_0x008a
            java.lang.String r4 = ""
            goto L_0x0168
        L_0x008a:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0246 }
            r9.<init>()     // Catch:{ all -> 0x0246 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0246 }
            r10.<init>()     // Catch:{ all -> 0x0246 }
            r11 = 0
        L_0x0095:
            int r12 = r4.getChildCount()     // Catch:{ all -> 0x0246 }
            if (r11 >= r12) goto L_0x013b
            android.view.View r12 = r4.getChildAt(r11)     // Catch:{ all -> 0x0246 }
            boolean r13 = r12 instanceof android.widget.RadioGroup     // Catch:{ all -> 0x0246 }
            java.lang.String r14 = "\n"
            if (r13 == 0) goto L_0x00e7
            android.widget.RadioGroup r12 = (android.widget.RadioGroup) r12     // Catch:{ all -> 0x0246 }
            int r13 = r12.getCheckedRadioButtonId()     // Catch:{ all -> 0x0246 }
            r15 = 0
        L_0x00ac:
            int r5 = r12.getChildCount()     // Catch:{ all -> 0x0246 }
            if (r15 >= r5) goto L_0x0137
            android.view.View r5 = r12.getChildAt(r15)     // Catch:{ all -> 0x0246 }
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5     // Catch:{ all -> 0x0246 }
            int r8 = r5.getId()     // Catch:{ all -> 0x0246 }
            if (r8 != r13) goto L_0x00e4
            java.lang.String r8 = "[x] "
            r10.append(r8)     // Catch:{ all -> 0x0246 }
            java.lang.CharSequence r8 = r5.getText()     // Catch:{ all -> 0x0246 }
            r10.append(r8)     // Catch:{ all -> 0x0246 }
            r10.append(r14)     // Catch:{ all -> 0x0246 }
            java.lang.Object r8 = r5.getTag()     // Catch:{ all -> 0x0246 }
            if (r8 == 0) goto L_0x00e4
            java.lang.Object r8 = r12.getTag()     // Catch:{ all -> 0x0246 }
            if (r8 == 0) goto L_0x00e4
            java.lang.Object r5 = r5.getTag()     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0246 }
            r9.add(r5)     // Catch:{ all -> 0x0246 }
        L_0x00e4:
            int r15 = r15 + 1
            goto L_0x00ac
        L_0x00e7:
            boolean r5 = r12 instanceof android.widget.EditText     // Catch:{ all -> 0x0246 }
            if (r5 == 0) goto L_0x0115
            boolean r5 = r12.isEnabled()     // Catch:{ all -> 0x0246 }
            if (r5 == 0) goto L_0x0137
            android.widget.EditText r12 = (android.widget.EditText) r12     // Catch:{ all -> 0x0246 }
            android.text.Editable r5 = r12.getText()     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0246 }
            boolean r8 = r5.isEmpty()     // Catch:{ all -> 0x0246 }
            if (r8 != 0) goto L_0x010f
            r10.append(r5)     // Catch:{ all -> 0x0246 }
            r10.append(r14)     // Catch:{ all -> 0x0246 }
            r9.add(r5)     // Catch:{ all -> 0x0246 }
            goto L_0x0137
        L_0x010f:
            java.lang.String r5 = "(no input)\n"
            r10.append(r5)     // Catch:{ all -> 0x0246 }
            goto L_0x0137
        L_0x0115:
            boolean r5 = r12 instanceof android.widget.TextView     // Catch:{ all -> 0x0246 }
            if (r5 == 0) goto L_0x0137
            int r5 = r12.getId()     // Catch:{ all -> 0x0246 }
            r8 = 2131427957(0x7f0b0275, float:1.8477545E38)
            if (r5 == r8) goto L_0x0137
            int r5 = r10.length()     // Catch:{ all -> 0x0246 }
            if (r5 <= 0) goto L_0x012b
            r10.append(r14)     // Catch:{ all -> 0x0246 }
        L_0x012b:
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch:{ all -> 0x0246 }
            java.lang.CharSequence r5 = r12.getText()     // Catch:{ all -> 0x0246 }
            r10.append(r5)     // Catch:{ all -> 0x0246 }
            r10.append(r14)     // Catch:{ all -> 0x0246 }
        L_0x0137:
            int r11 = r11 + 1
            goto L_0x0095
        L_0x013b:
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = ", "
            j$.util.stream.Collector r5 = p3186j$.util.stream.Collectors.joining(r5)     // Catch:{ all -> 0x0246 }
            java.lang.Object r4 = r4.collect(r5)     // Catch:{ all -> 0x0246 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x0246 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0246 }
            r8.<init>()     // Catch:{ all -> 0x0246 }
            java.lang.String r9 = "Feedback form: "
            r8.append(r9)     // Catch:{ all -> 0x0246 }
            r8.append(r4)     // Catch:{ all -> 0x0246 }
            java.lang.String r4 = "\n\n"
            r8.append(r4)     // Catch:{ all -> 0x0246 }
            r8.append(r5)     // Catch:{ all -> 0x0246 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0246 }
        L_0x0168:
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.i r5 = r0.f357776d     // Catch:{ all -> 0x0246 }
            android.view.View r5 = r5.requireView()     // Catch:{ all -> 0x0246 }
            android.view.View r5 = r5.findViewById(r7)     // Catch:{ all -> 0x0246 }
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x0246 }
            if (r5 != 0) goto L_0x017b
            com.google.common.b.hd r5 = com.google.common.p4522b.C58729pv.f156485a     // Catch:{ all -> 0x0246 }
            r8 = r5
            r5 = 0
            goto L_0x01d5
        L_0x017b:
            com.google.common.b.gz r7 = new com.google.common.b.gz     // Catch:{ all -> 0x0246 }
            r8 = 4
            r7.<init>(r8)     // Catch:{ all -> 0x0246 }
            r8 = 0
        L_0x0182:
            int r9 = r5.getChildCount()     // Catch:{ all -> 0x0246 }
            if (r8 >= r9) goto L_0x01cf
            android.view.View r9 = r5.getChildAt(r8)     // Catch:{ all -> 0x0246 }
            boolean r10 = r9 instanceof android.widget.RadioGroup     // Catch:{ all -> 0x0246 }
            if (r10 != 0) goto L_0x0191
            goto L_0x01cc
        L_0x0191:
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9     // Catch:{ all -> 0x0246 }
            int r10 = r9.getCheckedRadioButtonId()     // Catch:{ all -> 0x0246 }
            r11 = 0
        L_0x0198:
            int r12 = r9.getChildCount()     // Catch:{ all -> 0x0246 }
            if (r11 >= r12) goto L_0x01cc
            android.view.View r12 = r9.getChildAt(r11)     // Catch:{ all -> 0x0246 }
            android.widget.RadioButton r12 = (android.widget.RadioButton) r12     // Catch:{ all -> 0x0246 }
            int r13 = r12.getId()     // Catch:{ all -> 0x0246 }
            if (r13 != r10) goto L_0x01c9
            java.lang.Object r13 = r9.getTag()     // Catch:{ all -> 0x0246 }
            if (r13 == 0) goto L_0x01c9
            java.lang.Object r13 = r12.getTag()     // Catch:{ all -> 0x0246 }
            if (r13 == 0) goto L_0x01c9
            java.lang.Object r13 = r9.getTag()     // Catch:{ all -> 0x0246 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0246 }
            java.lang.Object r12 = r12.getTag()     // Catch:{ all -> 0x0246 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0246 }
            r7.mo55429h(r13, r12)     // Catch:{ all -> 0x0246 }
        L_0x01c9:
            int r11 = r11 + 1
            goto L_0x0198
        L_0x01cc:
            int r8 = r8 + 1
            goto L_0x0182
        L_0x01cf:
            r5 = 0
            com.google.common.b.hd r7 = r7.mo55427f(r5)     // Catch:{ all -> 0x0246 }
            r8 = r7
        L_0x01d5:
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.i r7 = r0.f357776d     // Catch:{ all -> 0x0246 }
            android.view.View r7 = r7.requireView()     // Catch:{ all -> 0x0246 }
            r9 = 2131427952(0x7f0b0270, float:1.8477535E38)
            android.view.View r7 = r7.findViewById(r9)     // Catch:{ all -> 0x0246 }
            android.widget.Spinner r7 = (android.widget.Spinner) r7     // Catch:{ all -> 0x0246 }
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.i r9 = r0.f357776d     // Catch:{ all -> 0x0246 }
            android.view.View r9 = r9.requireView()     // Catch:{ all -> 0x0246 }
            r10 = 2131427950(0x7f0b026e, float:1.847753E38)
            android.view.View r9 = r9.findViewById(r10)     // Catch:{ all -> 0x0246 }
            android.widget.CheckBox r9 = (android.widget.CheckBox) r9     // Catch:{ all -> 0x0246 }
            if (r9 == 0) goto L_0x021b
            if (r7 == 0) goto L_0x021b
            boolean r9 = r9.isChecked()     // Catch:{ all -> 0x0246 }
            if (r9 != 0) goto L_0x01fe
            goto L_0x021b
        L_0x01fe:
            android.content.Context r0 = r0.f357774b     // Catch:{ all -> 0x0246 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x0246 }
            r9 = 2130903047(0x7f030007, float:1.74129E38)
            int[] r0 = r0.getIntArray(r9)     // Catch:{ all -> 0x0246 }
            int r7 = r7.getSelectedItemPosition()     // Catch:{ all -> 0x0246 }
            r0 = r0[r7]     // Catch:{ all -> 0x0246 }
            long r9 = (long) r0     // Catch:{ all -> 0x0246 }
            j$.time.Duration r0 = p3186j$.time.Duration.ofMinutes(r9)     // Catch:{ all -> 0x0246 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x0246 }
            goto L_0x021f
        L_0x021b:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0246 }
        L_0x021f:
            r9 = r0
            if (r3 == 0) goto L_0x022a
            boolean r0 = r3.isChecked()     // Catch:{ all -> 0x0246 }
            if (r0 == 0) goto L_0x022a
            r10 = 1
            goto L_0x022b
        L_0x022a:
            r10 = 0
        L_0x022b:
            r11 = 0
            r7 = r4
            r6.mo109765b(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0246 }
            goto L_0x023f
        L_0x0231:
            int r3 = r17.getItemId()     // Catch:{ all -> 0x0246 }
            r4 = 16908332(0x102002c, float:2.3877352E-38)
            if (r3 != r4) goto L_0x023f
            android.app.Activity r0 = r0.f357775c     // Catch:{ all -> 0x0246 }
            r0.finish()     // Catch:{ all -> 0x0246 }
        L_0x023f:
            if (r2 == 0) goto L_0x0244
            r2.close()
        L_0x0244:
            r0 = 1
            return r0
        L_0x0246:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x0253
            r2.close()     // Catch:{ all -> 0x024e }
            goto L_0x0253
        L_0x024e:
            r0 = move-exception
            r2 = r0
            com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130628h.m213024a(r3, r2)
        L_0x0253:
            goto L_0x0255
        L_0x0254:
            throw r3
        L_0x0255:
            goto L_0x0254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.C130629i.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_ambient_feedback_verify_location), new C130640t(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130628h.m213024a(th, th);
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
            if (!this.f357762e) {
                super.onAttach(context);
                if (this.f357759a == null) {
                    Object jN = mo109767d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C130629i) {
                        C130629i iVar = (C130629i) fragment;
                        C68225k.m98532d(iVar);
                        C47477n gY = ((C74176nj) jN).mo69794gY();
                        C131257d dVar = new C131257d(((C74176nj) jN).f206730b.f198027a.f199473fg);
                        C131829n j = ((C74176nj) jN).f206836d.mo69027j();
                        aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                        C130802e eVar = new C130802e((C130702a) aqe.f199228b.f198160ca.mo17428b(), (C130733c) aqe.f199228b.f198141cH.mo17428b(), (C130734d) aqe.f199228b.f198106bZ.mo17428b(), (C60887da) aqe.f199175a.n.mo17428b());
                        String e = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45351556").mo50906e();
                        C68225k.m98532d(e);
                        C130620aa aaVar = new C130620aa(gY, dVar, j, eVar, e, C58495hd.m89901o("AAClassicFileLoggerReader", (C58994k) ((C74176nj) jN).f206677a.d.f201542bA.mo17428b(), "AATngFileLoggerReader", (C58994k) ((C74176nj) jN).f206677a.d.f201543bB.mo17428b()), (ExecutorService) ((C74176nj) jN).f206677a.p.mo17428b());
                        boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45351326").mo50907f();
                        C50744bi biVar = (C50744bi) ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45351470").mo50905d();
                        C68225k.m98532d(biVar);
                        this.f357759a = new C130639s(context2, activity, iVar, aaVar, f, biVar, ((C74176nj) jN).f206836d.mo69027j());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f357761d));
                    } else {
                        String obj = C130639s.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
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
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C130628h.m213024a(th, th2);
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
