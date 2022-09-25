package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14368gq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14370gs;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.i */
/* compiled from: PG */
public final class C14708i implements C14653a, C14985g {

    /* renamed from: a */
    public boolean f44456a = true;

    /* renamed from: b */
    public boolean f44457b;

    /* renamed from: c */
    public Optional f44458c = Optional.empty();

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        this.f44456a = true;
        this.f44457b = false;
        this.f44458c = Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final boolean mo21623h(C14492lf lfVar, C14324f fVar, C14938e eVar, C14749d dVar) {
        C14370gs gsVar;
        if (lfVar.f43800c == 24) {
            gsVar = (C14370gs) lfVar.f43801d;
        } else {
            gsVar = C14370gs.f43489c;
        }
        int i = gsVar.f43491a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            this.f44456a = false;
            this.f44458c = Optional.empty();
            return true;
        } else if (i3 == 2) {
            this.f44457b = true;
            return true;
        } else if (i3 != 3) {
            return false;
        } else {
            C14368gq gqVar = gsVar.f43492b;
            if (gqVar == null) {
                gqVar = C14368gq.f43485c;
            }
            int i4 = gqVar.f43487a;
            C14368gq gqVar2 = gsVar.f43492b;
            if (gqVar2 == null) {
                gqVar2 = C14368gq.f43485c;
            }
            this.f44458c = Optional.m71637of(new C14706g(i4, gqVar2.f43488b));
            this.f44457b = false;
            return true;
        }
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
        C0027c a = C0027c.m9a(fVar.f43332a);
        if (a == null) {
            a = C0027c.UNRECOGNIZED;
        }
        if (a.equals(C0027c.MICRO) && aVar.mo21708b()) {
            this.f44456a = true;
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
    }
}
