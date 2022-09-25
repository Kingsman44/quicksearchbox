package com.facebook.litho.widget;

import android.view.View;
import com.facebook.litho.C6099aj;

/* renamed from: com.facebook.litho.widget.bo */
/* compiled from: PG */
final class C6456bo implements C6099aj {

    /* renamed from: a */
    final /* synthetic */ C6548m f19138a;

    /* renamed from: b */
    final /* synthetic */ C6474cf f19139b;

    public C6456bo(C6474cf cfVar, C6548m mVar) {
        this.f19139b = cfVar;
        this.f19138a = mVar;
    }

    /* renamed from: a */
    public final void mo12848a(int i, int i2) {
        int i3;
        C6548m mVar = this.f19138a;
        if (mVar.mo13630a() != i2) {
            mVar.mo13639k(i2);
            C6474cf cfVar = this.f19139b;
            if (cfVar.f19229v == null) {
                i3 = -1;
            } else if (cfVar.f19210c.mo13487i() == 0) {
                i3 = cfVar.f19229v.f18536b;
            } else {
                i3 = cfVar.f19229v.f18535a;
            }
            if (i3 == -1 || this.f19138a.mo13630a() > i3) {
                synchronized (this.f19139b) {
                    C6474cf cfVar2 = this.f19139b;
                    if (cfVar2.f19229v != null) {
                        int size = cfVar2.f19203a.size();
                        int i4 = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            int a = ((C6548m) cfVar2.f19203a.get(i5)).mo13630a();
                            if (a > i4) {
                                i4 = a;
                            }
                        }
                        if (i4 != cfVar2.f19229v.f18536b) {
                            int max = Math.max(cfVar2.f19210c.mo13479a(View.MeasureSpec.getSize(cfVar2.f19222o), View.MeasureSpec.getSize(cfVar2.f19223p), i, i4), 1);
                            cfVar2.f19229v.f18536b = i4;
                            cfVar2.f19228u = max;
                        }
                    }
                    this.f19139b.mo13556H();
                }
            }
        }
    }
}
