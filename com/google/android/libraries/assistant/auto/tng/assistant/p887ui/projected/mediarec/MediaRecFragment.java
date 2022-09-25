package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
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
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.MediaRecFragment */
/* compiled from: PG */
public final class MediaRecFragment extends C13142ax implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C13118ab f40632a;

    /* renamed from: c */
    private Context f40633c;

    /* renamed from: d */
    private final C2393x f40634d = new C2393x(this);

    /* renamed from: e */
    private boolean f40635e;

    @Deprecated
    public MediaRecFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C13118ab mo17754z() {
        C13118ab abVar = this.f40632a;
        if (abVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f40635e) {
            return abVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo20899b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f40633c == null) {
            this.f40633c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f40633c;
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
        return this.f40634d;
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
            C13154j.m29390a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C13118ab a = mo17754z();
            C59104x b = C13118ab.f40669a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaRecFragment");
            ((C59052c) ((C59052c) b).mo56372aa(44608)).mo56386p("onCreate");
            a.f40691p.mo50429i(a.f40674E);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C13154j.m29390a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r1 == 10) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[Catch:{ all -> 0x01e1, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066 A[Catch:{ all -> 0x01e1, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a A[Catch:{ all -> 0x01e1, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d3 A[Catch:{ all -> 0x01e1, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014b A[Catch:{ all -> 0x01e1, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01cb A[Catch:{ all -> 0x01e1, all -> 0x01e6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            com.google.apps.tiktok.tracing.ab r0 = r6.f122869b
            r0.mo51381i()
            r6.mo51119t(r7, r8, r9)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ab r9 = r6.mo17754z()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.d r0 = r9.mo20912c()     // Catch:{ all -> 0x01e1 }
            int r1 = r0.f40494l     // Catch:{ all -> 0x01e1 }
            int r1 = com.google.android.apps.auto.p450a.p451a.C8917j.m23517a(r1)     // Catch:{ all -> 0x01e1 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            r4 = 10
            if (r1 != r4) goto L_0x0023
        L_0x0021:
            r1 = 1
            goto L_0x0033
        L_0x0023:
            g.a.a r1 = r9.f40677b     // Catch:{ all -> 0x01e1 }
            java.lang.Object r1 = r1.mo17428b()     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01e1 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x0032
            goto L_0x0021
        L_0x0032:
            r1 = 0
        L_0x0033:
            r9.f40672C = r1     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.az r4 = r9.f40670A     // Catch:{ all -> 0x01e1 }
            r4.f40737c = r1     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a r1 = r9.f40694s     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r0.f40488f     // Catch:{ all -> 0x01e1 }
            int r0 = r0.f40494l     // Catch:{ all -> 0x01e1 }
            int r0 = com.google.android.apps.auto.p450a.p451a.C8917j.m23517a(r0)     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x0046
            r0 = 1
        L_0x0046:
            r1.mo20907f(r4, r0)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.dataservice.dp r0 = r9.f40692q     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a r1 = r9.f40694s     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ab$b r4 = r9.f40673D     // Catch:{ all -> 0x01e1 }
            r0.mo50707a(r1, r4)     // Catch:{ all -> 0x01e1 }
            r0 = 2131625922(0x7f0e07c2, float:1.8879066E38)
            android.view.View r7 = r7.inflate(r0, r8, r2)     // Catch:{ all -> 0x01e1 }
            r8 = 2131433172(0x7f0b16d4, float:1.8488122E38)
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            android.view.ViewStub r8 = (android.view.ViewStub) r8     // Catch:{ all -> 0x01e1 }
            boolean r0 = r9.f40672C     // Catch:{ all -> 0x01e1 }
            if (r3 == r0) goto L_0x006a
            r0 = 2131625918(0x7f0e07be, float:1.8879058E38)
            goto L_0x006d
        L_0x006a:
            r0 = 2131625921(0x7f0e07c1, float:1.8879064E38)
        L_0x006d:
            r8.setLayoutResource(r0)     // Catch:{ all -> 0x01e1 }
            r8.inflate()     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.logging.ve.ab r8 = r9.f40697v     // Catch:{ all -> 0x01e1 }
            r0 = 2131433168(0x7f0b16d0, float:1.8488114E38)
            android.view.View r1 = r7.findViewById(r0)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.logging.ve.af r3 = r9.f40696u     // Catch:{ all -> 0x01e1 }
            r4 = 139577(0x22139, float:1.95589E-40)
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r4)     // Catch:{ all -> 0x01e1 }
            r8.mo33801b(r1, r3)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.logging.ve.ab r8 = r9.f40697v     // Catch:{ all -> 0x01e1 }
            r1 = 2131433163(0x7f0b16cb, float:1.8488104E38)
            android.view.View r1 = r7.findViewById(r1)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.logging.ve.af r3 = r9.f40696u     // Catch:{ all -> 0x01e1 }
            r4 = 128130(0x1f482, float:1.79548E-40)
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r4)     // Catch:{ all -> 0x01e1 }
            r8.mo33801b(r1, r3)     // Catch:{ all -> 0x01e1 }
            r8 = 2131435508(0x7f0b1ff4, float:1.849286E38)
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.dh r1 = r9.f40700y     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.t r3 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.t     // Catch:{ all -> 0x01e1 }
            r3.<init>(r9)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.co r4 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "MediaRecFragmetnPeer:scrim clicked"
            r4.<init>(r1, r5, r3)     // Catch:{ all -> 0x01e1 }
            r8.setOnClickListener(r4)     // Catch:{ all -> 0x01e1 }
            android.view.View r8 = r7.findViewById(r0)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.dh r0 = r9.f40700y     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.u r1 = com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13165u.f40771a     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.co r3 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "MediaRecFragmetnPeer:media plate clicked"
            r3.<init>(r0, r4, r1)     // Catch:{ all -> 0x01e1 }
            r8.setOnClickListener(r3)     // Catch:{ all -> 0x01e1 }
            boolean r8 = r9.f40672C     // Catch:{ all -> 0x01e1 }
            if (r8 == 0) goto L_0x014b
            r8 = 2131429499(0x7f0b087b, float:1.8480672E38)
            android.view.View r0 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.dh r1 = r9.f40700y     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.k r3 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.k     // Catch:{ all -> 0x01e1 }
            r3.<init>(r9)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.co r4 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "MediaRecFragmetnPeer:cancel button clicked"
            r4.<init>(r1, r5, r3)     // Catch:{ all -> 0x01e1 }
            r0.setOnClickListener(r4)     // Catch:{ all -> 0x01e1 }
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.dh r0 = r9.f40700y     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.m r1 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.m     // Catch:{ all -> 0x01e1 }
            r1.<init>(r9)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.ch r3 = new com.google.apps.tiktok.tracing.ch     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "MediaRecFragmetnPeer:key pressed on cancel button"
            r3.<init>(r0, r4, r1)     // Catch:{ all -> 0x01e1 }
            r8.setOnKeyListener(r3)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r8 = r9.mo20911b()     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r8 = r8.f40370d     // Catch:{ all -> 0x01e1 }
            if (r8 != 0) goto L_0x010a
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r8 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i.f40380k     // Catch:{ all -> 0x01e1 }
        L_0x010a:
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.m r8 = r8.f40388g     // Catch:{ all -> 0x01e1 }
            if (r8 != 0) goto L_0x0110
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.m r8 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12995m.f40394e     // Catch:{ all -> 0x01e1 }
        L_0x0110:
            boolean r8 = r8.f40397b     // Catch:{ all -> 0x01e1 }
            if (r8 == 0) goto L_0x01c1
            r8 = 2131435529(0x7f0b2009, float:1.8492903E38)
            android.view.View r0 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            r0.setVisibility(r2)     // Catch:{ all -> 0x01e1 }
            r0 = 2131435528(0x7f0b2008, float:1.84929E38)
            android.view.View r1 = r7.findViewById(r0)     // Catch:{ all -> 0x01e1 }
            r1.setVisibility(r2)     // Catch:{ all -> 0x01e1 }
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.aw r1 = r9.f40701z     // Catch:{ all -> 0x01e1 }
            p3186j$.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.n r2 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.n     // Catch:{ all -> 0x01e1 }
            r2.<init>(r1)     // Catch:{ all -> 0x01e1 }
            r8.setOnClickListener(r2)     // Catch:{ all -> 0x01e1 }
            android.view.View r8 = r7.findViewById(r0)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.aw r0 = r9.f40701z     // Catch:{ all -> 0x01e1 }
            p3186j$.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.o r1 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.o     // Catch:{ all -> 0x01e1 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e1 }
            r8.setOnClickListener(r1)     // Catch:{ all -> 0x01e1 }
            goto L_0x01c1
        L_0x014b:
            r8 = 2131433173(0x7f0b16d5, float:1.8488124E38)
            android.view.View r0 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.aw r1 = r9.f40701z     // Catch:{ all -> 0x01e1 }
            p3186j$.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.n r2 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.n     // Catch:{ all -> 0x01e1 }
            r2.<init>(r1)     // Catch:{ all -> 0x01e1 }
            r0.setOnClickListener(r2)     // Catch:{ all -> 0x01e1 }
            android.view.View r0 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.dh r1 = r9.f40700y     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.l r2 = com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13156l.f40762a     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.cj r3 = new com.google.apps.tiktok.tracing.cj     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "MediaRecFragmetnPeer:prev page button touched"
            r3.<init>(r1, r2, r4)     // Catch:{ all -> 0x01e1 }
            r0.setOnTouchListener(r3)     // Catch:{ all -> 0x01e1 }
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.dh r0 = r9.f40700y     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.m r1 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.m     // Catch:{ all -> 0x01e1 }
            r1.<init>(r9)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.ch r2 = new com.google.apps.tiktok.tracing.ch     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "MediaRecFragmetnPeer:key pressed on prev page button"
            r2.<init>(r0, r3, r1)     // Catch:{ all -> 0x01e1 }
            r8.setOnKeyListener(r2)     // Catch:{ all -> 0x01e1 }
            r8 = 2131433167(0x7f0b16cf, float:1.8488112E38)
            android.view.View r0 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.aw r1 = r9.f40701z     // Catch:{ all -> 0x01e1 }
            p3186j$.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.o r2 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.o     // Catch:{ all -> 0x01e1 }
            r2.<init>(r1)     // Catch:{ all -> 0x01e1 }
            r0.setOnClickListener(r2)     // Catch:{ all -> 0x01e1 }
            android.view.View r0 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.dh r1 = r9.f40700y     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.l r2 = com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13156l.f40762a     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.cj r3 = new com.google.apps.tiktok.tracing.cj     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "MediaRecFragmetnPeer:next page button touched"
            r3.<init>(r1, r2, r4)     // Catch:{ all -> 0x01e1 }
            r0.setOnTouchListener(r3)     // Catch:{ all -> 0x01e1 }
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.dh r0 = r9.f40700y     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.m r1 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.m     // Catch:{ all -> 0x01e1 }
            r1.<init>(r9)     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.ch r2 = new com.google.apps.tiktok.tracing.ch     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "MediaRecFragmetnPeer:key pressed on next page button"
            r2.<init>(r0, r3, r1)     // Catch:{ all -> 0x01e1 }
            r8.setOnKeyListener(r2)     // Catch:{ all -> 0x01e1 }
        L_0x01c1:
            android.support.v4.app.Fragment r8 = r9.f40687l     // Catch:{ all -> 0x01e1 }
            java.lang.Object r8 = r8.getHost()     // Catch:{ all -> 0x01e1 }
            boolean r8 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x01e1 }
            if (r8 == 0) goto L_0x01dd
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.v r8 = new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.v     // Catch:{ all -> 0x01e1 }
            r8.<init>(r9)     // Catch:{ all -> 0x01e1 }
            android.support.v4.app.Fragment r0 = r9.f40687l     // Catch:{ all -> 0x01e1 }
            android.support.v4.app.am r0 = r0.requireActivity()     // Catch:{ all -> 0x01e1 }
            androidx.activity.OnBackPressedDispatcher r0 = r0.f2707h     // Catch:{ all -> 0x01e1 }
            android.support.v4.app.Fragment r9 = r9.f40687l     // Catch:{ all -> 0x01e1 }
            r0.mo3339b(r9, r8)     // Catch:{ all -> 0x01e1 }
        L_0x01dd:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r7
        L_0x01e1:
            r7 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x01e6 }
            goto L_0x01ea
        L_0x01e6:
            r8 = move-exception
            com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13154j.m29390a(r7, r8)
        L_0x01ea:
            goto L_0x01ec
        L_0x01eb:
            throw r7
        L_0x01ec:
            goto L_0x01eb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.MediaRecFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f40635e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C13154j.m29390a(th, th);
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
            C13154j.m29390a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C13118ab a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f40695t.mo19974a(C37179a.f97416O);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C13154j.m29390a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C13118ab a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f40695t.mo19974a(C37179a.f97417P.mo40805c(C62722b.OK));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C13154j.m29390a(th, th);
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
            if (!this.f40635e) {
                super.onAttach(context);
                if (this.f40632a == null) {
                    this.f40632a = ((C13121ac) mo20920d().mo17653jN()).mo20917eJ();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f40634d));
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
                C13154j.m29390a(th, th2);
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
