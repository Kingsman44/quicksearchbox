package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117093e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58833ax;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.ao */
/* compiled from: PG */
public final class C117114ao extends C22939d {

    /* renamed from: a */
    public final Context f325132a;

    /* renamed from: b */
    public final Rect f325133b;

    /* renamed from: c */
    public final LayoutInflater f325134c;

    /* renamed from: d */
    public final C117113an f325135d;

    /* renamed from: e */
    public PopupWindow f325136e;

    /* renamed from: f */
    public Dialog f325137f;

    /* renamed from: g */
    private final C117093e f325138g;

    public C117114ao(C22945j jVar, C117093e eVar, Context context, C58833ax axVar) {
        super(jVar);
        this.f325138g = eVar;
        this.f325132a = context;
        Rect sourceBounds = ((Activity) axVar.mo56107c()).getIntent().getSourceBounds();
        this.f325133b = sourceBounds;
        LayoutInflater from = LayoutInflater.from(context);
        this.f325134c = from;
        this.f325135d = new C117113an(context, from);
        int i = sourceBounds.left;
        int i2 = sourceBounds.top;
        int i3 = sourceBounds.right;
        int i4 = sourceBounds.bottom;
    }

    /* renamed from: e */
    public final void mo103148e() {
        this.f63126Q.mo28345s("DISMISS", "DISMISS", new Bundle());
    }

    /* renamed from: im */
    public final void mo28298im() {
        PopupWindow popupWindow = this.f325136e;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener((PopupWindow.OnDismissListener) null);
            this.f325136e.dismiss();
        }
        Dialog dialog = this.f325137f;
        if (dialog != null) {
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f325137f.dismiss();
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        mo28295iC((FrameLayout) this.f325134c.inflate(R.layout.customization_menu_overlay, (ViewGroup) null, false));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        boolean booleanValue = ((Boolean) ((C117131be) this.f325138g).f325170a.f63720e).booleanValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(C117112am.CUSTOMIZE);
        if (booleanValue) {
            arrayList.add(C117112am.RESET_TO_DEFAULT_STYLE);
        }
        arrayList.add(C117112am.SEND_FEEDBACK);
        C117113an anVar = this.f325135d;
        anVar.f325129a.clear();
        anVar.f325129a.addAll(arrayList);
        anVar.notifyDataSetChanged();
        View findViewById = mo28297il().findViewById(R.id.menu_anchor_point);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C117111al(this, findViewById));
        int i = this.f325133b.left;
        int i2 = this.f325133b.right;
        int i3 = this.f325132a.getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelOffset = this.f325132a.getResources().getDimensionPixelOffset(R.dimen.more_icon_margin_right);
        if (!C91115n.m148876h(mo28297il())) {
            i = i3 - i2;
        }
        int i4 = i + dimensionPixelOffset;
        int i5 = this.f325133b.top;
        int identifier = this.f325132a.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? this.f325132a.getResources().getDimensionPixelSize(identifier) : 0;
        View findViewById2 = mo28297il().findViewById(R.id.menu_anchor_point);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams.setMarginEnd(i4);
        layoutParams.topMargin = i5 - dimensionPixelSize;
        findViewById2.setLayoutParams(layoutParams);
    }
}
