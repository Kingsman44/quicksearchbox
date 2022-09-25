package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p182p.p183a.C3917e;
import com.google.common.util.concurrent.C60870cx;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.az */
/* compiled from: PG */
public final class C16100az implements C16092ar {

    /* renamed from: a */
    public final C3925ah f47577a;

    /* renamed from: b */
    public final C3966s f47578b;

    /* renamed from: c */
    public final C3933ap f47579c;

    public C16100az(C3925ah ahVar) {
        this.f47577a = ahVar;
        this.f47578b = new C16093as(ahVar);
        this.f47579c = new C16094at(ahVar);
    }

    /* renamed from: a */
    public final C60870cx mo22736a(String str) {
        C3925ah ahVar = this.f47577a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16096av(this, str));
    }

    /* renamed from: b */
    public final C60870cx mo22737b() {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM display_info", 0);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47577a, new C16097aw(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: c */
    public final C60870cx mo22738c(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM display_info where id = ?", 1);
        a.mo8206g(1, str);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47577a, new C16099ay(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: d */
    public final C60870cx mo22739d(C16090ap apVar) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM display_info where display_type = ?", 1);
        a.mo8204e(1, (long) apVar.ordinal());
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47577a, new C16098ax(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: e */
    public final C60870cx mo22740e(C16091aq aqVar) {
        C3925ah ahVar = this.f47577a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16095au(this, aqVar));
    }
}
