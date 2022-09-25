package androidx.p197u;

import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.u.q */
/* compiled from: PG */
final class C4232q implements C4194ae {

    /* renamed from: a */
    final /* synthetic */ View f13673a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f13674b;

    public C4232q(View view, ArrayList arrayList) {
        this.f13673a = view;
        this.f13674b = arrayList;
    }

    /* renamed from: a */
    public final void mo8864a(C4195af afVar) {
        afVar.mo8870B(this);
        this.f13673a.setVisibility(8);
        int size = this.f13674b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f13674b.get(i)).setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo8865b() {
    }

    /* renamed from: c */
    public final void mo8866c() {
    }

    /* renamed from: d */
    public final void mo8867d() {
    }

    /* renamed from: e */
    public final void mo8868e(C4195af afVar) {
        afVar.mo8870B(this);
        afVar.mo8900z(this);
    }
}
