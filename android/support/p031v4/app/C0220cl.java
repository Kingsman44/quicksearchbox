package android.support.p031v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p094f.C1893f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.cl */
/* compiled from: PG */
final class C0220cl extends C0222cn {
    /* renamed from: t */
    private static boolean m505t(Transition transition) {
        return !m524r(transition.getTargetIds()) || !m524r(transition.getTargetNames()) || !m524r(transition.getTargetTypes());
    }

    /* renamed from: a */
    public final Object mo709a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public final Object mo710b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: c */
    public final Object mo711c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: d */
    public final void mo712d(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    /* renamed from: e */
    public final void mo713e(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo713e(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m505t(transition) && m524r(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo714f(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: g */
    public final void mo715g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo715g(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m505t(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget((View) arrayList2.get(i2));
                i2++;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    transition.removeTarget((View) arrayList.get(size));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo716h(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C0216ch(view, arrayList));
    }

    /* renamed from: i */
    public final void mo717i(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C0219ck(rect));
    }

    /* renamed from: j */
    public final void mo718j(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m525s(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0215cg(rect));
        }
    }

    /* renamed from: k */
    public final void mo719k(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m523q(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo713e(transitionSet, arrayList);
    }

    /* renamed from: l */
    public final void mo720l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo715g(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: m */
    public final boolean mo721m(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: n */
    public final Object mo722n(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    /* renamed from: o */
    public final void mo723o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C0217ci(this, obj2, arrayList, obj3, arrayList2));
    }

    /* renamed from: p */
    public final void mo724p(Object obj, C1893f fVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0218cj(runnable));
    }
}
