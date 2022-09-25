package com.google.android.apps.gsa.staticplugins.p7388al;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.p */
/* compiled from: PG */
final class C93942p implements C83992d {

    /* renamed from: a */
    final l f262324a;

    /* renamed from: b */
    final /* synthetic */ C93943q f262325b;

    /* renamed from: c */
    private boolean f262326c;

    public C93942p(C93943q qVar, l lVar) {
        this.f262325b = qVar;
        this.f262324a = lVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo77436a() {
        return 1;
    }

    /* renamed from: b */
    public final int mo77437b() {
        return this.f262325b.f262343o.b(this.f262324a.a(), (String) null);
    }

    /* renamed from: c */
    public final /* synthetic */ Drawable mo77438c() {
        return null;
    }

    /* renamed from: d */
    public final CharSequence mo77439d() {
        l lVar = this.f262324a;
        if (lVar.f != 1) {
            return lVar.d();
        }
        C89824t tVar = this.f262324a.a;
        tVar.getClass();
        return (CharSequence) C90730an.m148189b(C58833ax.m90833j(lVar.d()), C58833ax.m90834k(tVar.mo83663a().mo83651f())).mo56107c();
    }

    /* renamed from: e */
    public final /* synthetic */ CharSequence mo77440e() {
        return null;
    }

    /* renamed from: f */
    public final void mo77441f(boolean z) {
        this.f262326c = z;
        if (z || !this.f262325b.f262348t.mo77447a().isEmpty()) {
            this.f262325b.f262350v.setEnabled(true);
        } else {
            this.f262325b.f262350v.setEnabled(false);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo77442g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo77443h() {
        return true;
    }

    /* renamed from: i */
    public final boolean mo77444i() {
        return this.f262326c;
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo77445j() {
        return false;
    }
}
