package com.google.android.apps.gsa.staticplugins.nowcards.p8118h;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4535g.C59203do;
import com.google.p375ai.p378b.C8124wk;
import com.google.p375ai.p378b.C8129wp;
import com.google.p375ai.p378b.C8130wq;
import java.text.DecimalFormat;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.h.e */
/* compiled from: PG */
final class C104986e {

    /* renamed from: a */
    static final DecimalFormat f292485a = new DecimalFormat("#.#");

    /* renamed from: b */
    static final DecimalFormat f292486b = new DecimalFormat(".000");

    /* renamed from: c */
    static final DecimalFormat f292487c = new DecimalFormat("0.000");

    /* renamed from: a */
    public static String m174067a(int i, C8124wk wkVar, Context context, boolean z) {
        if (i == 11) {
            return wkVar.f28551b;
        }
        C8130wq wqVar = wkVar.f28559j;
        if (wqVar == null) {
            wqVar = C8130wq.f28570m;
        }
        switch (i) {
            case 1:
                if ((wqVar.f28572a & 2) == 0) {
                    return null;
                }
                C8129wp wpVar = wqVar.f28574c;
                if (wpVar == null) {
                    wpVar = C8129wp.f28563f;
                }
                return context.getString(R.string.sports_team_win_loss_record, new Object[]{Integer.valueOf(wpVar.f28566b), Integer.valueOf(wpVar.f28567c)});
            case 2:
                if ((wqVar.f28572a & 64) == 0) {
                    return null;
                }
                double d = wqVar.f28579h;
                if (d == C59203do.f157270a) {
                    return null;
                }
                return f292485a.format(d);
            case 3:
                if ((wqVar.f28572a & 32) == 0) {
                    return null;
                }
                return Integer.toString(wqVar.f28578g);
            case 4:
                if ((wqVar.f28572a & 8) == 0) {
                    return null;
                }
                return wqVar.f28576e;
            case 5:
                C8129wp wpVar2 = wqVar.f28573b;
                if (wpVar2 == null) {
                    wpVar2 = C8129wp.f28563f;
                }
                if ((wpVar2.f28565a & 2) == 0) {
                    return null;
                }
                C8129wp wpVar3 = wqVar.f28573b;
                if (wpVar3 == null) {
                    wpVar3 = C8129wp.f28563f;
                }
                return Integer.toString(wpVar3.f28567c);
            case 6:
                C8129wp wpVar4 = wqVar.f28573b;
                if (wpVar4 == null) {
                    wpVar4 = C8129wp.f28563f;
                }
                if ((wpVar4.f28565a & 8) == 0) {
                    return null;
                }
                C8129wp wpVar5 = wqVar.f28573b;
                if (wpVar5 == null) {
                    wpVar5 = C8129wp.f28563f;
                }
                return Integer.toString(wpVar5.f28569e);
            case 7:
                if ((wqVar.f28572a & 1024) == 0) {
                    return null;
                }
                return Integer.toString(wqVar.f28583l);
            case 8:
                if ((wqVar.f28572a & 512) == 0) {
                    return null;
                }
                return Integer.toString(wqVar.f28582k);
            case 9:
                return null;
            case 10:
                int i2 = wqVar.f28572a;
                if ((i2 & 128) != 0) {
                    String string = context.getString(R.string.sports_wins_header);
                    int i3 = wqVar.f28580i;
                    return string + i3;
                } else if ((i2 & 256) == 0) {
                    return null;
                } else {
                    String string2 = context.getString(R.string.sports_losses_header);
                    int i4 = wqVar.f28581j;
                    return string2 + i4;
                }
            case 12:
                if ((wqVar.f28572a & 16) == 0) {
                    return null;
                }
                return Integer.toString(wqVar.f28577f);
            case 13:
                C8129wp wpVar6 = wqVar.f28573b;
                if (wpVar6 == null) {
                    wpVar6 = C8129wp.f28563f;
                }
                if ((wpVar6.f28565a & 4) == 0) {
                    return null;
                }
                C8129wp wpVar7 = wqVar.f28573b;
                if (wpVar7 == null) {
                    wpVar7 = C8129wp.f28563f;
                }
                return Integer.toString(wpVar7.f28568d);
            case 14:
                if ((wqVar.f28572a & 4) == 0) {
                    return null;
                }
                if (z) {
                    return f292487c.format(wqVar.f28575d);
                }
                return f292486b.format(wqVar.f28575d);
            case 15:
                C8129wp wpVar8 = wqVar.f28573b;
                if (wpVar8 == null) {
                    wpVar8 = C8129wp.f28563f;
                }
                if ((wpVar8.f28565a & 1) == 0) {
                    return null;
                }
                C8129wp wpVar9 = wqVar.f28573b;
                if (wpVar9 == null) {
                    wpVar9 = C8129wp.f28563f;
                }
                return Integer.toString(wpVar9.f28566b);
            default:
                return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r5 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r5 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r0 = com.google.android.googlequicksearchbox.R.string.sports_team_points_header;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m174068b(int r3, android.content.Context r4, boolean r5) {
        /*
            r0 = 2132092602(0x7f1526ba, float:1.9825605E38)
            r1 = 2132092601(0x7f1526b9, float:1.9825603E38)
            r2 = -1
            switch(r3) {
                case 1: goto L_0x00a7;
                case 2: goto L_0x009d;
                case 3: goto L_0x0093;
                case 4: goto L_0x0089;
                case 5: goto L_0x007f;
                case 6: goto L_0x0075;
                case 7: goto L_0x006e;
                case 8: goto L_0x0064;
                case 9: goto L_0x005a;
                case 10: goto L_0x004e;
                case 11: goto L_0x0049;
                case 12: goto L_0x0045;
                case 13: goto L_0x0039;
                case 14: goto L_0x002d;
                case 15: goto L_0x0021;
                default: goto L_0x000a;
            }
        L_0x000a:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104987f.f292488i
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "QpSportScoreEntryAdapte"
            r5.mo56378ag(r0, r1)
            java.lang.String r0 = "Unrecognized team stat for header: %d"
            r1 = 22083(0x5643, float:3.0945E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r1)).mo56387q(r0, r3)
            r0 = -1
            goto L_0x00b0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r0 = 2132092614(0x7f1526c6, float:1.982563E38)
            goto L_0x00b0
        L_0x0028:
            r0 = 2132092613(0x7f1526c5, float:1.9825627E38)
            goto L_0x00b0
        L_0x002d:
            if (r5 == 0) goto L_0x0034
            r0 = 2132092612(0x7f1526c4, float:1.9825625E38)
            goto L_0x00b0
        L_0x0034:
            r0 = 2132092611(0x7f1526c3, float:1.9825623E38)
            goto L_0x00b0
        L_0x0039:
            if (r5 == 0) goto L_0x0040
            r0 = 2132092610(0x7f1526c2, float:1.9825621E38)
            goto L_0x00b0
        L_0x0040:
            r0 = 2132092609(0x7f1526c1, float:1.982562E38)
            goto L_0x00b0
        L_0x0045:
            if (r5 == 0) goto L_0x0071
            goto L_0x00b0
        L_0x0049:
            r0 = 2132092598(0x7f1526b6, float:1.9825597E38)
            goto L_0x00b0
        L_0x004e:
            if (r5 == 0) goto L_0x0055
            r0 = 2132092596(0x7f1526b4, float:1.9825593E38)
            goto L_0x00b0
        L_0x0055:
            r0 = 2132092595(0x7f1526b3, float:1.982559E38)
            goto L_0x00b0
        L_0x005a:
            if (r5 == 0) goto L_0x0060
            r0 = 2132092590(0x7f1526ae, float:1.982558E38)
            goto L_0x00b0
        L_0x0060:
            r0 = 2132092589(0x7f1526ad, float:1.9825579E38)
            goto L_0x00b0
        L_0x0064:
            if (r5 == 0) goto L_0x006a
            r0 = 2132092600(0x7f1526b8, float:1.9825601E38)
            goto L_0x00b0
        L_0x006a:
            r0 = 2132092599(0x7f1526b7, float:1.98256E38)
            goto L_0x00b0
        L_0x006e:
            if (r5 == 0) goto L_0x0071
            goto L_0x00b0
        L_0x0071:
            r0 = 2132092601(0x7f1526b9, float:1.9825603E38)
            goto L_0x00b0
        L_0x0075:
            if (r5 == 0) goto L_0x007b
            r0 = 2132092587(0x7f1526ab, float:1.9825575E38)
            goto L_0x00b0
        L_0x007b:
            r0 = 2132092586(0x7f1526aa, float:1.9825573E38)
            goto L_0x00b0
        L_0x007f:
            if (r5 == 0) goto L_0x0085
            r0 = 2132092585(0x7f1526a9, float:1.982557E38)
            goto L_0x00b0
        L_0x0085:
            r0 = 2132092584(0x7f1526a8, float:1.9825569E38)
            goto L_0x00b0
        L_0x0089:
            if (r5 == 0) goto L_0x008f
            r0 = 2132092583(0x7f1526a7, float:1.9825567E38)
            goto L_0x00b0
        L_0x008f:
            r0 = 2132092582(0x7f1526a6, float:1.9825565E38)
            goto L_0x00b0
        L_0x0093:
            if (r5 == 0) goto L_0x0099
            r0 = 2132092581(0x7f1526a5, float:1.9825563E38)
            goto L_0x00b0
        L_0x0099:
            r0 = 2132092580(0x7f1526a4, float:1.982556E38)
            goto L_0x00b0
        L_0x009d:
            if (r5 == 0) goto L_0x00a3
            r0 = 2132092579(0x7f1526a3, float:1.9825558E38)
            goto L_0x00b0
        L_0x00a3:
            r0 = 2132092578(0x7f1526a2, float:1.9825556E38)
            goto L_0x00b0
        L_0x00a7:
            if (r5 == 0) goto L_0x00ad
            r0 = 2132092577(0x7f1526a1, float:1.9825554E38)
            goto L_0x00b0
        L_0x00ad:
            r0 = 2132092576(0x7f1526a0, float:1.9825552E38)
        L_0x00b0:
            if (r0 == r2) goto L_0x00b7
            java.lang.String r3 = r4.getString(r0)
            return r3
        L_0x00b7:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104986e.m174068b(int, android.content.Context, boolean):java.lang.String");
    }
}
