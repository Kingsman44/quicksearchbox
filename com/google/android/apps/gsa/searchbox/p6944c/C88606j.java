package com.google.android.apps.gsa.searchbox.p6944c;

import android.os.Bundle;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.c.j */
/* compiled from: PG */
final class C88606j {

    /* renamed from: a */
    public final List f239459a = new ArrayList();

    /* renamed from: b */
    public final Bundle f239460b = new Bundle();

    /* renamed from: c */
    public int f239461c;

    /* renamed from: d */
    public int f239462d;

    /* renamed from: e */
    public boolean f239463e;

    /* renamed from: f */
    public boolean f239464f = true;

    /* renamed from: g */
    public C54231at f239465g = C54231at.f142359r;

    /* renamed from: h */
    public final C41642a f239466h;

    /* renamed from: i */
    private final List f239467i = new ArrayList();

    public C88606j(int i, C41642a aVar) {
        this.f239461c = i;
        this.f239466h = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo82259a() {
        ArrayList arrayList = new ArrayList(this.f239467i);
        for (C41626a aVar : this.f239459a) {
            arrayList.addAll(aVar.f108836a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo82260b() {
        return this.f239461c > 0;
    }
}
