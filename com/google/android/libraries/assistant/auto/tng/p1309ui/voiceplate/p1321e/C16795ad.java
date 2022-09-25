package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1745d;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1313b.C16625a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16777c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16828f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16722aj;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16728ap;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16752bm;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16784b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.C16829a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.C16830b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.CarLogoView;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.StreamingTextView;
import com.google.android.libraries.gsa.logoview.C22885a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import com.google.android.libraries.search.p6glow.C39872c;
import com.google.android.libraries.search.p6glow.C39882m;
import com.google.android.libraries.search.p6glow.C39883n;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.ad */
/* compiled from: PG */
public final class C16795ad {

    /* renamed from: a */
    public static final C59071e f49144a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.ad");

    /* renamed from: b */
    public final C16782d f49145b;

    /* renamed from: c */
    public final LayoutInflater f49146c;

    /* renamed from: d */
    public final Optional f49147d;

    /* renamed from: e */
    public final C16821t f49148e;

    /* renamed from: f */
    public final C58495hd f49149f;

    /* renamed from: g */
    public final C69464a f49150g;

    /* renamed from: h */
    public final C69464a f49151h;

    /* renamed from: i */
    public Resources f49152i;

    /* renamed from: j */
    public ObjectAnimator f49153j;

    /* renamed from: k */
    public ViewGroup f49154k;

    /* renamed from: l */
    public C16820s f49155l;

    /* renamed from: m */
    private final int f49156m;

    /* renamed from: n */
    private final int f49157n;

    /* renamed from: o */
    private final C21370a f49158o;

    /* renamed from: p */
    private final C16814m f49159p;

    /* renamed from: q */
    private final C16803b f49160q;

    /* renamed from: r */
    private final C47449e f49161r;

    /* renamed from: s */
    private final Optional f49162s;

    /* renamed from: t */
    private final Optional f49163t;

    /* renamed from: u */
    private final Optional f49164u;

    /* renamed from: v */
    private final C39882m f49165v;

    /* renamed from: w */
    private final C16784b f49166w;

    /* renamed from: x */
    private final boolean f49167x;

    /* renamed from: y */
    private C16813l f49168y;

    /* renamed from: z */
    private C16791a f49169z;

    public C16795ad(C16782d dVar, Resources resources, C22885a aVar, Optional optional, C21370a aVar2, C16814m mVar, C16803b bVar, C16821t tVar, C47449e eVar, C47770dh dhVar, C16828f fVar, Optional optional2, Optional optional3, C69464a aVar3, C69464a aVar4, ViewStub viewStub, C16752bm bmVar, Optional optional4, Optional optional5) {
        C47770dh dhVar2 = dhVar;
        C16828f fVar2 = fVar;
        C16752bm bmVar2 = bmVar;
        this.f49145b = dVar;
        this.f49152i = resources;
        this.f49147d = optional;
        this.f49158o = aVar2;
        this.f49159p = mVar;
        this.f49161r = eVar;
        this.f49162s = optional4;
        this.f49163t = optional5;
        this.f49150g = aVar3;
        this.f49151h = aVar4;
        this.f49164u = optional2;
        viewStub.setLayoutResource(R.layout.fusion_voiceplate);
        ViewGroup viewGroup = (ViewGroup) viewStub.inflate();
        this.f49146c = LayoutInflater.from(viewGroup.getContext());
        View findViewById = viewGroup.findViewById(R.id.scrim);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.voiceplate);
        View findViewById2 = viewGroup.findViewById(R.id.cancel_button);
        TextView textView = (TextView) viewGroup.findViewById(R.id.network_state_text_limited_connectivity);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.non_subscription_text);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.language_unsupported_text);
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.language_preview_tag);
        C16750bk bkVar = bmVar2.f49009e;
        C16722aj ajVar = (bkVar == null ? C16750bk.f48980u : bkVar).f49001t;
        this.f49166w = new C16784b((long) (ajVar == null ? C16722aj.f48891g : ajVar).f48898f);
        if (bmVar2.f49013i) {
            findViewById2.setVisibility(0);
        }
        if (bmVar2.f49014j) {
            Guideline guideline = (Guideline) viewGroup.findViewById(R.id.left_guideline);
            C1745d dVar2 = (C1745d) guideline.getLayoutParams();
            dVar2.f5279c = m33829a(R.dimen.fusion_voiceplate_extended_left_guideline_percentage, viewGroup2);
            guideline.setLayoutParams(dVar2);
            Guideline guideline2 = (Guideline) viewGroup.findViewById(R.id.right_guideline);
            C1745d dVar3 = (C1745d) guideline2.getLayoutParams();
            dVar3.f5279c = m33829a(R.dimen.fusion_voiceplate_extended_right_guideline_percentage, viewGroup2);
            guideline2.setLayoutParams(dVar3);
        }
        if (bmVar2.f49015k) {
            float a = m33829a(R.dimen.fusion_voiceplate_horizontal_bias_driver_side_align_enabled_left, viewGroup);
            float a2 = m33829a(R.dimen.fusion_voiceplate_extended_left_guideline_percentage_driver_side_align_enabled, viewGroup);
            float a3 = m33829a(R.dimen.fusion_voiceplate_extended_right_guideline_percentage_driver_side_align_enabled, viewGroup);
            int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.fusion_voiceplate_max_width_driver_side_align_enabled);
            C1756o oVar = new C1756o();
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
            oVar.mo4889i(constraintLayout);
            oVar.mo4899u(R.id.voiceplate, a);
            oVar.mo4898t(R.id.left_guideline, a2);
            oVar.mo4898t(R.id.right_guideline, a3);
            oVar.mo4894n(R.id.voiceplate, dimensionPixelSize);
            oVar.mo4888h(constraintLayout);
        }
        if (optional4.isPresent()) {
            C28310af d = ((C16777c) optional4.get()).mo22960d();
            C28306ab c = ((C16777c) optional4.get()).mo22959c();
            C58490gz gzVar = new C58490gz(4);
            viewGroup.getClass();
            gzVar.mo55429h(viewGroup, c.mo33801b(viewGroup, d.mo33805a(C28427h.m53115a(128626))));
            findViewById.getClass();
            gzVar.mo55429h(findViewById, c.mo33801b(findViewById, d.mo33805a(C28427h.m53115a(128623))));
            viewGroup2.getClass();
            gzVar.mo55429h(viewGroup2, c.mo33801b(viewGroup2, d.mo33805a(C28427h.m53115a(128624))));
            findViewById2.getClass();
            gzVar.mo55429h(findViewById2, c.mo33801b(findViewById2, d.mo33805a(C28427h.m53115a(139065))));
            this.f49149f = gzVar.mo55427f(false);
        } else {
            this.f49149f = C58729pv.f156485a;
        }
        textView.setText(this.f49152i.getString(R.string.fusion_network_status_poor_signal_strength));
        textView4.setText(this.f49152i.getString(R.string.auto_language_preview));
        textView3.setText(this.f49152i.getString(R.string.language_unsupported_text));
        textView2.setText(this.f49152i.getString(R.string.no_subscription_text));
        boolean z = viewGroup.getResources().getBoolean(R.bool.fusion_voiceplate_should_align);
        C16752bm bmVar3 = bmVar;
        if (!bmVar3.f49015k || !z) {
            this.f49156m = viewGroup2.getResources().getDimensionPixelSize(R.dimen.fusion_voiceplate_margin_bottom);
        } else {
            this.f49156m = viewGroup2.getResources().getDimensionPixelSize(R.dimen.fusion_voiceplate_margin_bottom_driver_side_alignment_enabled);
        }
        this.f49157n = viewGroup2.getResources().getDimensionPixelSize(R.dimen.fusion_voiceplate_margin_bottom_offscreen);
        C16828f fVar3 = fVar;
        Optional optional6 = optional4;
        View view = findViewById2;
        C47770dh dhVar3 = dhVar;
        C16828f fVar4 = fVar;
        fVar4.mo23049a(findViewById, new C47591co(dhVar3, "VoicePlateViewController:scrim#onClick", new C16827z(this, fVar3, optional6, findViewById, dVar)), optional4, Optional.ofNullable((C28439i) this.f49149f.getOrDefault(findViewById, (Object) null)));
        C16792aa aaVar = r0;
        C16792aa aaVar2 = new C16792aa(this, fVar3, optional6, view, dVar);
        fVar4.mo23049a(view, new C47591co(dhVar3, "VoicePlateViewController:cancelButton#onClick", aaVar), optional4, Optional.ofNullable((C28439i) this.f49149f.getOrDefault(view, (Object) null)));
        C16750bk bkVar2 = bmVar3.f49009e;
        C16722aj ajVar2 = (bkVar2 == null ? C16750bk.f48980u : bkVar2).f49001t;
        ajVar2 = ajVar2 == null ? C16722aj.f48891g : ajVar2;
        boolean z2 = ajVar2.f48894b;
        this.f49167x = z2;
        if (!z2 || !optional3.isPresent()) {
            this.f49165v = null;
            CarLogoView carLogoView = (CarLogoView) viewGroup.findViewById(R.id.logo);
            carLogoView.setVisibility(0);
            carLogoView.f63000g.mo28247c(aVar, 2);
            C16750bk bkVar3 = bmVar3.f49009e;
            int i = (bkVar3 == null ? C16750bk.f48980u : bkVar3).f48984c;
            List<C16830b> list = carLogoView.f49279a;
            if (list != null) {
                for (C16830b bVar2 : list) {
                    C16829a aVar5 = bVar2.f49290a;
                    if (aVar5 != null) {
                        aVar5.f49286a = i;
                    }
                }
            }
            carLogoView.mo28223c(46.0f, 46.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) carLogoView.getLayoutParams();
            layoutParams.gravity = (true != bmVar3.f49006b ? 1 : 8388611) | 80;
            carLogoView.setLayoutParams(layoutParams);
        } else {
            AssistantP6GlowView assistantP6GlowView = (AssistantP6GlowView) viewGroup.findViewById(R.id.assistant_p6glow_glow_view);
            assistantP6GlowView.setVisibility(0);
            StreamingTextView streamingTextView = (StreamingTextView) viewGroup.findViewById(R.id.query_transcript);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) streamingTextView.getLayoutParams();
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            streamingTextView.setPadding(0, 0, 0, 0);
            streamingTextView.setGravity(17);
            C1756o oVar2 = new C1756o();
            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewGroup;
            oVar2.mo4889i(constraintLayout2);
            oVar2.mo4891k(R.id.query_transcript, 7, 0, 7);
            oVar2.mo4888h(constraintLayout2);
            assistantP6GlowView.mo42036m(C39883n.LINE);
            C39882m mVar2 = new C39882m(assistantP6GlowView, (C147783f) optional3.get(), new C16794ac(), 1.0f, 1.0f, 1.0f, 1.0f, Duration.ofMillis((long) (1000 / ajVar2.f48895c)), Duration.ofMillis((long) (1000 / ajVar2.f48896d)), Duration.ofMillis((long) (1000 / ajVar2.f48897e)));
            this.f49165v = mVar2;
            mVar2.mo42063b(C39872c.GONE);
            aVar.mo24646a();
        }
        ((ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams()).bottomMargin = this.f49157n;
        findViewById.setVisibility(4);
        ((ViewGroup) viewGroup.findViewById(R.id.immersive_container)).setVerticalScrollbarPosition(1);
        viewGroup2.setClipToOutline(true);
        if (optional2.isPresent()) {
            CarLogoView carLogoView2 = (CarLogoView) viewGroup.findViewById(R.id.logo);
            Optional optional7 = this.f49164u;
            optional7.getClass();
            if (!optional7.isPresent() || !((C16625a) this.f49164u.get()).mo22939c()) {
                viewGroup.findViewById(R.id.powered_by_intro_container).setVisibility(8);
                ((C16625a) optional2.get()).mo22940d();
            } else {
                viewGroup.findViewById(R.id.powered_by_intro_container).setVisibility(0);
                ((TextView) viewGroup.findViewById(R.id.powered_by_text)).setText(((C16625a) optional2.get()).mo22938b());
                ((ImageView) viewGroup.findViewById(R.id.powered_by_logo)).setImageDrawable(((C16625a) optional2.get()).mo22937a());
                ((C16625a) optional2.get()).mo22940d();
            }
        }
        this.f49160q = bVar;
        this.f49148e = tVar;
        this.f49154k = viewGroup;
    }

    /* renamed from: a */
    public static float m33829a(int i, View view) {
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    /* renamed from: f */
    private final void m33830f() {
        mo23020b().findViewById(R.id.cancel_button).requestFocus();
    }

    /* renamed from: b */
    public final ViewGroup mo23020b() {
        return (ViewGroup) Objects.requireNonNull(this.f49154k);
    }

    /* renamed from: c */
    public final void mo23021c(C16750bk bkVar, View view) {
        C16730ar a = C16730ar.m33788a(bkVar.f48986e);
        if (a == null) {
            a = C16730ar.ASSUMING_GOOD_NETWORK;
        }
        if (a == C16730ar.ASSUMING_GOOD_NETWORK) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = 0;
            view.setLayoutParams(layoutParams);
        }
        view.setVisibility(0);
        mo23020b().findViewById(R.id.network_state_progress_bar).setVisibility(8);
    }

    /* renamed from: d */
    public final void mo23022d(C16752bm bmVar, C16752bm bmVar2) {
        View findViewById = mo23020b().findViewById(R.id.network_state_bar_fill);
        C16728ap apVar = bmVar2.f49016l;
        if (apVar == null) {
            apVar = C16728ap.f48926d;
        }
        if (apVar.f48929b) {
            ObjectAnimator objectAnimator = this.f49153j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ProgressBar progressBar = (ProgressBar) mo23020b().findViewById(R.id.network_state_progress_bar);
            progressBar.setProgress(progressBar.getMax(), true);
            progressBar.setVisibility(0);
            findViewById.setVisibility(8);
            return;
        }
        C16750bk bkVar = bmVar.f49009e;
        if (bkVar == null) {
            bkVar = C16750bk.f48980u;
        }
        mo23021c(bkVar, findViewById);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02e9, code lost:
        if ((r13.mo26870b() - r11.f49282c) >= 80) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0777, code lost:
        if (r8 != false) goto L_0x0779;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x06b3  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x06cc  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x06d2  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0762  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0765  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0775  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0787  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0790  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x07b6  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x07ec  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0801  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0809  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0813  */
    /* JADX WARNING: Removed duplicated region for block: B:452:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x013f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23023e(android.transition.Transition r33, com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16752bm r34, com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16752bm r35) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            android.view.ViewGroup r4 = r32.mo23020b()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r5 = r2.f49009e
            if (r5 != 0) goto L_0x0012
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk.f48980u
        L_0x0012:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r6 = r3.f49009e
            if (r6 != 0) goto L_0x0018
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk.f48980u
        L_0x0018:
            if (r1 == 0) goto L_0x001d
            android.transition.TransitionManager.beginDelayedTransition(r4, r1)
        L_0x001d:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.v r7 = r6.f48990i
            if (r7 != 0) goto L_0x0023
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.v r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16772v.f49081d
        L_0x0023:
            boolean r7 = r7.f49084b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ad r8 = r6.f48997p
            if (r8 != 0) goto L_0x002b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ad r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16716ad.f48880c
        L_0x002b:
            int r8 = r8.f48883b
            int r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16715ac.m33787a(r8)
            r9 = 2
            if (r8 != 0) goto L_0x0036
        L_0x0034:
            r8 = 0
            goto L_0x0039
        L_0x0036:
            if (r8 != r9) goto L_0x0034
            r8 = 1
        L_0x0039:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.an r12 = r6.f48989h
            if (r12 != 0) goto L_0x003f
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.an r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16726an.f48921d
        L_0x003f:
            boolean r12 = r12.f48925c
            int r13 = r6.f48986e
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ar r13 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar.m33788a(r13)
            if (r13 != 0) goto L_0x004b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ar r13 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar.ASSUMING_GOOD_NETWORK
        L_0x004b:
            if (r7 != 0) goto L_0x0053
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ar r14 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar.ASSUMING_GOOD_NETWORK
            if (r13 == r14) goto L_0x0053
            r14 = 1
            goto L_0x0054
        L_0x0053:
            r14 = 0
        L_0x0054:
            r15 = 4
            if (r14 == 0) goto L_0x0075
            int r11 = r6.f48982a
            r17 = r11 & 16
            if (r17 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x0062
            goto L_0x0075
        L_0x0062:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.z r11 = r6.f48995n
            if (r11 != 0) goto L_0x0068
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.z r11 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16776z.f49087c
        L_0x0068:
            int r11 = r11.f49090b
            int r11 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16775y.m33795a(r11)
            if (r11 != 0) goto L_0x0072
        L_0x0070:
            r11 = 1
            goto L_0x0076
        L_0x0072:
            if (r11 == r9) goto L_0x0075
            goto L_0x0070
        L_0x0075:
            r11 = 0
        L_0x0076:
            if (r14 == 0) goto L_0x0080
            int r15 = r6.f48982a
            r15 = r15 & 16
            if (r15 == 0) goto L_0x0080
            r15 = 1
            goto L_0x0081
        L_0x0080:
            r15 = 0
        L_0x0081:
            if (r11 == 0) goto L_0x0087
            if (r15 != 0) goto L_0x0087
            r15 = 1
            goto L_0x0088
        L_0x0087:
            r15 = 0
        L_0x0088:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r9 = r6.f48992k
            if (r9 != 0) goto L_0x008e
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x008e:
            boolean r9 = r9.f48803b
            if (r9 == 0) goto L_0x009e
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r9 = r6.f48992k
            if (r9 != 0) goto L_0x0098
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x0098:
            boolean r9 = r9.f48812k
            if (r9 == 0) goto L_0x009e
            r9 = 1
            goto L_0x009f
        L_0x009e:
            r9 = 0
        L_0x009f:
            boolean r10 = r0.f49167x
            if (r10 == 0) goto L_0x01ad
            android.view.ViewGroup r10 = r32.mo23020b()
            com.google.android.libraries.search.p6glow.m r2 = r0.f49165v
            java.lang.Object r2 = p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.libraries.search.p6glow.m r2 = (com.google.android.libraries.search.p6glow.C39882m) r2
            r24 = r11
            r11 = 2131432996(0x7f0b1624, float:1.8487765E38)
            android.view.View r11 = r10.findViewById(r11)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.CarLogoView r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.CarLogoView) r11
            r25 = r13
            r13 = 8
            r11.setVisibility(r13)
            if (r9 == 0) goto L_0x00e1
            com.google.android.libraries.search.p6glow.c r11 = com.google.android.libraries.search.p6glow.C39872c.GONE
            r2.mo42063b(r11)
            r2 = 2131428768(0x7f0b05a0, float:1.847919E38)
            android.view.View r2 = r10.findViewById(r2)
            com.google.android.libraries.search.p6glow.AssistantP6GlowView r2 = (com.google.android.libraries.search.p6glow.AssistantP6GlowView) r2
            r2.setVisibility(r13)
            r29 = r5
            r30 = r6
            r28 = r8
            r27 = r14
            r8 = 2131437008(0x7f0b25d0, float:1.8495903E38)
            goto L_0x020a
        L_0x00e1:
            com.google.android.libraries.search.p6glow.c[] r11 = com.google.android.libraries.search.p6glow.C39872c.values()
            int r13 = r6.f49000s
            r11 = r11[r13]
            int r13 = r11.ordinal()
            r21 = 0
            if (r13 == 0) goto L_0x017f
            r26 = r11
            r11 = 1
            if (r13 == r11) goto L_0x016d
            r11 = 2
            if (r13 == r11) goto L_0x010e
            r11 = 3
            if (r13 == r11) goto L_0x00fd
            goto L_0x0104
        L_0x00fd:
            r11 = 2131167969(0x7f070ae1, float:1.7950227E38)
            float r21 = m33829a(r11, r10)
        L_0x0104:
            r29 = r5
            r30 = r6
            r28 = r8
            r27 = r14
            goto L_0x017c
        L_0x010e:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d.b r11 = r0.f49166w
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.r r13 = r6.f48994m
            if (r13 != 0) goto L_0x0116
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.r r13 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16768r.f49069c
        L_0x0116:
            int r13 = r13.f49072b
            r27 = r14
            if (r13 != 0) goto L_0x0129
            int r13 = r11.f49119c
            if (r13 == 0) goto L_0x0128
            r13 = 0
            r11.f49119c = r13
            r28 = r8
            r13 = 14
            goto L_0x013a
        L_0x0128:
            r13 = 0
        L_0x0129:
            r11.f49119c = r13
            int[] r14 = r11.f49118b
            r28 = r8
            int r8 = r11.f49120d
            r14[r8] = r13
            r13 = 1
            int r8 = r8 + r13
            r13 = 14
            int r8 = r8 % r13
            r11.f49120d = r8
        L_0x013a:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d.b r8 = r0.f49166w
            r11 = 0
        L_0x013d:
            if (r11 >= r13) goto L_0x015f
            int[] r14 = r8.f49118b
            r14 = r14[r11]
            long r13 = (long) r14
            r29 = r5
            r30 = r6
            long r5 = r8.f49117a
            int r31 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r31 < 0) goto L_0x0156
            r5 = 2131167970(0x7f070ae2, float:1.7950229E38)
            float r21 = m33829a(r5, r10)
            goto L_0x017c
        L_0x0156:
            int r11 = r11 + 1
            r5 = r29
            r6 = r30
            r13 = 14
            goto L_0x013d
        L_0x015f:
            r29 = r5
            r30 = r6
            com.google.android.libraries.search.p6glow.c r11 = com.google.android.libraries.search.p6glow.C39872c.LISTENING
            r5 = 2131167968(0x7f070ae0, float:1.7950225E38)
            float r21 = m33829a(r5, r10)
            goto L_0x0189
        L_0x016d:
            r29 = r5
            r30 = r6
            r28 = r8
            r27 = r14
            r5 = 2131167968(0x7f070ae0, float:1.7950225E38)
            float r21 = m33829a(r5, r10)
        L_0x017c:
            r11 = r26
            goto L_0x0189
        L_0x017f:
            r29 = r5
            r30 = r6
            r28 = r8
            r26 = r11
            r27 = r14
        L_0x0189:
            android.view.ViewGroup r5 = r32.mo23020b()
            r6 = 2131428768(0x7f0b05a0, float:1.847919E38)
            android.view.View r6 = r5.findViewById(r6)
            com.google.android.libraries.search.p6glow.AssistantP6GlowView r6 = (com.google.android.libraries.search.p6glow.AssistantP6GlowView) r6
            r8 = 2131437008(0x7f0b25d0, float:1.8495903E38)
            android.view.View r5 = r5.findViewById(r8)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r5 = r5 * r21
            r6.mo42037n(r5)
            r2.mo42063b(r11)
            goto L_0x020a
        L_0x01ad:
            r29 = r5
            r30 = r6
            r28 = r8
            r24 = r11
            r25 = r13
            r27 = r14
            r6 = 2131428768(0x7f0b05a0, float:1.847919E38)
            r8 = 2131437008(0x7f0b25d0, float:1.8495903E38)
            android.view.ViewGroup r2 = r32.mo23020b()
            android.view.View r5 = r2.findViewById(r6)
            com.google.android.libraries.search.p6glow.AssistantP6GlowView r5 = (com.google.android.libraries.search.p6glow.AssistantP6GlowView) r5
            r6 = 8
            r5.setVisibility(r6)
            r5 = 2131432996(0x7f0b1624, float:1.8487765E38)
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.CarLogoView r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.CarLogoView) r2
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r5 = r3.f49009e
            if (r5 != 0) goto L_0x01dd
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk.f48980u
        L_0x01dd:
            int r5 = r5.f48983b
            if (r1 != 0) goto L_0x01e3
            r6 = 1
            goto L_0x01e4
        L_0x01e3:
            r6 = 0
        L_0x01e4:
            r2.mo28225e(r5, r6)
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            boolean r6 = r3.f49006b
            r10 = 1
            if (r10 == r6) goto L_0x01f4
            r6 = 1
            goto L_0x01f7
        L_0x01f4:
            r6 = 8388611(0x800003, float:1.1754948E-38)
        L_0x01f7:
            r6 = r6 | 80
            r5.gravity = r6
            r2.setLayoutParams(r5)
            if (r9 == 0) goto L_0x0206
            r5 = 8
            r2.setVisibility(r5)
            goto L_0x020a
        L_0x0206:
            r5 = 0
            r2.setVisibility(r5)
        L_0x020a:
            r2 = 2131432674(0x7f0b14e2, float:1.8487112E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6 = r30
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.an r5 = r6.f48989h
            if (r5 != 0) goto L_0x021b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.an r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16726an.f48921d
        L_0x021b:
            boolean r5 = r5.f48924b
            if (r5 == 0) goto L_0x0226
            r5 = 0
            r2.setVisibility(r5)
            r10 = 8
            goto L_0x022c
        L_0x0226:
            r5 = 0
            r10 = 8
            r2.setVisibility(r10)
        L_0x022c:
            r2 = 2131436701(0x7f0b249d, float:1.849528E38)
            android.view.View r11 = r4.findViewById(r2)
            r11.setVisibility(r5)
            r5 = 2131434926(0x7f0b1dae, float:1.849168E38)
            android.view.View r5 = r4.findViewById(r5)
            r11 = 2131435144(0x7f0b1e88, float:1.8492122E38)
            android.view.View r11 = r4.findViewById(r11)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.StreamingTextView r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.StreamingTextView) r11
            if (r9 == 0) goto L_0x024f
            r11.setVisibility(r10)
            r21 = r5
            goto L_0x03df
        L_0x024f:
            int r9 = r6.f48982a
            r13 = 4
            r9 = r9 & r13
            if (r9 == 0) goto L_0x03b9
            r9 = 0
            r11.setVisibility(r9)
            r5.setVisibility(r10)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bg r2 = r6.f48985d
            if (r2 != 0) goto L_0x0262
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bg r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16746bg.f48970e
        L_0x0262:
            int r9 = r2.f48972a
            r10 = r9 & 4
            if (r10 == 0) goto L_0x02c7
            j$.util.Optional r9 = r0.f49163t
            boolean r9 = r9.isPresent()
            r10 = r29
            if (r9 == 0) goto L_0x028b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bg r9 = r10.f48985d
            if (r9 != 0) goto L_0x0278
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bg r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16746bg.f48970e
        L_0x0278:
            int r9 = r9.f48972a
            r13 = 4
            r9 = r9 & r13
            if (r9 != 0) goto L_0x028b
            j$.util.Optional r9 = r0.f49163t
            java.lang.Object r9 = r9.get()
            com.google.android.libraries.search.b.b r9 = (com.google.android.libraries.search.p2871b.C37215b) r9
            com.google.android.libraries.search.b.i.g r13 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97492bK
            r9.mo19974a(r13)
        L_0x028b:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.av r9 = r6.f48991j
            if (r9 != 0) goto L_0x0291
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.av r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av.f48942d
        L_0x0291:
            boolean r9 = r9.f48945b
            if (r9 == 0) goto L_0x02c0
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.av r9 = r6.f48991j
            if (r9 != 0) goto L_0x029c
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.av r13 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av.f48942d
            goto L_0x029d
        L_0x029c:
            r13 = r9
        L_0x029d:
            int r13 = r13.f48944a
            r14 = 2
            r13 = r13 & r14
            if (r13 == 0) goto L_0x02aa
            if (r9 != 0) goto L_0x02a7
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.av r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av.f48942d
        L_0x02a7:
            java.lang.String r2 = r9.f48946c
            goto L_0x02bb
        L_0x02aa:
            java.lang.String r2 = r2.f48975d
            android.content.res.Resources r9 = r0.f49152i
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r13 = 0
            r14[r13] = r2
            r2 = 2132082732(0x7f15002c, float:1.9805586E38)
            java.lang.String r2 = r9.getString(r2, r14)
        L_0x02bb:
            r11.mo23052a(r2)
            goto L_0x03b4
        L_0x02c0:
            java.lang.String r2 = r2.f48975d
            r11.mo23052a(r2)
            goto L_0x03b4
        L_0x02c7:
            r10 = r29
            r13 = r9 & 1
            if (r13 == 0) goto L_0x02ce
            goto L_0x02d2
        L_0x02ce:
            r13 = 2
            r9 = r9 & r13
            if (r9 == 0) goto L_0x03b4
        L_0x02d2:
            java.lang.String r9 = r2.f48974c
            java.lang.String r2 = r2.f48973b
            com.google.android.libraries.f.a r13 = r0.f49158o
            boolean r14 = r11.f49283d
            if (r14 == 0) goto L_0x02ec
            long r14 = r13.mo26870b()
            r21 = r9
            long r8 = r11.f49282c
            long r14 = r14 - r8
            r8 = 80
            int r22 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r22 < 0) goto L_0x03b4
            goto L_0x02ee
        L_0x02ec:
            r21 = r9
        L_0x02ee:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            boolean r9 = android.text.TextUtils.isEmpty(r21)
            if (r9 != 0) goto L_0x02fe
            r9 = r21
            r8.append(r9)
        L_0x02fe:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L_0x030a
            r21 = r5
            r29 = r10
            goto L_0x03aa
        L_0x030a:
            int r9 = r8.length()
            r8.append(r2)
            java.lang.String r14 = r11.f49284e
            boolean r15 = r2.isEmpty()
            if (r15 != 0) goto L_0x037e
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L_0x0321
            goto L_0x037e
        L_0x0321:
            boolean r15 = r2.startsWith(r14)
            if (r15 == 0) goto L_0x0330
            int r14 = r14.length()
            r21 = r5
            r29 = r10
            goto L_0x0383
        L_0x0330:
            boolean r15 = r14.startsWith(r2)
            if (r15 != 0) goto L_0x0374
            boolean r15 = r14.endsWith(r2)
            if (r15 == 0) goto L_0x033d
            goto L_0x0374
        L_0x033d:
            r29 = r10
            r10 = 0
            r15 = 0
        L_0x0341:
            int r1 = r14.length()
            r21 = r5
            if (r15 >= r1) goto L_0x0372
            r1 = 0
        L_0x034a:
            int r5 = r2.length()
            if (r1 >= r5) goto L_0x0367
            int r5 = r15 + r1
            int r3 = r14.length()
            if (r5 >= r3) goto L_0x0367
            char r3 = r14.charAt(r5)
            char r5 = r2.charAt(r1)
            if (r3 != r5) goto L_0x0367
            int r1 = r1 + 1
            r3 = r35
            goto L_0x034a
        L_0x0367:
            int r10 = java.lang.Math.max(r10, r1)
            int r15 = r15 + 1
            r3 = r35
            r5 = r21
            goto L_0x0341
        L_0x0372:
            r14 = r10
            goto L_0x0383
        L_0x0374:
            r21 = r5
            r29 = r10
            int r1 = r2.length()
            r14 = r1
            goto L_0x0383
        L_0x037e:
            r21 = r5
            r29 = r10
            r14 = 0
        L_0x0383:
            int r1 = r2.length()
            if (r14 >= r1) goto L_0x03a8
            int r1 = r2.length()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.d r3 = r11.f49280a
            int r14 = r14 + r9
            int r9 = r9 + r1
            r1 = 33
            r8.setSpan(r3, r14, r9, r1)
            android.animation.ObjectAnimator r1 = r11.f49281b
            boolean r1 = r1.isStarted()
            if (r1 == 0) goto L_0x03a3
            android.animation.ObjectAnimator r1 = r11.f49281b
            r1.cancel()
        L_0x03a3:
            android.animation.ObjectAnimator r1 = r11.f49281b
            r1.start()
        L_0x03a8:
            r11.f49284e = r2
        L_0x03aa:
            r11.mo23052a(r8)
            long r1 = r13.mo26870b()
            r11.f49282c = r1
            goto L_0x03df
        L_0x03b4:
            r21 = r5
            r29 = r10
            goto L_0x03df
        L_0x03b9:
            r21 = r5
            if (r15 != 0) goto L_0x03c8
            if (r7 != 0) goto L_0x03c8
            if (r12 != 0) goto L_0x03c8
            if (r28 != 0) goto L_0x03c8
            r1 = 4
            r11.setVisibility(r1)
            goto L_0x03df
        L_0x03c8:
            r1 = 4
            r11.setVisibility(r1)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = r6.f48992k
            if (r1 != 0) goto L_0x03d2
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x03d2:
            boolean r1 = r1.f48803b
            if (r1 != 0) goto L_0x03df
            android.view.View r1 = r4.findViewById(r2)
            r2 = 8
            r1.setVisibility(r2)
        L_0x03df:
            r1 = 2131433523(0x7f0b1833, float:1.8488834E38)
            android.view.View r1 = r4.findViewById(r1)
            r2 = 2131433524(0x7f0b1834, float:1.8488836E38)
            android.view.View r2 = r4.findViewById(r2)
            r3 = -1
            if (r27 == 0) goto L_0x04a0
            android.content.res.Resources r5 = r0.f49152i
            r8 = 2131167988(0x7f070af4, float:1.7950265E38)
            int r5 = r5.getDimensionPixelSize(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r3, r5)
            int r9 = r6.f48982a
            r9 = r9 & 16
            if (r9 == 0) goto L_0x0407
        L_0x0404:
            r9 = r35
            goto L_0x0415
        L_0x0407:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r9 = r6.f48992k
            if (r9 != 0) goto L_0x040d
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x040d:
            boolean r9 = r9.f48803b
            if (r9 != 0) goto L_0x0404
            int r9 = -r5
            r8.bottomMargin = r9
            goto L_0x0404
        L_0x0415:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ap r10 = r9.f49016l
            if (r10 != 0) goto L_0x041b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ap r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16728ap.f48926d
        L_0x041b:
            boolean r10 = r10.f48929b
            r11 = 2131100609(0x7f0603c1, float:1.7813604E38)
            r13 = 2131100608(0x7f0603c0, float:1.7813602E38)
            if (r10 == 0) goto L_0x0469
            r2 = 2131433525(0x7f0b1835, float:1.8488838E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            android.view.ViewGroup r5 = r32.mo23020b()
            android.content.Context r5 = r5.getContext()
            com.google.android.libraries.search.p6glow.c r10 = com.google.android.libraries.search.p6glow.C39872c.GONE
            int r10 = r25.ordinal()
            r14 = 2
            if (r10 == r14) goto L_0x0447
            r14 = 3
            if (r10 == r14) goto L_0x0447
            int r5 = androidx.core.content.C1878d.m5128a(r5, r11)
            goto L_0x044b
        L_0x0447:
            int r5 = androidx.core.content.C1878d.m5128a(r5, r13)
        L_0x044b:
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r2.setProgressTintList(r5)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ar r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar.SLOW_CONNECTION
            r10 = r25
            if (r10 != r2) goto L_0x0467
            android.animation.ObjectAnimator r2 = r0.f49153j
            if (r2 == 0) goto L_0x0467
            boolean r2 = r2.isStarted()
            if (r2 != 0) goto L_0x0467
            android.animation.ObjectAnimator r2 = r0.f49153j
            r2.start()
        L_0x0467:
            r11 = -1
            goto L_0x049c
        L_0x0469:
            r10 = r25
            android.view.ViewGroup r14 = r32.mo23020b()
            android.content.Context r14 = r14.getContext()
            android.content.res.Resources$Theme r14 = r14.getTheme()
            com.google.android.libraries.search.p6glow.c r15 = com.google.android.libraries.search.p6glow.C39872c.GONE
            int r15 = r10.ordinal()
            r3 = 2
            if (r15 == r3) goto L_0x048a
            r3 = 3
            if (r15 == r3) goto L_0x048a
            android.content.res.Resources r3 = r0.f49152i
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r11, r14)
            goto L_0x0490
        L_0x048a:
            android.content.res.Resources r3 = r0.f49152i
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r13, r14)
        L_0x0490:
            r2.setBackground(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r11 = -1
            r3.<init>(r11, r5)
            r2.setLayoutParams(r3)
        L_0x049c:
            r1.setLayoutParams(r8)
            goto L_0x04ae
        L_0x04a0:
            r9 = r35
            r10 = r25
            r11 = -1
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 0
            r2.<init>(r11, r3)
            r1.setLayoutParams(r2)
        L_0x04ae:
            r1 = 2131427704(0x7f0b0178, float:1.8477032E38)
            android.view.View r1 = r4.findViewById(r1)
            if (r24 != 0) goto L_0x04c4
            if (r7 != 0) goto L_0x04c4
            if (r12 != 0) goto L_0x04c4
            if (r28 == 0) goto L_0x04be
            goto L_0x04c4
        L_0x04be:
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x052a
        L_0x04c4:
            r2 = 0
            r1.setVisibility(r2)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.content.res.Resources r3 = r0.f49152i
            int r5 = r6.f48982a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x04d8
            r5 = 2131167989(0x7f070af5, float:1.7950267E38)
            goto L_0x04db
        L_0x04d8:
            r5 = 2131167987(0x7f070af3, float:1.7950263E38)
        L_0x04db:
            int r3 = r3.getDimensionPixelSize(r5)
            r2.height = r3
            r1.setLayoutParams(r2)
            r1 = 2131433527(0x7f0b1837, float:1.8488842E38)
            android.view.View r1 = r4.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131433526(0x7f0b1836, float:1.848884E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131432683(0x7f0b14eb, float:1.848713E38)
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5 = 2131429773(0x7f0b098d, float:1.8481228E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r8 = 2131433727(0x7f0b18ff, float:1.8489248E38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r12 == 0) goto L_0x052e
            r11 = 0
            r3.setVisibility(r11)
            r12 = 8
            r5.setVisibility(r12)
            r2.setVisibility(r12)
            r1.setVisibility(r12)
            r8.setVisibility(r12)
            r13 = r21
            r13.setVisibility(r12)
        L_0x052a:
            r1 = 8
            goto L_0x05a8
        L_0x052e:
            r13 = r21
            r11 = 0
            r12 = 8
            if (r28 == 0) goto L_0x0548
            r8.setVisibility(r11)
            r5.setVisibility(r12)
            r3.setVisibility(r12)
            r2.setVisibility(r12)
            r1.setVisibility(r12)
            r13.setVisibility(r12)
            goto L_0x052a
        L_0x0548:
            if (r7 == 0) goto L_0x057b
            android.content.res.Resources r7 = r0.f49152i
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.v r10 = r6.f48990i
            if (r10 != 0) goto L_0x0552
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.v r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16772v.f49081d
        L_0x0552:
            boolean r10 = r10.f49085c
            r11 = 1
            if (r11 == r10) goto L_0x055b
            r10 = 2132085773(0x7f150c0d, float:1.9811754E38)
            goto L_0x055e
        L_0x055b:
            r10 = 2132085771(0x7f150c0b, float:1.981175E38)
        L_0x055e:
            java.lang.String r7 = r7.getString(r10)
            r5.setText(r7)
            r7 = 0
            r5.setVisibility(r7)
            r5 = 8
            r3.setVisibility(r5)
            r2.setVisibility(r5)
            r1.setVisibility(r5)
            r8.setVisibility(r5)
            r13.setVisibility(r5)
            goto L_0x052a
        L_0x057b:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ar r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar.POOR_SIGNAL_STRENGTH
            if (r10 == r7) goto L_0x0586
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ar r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar.SLOW_CONNECTION
            if (r10 != r7) goto L_0x0584
            goto L_0x0586
        L_0x0584:
            r7 = 0
            goto L_0x0587
        L_0x0586:
            r7 = 1
        L_0x0587:
            r10 = 1
            if (r10 == r7) goto L_0x058d
            r11 = 8
            goto L_0x058e
        L_0x058d:
            r11 = 0
        L_0x058e:
            r2.setVisibility(r11)
            if (r10 == r7) goto L_0x0595
            r2 = 0
            goto L_0x0597
        L_0x0595:
            r2 = 8
        L_0x0597:
            r1.setVisibility(r2)
            r1 = 8
            r5.setVisibility(r1)
            r3.setVisibility(r1)
            r8.setVisibility(r1)
            r13.setVisibility(r1)
        L_0x05a8:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.af r2 = r6.f48987f
            if (r2 != 0) goto L_0x05ae
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.af r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16718af.f48884c
        L_0x05ae:
            int r2 = r2.f48886a
            j$.util.Optional r3 = r0.f49147d
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x05cf
            j$.util.Optional r3 = r0.f49147d
            java.lang.Object r3 = r3.get()
            com.google.android.apps.gsa.staticplugins.gearhead.a.b r3 = (com.google.android.apps.gsa.staticplugins.gearhead.p7964a.C101289b) r3
            r5 = 3
            if (r2 == r5) goto L_0x05c6
            r13 = 8
            goto L_0x05c7
        L_0x05c6:
            r13 = 0
        L_0x05c7:
            android.view.ViewGroup r3 = r3.f282695a
            if (r3 == 0) goto L_0x05d0
            r3.setVisibility(r13)
            goto L_0x05d0
        L_0x05cf:
            r5 = 3
        L_0x05d0:
            r3 = 2131430255(0x7f0b0b6f, float:1.8482206E38)
            android.view.View r3 = r4.findViewById(r3)
            if (r2 != r5) goto L_0x05dd
            if (r27 != 0) goto L_0x05dd
            r13 = 0
            goto L_0x05df
        L_0x05dd:
            r13 = 8
        L_0x05df:
            r3.setVisibility(r13)
            r2 = 2131435128(0x7f0b1e78, float:1.849209E38)
            android.view.View r2 = r4.findViewById(r2)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.af r3 = r6.f48987f
            if (r3 != 0) goto L_0x05ef
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.af r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16718af.f48884c
        L_0x05ef:
            int r3 = r3.f48886a
            r5 = 2
            if (r3 == r5) goto L_0x05f7
            r13 = 8
            goto L_0x05f8
        L_0x05f7:
            r13 = 0
        L_0x05f8:
            r2.setVisibility(r13)
            r2 = r34
            r3 = 2131437008(0x7f0b25d0, float:1.8495903E38)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r5 = r2.f49009e
            if (r5 != 0) goto L_0x0606
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk.f48980u
        L_0x0606:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r7 = r9.f49009e
            if (r7 != 0) goto L_0x060c
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk.f48980u
        L_0x060c:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ax r5 = r5.f48988g
            if (r5 != 0) goto L_0x0612
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ax r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax.f48947d
        L_0x0612:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ax r8 = r7.f48988g
            if (r8 != 0) goto L_0x0618
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ax r8 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax.f48947d
        L_0x0618:
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x061f
            goto L_0x0688
        L_0x061f:
            android.content.res.Resources r5 = r0.f49152i
            r8 = 2131167950(0x7f070ace, float:1.7950188E38)
            int r13 = r5.getDimensionPixelSize(r8)
            android.view.ViewGroup r5 = r32.mo23020b()
            r8 = 2131436548(0x7f0b2404, float:1.849497E38)
            android.view.View r5 = r5.findViewById(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            int r10 = r7.f48982a
            r10 = r10 & 32
            if (r10 != 0) goto L_0x063e
            r10 = -1
            r13 = 0
            goto L_0x063f
        L_0x063e:
            r10 = -1
        L_0x063f:
            r8.<init>(r10, r13)
            r5.setLayoutParams(r8)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ax r5 = r7.f48988g
            if (r5 != 0) goto L_0x064b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ax r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax.f48947d
        L_0x064b:
            boolean r8 = r9.f49008d
            if (r8 == 0) goto L_0x0688
            int r5 = r5.f48949a
            r8 = 1
            r5 = r5 & r8
            if (r5 == 0) goto L_0x0688
            android.view.ViewGroup r5 = r32.mo23020b()
            r8 = 2131436549(0x7f0b2405, float:1.8494972E38)
            android.view.View r5 = r5.findViewById(r8)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.google.apps.tiktok.media.e r8 = r0.f49161r
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ax r7 = r7.f48988g
            if (r7 != 0) goto L_0x066a
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ax r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax.f48947d
        L_0x066a:
            java.lang.String r7 = r7.f48950b
            com.bumptech.glide.ad r8 = r8.mo51286a()
            com.bumptech.glide.z r7 = r8.mo11873k(r7)
            com.bumptech.glide.p r8 = com.bumptech.glide.C5997p.IMMEDIATE
            com.bumptech.glide.f.a r7 = r7.mo11965R(r8)
            com.bumptech.glide.z r7 = (com.bumptech.glide.C6007z) r7
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.ab r8 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.ab
            r8.<init>(r0)
            com.bumptech.glide.z r7 = r7.mo12439a(r8)
            r7.mo12454r(r5)
        L_0x0688:
            r5 = 2131435508(0x7f0b1ff4, float:1.849286E38)
            android.view.View r5 = r4.findViewById(r5)
            android.view.View r3 = r4.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r7 = r2.f49007c
            if (r7 != 0) goto L_0x06a0
            boolean r7 = r9.f49007c
            if (r7 == 0) goto L_0x06a0
            r32.m33830f()
        L_0x06a0:
            boolean r7 = r9.f49007c
            if (r7 == 0) goto L_0x06b3
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r7 = r0.f49156m
            r3.bottomMargin = r7
            r13 = 0
            r5.setVisibility(r13)
            goto L_0x06c2
        L_0x06b3:
            r13 = 0
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r7 = r0.f49157n
            r3.bottomMargin = r7
            r3 = 4
            r5.setVisibility(r3)
        L_0x06c2:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r2 = r2.f49009e
            if (r2 != 0) goto L_0x06c8
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk.f48980u
        L_0x06c8:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r3 = r9.f49009e
            if (r3 != 0) goto L_0x06ce
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk.f48980u
        L_0x06ce:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.l r5 = r0.f49168y
            if (r5 != 0) goto L_0x0741
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.m r5 = r0.f49159p
            android.view.ViewGroup r19 = r32.mo23020b()
            j$.util.Optional r7 = r0.f49162s
            j$.util.Optional r8 = r0.f49163t
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.l r10 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.l
            g.a.a r11 = r5.f49241a
            java.lang.Object r11 = r11.mo17428b()
            r15 = r11
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d r15 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d) r15
            r15.getClass()
            g.a.a r11 = r5.f49242b
            java.lang.Object r11 = r11.mo17428b()
            r16 = r11
            com.google.apps.tiktok.media.e r16 = (com.google.apps.tiktok.media.C47449e) r16
            r16.getClass()
            g.a.a r11 = r5.f49243c
            java.lang.Object r11 = r11.mo17428b()
            r17 = r11
            com.google.android.libraries.aw.a.c r17 = (com.google.android.libraries.p1638aw.p1639a.C19594c) r17
            r17.getClass()
            g.a.a r11 = r5.f49244d
            java.lang.Object r11 = r11.mo17428b()
            r18 = r11
            com.google.apps.tiktok.tracing.dh r18 = (com.google.apps.tiktok.tracing.C47770dh) r18
            r18.getClass()
            r19.getClass()
            r7.getClass()
            r8.getClass()
            g.a.a r11 = r5.f49245e
            java.lang.Object r11 = r11.mo17428b()
            r22 = r11
            com.google.apps.tiktok.tracing.contrib.a.c.c r22 = (com.google.apps.tiktok.tracing.contrib.p3685a.p3693c.C47600c) r22
            r22.getClass()
            r35.getClass()
            g.a.a r5 = r5.f49246f
            java.lang.Object r5 = r5.mo17428b()
            r23 = r5
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.f r23 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16828f) r23
            r23.getClass()
            r14 = r10
            r20 = r7
            r21 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.f49168y = r10
        L_0x0741:
            int r5 = r2.f48982a
            r5 = r5 & 512(0x200, float:7.175E-43)
            r7 = 0
            if (r5 == 0) goto L_0x0751
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r2 = r2.f48992k
            if (r2 != 0) goto L_0x074e
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x074e:
            boolean r5 = r2.f48803b
            goto L_0x0753
        L_0x0751:
            r2 = r7
            r5 = 0
        L_0x0753:
            int r8 = r3.f48982a
            r8 = r8 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0762
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r7 = r3.f48992k
            if (r7 != 0) goto L_0x075f
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x075f:
            boolean r8 = r7.f48803b
            goto L_0x0763
        L_0x0762:
            r8 = 0
        L_0x0763:
            if (r5 == 0) goto L_0x0775
            if (r8 != 0) goto L_0x0772
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.l r2 = r0.f49168y
            r5 = r33
            r2.mo23038c(r9, r5)
            r32.m33830f()
            goto L_0x078c
        L_0x0772:
            r5 = r33
            goto L_0x0779
        L_0x0775:
            r5 = r33
            if (r8 == 0) goto L_0x078c
        L_0x0779:
            if (r7 == 0) goto L_0x078c
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x078c
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.l r2 = r0.f49168y
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r3 = r3.f48996o
            if (r3 != 0) goto L_0x0789
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r3 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i.f40380k
        L_0x0789:
            r2.mo23039d(r7, r9, r3, r5)
        L_0x078c:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.a r2 = r0.f49169z
            if (r2 != 0) goto L_0x07b0
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.b r2 = r0.f49160q
            android.view.ViewGroup r3 = r32.mo23020b()
            j$.util.Optional r5 = r0.f49162s
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.a r7 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.a
            r3.getClass()
            r5.getClass()
            g.a.a r2 = r2.f49205a
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.ak r2 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16802ak) r2
            r2.getClass()
            r7.<init>(r3, r5, r2)
            r0.f49169z = r7
        L_0x07b0:
            int r2 = r6.f48982a
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x07e6
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r2 = r6.f48993l
            if (r2 != 0) goto L_0x07bc
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d.f49023f
        L_0x07bc:
            boolean r2 = r2.f49026b
            if (r2 == 0) goto L_0x07e6
            r5 = r29
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r2 = r5.f48993l
            if (r2 != 0) goto L_0x07c8
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d.f49023f
        L_0x07c8:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r3 = r6.f48993l
            if (r3 != 0) goto L_0x07ce
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d.f49023f
        L_0x07ce:
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x07ef
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.a r2 = r0.f49169z
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r3 = r6.f48993l
            if (r3 != 0) goto L_0x07dc
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d.f49023f
        L_0x07dc:
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r5 = r6.f48996o
            if (r5 != 0) goto L_0x07e2
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r5 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i.f40380k
        L_0x07e2:
            r2.mo23017a(r3, r5)
            goto L_0x07ef
        L_0x07e6:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.a r2 = r0.f49169z
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.aj r2 = r2.f49134a
            if (r2 == 0) goto L_0x07ef
            r2.mo23027b()
        L_0x07ef:
            r2 = 2131430597(0x7f0b0cc5, float:1.84829E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = r9.f49005a
            r3 = r3 & 16
            if (r3 != 0) goto L_0x0801
            r11 = 8
            goto L_0x0802
        L_0x0801:
            r11 = 0
        L_0x0802:
            r2.setVisibility(r11)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ah r1 = r9.f49010f
            if (r1 != 0) goto L_0x080b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ah r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16720ah.f48888b
        L_0x080b:
            com.google.protobuf.cq r1 = r1.f48890a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0845
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            android.content.res.Resources r3 = r0.f49152i
            r4 = 2132086940(0x7f15109c, float:1.9814121E38)
            java.lang.String r3 = r3.getString(r4)
            r1.<init>(r3)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ah r3 = r9.f49010f
            if (r3 != 0) goto L_0x0827
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ah r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16720ah.f48888b
        L_0x0827:
            com.google.protobuf.cq r3 = r3.f48890a
            java.util.Iterator r3 = r3.iterator()
        L_0x082d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0842
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = " "
            r1.append(r5)
            r1.append(r4)
            goto L_0x082d
        L_0x0842:
            r2.setText(r1)
        L_0x0845:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16795ad.mo23023e(android.transition.Transition, com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bm, com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bm):void");
    }
}
