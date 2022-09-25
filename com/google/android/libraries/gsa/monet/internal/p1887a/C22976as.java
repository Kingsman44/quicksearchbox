package com.google.android.libraries.gsa.monet.internal.p1887a;

import android.os.Trace;
import com.google.android.libraries.gsa.monet.internal.shared.C23042g;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23035b;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23037d;
import com.google.android.libraries.gsa.monet.shared.C23125u;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23092f;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.as */
/* compiled from: PG */
public final class C22976as {

    /* renamed from: a */
    public final C22994r f63186a;

    /* renamed from: b */
    public final C22995s f63187b;

    /* renamed from: c */
    public final C68214a f63188c;

    /* renamed from: d */
    public final C68214a f63189d;

    /* renamed from: e */
    public final C23125u f63190e;

    /* renamed from: f */
    public final C68214a f63191f;

    /* renamed from: g */
    public boolean f63192g = true;

    public C22976as(C22994r rVar, C22995s sVar, C68214a aVar, C68214a aVar2, C23125u uVar, C68214a aVar3) {
        this.f63186a = rVar;
        this.f63187b = sVar;
        this.f63188c = aVar;
        this.f63189d = aVar2;
        this.f63190e = uVar;
        this.f63191f = aVar3;
    }

    /* renamed from: b */
    public static void m43023b(String str) {
        Trace.beginSection(str.substring(0, Math.min(127, str.length())));
    }

    /* renamed from: d */
    public static final void m43024d(C22960ac acVar, Iterable iterable) {
        C22967aj ajVar = acVar.f63142d;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ajVar.mo28350c((String) it.next());
        }
    }

    /* renamed from: a */
    public final Set mo28358a(C23042g gVar, C23037d dVar) {
        try {
            if (this.f63190e.mo28573c()) {
                String str = dVar.f63376b;
                m43023b("UiProcessUpdateReceiver.updateChildren-" + str);
            }
            HashSet hashSet = new HashSet();
            C23092f fVar = new C23092f(gVar.f63389b.values());
            HashSet<C23035b> hashSet2 = new HashSet<>(dVar.f63378d);
            HashSet<C23035b> hashSet3 = new HashSet<>(fVar);
            hashSet3.removeAll(hashSet2);
            for (C23035b bVar : hashSet3) {
                this.f63187b.mo28390e(bVar.f63371c, new C22973ap(this));
                String str2 = bVar.f63370b;
                C22995s sVar = this.f63187b;
                String str3 = gVar.f63388a;
                C23067b.m43230c(sVar.f63253b.containsKey(str3), "No such parent: %s", str3);
                C22977at atVar = (C22977at) sVar.f63253b.get(str3);
                atVar.getClass();
                String g = atVar.f63194b.mo28471g(str2);
                sVar.mo28392g(g);
                atVar.f63194b.mo28472h(str2);
                sVar.f63254c.remove(g);
                hashSet.add(str2);
            }
            hashSet2.removeAll(fVar);
            for (C23035b bVar2 : hashSet2) {
                this.f63187b.mo28388c(gVar.f63388a, bVar2);
                hashSet.add(bVar2.f63370b);
            }
            return hashSet;
        } finally {
            if (this.f63190e.mo28573c()) {
                Trace.endSection();
            }
        }
    }

    /* renamed from: c */
    public final void mo28359c(String str, C23109a aVar) {
        C22960ac b = this.f63186a.mo28380b(str);
        if (b != null) {
            aVar.mo28347a(b);
        }
    }
}
