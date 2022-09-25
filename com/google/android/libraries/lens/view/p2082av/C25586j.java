package com.google.android.libraries.lens.view.p2082av;

import android.view.ViewGroup;
import com.google.android.libraries.lens.view.main.C27382dr;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.lens.view.av.j */
/* compiled from: PG */
public final class C25586j {

    /* renamed from: a */
    public static final C58974d f69615a = C58974d.m91135i("SyncTextureView");

    /* renamed from: b */
    public final AtomicInteger f69616b = new AtomicInteger(0);

    /* renamed from: c */
    public final int f69617c;

    /* renamed from: d */
    public final C58833ax f69618d;

    /* renamed from: e */
    public final C25585i[] f69619e;

    /* renamed from: f */
    public boolean f69620f;

    /* renamed from: g */
    public C27382dr f69621g;

    public C25586j(C47274n nVar, C25582f fVar, C58833ax axVar, C47770dh dhVar) {
        this.f69618d = axVar;
        int i = true == axVar.mo56113h() ? 6 : 1;
        this.f69617c = i;
        this.f69619e = new C25585i[i];
        for (int i2 = 0; i2 < this.f69617c; i2++) {
            this.f69619e[i2] = new C25585i(nVar, new C25584h(this, i2, dhVar));
        }
        C25585i[] iVarArr = this.f69619e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        for (C25585i iVar : iVarArr) {
            fVar.addView(iVar.f69613a, layoutParams);
        }
    }
}
