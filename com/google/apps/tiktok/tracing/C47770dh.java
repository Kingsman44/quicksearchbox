package com.google.apps.tiktok.tracing;

import android.widget.PopupMenu;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.tracing.dh */
/* compiled from: PG */
public final class C47770dh {

    /* renamed from: a */
    public final C47781dq f123762a;

    /* renamed from: b */
    public final C47563bn f123763b;

    /* renamed from: c */
    public final C47813ev f123764c;

    public C47770dh(C47781dq dqVar, Set set, C47813ev evVar) {
        this.f123762a = dqVar;
        this.f123763b = C47563bn.m84653c(set);
        this.f123764c = evVar;
    }

    /* renamed from: a */
    public PopupMenu.OnMenuItemClickListener mo51611a(PopupMenu.OnMenuItemClickListener onMenuItemClickListener, String str) {
        return new C47588cl(this, str, onMenuItemClickListener);
    }

    /* renamed from: b */
    public final C47538ax mo51612b(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        return mo51613c(simpleName + ": " + str);
    }

    /* renamed from: c */
    public final C47538ax mo51613c(String str) {
        return this.f123762a.mo51621b(str, this.f123763b, this.f123764c);
    }

    /* renamed from: d */
    public final C47538ax mo51614d(long j, long j2) {
        return this.f123762a.mo51622c("Application creation", this.f123763b, j, j2, this.f123764c);
    }

    /* renamed from: e */
    public final C47538ax mo51615e(String str, C47563bn bnVar) {
        return this.f123762a.mo51621b(str, C47563bn.m84654d(this.f123763b, bnVar), this.f123764c);
    }

    /* renamed from: f */
    public final C47573bx mo51616f(String str) {
        return !C47831fm.m85027v() ? mo51617g(str, C47562bm.f123426a) : C47756cu.f123737a;
    }

    /* renamed from: g */
    public final C47571bv mo51617g(String str, C47563bn bnVar) {
        return this.f123762a.mo51623d(str, C47563bn.m84654d(this.f123763b, bnVar), this.f123764c);
    }
}
