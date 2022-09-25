package com.google.apps.tiktok.tracing;

import android.app.Service;
import android.content.Intent;

/* renamed from: com.google.apps.tiktok.tracing.bb */
/* compiled from: PG */
public final class C47550bb {

    /* renamed from: a */
    public final Service f123400a;

    /* renamed from: b */
    C47573bx f123401b;

    public C47550bb(Service service) {
        this.f123400a = service;
    }

    /* renamed from: g */
    private final C47573bx m84635g(String str) {
        if (C47831fm.m85027v()) {
            return null;
        }
        C47770dh b = C47775dm.m84931b(this.f123400a);
        String simpleName = this.f123400a.getClass().getSimpleName();
        return b.mo51615e(str + " " + simpleName, C47569bt.f123457b);
    }

    /* renamed from: a */
    public final C47573bx mo51409a(Intent intent) {
        C47572bw d = C47831fm.m85009d();
        Service service = this.f123400a;
        return new C47540az(C47831fm.m85024s(mo51413e("onBind")), C47552bd.m84642a(service, intent, String.valueOf(service.getClass().getName()).concat(".onBind"), false), d);
    }

    /* renamed from: b */
    public final C47573bx mo51410b() {
        C47538ax axVar;
        C47572bw d = C47831fm.m85009d();
        if (!C47831fm.m85027v()) {
            C47572bw g = C47831fm.m85012g();
            if (g != null) {
                C47549ba baVar = new C47549ba();
                C47831fm.m85013h(g);
                C47561bl b = C47562bm.f123426a.mo51423b();
                b.mo51422a(C47569bt.f123458c, baVar);
                this.f123401b = C47831fm.m85025t("Creating ".concat(String.valueOf(this.f123400a.getClass().getSimpleName())), ((C47563bn) b).mo51424e(), true);
                axVar = g;
            } else {
                axVar = C47775dm.m84931b(this.f123400a).mo51615e("Creating ".concat(String.valueOf(this.f123400a.getClass().getSimpleName())), C47569bt.f123457b);
            }
        } else {
            axVar = null;
        }
        return new C47539ay(this, C47831fm.m85024s(mo51413e("onCreate")), axVar, d);
    }

    /* renamed from: c */
    public final C47573bx mo51411c(String str) {
        C47572bw d = C47831fm.m85009d();
        return new C47540az(C47831fm.m85024s(mo51413e(str)), m84635g(str), d);
    }

    /* renamed from: d */
    public final C47573bx mo51412d() {
        C47572bw d = C47831fm.m85009d();
        return new C47540az(C47831fm.m85024s(mo51413e("onDestroy")), m84635g("Destroying"), d);
    }

    /* renamed from: e */
    public final String mo51413e(String str) {
        String simpleName = this.f123400a.getClass().getSimpleName();
        return str + " " + simpleName;
    }

    /* renamed from: f */
    public final C47573bx mo51414f() {
        C47572bw d = C47831fm.m85009d();
        return new C47540az(C47831fm.m85024s(mo51413e("onUnbind")), m84635g("Unbinding"), d);
    }
}
