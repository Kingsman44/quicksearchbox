package com.google.android.gms.appdatasearch;

import com.google.android.gms.common.util.C144002b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.appdatasearch.ac */
/* compiled from: PG */
public final class C142787ac {

    /* renamed from: a */
    public boolean f387577a;

    /* renamed from: b */
    public List f387578b;

    /* renamed from: c */
    public boolean f387579c;

    /* renamed from: d */
    public int f387580d = 0;

    /* renamed from: e */
    public int f387581e = 0;

    /* renamed from: f */
    public STSortSpec f387582f;

    /* renamed from: g */
    public String f387583g;

    /* renamed from: h */
    private List f387584h;

    /* renamed from: i */
    private boolean f387585i;

    /* renamed from: j */
    private final List f387586j = new ArrayList();

    /* renamed from: a */
    public final QuerySpecification mo117689a() {
        return new QuerySpecification(this.f387577a, this.f387578b, this.f387584h, this.f387579c, 0, this.f387580d, this.f387585i, this.f387581e, true, C144002b.m234181b(this.f387586j), (byte[]) null, this.f387582f, this.f387583g, (CacheSpec) null);
    }

    /* renamed from: b */
    public final void mo117690b(Section section) {
        if (section.f387556a.startsWith("semantic#")) {
            if (this.f387584h == null) {
                this.f387585i = true;
                this.f387584h = new ArrayList();
            } else if (!this.f387585i) {
                throw new IllegalArgumentException("Cannot mix literal and semantic sections");
            }
            this.f387584h.add(section);
            return;
        }
        if (this.f387584h == null) {
            this.f387585i = false;
            this.f387584h = new ArrayList();
        } else if (this.f387585i) {
            throw new IllegalArgumentException("Cannot mix literal and semantic sections");
        }
        this.f387584h.add(section);
    }
}
