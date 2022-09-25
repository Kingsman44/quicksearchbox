package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.usonia.directory.C146209c;
import java.util.HashMap;
import java.util.Map;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.z */
/* compiled from: PG */
final class C19738z extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ HashMap f54812a;

    /* renamed from: b */
    final /* synthetic */ C19710ab f54813b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19738z(HashMap hashMap, C19710ab abVar) {
        super(0);
        this.f54812a = hashMap;
        this.f54813b = abVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        for (Map.Entry entry : this.f54812a.entrySet()) {
            this.f54813b.f54743d.mo122753i((String) entry.getKey(), (C146209c) entry.getValue()).mo122498q(C19710ab.f54741b);
        }
        this.f54812a.clear();
        return C69788q.f186170a;
    }
}
