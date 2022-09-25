package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14740j;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14130bd;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14346fv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14423ir;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14424is;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14425it;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15340n;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.cx */
/* compiled from: PG */
public final class C15069cx implements C15006ao {

    /* renamed from: a */
    public static final C59071e f45204a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.a.cx");

    /* renamed from: b */
    public static final int[] f45205b = {R.id.contact_one, R.id.contact_two, R.id.contact_three};

    /* renamed from: c */
    public final C14986h f45206c;

    /* renamed from: d */
    public final C69464a f45207d;

    /* renamed from: e */
    public final C15340n f45208e;

    /* renamed from: f */
    public final C86124t f45209f;

    /* renamed from: g */
    public final C14132bf f45210g;

    /* renamed from: h */
    public final CompoundButton.OnCheckedChangeListener f45211h;

    /* renamed from: i */
    public final C15352z f45212i;

    /* renamed from: j */
    public final C21370a f45213j;

    /* renamed from: k */
    public boolean f45214k;

    /* renamed from: l */
    public View f45215l;

    /* renamed from: m */
    public View f45216m;

    /* renamed from: n */
    public RecyclerView f45217n;

    /* renamed from: o */
    public TextView f45218o;

    /* renamed from: p */
    public TextView f45219p;

    /* renamed from: q */
    public TextView f45220q;

    /* renamed from: r */
    public SwitchCompat f45221r;

    /* renamed from: s */
    public ViewGroup f45222s;

    /* renamed from: t */
    public ViewGroup f45223t;

    /* renamed from: u */
    public ViewGroup f45224u;

    /* renamed from: v */
    public TextView f45225v;

    /* renamed from: w */
    public ViewGroup f45226w;

    /* renamed from: x */
    public ImageView f45227x;

    /* renamed from: y */
    public ImageView f45228y;

    /* renamed from: z */
    public C14346fv f45229z;

    public C15069cx(C14986h hVar, C21370a aVar, C69464a aVar2, C15340n nVar, C86124t tVar, C14132bf bfVar, C15352z zVar) {
        this.f45206c = hVar;
        this.f45213j = aVar;
        this.f45207d = aVar2;
        this.f45208e = nVar;
        this.f45209f = tVar;
        this.f45210g = bfVar;
        this.f45211h = new C14130bd(bfVar, new C15062cq(hVar));
        this.f45212i = zVar;
    }

    /* renamed from: a */
    public final View mo21891a() {
        View view = this.f45215l;
        view.getClass();
        return view;
    }

    /* renamed from: b */
    public final void mo21929b(Optional optional, C60214n nVar, C14424is isVar) {
        if (mo21930c()) {
            C59104x d = f45204a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MsgCenterRend");
            ((C59052c) ((C59052c) d).mo56372aa(45968)).mo56386p("Skipping send message due to ongoing call.");
        } else if (optional.isPresent()) {
            C14986h hVar = this.f45206c;
            C14636z zVar = (C14636z) optional.get();
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14423ir irVar = (C14423ir) C14425it.f43635f.createBuilder();
            irVar.copyOnWrite();
            nVar.getClass();
            ((C14425it) irVar.instance).f43640d = nVar;
            irVar.copyOnWrite();
            ((C14425it) irVar.instance).f43637a = 2;
            irVar.copyOnWrite();
            ((C14425it) irVar.instance).f43641e = isVar.getNumber();
            irVar.copyOnWrite();
            zVar.getClass();
            ((C14425it) irVar.instance).f43638b = zVar;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14425it itVar = (C14425it) irVar.build();
            itVar.getClass();
            lfVar.f43801d = itVar;
            lfVar.f43800c = 16;
            hVar.mo21875g((C14492lf) gtVar.build());
        } else {
            this.f45206c.mo21875g(C14740j.m31037a(nVar, isVar));
        }
    }

    /* renamed from: c */
    public final boolean mo21930c() {
        C14346fv fvVar = this.f45229z;
        if (fvVar == null) {
            return false;
        }
        return fvVar.f43413e;
    }
}
