package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.storage.cs */
/* compiled from: PG */
public final class C42672cs extends C42669cp {

    /* renamed from: a */
    private final C3925ah f111871a;

    /* renamed from: b */
    private final C3966s f111872b;

    /* renamed from: c */
    private final C3933ap f111873c;

    public C42672cs(C3925ah ahVar) {
        this.f111871a = ahVar;
        this.f111872b = new C42670cq(ahVar);
        this.f111873c = new C42671cr(ahVar);
    }

    /* renamed from: a */
    public final void mo45766a() {
        this.f111871a.mo8175S();
        C4057l d = this.f111873c.mo8212d();
        this.f111871a.mo8181p();
        try {
            d.mo8256a();
            this.f111871a.mo8188w();
        } finally {
            this.f111871a.mo8183r();
            this.f111873c.mo8215g(d);
        }
    }

    /* renamed from: b */
    public final void mo45767b(List list) {
        this.f111871a.mo8175S();
        this.f111871a.mo8181p();
        try {
            this.f111872b.mo8307b(list);
            this.f111871a.mo8188w();
        } finally {
            this.f111871a.mo8183r();
        }
    }
}
