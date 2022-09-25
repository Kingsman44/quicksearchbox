package com.google.android.apps.gsa.staticplugins.nowcards;

import android.content.Context;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91668g;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104336bk;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104349m;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104961g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104979y;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.bp */
/* compiled from: PG */
public final class C104377bp implements C104336bk {

    /* renamed from: a */
    private static final C59071e f290430a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.bp");

    /* renamed from: b */
    private final C104961g f290431b;

    /* renamed from: c */
    private final C104979y f290432c;

    /* renamed from: d */
    private final Map f290433d = new HashMap();

    public C104377bp(Set set, C104961g gVar, C104979y yVar) {
        this.f290431b = gVar;
        this.f290432c = yVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C104349m mVar = (C104349m) it.next();
            for (C9277u put : mVar.mo94017b()) {
                this.f290433d.put(put, mVar);
            }
        }
    }

    /* renamed from: a */
    public final C91668g mo86092a(Context context, C9277u uVar) {
        return mo94096b(context, uVar);
    }

    /* renamed from: b */
    public final C104348l mo94096b(Context context, C9277u uVar) {
        C104349m mVar = (C104349m) this.f290433d.get(uVar);
        if (mVar != null) {
            return mVar.mo94016a(context);
        }
        C9277u uVar2 = C9277u.UNKNOWN;
        int ordinal = uVar.ordinal();
        if (ordinal == 46) {
            return this.f290431b.mo94423a(context, this);
        }
        if (ordinal == 47) {
            return this.f290431b.mo94423a(context, this);
        }
        if (ordinal == 50) {
            return this.f290432c.mo94429a(context, this);
        }
        C59104x d = f290430a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ModulePresenterFactory");
        ((C59052c) ((C59052c) d).mo56372aa(21927)).mo56389s("Unknown card module type requested: %s", uVar);
        return null;
    }
}
