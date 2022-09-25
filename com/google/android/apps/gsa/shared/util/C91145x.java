package com.google.android.apps.gsa.shared.util;

import android.util.LruCache;
import android.util.Pair;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116938w;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116939x;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.util.x */
/* compiled from: PG */
final class C91145x extends LruCache {

    /* renamed from: a */
    final /* synthetic */ C91147z f254472a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91145x(C91147z zVar, int i) {
        super(i);
        this.f254472a = zVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        boolean z;
        long j;
        C91147z zVar = this.f254472a;
        C116938w wVar = zVar.f254480d;
        if (wVar == null) {
            return null;
        }
        try {
            z = Boolean.valueOf(wVar.f324661a.getLaunchIntentForPackage((String) obj) != null);
        } catch (RuntimeException e) {
            C59104x c = C116939x.f324662a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.r.NonLaunchTwiddler");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32507)).mo56386p("Package manager crashed.");
            z = false;
        }
        C21370a aVar = zVar.f254479c;
        if (aVar == null) {
            j = 0;
        } else {
            j = aVar.mo26870b();
        }
        return Pair.create(Long.valueOf(j), z);
    }
}
