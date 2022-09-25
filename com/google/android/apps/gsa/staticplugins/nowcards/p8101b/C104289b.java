package com.google.android.apps.gsa.staticplugins.nowcards.p8101b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91663b;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91666e;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91668g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91738a;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7648eu;
import com.google.p375ai.p378b.C7718hj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.b.b */
/* compiled from: PG */
public final class C104289b implements C91671j, C91666e {

    /* renamed from: d */
    private static final C59071e f290072d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.b.b");

    /* renamed from: a */
    public C7718hj f290073a;

    /* renamed from: b */
    C91667f f290074b;

    /* renamed from: c */
    public final C89291a f290075c;

    /* renamed from: e */
    private final List f290076e;

    public C104289b(C7718hj hjVar, List list, C89291a aVar) {
        new ArrayList();
        this.f290073a = hjVar;
        this.f290076e = list;
        this.f290075c = aVar;
        C7648eu euVar = hjVar.f26934F;
        euVar = euVar == null ? C7648eu.f26542o : euVar;
        C91667f fVar = null;
        if (euVar != null && (euVar.f26544a & 32768) != 0) {
            long j = euVar.f26555l;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((C59052c) ((C59052c) f290072d.mo56226d()).mo56372aa(21977)).mo56386p("Empty Cluster card was defined but not found as a child.");
                    break;
                }
                C91667f fVar2 = (C91667f) it.next();
                if (fVar2.mo86085g().f26969j == j) {
                    fVar = fVar2;
                    break;
                }
            }
        }
        this.f290074b = fVar;
        if (fVar != null && this.f290076e.size() > 1) {
            this.f290074b.mo86088j(8);
        }
    }

    /* renamed from: a */
    public final boolean mo86079a() {
        return this.f290074b != null;
    }

    /* renamed from: b */
    public final void mo86080b() {
        C91667f fVar = this.f290074b;
        if (fVar != null) {
            fVar.mo86088j(0);
        }
    }

    /* renamed from: c */
    public final C1970e mo86081c() {
        return null;
    }

    /* renamed from: d */
    public final C91663b mo86082d(C7718hj hjVar) {
        if (hjVar.equals(this.f290073a)) {
            return C91663b.m149981c(0);
        }
        for (C91667f fVar : this.f290076e) {
            if (hjVar.equals(fVar.mo86085g())) {
                return fVar.mo86082d(hjVar);
            }
        }
        return C91663b.f255651a;
    }

    /* renamed from: e */
    public final C91667f mo86083e() {
        return null;
    }

    /* renamed from: f */
    public final C9270n mo86084f(Context context) {
        return null;
    }

    /* renamed from: g */
    public final C7718hj mo86085g() {
        return this.f290073a;
    }

    /* renamed from: h */
    public final void mo86086h(C7718hj hjVar) {
        this.f290073a = hjVar;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo86087i(boolean z) {
    }

    /* renamed from: j */
    public final void mo86088j(int i) {
        ((C59052c) ((C59052c) f290072d.mo56225c()).mo56372aa(21978)).mo56387q("Attempting to change ClusterVisibility to %d, which is not supported", i);
    }

    /* renamed from: k */
    public final void mo86089k(C91738a aVar) {
    }

    /* renamed from: l */
    public final void mo86090l(C7718hj hjVar, C7718hj hjVar2) {
    }

    /* renamed from: m */
    public final int mo86098m() {
        return 0;
    }

    /* renamed from: n */
    public final int mo86099n() {
        return 0;
    }

    /* renamed from: o */
    public final int mo86100o(C91668g gVar) {
        return 0;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    /* renamed from: p */
    public final ViewGroup mo86101p() {
        return null;
    }

    /* renamed from: q */
    public final void mo86102q(C91668g gVar) {
    }

    /* renamed from: r */
    public final void mo86103r(boolean z) {
    }

    /* renamed from: s */
    public final void mo86104s(int i) {
    }

    /* renamed from: t */
    public final void mo86105t(List list) {
    }
}
