package com.google.android.apps.gsa.p496a.p500c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.a.c.c */
/* compiled from: PG */
public final class C9311c implements C86091a {

    /* renamed from: c */
    private static final C59071e f32301c = C59071e.m91332i("com.google.android.apps.gsa.a.c.c");

    /* renamed from: a */
    public final C21370a f32302a;

    /* renamed from: b */
    public final AtomicInteger f32303b;

    /* renamed from: d */
    private final SharedPreferences f32304d;

    /* renamed from: e */
    private final AtomicInteger f32305e;

    /* renamed from: f */
    private boolean f32306f;

    public C9311c(C21370a aVar, SharedPreferences sharedPreferences) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f32303b = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.f32305e = atomicInteger2;
        ((C59052c) ((C59052c) f32301c.mo56224b()).mo56372aa(17)).mo56386p("ColdBootHelper constructor");
        this.f32302a = aVar;
        this.f32304d = sharedPreferences;
        atomicInteger.set(sharedPreferences.getInt("aae_query_count", 0));
        atomicInteger2.set(sharedPreferences.getInt("aae_post_cold_boot_query_count", 0));
    }

    /* renamed from: a */
    public final C59687cb mo17492a(long j) {
        if (mo17495d(j)) {
            return C59687cb.f160034bf;
        }
        int incrementAndGet = this.f32305e.incrementAndGet();
        this.f32304d.edit().putInt("aae_post_cold_boot_query_count", incrementAndGet).apply();
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160123d |= 512;
        cbVar.f160078aP = incrementAndGet;
        return (C59687cb) ajVar.build();
    }

    /* renamed from: b */
    public final void mo17493b() {
        this.f32306f = true;
        this.f32304d.edit().putInt("aae_query_count", this.f32303b.incrementAndGet()).apply();
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (!this.f32306f) {
            ((C59052c) ((C59052c) f32301c.mo56224b()).mo56372aa(18)).mo56386p("resetQueryCounts");
            this.f32303b.set(0);
            this.f32305e.set(0);
            this.f32304d.edit().putInt("aae_query_count", 0).putInt("aae_post_cold_boot_query_count", 0).apply();
        }
    }

    /* renamed from: d */
    public final synchronized boolean mo17495d(long j) {
        return this.f32302a.mo26871c() < j;
    }

    /* renamed from: e */
    public final synchronized void mo17496e() {
    }
}
