package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import android.content.res.Resources;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e;
import com.google.android.apps.gsa.search.shared.actions.util.C87486h;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.j */
/* compiled from: PG */
final class C93343j implements C93358y {

    /* renamed from: a */
    final /* synthetic */ List f260329a;

    /* renamed from: b */
    final /* synthetic */ C86124t f260330b;

    /* renamed from: c */
    final /* synthetic */ String f260331c;

    /* renamed from: d */
    final /* synthetic */ C93344k f260332d;

    public C93343j(C93344k kVar, List list, C86124t tVar, String str) {
        this.f260332d = kVar;
        this.f260329a = list;
        this.f260330b = tVar;
        this.f260331c = str;
    }

    /* renamed from: a */
    public final int mo87641a() {
        return this.f260329a.size();
    }

    /* renamed from: b */
    public final C93333aa mo87642b() {
        return this.f260332d.f260333a;
    }

    /* renamed from: c */
    public final C93333aa mo87643c() {
        return this.f260332d.f260334b;
    }

    /* renamed from: d */
    public final Object[] mo87644d(Resources resources) {
        List list = this.f260329a;
        return new Object[]{resources.getString(R.string.spoken_cancel_command_tts), this.f260331c, C87431e.m141674e(C87486h.m142002a(resources), list.subList(0, Math.min(3, list.size()))), C87431e.m141674e(C87486h.m142002a(resources), C93348o.m153552b(C93348o.m153551a(resources, this.f260329a), this.f260330b)), resources.getString(this.f260332d.f260335c)};
    }
}
