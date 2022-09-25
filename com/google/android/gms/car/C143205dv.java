package com.google.android.gms.car;

import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.p054b.p055a.p058c.C0895a;

/* renamed from: com.google.android.gms.car.dv */
/* compiled from: PG */
public final class C143205dv {

    /* renamed from: a */
    public final int f388303a;

    /* renamed from: b */
    public final int f388304b;

    /* renamed from: c */
    public final long f388305c;

    /* renamed from: d */
    public final int f388306d;

    public C143205dv(int i) {
        this.f388303a = i;
        this.f388304b = -1;
        this.f388305c = -1;
        this.f388306d = -1;
    }

    public C143205dv(int i, int i2, long j, int i3) {
        this.f388303a = i;
        this.f388304b = i2;
        this.f388305c = j;
        this.f388306d = i3;
    }

    /* renamed from: a */
    public static int m232325a(View view, View view2) {
        int id;
        if (view == null || (id = view.getId()) == -1 || view2.findViewById(id) != view) {
            return -1;
        }
        return id;
    }

    /* renamed from: b */
    public final C0673gh mo118226b(RecyclerView recyclerView, C0895a aVar) {
        C0673gh ghVar = (C0673gh) aVar.mo523a(recyclerView);
        if (ghVar != null && ghVar.itemView.isAttachedToWindow()) {
            return ghVar;
        }
        recyclerView.scrollToPosition(this.f388304b);
        return (C0673gh) aVar.mo523a(recyclerView);
    }
}
