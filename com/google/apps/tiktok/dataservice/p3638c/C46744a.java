package com.google.apps.tiktok.dataservice.p3638c;

import android.util.SparseArray;
import androidx.p060c.C0977g;
import com.google.common.base.C58838bb;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.dataservice.c.a */
/* compiled from: PG */
final class C46744a {

    /* renamed from: a */
    public final Map f122085a = new C0977g();

    /* renamed from: b */
    public final SparseArray f122086b = new SparseArray();

    /* renamed from: c */
    public int f122087c = 0;

    /* renamed from: a */
    public final C46756m mo50765a(int i) {
        C46756m mVar = (C46756m) this.f122086b.get(i);
        C58838bb.m90862C(mVar, "No ViewBinder for the provided viewType: %s", i);
        return mVar;
    }
}
