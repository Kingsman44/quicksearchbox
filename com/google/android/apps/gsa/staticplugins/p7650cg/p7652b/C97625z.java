package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import androidx.core.app.C1789af;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8110vx;
import com.google.p375ai.p378b.C8118we;
import com.google.p375ai.p378b.C8120wg;
import com.google.p375ai.p378b.C8124wk;
import com.google.p375ai.p378b.C8126wm;
import com.google.p375ai.p378b.C8131wr;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.z */
/* compiled from: PG */
public final class C97625z extends C97600b {
    public C97625z(C7718hj hjVar, C7874nd ndVar, C89291a aVar, C86124t tVar, C68214a aVar2) {
        super(hjVar, ndVar, aVar, tVar, aVar2);
    }

    /* renamed from: L */
    protected static final String m161843L(Context context, long j) {
        if (!DateUtils.isToday(j)) {
            return DateUtils.formatDateTime(context, j, 0);
        }
        Date date = new Date(j);
        return context.getString(R.string.time_with_time_zone, new Object[]{DateFormat.getTimeFormat(context).format(date), new SimpleDateFormat("z").format(date)});
    }

    /* renamed from: M */
    private static String m161844M(C8131wr wrVar, int i, int i2) {
        if (wrVar.f28591f.size() <= i) {
            return BuildConfig.FLAVOR;
        }
        C62971cq cqVar = ((C8120wg) wrVar.f28591f.get(i)).f28543b;
        return cqVar.size() > i2 ? (String) cqVar.get(i2) : BuildConfig.FLAVOR;
    }

    /* renamed from: N */
    private static String m161845N(C8124wk wkVar) {
        return !wkVar.f28552c.isEmpty() ? wkVar.f28552c : wkVar.f28551b;
    }

    /* renamed from: O */
    private static String m161846O(Context context, C8131wr wrVar, int i, String str) {
        if (wrVar.f28591f.size() == 0) {
            return null;
        }
        String M = m161844M(wrVar, 0, i);
        if (M.isEmpty()) {
            return null;
        }
        return context.getString(R.string.cricket_match_scores, new Object[]{str, M, m161844M(wrVar, 1, i)});
    }

    /* renamed from: C */
    public final CharSequence mo85871C(Context context) {
        String str;
        if ((mo90760K().f26955a & 16384) == 0) {
            return null;
        }
        C8131wr wrVar = mo90760K().f26978s;
        if (wrVar == null) {
            wrVar = C8131wr.f28584p;
        }
        int a = C8126wm.m22953a(wrVar.f28588c);
        if (a == 0) {
            a = 1;
        }
        C8110vx a2 = C8110vx.m22949a(wrVar.f28587b);
        if (a2 == null) {
            a2 = C8110vx.BASKETBALL;
        }
        if (a2 == C8110vx.CRICKET && a == 1) {
            C8118we weVar = wrVar.f28600o;
            if (weVar == null) {
                weVar = C8118we.f28532g;
            }
            str = weVar.f28536c;
        } else {
            str = null;
        }
        long j = wrVar.f28589d;
        int i = a - 1;
        if (i == 0) {
            return str == null ? context.getString(R.string.final_score) : str;
        }
        if (i == 1) {
            return context.getString(R.string.sports_status_in_progress);
        }
        if (i != 2) {
            return null;
        }
        long j2 = j * 1000;
        if (DateUtils.isToday(j2)) {
            return context.getString(R.string.sports_status_not_started_time, new Object[]{m161843L(context, j2)});
        }
        return context.getString(R.string.sports_status_not_started_date, new Object[]{m161843L(context, j2)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo85872D(android.content.Context r12) {
        /*
            r11 = this;
            com.google.ai.b.hj r0 = r11.mo90760K()
            int r0 = r0.f26955a
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            r1 = 0
            if (r0 == 0) goto L_0x00a6
            com.google.ai.b.hj r0 = r11.mo90760K()
            com.google.ai.b.wr r0 = r0.f26978s
            if (r0 != 0) goto L_0x0015
            com.google.ai.b.wr r0 = com.google.p375ai.p378b.C8131wr.f28584p
        L_0x0015:
            com.google.ai.b.vx r2 = com.google.p375ai.p378b.C8110vx.CRICKET
            int r3 = r0.f28587b
            com.google.ai.b.vx r3 = com.google.p375ai.p378b.C8110vx.m22949a(r3)
            if (r3 != 0) goto L_0x0021
            com.google.ai.b.vx r3 = com.google.p375ai.p378b.C8110vx.BASKETBALL
        L_0x0021:
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != r3) goto L_0x0039
            com.google.ai.b.we r2 = r0.f28600o
            if (r2 != 0) goto L_0x002c
            com.google.ai.b.we r2 = com.google.p375ai.p378b.C8118we.f28532g
        L_0x002c:
            int r2 = r2.f28535b
            int r2 = com.google.p375ai.p378b.C8117wd.m22951a(r2)
            if (r2 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            if (r2 != r4) goto L_0x0039
            r2 = 1
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            int r3 = r0.f28587b
            com.google.ai.b.vx r3 = com.google.p375ai.p378b.C8110vx.m22949a(r3)
            if (r3 != 0) goto L_0x0044
            com.google.ai.b.vx r3 = com.google.p375ai.p378b.C8110vx.BASKETBALL
        L_0x0044:
            com.google.protobuf.cq r7 = r0.f28592g
            java.lang.Object r7 = r7.get(r6)
            com.google.ai.b.wk r7 = (com.google.p375ai.p378b.C8124wk) r7
            com.google.protobuf.cq r0 = r0.f28592g
            java.lang.Object r0 = r0.get(r5)
            com.google.ai.b.wk r0 = (com.google.p375ai.p378b.C8124wk) r0
            java.lang.String r8 = m161845N(r7)
            java.lang.String r9 = m161845N(r0)
            int r10 = r7.f28550a
            r10 = r10 & 32
            if (r10 == 0) goto L_0x006d
            int r10 = r0.f28550a
            r10 = r10 & 32
            if (r10 == 0) goto L_0x006d
            java.lang.String r1 = r7.f28556g
            java.lang.String r0 = r0.f28556g
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            java.lang.String r7 = com.google.android.apps.gsa.shared.util.C91035f.m148708d(r8)
            java.lang.String r8 = com.google.android.apps.gsa.shared.util.C91035f.m148708d(r9)
            if (r1 == 0) goto L_0x0098
            if (r0 == 0) goto L_0x0098
            if (r2 != 0) goto L_0x0098
            com.google.ai.b.vx r2 = com.google.p375ai.p378b.C8110vx.SOCCER
            if (r3 != r2) goto L_0x0084
            r2 = 2132092607(0x7f1526bf, float:1.9825615E38)
            goto L_0x0087
        L_0x0084:
            r2 = 2132092606(0x7f1526be, float:1.9825613E38)
        L_0x0087:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r7
            r3[r5] = r1
            r3[r4] = r8
            r1 = 3
            r3[r1] = r0
            java.lang.String r12 = r12.getString(r2, r3)
            return r12
        L_0x0098:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r6] = r7
            r0[r5] = r8
            r1 = 2132092604(0x7f1526bc, float:1.982561E38)
            java.lang.String r12 = r12.getString(r1, r0)
            return r12
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7650cg.p7652b.C97625z.mo85872D(android.content.Context):java.lang.CharSequence");
    }

    /* renamed from: E */
    public final CharSequence mo85873E() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final int mo90756G() {
        return C89885b.S3_CREATE_INPUT_STREAM_FAILED_VALUE;
    }

    /* renamed from: b */
    public final int mo85876b() {
        int i;
        if ((mo90760K().f26955a & 16384) != 0) {
            C8131wr wrVar = mo90760K().f26978s;
            if (wrVar == null) {
                wrVar = C8131wr.f28584p;
            }
            C8110vx a = C8110vx.m22949a(wrVar.f28587b);
            if (a == null) {
                a = C8110vx.BASKETBALL;
            }
            switch (a.ordinal()) {
                case 0:
                    i = R.drawable.ic_basketball;
                    break;
                case 1:
                    i = R.drawable.ic_football;
                    break;
                case 2:
                    i = R.drawable.ic_baseball;
                    break;
                case 3:
                    i = R.drawable.ic_hockey;
                    break;
                case 4:
                    i = R.drawable.ic_soccer;
                    break;
                case 5:
                    i = R.drawable.ic_rugby;
                    break;
                case 6:
                    i = R.drawable.ic_cricket;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                return i;
            }
        }
        return R.drawable.ic_baseball;
    }

    /* renamed from: h */
    public final C1789af mo85882h(Context context) {
        int a;
        C8131wr wrVar = mo90760K().f26978s;
        if (wrVar == null) {
            wrVar = C8131wr.f28584p;
        }
        if ((mo90760K().f26955a & 16384) == 0) {
            return null;
        }
        C8110vx vxVar = C8110vx.CRICKET;
        C8110vx a2 = C8110vx.m22949a(wrVar.f28587b);
        if (a2 == null) {
            a2 = C8110vx.BASKETBALL;
        }
        if (vxVar != a2 || (a = C8126wm.m22953a(wrVar.f28588c)) == 0 || a != 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String N = m161845N((C8124wk) wrVar.f28592g.get(0));
        String N2 = m161845N((C8124wk) wrVar.f28592g.get(1));
        String O = m161846O(context, wrVar, 0, N);
        if (O != null) {
            sb.append(O);
            sb.append("\n");
        }
        String O2 = m161846O(context, wrVar, 1, N2);
        if (O2 != null) {
            sb.append(O2);
        }
        C1837x xVar = new C1837x();
        xVar.f5669a = C1839z.m5037c(sb);
        return xVar;
    }
}
