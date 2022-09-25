package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.al */
/* compiled from: PG */
public final class C101648al extends C101696e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101649am f283642a;

    /* renamed from: b */
    private Context f283643b;

    /* renamed from: c */
    private final C2393x f283644c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283645d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283646e;

    @Deprecated
    public C101648al() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C101649am j = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), j.f283648b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92460d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283643b == null) {
            this.f283643b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283643b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283645d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283644c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283645d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101649am mo17754z() {
        C101649am amVar = this.f283642a;
        if (amVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283646e) {
            return amVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283645d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283645d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            C101649am j = mo17754z();
            C59104x b = C101649am.f283647a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "StructureLevelAvocadoLauncherFragment");
            ((C59052c) ((C59052c) b).mo56372aa(20415)).mo56359L("onActivityResult requestCode %d, result code %d, data %s, ", Integer.valueOf(i), Integer.valueOf(i2), intent);
            if (i == 1024) {
                if (i2 == 1) {
                    C47393f.m84236g(new C101783w(), j.f283648b);
                } else {
                    C101763c cVar = new C101763c();
                    cVar.mo92556b(0);
                    C47393f.m84236g(cVar.mo92555a(), j.f283648b);
                }
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283645d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            com.google.apps.tiktok.tracing.ab r0 = r7.f283645d
            r0.mo51381i()
            super.onCreate(r8)     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.am r8 = r7.mo17754z()     // Catch:{ all -> 0x011c }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x011c }
            r0.<init>()     // Catch:{ all -> 0x011c }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x011c }
            r1.<init>()     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.speech.hotword.c.d r2 = r8.f283652f     // Catch:{ all -> 0x011c }
            java.util.Collection r2 = r2.f257559d     // Catch:{ all -> 0x011c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x011c }
        L_0x001e:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.assistant.shared.l r3 = (com.google.android.apps.gsa.assistant.shared.l) r3     // Catch:{ all -> 0x011c }
            java.lang.String r4 = r3.b()     // Catch:{ all -> 0x011c }
            com.google.assistant.at.cf r3 = r3.a()     // Catch:{ all -> 0x011c }
            int r3 = r3.f129621v     // Catch:{ all -> 0x011c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x011c }
            r1.put(r4, r3)     // Catch:{ all -> 0x011c }
            goto L_0x001e
        L_0x003c:
            java.lang.String r2 = "avocadoEnrollDeviceMap"
            r0.putSerializable(r2, r1)     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ah r1 = r8.f283650d     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r1 = r1.f283627b     // Catch:{ all -> 0x011c }
            if (r1 != 0) goto L_0x0049
            com.google.android.apps.gsa.assistant.settings.features.av.bh r1 = com.google.android.apps.gsa.assistant.settings.features.av.bh.c     // Catch:{ all -> 0x011c }
        L_0x0049:
            int r1 = r1.a     // Catch:{ all -> 0x011c }
            r2 = 2
            if (r1 != r2) goto L_0x0066
            java.lang.String r1 = "avocadoEnrollStructureId"
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ah r3 = r8.f283650d     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r3 = r3.f283627b     // Catch:{ all -> 0x011c }
            if (r3 != 0) goto L_0x0058
            com.google.android.apps.gsa.assistant.settings.features.av.bh r3 = com.google.android.apps.gsa.assistant.settings.features.av.bh.c     // Catch:{ all -> 0x011c }
        L_0x0058:
            java.lang.String r4 = ""
            int r5 = r3.a     // Catch:{ all -> 0x011c }
            if (r5 != r2) goto L_0x0063
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x011c }
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x011c }
        L_0x0063:
            r0.putString(r1, r4)     // Catch:{ all -> 0x011c }
        L_0x0066:
            com.google.android.apps.gsa.opaonboarding.am r1 = com.google.android.apps.gsa.opaonboarding.C83880an.m133553o()     // Catch:{ all -> 0x011c }
            java.lang.String r3 = r8.f283649c     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.opaonboarding.e r4 = new com.google.android.apps.gsa.opaonboarding.e     // Catch:{ all -> 0x011c }
            r5 = 0
            r6 = 1
            r4.<init>(r6, r3, r5)     // Catch:{ all -> 0x011c }
            r3 = r1
            com.google.android.apps.gsa.opaonboarding.g r3 = (com.google.android.apps.gsa.opaonboarding.C83940g) r3     // Catch:{ all -> 0x011c }
            r3.f228607c = r4     // Catch:{ all -> 0x011c }
            r1.mo77225e(r2)     // Catch:{ all -> 0x011c }
            java.lang.String r3 = "AvocadoOnboarding.SLA"
            r4 = r1
            com.google.android.apps.gsa.opaonboarding.g r4 = (com.google.android.apps.gsa.opaonboarding.C83940g) r4     // Catch:{ all -> 0x011c }
            r4.f228605a = r3     // Catch:{ all -> 0x011c }
            com.google.common.o.a.w r3 = com.google.common.p4552o.p4553a.C59567w.f158058g     // Catch:{ all -> 0x011c }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x011c }
            com.google.common.o.a.v r3 = (com.google.common.p4552o.p4553a.C59566v) r3     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.h.s.u r4 = r8.f283651e     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.assistant.b.a.b r4 = r4.mo70883a()     // Catch:{ all -> 0x011c }
            r3.copyOnWrite()     // Catch:{ all -> 0x011c }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x011c }
            com.google.common.o.a.w r5 = (com.google.common.p4552o.p4553a.C59567w) r5     // Catch:{ all -> 0x011c }
            int r4 = r4.f32835aq     // Catch:{ all -> 0x011c }
            r5.f158062c = r4     // Catch:{ all -> 0x011c }
            int r4 = r5.f158060a     // Catch:{ all -> 0x011c }
            r4 = r4 | r2
            r5.f158060a = r4     // Catch:{ all -> 0x011c }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x011c }
            com.google.common.o.a.w r3 = (com.google.common.p4552o.p4553a.C59567w) r3     // Catch:{ all -> 0x011c }
            r1.mo77222b(r3)     // Catch:{ all -> 0x011c }
            r3 = r1
            com.google.android.apps.gsa.opaonboarding.g r3 = (com.google.android.apps.gsa.opaonboarding.C83940g) r3     // Catch:{ all -> 0x011c }
            r3.f228606b = r0     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r0 = r8.f283653g     // Catch:{ all -> 0x011c }
            boolean r0 = r0.mo92334g()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x0109
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.s r0 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s.f257652e     // Catch:{ all -> 0x011c }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.p r0 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92392p) r0     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.h.s.u r3 = r8.f283651e     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.o r3 = r3.mo70889g()     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x00d4
            r0.copyOnWrite()     // Catch:{ all -> 0x011c }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.s r4 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s) r4     // Catch:{ all -> 0x011c }
            r4.f257655b = r3     // Catch:{ all -> 0x011c }
            int r3 = r4.f257654a     // Catch:{ all -> 0x011c }
            r3 = r3 | r6
            r4.f257654a = r3     // Catch:{ all -> 0x011c }
        L_0x00d4:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r3 = r8.f283653g     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.opaonboarding.d.v r3 = r3.mo92328a()     // Catch:{ all -> 0x011c }
            r0.copyOnWrite()     // Catch:{ all -> 0x011c }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.s r4 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s) r4     // Catch:{ all -> 0x011c }
            r3.getClass()     // Catch:{ all -> 0x011c }
            r4.f257656c = r3     // Catch:{ all -> 0x011c }
            int r3 = r4.f257654a     // Catch:{ all -> 0x011c }
            r2 = r2 | r3
            r4.f257654a = r2     // Catch:{ all -> 0x011c }
            r0.copyOnWrite()     // Catch:{ all -> 0x011c }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.s r2 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s) r2     // Catch:{ all -> 0x011c }
            r3 = 4
            r2.f257657d = r3     // Catch:{ all -> 0x011c }
            int r4 = r2.f257654a     // Catch:{ all -> 0x011c }
            r3 = r3 | r4
            r2.f257654a = r3     // Catch:{ all -> 0x011c }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.s r0 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s) r0     // Catch:{ all -> 0x011c }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)     // Catch:{ all -> 0x011c }
            r2 = r1
            com.google.android.apps.gsa.opaonboarding.g r2 = (com.google.android.apps.gsa.opaonboarding.C83940g) r2     // Catch:{ all -> 0x011c }
            r2.f228609e = r0     // Catch:{ all -> 0x011c }
        L_0x0109:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.al r8 = r8.f283648b     // Catch:{ all -> 0x011c }
            com.google.android.apps.gsa.opaonboarding.an r0 = r1.mo77221a()     // Catch:{ all -> 0x011c }
            android.content.Intent r0 = r0.mo77240n()     // Catch:{ all -> 0x011c }
            r1 = 1024(0x400, float:1.435E-42)
            r8.startActivityForResult(r0, r1)     // Catch:{ all -> 0x011c }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x011c:
            r8 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101647ak.m168144a(r8, r0)
        L_0x0125:
            goto L_0x0127
        L_0x0126:
            throw r8
        L_0x0127:
            goto L_0x0126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101648al.onCreate(android.os.Bundle):void");
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283645d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283645d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.fragment_avocado_launcher, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f283645d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283645d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283645d.mo51376d();
        try {
            super.onDetach();
            this.f283646e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283645d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283645d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283645d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283645d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283645d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283645d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283645d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101647ak.m168144a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283645d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283645d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283645d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283645d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f283645d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283645d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283645d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f283645d.mo51381i();
        try {
            if (!this.f283646e) {
                super.onAttach(context);
                if (this.f283642a == null) {
                    Object jN = mo92503b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101648al) {
                        C101648al alVar = (C101648al) fragment;
                        C68225k.m98532d(alVar);
                        this.f283642a = new C101649am(alVar, (String) ((C74178nm) jN).f207136c.f205595br.mo17428b(), ((C74178nm) jN).mo70080v(), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (C92371d) ((C74178nm) jN).f207130a.a.f202806dy.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283645d, this.f283644c));
                    } else {
                        String obj = C101649am.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283645d;
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
                C101647ak.m168144a(th, th2);
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
