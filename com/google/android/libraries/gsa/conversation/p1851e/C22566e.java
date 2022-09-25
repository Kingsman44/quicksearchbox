package com.google.android.libraries.gsa.conversation.p1851e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.conversation.p1838b.C22348b;
import com.google.android.libraries.gsa.conversation.p1838b.C22350d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4536h.C59233a;
import com.google.common.p4536h.C59234aa;
import com.google.common.p4536h.C59262s;
import com.google.common.p4536h.C59265v;
import java.util.LinkedList;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.e.e */
/* compiled from: PG */
public final class C22566e implements C22348b {

    /* renamed from: a */
    public final C69464a f62200a;

    /* renamed from: b */
    private final LinkedList f62201b = new LinkedList();

    public C22566e(C69464a aVar) {
        this.f62200a = aVar;
    }

    /* renamed from: a */
    public final void mo27576a(C22350d dVar) {
        C58485gu j;
        synchronized (this.f62201b) {
            j = C58485gu.m89842j(this.f62201b);
        }
        StringBuilder sb = new StringBuilder();
        int size = j.size();
        int i = 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i + 1;
            C59234aa aaVar = ((C22571j) j.get(i2)).f62205a.f62197a;
            StringBuilder sb2 = new StringBuilder("digraph ");
            sb2.append("Conversation" + i);
            sb2.append(" {\n");
            for (C22564c cVar : aaVar.mo56699c()) {
                sb2.append("  node");
                sb2.append(cVar.mo27651b());
                sb2.append(" [label=\"");
                sb2.append(C22563b.m42015a(cVar.mo27650a().toString()));
                sb2.append("\"]\n");
            }
            C59265v b = C59265v.m92012b(new C59233a(aaVar).f157342a);
            while (b.hasNext()) {
                C59262s sVar = (C59262s) b.next();
                String obj = aaVar.mo56703h((C22564c) sVar.mo56723a(), (C22564c) sVar.mo56724b()).toString();
                String b2 = ((C22564c) sVar.mo56724b()).mo27651b();
                String b3 = ((C22564c) sVar.mo56723a()).mo27651b();
                sb2.append("  ");
                sb2.append("node".concat(String.valueOf(b3)));
                sb2.append(" -> ");
                sb2.append("node".concat(String.valueOf(b2)));
                sb2.append(" [label=\"");
                sb2.append(C22563b.m42015a(obj));
                sb2.append("\"]\n");
            }
            sb2.append("}\n");
            sb.append(sb2.toString());
            sb.append(10);
            i2++;
            i = i3;
        }
        dVar.mo27580c("Last " + j.size() + " conversations");
        dVar.mo27579b(BuildConfig.FLAVOR, sb.toString());
    }

    /* renamed from: b */
    public final C22571j mo27656b() {
        C22571j a = C22572k.m42029a();
        synchronized (this.f62201b) {
            this.f62201b.add(a);
            while (this.f62201b.size() > 10) {
                this.f62201b.pop();
            }
        }
        return a;
    }
}
