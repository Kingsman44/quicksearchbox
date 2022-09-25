package com.google.android.apps.gsa.staticplugins.p7912eh.p7913a;

import android.content.Context;
import androidx.mediarouter.p175a.C3687aw;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.eh.a.a */
/* compiled from: PG */
final class C100530a extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ Context f281072a;

    /* renamed from: b */
    final /* synthetic */ C100535f f281073b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100530a(C100535f fVar, Context context) {
        super("Cast MediaRouter Getter");
        this.f281073b = fVar;
        this.f281072a = context;
    }

    public final void run() {
        C90476a aVar = C91018d.f254254a;
        try {
            this.f281073b.f281084g = C3687aw.m10683e(this.f281072a);
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C100535f.f281078a.mo56225c()).mo56382g(th)).mo56372aa(33492)).mo56386p("Cannot initial MediaRouter, continuing");
            this.f281073b.f281084g = null;
        }
    }
}
