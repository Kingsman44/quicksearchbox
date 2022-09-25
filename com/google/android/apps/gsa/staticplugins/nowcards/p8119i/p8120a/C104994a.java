package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8120a;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7817la;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.a.a */
/* compiled from: PG */
public final class C104994a {

    /* renamed from: a */
    public String f292494a;

    /* renamed from: b */
    public List f292495b;

    /* renamed from: c */
    public String f292496c;

    /* renamed from: d */
    public C7718hj f292497d;

    /* renamed from: e */
    private final Context f292498e;

    /* renamed from: f */
    private final String f292499f;

    /* renamed from: g */
    private C9141ad f292500g;

    public C104994a(Context context, String str) {
        this.f292498e = context;
        this.f292499f = str;
    }

    /* renamed from: a */
    public final C9278v mo94435a() {
        C104997d dVar = new C104997d(this.f292498e, C9277u.METADATA_CARD_HEADER, this.f292497d);
        dVar.f292522p = R.style.small_content_module_header;
        dVar.f292507a.mo94437a(C7817la.TITLE).mo28283c(this.f292499f);
        if (!TextUtils.isEmpty(this.f292494a)) {
            dVar.f292507a.mo94437a(C7817la.TEXTLINE).mo28283c(this.f292494a);
        }
        List list = this.f292495b;
        if (list != null && !list.isEmpty()) {
            dVar.f292507a.mo94439c(this.f292495b);
        }
        if (!TextUtils.isEmpty(this.f292496c)) {
            dVar.f292507a.mo94437a(C7817la.JUSTIFICATION).mo28283c(this.f292496c);
        }
        C9273q qVar = (C9273q) dVar.mo94440a().toBuilder();
        C9141ad adVar = this.f292500g;
        if (!(adVar == null || this.f292497d == null)) {
            qVar.copyOnWrite();
            C9278v vVar = (C9278v) qVar.instance;
            vVar.f32169C = adVar;
            vVar.f32192a |= 67108864;
        }
        C7718hj hjVar = this.f292497d;
        if (hjVar != null) {
            qVar.copyOnWrite();
            C9278v vVar2 = (C9278v) qVar.instance;
            vVar2.f32174H = hjVar;
            vVar2.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        }
        return (C9278v) qVar.build();
    }

    /* renamed from: b */
    public final void mo94436b(C9141ad adVar, C7718hj hjVar) {
        this.f292500g = adVar;
        hjVar.getClass();
        this.f292497d = hjVar;
    }
}
