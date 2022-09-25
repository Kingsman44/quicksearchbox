package com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.b.d */
/* compiled from: PG */
final class C137102d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C137105g f373080a;

    public C137102d(C137105g gVar) {
        this.f373080a = gVar;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C137105g gVar = this.f373080a;
        View view = gVar.f373089d;
        View view2 = gVar.f373088c;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect a = C137105g.m222808a(view.findViewById(R.id.googleapp_tooltip_close));
        Rect rect = new Rect((int) view.getX(), (int) view.getY(), ((int) view.getX()) + view.getWidth(), ((int) view.getY()) + view.getHeight());
        Rect a2 = C137105g.m222808a(view2);
        boolean contains = a.contains(x, y);
        boolean contains2 = rect.contains(x, y);
        boolean contains3 = a2.contains(x, y);
        if (contains) {
            ((C59052c) ((C59052c) C137105g.f373086a.mo56224b()).mo56372aa(40930)).mo56386p("Click close button");
            View.OnClickListener onClickListener = gVar.f373091f;
            if (onClickListener != null) {
                onClickListener.onClick(view2);
            }
        } else if (contains3) {
            ((C59052c) ((C59052c) C137105g.f373086a.mo56224b()).mo56372aa(40929)).mo56386p("Click inside anchor view");
            View.OnClickListener onClickListener2 = gVar.f373092g;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view2);
            }
        }
        C47538ax c = gVar.f373087b.mo51613c("Tooltip background clicked");
        if (!contains2 || contains) {
            try {
                gVar.mo113524b();
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        if (c != null) {
            c.close();
        }
        return contains2;
        throw th;
    }
}
