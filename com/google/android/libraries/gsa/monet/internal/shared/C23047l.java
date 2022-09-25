package com.google.android.libraries.gsa.monet.internal.shared;

import android.text.TextUtils;
import com.google.android.libraries.gsa.monet.shared.C23075af;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.C23079aj;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23086b;
import com.google.android.libraries.gsa.monet.shared.C23126v;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23093g;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23100c;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23101d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.l */
/* compiled from: PG */
public final class C23047l implements C23075af {

    /* renamed from: a */
    private final Map f63394a = new HashMap();

    /* renamed from: b */
    private boolean f63395b = false;

    /* renamed from: c */
    private final C23129y f63396c;

    /* renamed from: d */
    private final C23084ao f63397d;

    /* renamed from: e */
    private final C23045j f63398e;

    /* renamed from: f */
    private final C23128x f63399f;

    /* renamed from: g */
    private C23126v f63400g;

    public C23047l(C23129y yVar, C23084ao aoVar, C23045j jVar, C23128x xVar) {
        this.f63396c = yVar;
        this.f63397d = aoVar;
        this.f63398e = jVar;
        this.f63399f = xVar;
    }

    /* renamed from: d */
    private final void m43179d() {
        C23067b.m43234g(!this.f63395b, "Unsupported operation for a lock store that has been destroyed; type of lock owner: %s", this.f63396c);
    }

    /* renamed from: a */
    public final void mo28483a(String str) {
        this.f63397d.mo28328a();
        m43179d();
        if (!TextUtils.equals(str, this.f63396c.f63476a) && this.f63398e.mo28395a(str) == null) {
            throw new C23079aj(str);
        }
    }

    /* renamed from: b */
    public final void mo28484b() {
        this.f63397d.mo28328a();
        m43179d();
        for (Map.Entry entry : this.f63394a.entrySet()) {
            C23086b a = this.f63398e.mo28395a((String) entry.getKey());
            if (a != null) {
                for (C23078ai aiVar : (Set) entry.getValue()) {
                    a.mo28529d(aiVar);
                    aiVar.mo28526c();
                }
            }
        }
        this.f63394a.clear();
        this.f63395b = true;
        mo28485c();
    }

    /* renamed from: c */
    public final void mo28485c() {
        if (this.f63400g != null) {
            this.f63400g = null;
        }
    }

    /* renamed from: h */
    public final C23078ai mo28339h(String str) {
        this.f63397d.mo28328a();
        m43179d();
        C23086b a = this.f63398e.mo28395a(str);
        if (a != null) {
            if (!this.f63394a.containsKey(str)) {
                this.f63394a.put(str, new HashSet());
                C23128x xVar = this.f63399f;
                C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
                cVar.copyOnWrite();
                C23101d dVar = (C23101d) cVar.instance;
                dVar.f63452d = 16;
                dVar.f63449a |= 1;
                cVar.copyOnWrite();
                C23101d dVar2 = (C23101d) cVar.instance;
                str.getClass();
                dVar2.f63450b = 4;
                dVar2.f63451c = str;
                C23101d dVar3 = (C23101d) cVar.build();
                this.f63400g = xVar.mo28519b();
            }
            C23078ai c = a.mo28528c(this.f63396c);
            ((Set) this.f63394a.get(str)).add(c);
            c.mo28525b(new C23046k(this));
            return c;
        }
        throw new C23079aj(str);
    }

    /* renamed from: p */
    public final void mo28344p(C23078ai aiVar) {
        C23093g gVar;
        this.f63397d.mo28328a();
        m43179d();
        Iterator it = this.f63394a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = C23093g.f63435a;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Set) entry.getValue()).contains(aiVar)) {
                gVar = new C23093g(entry);
                break;
            }
        }
        if (gVar.mo28554c()) {
            String str = (String) ((Map.Entry) gVar.mo28552a()).getKey();
            Set set = (Set) ((Map.Entry) gVar.mo28552a()).getValue();
            set.remove(aiVar);
            C23086b a = this.f63398e.mo28395a(str);
            if (a != null) {
                a.mo28529d(aiVar);
                aiVar.mo28526c();
                if (set.isEmpty()) {
                    this.f63394a.remove(str);
                    mo28485c();
                }
            }
        }
    }
}
