package com.google.android.apps.gsa.search.shared.p6941ui.actions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58881cr;
import com.google.p4152bb.p4153a.C55361pn;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.actions.e */
/* compiled from: PG */
public final class C88511e {

    /* renamed from: a */
    private final C58881cr f239234a;

    public C88511e(C58881cr crVar) {
        this.f239234a = crVar;
    }

    /* renamed from: b */
    public static int m142915b(int i) {
        switch (i - 1) {
            case 1:
                return R.drawable.ic_send_white_action_card_material;
            case 2:
                return R.drawable.ic_action_edit_pressed;
            case 3:
                return R.drawable.ic_call_white_lighthouse_action_card;
            case 5:
                return R.drawable.quantum_ic_alarm_white_24;
            case 7:
                return R.drawable.quantum_ic_arrow_forward_white_24;
            case 9:
                return R.drawable.ic_reminders_action_card_material;
            case 11:
                return R.drawable.quantum_ic_play_arrow_grey600_24;
            case 12:
                return R.drawable.ic_message_completion_grey;
            case 13:
                return R.drawable.ic_navigation;
            case 14:
                return R.drawable.ic_reminders_launcher_shortcut;
            case 15:
                return R.drawable.quantum_ic_news_grey600_24;
            case 16:
                return R.drawable.quantum_ic_search_grey600_24;
            case 17:
                return R.drawable.quantum_ic_waves_grey600_24;
            case 18:
                return R.drawable.quantum_ic_child_care_grey600_24;
            default:
                return R.drawable.ic_done_white_lighthouse_action_card;
        }
    }

    /* renamed from: d */
    public static final boolean m142916d(int i) {
        return i == 5;
    }

    /* renamed from: c */
    public final Drawable mo82073c(int i, Context context) {
        if (i != 5) {
            return context.getResources().getDrawable(m142915b(i));
        }
        C58881cr crVar = this.f239234a;
        if (crVar != null) {
            return mo82072a((C55361pn) crVar.mo6453a(), context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = r5.f145872e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo82072a(com.google.p4152bb.p4153a.C55361pn r5, android.content.Context r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r5.f145868a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0023
            int r1 = r5.f145872e
            int r2 = com.google.p4152bb.p4153a.C55419v.m87685a(r1)
            if (r2 != 0) goto L_0x0013
            goto L_0x0017
        L_0x0013:
            r3 = 5
            if (r2 != r3) goto L_0x0017
            goto L_0x0023
        L_0x0017:
            int r5 = com.google.p4152bb.p4153a.C55419v.m87685a(r1)
            if (r5 != 0) goto L_0x001e
            r5 = 1
        L_0x001e:
            android.graphics.drawable.Drawable r5 = r4.mo82073c(r5, r6)
            return r5
        L_0x0023:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55355ph.f145853f
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r5.mo58887l(r1)
            com.google.protobuf.bf r2 = r5.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r2.mo58857o(r1)
            if (r1 != 0) goto L_0x0037
            goto L_0x007d
        L_0x0037:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55355ph.f145853f
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r5.mo58887l(r1)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r5 = r5.mo58854l(r2)
            if (r5 != 0) goto L_0x004d
            java.lang.Object r5 = r1.f169969b
            goto L_0x0051
        L_0x004d:
            java.lang.Object r5 = r1.mo58889c(r5)
        L_0x0051:
            com.google.bb.a.ph r5 = (com.google.p4152bb.p4153a.C55355ph) r5
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r1 = r5.f145857c
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0077
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.ComponentName r1 = android.content.ComponentName.unflattenFromString(r1)
            r2.setComponent(r1)
            r1 = 0
            android.content.pm.ResolveInfo r1 = r6.resolveActivity(r2, r1)
            if (r1 == 0) goto L_0x0077
            android.graphics.drawable.Drawable r0 = r1.loadIcon(r6)
            goto L_0x007d
        L_0x0077:
            java.lang.String r5 = r5.f145856b     // Catch:{ NameNotFoundException -> 0x007d }
            android.graphics.drawable.Drawable r0 = r6.getApplicationIcon(r5)     // Catch:{ NameNotFoundException -> 0x007d }
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e.mo82072a(com.google.bb.a.pn, android.content.Context):android.graphics.drawable.Drawable");
    }
}
