package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.mdi.download.cu */
/* compiled from: PG */
public abstract class C28806cu {
    /* renamed from: a */
    public abstract C28807cv mo34457a();

    /* renamed from: b */
    public abstract void mo34458b(C58833ax axVar);

    /* renamed from: c */
    public abstract void mo34459c(boolean z);

    /* renamed from: d */
    public abstract void mo34460d(boolean z);

    /* renamed from: e */
    public abstract void mo34461e(boolean z);

    /* renamed from: f */
    public final C28807cv mo34462f() {
        C28807cv a = mo34457a();
        if (a.mo34467e()) {
            C58838bb.m90868c(!a.mo34464b().mo56113h());
            C58838bb.m90868c(!a.mo34463a().mo56113h());
            C58838bb.m90868c(!a.mo34465c().mo56113h());
            C58838bb.m90868c(!a.mo34466d());
        } else {
            C58838bb.m90869d(a.mo34464b().mo56113h() || a.mo34465c().mo56113h(), "Request must provide a group name or source to filter by");
        }
        if (a.mo34466d()) {
            C58838bb.m90868c(!a.mo34463a().mo56113h());
        }
        return a;
    }
}
