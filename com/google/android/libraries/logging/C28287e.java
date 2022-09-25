package com.google.android.libraries.logging;

import android.support.p033v7.widget.C0655fq;
import android.view.View;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.e */
/* compiled from: PG */
final class C28287e implements C0655fq {

    /* renamed from: a */
    final /* synthetic */ C28291i f76966a;

    public C28287e(C28291i iVar) {
        this.f76966a = iVar;
    }

    /* renamed from: a */
    public final void mo2457a(View view) {
        C28293k a;
        int childAdapterPosition;
        C28289g gVar = this.f76966a.f76970d;
        if (gVar != null && (a = gVar.mo33782a()) != null && (childAdapterPosition = this.f76966a.f76968b.getChildAdapterPosition(view)) != -1) {
            List b = a.mo33746b();
            C28292j a2 = b.size() > childAdapterPosition ? ((C28293k) b.get(childAdapterPosition)).mo33745a() : null;
            if (a2 != null) {
                C28295m.m52919e(view, a2);
                C28291i iVar = this.f76966a;
                if (iVar.f76972f) {
                    iVar.f76967a.mo33784b(view);
                } else {
                    a2.mo33794h(1);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo2458b(View view) {
        C28291i iVar = this.f76966a;
        if (iVar.f76972f) {
            iVar.f76967a.mo33783a(view);
            return;
        }
        C28292j a = C28295m.m52915a(view);
        if (a != null) {
            a.mo33794h(2);
        }
    }
}
