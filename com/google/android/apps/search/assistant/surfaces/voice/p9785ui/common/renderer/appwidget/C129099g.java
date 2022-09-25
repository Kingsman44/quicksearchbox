package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget;

import android.content.ComponentName;
import android.content.Context;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.appactions.appwidget.AssistantAppWidgetHost$1;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32468a;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32469b;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32470c;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32474g;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32477j;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32478k;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32481n;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32484q;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.agj;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g */
/* compiled from: PG */
public final class C129099g implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public static final C59071e f354652a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g");

    /* renamed from: b */
    public final agj f354653b;

    /* renamed from: c */
    public final Context f354654c;

    /* renamed from: d */
    public final C46439e f354655d;

    /* renamed from: e */
    public final C62921ba f354656e;

    /* renamed from: f */
    public final C32477j f354657f;

    /* renamed from: g */
    public final C47770dh f354658g;

    /* renamed from: h */
    public final String f354659h;

    /* renamed from: i */
    public final String f354660i;

    /* renamed from: j */
    public final String f354661j;

    /* renamed from: k */
    public final String f354662k;

    /* renamed from: l */
    public final String f354663l;

    /* renamed from: m */
    public boolean f354664m = false;

    /* renamed from: n */
    public final C46440f f354665n;

    /* renamed from: o */
    private final int f354666o;

    /* renamed from: p */
    private final C32481n f354667p;

    /* renamed from: q */
    private final C129094b f354668q;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g$a */
    /* compiled from: PG */
    final class C129100a implements C46440f {
        public C129100a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            agj agj = C129099g.this.f354653b;
            ((C59052c) ((C59052c) C129099g.f354652a.mo56226d()).mo56372aa(38092)).mo56354G("failed to get speech response for %s:%s", agj.f135057b, agj.f135060e);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ void mo18067c(java.lang.Object r10, java.lang.Object r11) {
            /*
                r9 = this;
                java.lang.Void r10 = (java.lang.Void) r10
                com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto r11 = (com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) r11
                r11.getClass()
                com.google.android.libraries.search.assistant.appactions.appwidget.i r10 = com.google.android.libraries.search.assistant.appactions.appwidget.C32476i.f87025e
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                com.google.protobuf.ba r0 = r0.f354656e
                com.google.protobuf.MessageLite r10 = r11.mo58938a(r10, r0)
                com.google.android.libraries.search.assistant.appactions.appwidget.i r10 = (com.google.android.libraries.search.assistant.appactions.appwidget.C32476i) r10
                java.lang.String r11 = r10.f87028b
                java.lang.String r0 = r10.f87030d
                java.lang.String r10 = r10.f87029c
                boolean r1 = android.text.TextUtils.isEmpty(r11)
                if (r1 == 0) goto L_0x0023
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r11 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                java.lang.String r11 = r11.f354659h
            L_0x0023:
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                boolean r3 = android.text.TextUtils.isEmpty(r10)
                r4 = 2132083375(0x7f1502af, float:1.980689E38)
                r5 = 1
                r6 = 0
                r7 = 2
                if (r2 == 0) goto L_0x003c
                if (r3 == 0) goto L_0x005c
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                java.lang.String r2 = r2.f354663l
                goto L_0x006c
            L_0x003c:
                if (r3 == 0) goto L_0x005c
                java.lang.String r2 = "<speak>"
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x004b
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                java.lang.String r2 = r2.f354663l
                goto L_0x006c
            L_0x004b:
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                android.content.Context r3 = r2.f354654c
                java.lang.Object[] r8 = new java.lang.Object[r7]
                java.lang.String r2 = r2.f354660i
                r8[r6] = r2
                r8[r5] = r0
                java.lang.String r2 = r3.getString(r4, r8)
                goto L_0x006c
            L_0x005c:
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                android.content.Context r3 = r2.f354654c
                java.lang.Object[] r8 = new java.lang.Object[r7]
                java.lang.String r2 = r2.f354660i
                r8[r6] = r2
                r8[r5] = r10
                java.lang.String r2 = r3.getString(r4, r8)
            L_0x006c:
                r1.mo108847b(r2)
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                boolean r3 = android.text.TextUtils.isEmpty(r10)
                if (r2 == 0) goto L_0x0093
                if (r3 == 0) goto L_0x0082
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r10 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                java.lang.String r10 = r10.f354662k
                goto L_0x00a3
            L_0x0082:
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                android.content.Context r2 = r0.f354654c
                java.lang.Object[] r3 = new java.lang.Object[r7]
                java.lang.String r0 = r0.f354661j
                r3[r6] = r0
                r3[r5] = r10
                java.lang.String r10 = r2.getString(r4, r3)
                goto L_0x00a3
            L_0x0093:
                com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.g r10 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.this
                android.content.Context r2 = r10.f354654c
                java.lang.Object[] r3 = new java.lang.Object[r7]
                java.lang.String r10 = r10.f354661j
                r3[r6] = r10
                r3[r5] = r0
                java.lang.String r10 = r2.getString(r4, r3)
            L_0x00a3:
                r1.mo108846a(r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129099g.C129100a.mo18067c(java.lang.Object, java.lang.Object):void");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C129099g(C129096d dVar, Context context, C129094b bVar, C32481n nVar, C62921ba baVar, C46439e eVar, C47770dh dhVar, C32478k kVar) {
        String str;
        agj agj = dVar.f354646b;
        agj = agj == null ? agj.f135054g : agj;
        this.f354653b = agj;
        this.f354666o = dVar.f354647c;
        this.f354667p = nVar;
        this.f354656e = baVar;
        this.f354655d = eVar;
        this.f354668q = bVar;
        C32477j jVar = new C32477j(kVar.f87036c, kVar.f87037d, dVar.f354648d, kVar.f87035b);
        C2384o oVar = kVar.f87034a;
        C58838bb.m90884s(!oVar.mo5789a().mo5788a(C2383n.STARTED), "AssistantAppWidgetHost should be created before onStart() because it will perform setups in onStart() of the fragment.");
        oVar.mo5790b(new AssistantAppWidgetHost$1(jVar));
        this.f354657f = jVar;
        this.f354654c = context;
        this.f354658g = dhVar;
        this.f354659h = Locale.getDefault().toLanguageTag();
        if (!agj.f135058c.isEmpty()) {
            str = agj.f135058c;
        } else {
            str = nVar.mo38105a(agj.f135057b);
            if (str == null) {
                str = agj.f135057b;
            }
        }
        this.f354660i = str;
        String str2 = !agj.f135059d.isEmpty() ? agj.f135059d : str;
        this.f354661j = str2;
        this.f354662k = context.getString(R.string.assistant_app_widget_fallback_text, new Object[]{str2});
        this.f354663l = context.getString(R.string.assistant_app_widget_fallback_text, new Object[]{str});
        this.f354665n = new C129100a();
    }

    /* renamed from: a */
    public final void mo108846a(String str, String str2) {
        TtsPlayerViewModel ttsPlayerViewModel = (TtsPlayerViewModel) new C2368bp(this.f354668q).mo5770a(TtsPlayerViewModel.class);
        C69664n.m101061g(str, "text");
        C69664n.m101061g(str2, "lang");
        C71643cp cpVar = (C71643cp) ttsPlayerViewModel.f354637d.getAndSet(C71803m.m105043d(ttsPlayerViewModel.f354634a, ttsPlayerViewModel.f354635b, (C71424ay) null, new C129106m(ttsPlayerViewModel, str, str2, (C69577g) null), 2));
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
    }

    /* renamed from: b */
    public final void mo108847b(String str) {
        TextView textView;
        View view = this.f354668q.getView();
        if (view != null && (textView = (TextView) view.findViewById(R.id.assistant_app_widget_text)) != null) {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C32468a aVar;
        String str;
        String str2;
        Object obj;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.assistant_widget_card_wrapper);
        C32470c cVar = new C32470c(viewGroup.getMeasuredWidth(), this.f354654c);
        if (this.f354664m) {
            aVar = this.f354667p.mo38106b(this.f354657f, this.f354666o, cVar);
        } else {
            C32481n nVar = this.f354667p;
            C32477j jVar = this.f354657f;
            int i9 = this.f354666o;
            C32484q qVar = new C32484q();
            qVar.f87050a = BuildConfig.FLAVOR;
            agj agj = this.f354653b;
            if ((agj.f135056a & 8) != 0) {
                qVar.f87051b = new ComponentName(agj.f135057b, agj.f135060e);
            } else {
                qVar.mo38092f(agj.f135057b);
            }
            agj agj2 = this.f354653b;
            C62940bt r11 = C62942bv.checkIsLite(C48775a.f126214f);
            agj2.mo58887l(r11);
            if (agj2.f169962ag.mo58857o(r11.f169971d)) {
                agj agj3 = this.f354653b;
                C62940bt r112 = C62942bv.checkIsLite(C48775a.f126214f);
                agj3.mo58887l(r112);
                Object l = agj3.f169962ag.mo58854l(r112.f169971d);
                if (l == null) {
                    obj = r112.f169969b;
                } else {
                    obj = r112.mo58889c(l);
                }
                qVar.f87052c = (C52846w) obj;
            }
            if (this.f354653b.f135061f) {
                this.f354655d.mo50445g(C46438d.m82809a(C2169h.m6027a(new C129097e(qVar))), new C46436b((Object) null), this.f354665n);
            }
            aVar = nVar.mo38107c(jVar, i9, qVar.mo38088b(), cVar);
        }
        this.f354664m = true;
        int i10 = aVar.f87011b;
        if (i10 == 1) {
            C32474g gVar = aVar.f87010a;
            gVar.getClass();
            Context context = this.f354654c;
            SizeF a = gVar.f87022b.mo38086a(gVar.f87021a);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) C32469b.m60261a(context, a.getHeight()));
            if ((gVar.f87021a.resizeMode & 1) == 0) {
                layoutParams.width = (int) C32469b.m60261a(context, a.getWidth());
            }
            if (viewGroup instanceof LinearLayout) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
                layoutParams2.gravity = 17;
                gVar.mo38098a(context, viewGroup, layoutParams2);
            } else if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams);
                layoutParams3.gravity = 17;
                gVar.mo38098a(context, viewGroup, layoutParams3);
            } else {
                gVar.mo38098a(context, viewGroup, layoutParams);
            }
            ((TextView) view.findViewById(R.id.assistant_widget_card_footer)).setText(this.f354654c.getString(R.string.assistant_app_widget_footer_text, new Object[]{this.f354660i}));
            if (!this.f354653b.f135061f) {
                mo108847b(this.f354663l);
                mo108846a(this.f354662k, this.f354659h);
                return;
            }
            return;
        }
        if (i10 == 3) {
            str = this.f354654c.getString(R.string.assistant_no_app_widget_text, new Object[]{this.f354660i});
        } else {
            str = this.f354654c.getString(R.string.assistant_app_widget_error_text, new Object[]{this.f354660i});
        }
        mo108847b(str);
        if (aVar.f87011b == 3) {
            str2 = this.f354654c.getString(R.string.assistant_no_app_widget_text, new Object[]{this.f354661j});
        } else {
            str2 = this.f354654c.getString(R.string.assistant_app_widget_error_text, new Object[]{this.f354661j});
        }
        mo108846a(str2, this.f354659h);
    }
}
