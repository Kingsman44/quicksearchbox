package com.facebook.litho.widget;

import android.support.p033v7.widget.RecyclerView;
import com.facebook.litho.C6349gb;

/* renamed from: com.facebook.litho.widget.cp */
/* compiled from: PG */
public class C6484cp {

    /* renamed from: a */
    private final Runnable f19251a = new C6483co(this);

    /* renamed from: b */
    public C6497db f19252b;

    /* renamed from: a */
    public final RecyclerView mo13573a() {
        C6497db dbVar = this.f19252b;
        if (dbVar == null) {
            return null;
        }
        return dbVar.f19266p;
    }

    /* renamed from: b */
    public final void mo13574b() {
        C6497db dbVar = this.f19252b;
        if (dbVar != null && dbVar.f13509b) {
            if (C6349gb.m17046b()) {
                dbVar.mo8794l(false, false);
                return;
            }
            dbVar.removeCallbacks(this.f19251a);
            dbVar.post(this.f19251a);
        }
    }

    /* renamed from: c */
    public final void mo13575c(int i) {
        C6497db dbVar = this.f19252b;
        if (dbVar != null) {
            dbVar.f19266p.scrollToPosition(i);
        }
    }
}
