package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.util.Size;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52222jt;
import com.google.assistant.p3897e.p3921j.C52223ju;
import com.google.assistant.p3897e.p3921j.C52226jx;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gt */
/* compiled from: PG */
final class C108385gt implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f301457a;

    /* renamed from: b */
    final /* synthetic */ C108387gv f301458b;

    public C108385gt(C108387gv gvVar, ViewGroup viewGroup) {
        this.f301458b = gvVar;
        this.f301457a = viewGroup;
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v10 */
    public final void onGlobalLayout() {
        double d;
        int i;
        int i2;
        C108387gv gvVar = this.f301458b;
        int min = Math.min(gvVar.f301474c.size(), 50);
        ? r3 = 0;
        int i3 = 0;
        while (i3 < min) {
            double d2 = gvVar.f301465G[r3];
            int i4 = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                double d3 = gvVar.f301465G[i5];
                if (d2 > d3) {
                    i4 = i5;
                }
                if (d2 > d3) {
                    d2 = d3;
                }
            }
            ViewGroup viewGroup = (ViewGroup) gvVar.f301462D.get(i4);
            int measuredWidth = viewGroup.getMeasuredWidth();
            int i6 = gvVar.f301466H;
            int i7 = measuredWidth - (i6 + i6);
            C52223ju juVar = (C52223ju) gvVar.f301474c.get(i3);
            double d4 = (double) juVar.f137043d;
            double d5 = (double) juVar.f137042c;
            Double.isNaN(d4);
            Double.isNaN(d5);
            double d6 = d4 / d5;
            double d7 = (double) i7;
            Double.isNaN(d7);
            int round = (int) Math.round(d7 * d6);
            String str = juVar.f137044e;
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(gvVar.f301473b).inflate(R.layout.photo_cell_view, viewGroup, r3);
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.photo_thumbnail);
            if ((juVar.f137040a & 128) != 0) {
                C52222jt jtVar = juVar.f137047h;
                if (jtVar == null) {
                    jtVar = C52222jt.f137033c;
                }
                C63042fg fgVar = jtVar.f137035a;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                i2 = i3;
                long j = fgVar.f170154a;
                C52222jt jtVar2 = juVar.f137047h;
                if (jtVar2 == null) {
                    jtVar2 = C52222jt.f137033c;
                }
                i = min;
                d = d6;
                Object format = SimpleDateFormat.getDateTimeInstance().format(new Date(j + TimeUnit.MILLISECONDS.toSeconds((long) jtVar2.f137036b)));
                viewGroup2.setContentDescription(gvVar.f301473b.getResources().getString(R.string.photos_accessibility_photo_metadata, new Object[]{format}));
            } else {
                i = min;
                i2 = i3;
                d = d6;
                viewGroup2.setContentDescription(gvVar.f301473b.getResources().getString(R.string.photos_accessibility_photo));
            }
            SelectionBadge selectionBadge = (SelectionBadge) viewGroup2.findViewById(R.id.photo_selection_badge);
            gvVar.f301463E.add(selectionBadge);
            C91189au auVar = gvVar.f301476e;
            C91193ay q = C91196ba.m149039q();
            C91222n nVar = (C91222n) q;
            nVar.f254620a = str;
            nVar.f254621b = new Size(i7, round);
            C60870cx h = auVar.mo85420h(q.mo85445c(), imageView);
            synchronized (gvVar.f301468J) {
                gvVar.f301467I.add(h);
            }
            gvVar.f301477f.mo28211k(h, "Thumbnail load callback", new C108386gu(gvVar, h));
            viewGroup2.setOnLongClickListener(new C108383gr(gvVar, selectionBadge));
            int i8 = i2;
            viewGroup2.setOnClickListener(new C108384gs(gvVar, selectionBadge, i8));
            selectionBadge.setOnCheckedChangeListener(new C108382gq(gvVar, selectionBadge, juVar, viewGroup2));
            viewGroup.addView(viewGroup2);
            double[] dArr = gvVar.f301465G;
            dArr[i4] = dArr[i4] + d;
            gvVar.f301471M.add(imageView);
            i3 = i8 + 1;
            min = i;
            r3 = 0;
        }
        int a = C52226jx.m86547a(gvVar.f301479h.f137051a);
        if (a != 0 && a == 2) {
            gvVar.mo96830e();
        }
        this.f301457a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f301458b.f301475d.mo95796a();
    }
}
