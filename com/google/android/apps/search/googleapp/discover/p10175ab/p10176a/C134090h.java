package com.google.android.apps.search.googleapp.discover.p10175ab.p10176a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.p1649b.p1650a.C19606c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.discover.ab.a.h */
/* compiled from: PG */
public final class C134090h extends C19606c {

    /* renamed from: d */
    private final Map f365270d;

    public C134090h(ViewGroup viewGroup, Map map) {
        super(viewGroup);
        this.f365270d = map;
    }

    /* renamed from: a */
    public final C60214n mo24928a(View view) {
        if (!this.f365270d.containsKey(view)) {
            return null;
        }
        return ((C134091i) this.f365270d.get(view)).f365271a;
    }

    /* renamed from: b */
    public final boolean mo24929b(View view) {
        return this.f365270d.containsKey(view);
    }

    /* renamed from: c */
    public final C60931s mo24930c(View view) {
        if (!this.f365270d.containsKey(view)) {
            return null;
        }
        return ((C134091i) this.f365270d.get(view)).f365272b;
    }

    /* renamed from: d */
    public final boolean mo24931d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo24932e() {
        return true;
    }
}
