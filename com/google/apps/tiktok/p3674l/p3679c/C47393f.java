package com.google.apps.tiktok.p3674l.p3679c;

import android.app.Activity;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewParent;
import androidx.p060c.C0977g;
import androidx.p060c.C0984n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import java.util.Locale;

/* renamed from: com.google.apps.tiktok.l.c.f */
/* compiled from: PG */
public final class C47393f {
    /* renamed from: a */
    public static View m84230a(C0260w wVar) {
        if (wVar.getView() != null) {
            return wVar.getView();
        }
        if (wVar.getDialog() != null) {
            return wVar.getDialog().findViewById(16908290);
        }
        return null;
    }

    /* renamed from: b */
    public static void m84231b(Activity activity, Class cls, C47391d dVar) {
        View findViewById = activity.findViewById(16908290);
        C58838bb.m90866a(findViewById, "Activity must have a content view to add a listener!");
        m84241l(R.id.tiktok_event_activity_listeners, findViewById, cls, dVar);
    }

    /* renamed from: c */
    public static void m84232c(C0260w wVar, Class cls, C47391d dVar) {
        View a = m84230a(wVar);
        C58838bb.m90866a(a, "DialogFragment must have content or dialog view to add a listener!");
        m84241l(R.id.tiktok_event_fragment_listeners, a, cls, dVar);
    }

    /* renamed from: d */
    public static void m84233d(Fragment fragment, Class cls, C47391d dVar) {
        View view = fragment.getView();
        C58838bb.m90866a(view, "Fragment must have a content view to add a listener!");
        m84241l(R.id.tiktok_event_fragment_listeners, view, cls, dVar);
    }

    /* renamed from: f */
    public static void m84235f(C47388b bVar, C0260w wVar) {
        View a = m84230a(wVar);
        C58838bb.m90866a(a, "DialogFragment must have content or dialog view to send an event!");
        m84238i(R.id.tiktok_event_fragment_listeners, bVar, a);
    }

    /* renamed from: g */
    public static void m84236g(C47388b bVar, Fragment fragment) {
        View view = fragment.getView();
        C58838bb.m90866a(view, "Fragment must have content view to send an event!");
        m84238i(R.id.tiktok_event_fragment_listeners, bVar, view);
    }

    /* renamed from: i */
    public static void m84238i(int i, C47388b bVar, View view) {
        C19559g.m37304c();
        C58833ax k = C58833ax.m90834k(bVar);
        View view2 = view;
        while (view2 != null) {
            if (view2 != view || i == R.id.tiktok_event_view_listeners) {
                k = m84240k(R.id.tiktok_event_view_listeners, view2, k);
            }
            if (!(view2 == view && i == R.id.tiktok_event_activity_listeners)) {
                k = m84240k(R.id.tiktok_event_fragment_listeners, view2, k);
            }
            k = m84240k(R.id.tiktok_event_activity_listeners, view2, k);
            if (k.mo56113h()) {
                Object tag = view2.getTag(R.id.tiktok_event_parent);
                if (tag == null || (tag instanceof View)) {
                    View view3 = (View) tag;
                    if (view3 != null) {
                        view2 = view3;
                    } else {
                        view2 = m84239j(view2.getParent());
                    }
                } else {
                    String valueOf = String.valueOf(tag.getClass());
                    String obj = tag.toString();
                    String obj2 = view2.toString();
                    throw new IllegalStateException("Invalid tag returned: " + valueOf + obj + " for view " + obj2);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    private static View m84239j(ViewParent viewParent) {
        if (viewParent instanceof View) {
            return (View) viewParent;
        }
        if (viewParent != null) {
            return m84239j(viewParent.getParent());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.base.C58833ax m84240k(int r4, android.view.View r5, com.google.common.base.C58833ax r6) {
        /*
            boolean r0 = r6.mo56113h()
            if (r0 != 0) goto L_0x0007
            return r6
        L_0x0007:
            java.lang.Object r0 = r6.mo56107c()
            com.google.apps.tiktok.l.c.b r0 = (com.google.apps.tiktok.p3674l.p3679c.C47388b) r0
            java.lang.Object r4 = r5.getTag(r4)
            androidx.c.n r4 = (androidx.p060c.C0984n) r4
            if (r4 == 0) goto L_0x0041
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0041
            java.lang.Class r5 = r0.getClass()
            r1 = 0
        L_0x0020:
            int r2 = r4.f3122d
            if (r1 >= r2) goto L_0x0041
            java.lang.Object r2 = r4.mo3702e(r1)
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r3 = r4.mo3708h(r1)
            com.google.apps.tiktok.l.c.d r3 = (com.google.apps.tiktok.p3674l.p3679c.C47391d) r3
            boolean r2 = r2.isAssignableFrom(r5)
            if (r2 == 0) goto L_0x003e
            com.google.apps.tiktok.l.c.e r4 = r3.mo18069a(r0)
            r4.getClass()
            goto L_0x0043
        L_0x003e:
            int r1 = r1 + 1
            goto L_0x0020
        L_0x0041:
            com.google.apps.tiktok.l.c.e r4 = com.google.apps.tiktok.p3674l.p3679c.C47392e.f123116b
        L_0x0043:
            com.google.apps.tiktok.l.c.e r5 = com.google.apps.tiktok.p3674l.p3679c.C47392e.f123115a
            if (r4 != r5) goto L_0x004a
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            return r4
        L_0x004a:
            com.google.apps.tiktok.l.c.e r5 = com.google.apps.tiktok.p3674l.p3679c.C47392e.f123116b
            if (r4 != r5) goto L_0x004f
            return r6
        L_0x004f:
            com.google.apps.tiktok.l.c.b r4 = r4.f123117c
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.p3674l.p3679c.C47393f.m84240k(int, android.view.View, com.google.common.base.ax):com.google.common.base.ax");
    }

    /* renamed from: l */
    private static void m84241l(int i, View view, Class cls, C47391d dVar) {
        C19559g.m37304c();
        C0984n nVar = (C0984n) view.getTag(i);
        if (nVar == null) {
            nVar = new C0977g();
            view.setTag(i, nVar);
        }
        int i2 = 0;
        while (i2 < nVar.f3122d) {
            Class cls2 = (Class) nVar.mo3702e(i2);
            if (cls.equals(cls2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Class %s is already registered as a listener.  Are you adding the same View instance twice?", new Object[]{cls.getSimpleName()}));
            } else if (cls.isAssignableFrom(cls2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a subtype: %s", new Object[]{cls.getSimpleName(), cls2.getSimpleName()}));
            } else if (!cls2.isAssignableFrom(cls)) {
                i2++;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a supertype: %s", new Object[]{cls.getSimpleName(), cls2.getSimpleName()}));
            }
        }
        nVar.put(cls, dVar);
    }

    /* renamed from: e */
    public static void m84234e(View view, Class cls, C47391d dVar) {
        view.getClass();
        m84241l(R.id.tiktok_event_view_listeners, view, cls, dVar);
    }

    /* renamed from: h */
    public static void m84237h(C47388b bVar, View view) {
        view.getClass();
        m84238i(R.id.tiktok_event_view_listeners, bVar, view);
    }
}
