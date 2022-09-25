package com.facebook.litho.widget;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.C6203dw;
import com.facebook.litho.C6206dz;
import com.facebook.litho.C6276fs;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.litho.p325d.C6180a;
import com.facebook.litho.p334j.C6399b;
import com.facebook.litho.p334j.C6400c;

/* renamed from: com.facebook.litho.widget.cc */
/* compiled from: PG */
final class C6471cc extends C0640fb implements C6475cg {

    /* renamed from: a */
    final /* synthetic */ C6474cf f19172a;

    public C6471cc(C6474cf cfVar) {
        this.f19172a = cfVar;
        setHasStableIds(false);
    }

    /* renamed from: a */
    public final void mo13548a(int i, int i2) {
        this.f19172a.mo13552C(i, i2);
    }

    public final int getItemCount() {
        return this.f19172a.f19203a.size();
    }

    public final long getItemId(int i) {
        return (long) ((C6548m) this.f19172a.f19203a.get(i)).f19500b;
    }

    public final int getItemViewType(int i) {
        C6491cw d = ((C6548m) this.f19172a.f19203a.get(i)).mo13632d();
        if (d.mo13532n()) {
            return this.f19172a.f19184D.f19259c;
        }
        return d.mo13520b();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        int i2;
        C0673gh ghVar2 = ghVar;
        int i3 = i;
        boolean z = C6203dw.m16458b((C6203dw) null) && !this.f19172a.f19232y.isEmpty();
        C6548m mVar = (C6548m) this.f19172a.f19203a.get(i3);
        C6491cw d = mVar.mo13632d();
        if (d.mo13532n()) {
            LithoView lithoView = (LithoView) ghVar2.itemView;
            int p = this.f19172a.mo13562p(mVar);
            int o = this.f19172a.mo13561o(mVar);
            if (!mVar.mo13642n(p, o)) {
                C6474cf cfVar = this.f19172a;
                int i4 = cfVar.f19225r;
                if (!(i4 == -1 || (i2 = cfVar.f19226s) == -1)) {
                    int i5 = i2 - i4;
                    if (i3 > i2) {
                        cfVar.mo13565t(i3, i3 + i5, C6487cs.f19253a);
                    } else if (i3 < i4) {
                        cfVar.mo13565t(i3 - i5, i3, C6487cs.f19254b);
                    }
                }
                mVar.mo13636h(this.f19172a.f19212e, p, o, new C6276fs());
            }
            boolean z2 = this.f19172a.f19210c.mo13487i() == 1;
            int i6 = -2;
            int size = View.MeasureSpec.getMode(p) == 1073741824 ? View.MeasureSpec.getSize(p) : z2 ? -1 : -2;
            if (View.MeasureSpec.getMode(o) == 1073741824) {
                i6 = View.MeasureSpec.getSize(o);
            } else if (!z2) {
                i6 = -1;
            }
            lithoView.setLayoutParams(new C6472cd(size, i6, p, o, d.mo13530l()));
            lithoView.mo12729B(mVar.mo13631b());
            lithoView.post(new C6469ca(lithoView));
            if (mVar.mo13632d().mo13522d() != null && mVar.f19499a.get() == 0) {
                lithoView.f17943s = new C6470cb(this, lithoView);
            }
            if (z) {
                C6474cf cfVar2 = this.f19172a;
                lithoView.f17946v = new C6206dz(cfVar2.f19233z, cfVar2.f19181A, i3 == getItemCount(), z2);
            } else {
                lithoView.f17946v = null;
            }
        } else {
            C6464bw bwVar = (C6464bw) ghVar2;
            C6399b e = d.mo13523e();
            int i7 = C6464bw.f19147c;
            bwVar.f19149b = e;
            e.mo13407a(bwVar.itemView);
        }
        boolean z3 = C6180a.f18234a;
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C6492cx cxVar = this.f19172a.f19184D;
        if (i == cxVar.f19259c) {
            return new C6464bw(new LithoView(this.f19172a.f19212e, (AttributeSet) null), true);
        }
        return new C6464bw(((C6400c) cxVar.f19257a.get(i)).mo13409a(this.f19172a.f19212e.f19009b, viewGroup), false);
    }

    public final void onViewRecycled(C0673gh ghVar) {
        if (ghVar instanceof C6464bw) {
            C6464bw bwVar = (C6464bw) ghVar;
            int i = C6464bw.f19147c;
            if (!bwVar.f19148a) {
                C6399b bVar = bwVar.f19149b;
                if (bVar != null) {
                    bVar.mo13408b(ghVar.itemView);
                    bwVar.f19149b = null;
                    return;
                }
                return;
            }
            LithoView lithoView = (LithoView) ghVar.itemView;
            lithoView.mo12731D();
            lithoView.mo12729B((ComponentTree) null);
            lithoView.f17946v = null;
            return;
        }
        throw null;
    }
}
