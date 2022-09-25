package com.google.android.libraries.search.silk.p3162a.p3179q;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.silk.p3205a.p3235x.C41738a;
import com.google.android.libraries.silk.p3205a.p3235x.C41739b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56840e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56841f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56842g;

/* renamed from: com.google.android.libraries.search.silk.a.q.i */
/* compiled from: PG */
public final class C40634i implements C41739b {

    /* renamed from: a */
    private static final C56842g f106642a;

    /* renamed from: b */
    private final Context f106643b;

    static {
        C56841f fVar = (C56841f) C56842g.f151655c.createBuilder();
        fVar.copyOnWrite();
        C56842g gVar = (C56842g) fVar.instance;
        gVar.f151658b = 0;
        gVar.f151657a |= 1;
        f106642a = (C56842g) fVar.build();
    }

    public C40634i(Context context) {
        this.f106643b = context;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo42573a() {
        return C41738a.m73193a();
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo42574b() {
        return C41738a.m73194b();
    }

    /* renamed from: c */
    public final C60870cx mo42575c(C56840e eVar) {
        Context context = this.f106643b;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(268435456);
        int i = eVar.f151650a;
        if ((i & 4) != 0) {
            intent.putExtra("android.intent.extra.TEXT", eVar.f151653d).setType("text/plain");
        } else if ((i & 2) != 0) {
            intent.putExtra("android.intent.extra.TEXT", eVar.f151652c).setType("text/plain");
        }
        Intent createChooser = Intent.createChooser(intent, eVar.f151651b);
        createChooser.addFlags(268435456);
        context.startActivity(createChooser);
        return C60856cj.m92900i(f106642a);
    }
}
