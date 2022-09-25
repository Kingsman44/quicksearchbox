package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108324em;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108392h;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108419i;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108434io;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108435ip;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108446j;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108473k;
import com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxBackgroundColorSpan;
import com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxUnderlineSpan;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113716d;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110426a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113197da;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3921j.p3922a.C51654l;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.aa */
/* compiled from: PG */
public final class C113926aa implements C113716d {

    /* renamed from: D */
    private static final Interpolator f315485D = C91107f.m148859b(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: a */
    public static final C59071e f315486a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.aa");

    /* renamed from: A */
    public final C113936ak f315487A;

    /* renamed from: B */
    public final C113937al f315488B;

    /* renamed from: C */
    public final C113938am f315489C;

    /* renamed from: E */
    private final C110426a f315490E;

    /* renamed from: F */
    private final Animator f315491F;

    /* renamed from: G */
    private final Animator f315492G;

    /* renamed from: H */
    private final Animator f315493H;

    /* renamed from: I */
    private final Animator f315494I;

    /* renamed from: J */
    private final Animator f315495J;

    /* renamed from: K */
    private final Animator f315496K;

    /* renamed from: L */
    private final Animator f315497L;

    /* renamed from: M */
    private final Animator f315498M;

    /* renamed from: N */
    private final Animator f315499N;

    /* renamed from: O */
    private final Animator f315500O;

    /* renamed from: P */
    private final C113916t f315501P;

    /* renamed from: Q */
    private final boolean f315502Q;

    /* renamed from: R */
    private final ContextThemeWrapper f315503R;

    /* renamed from: S */
    private final boolean f315504S;

    /* renamed from: T */
    private boolean f315505T;

    /* renamed from: U */
    private boolean f315506U;

    /* renamed from: V */
    private boolean f315507V;

    /* renamed from: W */
    private boolean f315508W;

    /* renamed from: X */
    private int f315509X = 0;

    /* renamed from: Y */
    private int f315510Y = 1;

    /* renamed from: Z */
    private final C104149a f315511Z;

    /* renamed from: aa */
    private final C113197da f315512aa;

    /* renamed from: b */
    public C51656n f315513b;

    /* renamed from: c */
    public final C86124t f315514c;

    /* renamed from: d */
    final ViewGroup f315515d;

    /* renamed from: e */
    final RecyclerView f315516e;

    /* renamed from: f */
    final ViewGroup f315517f;

    /* renamed from: g */
    final StreamingTextView f315518g;

    /* renamed from: h */
    C108473k f315519h;

    /* renamed from: i */
    final Optional f315520i;

    /* renamed from: j */
    Optional f315521j = Optional.empty();

    /* renamed from: k */
    final Optional f315522k;

    /* renamed from: l */
    final Optional f315523l;

    /* renamed from: m */
    final Optional f315524m;

    /* renamed from: n */
    public final LayoutInflater f315525n;

    /* renamed from: o */
    public final Context f315526o;

    /* renamed from: p */
    Animator f315527p;

    /* renamed from: q */
    Animator f315528q;

    /* renamed from: r */
    public final Animator f315529r;

    /* renamed from: s */
    public final Animator f315530s;

    /* renamed from: t */
    public final C91097g f315531t;

    /* renamed from: u */
    public final boolean f315532u;

    /* renamed from: v */
    public final boolean f315533v;

    /* renamed from: w */
    public Optional f315534w = Optional.empty();

    /* renamed from: x */
    public Optional f315535x = Optional.empty();

    /* renamed from: y */
    public boolean f315536y;

    /* renamed from: z */
    public CharSequence f315537z = BuildConfig.FLAVOR;

    public C113926aa(C113936ak akVar, C113937al alVar, C113938am amVar, C108423id idVar, C110426a aVar, C91097g gVar, boolean z, Activity activity, C86124t tVar, C104149a aVar2, C81517a aVar3, C113197da daVar, C108324em emVar, C108321ej ejVar, C113916t tVar2) {
        MovementMethod movementMethod;
        boolean z2;
        C108423id idVar2 = idVar;
        C91097g gVar2 = gVar;
        boolean z3 = z;
        Activity activity2 = activity;
        C86124t tVar3 = tVar;
        C104149a aVar4 = aVar2;
        C108324em emVar2 = emVar;
        C108321ej ejVar2 = ejVar;
        this.f315487A = akVar;
        this.f315488B = alVar;
        this.f315489C = amVar;
        this.f315526o = activity2;
        this.f315514c = tVar3;
        this.f315511Z = aVar4;
        this.f315512aa = daVar;
        this.f315531t = gVar2;
        this.f315501P = tVar2;
        ContextThemeWrapper a = C108435ip.m180256a(aVar4, activity2);
        this.f315503R = a;
        this.f315502Q = z3;
        this.f315532u = z3 && tVar3.mo79746e(C90029ch.f248243ad);
        this.f315533v = z3;
        LayoutInflater from = LayoutInflater.from(a);
        this.f315525n = from;
        ViewGroup viewGroup = (ViewGroup) from.inflate(true != z3 ? R.layout.interaction_container : R.layout.interaction_container_with_combobox, (ViewGroup) null);
        this.f315515d = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.suggestion_container);
        this.f315516e = recyclerView;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
        if (tVar3.mo79746e(C90029ch.f248267ba)) {
            layoutParams.removeRule(21);
            layoutParams.addRule(14);
        }
        this.f315523l = Optional.m71637of((TextView) viewGroup.findViewById(R.id.suggestion_disclosure));
        this.f315524m = Optional.m71637of((TextView) viewGroup.findViewById(R.id.suggestion_description));
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.app_search_container);
        this.f315517f = viewGroup2;
        StreamingTextView streamingTextView = (StreamingTextView) viewGroup.findViewById(R.id.transcription_streaming_text);
        this.f315518g = streamingTextView;
        if (tVar3.mo79746e(C90029ch.f248302q)) {
            streamingTextView.setVisibility(0);
        }
        boolean z4 = aVar3.mo75125b() == 2 || tVar3.mo79746e(C90029ch.f248283bq);
        this.f315504S = z4;
        if (z4 || tVar3.mo79746e(C90029ch.f248253an)) {
            viewGroup.addOnLayoutChangeListener(new C114082k(this));
            int b = (int) C91115n.m148870b(4.0f, activity2);
            streamingTextView.setPadding(b, streamingTextView.getPaddingTop(), b, streamingTextView.getPaddingBottom());
        }
        Optional ofNullable = Optional.ofNullable((ImageView) viewGroup.findViewById(R.id.transcription_edit_text_icon));
        this.f315522k = ofNullable;
        ofNullable.ifPresent(new C114083l(this, emVar2));
        Optional ofNullable2 = Optional.ofNullable((ViewGroup) viewGroup.findViewById(R.id.rich_suggestion_overlay));
        this.f315520i = ofNullable2;
        if (streamingTextView != null) {
            if (z3) {
                movementMethod = new C108434io(ejVar2);
            } else {
                movementMethod = new ScrollingMovementMethod();
            }
            streamingTextView.setMovementMethod(movementMethod);
            streamingTextView.f241132b = true;
            streamingTextView.f241131a = activity.getResources().getColor(R.color.transcription_text_pending);
            if (z3) {
                C28292j jVar = new C28292j(127739);
                jVar.mo33795i(5);
                jVar.mo33795i(32);
                jVar.mo33795i(39);
                C28295m.m52919e(streamingTextView, jVar);
                streamingTextView.setOnClickListener(new C89943l(new C114077f(this, emVar2)));
                streamingTextView.setOnLongClickListener(new C114088q(this, ejVar2));
                if (tVar3.mo79746e(C90029ch.f248246ag)) {
                    z2 = true;
                    this.f315505T = true;
                } else {
                    z2 = true;
                }
                if (tVar3.mo79746e(C90029ch.f248247ah)) {
                    this.f315507V = z2;
                }
                if (tVar3.mo79746e(C90029ch.f248245af)) {
                    this.f315508W = z2;
                }
                if (aVar2.mo93971b()) {
                    this.f315509X = C19391a.m36980a(a, R.attr.colorPrimary);
                } else {
                    this.f315509X = a.getColor(R.color.combobox_transcription_highlight);
                }
            }
        }
        if (tVar3.mo79746e(C90014bt.f247609kQ)) {
            C108473k kVar = new C108473k(activity.getApplicationContext(), gVar2);
            this.f315519h = kVar;
            kVar.f301710d = viewGroup2;
            View findViewById = kVar.f301710d.findViewById(R.id.search_in_google);
            C28292j jVar2 = new C28292j(92840);
            aqp aqp = jVar2.f76974b;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs aqs2 = aqs.f159780k;
            aqs.f159782a |= 2;
            aqs.f159784c = 0;
            jVar2.mo33795i(5);
            C28295m.m52919e(findViewById, jVar2);
            findViewById.setOnClickListener(new C89943l(new C108392h(kVar)));
            View findViewById2 = kVar.f301710d.findViewById(R.id.search_in_youtube);
            C28292j jVar3 = new C28292j(92840);
            aqp aqp2 = jVar3.f76974b;
            aqp2.copyOnWrite();
            aqs aqs3 = (aqs) aqp2.instance;
            aqs3.f159782a |= 2;
            aqs3.f159784c = 1;
            jVar3.mo33795i(5);
            C28295m.m52919e(findViewById2, jVar3);
            findViewById2.setOnClickListener(new C89943l(new C108419i(kVar)));
            View findViewById3 = kVar.f301710d.findViewById(R.id.search_in_maps);
            C28292j jVar4 = new C28292j(92840);
            aqp aqp3 = jVar4.f76974b;
            aqp3.copyOnWrite();
            aqs aqs4 = (aqs) aqp3.instance;
            aqs4.f159782a |= 2;
            aqs4.f159784c = 2;
            jVar4.mo33795i(5);
            C28295m.m52919e(findViewById3, jVar4);
            findViewById3.setOnClickListener(new C89943l(new C108446j(kVar)));
        }
        idVar2.mo96869o(recyclerView);
        recyclerView.setAdapter(idVar2);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity2, 0, false));
        this.f315490E = aVar;
        ObjectAnimator e = mo100781e(viewGroup);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.setStartDelay(50);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{e, ofFloat});
        Interpolator interpolator = f315485D;
        animatorSet.setInterpolator(interpolator);
        animatorSet.addListener(new C114158w(this, viewGroup));
        this.f315527p = animatorSet;
        ObjectAnimator d = mo100780d(viewGroup);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(200);
        ofFloat2.setStartDelay(30);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{d, ofFloat2});
        animatorSet2.setInterpolator(interpolator);
        animatorSet2.addListener(new C114159x(this, viewGroup));
        this.f315528q = animatorSet2;
        this.f315491F = C114034q.m188805a(recyclerView, new C114160y(recyclerView, true));
        this.f315492G = C114034q.m188806b(recyclerView, new C114161z(recyclerView, this, true));
        this.f315493H = C114034q.m188805a(recyclerView, new C114160y(recyclerView, false));
        this.f315494I = C114034q.m188806b(recyclerView, new C114161z(recyclerView, this, false));
        this.f315529r = C114034q.m188805a(streamingTextView, new C114160y(streamingTextView, true));
        this.f315530s = C114034q.m188806b(streamingTextView, new C114161z(streamingTextView, this, true));
        this.f315495J = C114034q.m188805a(streamingTextView, new C114160y(streamingTextView, false));
        this.f315496K = C114034q.m188806b(streamingTextView, new C114161z(streamingTextView, this, false));
        this.f315497L = C114034q.m188805a(viewGroup2, new C114160y(viewGroup2, true));
        this.f315498M = C114034q.m188806b(viewGroup2, new C114161z(viewGroup2, this, true));
        this.f315499N = C114034q.m188805a(viewGroup2, new C114160y(viewGroup2, true));
        this.f315500O = C114034q.m188806b(viewGroup2, new C114161z(viewGroup2, this, true));
        if (ofNullable2.isPresent()) {
            ViewGroup viewGroup3 = (ViewGroup) ofNullable2.get();
            this.f315534w = Optional.m71637of(C114034q.m188805a(viewGroup3, new C114090s(this, viewGroup3)));
            this.f315535x = Optional.m71637of(C114034q.m188806b(viewGroup3, new C114091t(this, viewGroup3, this)));
        }
    }

    /* renamed from: A */
    private final void m188634A(boolean z) {
        if (z) {
            if (this.f315498M.isStarted()) {
                this.f315498M.cancel();
            }
            C114034q.m188817m(this.f315517f, this.f315499N, this.f315500O);
            return;
        }
        if (this.f315497L.isStarted()) {
            this.f315497L.cancel();
        }
        C114034q.m188811g(this.f315517f, this.f315499N, this.f315500O);
    }

    /* renamed from: B */
    private final void m188635B(boolean z) {
        boolean z2 = true;
        if (!z) {
            C113916t tVar = this.f315501P;
            if (this.f315510Y == 3) {
                z2 = false;
            }
            tVar.mo100769m(z2);
            this.f315510Y = 3;
            if (this.f315491F.isStarted()) {
                this.f315491F.cancel();
            }
            C114034q.m188811g(this.f315516e, this.f315493H, this.f315494I);
        } else if (!mo100801y()) {
            C113916t tVar2 = this.f315501P;
            if (this.f315510Y == 2) {
                z2 = false;
            }
            tVar2.mo100770n(z2);
            this.f315510Y = 2;
            if (this.f315492G.isStarted()) {
                this.f315492G.cancel();
            }
            C114034q.m188817m(this.f315516e, this.f315493H, this.f315494I);
        }
    }

    /* renamed from: a */
    public final int mo100572a() {
        if (!this.f315514c.mo79746e(C90014bt.f247206cl)) {
            ViewGroup viewGroup = this.f315515d;
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) viewGroup.getParent()).getWidth(), 1073741824), -2);
        }
        return this.f315515d.getMeasuredHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r1 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id) r7.f315516e.mAdapter;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo100573b() {
        /*
            r7 = this;
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r0 = r7.f315518g
            int r0 = r0.getVisibility()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r0 = 0
            goto L_0x0013
        L_0x000d:
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r0 = r7.f315518g
            int r0 = r0.getMeasuredHeight()
        L_0x0013:
            boolean r1 = r7.mo100802z()
            if (r1 == 0) goto L_0x0035
            android.support.v7.widget.RecyclerView r1 = r7.f315516e
            android.support.v7.widget.fb r1 = r1.mAdapter
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r1 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id) r1
            if (r1 == 0) goto L_0x0035
            int r1 = r1.getItemCount()
            if (r1 <= 0) goto L_0x0035
            android.content.Context r1 = r7.f315526o
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131169228(0x7f070fcc, float:1.795278E38)
            int r1 = r1.getDimensionPixelOffset(r3)
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            boolean r3 = r7.f315502Q
            r4 = 1
            if (r4 == r3) goto L_0x003d
            r3 = r0
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            int r3 = java.lang.Math.max(r1, r3)
            boolean r5 = r7.f315502Q
            if (r5 == 0) goto L_0x0054
            android.content.Context r5 = r7.f315526o
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131172826(0x7f071dda, float:1.7960078E38)
            int r5 = r5.getDimensionPixelOffset(r6)
            int r3 = r3 + r5
        L_0x0054:
            boolean r5 = r7.mo100801y()
            if (r5 == 0) goto L_0x0072
            boolean r5 = r7.f315502Q
            if (r4 != r5) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r0
        L_0x0060:
            int r0 = java.lang.Math.max(r1, r2)
            int r3 = r3 - r0
            j$.util.Optional r0 = r7.f315520i
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
        L_0x0072:
            android.view.ViewGroup r0 = r7.f315515d
            r1 = 2131434117(0x7f0b1a85, float:1.8490039E38)
            android.view.View r0 = r0.findViewById(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)
            boolean r1 = r7.f315504S
            if (r1 == 0) goto L_0x00a0
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            boolean r1 = r1.isShown()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
        L_0x00a0:
            android.view.ViewGroup r0 = r7.f315515d
            r1 = 2131434070(0x7f0b1a56, float:1.8489944E38)
            android.view.View r0 = r0.findViewById(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)
            boolean r1 = r7.f315504S
            if (r1 == 0) goto L_0x00ce
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x00ce
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            boolean r1 = r1.isShown()
            if (r1 == 0) goto L_0x00ce
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
        L_0x00ce:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C113926aa.mo100573b():int");
    }

    /* renamed from: c */
    public final boolean mo100574c() {
        return (this.f315515d.isShown() || this.f315527p.isStarted()) && !this.f315528q.isStarted();
    }

    /* renamed from: d */
    public final ObjectAnimator mo100780d(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f, this.f315526o.getResources().getDimension(R.dimen.suggestion_carousel_slide_down)});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(f315485D);
        return ofFloat;
    }

    /* renamed from: e */
    public final ObjectAnimator mo100781e(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{this.f315526o.getResources().getDimension(R.dimen.suggestion_carousel_slide_up), 0.0f});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(f315485D);
        return ofFloat;
    }

    /* renamed from: f */
    public final void mo100782f(boolean z) {
        C108473k kVar;
        if (!z) {
            m188634A(false);
            m188635B(false);
        } else if (!this.f315514c.mo79746e(C90014bt.f247609kQ) || (kVar = this.f315519h) == null || !kVar.f301711e || !kVar.mo96899a() || TextUtils.isEmpty(kVar.f301709c)) {
            m188634A(false);
            m188635B(true);
        } else {
            m188635B(false);
            m188634A(true);
        }
    }

    /* renamed from: g */
    public final void mo100783g(boolean z) {
        if (z) {
            if (this.f315530s.isStarted()) {
                this.f315530s.cancel();
            }
            C114034q.m188817m(this.f315518g, this.f315495J, this.f315496K);
            mo100795s();
            return;
        }
        if (this.f315529r.isStarted()) {
            this.f315529r.cancel();
        }
        C114034q.m188811g(this.f315518g, this.f315495J, this.f315496K);
        mo100785i();
    }

    /* renamed from: h */
    public final void mo100784h() {
        if (this.f315499N.isStarted()) {
            this.f315500O.cancel();
        }
        C114034q.m188811g(this.f315517f, this.f315497L, this.f315498M);
    }

    /* renamed from: i */
    public final void mo100785i() {
        if (this.f315505T && this.f315506U) {
            this.f315522k.ifPresent(C114081j.f316086a);
            this.f315506U = false;
        }
    }

    /* renamed from: j */
    public final void mo100786j(boolean z) {
        this.f315501P.mo100769m(this.f315510Y != 3);
        this.f315510Y = 3;
        C114034q.m188812h(this.f315527p);
        if (!this.f315515d.isShown()) {
            return;
        }
        if (z) {
            C114034q.m188812h(this.f315528q);
            this.f315515d.setVisibility(8);
            C113936ak akVar = this.f315487A;
            this.f315515d.isShown();
            akVar.f315557a.mo95365G();
            return;
        }
        C114034q.m188815k(this.f315528q);
    }

    /* renamed from: k */
    public final void mo100787k() {
        if ((this.f315532u || this.f315514c.mo79746e(C90014bt.f247793np)) && this.f315520i.isPresent()) {
            C114034q.m188811g((View) this.f315520i.get(), (Animator) this.f315534w.get(), (Animator) this.f315535x.get());
        }
    }

    /* renamed from: l */
    public final void mo100788l() {
        this.f315501P.mo100769m(this.f315510Y != 3);
        this.f315510Y = 3;
        if (this.f315493H.isStarted()) {
            this.f315494I.cancel();
        }
        C114034q.m188811g(this.f315516e, this.f315491F, this.f315492G);
        this.f315523l.ifPresent(C114085n.f316091a);
        this.f315524m.ifPresent(C114086o.f316092a);
    }

    /* renamed from: m */
    public final void mo100789m() {
        C114034q.m188811g(this.f315518g, this.f315529r, this.f315530s);
        mo100785i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100790n(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.CharSequence r0 = r7.f315537z
            r1 = r0
            android.text.Spannable r1 = (android.text.Spannable) r1
            int r0 = r0.length()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxUnderlineSpan> r2 = com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxUnderlineSpan.class
            r3 = 0
            java.lang.Object[] r0 = r1.getSpans(r3, r0, r2)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxUnderlineSpan[] r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxUnderlineSpan[]) r0
            r1 = 1
            if (r0 == 0) goto L_0x0030
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0030
            r4 = 0
        L_0x0019:
            if (r4 >= r2) goto L_0x0030
            r5 = r0[r4]
            com.google.assistant.e.j.a.m r5 = r5.f300888a
            if (r5 == 0) goto L_0x002d
            int r6 = r5.f134594d
            int r6 = com.google.assistant.p3897e.p3921j.p3922a.C51654l.m86264a(r6)
            if (r6 != 0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            if (r6 == r1) goto L_0x002d
            goto L_0x005f
        L_0x002d:
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0030:
            java.lang.CharSequence r0 = r7.f315537z
            r2 = r0
            android.text.Spannable r2 = (android.text.Spannable) r2
            int r0 = r0.length()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxBackgroundColorSpan> r4 = com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxBackgroundColorSpan.class
            java.lang.Object[] r0 = r2.getSpans(r3, r0, r4)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxBackgroundColorSpan[] r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxBackgroundColorSpan[]) r0
            r5 = 0
            if (r0 == 0) goto L_0x005f
            int r2 = r0.length
            if (r2 <= 0) goto L_0x005f
        L_0x0047:
            if (r3 >= r2) goto L_0x005f
            r4 = r0[r3]
            com.google.assistant.e.j.a.m r4 = r4.f300887a
            if (r4 == 0) goto L_0x005c
            int r6 = r4.f134594d
            int r6 = com.google.assistant.p3897e.p3921j.p3922a.C51654l.m86264a(r6)
            if (r6 != 0) goto L_0x0058
            goto L_0x005c
        L_0x0058:
            if (r6 == r1) goto L_0x005c
            r5 = r4
            goto L_0x005f
        L_0x005c:
            int r3 = r3 + 1
            goto L_0x0047
        L_0x005f:
            if (r5 == 0) goto L_0x00b4
            boolean r0 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108322ek
            if (r0 == 0) goto L_0x008b
            r0 = r8
            com.google.android.apps.gsa.staticplugins.opa.chatui.ek r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108322ek) r0
            com.google.android.apps.gsa.shared.util.as r1 = new com.google.android.apps.gsa.shared.util.as
            int r2 = r5.f134592b
            int r3 = r5.f134593c
            r1.<init>(r2, r3)
            r0.mo96783c(r1)
            com.google.protobuf.cq r1 = r5.f134596f
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.g r2 = com.google.android.apps.gsa.staticplugins.opa.valyrian.C114078g.f316083a
            j$.util.stream.Stream r1 = r1.map(r2)
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            r0.mo96782b(r1)
        L_0x008b:
            boolean r0 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108319eh
            if (r0 == 0) goto L_0x00b4
            com.google.android.apps.gsa.staticplugins.opa.chatui.eh r8 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108319eh) r8
            com.google.android.apps.gsa.shared.util.as r0 = new com.google.android.apps.gsa.shared.util.as
            int r1 = r5.f134592b
            int r2 = r5.f134593c
            r0.<init>(r1, r2)
            r8.mo96776c(r0)
            com.google.protobuf.cq r0 = r5.f134596f
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.h r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.C114079h.f316084a
            j$.util.stream.Stream r0 = r0.map(r1)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            r8.mo96775b(r0)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C113926aa.mo100790n(java.lang.Object):void");
    }

    /* renamed from: o */
    public final void mo100791o() {
        if (this.f315532u && this.f315520i.isPresent() && this.f315521j.isPresent()) {
            ((ViewGroup) this.f315520i.get()).removeView((View) this.f315521j.get());
            this.f315521j = Optional.empty();
        }
    }

    /* renamed from: p */
    public final void mo100792p(SpannableStringBuilder spannableStringBuilder, int i, int i2, C51655m mVar) {
        int a;
        int i3 = 0;
        boolean z = true;
        if ((mVar == null || !((a = C51654l.m86264a(mVar.f134594d)) == 0 || a == 1)) && (this.f315507V || this.f315508W)) {
            z = false;
        }
        if (this.f315508W || z) {
            if (!z) {
                i3 = this.f315509X;
            }
            spannableStringBuilder.setSpan(new ComboBoxBackgroundColorSpan(i3, mVar), i, i2, 17);
            if (!z && this.f315511Z.mo93971b()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C19391a.m36980a(this.f315503R, R.attr.colorOnPrimary)), i, i2, 17);
            }
        }
        if (this.f315507V && !z) {
            spannableStringBuilder.setSpan(new ComboBoxUnderlineSpan(mVar), i, i2, 17);
        }
    }

    /* renamed from: q */
    public final void mo100793q(String str) {
        this.f315536y = false;
        mo100785i();
        this.f315537z = new SpannableStringBuilder(str);
        mo100799w();
        if (this.f315502Q) {
            C89949q.m146521e(C28285c.m52874a(this.f315518g, 141557), false);
        }
    }

    /* renamed from: r */
    public final void mo100794r() {
        C108473k kVar;
        if (!this.f315514c.mo79746e(C90014bt.f247609kQ) || (kVar = this.f315519h) == null || !kVar.f301711e || !kVar.mo96899a() || TextUtils.isEmpty(kVar.f301709c)) {
            mo100784h();
            mo100798v();
            return;
        }
        mo100788l();
        if (this.f315500O.isStarted()) {
            this.f315500O.cancel();
        }
        C114034q.m188817m(this.f315517f, this.f315497L, this.f315498M);
    }

    /* renamed from: s */
    public final void mo100795s() {
        if (this.f315505T && this.f315536y && !TextUtils.isEmpty(this.f315537z)) {
            this.f315522k.ifPresent(C114087p.f316093a);
            this.f315506U = true;
        }
    }

    /* renamed from: t */
    public final void mo100796t(boolean z) {
        this.f315501P.mo100770n(this.f315510Y != 2);
        this.f315510Y = 2;
        C114034q.m188812h(this.f315528q);
        if (!this.f315515d.isShown() && !this.f315490E.mo96176c() && !this.f315512aa.mo99910a()) {
            if (z) {
                C114034q.m188812h(this.f315527p);
                this.f315515d.setVisibility(0);
                C113936ak akVar = this.f315487A;
                this.f315515d.isShown();
                akVar.f315557a.mo95365G();
                return;
            }
            C114034q.m188815k(this.f315527p);
        }
    }

    /* renamed from: u */
    public final void mo100797u() {
        if (this.f315532u || this.f315514c.mo79746e(C90014bt.f247793np)) {
            this.f315520i.ifPresent(new C114089r(this));
        }
    }

    /* renamed from: v */
    public final void mo100798v() {
        if (!mo100801y()) {
            this.f315501P.mo100770n(this.f315510Y != 2);
            this.f315510Y = 2;
            if (this.f315494I.isStarted()) {
                this.f315494I.cancel();
            }
            C114034q.m188817m(this.f315516e, this.f315491F, this.f315492G);
        }
    }

    /* renamed from: w */
    public final void mo100799w() {
        this.f315518g.mo82924c(this.f315537z);
        if (this.f315533v) {
            this.f315518g.setTextSize(20.0f);
            TextPaint paint = this.f315518g.getPaint();
            int maxWidth = this.f315518g.getMaxWidth();
            int paddingStart = this.f315518g.getPaddingStart();
            if (paint.measureText(this.f315518g.getText(), 0, this.f315518g.getText().length()) > ((float) ((maxWidth - paddingStart) - this.f315518g.getPaddingEnd()))) {
                this.f315518g.setTextSize(16.0f);
            }
        }
    }

    /* renamed from: x */
    public final boolean mo100800x() {
        return (this.f315518g.getVisibility() == 8 && this.f315516e.getVisibility() == 8 && this.f315517f.getVisibility() == 8) ? false : true;
    }

    /* renamed from: y */
    public final boolean mo100801y() {
        if (this.f315520i.isPresent() && ((ViewGroup) this.f315520i.get()).isShown() && !((Animator) this.f315535x.get()).isStarted()) {
            return true;
        }
        if (!this.f315534w.isPresent() || !((Animator) this.f315534w.get()).isStarted()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean mo100802z() {
        return (this.f315516e.isShown() && !this.f315492G.isStarted() && !this.f315494I.isStarted()) || this.f315491F.isStarted() || this.f315493H.isStarted();
    }
}
