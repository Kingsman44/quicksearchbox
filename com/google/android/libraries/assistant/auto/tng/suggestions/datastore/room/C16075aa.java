package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3965r;
import androidx.p182p.C3966s;
import androidx.p182p.p183a.C3917e;
import androidx.p182p.p185c.C3943e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aa */
/* compiled from: PG */
public final class C16075aa implements C16171o {

    /* renamed from: a */
    public final C3925ah f47535a;

    /* renamed from: b */
    public final C3966s f47536b;

    /* renamed from: c */
    public final C3965r f47537c;

    /* renamed from: d */
    public final C3965r f47538d;

    public C16075aa(C3925ah ahVar) {
        this.f47535a = ahVar;
        this.f47536b = new C16175s(ahVar);
        this.f47537c = new C16176t(ahVar);
        this.f47538d = new C16177u(ahVar);
        new C16178v(ahVar);
    }

    /* renamed from: a */
    public final C60870cx mo22681a() {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT COUNT(id) FROM candidate_suggestion", 0);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47535a, new C16173q(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: b */
    public final C60870cx mo22682b(List list) {
        C3925ah ahVar = this.f47535a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16180x(this, list));
    }

    /* renamed from: c */
    public final C60870cx mo22683c() {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM candidate_suggestion", 0);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47535a, new C16172p(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: d */
    public final C60870cx mo22684d(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM candidate_suggestion WHERE locale = ?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47535a, new C16182z(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: e */
    public final C60870cx mo22685e(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM candidate_suggestion WHERE id in (");
        int size = list.size();
        C3943e.m11297a(sb, size);
        sb.append(")");
        String sb2 = sb.toString();
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, size);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                a.f12582g[i] = 1;
            } else {
                a.mo8206g(i, str);
            }
            i++;
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47535a, new C16174r(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: f */
    public final C60870cx mo22686f(List list) {
        C3925ah ahVar = this.f47535a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16179w(this, list));
    }

    /* renamed from: g */
    public final C60870cx mo22687g(List list) {
        C3925ah ahVar = this.f47535a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16181y(this, list));
    }
}
