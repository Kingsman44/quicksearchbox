package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.android.apps.gsa.shared.util.p7158b.C90745b;
import com.google.common.p4552o.C59827gt;
import com.google.common.p4552o.C59860hx;
import com.google.protobuf.MessageLite;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.f */
/* compiled from: PG */
public final class C90970f extends C90983s {
    public C90970f(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: b */
    private static final String m148586b(long j) {
        return j >= 0 ? Long.toString(j) : "-";
    }

    /* renamed from: c */
    private final void m148587c(String str, boolean z, List list) {
        String str2;
        String str3;
        String str4;
        if (!list.isEmpty()) {
            this.f254188a.mo85258b(str);
            this.f254188a.mo85261e();
            this.f254188a.mo85257a(true != z ? "scheduled             queue     exec (times in milliseconds)" : "scheduled             delay    queue     exec (times in milliseconds)");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C59860hx hxVar = (C59860hx) it.next();
                if (hxVar.f161779g) {
                    str2 = "Task is periodic  ";
                } else {
                    str2 = C90745b.m148220a(new Date(hxVar.f161774b));
                }
                if (hxVar.f161779g) {
                    str3 = "repeat";
                } else {
                    str3 = m148586b(hxVar.f161776d);
                }
                if (hxVar.f161780h) {
                    str4 = "cancel";
                } else {
                    str4 = m148586b(hxVar.f161777e);
                }
                if (z) {
                    C90974j jVar = this.f254188a;
                    Object[] objArr = new Object[5];
                    objArr[0] = str2;
                    objArr[1] = (hxVar.f161773a & 2) != 0 ? Long.toString(hxVar.f161775c) : "-";
                    objArr[2] = str3;
                    objArr[3] = str4;
                    objArr[4] = hxVar.f161778f;
                    jVar.mo85257a(String.format("%18s:%8s,%8s,%8s,%s", objArr));
                } else {
                    this.f254188a.mo85257a(String.format("%18s:%8s,%8s,%s", new Object[]{str2, str3, str4, hxVar.f161778f}));
                }
            }
            this.f254188a.mo85260d();
            return;
        }
        this.f254188a.mo85259c(str, "None");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        String str;
        C59827gt gtVar = (C59827gt) messageLite;
        if (gtVar != null) {
            this.f254188a.mo85258b(gtVar.f161663b);
            this.f254188a.mo85261e();
            if ((gtVar.f161662a & 32) != 0) {
                this.f254188a.mo85259c("Backed by", gtVar.f161671j);
            }
            if ((gtVar.f161662a & 2) != 0) {
                this.f254188a.mo85259c("Current Threads", Integer.toString(gtVar.f161664c));
            }
            if ((gtVar.f161662a & 4) != 0) {
                C90974j jVar = this.f254188a;
                int i = gtVar.f161665d;
                if (i == Integer.MAX_VALUE) {
                    str = "unbounded";
                } else {
                    str = Integer.toString(i);
                }
                jVar.mo85259c("Max Threads", str);
            }
            if ((gtVar.f161662a & 8) != 0) {
                this.f254188a.mo85259c("Highest Task Count", Integer.toString(gtVar.f161669h));
            }
            if (!(gtVar.f161672k && gtVar.f161666e.size() == 0 && gtVar.f161667f.size() == 0 && gtVar.f161668g.size() == 0)) {
                m148587c("Executing Tasks", gtVar.f161670i, gtVar.f161666e);
                m148587c("Queued Tasks", gtVar.f161670i, gtVar.f161667f);
                m148587c("Finished Tasks", gtVar.f161670i, gtVar.f161668g);
            }
            this.f254188a.mo85260d();
        }
    }
}
