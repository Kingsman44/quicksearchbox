package com.google.ads.interactivemedia.p367v3.internal;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aj */
/* compiled from: PG */
public final class C6791aj {

    /* renamed from: a */
    private final HashMap f20731a = new HashMap();

    /* renamed from: b */
    private final HashMap f20732b = new HashMap();

    /* renamed from: c */
    private final HashMap f20733c = new HashMap();

    /* renamed from: d */
    private final HashSet f20734d = new HashSet();

    /* renamed from: e */
    private final HashSet f20735e = new HashSet();

    /* renamed from: f */
    private final HashSet f20736f = new HashSet();

    /* renamed from: g */
    private final HashMap f20737g = new HashMap();

    /* renamed from: h */
    private boolean f20738h;

    /* renamed from: a */
    public final HashSet mo14857a() {
        return this.f20735e;
    }

    /* renamed from: b */
    public final HashSet mo14858b() {
        return this.f20736f;
    }

    /* renamed from: c */
    public final String mo14859c(String str) {
        return (String) this.f20737g.get(str);
    }

    /* renamed from: d */
    public final void mo14860d() {
        String str;
        C7190p a = C7190p.m21443a();
        if (a != null) {
            for (C7001i iVar : a.mo16268f()) {
                View j = iVar.mo16005j();
                if (iVar.mo16006k()) {
                    String i = iVar.mo16004i();
                    if (j != null) {
                        if (j.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = j;
                            while (true) {
                                if (view == null) {
                                    this.f20734d.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                                String c = C6904ek.m20302c(view);
                                if (c != null) {
                                    str = c;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.f20735e.add(i);
                            this.f20731a.put(j, i);
                            for (C7271s sVar : iVar.mo16002g()) {
                                View view2 = (View) sVar.mo16423d().get();
                                if (view2 != null) {
                                    C6790ai aiVar = (C6790ai) this.f20732b.get(view2);
                                    if (aiVar != null) {
                                        aiVar.mo14795a(iVar.mo16004i());
                                    } else {
                                        this.f20732b.put(view2, new C6790ai(sVar, iVar.mo16004i()));
                                    }
                                }
                            }
                        } else {
                            this.f20736f.add(i);
                            this.f20733c.put(i, j);
                            this.f20737g.put(i, str);
                        }
                    } else {
                        this.f20736f.add(i);
                        this.f20737g.put(i, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo14861e() {
        this.f20731a.clear();
        this.f20732b.clear();
        this.f20733c.clear();
        this.f20734d.clear();
        this.f20735e.clear();
        this.f20736f.clear();
        this.f20737g.clear();
        this.f20738h = false;
    }

    /* renamed from: f */
    public final void mo14862f() {
        this.f20738h = true;
    }

    /* renamed from: g */
    public final String mo14863g(View view) {
        if (this.f20731a.size() == 0) {
            return null;
        }
        String str = (String) this.f20731a.get(view);
        if (str != null) {
            this.f20731a.remove(view);
        }
        return str;
    }

    /* renamed from: h */
    public final View mo14864h(String str) {
        return (View) this.f20733c.get(str);
    }

    /* renamed from: i */
    public final C6790ai mo14865i(View view) {
        C6790ai aiVar = (C6790ai) this.f20732b.get(view);
        if (aiVar != null) {
            this.f20732b.remove(view);
        }
        return aiVar;
    }

    /* renamed from: j */
    public final int mo14866j(View view) {
        if (this.f20734d.contains(view)) {
            return 1;
        }
        return this.f20738h ? 2 : 3;
    }
}
