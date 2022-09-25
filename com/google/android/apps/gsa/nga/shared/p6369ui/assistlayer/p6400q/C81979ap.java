package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.content.Context;
import android.support.constraint.C0129a;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81826s;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ap */
/* compiled from: PG */
public final class C81979ap {

    /* renamed from: a */
    public final int f224126a;

    public C81979ap(Context context) {
        this.f224126a = context.getResources().getDimensionPixelOffset(R.dimen.nga_assist_ui_input_plate_max_width);
    }

    /* renamed from: b */
    public static final void m130226b(View view, C81978ao aoVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0129a) {
            C0129a aVar = (C0129a) layoutParams;
            if (aoVar.mo75413c()) {
                C81826s b = aoVar.mo75412b();
                if (aVar.leftMargin != b.mo75359a().left || aVar.rightMargin != b.mo75359a().right) {
                    aVar.leftMargin = b.mo75359a().left;
                    aVar.rightMargin = b.mo75359a().right;
                    view.requestLayout();
                }
            } else if (aVar.leftMargin != 0 || aVar.rightMargin != 0) {
                aVar.leftMargin = 0;
                aVar.rightMargin = 0;
                view.requestLayout();
            }
        }
    }

    /* renamed from: a */
    public final void mo75425a(View view, C81978ao aoVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0129a) {
            C0129a aVar = (C0129a) layoutParams;
            if (aoVar.mo75413c()) {
                C81826s b = aoVar.mo75412b();
                if (aVar.f351I != this.f224126a || aVar.leftMargin != b.mo75359a().left || aVar.rightMargin != b.mo75359a().right) {
                    aVar.f351I = this.f224126a;
                    aVar.leftMargin = b.mo75359a().left;
                    aVar.rightMargin = b.mo75359a().right;
                    view.requestLayout();
                    return;
                }
                return;
            }
            C81826s b2 = aoVar.mo75412b();
            if (aVar.f351I != 0 || aVar.leftMargin != b2.mo75359a().left || aVar.rightMargin != b2.mo75359a().right) {
                aVar.f351I = 0;
                aVar.leftMargin = b2.mo75359a().left;
                aVar.rightMargin = b2.mo75359a().right;
                view.requestLayout();
            }
        }
    }
}
