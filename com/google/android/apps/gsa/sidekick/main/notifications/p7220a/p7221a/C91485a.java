package com.google.android.apps.gsa.sidekick.main.notifications.p7220a.p7221a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.core.app.C1789af;
import androidx.core.app.C1832s;
import androidx.core.app.C1839z;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7856mm;
import com.google.p375ai.p378b.C7857mn;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.a.a.a */
/* compiled from: PG */
public final class C91485a {

    /* renamed from: a */
    private static final C59071e f255193a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.a.a.a");

    /* renamed from: b */
    private final Context f255194b;

    public C91485a(Context context) {
        this.f255194b = context;
    }

    /* renamed from: c */
    private final int m149632c(float f) {
        return Math.round(TypedValue.applyDimension(1, f, this.f255194b.getResources().getDisplayMetrics()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.widget.RemoteViews m149633d(int r16, int r17, long r18, android.graphics.Bitmap r20, java.lang.CharSequence r21, java.lang.CharSequence r22) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            int r3 = r2.hashCode()
            r4 = -759499589(0xffffffffd2baf4bb, float:-4.01484906E11)
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L_0x0026
            r4 = 1864941562(0x6f28bffa, float:5.2225567E28)
            if (r3 == r4) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.String r3 = "samsung"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0030
            r2 = 1
            goto L_0x0031
        L_0x0026:
            java.lang.String r3 = "xiaomi"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0030
            r2 = 0
            goto L_0x0031
        L_0x0030:
            r2 = -1
        L_0x0031:
            if (r2 == 0) goto L_0x0041
            r3 = 1096810496(0x41600000, float:14.0)
            if (r2 == r5) goto L_0x003c
            r2 = 16
            r4 = 1094713344(0x41400000, float:12.0)
            goto L_0x0046
        L_0x003c:
            r2 = 24
            r4 = 1093664768(0x41300000, float:11.0)
            goto L_0x0046
        L_0x0041:
            r2 = 6
            r4 = 1096286208(0x41580000, float:13.5)
            r3 = 1095761920(0x41500000, float:13.0)
        L_0x0046:
            android.content.Context r7 = r0.f255194b
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r7 != r5) goto L_0x0058
            r7 = 1
            goto L_0x0059
        L_0x0058:
            r7 = 0
        L_0x0059:
            if (r7 == 0) goto L_0x005d
            r11 = 0
            goto L_0x0063
        L_0x005d:
            float r8 = (float) r2
            int r8 = r15.m149632c(r8)
            r11 = r8
        L_0x0063:
            if (r7 == 0) goto L_0x006c
            float r2 = (float) r2
            int r2 = r15.m149632c(r2)
            r13 = r2
            goto L_0x006d
        L_0x006c:
            r13 = 0
        L_0x006d:
            android.content.Context r2 = r0.f255194b
            java.lang.String r2 = r2.getPackageName()
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            r8 = r16
            r7.<init>(r2, r8)
            r10 = 2131430372(0x7f0b0be4, float:1.8482443E38)
            r12 = 0
            r14 = 0
            r9 = r7
            r9.setViewPadding(r10, r11, r12, r13, r14)
            r2 = 2131430367(0x7f0b0bdf, float:1.8482433E38)
            r8 = 2
            r7.setTextViewTextSize(r2, r8, r4)
            r2 = 2131430364(0x7f0b0bdc, float:1.8482427E38)
            r7.setTextViewTextSize(r2, r8, r4)
            r2 = 2131430366(0x7f0b0bde, float:1.848243E38)
            r7.setTextViewTextSize(r2, r8, r4)
            r4 = 2131430371(0x7f0b0be3, float:1.8482441E38)
            r7.setTextViewTextSize(r4, r8, r3)
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3 = 2131430365(0x7f0b0bdd, float:1.8482429E38)
            r9 = r17
            r7.setImageViewResource(r3, r9)
            int r3 = r20.getWidth()
            int r9 = r20.getHeight()
            if (r3 < r9) goto L_0x00ba
            r3 = 2131430368(0x7f0b0be0, float:1.8482435E38)
            r7.setViewVisibility(r3, r6)
            r7.setImageViewBitmap(r3, r1)
            goto L_0x00c6
        L_0x00ba:
            r3 = 2131430370(0x7f0b0be2, float:1.848244E38)
            r7.setViewVisibility(r3, r6)
            r3 = 2131430369(0x7f0b0be1, float:1.8482437E38)
            r7.setImageViewBitmap(r3, r1)
        L_0x00c6:
            android.content.Context r1 = r0.f255194b
            r9 = r18
            java.lang.CharSequence r1 = com.google.android.apps.gsa.shared.p7019bc.C89407a.m145418a(r1, r9, r6, r6)
            r7.setTextViewText(r2, r1)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r6] = r21
            android.content.Context r2 = r0.f255194b
            r3 = 2132086430(0x7f150e9e, float:1.9813087E38)
            java.lang.String r2 = r2.getString(r3)
            r1[r5] = r2
            r1[r8] = r22
            java.lang.String r2 = "%s %s %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r7.setTextViewText(r4, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.p7220a.p7221a.C91485a.m149633d(int, int, long, android.graphics.Bitmap, java.lang.CharSequence, java.lang.CharSequence):android.widget.RemoteViews");
    }

    /* renamed from: e */
    private static void m149634e(RemoteViews remoteViews, C1832s sVar, int i) {
        remoteViews.setViewVisibility(i, 0);
        remoteViews.setTextViewText(i, sVar.f5661h);
        remoteViews.setContentDescription(i, sVar.f5661h);
        remoteViews.setOnClickPendingIntent(i, sVar.f5662i);
    }

    /* renamed from: a */
    public final void mo85828a(C1839z zVar, int i, long j, Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2, List list) {
        C1839z zVar2 = zVar;
        List list2 = list;
        zVar2.f5679J.contentView = m149633d(R.layout.edge_to_edge_large_icon_without_actions, i, j, bitmap, charSequence, charSequence2);
        Bundle bundle = zVar.mo5013a().extras;
        if (bundle != null && bundle.getParcelable("android.picture") != null) {
            return;
        }
        if (list.isEmpty()) {
            zVar.mo5022k((C1789af) null);
            return;
        }
        RemoteViews d = m149633d(R.layout.edge_to_edge_large_icon_with_actions, i, j, bitmap, charSequence, charSequence2);
        if (!list.isEmpty()) {
            m149634e(d, (C1832s) list2.get(0), R.id.edge_to_edge_image_notification_action0);
        }
        if (list.size() > 1) {
            m149634e(d, (C1832s) list2.get(1), R.id.edge_to_edge_image_notification_action1);
        }
        if (list.size() > 2) {
            m149634e(d, (C1832s) list2.get(2), R.id.edge_to_edge_image_notification_action2);
        }
        if (list.size() > 3) {
            C59104x d2 = f255193a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "E2EImageRenderer");
            ((C59052c) ((C59052c) d2).mo56372aa(11691)).mo56387q("Max 3 actions are supported while notification payload have %d", list.size());
        }
        zVar2.f5674E = d;
        C58976aa aaVar = C58975e.f156826a;
        list.size();
    }

    /* renamed from: b */
    public final boolean mo85829b(C7857mn mnVar, String str) {
        C7856mm mmVar;
        if (Build.VERSION.SDK_INT > 30 || str.isEmpty()) {
            return false;
        }
        if (mnVar.f27539a == 1) {
            mmVar = (C7856mm) mnVar.f27540b;
        } else {
            mmVar = C7856mm.f27533b;
        }
        if (!mmVar.f27535a.isEmpty()) {
            return true;
        }
        return false;
    }
}
