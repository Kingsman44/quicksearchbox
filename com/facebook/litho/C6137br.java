package com.facebook.litho;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.litho.br */
/* compiled from: PG */
final class C6137br {

    /* renamed from: a */
    public final Map f18157a = new HashMap();

    /* renamed from: b */
    public final Map f18158b = new HashMap();

    /* renamed from: c */
    private final Map f18159c = new HashMap();

    /* renamed from: c */
    public static boolean m16186c(C6407q qVar) {
        return qVar.mo13145v() && C6407q.m17270A(qVar);
    }

    /* renamed from: e */
    private final void m16188e(C6138bs bsVar, C6407q qVar) {
        Set set = (Set) this.f18157a.get(bsVar);
        if (set == null) {
            set = new HashSet();
            this.f18157a.put(bsVar, set);
            bsVar.f18161b.add(this);
        }
        set.add(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13116a(C6407q qVar, Object obj) {
        boolean c = m16186c(qVar);
        int length = C6407q.f18982h.length;
        if (c) {
            HashSet hashSet = new HashSet();
            SparseArray g = qVar.mo13144g();
            for (int i = 0; i < g.size(); i++) {
                int keyAt = g.keyAt(i);
                C6138bs bsVar = (C6138bs) g.valueAt(i);
                m16187d(keyAt, bsVar, (View) obj);
                m16188e(bsVar, qVar);
                hashSet.add(bsVar);
            }
            int length2 = C6407q.f18982h.length;
            this.f18159c.put(qVar, hashSet);
            this.f18158b.put(qVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13117b(C6407q qVar, Object obj) {
        if (m16186c(qVar)) {
            this.f18158b.remove(qVar);
            Set<C6138bs> set = (Set) this.f18159c.get(qVar);
            if (set != null) {
                for (C6138bs bsVar : set) {
                    Set set2 = (Set) this.f18157a.get(bsVar);
                    set2.remove(qVar);
                    if (set2.isEmpty()) {
                        this.f18157a.remove(bsVar);
                        bsVar.f18161b.remove(this);
                    }
                }
                if (obj instanceof View) {
                    View view = (View) obj;
                    if (view.getAlpha() != 1.0f) {
                        view.setAlpha(1.0f);
                    }
                    if (view.getTranslationX() != 0.0f) {
                        view.setTranslationX(0.0f);
                    }
                    if (view.getTranslationY() != 0.0f) {
                        view.setTranslationY(0.0f);
                    }
                    if (view.getScaleX() != 1.0f) {
                        view.setScaleX(1.0f);
                    }
                    if (view.getScaleY() != 1.0f) {
                        view.setScaleY(1.0f);
                    }
                    if (view.getElevation() != 0.0f) {
                        view.setElevation(0.0f);
                    }
                    if (view.getBackground() != null) {
                        view.setBackground((Drawable) null);
                    }
                    if (view.getRotation() != 0.0f) {
                        view.setRotation(0.0f);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int length = C6407q.f18982h.length;
    }

    /* renamed from: d */
    public static final void m16187d(int i, C6138bs bsVar, View view) {
        switch (i) {
            case 1:
                view.setAlpha(((Float) bsVar.f18160a).floatValue());
                return;
            case 2:
                view.setTranslationX(((Float) bsVar.f18160a).floatValue());
                return;
            case 3:
                view.setTranslationY(((Float) bsVar.f18160a).floatValue());
                return;
            case 4:
                view.setScaleX(((Float) bsVar.f18160a).floatValue());
                return;
            case 5:
                view.setScaleY(((Float) bsVar.f18160a).floatValue());
                return;
            case 6:
                view.setElevation(((Float) bsVar.f18160a).floatValue());
                return;
            case 7:
                view.setBackgroundColor(((Integer) bsVar.f18160a).intValue());
                return;
            case 8:
                view.setRotation(((Float) bsVar.f18160a).floatValue());
                return;
            case 9:
                view.setBackground((Drawable) bsVar.f18160a);
                return;
            default:
                return;
        }
    }
}
