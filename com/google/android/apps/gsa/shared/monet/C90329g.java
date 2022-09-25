package com.google.android.apps.gsa.shared.monet;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87991lc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88008lt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88009lu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88032mq;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.shared.monet.g */
/* compiled from: PG */
public final class C90329g {

    /* renamed from: a */
    public static final C59071e f252261a = C59071e.m91332i("com.google.android.apps.gsa.shared.monet.g");

    /* renamed from: b */
    public final C87680ah f252262b;

    /* renamed from: c */
    public final Queue f252263c = new ArrayDeque();

    /* renamed from: d */
    public final C58833ax f252264d;

    /* renamed from: e */
    public boolean f252265e = false;

    /* renamed from: f */
    private final C90348s f252266f;

    /* renamed from: g */
    private final C90160aa f252267g;

    public C90329g(C90348s sVar, C87680ah ahVar, C90160aa aaVar, C58833ax axVar) {
        this.f252266f = sVar;
        this.f252262b = ahVar;
        this.f252267g = aaVar;
        this.f252264d = axVar;
    }

    /* renamed from: a */
    public final void mo84021a(C88032mq mqVar, Parcelable parcelable) {
        if (parcelable instanceof Intent) {
            Intent intent = (Intent) parcelable;
            if (this.f252267g.mo83911c()) {
                this.f252267g.mo83909a().startActivityForResult(intent, mqVar.f238051b);
                return;
            }
            C91097g b = this.f252267g.mo83910b();
            C58838bb.m90883r(b.mo65092d());
            b.mo65090b(intent, new C90316e(this, mqVar));
        } else if (parcelable instanceof IntentSender) {
            IntentSender intentSender = (IntentSender) parcelable;
            if (this.f252267g.mo83911c()) {
                try {
                    this.f252267g.mo83909a().startIntentSenderForResult(intentSender, mqVar.f238051b, (Intent) null, 0, 0, 0);
                } catch (IntentSender.SendIntentException e) {
                    C59104x c = f252261a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "MonetIntentStartReqHan");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10735)).mo56386p("Could not send intent.");
                }
            } else {
                C91097g b2 = this.f252267g.mo83910b();
                C58838bb.m90883r(b2.mo65093e());
                b2.mo65091c(intentSender, new C90322f(this, mqVar));
            }
        } else {
            throw new IllegalArgumentException("Invalid data type ".concat(String.valueOf(parcelable.getClass().getName())));
        }
    }

    /* renamed from: b */
    public final void mo84022b(int i, int i2, Intent intent) {
        C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
        String str = this.f252266f.f252332a;
        lcVar.copyOnWrite();
        C88012lx lxVar = (C88012lx) lcVar.instance;
        str.getClass();
        lxVar.f238012a |= 512;
        lxVar.f238015d = str;
        C88008lt ltVar = (C88008lt) C88009lu.f237999d.createBuilder();
        ltVar.copyOnWrite();
        C88009lu luVar = (C88009lu) ltVar.instance;
        luVar.f238001a |= 1;
        luVar.f238002b = i;
        ltVar.copyOnWrite();
        C88009lu luVar2 = (C88009lu) ltVar.instance;
        luVar2.f238001a |= 2;
        luVar2.f238003c = i2;
        lcVar.copyOnWrite();
        C88012lx lxVar2 = (C88012lx) lcVar.instance;
        C88009lu luVar3 = (C88009lu) ltVar.build();
        luVar3.getClass();
        lxVar2.f238014c = luVar3;
        lxVar2.f238013b = 11;
        C88012lx lxVar3 = (C88012lx) lcVar.build();
        if (intent == null) {
            intent = new Intent();
        }
        C88489j jVar = new C88489j(C87739bu.MONET_CLIENT_EVENT);
        jVar.mo82014b(C87987kz.f237952a, lxVar3);
        jVar.mo82015c(intent);
        ClientEventData a = jVar.mo82013a();
        if (this.f252265e) {
            this.f252262b.mo81961c(a);
        } else {
            this.f252263c.add(a);
        }
    }
}
