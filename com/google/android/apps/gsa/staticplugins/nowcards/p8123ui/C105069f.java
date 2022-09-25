package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7810ku;
import com.google.p375ai.p378b.C7814ky;
import com.google.p375ai.p378b.C7817la;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C7821le;
import com.google.p375ai.p378b.C7822lf;
import com.google.p375ai.p378b.C8150xj;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.f */
/* compiled from: PG */
public final class C105069f {

    /* renamed from: a */
    public static final C59071e f292789a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.ui.f");

    /* renamed from: b */
    public final Context f292790b;

    /* renamed from: c */
    public final CardRenderingContext f292791c;

    /* renamed from: d */
    public final C89291a f292792d;

    /* renamed from: e */
    public final C105068e f292793e;

    /* renamed from: f */
    private final LayoutInflater f292794f;

    /* renamed from: g */
    private final Map f292795g;

    /* renamed from: h */
    private final C91189au f292796h;

    public C105069f(Context context, LayoutInflater layoutInflater, Map map, CardRenderingContext cardRenderingContext, C91189au auVar, C89291a aVar, C105068e eVar) {
        this.f292790b = context;
        this.f292794f = layoutInflater;
        this.f292795g = map;
        this.f292791c = cardRenderingContext;
        this.f292796h = auVar;
        this.f292792d = aVar;
        this.f292793e = eVar;
    }

    /* renamed from: e */
    public static void m174308e(C7818lb lbVar, TextView textView) {
        int a = C7814ky.m22857a(lbVar.f27422e);
        if (a == 0) {
            a = 1;
        }
        boolean z = a == 2;
        if (z || a == 3) {
            textView.setTextAlignment(true != z ? 4 : 6);
        } else {
            textView.setTextAlignment(5);
        }
    }

    /* renamed from: h */
    private static void m174309h(SpannableStringBuilder spannableStringBuilder, String str) {
        if (spannableStringBuilder.length() != 0) {
            spannableStringBuilder.append(" ");
        }
        spannableStringBuilder.append(str);
    }

    /* renamed from: a */
    public final int mo94510a(C7818lb lbVar) {
        C7810ku kuVar = C7810ku.STRING;
        C7817la laVar = C7817la.UNDEFINED;
        switch (mo94513d(lbVar).ordinal()) {
            case 0:
                ((C59052c) ((C59052c) f292789a.mo56226d()).mo56372aa(22087)).mo56386p("Asked for default layout instead of setting type");
                return R.layout.qp_module_textline;
            case 1:
                return R.layout.qp_module_title;
            case 2:
                return R.layout.metadataline_h3_dark;
            case 3:
                return R.layout.qp_metadata_card_attribution;
            case 4:
            case 5:
                return R.layout.qp_module_textline;
            case 6:
                return R.layout.qp_module_textline_with_image;
            case 7:
                return R.layout.qp_module_justification;
            case 8:
                return R.layout.metadataline_h7;
            case 9:
                return R.layout.qp_module_lotic_small_title;
            case 10:
                return R.layout.qp_module_lotic_small_title_centered_text;
            case 11:
            case 28:
                return R.layout.qp_module_screenie_textline;
            case 12:
                return R.layout.qp_module_lotic_extra_info;
            case 13:
            case 40:
                return R.layout.metadataline_h4;
            case 14:
            case 30:
            case 44:
                return R.layout.metadataline_h5;
            case 15:
            case 29:
            case 36:
            case 39:
                return R.layout.metadataline_h4_dark;
            case 16:
                return R.layout.qp_module_lotic_tutorial_textline;
            case 17:
                return R.layout.qp_module_lotic_small_list_item_title;
            case 18:
                return R.layout.lotic_cap_textline;
            case 19:
            case 38:
                return R.layout.metadataline_h2_dark;
            case 20:
                return R.layout.qp_module_lotic_small_carousel_title;
            case 27:
                return R.layout.qp_module_screenie_title;
            case 31:
            case 42:
                return R.layout.metadataline_h5_dark;
            case 32:
                return R.layout.qp_module_screenie_list_header_title;
            case 33:
                return R.layout.qp_tabular_header;
            case 34:
                return R.layout.qp_tabular_header_no_title;
            case 35:
                return R.layout.qp_tabular_data_cell;
            case 37:
                return R.layout.metadataline_h1_dark;
            case 41:
                return R.layout.metadataline_h4_light;
            case 43:
                return R.layout.metadataline_h5_medium;
            case 45:
                return R.layout.metadataline_h6_medium;
            case 46:
                return R.layout.metadataline_h6_light;
            case 47:
                return R.layout.hq_headline_l;
            case 48:
                return R.layout.hq_toolbar_title;
            case 49:
                return R.layout.hq_headline_m;
            case 50:
                CardRenderingContext cardRenderingContext = this.f292791c;
                return (cardRenderingContext == null || !cardRenderingContext.mo49317l()) ? R.layout.hq_headline_s : R.layout.hq_headline_s_v1p5;
            case 51:
                CardRenderingContext cardRenderingContext2 = this.f292791c;
                return (cardRenderingContext2 == null || !cardRenderingContext2.mo49317l()) ? R.layout.hq_body : R.layout.hq_body_v1p5;
            case 52:
                return R.layout.hq_body_2;
            case 53:
                return R.layout.hq_card_title;
            case 54:
                return R.layout.hq_partner_name;
            case 55:
                return R.layout.hq_subtitle;
            case 56:
                return R.layout.hq_footer;
            case 57:
                CardRenderingContext cardRenderingContext3 = this.f292791c;
                return (cardRenderingContext3 == null || !cardRenderingContext3.mo49317l()) ? R.layout.hq_header : R.layout.hq_header_v1p5;
            case 58:
                CardRenderingContext cardRenderingContext4 = this.f292791c;
                if (cardRenderingContext4 == null || !cardRenderingContext4.mo49317l()) {
                    return R.layout.lotic_cap_textline;
                }
                return R.layout.hq_cap_textline;
            case 59:
                return R.layout.feed_34_40_l;
            case 60:
                return R.layout.feed_20_24_r;
            case 61:
                return R.layout.feed_18_24_r;
            case 62:
                return R.layout.feed_16_20_m;
            case 63:
                return R.layout.feed_16_20_r;
            case 64:
                return R.layout.feed_14_20_m;
            case 65:
                return R.layout.feed_14_20_r;
            case 66:
                return R.layout.feed_12_16_r;
            case 67:
                return R.layout.feed_12_16_m;
            case 68:
                return R.layout.feed_11_12_m;
            case 69:
                return R.layout.google_sans_r_10sp_12ls;
            case 70:
                return R.layout.google_sans_m_10sp_12ls;
            case 71:
                return R.layout.google_sans_r_14sp_20ls;
            case 72:
                return R.layout.google_sans_r_14sp_18ls;
            case 74:
                return R.layout.google_sans_m_14sp_20ls;
            case 75:
                return R.layout.google_sans_m_16sp_20ls;
            case 76:
                return R.layout.google_sans_r_16sp_20ls;
            case 77:
                return R.layout.google_sans_r_16sp_22ls;
            case 78:
                return R.layout.google_sans_r_16sp_24ls;
            case 79:
                return R.layout.google_sans_r_18sp_24ls;
            case 80:
                return R.layout.google_sans_r_20sp_25ls;
            case 81:
                return R.layout.google_sans_m_22sp_30ls;
            case 82:
                return R.layout.google_sans_r_36sp_36ls;
            case 83:
                return R.layout.roboto_m_10sp_12ls;
            case 84:
                return R.layout.roboto_r_10sp_12ls;
            case 85:
                return R.layout.roboto_m_11sp_16ls;
            case 86:
                return R.layout.roboto_m_11sp_16ls_8;
            case 87:
                return R.layout.roboto_r_12sp_16ls;
            case 88:
                return R.layout.roboto_r_14sp_20ls;
            case 89:
                return R.layout.roboto_m_14sp_20ls;
            case 90:
                return R.layout.roboto_m_16sp_20ls;
            case 91:
                return R.layout.roboto_r_16sp_20ls;
            case 92:
                return R.layout.roboto_m_24sp_32ls;
            default:
                return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v93, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0244, code lost:
        if (r2 == 0) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0266, code lost:
        if (r2 == 0) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x05bd, code lost:
        if (r9 != false) goto L_0x05bf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x055e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder mo94511b(com.google.p375ai.p378b.C7818lb r33, android.widget.TextView r34, boolean r35) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            r9 = r34
            int r2 = r0.f27418a
            r10 = 8
            r2 = r2 & r10
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r0.f27423f
            goto L_0x0012
        L_0x0010:
            java.lang.String r2 = " · "
        L_0x0012:
            r11 = r2
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            com.google.protobuf.cq r2 = r0.f27419b
            java.util.Iterator r13 = r2.iterator()
            r2 = 0
        L_0x001f:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x06c1
            java.lang.Object r3 = r13.next()
            r15 = r3
            com.google.ai.b.kv r15 = (com.google.p375ai.p378b.C7811kv) r15
            com.google.android.apps.gsa.staticplugins.nowcards.ui.e r3 = r1.f292793e
            java.lang.Object r3 = r3.mo3690d(r15)
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
            if (r3 == 0) goto L_0x0040
            r12.append(r3)
        L_0x0039:
            r8 = r11
            r4 = r12
            r29 = r13
            r13 = 0
            goto L_0x06b7
        L_0x0040:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            if (r35 == 0) goto L_0x0065
            int r3 = r15.f27307a
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0065
            com.google.android.apps.gsa.shared.au.b.a r3 = r1.f292792d
            android.content.Context r4 = r1.f292790b
            com.google.ai.b.xj r5 = r15.f27311e
            if (r5 != 0) goto L_0x0057
            com.google.ai.b.xj r5 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0057:
            java.lang.String r3 = r3.mo83231a(r4, r5)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0065
            m174309h(r8, r3)
            goto L_0x0039
        L_0x0065:
            int r3 = r12.length()
            if (r3 > 0) goto L_0x006f
            boolean r3 = r0.f27424g
            if (r3 == 0) goto L_0x0083
        L_0x006f:
            if (r2 != 0) goto L_0x007e
            com.google.ai.b.ku r3 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f.m174269b(r15)
            com.google.ai.b.ku r4 = com.google.p375ai.p378b.C7810ku.STATUS_BADGE
            if (r3 != r4) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            r8.append(r11)
            goto L_0x0083
        L_0x007e:
            java.lang.String r3 = "  "
            r8.append(r3)
        L_0x0083:
            com.google.ai.b.ku r3 = com.google.p375ai.p378b.C7810ku.STRING
            com.google.ai.b.la r3 = com.google.p375ai.p378b.C7817la.UNDEFINED
            com.google.ai.b.ku r3 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f.m174269b(r15)
            int r3 = r3.ordinal()
            r5 = 4
            r6 = 32
            r7 = 2
            r10 = 1
            if (r3 == 0) goto L_0x0571
            r2 = 3
            r4 = 160(0xa0, float:2.24E-43)
            r19 = -1
            if (r3 == r10) goto L_0x03cf
            if (r3 == r7) goto L_0x0373
            if (r3 == r2) goto L_0x0146
            if (r3 == r5) goto L_0x00c0
            com.google.common.f.e r2 = f292789a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Unsupported Metadata chunk type: %s"
            com.google.ai.b.ku r4 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f.m174269b(r15)
            r5 = 22088(0x5648, float:3.0952E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r3, r4)
            r3 = r8
            r8 = r11
            r28 = r12
            r29 = r13
        L_0x00ba:
            r10 = r15
        L_0x00bb:
            r2 = 1
        L_0x00bc:
            r6 = 1
            r13 = 0
            goto L_0x0694
        L_0x00c0:
            int r2 = r15.f27308b
            if (r2 != r5) goto L_0x00c9
            java.lang.Object r2 = r15.f27309c
            com.google.ai.b.kr r2 = (com.google.p375ai.p378b.C7807kr) r2
            goto L_0x00cb
        L_0x00c9:
            com.google.ai.b.kr r2 = com.google.p375ai.p378b.C7807kr.f27293c
        L_0x00cb:
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r3 = r1.f292791c
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r4 = r3.f118456b
            monitor-enter(r4)
            r3.mo49308d()     // Catch:{ all -> 0x00e8 }
            android.location.Location r3 = r3.f118458d     // Catch:{ all -> 0x00e8 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e8 }
            if (r3 == 0) goto L_0x00e0
            com.google.ai.b.kp r3 = com.google.android.apps.gsa.sidekick.shared.util.C91966aq.m150922b(r3)
            r7 = r3
            goto L_0x00e1
        L_0x00e0:
            r7 = 0
        L_0x00e1:
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r3 = r1.f292791c
            com.google.android.sidekick.shared.renderingcontext.NavigationContext r3 = com.google.android.sidekick.shared.renderingcontext.NavigationContext.m80830a(r3)
            goto L_0x00ed
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e8 }
            throw r0
        L_0x00eb:
            r3 = 0
            r7 = 0
        L_0x00ed:
            int r4 = r2.f27295a
            r4 = r4 & r10
            if (r4 == 0) goto L_0x013e
            if (r7 == 0) goto L_0x013e
            if (r3 == 0) goto L_0x013e
            com.google.ai.b.kp r2 = r2.f27296b
            if (r2 != 0) goto L_0x00fc
            com.google.ai.b.kp r2 = com.google.p375ai.p378b.C7805kp.f27284h
        L_0x00fc:
            float[] r4 = new float[r10]
            double r5 = r7.f27287b
            r26 = r11
            double r10 = r7.f27288c
            r27 = r15
            double r14 = r2.f27287b
            r28 = r12
            r29 = r13
            double r12 = r2.f27288c
            r17 = r5
            r19 = r10
            r21 = r14
            r23 = r12
            r25 = r4
            android.location.Location.distanceBetween(r17, r19, r21, r23, r25)
            r2 = 0
            r4 = r4[r2]
            int r4 = (int) r4
            int r3 = r3.f118467c
            if (r35 == 0) goto L_0x012e
            android.content.Context r5 = r1.f292790b
            r6 = 1
            java.lang.String r3 = com.google.android.apps.gsa.sidekick.shared.util.C91966aq.m150923c(r5, r4, r3, r6)
            m174309h(r8, r3)
            goto L_0x0137
        L_0x012e:
            android.content.Context r5 = r1.f292790b
            java.lang.String r3 = com.google.android.apps.gsa.sidekick.shared.util.C91966aq.m150923c(r5, r4, r3, r2)
            r8.append(r3)
        L_0x0137:
            r3 = r8
            r8 = r26
            r10 = r27
            goto L_0x00bb
        L_0x013e:
            r28 = r12
            r29 = r13
            r3 = r8
            r8 = r11
            goto L_0x00ba
        L_0x0146:
            r26 = r11
            r28 = r12
            r29 = r13
            r10 = r15
            int r2 = r10.f27308b
            r3 = 7
            if (r2 != r3) goto L_0x036d
            if (r35 == 0) goto L_0x0156
            goto L_0x036d
        L_0x0156:
            java.lang.Object r2 = r10.f27309c
            com.google.ai.b.lv r2 = (com.google.p375ai.p378b.C7838lv) r2
            int r4 = r2.f27477b
            r5 = 1
            if (r4 != r5) goto L_0x0173
            java.lang.Object r2 = r2.f27478c
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.p375ai.p378b.C7539b.m22781a(r2)
            if (r2 != 0) goto L_0x016e
            r2 = 1
        L_0x016e:
            int r2 = com.google.android.apps.gsa.sidekick.shared.util.C91992k.m150980h(r2)
            goto L_0x0174
        L_0x0173:
            r2 = 0
        L_0x0174:
            int r4 = r10.f27308b
            if (r4 != r3) goto L_0x017d
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.lv r5 = (com.google.p375ai.p378b.C7838lv) r5
            goto L_0x017f
        L_0x017d:
            com.google.ai.b.lv r5 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x017f:
            int r6 = r5.f27477b
            if (r6 != r7) goto L_0x018a
            java.lang.Object r5 = r5.f27478c
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            r11 = r7
            goto L_0x018b
        L_0x018a:
            r11 = 0
        L_0x018b:
            if (r4 != r3) goto L_0x0192
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.lv r5 = (com.google.p375ai.p378b.C7838lv) r5
            goto L_0x0194
        L_0x0192:
            com.google.ai.b.lv r5 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0194:
            int r5 = r5.f27476a
            r5 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x01ae
            if (r4 != r3) goto L_0x01a1
            java.lang.Object r4 = r10.f27309c
            com.google.ai.b.lv r4 = (com.google.p375ai.p378b.C7838lv) r4
            goto L_0x01a3
        L_0x01a1:
            com.google.ai.b.lv r4 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x01a3:
            int r4 = r4.f27489n
            int r4 = com.google.p375ai.p378b.C7787jy.m22849a(r4)
            if (r4 != 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r12 = r4
            goto L_0x01af
        L_0x01ae:
            r12 = 1
        L_0x01af:
            if (r2 == 0) goto L_0x02ae
            android.content.Context r4 = r1.f292790b
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r2)
            int r2 = r10.f27308b
            if (r2 != r3) goto L_0x01c4
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.lv r5 = (com.google.p375ai.p378b.C7838lv) r5
            goto L_0x01c6
        L_0x01c4:
            com.google.ai.b.lv r5 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x01c6:
            boolean r5 = r5.f27488m
            if (r5 == 0) goto L_0x01cd
            r6 = 0
            goto L_0x0285
        L_0x01cd:
            com.google.android.apps.gsa.staticplugins.nowcards.ui.e r5 = r1.f292793e
            boolean r5 = r5.f292787c
            if (r5 == 0) goto L_0x020b
            if (r2 != r3) goto L_0x01da
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.lv r5 = (com.google.p375ai.p378b.C7838lv) r5
            goto L_0x01dc
        L_0x01da:
            com.google.ai.b.lv r5 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x01dc:
            int r5 = r5.f27476a
            r5 = r5 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x01fc
            if (r2 != r3) goto L_0x01e9
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.lv r5 = (com.google.p375ai.p378b.C7838lv) r5
            goto L_0x01eb
        L_0x01e9:
            com.google.ai.b.lv r5 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x01eb:
            int r5 = r5.f27486k
            if (r5 == 0) goto L_0x01fc
            if (r2 != r3) goto L_0x01f6
            java.lang.Object r2 = r10.f27309c
            com.google.ai.b.lv r2 = (com.google.p375ai.p378b.C7838lv) r2
            goto L_0x01f8
        L_0x01f6:
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x01f8:
            int r2 = r2.f27486k
            goto L_0x0275
        L_0x01fc:
            android.content.Context r2 = r1.f292790b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131100395(0x7f0602eb, float:1.781317E38)
            int r2 = r2.getColor(r3)
            goto L_0x0275
        L_0x020b:
            if (r2 != r3) goto L_0x0212
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.lv r5 = (com.google.p375ai.p378b.C7838lv) r5
            goto L_0x0214
        L_0x0212:
            com.google.ai.b.lv r5 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0214:
            int r5 = r5.f27476a
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0226
            if (r2 != r3) goto L_0x0221
            java.lang.Object r2 = r10.f27309c
            com.google.ai.b.lv r2 = (com.google.p375ai.p378b.C7838lv) r2
            goto L_0x0223
        L_0x0221:
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0223:
            int r2 = r2.f27483h
            goto L_0x0275
        L_0x0226:
            if (r2 != r3) goto L_0x022d
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.lv r5 = (com.google.p375ai.p378b.C7838lv) r5
            goto L_0x022f
        L_0x022d:
            com.google.ai.b.lv r5 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x022f:
            int r5 = r5.f27476a
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0248
            if (r2 != r3) goto L_0x023c
            java.lang.Object r2 = r10.f27309c
            com.google.ai.b.lv r2 = (com.google.p375ai.p378b.C7838lv) r2
            goto L_0x023e
        L_0x023c:
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x023e:
            int r2 = r2.f27484i
            int r2 = com.google.p375ai.p378b.C7840lx.m22875a(r2)
            if (r2 != 0) goto L_0x026a
        L_0x0246:
            r2 = 1
            goto L_0x026a
        L_0x0248:
            if (r2 != r3) goto L_0x024f
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.lv r5 = (com.google.p375ai.p378b.C7838lv) r5
            goto L_0x0251
        L_0x024f:
            com.google.ai.b.lv r5 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0251:
            int r5 = r5.f27476a
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0269
            if (r2 != r3) goto L_0x025e
            java.lang.Object r2 = r10.f27309c
            com.google.ai.b.lv r2 = (com.google.p375ai.p378b.C7838lv) r2
            goto L_0x0260
        L_0x025e:
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0260:
            int r2 = r2.f27482g
            int r2 = com.google.p375ai.p378b.C7840lx.m22875a(r2)
            if (r2 != 0) goto L_0x026a
            goto L_0x0246
        L_0x0269:
            r2 = 0
        L_0x026a:
            if (r2 == 0) goto L_0x0274
            android.content.Context r3 = r1.f292790b
            int r2 = com.google.android.apps.gsa.sidekick.shared.util.C91992k.m150981i(r3, r2)
            if (r2 != 0) goto L_0x0275
        L_0x0274:
            r2 = 0
        L_0x0275:
            if (r2 != 0) goto L_0x0284
            android.content.Context r2 = r1.f292790b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131103442(0x7f060ed2, float:1.781935E38)
            int r2 = r2.getColor(r3)
        L_0x0284:
            r6 = r2
        L_0x0285:
            android.content.Context r2 = r1.f292790b
            r7 = 0
            r11 = 0
            r3 = r4
            r13 = 17
            r4 = r34
            r5 = r12
            r14 = r8
            r8 = r11
            android.graphics.drawable.LayerDrawable r2 = com.google.android.apps.gsa.sidekick.shared.p7256ui.C91948x.m150882c(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.apps.gsa.sidekick.shared.ui.l r3 = new com.google.android.apps.gsa.sidekick.shared.ui.l
            r3.<init>(r2, r9)
            java.lang.String r2 = " "
            r14.append(r2)
            int r2 = r14.length()
            int r2 = r2 + -1
            int r4 = r14.length()
            r14.setSpan(r3, r2, r4, r13)
            goto L_0x036b
        L_0x02ae:
            r14 = r8
            r13 = 17
            if (r11 == 0) goto L_0x035c
            android.content.Context r15 = r1.f292790b
            com.google.android.apps.gsa.shared.y.au r8 = r1.f292796h
            com.google.protobuf.cq r2 = r0.f27419b
            int r7 = r2.size()
            com.google.android.apps.gsa.staticplugins.nowcards.ui.e r2 = r1.f292793e
            boolean r2 = r2.f292787c
            if (r2 == 0) goto L_0x02ee
            int r2 = r10.f27308b
            if (r2 != r3) goto L_0x02cc
            java.lang.Object r4 = r10.f27309c
            com.google.ai.b.lv r4 = (com.google.p375ai.p378b.C7838lv) r4
            goto L_0x02ce
        L_0x02cc:
            com.google.ai.b.lv r4 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x02ce:
            int r4 = r4.f27476a
            r4 = r4 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x02ee
            if (r2 != r3) goto L_0x02db
            java.lang.Object r4 = r10.f27309c
            com.google.ai.b.lv r4 = (com.google.p375ai.p378b.C7838lv) r4
            goto L_0x02dd
        L_0x02db:
            com.google.ai.b.lv r4 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x02dd:
            int r4 = r4.f27487l
            if (r4 == 0) goto L_0x02ee
            if (r2 != r3) goto L_0x02e8
            java.lang.Object r2 = r10.f27309c
            com.google.ai.b.lv r2 = (com.google.p375ai.p378b.C7838lv) r2
            goto L_0x02ea
        L_0x02e8:
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x02ea:
            int r2 = r2.f27487l
            r6 = r2
            goto L_0x02ef
        L_0x02ee:
            r6 = 0
        L_0x02ef:
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r3.<init>(r2)
            r2 = 8
            if (r12 == r2) goto L_0x02fc
            r16 = 1
            goto L_0x02fe
        L_0x02fc:
            r16 = 0
        L_0x02fe:
            r17 = 0
            r2 = r15
            r4 = r34
            r5 = r12
            r18 = r6
            r6 = r17
            r30 = r7
            r7 = r16
            r31 = r8
            r8 = r18
            android.graphics.drawable.LayerDrawable r2 = com.google.android.apps.gsa.sidekick.shared.p7256ui.C91948x.m150882c(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.apps.gsa.sidekick.shared.ui.x r3 = new com.google.android.apps.gsa.sidekick.shared.ui.x
            r3.<init>(r9, r2, r11)
            java.lang.String r2 = " "
            r14.append(r2)
            int r2 = r14.length()
            int r2 = r2 + -1
            int r4 = r14.length()
            r14.setSpan(r3, r2, r4, r13)
            r2 = r30
            r4 = 1
            if (r2 != r4) goto L_0x0335
            java.lang.String r2 = " "
            r14.append(r2)
        L_0x0335:
            r8 = 8
            if (r12 != r8) goto L_0x033b
            r2 = 0
            goto L_0x033c
        L_0x033b:
            r2 = 1
        L_0x033c:
            if (r12 != r8) goto L_0x0343
            java.lang.String r4 = " "
            r14.append(r4)
        L_0x0343:
            android.net.Uri r4 = android.net.Uri.parse(r11)
            r5 = r31
            com.google.common.util.concurrent.cx r4 = r5.mo85417d(r4)
            com.google.android.apps.gsa.sidekick.shared.ui.w r6 = new com.google.android.apps.gsa.sidekick.shared.ui.w
            r7 = 1
            r2 = r2 ^ r7
            r7 = r18
            r6.<init>(r3, r15, r7, r2)
            java.lang.String r2 = "WebIconImageSpan.ImageCallback"
            r5.mo85428r(r4, r2, r6)
            goto L_0x036b
        L_0x035c:
            r8 = 8
            com.google.common.f.e r2 = f292789a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "ICON chunk was found without an icon definition"
            r4 = 22089(0x5649, float:3.0953E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x036b:
            r3 = r14
            goto L_0x036e
        L_0x036d:
            r3 = r8
        L_0x036e:
            r8 = r26
            r2 = 0
            goto L_0x00bc
        L_0x0373:
            r14 = r8
            r26 = r11
            r28 = r12
            r29 = r13
            r10 = r15
            r8 = 8
            int r2 = r10.f27308b
            if (r2 != r7) goto L_0x03ca
            java.lang.Object r2 = r10.f27309c
            com.google.ai.b.lj r2 = (com.google.p375ai.p378b.C7826lj) r2
            int r3 = r2.f27450a
            r5 = 1
            r3 = r3 & r5
            if (r3 == 0) goto L_0x03ca
            com.google.ai.b.xj r3 = r2.f27451b
            if (r3 != 0) goto L_0x0391
            com.google.ai.b.xj r3 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0391:
            com.google.android.apps.gsa.shared.au.b.a r5 = r1.f292792d
            android.content.Context r7 = r1.f292790b
            java.lang.String r3 = r5.mo83231a(r7, r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x03ca
            java.lang.String r3 = r3.replace(r6, r4)
            android.content.Context r4 = r1.f292790b
            boolean r5 = r2.f27453d
            boolean r6 = r2.f27454e
            if (r5 == 0) goto L_0x03b9
            android.content.res.Resources r6 = r4.getResources()
            r7 = 2131103443(0x7f060ed3, float:1.7819352E38)
            int r6 = r6.getColor(r7)
            int r2 = r2.f27452c
            goto L_0x03c3
        L_0x03b9:
            if (r6 == 0) goto L_0x03c0
            int r6 = r2.f27452c
            r2 = -1
            r5 = 1
            goto L_0x03c3
        L_0x03c0:
            int r6 = r2.f27452c
            r2 = 0
        L_0x03c3:
            java.lang.CharSequence r2 = com.google.android.apps.gsa.sidekick.shared.p7256ui.C91942r.m150865a(r3, r4, r5, r6, r2)
            r14.append(r2)
        L_0x03ca:
            r3 = r14
            r8 = r26
            goto L_0x00bb
        L_0x03cf:
            r14 = r8
            r26 = r11
            r28 = r12
            r29 = r13
            r10 = r15
            r8 = 8
            r13 = 17
            int r3 = r10.f27308b
            r5 = 9
            if (r3 != r5) goto L_0x03ec
            java.lang.Object r3 = r10.f27309c
            com.google.ai.b.pm r3 = (com.google.p375ai.p378b.C7937pm) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.ai.b.ph r3 = (com.google.p375ai.p378b.C7932ph) r3
            goto L_0x0413
        L_0x03ec:
            if (r3 != r2) goto L_0x0412
            java.lang.Object r3 = r10.f27309c
            com.google.ai.b.lh r3 = (com.google.p375ai.p378b.C7824lh) r3
            com.google.ai.b.pm r5 = com.google.p375ai.p378b.C7937pm.f27871g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.ai.b.ph r5 = (com.google.p375ai.p378b.C7932ph) r5
            int r11 = r3.f27446a
            r12 = 1
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0410
            int r3 = r3.f27447b
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.ai.b.pm r11 = (com.google.p375ai.p378b.C7937pm) r11
            int r12 = r11.f27873a
            r12 = r12 | r6
            r11.f27873a = r12
            r11.f27877e = r3
        L_0x0410:
            r3 = r5
            goto L_0x0413
        L_0x0412:
            r3 = 0
        L_0x0413:
            if (r3 == 0) goto L_0x0569
            android.content.Context r5 = r1.f292790b
            com.google.protobuf.bv r3 = r3.build()
            com.google.ai.b.pm r3 = (com.google.p375ai.p378b.C7937pm) r3
            int r11 = r3.f27874b
            int r11 = com.google.p375ai.p378b.C7936pl.m22893a(r11)
            if (r11 != 0) goto L_0x0426
            r11 = 1
        L_0x0426:
            int r12 = r3.f27873a
            r12 = r12 & r6
            if (r12 == 0) goto L_0x047a
            int r12 = r3.f27877e
            java.lang.Double r15 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105045c.f292751b
            double r8 = r15.doubleValue()
            java.lang.Double r15 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105045c.f292752c
            r18 = r14
            double r13 = r15.doubleValue()
            r20 = r3
            double r2 = (double) r12
            r21 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r2)
            double r2 = r2 / r21
            double r2 = java.lang.Math.min(r13, r2)
            double r2 = java.lang.Math.max(r8, r2)
            int r8 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105045c.m174267a(r2)
            if (r11 == r7) goto L_0x045e
            if (r35 == 0) goto L_0x045a
            r9 = 1
            goto L_0x0460
        L_0x045a:
            r2 = r8
            r8 = r20
            goto L_0x047e
        L_0x045e:
            r9 = r35
        L_0x0460:
            java.text.DecimalFormat r11 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105045c.f292750a
            java.lang.String r2 = r11.format(r2)
            if (r9 == 0) goto L_0x0475
            r3 = 1
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r3 = 0
            r9[r3] = r2
            r2 = 2132091799(0x7f152397, float:1.9823976E38)
            java.lang.String r2 = r5.getString(r2, r9)
        L_0x0475:
            r3 = r2
            r2 = r8
            r8 = r20
            goto L_0x047f
        L_0x047a:
            r18 = r14
            r8 = r3
            r2 = 0
        L_0x047e:
            r3 = 0
        L_0x047f:
            int r9 = r8.f27874b
            int r9 = com.google.p375ai.p378b.C7936pl.m22893a(r9)
            if (r9 != 0) goto L_0x0488
            goto L_0x04b5
        L_0x0488:
            r11 = 1
            if (r9 == r11) goto L_0x04b5
            r12 = 3
            if (r9 == r12) goto L_0x04ad
            int r9 = r8.f27873a
            r9 = r9 & 64
            if (r9 == 0) goto L_0x04ab
            android.content.res.Resources r9 = r5.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r11]
            int r11 = r8.f27878f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 0
            r12[r13] = r11
            r11 = 2132090226(0x7f151d72, float:1.9820786E38)
            java.lang.String r9 = r9.getString(r11, r12)
            goto L_0x04b7
        L_0x04ab:
            r9 = 0
            goto L_0x04b7
        L_0x04ad:
            r9 = 2132091803(0x7f15239b, float:1.9823985E38)
            java.lang.String r9 = r5.getString(r9)
            goto L_0x04b7
        L_0x04b5:
            java.lang.String r9 = ""
        L_0x04b7:
            java.lang.CharSequence[] r11 = new java.lang.CharSequence[r7]
            java.lang.String r12 = r8.f27875c
            r13 = 0
            r11[r13] = r12
            r12 = 1
            r11[r12] = r9
            java.lang.String r12 = " · "
            java.util.List r11 = java.util.Arrays.asList(r11)
            java.lang.CharSequence r11 = com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150956c(r12, r11)
            java.lang.String r11 = r11.toString()
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x04f0
            int r8 = r8.f27876d
            int r8 = com.google.p375ai.p378b.C7934pj.m22892a(r8)
            if (r8 != 0) goto L_0x04de
            r8 = 1
        L_0x04de:
            int r8 = r8 + -1
            r9 = 1
            if (r8 == r9) goto L_0x04eb
            if (r8 == r7) goto L_0x04e7
            r7 = 0
            goto L_0x04ee
        L_0x04e7:
            r7 = 2131232781(0x7f08080d, float:1.808168E38)
            goto L_0x04ee
        L_0x04eb:
            r7 = 2131232780(0x7f08080c, float:1.8081679E38)
        L_0x04ee:
            r9 = r11
            goto L_0x04f1
        L_0x04f0:
            r7 = 0
        L_0x04f1:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            boolean r11 = android.text.TextUtils.isEmpty(r3)
            if (r11 != 0) goto L_0x050e
            android.content.res.Resources r11 = r5.getResources()
            r12 = 2131103435(0x7f060ecb, float:1.7819336E38)
            int r11 = r11.getColor(r12)
            java.lang.CharSequence r3 = com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150955b(r3, r11)
            r8.append(r3)
        L_0x050e:
            if (r2 == 0) goto L_0x052b
            com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105047e.m174268a(r8)
            com.google.android.apps.gsa.staticplugins.nowcards.i.d r3 = new com.google.android.apps.gsa.staticplugins.nowcards.i.d
            r3.<init>(r5, r2)
            r8.append(r4)
            int r2 = r8.length()
            int r2 = r2 + -1
            int r11 = r8.length()
            r12 = 17
            r8.setSpan(r3, r2, r11, r12)
            goto L_0x052d
        L_0x052b:
            r12 = 17
        L_0x052d:
            if (r7 == 0) goto L_0x0547
            com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105047e.m174268a(r8)
            com.google.android.apps.gsa.staticplugins.nowcards.i.d r2 = new com.google.android.apps.gsa.staticplugins.nowcards.i.d
            r2.<init>(r5, r7)
            r8.append(r4)
            int r3 = r8.length()
            int r3 = r3 + -1
            int r5 = r8.length()
            r8.setSpan(r2, r3, r5, r12)
        L_0x0547:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L_0x0557
            com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105047e.m174268a(r8)
            java.lang.String r2 = r9.replace(r6, r4)
            r8.append(r2)
        L_0x0557:
            int r2 = r8.length()
            r3 = 1
            if (r2 != r3) goto L_0x0563
            java.lang.String r2 = " "
            r8.append(r2)
        L_0x0563:
            r3 = r18
            r3.append(r8)
            goto L_0x056b
        L_0x0569:
            r3 = r14
            r13 = 0
        L_0x056b:
            r8 = r26
            r2 = 1
            r6 = 1
            goto L_0x0694
        L_0x0571:
            r3 = r8
            r26 = r11
            r28 = r12
            r29 = r13
            r10 = r15
            r13 = 0
            int r4 = r10.f27312f
            com.google.android.apps.gsa.shared.au.b.a r8 = r1.f292792d
            android.content.Context r9 = r1.f292790b
            int r11 = r10.f27308b
            r12 = 1
            if (r11 != r12) goto L_0x058a
            java.lang.Object r11 = r10.f27309c
            com.google.ai.b.ll r11 = (com.google.p375ai.p378b.C7828ll) r11
            goto L_0x058c
        L_0x058a:
            com.google.ai.b.ll r11 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x058c:
            com.google.ai.b.xj r11 = r11.f27458b
            if (r11 != 0) goto L_0x0592
            com.google.ai.b.xj r11 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0592:
            java.lang.String r8 = r8.mo83231a(r9, r11)
            if (r8 == 0) goto L_0x06b3
            r9 = r4 & 4
            if (r9 == 0) goto L_0x05af
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "<strike>"
            r9.<init>(r11)
            r9.append(r8)
            java.lang.String r8 = "</strike>"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        L_0x05af:
            java.lang.String r9 = "<"
            boolean r9 = r8.contains(r9)
            if (r9 != 0) goto L_0x05bf
            java.lang.String r9 = "&"
            boolean r9 = r8.contains(r9)
            if (r9 == 0) goto L_0x05c9
        L_0x05bf:
            com.google.android.apps.gsa.sidekick.shared.ui.o r9 = new com.google.android.apps.gsa.sidekick.shared.ui.o
            r9.<init>()
            r11 = 0
            android.text.Spanned r8 = android.text.Html.fromHtml(r8, r11, r9)
        L_0x05c9:
            int r9 = r3.length()
            com.google.android.apps.gsa.staticplugins.nowcards.ui.e r11 = r1.f292793e
            boolean r11 = r11.f292787c
            if (r11 == 0) goto L_0x0619
            int r11 = r10.f27308b
            r12 = 1
            if (r11 != r12) goto L_0x05dd
            java.lang.Object r14 = r10.f27309c
            com.google.ai.b.ll r14 = (com.google.p375ai.p378b.C7828ll) r14
            goto L_0x05df
        L_0x05dd:
            com.google.ai.b.ll r14 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x05df:
            int r14 = r14.f27457a
            r5 = r5 & r14
            if (r5 == 0) goto L_0x0604
            if (r11 != r12) goto L_0x05eb
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.ll r5 = (com.google.p375ai.p378b.C7828ll) r5
            goto L_0x05ed
        L_0x05eb:
            com.google.ai.b.ll r5 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x05ed:
            int r5 = r5.f27460d
            if (r5 == 0) goto L_0x0604
            if (r11 != r12) goto L_0x05f8
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.ll r5 = (com.google.p375ai.p378b.C7828ll) r5
            goto L_0x05fa
        L_0x05f8:
            com.google.ai.b.ll r5 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x05fa:
            int r5 = r5.f27460d
            java.lang.CharSequence r5 = com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150955b(r8, r5)
            r3.append(r5)
            goto L_0x0640
        L_0x0604:
            android.content.Context r5 = r1.f292790b
            android.content.res.Resources r5 = r5.getResources()
            r11 = 2131100395(0x7f0602eb, float:1.781317E38)
            int r5 = r5.getColor(r11)
            java.lang.CharSequence r5 = com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150955b(r8, r5)
            r3.append(r5)
            goto L_0x0640
        L_0x0619:
            int r5 = r10.f27308b
            r11 = 1
            if (r5 != r11) goto L_0x0623
            java.lang.Object r12 = r10.f27309c
            com.google.ai.b.ll r12 = (com.google.p375ai.p378b.C7828ll) r12
            goto L_0x0625
        L_0x0623:
            com.google.ai.b.ll r12 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0625:
            int r12 = r12.f27457a
            r12 = r12 & r7
            if (r12 == 0) goto L_0x063d
            if (r5 != r11) goto L_0x0631
            java.lang.Object r5 = r10.f27309c
            com.google.ai.b.ll r5 = (com.google.p375ai.p378b.C7828ll) r5
            goto L_0x0633
        L_0x0631:
            com.google.ai.b.ll r5 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0633:
            int r5 = r5.f27459c
            java.lang.CharSequence r5 = com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150955b(r8, r5)
            r3.append(r5)
            goto L_0x0640
        L_0x063d:
            r3.append(r8)
        L_0x0640:
            com.google.protobuf.cq r5 = r0.f27419b
            int r5 = r5.size()
            r8 = 1
            if (r5 <= r8) goto L_0x066c
            java.lang.String r5 = " · "
            r8 = r26
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x066e
            if (r2 != 0) goto L_0x066e
            r2 = r9
        L_0x0656:
            int r5 = r3.length()
            if (r2 >= r5) goto L_0x066e
            char r5 = r3.charAt(r2)
            if (r5 != r6) goto L_0x0669
            int r5 = r2 + 1
            java.lang.String r11 = " "
            r3.replace(r2, r5, r11)
        L_0x0669:
            int r2 = r2 + 1
            goto L_0x0656
        L_0x066c:
            r8 = r26
        L_0x066e:
            r2 = r4 & 1
            r5 = 33
            if (r2 == 0) goto L_0x0682
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r6 = 1
            r2.<init>(r6)
            int r11 = r3.length()
            r3.setSpan(r2, r9, r11, r5)
            goto L_0x0683
        L_0x0682:
            r6 = 1
        L_0x0683:
            r2 = r4 & 2
            if (r2 == 0) goto L_0x0693
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r7)
            int r4 = r3.length()
            r3.setSpan(r2, r9, r4, r5)
        L_0x0693:
            r2 = 1
        L_0x0694:
            com.google.ai.b.ku r4 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f.m174269b(r10)
            com.google.ai.b.ku r5 = com.google.p375ai.p378b.C7810ku.STATUS_BADGE
            if (r4 == r5) goto L_0x06a2
            com.google.ai.b.ku r5 = com.google.p375ai.p378b.C7810ku.ICON
            if (r4 != r5) goto L_0x06a1
            goto L_0x06a2
        L_0x06a1:
            r6 = 0
        L_0x06a2:
            if (r2 == 0) goto L_0x06a9
            com.google.android.apps.gsa.staticplugins.nowcards.ui.e r2 = r1.f292793e
            r2.mo3691e(r10, r3)
        L_0x06a9:
            r4 = r28
            r4.append(r3)
            r9 = r34
            r12 = r4
            r2 = r6
            goto L_0x06ba
        L_0x06b3:
            r8 = r26
            r4 = r28
        L_0x06b7:
            r9 = r34
            r12 = r4
        L_0x06ba:
            r11 = r8
            r13 = r29
            r10 = 8
            goto L_0x001f
        L_0x06c1:
            r4 = r12
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f.mo94511b(com.google.ai.b.lb, android.widget.TextView, boolean):android.text.SpannableStringBuilder");
    }

    /* renamed from: c */
    public final TextView mo94512c(C7818lb lbVar, ViewGroup viewGroup) {
        int a = mo94510a(lbVar);
        if (a == 0) {
            return null;
        }
        return (TextView) this.f292794f.inflate(a, viewGroup, false);
    }

    /* renamed from: d */
    public final C7817la mo94513d(C7818lb lbVar) {
        C7817la a = C7817la.m22859a(lbVar.f27420c);
        if (a == null) {
            a = C7817la.UNDEFINED;
        }
        Map map = this.f292795g;
        if (map == null || !map.containsKey(a)) {
            return a;
        }
        C7817la laVar = (C7817la) this.f292795g.get(a);
        laVar.getClass();
        return laVar;
    }

    /* renamed from: f */
    public final boolean mo94514f(C7818lb lbVar, TextView textView, boolean z) {
        int i;
        int i2;
        SpannableStringBuilder b = mo94511b(lbVar, textView, false);
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        m174308e(lbVar, textView);
        int i3 = lbVar.f27421d;
        if (i3 > 0) {
            if (z) {
                textView.setLines(i3);
            } else if (i3 != textView.getMaxLines()) {
                textView.setMaxLines(lbVar.f27421d);
            }
        }
        if ((lbVar.f27418a & 32) != 0) {
            C89291a aVar = this.f292792d;
            Context context = this.f292790b;
            C8150xj xjVar = lbVar.f27425h;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
            textView.setContentDescription(aVar.mo83231a(context, xjVar));
        } else {
            textView.setContentDescription(mo94511b(lbVar, textView, true));
        }
        textView.setVisibility(0);
        if (textView instanceof TextViewWithImages) {
            ((TextViewWithImages) textView).mo94503a(b, this.f292796h);
        } else {
            textView.setText(b);
        }
        if ((lbVar.f27418a & 1024) != 0) {
            C7822lf lfVar = lbVar.f27430m;
            if (lfVar == null) {
                lfVar = C7822lf.f27432k;
            }
            int a = C7821le.m22862a(lfVar.f27435b);
            float f = 0.0f;
            float f2 = (a != 0 && a == 3) ? 2.14748365E9f : 0.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            if ((lfVar.f27434a & 16) != 0) {
                f2 = C91115n.m148870b((float) lfVar.f27439f, this.f292790b);
            }
            int b2 = (lfVar.f27434a & 8) != 0 ? (int) C91115n.m148870b((float) lfVar.f27438e, this.f292790b) : 0;
            int b3 = (lfVar.f27434a & 64) != 0 ? (int) C91115n.m148870b((float) lfVar.f27441h, this.f292790b) : 0;
            if ((lfVar.f27434a & 32) != 0) {
                f = C91115n.m148870b((float) lfVar.f27440g, this.f292790b);
            }
            textView.setMinHeight(textView.getMinHeight() + ((int) (f + f)));
            int i4 = (int) f;
            textView.setPadding(b3, i4, b3, i4);
            if (!this.f292793e.f292787c) {
                i = (lfVar.f27434a & 2) != 0 ? lfVar.f27436c : 0;
            } else if ((lfVar.f27434a & 4) == 0 || (i = lfVar.f27437d) == 0) {
                i = this.f292790b.getResources().getColor(R.color.default_text_dark_theme_color);
            }
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(b2, i);
            gradientDrawable.setCornerRadius(f2);
            if (this.f292793e.f292787c) {
                if ((lfVar.f27434a & 256) == 0 || (i2 = lfVar.f27443j) == 0) {
                    gradientDrawable.setColor(0);
                } else {
                    gradientDrawable.setColor(i2);
                }
            } else if ((lfVar.f27434a & 128) != 0) {
                gradientDrawable.setColor(lfVar.f27442i);
            } else {
                gradientDrawable.setColor(0);
            }
            textView.setBackground(gradientDrawable);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
        return true;
    }

    /* renamed from: g */
    public final TextView mo94515g(C7818lb lbVar, ViewGroup viewGroup) {
        TextView c = mo94512c(lbVar, viewGroup);
        if (c != null && !mo94514f(lbVar, c, false)) {
            c.setText(BuildConfig.FLAVOR);
        }
        return c;
    }
}
