package android.support.p031v4.app;

import android.view.View;
import androidx.core.p098j.C2043bi;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.cm */
/* compiled from: PG */
final class C0221cm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f839a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f840b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f841c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f842d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f843e;

    public C0221cm(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f839a = i;
        this.f840b = arrayList;
        this.f841c = arrayList2;
        this.f842d = arrayList3;
        this.f843e = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.f839a; i++) {
            C2043bi.m5561ao((View) this.f840b.get(i), (String) this.f841c.get(i));
            C2043bi.m5561ao((View) this.f842d.get(i), (String) this.f843e.get(i));
        }
    }
}
