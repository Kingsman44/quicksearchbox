package com.google.android.gms.contextmanager;

import com.google.android.gms.contextmanager.internal.C144055aa;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.contextmanager.c */
/* compiled from: PG */
public final class C144029c {

    /* renamed from: a */
    public HashSet f390264a;

    /* renamed from: b */
    public final C144055aa f390265b = new C144055aa();

    /* renamed from: a */
    public final ContextDataFilterImpl mo119541a() {
        HashSet hashSet = this.f390264a;
        C144055aa aaVar = this.f390265b;
        return new ContextDataFilterImpl(hashSet == null ? null : new ArrayList(hashSet), (ArrayList) null, new QueryFilterParameters(aaVar.f390333a, aaVar.f390334b, (int[]) null));
    }

    /* renamed from: b */
    public final void mo119542b(int i) {
        if (this.f390264a == null) {
            this.f390264a = new HashSet();
        }
        HashSet hashSet = this.f390264a;
        ArrayList arrayList = new ArrayList();
        C144085j.m234287b(0, arrayList);
        hashSet.add(new ContextDataFilterImpl.Inclusion(-1, i, C144085j.m234286a(arrayList), (KeyFilterImpl) null));
    }
}
