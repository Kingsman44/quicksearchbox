package com.google.android.apps.gsa.shared.util.debug.p7163a;

import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58902l;
import com.google.common.p4522b.C58691ok;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58797si;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.m */
/* compiled from: PG */
public final class C91013m implements C90991b {

    /* renamed from: a */
    private static final Pattern f254250a = Pattern.compile("^(.*?)\\[\\d+\\]$");

    /* renamed from: b */
    private static final Pattern f254251b = Pattern.compile("^(.*?)[ #\\-]*\\d+$");

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        Thread thread;
        int activeCount = Thread.activeCount() + 5;
        Thread[] threadArr = new Thread[activeCount];
        Thread.enumerate(threadArr);
        C58797si siVar = new C58797si(C58701ou.f156429a);
        int i = 0;
        while (i < activeCount && (thread = threadArr[i]) != null) {
            String name = thread.getName();
            if (name == null) {
                name = "<null>";
            } else if (name.isEmpty()) {
                name = "<empty>";
            } else if (!new C58902l('0', '9').mo56188g(name)) {
                Matcher matcher = f254251b.matcher(name);
                if (matcher.matches()) {
                    name = matcher.group(1);
                } else {
                    Matcher matcher2 = f254250a.matcher(name);
                    if (matcher2.matches()) {
                        name = matcher2.group(1);
                    }
                }
            }
            siVar.mo54931lF(name, 1);
            i++;
        }
        for (C58691ok okVar : siVar.mo54975m()) {
            if (okVar.mo55767a() > 1) {
                int a = okVar.mo55767a();
                fVar.mo85292s(C90752i.m148229c(((String) okVar.mo55768b()) + " [" + a + "]"));
            } else if (okVar.mo55767a() == 1) {
                fVar.mo85292s(C90752i.m148229c((CharSequence) okVar.mo55768b()));
            }
        }
    }
}
