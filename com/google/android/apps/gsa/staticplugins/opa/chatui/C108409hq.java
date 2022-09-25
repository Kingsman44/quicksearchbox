package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.widget.SeekBar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hq */
/* compiled from: PG */
final class C108409hq implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ SliderSettingCard f301525a;

    public C108409hq(SliderSettingCard sliderSettingCard) {
        this.f301525a = sliderSettingCard;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f301525a.f300939b = i;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0102 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStopTrackingTouch(android.widget.SeekBar r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.staticplugins.opa.chatui.SliderSettingCard r0 = r12.f301525a
            int r1 = r0.f300939b
            if (r1 < 0) goto L_0x0106
            com.google.android.apps.gsa.shared.ag.c.c r0 = r0.f301432i
            java.lang.String r2 = r0.f241556d
            android.net.Uri r2 = com.google.android.apps.gsa.shared.p6976ag.p6979c.C89111e.m144952c(r2)
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            r5 = 4
            r6 = 0
            if (r2 == 0) goto L_0x0072
            android.database.Cursor r2 = r0.mo83083d(r2)
            if (r2 == 0) goto L_0x0072
            r2.moveToPosition(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "0"
            r8 = 1
            java.lang.String r8 = r2.getString(r8)     // Catch:{ all -> 0x006d }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x006d }
            r0.f241558f = r7     // Catch:{ all -> 0x006d }
            if (r7 == 0) goto L_0x0069
            r7 = 3
            java.lang.String r7 = r2.getString(r7)     // Catch:{ all -> 0x006d }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r8 = r2.getString(r5)     // Catch:{ all -> 0x006d }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ all -> 0x006d }
            r9 = -1
            if (r7 >= r8) goto L_0x005a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x006d }
            boolean r10 = com.google.android.apps.gsa.shared.p6976ag.p6979c.C89111e.m144954e(r10)     // Catch:{ all -> 0x006d }
            if (r10 != 0) goto L_0x004b
            goto L_0x005a
        L_0x004b:
            double r10 = (double) r7
            int r8 = r8 - r7
            int r8 = r8 * r1
            double r7 = (double) r8
            java.lang.Double.isNaN(r7)
            double r7 = r7 / r3
            java.lang.Double.isNaN(r10)
            double r10 = r10 + r7
            int r7 = (int) r10
            goto L_0x005b
        L_0x005a:
            r7 = -1
        L_0x005b:
            if (r7 == r9) goto L_0x0069
            java.lang.String r1 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x006d }
            r0.mo83087h(r1)     // Catch:{ all -> 0x006d }
            r2.close()
            goto L_0x00ed
        L_0x0069:
            r2.close()
            goto L_0x0072
        L_0x006d:
            r13 = move-exception
            r2.close()
            throw r13
        L_0x0072:
            r0.f241558f = r6
            com.google.android.apps.gsa.shared.m.c r2 = r0.f241554b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247185cQ
            boolean r2 = r2.mo79746e(r7)
            if (r2 == 0) goto L_0x00eb
            java.lang.String r2 = r0.f241557e
            boolean r2 = com.google.common.base.C58837ba.m90859h(r2)
            if (r2 != 0) goto L_0x00eb
            java.lang.String r2 = r0.f241556d
            java.lang.String r2 = r0.f241557e
            com.google.assistant.e.j.fu r2 = com.google.assistant.p3897e.p3921j.C52115fu.f136753n
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.fp r2 = (com.google.assistant.p3897e.p3921j.C52110fp) r2
            java.lang.String r7 = r0.f241557e
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.j.fu r8 = (com.google.assistant.p3897e.p3921j.C52115fu) r8
            r7.getClass()
            int r9 = r8.f136755a
            r9 = r9 | 16
            r8.f136755a = r9
            r8.f136760f = r7
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.j.fu r7 = (com.google.assistant.p3897e.p3921j.C52115fu) r7
            r8 = 2
            r7.f136759e = r8
            int r9 = r7.f136755a
            r9 = r9 | 8
            r7.f136755a = r9
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.j.fu r7 = (com.google.assistant.p3897e.p3921j.C52115fu) r7
            r9 = 6
            r7.f136757c = r9
            int r9 = r7.f136755a
            r8 = r8 | r9
            r7.f136755a = r8
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.j.fu r7 = (com.google.assistant.p3897e.p3921j.C52115fu) r7
            int r8 = r7.f136755a
            r5 = r5 | r8
            r7.f136755a = r5
            double r8 = (double) r1
            java.lang.Double.isNaN(r8)
            double r8 = r8 / r3
            r7.f136758d = r8
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.fu r1 = (com.google.assistant.p3897e.p3921j.C52115fu) r1
            com.google.android.apps.gsa.shared.ag.c.g r2 = r0.f241555c
            r3 = 7
            com.google.android.apps.gsa.shared.ag.c.f r2 = r2.mo83091a(r3)
            boolean r1 = r2.mo83090b(r1)
            r0.f241558f = r1
        L_0x00eb:
            boolean r0 = r0.f241558f
        L_0x00ed:
            com.google.android.apps.gsa.staticplugins.opa.chatui.SliderSettingCard r0 = r12.f301525a
            r0.mo96540d()
            com.google.android.libraries.logging.j r13 = com.google.android.libraries.logging.C28295m.m52915a(r13)
            if (r13 != 0) goto L_0x00f9
            return
        L_0x00f9:
            r0 = 31
            r1 = 0
            com.google.common.o.oe r13 = com.google.android.libraries.logging.C28285c.m52883j(r13, r0, r1)
            if (r13 != 0) goto L_0x0103
            return
        L_0x0103:
            com.google.android.apps.gsa.shared.logger.C89949q.m146521e(r13, r6)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108409hq.onStopTrackingTouch(android.widget.SeekBar):void");
    }
}
