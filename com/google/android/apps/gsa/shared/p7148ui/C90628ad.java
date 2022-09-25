package com.google.android.apps.gsa.shared.p7148ui;

import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.ui.ad */
/* compiled from: PG */
public abstract class C90628ad {

    /* renamed from: a */
    public final C58485gu f253420a;

    /* renamed from: b */
    private final ArrayList f253421b = new ArrayList();

    /* renamed from: c */
    private boolean f253422c;

    public C90628ad(C58485gu guVar) {
        this.f253420a = guVar;
    }

    /* renamed from: a */
    public final synchronized void mo84880a(C90627ac acVar) {
        this.f253421b.add(acVar);
    }

    /* renamed from: b */
    public final synchronized void mo84881b() {
        if (!this.f253422c) {
            mo84882c();
            this.f253422c = true;
            ArrayList arrayList = this.f253421b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C90627ac) arrayList.get(i)).mo84879a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo84882c();
}
