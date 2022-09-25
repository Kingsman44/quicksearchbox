package com.google.android.apps.gsa.searchplate;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.searchplate.av */
/* compiled from: PG */
final class C88920av implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    final /* synthetic */ C88922ax f240874a;

    public C88920av(C88922ax axVar) {
        this.f240874a = axVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r4.f240876b.contains(r4.f240875a) == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r3, int r4, boolean r5) {
        /*
            r2 = this;
            com.google.android.apps.gsa.searchplate.ax r0 = r2.f240874a
            com.google.android.apps.gsa.searchplate.ay r0 = r0.f240877c
            java.util.List r0 = r0.f240878a
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r5 == 0) goto L_0x003e
            com.google.android.apps.gsa.searchplate.ax r5 = r2.f240874a
            java.util.Set r5 = r5.f240876b
            int r5 = r5.size()
            r1 = 5
            if (r5 >= r1) goto L_0x0021
            com.google.android.apps.gsa.searchplate.ax r4 = r2.f240874a
            java.util.Set r4 = r4.f240876b
            r4.add(r0)
            goto L_0x0045
        L_0x0021:
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            android.widget.ListView r3 = r3.getListView()
            r5 = 0
            r3.setItemChecked(r4, r5)
            com.google.android.apps.gsa.searchplate.ax r3 = r2.f240874a
            com.google.android.apps.gsa.searchplate.ay r3 = r3.f240877c
            android.content.Context r3 = r3.getContext()
            r4 = 2132086308(0x7f150e24, float:1.981284E38)
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r5)
            r3.show()
            return
        L_0x003e:
            com.google.android.apps.gsa.searchplate.ax r4 = r2.f240874a
            java.util.Set r4 = r4.f240876b
            r4.remove(r0)
        L_0x0045:
            com.google.android.apps.gsa.searchplate.ax r4 = r2.f240874a
            java.util.Set r4 = r4.f240876b
            int r4 = r4.size()
            r5 = 1
            if (r4 == r5) goto L_0x0066
            com.google.android.apps.gsa.searchplate.ax r4 = r2.f240874a
            java.util.Set r4 = r4.f240876b
            int r4 = r4.size()
            if (r4 <= r5) goto L_0x0076
            com.google.android.apps.gsa.searchplate.ax r4 = r2.f240874a
            java.util.Set r0 = r4.f240876b
            java.lang.String r4 = r4.f240875a
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L_0x0076
        L_0x0066:
            com.google.android.apps.gsa.searchplate.ax r4 = r2.f240874a
            java.util.Set r0 = r4.f240876b
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r4.f240875a = r0
        L_0x0076:
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            r4 = -1
            android.widget.Button r3 = r3.getButton(r4)
            com.google.android.apps.gsa.searchplate.ax r4 = r2.f240874a
            java.util.Set r4 = r4.f240876b
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r5
            r3.setEnabled(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchplate.C88920av.onClick(android.content.DialogInterface, int, boolean):void");
    }
}
