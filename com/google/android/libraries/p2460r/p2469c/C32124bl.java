package com.google.android.libraries.p2460r.p2469c;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32058a;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57499g;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57501i;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57503k;
import java.util.Set;

/* renamed from: com.google.android.libraries.r.c.bl */
/* compiled from: PG */
public final class C32124bl {
    /* renamed from: a */
    static Drawable m59842a(Drawable drawable, Integer num) {
        if (num == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        return mutate;
    }

    /* renamed from: b */
    static void m59843b(View view) {
        if (view.hasOnClickListeners()) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        view.setClickable(false);
    }

    /* renamed from: c */
    static void m59844c(View view) {
        view.setOnLongClickListener((View.OnLongClickListener) null);
        view.setLongClickable(false);
    }

    /* renamed from: d */
    public static void m59845d(View view, View view2, C57501i iVar, C32058a aVar, C57438di diVar, Set set) {
        if (iVar.f153598d.size() != 0 || iVar.f153599e.size() != 0) {
            if (view.getVisibility() != 0 || !C2043bi.m5569aw(view)) {
                m59847f(view, iVar, aVar, diVar, set);
                return;
            }
            Rect g = m59848g(view);
            Rect g2 = m59848g(view2);
            if (g2.intersect(g)) {
                float height = ((float) (g2.height() * g2.width())) / ((float) (g.height() * g.width()));
                for (C57503k kVar : iVar.f153598d) {
                    if (height < kVar.f153603a) {
                        set.remove(kVar);
                    } else if (set.add(kVar)) {
                        C57499g gVar = kVar.f153604b;
                        if (gVar == null) {
                            gVar = C57499g.f153590a;
                        }
                        aVar.mo37841a(gVar, 0, diVar, view, C57418cp.f153391a);
                    }
                }
                for (C57503k kVar2 : iVar.f153599e) {
                    if (height >= kVar2.f153603a) {
                        set.remove(kVar2);
                    } else if (set.add(kVar2)) {
                        C57499g gVar2 = kVar2.f153604b;
                        if (gVar2 == null) {
                            gVar2 = C57499g.f153590a;
                        }
                        aVar.mo37841a(gVar2, 0, diVar, view, C57418cp.f153391a);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    static void m59847f(View view, C57501i iVar, C32058a aVar, C57438di diVar, Set set) {
        set.removeAll(iVar.f153598d);
        for (C57503k kVar : iVar.f153599e) {
            if (set.add(kVar)) {
                C57499g gVar = kVar.f153604b;
                if (gVar == null) {
                    gVar = C57499g.f153590a;
                }
                aVar.mo37841a(gVar, 0, diVar, view, C57418cp.f153391a);
            }
        }
    }

    /* renamed from: g */
    private static Rect m59848g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    /* renamed from: e */
    static void m59846e(C57501i iVar, View view, C32148z zVar, C57418cp cpVar) {
        C32058a aVar = zVar.f86338e;
        if ((iVar.f153595a & 2) != 0) {
            view.setOnLongClickListener(new C32122bj(aVar, iVar, zVar, view, cpVar));
        } else {
            m59844c(view);
        }
        if ((iVar.f153595a & 1) != 0) {
            view.setOnClickListener(new C32123bk(aVar, iVar, zVar, view, cpVar));
        } else {
            m59843b(view);
        }
        int i = iVar.f153595a;
        if ((i & 1) == 0 && (i & 2) == 0) {
            view.setForeground((Drawable) null);
        } else {
            view.setForeground(view.getContext().getDrawable(R.drawable.piet_clickable_ripple));
        }
    }
}
