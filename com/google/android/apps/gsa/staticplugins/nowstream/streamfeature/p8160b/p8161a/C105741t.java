package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.support.p033v7.widget.C0653fo;
import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23296l;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.t */
/* compiled from: PG */
public final class C105741t {

    /* renamed from: a */
    public final C23296l f295101a;

    /* renamed from: b */
    public final C91820a f295102b;

    /* renamed from: c */
    public final Map f295103c = new HashMap();

    /* renamed from: d */
    public C105738q f295104d;

    public C105741t(C23296l lVar, C91820a aVar) {
        this.f295101a = lVar;
        this.f295102b = aVar;
    }

    /* renamed from: a */
    public final long mo95027a(C0653fo foVar, int i, int i2) {
        Long a;
        int paddingTop = foVar.getPaddingTop();
        int height = foVar.getHeight() - foVar.getPaddingBottom();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = foVar.getChildAt(i);
            childAt.getClass();
            C105740s sVar = (C105740s) this.f295103c.get(childAt);
            if (!(sVar == null || (a = sVar.mo95023a()) == null)) {
                int decoratedTop = foVar.getDecoratedTop(childAt);
                int decoratedBottom = foVar.getDecoratedBottom(childAt);
                if (decoratedTop < height && decoratedBottom > paddingTop) {
                    return a.longValue();
                }
            }
            i += i3;
        }
        return 0;
    }
}
