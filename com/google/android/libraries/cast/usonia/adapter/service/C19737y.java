package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.usonia.directory.C146207a;
import com.google.android.gms.usonia.directory.C146209c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p427am.p438d.p439a.C8785de;
import java.util.HashMap;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.y */
/* compiled from: PG */
final class C19737y implements C71588o {

    /* renamed from: a */
    final /* synthetic */ HashMap f54809a;

    /* renamed from: b */
    final /* synthetic */ C19710ab f54810b;

    /* renamed from: c */
    final /* synthetic */ C71361ao f54811c;

    public C19737y(HashMap hashMap, C71361ao aoVar, C19710ab abVar) {
        this.f54809a = hashMap;
        this.f54811c = aoVar;
        this.f54810b = abVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C8785de deVar = (C8785de) obj;
        for (String str : deVar.f30159a) {
            if (this.f54809a.containsKey(str)) {
                C59052c cVar = (C59052c) C19710ab.f54740a.mo56226d();
                cVar.mo56379ah(new C59094n(47923));
                cVar.mo56389s("Not adding duplicated service observer: %s", str);
            } else {
                C19724l lVar = new C19724l(this.f54811c);
                this.f54810b.f54743d.mo122750f(str, lVar).mo122498q(C19710ab.f54741b);
                HashMap hashMap = this.f54809a;
                C69664n.m101060f(str, "serviceName");
                hashMap.put(str, lVar);
            }
        }
        for (String str2 : deVar.f30160b) {
            C146207a aVar = this.f54810b.f54743d;
            HashMap hashMap2 = this.f54809a;
            C69664n.m101060f(str2, "serviceName");
            aVar.mo122753i(str2, (C146209c) C69505av.m100865g(hashMap2, str2)).mo122498q(C19710ab.f54741b);
            this.f54809a.remove(str2);
        }
        return C69788q.f186170a;
    }
}
