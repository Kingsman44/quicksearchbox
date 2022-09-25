package com.google.apps.tiktok.p3674l.p3679c;

import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.apps.tiktok.l.c.a */
/* compiled from: PG */
public final class C47387a {
    /* renamed from: a */
    public static void m84224a(C0260w wVar) {
        View view;
        m84225b(wVar);
        View a = C47393f.m84230a(wVar);
        Fragment parentFragment = wVar.getParentFragment();
        if (parentFragment == null) {
            view = wVar.getActivity().findViewById(16908290);
        } else if (parentFragment instanceof C0260w) {
            view = C47393f.m84230a((C0260w) parentFragment);
        } else {
            view = parentFragment.getView();
        }
        a.getClass();
        a.setTag(R.id.tiktok_event_parent, view);
    }

    /* renamed from: b */
    public static void m84225b(C0260w wVar) {
        if (wVar.getShowsDialog() && C47393f.m84230a(wVar) == null) {
            throw new IllegalStateException("DialogFragment is being used as a dialog. Must return a valid view in onCreateView() or a valid Dialog in onCreateDialog().");
        } else if (!wVar.getShowsDialog() && wVar.getView() == null) {
            throw new IllegalStateException("DialogFragment not being used as a dialog. Must return a valid view in onCreateView() -- onCreateDialog() is not called.");
        }
    }
}
