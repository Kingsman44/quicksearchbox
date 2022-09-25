package com.google.android.libraries.assistant.pcp.datastore.p1549b.p1552c;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1575l.p1577b.C18955d;
import com.google.android.libraries.assistant.pcp.p1575l.p1577b.C18956e;
import com.google.android.libraries.assistant.pcp.p1578m.C18977g;
import com.google.android.libraries.assistant.pcp.p1578m.C18979i;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.base.C58817ah;
import com.google.common.p4580v.C60944c;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import java.util.Collections;
import java.util.Set;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.b.c.a */
/* compiled from: PG */
public final /* synthetic */ class C18606a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18608c f52628a;

    /* renamed from: b */
    public final /* synthetic */ Set f52629b;

    /* renamed from: c */
    public final /* synthetic */ C63042fg f52630c;

    public /* synthetic */ C18606a(C18608c cVar, Set set, C63042fg fgVar) {
        this.f52628a = cVar;
        this.f52629b = set;
        this.f52630c = fgVar;
    }

    public final Object apply(Object obj) {
        C18608c cVar = this.f52628a;
        Set<C18579g> set = this.f52629b;
        C63042fg fgVar = this.f52630c;
        C18979i iVar = (C18979i) obj;
        C18977g gVar = (C18977g) iVar.toBuilder();
        for (C18579g gVar2 : set) {
            C63042fg fgVar2 = (C63042fg) Collections.unmodifiableMap(iVar.f53319a).get(Integer.valueOf(gVar2.mo24070a()));
            if (fgVar2 != null) {
                C18956e eVar = cVar.f52633b;
                Duration d = C62950b.m95473d(C62953e.m95480e(fgVar2, fgVar));
                if (d.compareTo(C18956e.f53277a) >= 0) {
                    C18955d dVar = eVar.f53278b;
                    ((C19569f) dVar.f53275c.mo6453a()).mo24824b(C60944c.m93088a(d), gVar2.mo24074d(), eVar.f53279c.name());
                }
            }
            int a = gVar2.mo24070a();
            fgVar.getClass();
            gVar.copyOnWrite();
            C18979i iVar2 = (C18979i) gVar.instance;
            C62995dn dnVar = iVar2.f53319a;
            if (!dnVar.f170058b) {
                iVar2.f53319a = dnVar.mo58980a();
            }
            iVar2.f53319a.put(Integer.valueOf(a), fgVar);
        }
        return (C18979i) gVar.build();
    }
}
