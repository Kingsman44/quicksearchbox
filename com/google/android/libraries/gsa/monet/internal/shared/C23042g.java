package com.google.android.libraries.gsa.monet.internal.shared;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23034a;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23035b;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23036c;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23037d;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23068c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23089c;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.g */
/* compiled from: PG */
public final class C23042g {

    /* renamed from: a */
    public final String f63388a;

    /* renamed from: b */
    public final Map f63389b = new HashMap();

    /* renamed from: c */
    public final Bundle f63390c = new Bundle();

    /* renamed from: d */
    public final C23129y f63391d;

    /* renamed from: e */
    public ProtoParcelable f63392e;

    public C23042g(String str, C23129y yVar) {
        C23067b.m43230c(yVar.mo28577c(), "Type must be fully qualified: %s", yVar);
        this.f63388a = str;
        this.f63391d = yVar;
    }

    /* renamed from: n */
    private final void m43163n(String str) {
        C23067b.m43230c(this.f63389b.containsKey(str), "No child present with name %s", str);
    }

    /* renamed from: a */
    public final FeatureStateSnapshot mo28465a() {
        return new FeatureStateSnapshot(C23245b.m43556a(mo28467c()), this.f63390c, this.f63392e);
    }

    /* renamed from: b */
    public final C23035b mo28466b(String str) {
        for (C23035b bVar : this.f63389b.values()) {
            if (bVar.f63371c.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C23037d mo28467c() {
        C23036c cVar = (C23036c) C23037d.f63373e.createBuilder();
        String str = this.f63388a;
        cVar.copyOnWrite();
        C23037d dVar = (C23037d) cVar.instance;
        str.getClass();
        dVar.f63375a |= 1;
        dVar.f63376b = str;
        String str2 = this.f63391d.f63478c;
        cVar.copyOnWrite();
        C23037d dVar2 = (C23037d) cVar.instance;
        str2.getClass();
        dVar2.f63375a |= 2;
        dVar2.f63377c = str2;
        Collection values = this.f63389b.values();
        cVar.copyOnWrite();
        C23037d dVar3 = (C23037d) cVar.instance;
        C62971cq cqVar = dVar3.f63378d;
        if (!cqVar.mo58948c()) {
            dVar3.f63378d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) values, (List) dVar3.f63378d);
        return (C23037d) cVar.build();
    }

    /* renamed from: d */
    public final C23129y mo28468d(String str) {
        m43163n(str);
        C23035b bVar = (C23035b) this.f63389b.get(str);
        bVar.getClass();
        return new C23129y(bVar.f63372d);
    }

    /* renamed from: e */
    public final C23088b mo28469e() {
        return C23089c.m43272a(this.f63389b.values(), C23041f.f63387a);
    }

    /* renamed from: f */
    public final C23088b mo28470f() {
        return new C23088b(this.f63389b.keySet());
    }

    /* renamed from: g */
    public final String mo28471g(String str) {
        m43163n(str);
        C23035b bVar = (C23035b) this.f63389b.get(str);
        bVar.getClass();
        return bVar.f63371c;
    }

    /* renamed from: h */
    public final String mo28472h(String str) {
        C23035b bVar = (C23035b) this.f63389b.remove(str);
        if (bVar != null) {
            return bVar.f63371c;
        }
        return null;
    }

    /* renamed from: i */
    public final void mo28473i(FeatureStateSnapshot featureStateSnapshot) {
        this.f63392e = featureStateSnapshot.f63362b;
        this.f63390c.clear();
        mo28476l(featureStateSnapshot.f63361a);
    }

    /* renamed from: j */
    public final void mo28474j(C23035b bVar) {
        boolean containsKey = this.f63389b.containsKey(bVar.f63370b);
        String str = bVar.f63370b;
        String str2 = this.f63388a;
        if (!containsKey) {
            this.f63389b.put(str, bVar);
        } else {
            throw new IllegalArgumentException(C23068c.m43237a("Child already exists with name: %s for parent: %s", str, str2));
        }
    }

    /* renamed from: k */
    public final void mo28475k(String str, String str2, C23129y yVar) {
        C23034a aVar = (C23034a) C23035b.f63367e.createBuilder();
        aVar.copyOnWrite();
        C23035b bVar = (C23035b) aVar.instance;
        str.getClass();
        bVar.f63369a |= 1;
        bVar.f63370b = str;
        aVar.copyOnWrite();
        C23035b bVar2 = (C23035b) aVar.instance;
        str2.getClass();
        bVar2.f63369a |= 2;
        bVar2.f63371c = str2;
        String str3 = yVar.f63478c;
        aVar.copyOnWrite();
        C23035b bVar3 = (C23035b) aVar.instance;
        str3.getClass();
        bVar3.f63369a |= 4;
        bVar3.f63372d = str3;
        mo28474j((C23035b) aVar.build());
    }

    /* renamed from: l */
    public final void mo28476l(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = getClass().getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            this.f63390c.putAll(bundle);
        }
    }

    /* renamed from: m */
    public final boolean mo28477m(String str) {
        return this.f63389b.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(this.f63388a);
        sb.append(" type: ");
        sb.append(this.f63391d);
        for (C23035b bVar : this.f63389b.values()) {
            sb.append(" child { name: ");
            sb.append(bVar.f63370b);
            sb.append(" id: ");
            sb.append(bVar.f63371c);
            sb.append(" type: ");
            sb.append(bVar.f63372d);
            sb.append(" }");
        }
        return String.format("%s{frameworkModel=%s, featureModel=<binary>}", new Object[]{C30325g.f82003a, sb});
    }
}
