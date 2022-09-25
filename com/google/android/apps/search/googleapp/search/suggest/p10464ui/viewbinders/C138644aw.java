package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.p033v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.C6007z;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138125g;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.aw */
/* compiled from: PG */
public final class C138644aw extends C46756m {

    /* renamed from: c */
    private static final C58974d f377078c = C58974d.m91134h("AnswerSuggestViewBinder");

    /* renamed from: a */
    public final Context f377079a;

    /* renamed from: b */
    public final C138631aj f377080b;

    /* renamed from: d */
    private final C47449e f377081d;

    /* renamed from: e */
    private final C47770dh f377082e;

    /* renamed from: f */
    private final Resources f377083f;

    /* renamed from: g */
    private final C138668u f377084g;

    /* renamed from: h */
    private final boolean f377085h;

    /* renamed from: i */
    private final boolean f377086i;

    /* renamed from: j */
    private LinearLayout f377087j;

    /* renamed from: k */
    private ImageView f377088k;

    /* renamed from: l */
    private ImageView f377089l;

    /* renamed from: m */
    private View f377090m;

    /* renamed from: n */
    private ViewGroup f377091n;

    /* renamed from: o */
    private long f377092o = 0;

    /* renamed from: p */
    private String f377093p = BuildConfig.FLAVOR;

    public C138644aw(Context context, C138631aj ajVar, C47449e eVar, C47770dh dhVar, C138668u uVar, boolean z, boolean z2) {
        this.f377079a = context;
        this.f377083f = context.getResources();
        this.f377080b = ajVar;
        this.f377084g = uVar;
        this.f377081d = eVar;
        this.f377082e = dhVar;
        this.f377085h = z;
        this.f377086i = z2;
    }

    /* renamed from: d */
    public static C138127i m225183d(C138030av avVar) {
        C138125g gVar = (C138125g) C138127i.f375805b.createBuilder();
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        gVar.mo114159a(Collections.unmodifiableMap(aeVar.f142297h));
        return (C138127i) gVar.build();
    }

    /* renamed from: e */
    private final TextView m225184e(ViewGroup viewGroup, List list, boolean z) {
        TextView textView;
        Context context;
        if (this.f377085h) {
            context = new ContextThemeWrapper(this.f377079a, 2132150663);
            textView = (TextView) LayoutInflater.from(context).inflate(R.layout.googleapp_pixel_universal_suggestion_textview, viewGroup, false);
        } else {
            context = this.f377079a;
            textView = new AppCompatTextView(context);
        }
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(C138640as.m225174e(list, context, this.f377083f, this.f377085h));
        m225186g(textView, C138640as.m225172c(list));
        if (z) {
            m225186g(textView, 2);
        }
        return textView;
    }

    /* renamed from: f */
    private final void m225185f(ImageView imageView, String str) {
        if (!C138631aj.m225137l(str)) {
            str = String.format("https:%s", new Object[]{str});
        }
        C47449e eVar = this.f377081d;
        ((C6007z) eVar.mo51286a().mo11870h(Uri.parse(str)).mo11953F(new ColorDrawable(0))).mo12454r(imageView);
        imageView.setVisibility(0);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: g */
    private static void m225186g(TextView textView, int i) {
        if (i > 0) {
            textView.setSingleLine(false);
            textView.setMaxLines(i);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(true != this.f377085h ? R.layout.googleapp_universal_suggestion : R.layout.googleapp_pixel_universal_suggestion, viewGroup, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x029b A[Catch:{ JSONException -> 0x0329 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x029d A[Catch:{ JSONException -> 0x0329 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo18114b(android.view.View r21, java.lang.Object r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "ab"
            r3 = r22
            com.google.android.apps.search.googleapp.search.suggest.ag r3 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r3
            com.google.protobuf.cq r4 = r3.f375483c
            int r4 = r4.size()
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L_0x0016
            r4 = 1
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.common.base.C58838bb.m90868c(r4)
            com.google.protobuf.cq r3 = r3.f375483c
            java.lang.Object r3 = r3.get(r5)
            com.google.android.apps.search.googleapp.search.suggest.av r3 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r3
            long r7 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225173d(r3)
            java.lang.String r4 = r1.f377093p
            java.lang.String r9 = r3.f375539b
            boolean r4 = android.text.TextUtils.equals(r4, r9)
            if (r4 == 0) goto L_0x0038
            long r9 = r1.f377092o
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            r4 = 2131432076(0x7f0b128c, float:1.84859E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r1.f377087j = r4
            r4 = 2131432073(0x7f0b1289, float:1.8485893E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.f377088k = r4
            r4 = 2131432075(0x7f0b128b, float:1.8485897E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.f377089l = r4
            r4 = 2131432017(0x7f0b1251, float:1.848578E38)
            android.view.View r4 = r0.findViewById(r4)
            r1.f377090m = r4
            r4 = 0
            r0.setContentDescription(r4)
            android.widget.LinearLayout r9 = r1.f377087j
            r9.setContentDescription(r4)
            android.widget.LinearLayout r9 = r1.f377087j
            r9.removeAllViews()
            com.google.apps.tiktok.media.e r9 = r1.f377081d
            android.widget.ImageView r10 = r1.f377088k
            com.bumptech.glide.ad r9 = r9.mo51286a()
            r9.mo11876n(r10)
            com.google.apps.tiktok.media.e r9 = r1.f377081d
            android.widget.ImageView r10 = r1.f377089l
            com.bumptech.glide.ad r9 = r9.mo51286a()
            r9.mo11876n(r10)
            android.widget.ImageView r9 = r1.f377089l
            r10 = 8
            r9.setVisibility(r10)
            android.widget.ImageView r9 = r1.f377089l
            r9.setClickable(r5)
            android.view.View r9 = r1.f377090m
            r9.setVisibility(r10)
            android.view.ViewGroup r9 = r1.f377091n
            if (r9 == 0) goto L_0x009e
            r9.removeAllViews()
        L_0x009e:
            com.google.apps.tiktok.tracing.dh r9 = r1.f377082e
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.at r10 = new com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.at
            r10.<init>(r3, r0)
            com.google.apps.tiktok.tracing.co r11 = new com.google.apps.tiktok.tracing.co
            java.lang.String r12 = "Clicked suggestion."
            r11.<init>(r9, r12, r10)
            r0.setOnClickListener(r11)
            com.google.apps.tiktok.tracing.dh r9 = r1.f377082e
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.au r10 = new com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.au
            r10.<init>(r1, r3, r0)
            java.lang.String r11 = "Long-clicked suggestion"
            com.google.android.apps.search.googleapp.b.e r9 = com.google.android.apps.search.googleapp.p10139b.C133488d.m216676a(r9, r10, r11)
            com.google.android.apps.search.googleapp.p10139b.C133488d.m216677b(r0, r9)
            boolean r9 = r1.f377086i
            if (r9 == 0) goto L_0x00d9
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ae r9 = new com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ae
            com.google.apps.tiktok.tracing.dh r10 = r1.f377082e
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.av r11 = new com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.av
            r11.<init>(r3, r0)
            com.google.apps.tiktok.tracing.cj r12 = new com.google.apps.tiktok.tracing.cj
            java.lang.String r13 = "Touched suggestion"
            r12.<init>(r10, r11, r13)
            r9.<init>(r12)
            r0.setOnTouchListener(r9)
        L_0x00d9:
            com.google.at.h.d.a.aq r0 = r3.f375543g
            if (r0 != 0) goto L_0x00df
            com.google.at.h.d.a.aq r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x00df:
            com.google.at.h.d.a.d r0 = r0.f142340l
            if (r0 != 0) goto L_0x00e5
            com.google.at.h.d.a.d r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54240d.f142409e
        L_0x00e5:
            java.lang.String r9 = r0.f142412b
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x00fc
            com.google.common.f.a.d r0 = f377078c
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "No universal template available."
            r3 = 41282(0xa142, float:5.7848E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x00fc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x032b }
            r0.<init>(r9)     // Catch:{ JSONException -> 0x032b }
            java.lang.String r10 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225177h(r0)     // Catch:{ JSONException -> 0x032b }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ JSONException -> 0x032b }
            if (r11 != 0) goto L_0x0124
            android.widget.ImageView r11 = r1.f377088k     // Catch:{ JSONException -> 0x032b }
            r1.m225185f(r11, r10)     // Catch:{ JSONException -> 0x032b }
            android.content.res.Resources r10 = r1.f377083f     // Catch:{ JSONException -> 0x032b }
            r11 = 2131168740(0x7f070de4, float:1.795179E38)
            int r10 = r10.getDimensionPixelSize(r11)     // Catch:{ JSONException -> 0x032b }
            android.widget.ImageView r11 = r1.f377088k     // Catch:{ JSONException -> 0x032b }
            r11.setPaddingRelative(r10, r10, r10, r10)     // Catch:{ JSONException -> 0x032b }
            android.widget.ImageView r10 = r1.f377088k     // Catch:{ JSONException -> 0x032b }
            r10.setColorFilter(r4)     // Catch:{ JSONException -> 0x032b }
            goto L_0x0177
        L_0x0124:
            com.google.protobuf.cj r10 = new com.google.protobuf.cj     // Catch:{ JSONException -> 0x032b }
            com.google.protobuf.ch r11 = r3.f375542e     // Catch:{ JSONException -> 0x032b }
            com.google.protobuf.ci r12 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f     // Catch:{ JSONException -> 0x032b }
            r10.<init>(r11, r12)     // Catch:{ JSONException -> 0x032b }
            com.google.protos.ba.a.b r11 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL     // Catch:{ JSONException -> 0x032b }
            boolean r10 = r10.contains(r11)     // Catch:{ JSONException -> 0x032b }
            if (r6 == r10) goto L_0x0138
            r10 = 44
            goto L_0x013a
        L_0x0138:
            r10 = 28
        L_0x013a:
            android.widget.ImageView r11 = r1.f377088k     // Catch:{ JSONException -> 0x032b }
            int r10 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138631aj.m225140q(r3, r10)     // Catch:{ JSONException -> 0x032b }
            com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138631aj.m225138o(r11, r10)     // Catch:{ JSONException -> 0x032b }
            android.widget.ImageView r10 = r1.f377088k     // Catch:{ JSONException -> 0x032b }
            r10.setAdjustViewBounds(r5)     // Catch:{ JSONException -> 0x032b }
            android.widget.ImageView r10 = r1.f377088k     // Catch:{ JSONException -> 0x032b }
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ JSONException -> 0x032b }
            r10.setScaleType(r11)     // Catch:{ JSONException -> 0x032b }
            boolean r10 = r1.f377085h     // Catch:{ JSONException -> 0x032b }
            if (r10 != 0) goto L_0x0161
            android.content.res.Resources r10 = r1.f377083f     // Catch:{ JSONException -> 0x032b }
            r11 = 2131168742(0x7f070de6, float:1.7951794E38)
            int r10 = r10.getDimensionPixelSize(r11)     // Catch:{ JSONException -> 0x032b }
            android.widget.ImageView r11 = r1.f377088k     // Catch:{ JSONException -> 0x032b }
            r11.setPaddingRelative(r10, r10, r10, r10)     // Catch:{ JSONException -> 0x032b }
        L_0x0161:
            boolean r10 = r1.f377085h     // Catch:{ JSONException -> 0x032b }
            if (r6 == r10) goto L_0x0169
            r10 = 2131099810(0x7f0600a2, float:1.7811984E38)
            goto L_0x016c
        L_0x0169:
            r10 = 2131102099(0x7f060993, float:1.7816626E38)
        L_0x016c:
            android.widget.ImageView r11 = r1.f377088k     // Catch:{ JSONException -> 0x032b }
            android.content.Context r12 = r1.f377079a     // Catch:{ JSONException -> 0x032b }
            int r10 = androidx.core.content.C1878d.m5128a(r12, r10)     // Catch:{ JSONException -> 0x032b }
            r11.setColorFilter(r10)     // Catch:{ JSONException -> 0x032b }
        L_0x0177:
            org.json.JSONArray r10 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225179j(r0)     // Catch:{ JSONException -> 0x032b }
            r11 = 0
        L_0x017c:
            int r12 = r10.length()     // Catch:{ JSONException -> 0x032b }
            if (r11 >= r12) goto L_0x02bb
            org.json.JSONObject r12 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225180k(r10, r11)     // Catch:{ JSONException -> 0x032b }
            if (r11 != 0) goto L_0x018a
            r13 = 1
            goto L_0x018b
        L_0x018a:
            r13 = 0
        L_0x018b:
            java.lang.String r14 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225176g(r12)     // Catch:{ JSONException -> 0x032b }
            int r15 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225170a(r12)     // Catch:{ JSONException -> 0x032b }
            int r4 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225171b(r12)     // Catch:{ JSONException -> 0x032b }
            boolean r16 = android.text.TextUtils.isEmpty(r14)     // Catch:{ JSONException -> 0x032b }
            if (r16 == 0) goto L_0x01a4
            android.widget.LinearLayout r6 = r1.f377087j     // Catch:{ JSONException -> 0x032b }
            r17 = r9
            r21 = r10
            goto L_0x01c6
        L_0x01a4:
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch:{ JSONException -> 0x032b }
            android.content.Context r5 = r1.f377079a     // Catch:{ JSONException -> 0x032b }
            r6.<init>(r5)     // Catch:{ JSONException -> 0x032b }
            r5 = 0
            r6.setOrientation(r5)     // Catch:{ JSONException -> 0x032b }
            r5 = 1
            r6.setDuplicateParentStateEnabled(r5)     // Catch:{ JSONException -> 0x032b }
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x032b }
            r21 = r10
            r10 = -1
            r17 = r9
            r9 = -2
            r5.<init>(r10, r9)     // Catch:{ JSONException -> 0x0329 }
            r6.setLayoutParams(r5)     // Catch:{ JSONException -> 0x0329 }
            android.widget.LinearLayout r5 = r1.f377087j     // Catch:{ JSONException -> 0x0329 }
            r5.addView(r6)     // Catch:{ JSONException -> 0x0329 }
        L_0x01c6:
            if (r14 == 0) goto L_0x0260
            android.support.v7.widget.AppCompatImageView r5 = new android.support.v7.widget.AppCompatImageView     // Catch:{ JSONException -> 0x0329 }
            android.content.Context r9 = r1.f377079a     // Catch:{ JSONException -> 0x0329 }
            r5.<init>(r9)     // Catch:{ JSONException -> 0x0329 }
            r9 = 5
            if (r4 == r9) goto L_0x020c
            android.content.res.Resources r4 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r9 = 2131168749(0x7f070ded, float:1.7951809E38)
            int r4 = r4.getDimensionPixelSize(r9)     // Catch:{ JSONException -> 0x0329 }
            android.content.res.Resources r9 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r10 = 2131168744(0x7f070de8, float:1.7951798E38)
            int r9 = r9.getDimensionPixelSize(r10)     // Catch:{ JSONException -> 0x0329 }
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0329 }
            r10.<init>(r4, r9)     // Catch:{ JSONException -> 0x0329 }
            android.content.res.Resources r4 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r9 = 2131168747(0x7f070deb, float:1.7951805E38)
            int r4 = r4.getDimensionPixelSize(r9)     // Catch:{ JSONException -> 0x0329 }
            if (r15 != 0) goto L_0x01f9
            r18 = r7
            r7 = 0
        L_0x01f7:
            r8 = 0
            goto L_0x0205
        L_0x01f9:
            android.content.res.Resources r9 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r18 = r7
            r7 = 2131168746(0x7f070dea, float:1.7951803E38)
            int r7 = r9.getDimensionPixelSize(r7)     // Catch:{ JSONException -> 0x0329 }
            goto L_0x01f7
        L_0x0205:
            r10.setMargins(r7, r8, r4, r8)     // Catch:{ JSONException -> 0x0329 }
            r5.setLayoutParams(r10)     // Catch:{ JSONException -> 0x0329 }
            goto L_0x025c
        L_0x020c:
            r18 = r7
            android.content.res.Resources r4 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r7 = 2131168750(0x7f070dee, float:1.795181E38)
            int r4 = r4.getDimensionPixelSize(r7)     // Catch:{ JSONException -> 0x0329 }
            android.content.res.Resources r7 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r8 = 2131168745(0x7f070de9, float:1.79518E38)
            int r7 = r7.getDimensionPixelSize(r8)     // Catch:{ JSONException -> 0x0329 }
            android.content.res.Resources r8 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            android.content.res.Configuration r8 = r8.getConfiguration()     // Catch:{ JSONException -> 0x0329 }
            int r8 = r8.getLayoutDirection()     // Catch:{ JSONException -> 0x0329 }
            r9 = 1
            if (r8 == r9) goto L_0x0230
            r8 = 1119092736(0x42b40000, float:90.0)
            goto L_0x0232
        L_0x0230:
            r8 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x0232:
            r5.setRotation(r8)     // Catch:{ JSONException -> 0x0329 }
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0329 }
            r8.<init>(r4, r7)     // Catch:{ JSONException -> 0x0329 }
            android.content.res.Resources r4 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r7 = 2131168747(0x7f070deb, float:1.7951805E38)
            int r4 = r4.getDimensionPixelSize(r7)     // Catch:{ JSONException -> 0x0329 }
            android.content.res.Resources r7 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r10 = 2131168746(0x7f070dea, float:1.7951803E38)
            int r7 = r7.getDimensionPixelSize(r10)     // Catch:{ JSONException -> 0x0329 }
            android.content.res.Resources r10 = r1.f377083f     // Catch:{ JSONException -> 0x0329 }
            r9 = 2131168748(0x7f070dec, float:1.7951807E38)
            int r9 = r10.getDimensionPixelSize(r9)     // Catch:{ JSONException -> 0x0329 }
            r10 = 0
            r8.setMargins(r7, r9, r4, r10)     // Catch:{ JSONException -> 0x0329 }
            r5.setLayoutParams(r8)     // Catch:{ JSONException -> 0x0329 }
        L_0x025c:
            r1.m225185f(r5, r14)     // Catch:{ JSONException -> 0x0329 }
            goto L_0x0263
        L_0x0260:
            r18 = r7
            r5 = 0
        L_0x0263:
            java.util.List r4 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225178i(r12)     // Catch:{ JSONException -> 0x0329 }
            boolean r7 = r4.isEmpty()     // Catch:{ JSONException -> 0x0329 }
            if (r7 != 0) goto L_0x029e
            if (r15 == 0) goto L_0x0292
            int r7 = r4.size()     // Catch:{ JSONException -> 0x0329 }
            if (r15 < r7) goto L_0x0276
            goto L_0x0292
        L_0x0276:
            r7 = 0
            java.util.List r8 = r4.subList(r7, r15)     // Catch:{ JSONException -> 0x0329 }
            int r9 = r4.size()     // Catch:{ JSONException -> 0x0329 }
            java.util.List r4 = r4.subList(r15, r9)     // Catch:{ JSONException -> 0x0329 }
            android.widget.TextView r8 = r1.m225184e(r6, r8, r13)     // Catch:{ JSONException -> 0x0329 }
            r6.addView(r8)     // Catch:{ JSONException -> 0x0329 }
            android.widget.TextView r4 = r1.m225184e(r6, r4, r7)     // Catch:{ JSONException -> 0x0329 }
            r6.addView(r4)     // Catch:{ JSONException -> 0x0329 }
            goto L_0x0299
        L_0x0292:
            android.widget.TextView r4 = r1.m225184e(r6, r4, r13)     // Catch:{ JSONException -> 0x0329 }
            r6.addView(r4)     // Catch:{ JSONException -> 0x0329 }
        L_0x0299:
            if (r15 != 0) goto L_0x029d
            r15 = 0
            goto L_0x029e
        L_0x029d:
            r15 = 1
        L_0x029e:
            if (r5 == 0) goto L_0x02a3
            r6.addView(r5, r15)     // Catch:{ JSONException -> 0x0329 }
        L_0x02a3:
            java.lang.String r4 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as.m225175f(r12)     // Catch:{ JSONException -> 0x0329 }
            if (r4 == 0) goto L_0x02ae
            android.widget.LinearLayout r5 = r1.f377087j     // Catch:{ JSONException -> 0x0329 }
            r5.setContentDescription(r4)     // Catch:{ JSONException -> 0x0329 }
        L_0x02ae:
            int r11 = r11 + 1
            r10 = r21
            r9 = r17
            r7 = r18
            r4 = 0
            r5 = 0
            r6 = 1
            goto L_0x017c
        L_0x02bb:
            r18 = r7
            r17 = r9
            boolean r4 = r0.has(r2)     // Catch:{ JSONException -> 0x0329 }
            if (r4 == 0) goto L_0x02e6
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0329 }
            java.lang.String r2 = "i"
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0329 }
            java.lang.String r2 = "d"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ JSONException -> 0x0329 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0329 }
            if (r2 != 0) goto L_0x02e6
            boolean r2 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138631aj.m225137l(r0)     // Catch:{ JSONException -> 0x0329 }
            if (r2 == 0) goto L_0x02e6
            android.widget.ImageView r2 = r1.f377089l     // Catch:{ JSONException -> 0x0329 }
            r1.m225185f(r2, r0)     // Catch:{ JSONException -> 0x0329 }
        L_0x02e6:
            com.google.at.h.d.a.aq r0 = r3.f375543g     // Catch:{ JSONException -> 0x0329 }
            if (r0 != 0) goto L_0x02ec
            com.google.at.h.d.a.aq r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w     // Catch:{ JSONException -> 0x0329 }
        L_0x02ec:
            com.google.at.h.d.a.ae r0 = r0.f142334f     // Catch:{ JSONException -> 0x0329 }
            if (r0 != 0) goto L_0x02f2
            com.google.at.h.d.a.ae r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C     // Catch:{ JSONException -> 0x0329 }
        L_0x02f2:
            com.google.protobuf.cq r0 = r0.f142288B     // Catch:{ JSONException -> 0x0329 }
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x0329 }
            if (r2 != 0) goto L_0x0320
            android.view.View r2 = r1.f377090m     // Catch:{ JSONException -> 0x0329 }
            boolean r4 = r2 instanceof android.view.ViewStub     // Catch:{ JSONException -> 0x0329 }
            if (r4 == 0) goto L_0x0308
            android.view.ViewStub r2 = (android.view.ViewStub) r2     // Catch:{ JSONException -> 0x0329 }
            android.view.View r2 = r2.inflate()     // Catch:{ JSONException -> 0x0329 }
            r1.f377090m = r2     // Catch:{ JSONException -> 0x0329 }
        L_0x0308:
            android.view.View r2 = r1.f377090m     // Catch:{ JSONException -> 0x0329 }
            r4 = 2131432016(0x7f0b1250, float:1.8485778E38)
            android.view.View r2 = r2.findViewById(r4)     // Catch:{ JSONException -> 0x0329 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ JSONException -> 0x0329 }
            r1.f377091n = r2     // Catch:{ JSONException -> 0x0329 }
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.u r4 = r1.f377084g     // Catch:{ JSONException -> 0x0329 }
            r4.mo114458a(r2, r3, r0)     // Catch:{ JSONException -> 0x0329 }
            android.view.View r0 = r1.f377090m     // Catch:{ JSONException -> 0x0329 }
            r2 = 0
            r0.setVisibility(r2)     // Catch:{ JSONException -> 0x0329 }
        L_0x0320:
            r4 = r18
            r1.f377092o = r4     // Catch:{ JSONException -> 0x0329 }
            java.lang.String r0 = r3.f375539b     // Catch:{ JSONException -> 0x0329 }
            r1.f377093p = r0     // Catch:{ JSONException -> 0x0329 }
            return
        L_0x0329:
            r0 = move-exception
            goto L_0x032e
        L_0x032b:
            r0 = move-exception
            r17 = r9
        L_0x032e:
            com.google.common.f.a.d r2 = f377078c
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Malformed universal template %s"
            r4 = 41281(0xa141, float:5.7847E-41)
            r5 = r17
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r0)).mo56372aa(r4)).mo56389s(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138644aw.mo18114b(android.view.View, java.lang.Object):void");
    }
}
