package com.google.android.apps.gsa.staticplugins.recently.p8685h;

import com.google.android.apps.gsa.staticplugins.recently.timeline.Group;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.apps.gsa.staticplugins.recently.view.timeline.TimelineView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22845p;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.h.d */
/* compiled from: PG */
public final class C116097d {

    /* renamed from: a */
    public final TimelineView f321926a;

    /* renamed from: b */
    public final String f321927b;

    /* renamed from: c */
    private final boolean f321928c;

    public C116097d(TimelineView timelineView, int i, int i2, String str, int i3) {
        this.f321926a = timelineView;
        timelineView.f322313c = R.layout.timelabel;
        timelineView.f322311a.setColor(i3);
        timelineView.f322314d = i;
        timelineView.f322315e = i2;
        this.f321927b = str;
        this.f321928c = timelineView.getResources().getConfiguration().getLayoutDirection() != 1 ? false : true;
    }

    /* renamed from: b */
    public static final boolean m192508b(Timeline timeline, int i) {
        Group[] groupArr = timeline.f322178a;
        if (i >= groupArr.length) {
            return false;
        }
        C22845p pVar = groupArr[i].f322177h[0];
        int a = C22840k.m42693a(pVar.f62894c);
        if (a == 0) {
            a = 1;
        }
        if (a == 9 || a == 14 || pVar.f62905n) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo102487a(C116226r rVar) {
        boolean z = this.f321928c;
        int e = rVar.mo102614e();
        return z ? -e : e;
    }
}
