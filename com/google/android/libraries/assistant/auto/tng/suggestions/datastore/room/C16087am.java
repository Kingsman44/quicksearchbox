package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3965r;
import androidx.p182p.C3966s;
import androidx.p182p.p183a.C3917e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.am */
/* compiled from: PG */
public final class C16087am implements C16078ad {

    /* renamed from: a */
    public final C3925ah f47551a;

    /* renamed from: b */
    public final C3966s f47552b;

    /* renamed from: c */
    public final C3965r f47553c;

    public C16087am(C3925ah ahVar) {
        this.f47551a = ahVar;
        this.f47552b = new C16079ae(ahVar);
        this.f47553c = new C16080af(ahVar);
        new C16081ag(ahVar);
    }

    /* renamed from: a */
    public final C60870cx mo22706a(List list) {
        C3925ah ahVar = this.f47551a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16083ai(this, list));
    }

    /* renamed from: b */
    public final C60870cx mo22707b(List list) {
        C3925ah ahVar = this.f47551a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16086al(this, list));
    }

    /* renamed from: c */
    public final C60870cx mo22708c() {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM candidate_suggestion_metrics", 0);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47551a, new C16085ak(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: d */
    public final C60870cx mo22709d(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM candidate_suggestion_metrics WHERE candidate_suggestion_id = ?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47551a, new C16084aj(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: e */
    public final C60870cx mo22710e(C16077ac acVar) {
        C3925ah ahVar = this.f47551a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16082ah(this, acVar));
    }
}
