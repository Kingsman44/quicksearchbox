package com.google.android.libraries.search.assistant.proactive;

import com.google.assistant.p3803ag.p3809c.C49067ff;
import com.google.assistant.p3861at.C49927ed;
import com.google.assistant.p3861at.C49932ei;
import com.google.assistant.p3861at.C49935el;
import com.google.assistant.p3861at.C49937en;
import com.google.common.base.C58817ah;
import com.google.protos.p4985f.p5036r.C65319e;
import com.google.protos.p4985f.p5036r.C65321g;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.assistant.proactive.t */
/* compiled from: PG */
public final /* synthetic */ class C36366t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36371y f94970a;

    public /* synthetic */ C36366t(C36371y yVar) {
        this.f94970a = yVar;
    }

    public final Object apply(Object obj) {
        C36371y yVar = this.f94970a;
        C36333n nVar = new C36333n();
        Iterator it = ((C49067ff) obj).f126919a.iterator();
        loop0:
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C49927ed edVar = (C49927ed) it.next();
            Iterator it2 = edVar.f129775b.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C49937en enVar = (C49937en) it2.next();
                    int a = C65319e.m96667a(enVar.f129797a);
                    int i = 1;
                    if (a == 0) {
                        a = 1;
                    }
                    String n = C36371y.m64893n(a - 1);
                    C49935el elVar = enVar.f129800d;
                    if (elVar == null) {
                        elVar = C49935el.f129789e;
                    }
                    int a2 = C49932ei.m85771a(elVar.f129793c);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int j = yVar.mo40123j(new C36334o(n, "assistant_notification_channels", C36336q.m64827a(a2)));
                    if (j == 2) {
                        nVar.f94884a = true;
                        break loop0;
                    } else if (j == 3) {
                        Set set = nVar.f94885b;
                        int a3 = C65321g.m96668a(edVar.f129774a);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        set.add(Integer.valueOf(a3 - 1));
                        Set set2 = nVar.f94886c;
                        int a4 = C65319e.m96667a(enVar.f129797a);
                        if (a4 != 0) {
                            i = a4;
                        }
                        set2.add(Integer.valueOf(i - 1));
                    } else if (j == 4) {
                        Set set3 = nVar.f94886c;
                        int a5 = C65319e.m96667a(enVar.f129797a);
                        if (a5 != 0) {
                            i = a5;
                        }
                        set3.add(Integer.valueOf(i - 1));
                    }
                }
            }
        }
        return nVar;
    }
}
