package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d;

import androidx.core.p094f.C1897j;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.d.j */
/* compiled from: PG */
public final class C127290j {
    /* renamed from: a */
    public static final boolean m208210a(C127285e eVar) {
        C69664n.m101061g(eVar, "<this>");
        C119851cs csVar = eVar.f350554b;
        if (csVar == null) {
            csVar = C119851cs.f333803i;
        }
        return csVar.f333806b == 2;
    }

    /* renamed from: b */
    public static final Locale m208211b(C1897j jVar) {
        Locale locale = jVar.f5774b.f5775a.get(0);
        if (locale != null) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        C69664n.m101060f(locale2, "getDefault()");
        return locale2;
    }
}
