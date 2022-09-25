package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6383h;

import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80832ak;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80853be;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80854bf;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.h.v */
/* compiled from: PG */
final class C81655v implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ C81656w f223316a;

    /* renamed from: b */
    private int f223317b = 0;

    /* renamed from: c */
    private final long f223318c;

    public C81655v(C81656w wVar) {
        this.f223316a = wVar;
        this.f223318c = wVar.f223323e.mo85399d(C90040cs.f248641H);
    }

    public final boolean onPreDraw() {
        int i = this.f223317b + 1;
        this.f223317b = i;
        long j = (long) i;
        long j2 = this.f223318c;
        if (j < j2) {
            this.f223316a.f223320b.invalidate();
            return true;
        } else if (j > j2) {
            this.f223316a.f223320b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        } else {
            boolean z = this.f223316a.f223320b.getAlpha() == 0.0f;
            C81564g gVar = this.f223316a.f223324f;
            C80832ak akVar = (C80832ak) C80833al.f221756c.createBuilder();
            C80853be beVar = (C80853be) C80854bf.f221795b.createBuilder();
            beVar.copyOnWrite();
            ((C80854bf) beVar.instance).f221797a = z;
            C80854bf bfVar = (C80854bf) beVar.build();
            akVar.copyOnWrite();
            C80833al alVar = (C80833al) akVar.instance;
            bfVar.getClass();
            alVar.f221759b = bfVar;
            alVar.f221758a = 5;
            gVar.mo73553b((C80833al) akVar.build());
            return true;
        }
    }
}
