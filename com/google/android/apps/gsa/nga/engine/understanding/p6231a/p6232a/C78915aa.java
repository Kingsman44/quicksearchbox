package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.au.ak;
import com.google.android.apps.gsa.nga.engine.au.al;
import com.google.android.apps.gsa.nga.engine.au.av;
import com.google.android.apps.gsa.nga.engine.au.bz;
import com.google.android.apps.gsa.nga.engine.au.c;
import com.google.android.apps.gsa.nga.engine.au.d;
import com.google.android.apps.gsa.nga.engine.au.e;
import com.google.android.apps.gsa.nga.engine.p5963au.C75047aj;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.assistant.p3817aj.p3818a.p3819a.C49191c;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p014d.p015a.p016a.C0043af;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.aa */
/* compiled from: PG */
public final class C78915aa implements C75047aj, C78931m {

    /* renamed from: a */
    private final e f217135a;

    /* renamed from: b */
    private final bz f217136b;

    /* renamed from: c */
    private final al f217137c;

    /* renamed from: d */
    private final AtomicReference f217138d = new AtomicReference(C58733pz.f156496a);

    /* renamed from: e */
    private final AtomicReference f217139e = new AtomicReference(C58733pz.f156496a);

    public C78915aa(bz bzVar, al alVar, e eVar) {
        this.f217136b = bzVar;
        this.f217137c = alVar;
        this.f217135a = eVar;
    }

    /* renamed from: a */
    public final void mo71414a() {
        C90762bf b = C90762bf.m148259b();
        ak a = this.f217137c.a();
        av a2 = this.f217136b.a();
        Stream stream = Collection.EL.stream(a.a());
        Objects.requireNonNull(a);
        C58528ij ijVar = (C58528ij) stream.map(new C78938t(a)).filter(C78940v.f217179a).map(C78941w.f217180a).map(C78942x.f217181a).filter(new C78943y(a2)).collect(C58370cn.f155947b);
        this.f217138d.set(ijVar);
        ijVar.size();
        b.mo85102a();
        Stream stream2 = Collection.EL.stream(a.a());
        Objects.requireNonNull(a);
        C58528ij ijVar2 = (C58528ij) stream2.map(new C78944z(a)).filter(C78940v.f217179a).map(C78933o.f217172a).flatMap(C78934p.f217173a).filter(new C78935q(a2)).map(C78939u.f217178a).collect(C58370cn.f155947b);
        this.f217139e.set(ijVar2);
        ijVar2.size();
        b.mo85102a();
    }

    /* renamed from: b */
    public final C58528ij mo73687b() {
        return (C58528ij) this.f217138d.get();
    }

    /* renamed from: c */
    public final C58528ij mo73688c() {
        return (C58528ij) this.f217139e.get();
    }

    /* renamed from: d */
    public final Optional mo73689d(String str) {
        C0043af c = this.f217136b.a().c(str);
        if (c.f117b == null) {
            return Optional.empty();
        }
        String str2 = (String) this.f217137c.a().b(str, Optional.empty()).map(C78937s.f217176a).orElse(str);
        C49192d dVar = c.f117b;
        if (dVar == null) {
            dVar = C49192d.f127199e;
        }
        C49191c cVar = (C49191c) C49192d.f127199e.createBuilder(dVar);
        cVar.copyOnWrite();
        C49192d dVar2 = (C49192d) cVar.instance;
        str2.getClass();
        dVar2.f127201a |= 2;
        dVar2.f127203c = str2;
        return Optional.m71637of((C49192d) cVar.build());
    }

    /* renamed from: e */
    public final Optional mo73690e(Uri uri) {
        String host = uri.getHost();
        if (host == null) {
            return Optional.empty();
        }
        d a = this.f217135a.a();
        ak a2 = this.f217137c.a();
        C0043af d = this.f217136b.a().d(host, a);
        if (d.f117b == null) {
            return Optional.empty();
        }
        Optional map = a2.b(host, Optional.m71637of(a)).map(C78932n.f217171a);
        String str = (String) a2.c(uri.toString(), Optional.m71637of(a)).flatMap(C78936r.f217175a).orElse(host);
        C49192d dVar = d.f117b;
        if (dVar == null) {
            dVar = C49192d.f127199e;
        }
        C49191c cVar = (C49191c) C49192d.f127199e.createBuilder(dVar);
        cVar.copyOnWrite();
        C49192d dVar2 = (C49192d) cVar.instance;
        str.getClass();
        dVar2.f127201a |= 4;
        dVar2.f127204d = str;
        if (map.isPresent()) {
            map.get();
            String str2 = (String) map.get();
            cVar.copyOnWrite();
            C49192d dVar3 = (C49192d) cVar.instance;
            str2.getClass();
            dVar3.f127201a |= 2;
            dVar3.f127203c = str2;
        }
        return Optional.m71637of((C49192d) cVar.build());
    }

    /* renamed from: f */
    public final boolean mo73691f(Uri uri, Uri uri2) {
        String host = uri.getHost();
        String host2 = uri2.getHost();
        if (host == null || host2 == null) {
            return false;
        }
        if (host.equals(host2)) {
            return true;
        }
        d a = this.f217135a.a();
        return c.a(host, a.b).equals(c.a(host2, a.b));
    }

    /* renamed from: g */
    public final Optional mo73692g(String str, int i) {
        return m126795i(this.f217136b.a().c(str), i);
    }

    /* renamed from: h */
    public final Optional mo73693h(Uri uri, int i) {
        String host = uri.getHost();
        if (host == null) {
            return Optional.empty();
        }
        return m126795i(this.f217136b.a().d(host, this.f217135a.a()), i);
    }

    /* renamed from: i */
    private static Optional m126795i(C0043af afVar, int i) {
        if (afVar.f117b == null) {
            return Optional.empty();
        }
        if (i != 0) {
            if (i == 4) {
                if ((afVar.f116a & 2) != 0) {
                    return Optional.m71637of(Float.valueOf(afVar.f127l));
                }
            } else if (i == 3 && (afVar.f116a & 1) != 0) {
                return Optional.m71637of(Float.valueOf(afVar.f126k));
            }
            return Optional.empty();
        }
        throw null;
    }
}
