package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7146u.p7147a.C90617a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91803j;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105394b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105433c;
import com.google.android.gms.common.C143699aa;
import com.google.android.gms.common.C143876h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ar */
/* compiled from: PG */
public final class C105196ar extends C23056g implements C105394b {

    /* renamed from: a */
    public final C105433c f293399a;

    /* renamed from: b */
    public final C91097g f293400b;

    /* renamed from: c */
    private final C84413ad f293401c;

    /* renamed from: d */
    private final Context f293402d;

    public C105196ar(C23052c cVar, C105433c cVar2, Context context, C91097g gVar, C84413ad adVar) {
        super(cVar);
        this.f293401c = adVar;
        this.f293400b = gVar;
        this.f293402d = context;
        this.f293399a = cVar2;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91803j jVar = (C91803j) C23245b.m43557b(protoParcelable, C91803j.f256027c.getParserForType(), C62921ba.m95368a(), true);
        jVar.getClass();
        int i = jVar.f256030b;
        ((C105308y) this.f293399a).f293823c.mo28730f(Integer.valueOf(i), false);
        Resources resources = this.f293402d.getResources();
        ((C105308y) this.f293399a).f293824d.mo28730f(this.f293402d.getString(R.string.google_play_services), false);
        C23251a aVar = ((C105308y) this.f293399a).f293822b;
        C90476a aVar2 = this.f293401c.f229682c;
        aVar.mo28730f(C90617a.m147869b(resources, i), false);
        int i2 = C143699aa.f389596a;
        if (C143876h.f389991d.mo119363k((Context) null, i, (String) null) != null) {
            ((C105308y) this.f293399a).f293821a.mo28730f(C90617a.m147868a(resources, i), false);
        }
    }
}
