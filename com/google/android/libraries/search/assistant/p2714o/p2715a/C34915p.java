package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.content.ComponentName;
import com.google.android.libraries.search.assistant.p2714o.C34918d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.o.a.p */
/* compiled from: PG */
final class C34915p {

    /* renamed from: a */
    private static final C58528ij f92574a = C58528ij.m90011K("com.google.android.apps.gsa.nga.engine.education.ui.GlowQuerySuggestionActivity", "com.google.android.apps.gsa.staticplugins.deeplink.activity.DeeplinkActivity");

    /* renamed from: b */
    private static final C58528ij f92575b = C58528ij.m90011K("com.google.android.apps.gsa.staticplugins.opa.OpaActivity", "com.google.android.apps.gsa.nga.engine.ui.answer.AnswerUiActivity");

    /* renamed from: a */
    static ComponentName m63772a(C58485gu guVar) {
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C34914o.f92573a).collect(C58370cn.f155946a);
        int size = guVar2.size();
        int i = 0;
        while (i < size) {
            ComponentName componentName = (ComponentName) guVar2.get(i);
            i++;
            if (!m63773b(componentName)) {
                return componentName;
            }
        }
        throw new C34918d();
    }

    /* renamed from: b */
    static boolean m63773b(ComponentName componentName) {
        return f92574a.contains(componentName.getClassName()) || f92575b.contains(componentName.getClassName());
    }
}
