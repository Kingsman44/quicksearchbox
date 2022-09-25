package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57582az;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57588be;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57602bs;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.o */
/* compiled from: PG */
public final class C137366o {

    /* renamed from: a */
    static final Uri f373648a = Uri.parse("https://www.gstatic.com/save/icons/light/empty-light@2x.png");

    /* renamed from: b */
    public final C47449e f373649b;

    /* renamed from: c */
    public final ImageView f373650c;

    /* renamed from: d */
    public final TextView f373651d;

    /* renamed from: e */
    public final TextView f373652e;

    /* renamed from: f */
    public final ImageView f373653f;

    public C137366o(ListElementView listElementView, C47449e eVar) {
        this.f373649b = eVar;
        this.f373650c = (ImageView) listElementView.findViewById(R.id.googleapp_list_image);
        this.f373651d = (TextView) listElementView.findViewById(R.id.googleapp_list_title);
        this.f373652e = (TextView) listElementView.findViewById(R.id.googleapp_list_owner);
        this.f373653f = (ImageView) listElementView.findViewById(R.id.googleapp_list_share_icon);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r4 = com.google.p4283bv.p4369f.p4370a.p4371a.C57591bh.m88503a(r4.f153838b);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m223191a(com.google.p4283bv.p4369f.p4370a.p4371a.C57578av r4) {
        /*
            com.google.bv.f.a.a.az r4 = r4.f153826c
            if (r4 != 0) goto L_0x0006
            com.google.bv.f.a.a.az r4 = com.google.p4283bv.p4369f.p4370a.p4371a.C57582az.f153835d
        L_0x0006:
            int r0 = r4.f153837a
            int r0 = com.google.p4283bv.p4369f.p4370a.p4371a.C57588be.m88502a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
        L_0x0010:
            r2 = 4
            if (r0 == r2) goto L_0x0016
            r3 = 5
            if (r0 != r3) goto L_0x0022
        L_0x0016:
            int r4 = r4.f153838b
            int r4 = com.google.p4283bv.p4369f.p4370a.p4371a.C57591bh.m88503a(r4)
            if (r4 != 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            if (r4 != r2) goto L_0x0022
            return r1
        L_0x0022:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.C137366o.m223191a(com.google.bv.f.a.a.av):boolean");
    }

    /* renamed from: b */
    public static boolean m223192b(C57578av avVar) {
        int b = C57602bs.m88505b(avVar.f153825b);
        if (b == 0) {
            b = 1;
        }
        C57582az azVar = avVar.f153826c;
        if (azVar == null) {
            azVar = C57582az.f153835d;
        }
        int a = C57588be.m88502a(azVar.f153837a);
        if (a == 0) {
            a = 1;
        }
        return b == 4 || a == 4 || a == 5;
    }
}
