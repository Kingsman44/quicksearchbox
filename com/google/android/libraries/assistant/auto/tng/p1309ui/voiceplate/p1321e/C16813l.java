package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1878d;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p724d.C11983a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16635ag;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16637b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16639d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16653r;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16777c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16828f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16752bm;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1638aw.p1639a.C19594c;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3693c.C47599b;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3693c.C47600c;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.l */
/* compiled from: PG */
public final class C16813l {

    /* renamed from: a */
    public static final C59071e f49225a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.l");

    /* renamed from: g */
    private static final int[] f49226g = {132247, 132248, 132249, 132250};

    /* renamed from: b */
    public final LinearLayout f49227b;

    /* renamed from: c */
    public final C16782d f49228c;

    /* renamed from: d */
    public final Optional f49229d;

    /* renamed from: e */
    public final C16828f f49230e;

    /* renamed from: f */
    public View f49231f;

    /* renamed from: h */
    private final ScrollView f49232h;

    /* renamed from: i */
    private final C16826y f49233i;

    /* renamed from: j */
    private final ConstraintLayout f49234j;

    /* renamed from: k */
    private final LayoutInflater f49235k;

    /* renamed from: l */
    private final C47449e f49236l;

    /* renamed from: m */
    private final C19594c f49237m;

    /* renamed from: n */
    private final C47770dh f49238n;

    /* renamed from: o */
    private final Optional f49239o;

    /* renamed from: p */
    private final C47600c f49240p;

    public C16813l(C16782d dVar, C47449e eVar, C19594c cVar, C47770dh dhVar, ViewGroup viewGroup, Optional optional, Optional optional2, C47600c cVar2, C16828f fVar) {
        this.f49228c = dVar;
        this.f49236l = eVar;
        this.f49237m = cVar;
        this.f49238n = dhVar;
        this.f49229d = optional;
        this.f49239o = optional2;
        this.f49240p = cVar2;
        this.f49230e = fVar;
        this.f49234j = (ConstraintLayout) viewGroup.findViewById(R.id.transcription_immersive_container);
        ScrollView scrollView = (ScrollView) viewGroup.findViewById(R.id.immersive_container);
        this.f49232h = scrollView;
        View findViewById = viewGroup.findViewById(R.id.buttonsContainer);
        LayoutInflater from = LayoutInflater.from(scrollView.getContext());
        this.f49235k = from;
        LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.voiceplate_immersive_container, scrollView, false);
        this.f49227b = linearLayout;
        linearLayout.setId(R.id.immersive_content);
        this.f49233i = new C16826y(scrollView, findViewById);
        if (optional.isPresent()) {
            C28310af d = ((C16777c) optional.get()).mo22960d();
            C28306ab c = ((C16777c) optional.get()).mo22959c();
            scrollView.getClass();
            c.mo33801b(scrollView, d.mo33805a(C28427h.m53115a(132350)));
        }
    }

    /* renamed from: a */
    public static C16770t m33843a(C16770t tVar, Optional optional, View view) {
        C51805du duVar;
        if (tVar.f49076b != 2 || optional.isEmpty()) {
            return tVar;
        }
        C11983a a = ((C16777c) optional.get()).mo22957a();
        if (tVar.f49076b == 2) {
            duVar = (C51805du) tVar.f49077c;
        } else {
            duVar = C51805du.f135924e;
        }
        view.getClass();
        C51805du a2 = a.mo20350a((C51803ds) duVar.toBuilder(), view);
        C16769s sVar = (C16769s) tVar.toBuilder();
        sVar.copyOnWrite();
        C16770t tVar2 = (C16770t) sVar.instance;
        a2.getClass();
        tVar2.f49077c = a2;
        tVar2.f49076b = 2;
        return (C16770t) sVar.build();
    }

    /* renamed from: b */
    public static C16770t m33844b(C16770t tVar, C12991i iVar) {
        C16769s sVar = (C16769s) tVar.toBuilder();
        sVar.copyOnWrite();
        C16770t tVar2 = (C16770t) sVar.instance;
        iVar.getClass();
        tVar2.f49078d = iVar;
        tVar2.f49075a |= 32;
        return (C16770t) sVar.build();
    }

    /* renamed from: e */
    private final ViewGroup m33845e(C16644i iVar, C12991i iVar2) {
        String str = iVar.f48743c;
        if ((iVar.f48741a & 2) == 0) {
            return null;
        }
        C16744be beVar = iVar.f48748h;
        if (beVar == null) {
            beVar = C16744be.f48963e;
        }
        int i = 1;
        if ((beVar.f48965a & 1) == 0) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) this.f49235k.inflate(R.layout.rfw_button, this.f49232h, false);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.icon);
        if ((iVar.f48741a & 1) != 0) {
            imageView.setVisibility(0);
            C16654s sVar = iVar.f48742b;
            if (sVar == null) {
                sVar = C16654s.f48773e;
            }
            int dimension = (int) this.f49232h.getResources().getDimension(R.dimen.rfw_smartaction_button_icon_size);
            m33850j(sVar, Optional.empty(), imageView, dimension, dimension);
        }
        String str2 = iVar.f48743c;
        TextView textView = (TextView) viewGroup.findViewById(R.id.button_text);
        textView.setText(str2);
        int i2 = iVar.f48741a & 16;
        int i3 = R.color.rfw_immersive_secondary_button_text_color;
        if (i2 != 0) {
            C16639d dVar = iVar.f48746f;
            if (dVar == null) {
                dVar = C16639d.f48730c;
            }
            int a = C16637b.m33706a(dVar.f48733b);
            if (a == 0) {
                a = 1;
            }
            int i4 = a - 1;
            if (i4 == 2) {
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_stroke).setAlpha(0);
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_solid_bg_gray).setAlpha(0);
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_primary_solid_bg_gray).setAlpha(0);
            } else if (i4 == 5) {
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_stroke).setAlpha(0);
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_solid_bg_blue).setAlpha(0);
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_primary_solid_bg_gray).setAlpha(0);
            }
        } else {
            ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_solid_bg_blue).setAlpha(0);
            ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_solid_bg_gray).setAlpha(0);
            ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_primary_solid_bg_gray).setAlpha(0);
            textView.setTextColor(C1878d.m5128a(this.f49235k.getContext(), R.color.rfw_immersive_secondary_button_text_color));
        }
        if ((iVar.f48741a & 4) != 0) {
            C16636ah ahVar = iVar.f48744d;
            if (ahVar == null) {
                ahVar = C16636ah.f48726c;
            }
            int a2 = C16635ag.m33705a(ahVar.f48729b);
            if (a2 != 0) {
                i = a2;
            }
            int i5 = i - 1;
            if (i5 != 2) {
                i3 = i5 != 3 ? R.color.rfw_immersive_primary_button_text_color : R.color.rfw_immersive_text_color_white;
            }
            textView.setTextColor(C1878d.m5128a(this.f49235k.getContext(), i3));
        }
        if ((iVar.f48741a & 512) != 0) {
            textView.setTextColor(C1878d.m5128a(this.f49235k.getContext(), R.color.rfw_immersive_text_color_white));
            if (iVar.f48749i) {
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_primary_solid_bg_gray).setAlpha(PrivateKeyType.INVALID);
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_stroke).setAlpha(0);
            } else {
                ((LayerDrawable) viewGroup.getBackground()).findDrawableByLayerId(R.id.button_primary_solid_bg_gray).setAlpha(0);
            }
        }
        textView.setText(str2);
        if (iVar.f48747g) {
            int dimensionPixelSize = this.f49232h.getResources().getDimensionPixelSize(R.dimen.rfw_immersive_button_min_side_padding);
            LinearLayout linearLayout = (LinearLayout) viewGroup;
            linearLayout.setPaddingRelative(dimensionPixelSize, linearLayout.getPaddingTop(), dimensionPixelSize, linearLayout.getPaddingBottom());
        }
        Optional optional = this.f49229d;
        C16744be beVar2 = iVar.f48748h;
        if (beVar2 == null) {
            beVar2 = C16744be.f48963e;
        }
        Optional g = m33847g(optional, viewGroup, beVar2);
        this.f49230e.mo23049a(viewGroup, new C47591co(this.f49238n, "#IMMERSIVE# button clicked", new C16805d(this, iVar, g, iVar2)), this.f49229d, g);
        return viewGroup;
    }

    /* renamed from: f */
    private static Optional m33846f(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Optional.m71637of(packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString());
        } catch (PackageManager.NameNotFoundException unused) {
            ((C59052c) ((C59052c) f49225a.mo56226d()).mo56372aa(46869)).mo56389s("Package %s not found.", str);
            return Optional.empty();
        }
    }

    /* renamed from: g */
    private static Optional m33847g(Optional optional, View view, C16744be beVar) {
        if (optional.isPresent()) {
            C16748bi biVar = beVar.f48968d;
            if (biVar == null) {
                biVar = C16748bi.f48976c;
            }
            if (!biVar.equals(C16748bi.f48976c)) {
                C28306ab c = ((C16777c) optional.get()).mo22959c();
                view.getClass();
                C28310af d = ((C16777c) optional.get()).mo22960d();
                C16748bi biVar2 = beVar.f48968d;
                if (biVar2 == null) {
                    biVar2 = C16748bi.f48976c;
                }
                return Optional.m71637of(c.mo33801b(view, d.mo33805a(C28427h.m53115a(biVar2.f48979b))));
            }
        }
        return Optional.empty();
    }

    /* renamed from: i */
    private final void m33849i(Transition transition, C16812k kVar) {
        transition.addListener(new C47599b(this.f49240p, new C16810i(kVar), "ImmersiveViewController:TransitionListener"));
    }

    /* renamed from: j */
    private final void m33850j(C16654s sVar, Optional optional, ImageView imageView, int i, int i2) {
        C59071e eVar = f49225a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(46875)).mo56389s("#renderImage %s", sVar);
        int a = C16653r.m33708a(sVar.f48776b);
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 1;
        if (i3 == 1) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(46877)).mo56386p("#image is invisible");
            imageView.setVisibility(4);
            if (optional.isPresent()) {
                ((ViewGroup) optional.get()).setVisibility(4);
            }
        } else if (i3 != 2) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(46878)).mo56386p("#image is visible");
            imageView.setVisibility(0);
            if (optional.isPresent()) {
                ((ViewGroup) optional.get()).setVisibility(0);
            }
            C16651p pVar = sVar.f48777c;
            if (pVar == null) {
                pVar = C16651p.f48768c;
            }
            Object h = m33848h(pVar, i, i2);
            C16651p pVar2 = sVar.f48778d;
            if (pVar2 == null) {
                pVar2 = C16651p.f48768c;
            }
            Object h2 = m33848h(pVar2, i, i2);
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(46879)).mo56386p("#renderImage generic");
            C5593j jVar = (C5593j) new C5593j().mo11986w();
            if (h2 instanceof Integer) {
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(46880)).mo56386p("#renderImage instanceof int");
                jVar = (C5593j) jVar.mo11952E(((Integer) h2).intValue());
            } else if (h2 instanceof Drawable) {
                jVar = (C5593j) jVar.mo11953F((Drawable) h2);
            }
            C47449e eVar2 = this.f49236l;
            if (h == null) {
                h = h2;
            }
            eVar2.mo51286a().mo11872j(h).mo11982o(jVar).mo12439a(new C16811j()).mo12454r(imageView);
        } else {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(46876)).mo56386p("#image is gone");
            imageView.setVisibility(8);
            if (optional.isPresent()) {
                ((ViewGroup) optional.get()).setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo23038c(C16752bm bmVar, Transition transition) {
        this.f49232h.removeAllViews();
        if (transition == null) {
            this.f49227b.removeAllViews();
        } else if (this.f49227b.getChildCount() > 0) {
            for (int i = 0; i < this.f49227b.getChildCount(); i++) {
                this.f49227b.getChildAt(i).setVisibility(8);
            }
            m33849i(transition, new C16809h(this));
        }
        this.f49232h.setVisibility(8);
        if (bmVar.f49012h) {
            this.f49233i.mo23047a();
        }
        this.f49231f = null;
    }

    /* JADX WARNING: type inference failed for: r0v95, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0381  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23039d(com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b r23, com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16752bm r24, com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i r25, android.transition.Transition r26) {
        /*
            r22 = this;
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r6.mo23038c(r8, r10)
            boolean r0 = r7.f48803b
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            j$.util.Optional r0 = r6.f49239o
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0027
            j$.util.Optional r0 = r6.f49239o
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.search.b.b r0 = (com.google.android.libraries.search.p2871b.C37215b) r0
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97484bC
            r0.mo19974a(r1)
        L_0x0027:
            android.widget.ScrollView r0 = r6.f49232h
            r11 = 0
            r0.setVisibility(r11)
            com.google.protobuf.cq r0 = r7.f48804c
            java.util.Iterator r12 = r0.iterator()
        L_0x0033:
            boolean r0 = r12.hasNext()
            r13 = 8
            r14 = 2131432357(0x7f0b13a5, float:1.848647E38)
            r15 = 2131436487(0x7f0b23c7, float:1.8494846E38)
            r5 = 1
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r12.next()
            r4 = r0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.m r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m) r4
            int r0 = r4.f48762a
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0033
            android.view.LayoutInflater r0 = r6.f49235k
            r1 = 2131626715(0x7f0e0adb, float:1.8880674E38)
            android.widget.ScrollView r2 = r6.f49232h
            android.view.View r0 = r0.inflate(r1, r2, r11)
            r5 = r0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.String r0 = r4.f48763b
            android.view.View r1 = r5.findViewById(r15)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = r4.f48764c
            if (r0 != 0) goto L_0x006d
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
        L_0x006d:
            r1 = r0
            r0 = 2131432366(0x7f0b13ae, float:1.8486487E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r2 = r5.findViewById(r14)
            r3 = r2
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.widget.ScrollView r2 = r6.f49232h
            android.content.res.Resources r2 = r2.getResources()
            r14 = 2131171770(0x7f0719ba, float:1.7957936E38)
            float r2 = r2.getDimension(r14)
            int r14 = (int) r2
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r0)
            r0 = r22
            r15 = r4
            r4 = r14
            r11 = r5
            r5 = r14
            r0.m33850j(r1, r2, r3, r4, r5)
            int r0 = r15.f48762a
            r0 = r0 & r13
            if (r0 == 0) goto L_0x00d0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = r15.f48765d
            if (r0 != 0) goto L_0x00a4
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
        L_0x00a4:
            r1 = r0
            r0 = 2131434237(0x7f0b1afd, float:1.8490282E38)
            android.view.View r0 = r11.findViewById(r0)
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2131434238(0x7f0b1afe, float:1.8490284E38)
            android.view.View r0 = r11.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.widget.ScrollView r2 = r6.f49232h
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131171773(0x7f0719bd, float:1.7957942E38)
            float r2 = r2.getDimension(r4)
            int r5 = (int) r2
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r0)
            r0 = r22
            r4 = r5
            r0.m33850j(r1, r2, r3, r4, r5)
        L_0x00d0:
            r0 = 2131429447(0x7f0b0847, float:1.8480567E38)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.google.protobuf.cq r1 = r15.f48766e
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L_0x00e0:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0119
            java.lang.Object r4 = r2.next()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r4
            android.view.ViewGroup r5 = r6.m33845e(r4, r9)
            if (r5 == 0) goto L_0x00e0
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r13 = r4.f48748h
            if (r13 != 0) goto L_0x00f8
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r13 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
        L_0x00f8:
            boolean r13 = r13.f48967c
            if (r13 == 0) goto L_0x00fe
            r6.f49231f = r5
        L_0x00fe:
            int r3 = r3 + 1
            int r13 = r1.size()
            if (r3 != r13) goto L_0x0113
            android.view.ViewGroup$LayoutParams r13 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            r14 = 0
            r13.setMarginEnd(r14)
            r5.setLayoutParams(r13)
        L_0x0113:
            r0.addView(r5)
            java.lang.String r4 = r4.f48743c
            goto L_0x00e0
        L_0x0119:
            android.widget.LinearLayout r0 = r6.f49227b
            r0.addView(r11)
            r11 = 0
            goto L_0x0033
        L_0x0121:
            com.google.protobuf.cq r11 = r7.f48805d
            r12 = 0
        L_0x0124:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x01c4
            r0 = 12
            if (r12 >= r0) goto L_0x01c4
            java.lang.Object r0 = r11.get(r12)
            r4 = r0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w) r4
            int r0 = r4.f48789a
            r0 = r0 & r5
            if (r0 == 0) goto L_0x01b7
            android.view.LayoutInflater r0 = r6.f49235k
            r1 = 2131626717(0x7f0e0add, float:1.8880678E38)
            android.widget.ScrollView r2 = r6.f49232h
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.String r0 = r4.f48790b
            android.view.View r1 = r3.findViewById(r15)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = r4.f48791c
            if (r0 != 0) goto L_0x015a
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
        L_0x015a:
            r1 = r0
            android.view.View r0 = r3.findViewById(r14)
            r16 = r0
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            android.widget.ScrollView r0 = r6.f49232h
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131171793(0x7f0719d1, float:1.7957983E38)
            float r0 = r0.getDimension(r2)
            int r2 = (int) r0
            j$.util.Optional r17 = p3186j$.util.Optional.empty()
            r0 = r22
            r18 = r2
            r2 = r17
            r13 = r3
            r3 = r16
            r14 = r4
            r4 = r18
            r15 = 1
            r5 = r18
            r0.m33850j(r1, r2, r3, r4, r5)
            j$.util.Optional r0 = r6.f49229d
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = r14.f48792d
            if (r1 != 0) goto L_0x018f
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
        L_0x018f:
            j$.util.Optional r0 = m33847g(r0, r13, r1)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.f r1 = r6.f49230e
            com.google.apps.tiktok.tracing.dh r2 = r6.f49238n
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.g r3 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.g
            r3.<init>(r6, r0, r14, r9)
            com.google.apps.tiktok.tracing.co r0 = new com.google.apps.tiktok.tracing.co
            java.lang.String r4 = "#IMMERSIVE# row item clicked"
            r0.<init>(r2, r4, r3)
            j$.util.Optional r2 = r6.f49229d
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            r1.mo23049a(r13, r0, r2, r3)
            if (r12 != 0) goto L_0x01b1
            r6.f49231f = r13
            r12 = 0
        L_0x01b1:
            android.widget.LinearLayout r0 = r6.f49227b
            r0.addView(r13)
            goto L_0x01b8
        L_0x01b7:
            r15 = 1
        L_0x01b8:
            int r12 = r12 + r15
            r5 = 1
            r13 = 8
            r14 = 2131432357(0x7f0b13a5, float:1.848647E38)
            r15 = 2131436487(0x7f0b23c7, float:1.8494846E38)
            goto L_0x0124
        L_0x01c4:
            r15 = 1
            com.google.protobuf.cq r11 = r7.f48806e
            android.widget.ScrollView r0 = r6.f49232h
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131493228(0x7f0c016c, float:1.860993E38)
            int r0 = r0.getInteger(r1)
            int r1 = r11.size()
            int r12 = java.lang.Math.min(r0, r1)
            java.lang.String r13 = ""
            if (r12 != 0) goto L_0x01e4
            r19 = r13
            goto L_0x03b4
        L_0x01e4:
            android.view.LayoutInflater r0 = r6.f49235k
            r1 = 2131627227(0x7f0e0cdb, float:1.8881712E38)
            android.widget.ScrollView r2 = r6.f49232h
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r14 = r0
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r14.setOrientation(r3)
            r0 = 0
            r5 = 0
        L_0x01f8:
            if (r5 >= r12) goto L_0x03a5
            java.lang.Object r1 = r11.get(r5)
            r4 = r1
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k) r4
            boolean r1 = r4.f48758f
            r18 = r0 | r1
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = r4.f48754b
            if (r0 != 0) goto L_0x020b
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
        L_0x020b:
            int r0 = r4.f48753a
            r0 = r0 & r15
            if (r0 == 0) goto L_0x0370
            android.view.LayoutInflater r0 = r6.f49235k
            r2 = 2131626714(0x7f0e0ada, float:1.8880672E38)
            r3 = 0
            android.view.View r0 = r0.inflate(r2, r14, r3)
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = r4.f48754b
            if (r0 != 0) goto L_0x0224
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
            goto L_0x0225
        L_0x0224:
            r2 = r0
        L_0x0225:
            int r2 = r2.f48722b
            int r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16629aa.m33703a(r2)
            int r1 = r2 + -1
            if (r2 == 0) goto L_0x036e
            if (r1 == 0) goto L_0x0260
            if (r1 == r15) goto L_0x0246
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.f.e r1 = f49225a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r15 = "#renderGridItem Text not supported or not set"
            r2 = 46867(0xb713, float:6.5675E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r15)
            goto L_0x0273
        L_0x0246:
            android.content.Context r0 = r3.getContext()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r1 = r4.f48754b
            if (r1 != 0) goto L_0x0250
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
        L_0x0250:
            int r2 = r1.f48722b
            r15 = 2
            if (r2 != r15) goto L_0x025a
            java.lang.Object r1 = r1.f48723c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x025b
        L_0x025a:
            r1 = r13
        L_0x025b:
            j$.util.Optional r0 = m33846f(r0, r1)
            goto L_0x0273
        L_0x0260:
            if (r0 != 0) goto L_0x0264
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
        L_0x0264:
            int r1 = r0.f48722b
            r2 = 1
            if (r1 != r2) goto L_0x026e
            java.lang.Object r0 = r0.f48723c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x026f
        L_0x026e:
            r0 = r13
        L_0x026f:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x0273:
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x0370
            r15 = 2131436487(0x7f0b23c7, float:1.8494846E38)
            android.view.View r1 = r3.findViewById(r15)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = r0.get()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = r4.f48755c
            if (r0 != 0) goto L_0x0292
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
            goto L_0x0293
        L_0x0292:
            r2 = r0
        L_0x0293:
            int r2 = r2.f48722b
            int r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16629aa.m33703a(r2)
            int r15 = r2 + -1
            if (r2 == 0) goto L_0x036c
            if (r15 == 0) goto L_0x02d7
            r2 = 1
            if (r15 == r2) goto L_0x02bb
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.f.e r2 = f49225a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r15 = "#renderCoinListItem SubText not supported or not set"
            r19 = r0
            r0 = 46868(0xb714, float:6.5676E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r0)).mo56386p(r15)
            r0 = r19
            r19 = r5
            goto L_0x02ec
        L_0x02bb:
            android.content.Context r0 = r3.getContext()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r2 = r4.f48755c
            if (r2 != 0) goto L_0x02c5
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
        L_0x02c5:
            int r15 = r2.f48722b
            r19 = r5
            r5 = 2
            if (r15 != r5) goto L_0x02d1
            java.lang.Object r2 = r2.f48723c
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x02d2
        L_0x02d1:
            r2 = r13
        L_0x02d2:
            j$.util.Optional r0 = m33846f(r0, r2)
            goto L_0x02ec
        L_0x02d7:
            r19 = r5
            if (r0 != 0) goto L_0x02dd
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
        L_0x02dd:
            int r2 = r0.f48722b
            r5 = 1
            if (r2 != r5) goto L_0x02e7
            java.lang.Object r0 = r0.f48723c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x02e8
        L_0x02e7:
            r0 = r13
        L_0x02e8:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x02ec:
            boolean r2 = r0.isPresent()
            if (r2 == 0) goto L_0x030b
            r2 = 2131436186(0x7f0b229a, float:1.8494235E38)
            android.view.View r2 = r3.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r0 = r0.get()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            r0 = 1
            r1.setMaxLines(r0)
            r2.setMaxLines(r0)
        L_0x030b:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = r4.f48756d
            if (r0 != 0) goto L_0x0311
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
        L_0x0311:
            r1 = r0
            r15 = 2131432357(0x7f0b13a5, float:1.848647E38)
            android.view.View r0 = r3.findViewById(r15)
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.widget.ScrollView r0 = r6.f49232h
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131171762(0x7f0719b2, float:1.795792E38)
            float r0 = r0.getDimension(r2)
            int r2 = (int) r0
            j$.util.Optional r16 = p3186j$.util.Optional.empty()
            r0 = r22
            r20 = r2
            r2 = r16
            r15 = r3
            r3 = r5
            r5 = r4
            r4 = r20
            r21 = r11
            r11 = r19
            r19 = r13
            r13 = r5
            r5 = r20
            r0.m33850j(r1, r2, r3, r4, r5)
            j$.util.Optional r0 = r6.f49229d
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = r13.f48757e
            if (r1 != 0) goto L_0x034d
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
        L_0x034d:
            j$.util.Optional r0 = m33847g(r0, r15, r1)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.f r1 = r6.f49230e
            com.google.apps.tiktok.tracing.dh r2 = r6.f49238n
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.e r3 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.e
            r3.<init>(r6, r13, r0, r9)
            com.google.apps.tiktok.tracing.co r0 = new com.google.apps.tiktok.tracing.co
            java.lang.String r4 = "#IMMERSIVE# gridItem clicked"
            r0.<init>(r2, r4, r3)
            j$.util.Optional r2 = r6.f49229d
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            r1.mo23049a(r15, r0, r2, r3)
            r1 = r15
            goto L_0x0377
        L_0x036c:
            r0 = 0
            throw r0
        L_0x036e:
            r0 = 0
            throw r0
        L_0x0370:
            r21 = r11
            r19 = r13
            r0 = 0
            r11 = r5
            r1 = r0
        L_0x0377:
            if (r1 != 0) goto L_0x0381
            if (r18 == 0) goto L_0x037e
            r0 = r18
            goto L_0x03a7
        L_0x037e:
            r5 = r11
            r0 = 1
            goto L_0x039b
        L_0x0381:
            int r0 = r12 + -1
            if (r11 != r0) goto L_0x0392
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r2 = 0
            r0.setMarginEnd(r2)
            r1.setLayoutParams(r0)
        L_0x0392:
            if (r11 != 0) goto L_0x0397
            r6.f49231f = r1
            r11 = 0
        L_0x0397:
            r14.addView(r1)
            goto L_0x037e
        L_0x039b:
            int r5 = r5 + r0
            r0 = r18
            r13 = r19
            r11 = r21
            r15 = 1
            goto L_0x01f8
        L_0x03a5:
            r19 = r13
        L_0x03a7:
            int r1 = r14.getChildCount()
            if (r1 == r12) goto L_0x03af
            if (r0 != 0) goto L_0x03b4
        L_0x03af:
            android.widget.LinearLayout r0 = r6.f49227b
            r0.addView(r14)
        L_0x03b4:
            com.google.protobuf.cq r11 = r7.f48807f
            r12 = 0
        L_0x03b7:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x0496
            java.lang.Object r0 = r11.get(r12)
            r13 = r0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u r13 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u) r13
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = r13.f48782b
            if (r0 != 0) goto L_0x03ca
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
        L_0x03ca:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = r13.f48783c
            int r0 = r13.f48781a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0490
            android.view.LayoutInflater r0 = r6.f49235k
            r1 = 2131626716(0x7f0e0adc, float:1.8880676E38)
            android.widget.ScrollView r2 = r6.f49232h
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r14 = r0
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = r13.f48782b
            if (r0 != 0) goto L_0x03e7
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
        L_0x03e7:
            int r1 = r0.f48722b
            r2 = 1
            if (r1 != r2) goto L_0x03f1
            java.lang.Object r0 = r0.f48723c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x03f3
        L_0x03f1:
            r0 = r19
        L_0x03f3:
            r1 = 2131436459(0x7f0b23ab, float:1.849479E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = r13.f48784d
            if (r0 != 0) goto L_0x0405
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s.f48773e
        L_0x0405:
            r1 = r0
            r0 = 2131432337(0x7f0b1391, float:1.8486429E38)
            android.view.View r0 = r14.findViewById(r0)
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.widget.ScrollView r0 = r6.f49232h
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131171754(0x7f0719aa, float:1.7957903E38)
            float r0 = r0.getDimension(r2)
            int r5 = (int) r0
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            r0 = r22
            r4 = r5
            r0.m33850j(r1, r2, r3, r4, r5)
            r0 = 2131430165(0x7f0b0b15, float:1.8482023E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r1 = r13.f48783c
            if (r1 != 0) goto L_0x0438
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
            goto L_0x0439
        L_0x0438:
            r2 = r1
        L_0x0439:
            int r2 = r2.f48724d
            int r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16631ac.m33704a(r2)
            if (r2 != 0) goto L_0x0444
        L_0x0441:
            r2 = 8
            goto L_0x044d
        L_0x0444:
            r3 = 3
            if (r2 != r3) goto L_0x0441
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0460
        L_0x044d:
            if (r1 != 0) goto L_0x0451
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad.f48719e
        L_0x0451:
            int r3 = r1.f48722b
            r4 = 1
            if (r3 != r4) goto L_0x045b
            java.lang.Object r1 = r1.f48723c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x045d
        L_0x045b:
            r1 = r19
        L_0x045d:
            r0.setText(r1)
        L_0x0460:
            j$.util.Optional r0 = r6.f49229d
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = r13.f48785e
            if (r1 != 0) goto L_0x0468
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
        L_0x0468:
            j$.util.Optional r0 = m33847g(r0, r14, r1)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.f r1 = r6.f49230e
            com.google.apps.tiktok.tracing.dh r3 = r6.f49238n
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.c r4 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.c
            r4.<init>(r6, r0, r13, r9)
            com.google.apps.tiktok.tracing.co r0 = new com.google.apps.tiktok.tracing.co
            java.lang.String r5 = "#IMMERSIVE# disambigButton clicked"
            r0.<init>(r3, r5, r4)
            j$.util.Optional r3 = r6.f49229d
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            r1.mo23049a(r14, r0, r3, r4)
            if (r12 != 0) goto L_0x048a
            r6.f49231f = r14
            r12 = 0
        L_0x048a:
            android.widget.LinearLayout r0 = r6.f49227b
            r0.addView(r14)
            goto L_0x0492
        L_0x0490:
            r2 = 8
        L_0x0492:
            r0 = 1
            int r12 = r12 + r0
            goto L_0x03b7
        L_0x0496:
            com.google.protobuf.cq r0 = r7.f48809h
            java.util.Iterator r0 = r0.iterator()
        L_0x049c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x058b
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.y r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y) r1
            android.view.LayoutInflater r2 = r6.f49235k
            r3 = 2131626718(0x7f0e0ade, float:1.888068E38)
            android.widget.ScrollView r4 = r6.f49232h
            r5 = 0
            android.view.View r2 = r2.inflate(r3, r4, r5)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            boolean r3 = r1.f48798c
            if (r3 != 0) goto L_0x04c1
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            r4 = -2
            r3.width = r4
        L_0x04c1:
            com.google.protobuf.cq r3 = r1.f48797b
            int r4 = r3.size()
            r5 = 4
            if (r4 >= r5) goto L_0x04fd
            j$.util.Optional r4 = r6.f49229d
            int[] r5 = f49226g
            int r11 = r3.size()
            r5 = r5[r11]
            boolean r11 = r4.isPresent()
            if (r11 == 0) goto L_0x050b
            java.lang.Object r11 = r4.get()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.c r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16777c) r11
            com.google.android.libraries.logging.ve.ab r11 = r11.mo22959c()
            r2.getClass()
            java.lang.Object r4 = r4.get()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.c r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16777c) r4
            com.google.android.libraries.logging.ve.af r4 = r4.mo22960d()
            com.google.android.libraries.logging.ve.h r5 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r5)
            com.google.android.libraries.logging.ve.c r4 = r4.mo33805a(r5)
            r11.mo33801b(r2, r4)
            goto L_0x050b
        L_0x04fd:
            com.google.common.f.e r4 = f49225a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r5 = "More Smart Action buttons are generated than expected."
            r11 = 46885(0xb725, float:6.57E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r11)).mo56386p(r5)
        L_0x050b:
            r4 = 0
        L_0x050c:
            int r5 = r3.size()
            if (r4 >= r5) goto L_0x0580
            int r5 = r3.size()
            int r5 = r5 + -1
            java.lang.Object r11 = r3.get(r4)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r11 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r11
            android.view.ViewGroup r11 = r6.m33845e(r11, r9)
            if (r11 != 0) goto L_0x0527
            r16 = r0
            goto L_0x057b
        L_0x0527:
            java.lang.Object r12 = r3.get(r4)
            com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i) r12
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r12 = r12.f48748h
            if (r12 != 0) goto L_0x0533
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be.f48963e
        L_0x0533:
            boolean r12 = r12.f48967c
            if (r12 == 0) goto L_0x0547
            com.google.common.f.e r12 = f49225a
            com.google.common.f.x r12 = r12.mo56224b()
            java.lang.String r13 = "Requesting focus"
            r14 = 46886(0xb726, float:6.5701E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r14)).mo56386p(r13)
            r6.f49231f = r11
        L_0x0547:
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            int r13 = r12.rightMargin
            boolean r14 = r1.f48798c
            if (r14 == 0) goto L_0x056d
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            int r12 = r12.height
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = r0
            r0 = 0
            r14.<init>(r0, r12, r15)
            r12 = 17
            r14.gravity = r12
            if (r4 != r5) goto L_0x0566
            r13 = 0
        L_0x0566:
            r14.setMarginEnd(r13)
            r11.setLayoutParams(r14)
            goto L_0x0578
        L_0x056d:
            r16 = r0
            r0 = 0
            if (r4 != r5) goto L_0x0578
            r12.setMarginEnd(r0)
            r11.setLayoutParams(r12)
        L_0x0578:
            r2.addView(r11)
        L_0x057b:
            int r4 = r4 + 1
            r0 = r16
            goto L_0x050c
        L_0x0580:
            r16 = r0
            android.widget.LinearLayout r0 = r6.f49227b
            r0.addView(r2)
            r0 = r16
            goto L_0x049c
        L_0x058b:
            boolean r0 = r7.f48812k
            r1 = 2131435371(0x7f0b1f6b, float:1.8492582E38)
            if (r0 == 0) goto L_0x05aa
            android.widget.LinearLayout r0 = r6.f49227b
            int r0 = r0.getChildCount()
            r2 = 1
            if (r0 != r2) goto L_0x05aa
            android.widget.LinearLayout r0 = r6.f49227b
            r3 = 0
            android.view.View r0 = r0.getChildAt(r3)
            int r0 = r0.getId()
            if (r0 != r1) goto L_0x05aa
            r5 = 1
            goto L_0x05ab
        L_0x05aa:
            r5 = 0
        L_0x05ab:
            android.widget.ScrollView r0 = r6.f49232h
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r0 == 0) goto L_0x05d9
            if (r5 == 0) goto L_0x05c5
            android.widget.ScrollView r2 = r6.f49232h
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131171787(0x7f0719cb, float:1.795797E38)
            int r2 = r2.getDimensionPixelSize(r3)
            goto L_0x05d2
        L_0x05c5:
            android.widget.ScrollView r2 = r6.f49232h
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131171789(0x7f0719cd, float:1.7957974E38)
            int r2 = r2.getDimensionPixelSize(r3)
        L_0x05d2:
            r0.topMargin = r2
            android.widget.ScrollView r2 = r6.f49232h
            r2.setLayoutParams(r0)
        L_0x05d9:
            android.widget.LinearLayout r0 = r6.f49227b
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x060d
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x060d
            if (r5 == 0) goto L_0x05fb
            android.widget.ScrollView r2 = r6.f49232h
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131171767(0x7f0719b7, float:1.795793E38)
            int r2 = r2.getDimensionPixelSize(r3)
            goto L_0x0608
        L_0x05fb:
            android.widget.ScrollView r2 = r6.f49232h
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131171771(0x7f0719bb, float:1.7957938E38)
            int r2 = r2.getDimensionPixelSize(r3)
        L_0x0608:
            r1.bottomMargin = r2
            r0.setLayoutParams(r1)
        L_0x060d:
            if (r5 == 0) goto L_0x0611
            r14 = 0
            goto L_0x061e
        L_0x0611:
            android.widget.ScrollView r0 = r6.f49232h
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131171786(0x7f0719ca, float:1.7957968E38)
            int r14 = r0.getDimensionPixelSize(r1)
        L_0x061e:
            androidx.constraintlayout.widget.o r0 = new androidx.constraintlayout.widget.o
            r0.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.f49234j
            r0.mo4889i(r1)
            r1 = 2131432460(0x7f0b140c, float:1.8486678E38)
            androidx.constraintlayout.widget.j r1 = r0.mo4885e(r1)
            androidx.constraintlayout.widget.k r1 = r1.f5342e
            r1.f5364R = r14
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.f49234j
            r0.mo4888h(r1)
            android.widget.ScrollView r0 = r6.f49232h
            android.widget.LinearLayout r1 = r6.f49227b
            r0.addView(r1)
            j$.util.Optional r0 = r6.f49239o
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0654
            j$.util.Optional r0 = r6.f49239o
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.search.b.b r0 = (com.google.android.libraries.search.p2871b.C37215b) r0
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97485bD
            r0.mo19974a(r1)
        L_0x0654:
            if (r10 == 0) goto L_0x0662
            android.view.View r0 = r6.f49231f
            if (r0 == 0) goto L_0x0662
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.f r0 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.f
            r0.<init>(r6)
            r6.m33849i(r10, r0)
        L_0x0662:
            boolean r0 = r8.f49012h
            if (r0 == 0) goto L_0x0682
            android.widget.ScrollView r0 = r6.f49232h
            r1 = 0
            r0.setVerticalScrollBarEnabled(r1)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.y r0 = r6.f49233i
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.m r1 = r9.f40388g
            if (r1 != 0) goto L_0x0674
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.m r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12995m.f40394e
        L_0x0674:
            android.widget.ScrollView r2 = r0.f49267a
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.x r3 = new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.x
            r3.<init>(r0, r1)
            r2.addOnGlobalLayoutListener(r3)
        L_0x0682:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16813l.mo23039d(com.google.android.libraries.assistant.auto.tng.ui.c.a.b, com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bm, com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i, android.transition.Transition):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m33848h(com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r11.f48770a
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0020
            if (r0 == r6) goto L_0x001e
            if (r0 == r5) goto L_0x001c
            if (r0 == r4) goto L_0x001a
            if (r0 == r3) goto L_0x0018
            if (r0 == r2) goto L_0x0016
            r7 = 0
            goto L_0x0021
        L_0x0016:
            r7 = 5
            goto L_0x0021
        L_0x0018:
            r7 = 4
            goto L_0x0021
        L_0x001a:
            r7 = 3
            goto L_0x0021
        L_0x001c:
            r7 = 2
            goto L_0x0021
        L_0x001e:
            r7 = 1
            goto L_0x0021
        L_0x0020:
            r7 = 6
        L_0x0021:
            int r8 = r7 + -1
            r9 = 0
            if (r7 == 0) goto L_0x00ef
            java.lang.String r7 = ""
            if (r8 == 0) goto L_0x00e7
            if (r8 == r6) goto L_0x00d8
            if (r8 == r5) goto L_0x00cb
            if (r8 == r4) goto L_0x0068
            if (r8 == r3) goto L_0x0041
            com.google.common.f.e r11 = f49225a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r12 = "Image source could not be extracted"
            r13 = 46870(0xb716, float:6.5679E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            return r9
        L_0x0041:
            android.widget.ScrollView r12 = r10.f49232h
            android.content.Context r12 = r12.getContext()
            int r13 = r11.f48770a
            if (r13 != r2) goto L_0x0050
            java.lang.Object r11 = r11.f48771b
            r7 = r11
            java.lang.String r7 = (java.lang.String) r7
        L_0x0050:
            android.content.pm.PackageManager r11 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0059 }
            android.graphics.drawable.Drawable r9 = r11.getApplicationIcon(r7)     // Catch:{ NameNotFoundException -> 0x0059 }
            goto L_0x0067
        L_0x0059:
            com.google.common.f.e r11 = f49225a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r12 = "Package %s not found."
            r13 = 46863(0xb70f, float:6.5669E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56389s(r12, r7)
        L_0x0067:
            return r9
        L_0x0068:
            if (r0 != r3) goto L_0x006f
            java.lang.Object r11 = r11.f48771b
            r7 = r11
            java.lang.String r7 = (java.lang.String) r7
        L_0x006f:
            com.google.common.f.e r11 = f49225a
            com.google.common.f.x r11 = r11.mo56224b()
            java.lang.String r0 = "#generateMonogram: text %s"
            r1 = 46862(0xb70e, float:6.5668E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56389s(r0, r7)
            android.widget.ScrollView r11 = r10.f49232h
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r11, r13, r12, r0)
            com.google.android.libraries.aw.a.b.b r12 = com.google.android.libraries.p1638aw.p1639a.p1641b.C19593b.f54528f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.aw.a.b.a r12 = (com.google.android.libraries.p1638aw.p1639a.p1641b.C19592a) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.libraries.aw.a.b.b r13 = (com.google.android.libraries.p1638aw.p1639a.p1641b.C19593b) r13
            r7.getClass()
            int r0 = r13.f54530a
            r0 = r0 | r6
            r13.f54530a = r0
            r13.f54531b = r7
            com.google.protobuf.bv r12 = r12.build()
            com.google.android.libraries.aw.a.b.b r12 = (com.google.android.libraries.p1638aw.p1639a.p1641b.C19593b) r12
            com.google.android.libraries.aw.a.c r13 = r10.f49237m
            if (r12 != 0) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            com.google.android.libraries.aw.a.d r9 = new com.google.android.libraries.aw.a.d
            r9.<init>(r12)
        L_0x00b6:
            r13.mo24850c(r9)
            r13.mo24849b(r7)
            r13.mo24848a(r11)
            android.graphics.drawable.BitmapDrawable r12 = new android.graphics.drawable.BitmapDrawable
            android.widget.ScrollView r13 = r10.f49232h
            android.content.res.Resources r13 = r13.getResources()
            r12.<init>(r13, r11)
            return r12
        L_0x00cb:
            if (r0 != r4) goto L_0x00d2
            java.lang.Object r11 = r11.f48771b
            r7 = r11
            java.lang.String r7 = (java.lang.String) r7
        L_0x00d2:
            com.google.android.libraries.assistant.auto.tng.ui.a.b r11 = new com.google.android.libraries.assistant.auto.tng.ui.a.b
            r11.<init>(r7)
            return r11
        L_0x00d8:
            if (r0 != r5) goto L_0x00e2
            java.lang.Object r11 = r11.f48771b
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r1 = r11.intValue()
        L_0x00e2:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            return r11
        L_0x00e7:
            if (r0 != r6) goto L_0x00ee
            java.lang.Object r11 = r11.f48771b
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L_0x00ee:
            return r7
        L_0x00ef:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16813l.m33848h(com.google.android.libraries.assistant.auto.tng.ui.c.a.a.p, int, int):java.lang.Object");
    }
}
