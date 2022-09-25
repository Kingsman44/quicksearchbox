package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p182p.p183a.C3917e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.da */
/* compiled from: PG */
public final class C16156da implements C16144cp {

    /* renamed from: a */
    public final C3925ah f47656a;

    /* renamed from: b */
    public final C3966s f47657b;

    /* renamed from: c */
    public final C3933ap f47658c;

    public C16156da(C3925ah ahVar) {
        this.f47656a = ahVar;
        this.f47657b = new C16148ct(ahVar);
        new C16149cu(ahVar);
        this.f47658c = new C16150cv(ahVar);
        new C16151cw(ahVar);
    }

    /* renamed from: a */
    public final C60870cx mo22806a(List list) {
        C3925ah ahVar = this.f47656a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16147cs(this, list));
    }

    /* renamed from: b */
    public final C60870cx mo22807b(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM suggestion_to_display WHERE display_id = ?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47656a, new C16154cz(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: c */
    public final C60870cx mo22808c(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM suggestion_to_display WHERE id =?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47656a, new C16146cr(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: d */
    public final C60870cx mo22809d(List list) {
        C3925ah ahVar = this.f47656a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16152cx(this, list));
    }

    /* renamed from: e */
    public final C60870cx mo22810e(String str) {
        C3925ah ahVar = this.f47656a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16153cy(this, str));
    }

    /* renamed from: f */
    public final C60870cx mo22811f(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM suggestion_to_display WHERE display_id = ? AND is_displayed_now = ?", 2);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        a.mo8204e(2, 1);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47656a, new C16145cq(this, a, cancellationSignal), a, cancellationSignal);
    }
}
