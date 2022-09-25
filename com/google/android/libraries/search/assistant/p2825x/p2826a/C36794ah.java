package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34675b;
import com.google.speech.p5218j.C66942fe;
import com.google.speech.p5218j.C66948fk;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.x.a.ah */
/* compiled from: PG */
public final class C36794ah {
    /* renamed from: a */
    public static final String m65481a(List list) {
        C69664n.m101061g(list, "qpList");
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C34675b bVar = (C34675b) it.next();
            C66948fk a = C66948fk.m97389a(bVar.f92067b);
            if (a == null) {
                a = C66948fk.QP_UNKNOWN;
            }
            int i = a.f181990o;
            C66942fe a2 = C66942fe.m97387a(bVar.f92068c);
            if (a2 == null) {
                a2 = C66942fe.CONFIG_ERROR_UNKNOWN;
            }
            int i2 = a2.f181962g;
            sb.append(" (" + i + " error: " + i2 + ")");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m65482b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = ((C66948fk) it.next()).f181990o;
            sb.append(" " + i);
        }
        return sb.toString();
    }
}
