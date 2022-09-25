package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7148ui.RoundCornerImageView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.Collection;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.by */
/* compiled from: PG */
public final class C112772by implements C113342cm {

    /* renamed from: e */
    private static final C59071e f312584e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.by");

    /* renamed from: a */
    public final C113367dh f312585a;

    /* renamed from: b */
    public final C86124t f312586b;

    /* renamed from: c */
    public final C68214a f312587c;

    /* renamed from: d */
    public final C69464a f312588d;

    /* renamed from: f */
    private final C112694be f312589f;

    /* renamed from: g */
    private final C69464a f312590g;

    public C112772by(C113367dh dhVar, C112694be beVar, C69464a aVar, C86124t tVar, C68214a aVar2, C69464a aVar3) {
        this.f312585a = dhVar;
        this.f312589f = beVar;
        this.f312590g = aVar;
        this.f312586b = tVar;
        this.f312587c = aVar2;
        this.f312588d = aVar3;
    }

    /* renamed from: l */
    private final int m186622l() {
        return (int) this.f312586b.mo79743a(C90063do.f249301au);
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.contact_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return -1;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112771bx(view);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112771bx bxVar = (C112771bx) ghVar;
        if (bxVar.f312567a.getVisibility() == 0) {
            bxVar.f312567a.setVisibility(8);
            bxVar.f312568b.setVisibility(0);
        } else {
            bxVar.f312567a.setVisibility(0);
            bxVar.f312568b.setVisibility(8);
        }
        gVar.mo100230a(ezVar);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112771bx bxVar = (C112771bx) ghVar;
        Optional t = ezVar.mo100220t();
        if (t.isEmpty() || ((List) t.get()).isEmpty()) {
            bxVar.itemView.setVisibility(8);
            ((C59052c) ((C59052c) f312584e.mo56226d()).mo56372aa(27796)).mo56386p("contactInfos is absent or empty, no suggestion is rendered");
            return;
        }
        C58485gu j = C58485gu.m89842j((Collection) t.get());
        bxVar.itemView.setVisibility(0);
        RoundCornerImageView roundCornerImageView = bxVar.f312569c;
        RoundCornerImageView roundCornerImageView2 = bxVar.f312570d;
        roundCornerImageView.setVisibility(4);
        roundCornerImageView.setVisibility(0);
        roundCornerImageView2.setVisibility(4);
        roundCornerImageView2.setVisibility(0);
        Optional findFirst = Collection.EL.stream(j).map(C112755bh.f312541a).filter(C112756bi.f312542a).findFirst();
        Optional findFirst2 = Collection.EL.stream(j).map(C112757bj.f312543a).filter(C112758bk.f312544a).findFirst();
        if (findFirst.isPresent()) {
            C113367dh dhVar = this.f312585a;
            C113362dc d = C113363dd.m187554d();
            d.mo99987d(C113365df.m187558c(C113259al.m187318c((String) findFirst.get())), C113365df.m187558c(C113259al.m187318c("android.resource://android/drawable/ic_contact_picture")));
            d.mo99988e(true);
            dhVar.mo100144d(roundCornerImageView, d.mo99984a());
            C113367dh dhVar2 = this.f312585a;
            C113362dc d2 = C113363dd.m187554d();
            d2.mo99987d(C113365df.m187558c(C113259al.m187318c((String) findFirst.get())), C113365df.m187558c(C113259al.m187318c("android.resource://android/drawable/ic_contact_picture")));
            d2.mo99988e(true);
            dhVar2.mo100144d(roundCornerImageView2, d2.mo99984a());
        } else if (findFirst2.isPresent()) {
            C113367dh.m187565e(roundCornerImageView, String.valueOf(((String) findFirst2.get()).charAt(0)));
            C113367dh.m187565e(roundCornerImageView2, String.valueOf(((String) findFirst2.get()).charAt(0)));
        }
        bxVar.f312571e.setText(BuildConfig.FLAVOR);
        bxVar.f312572f.setText(BuildConfig.FLAVOR);
        Optional findFirst3 = Collection.EL.stream(j).map(C112757bj.f312543a).filter(C112760bm.f312547a).findFirst();
        if (findFirst3.isPresent()) {
            bxVar.f312571e.setText((CharSequence) findFirst3.get());
            bxVar.f312572f.setText((CharSequence) findFirst3.get());
        } else {
            ((C59052c) ((C59052c) f312584e.mo56226d()).mo56372aa(27795)).mo56386p("contactInfos contains no displayable name, no suggestion is rendered");
            bxVar.itemView.setVisibility(8);
        }
        bxVar.f312582p.setText(BuildConfig.FLAVOR);
        C58485gu a = C112734an.m186598a(j, 1);
        if (a.isEmpty()) {
            ((C59052c) ((C59052c) f312584e.mo56226d()).mo56372aa(27794)).mo56386p("sortedCallMethods contains no ContactInfo, no suggestion is rendered");
            bxVar.itemView.setVisibility(8);
        } else {
            bxVar.f312582p.setText(((C113321r) a.get(0)).f313842i);
        }
        bxVar.f312583q.setText(BuildConfig.FLAVOR);
        C58485gu b = C112748ba.m186606b(j, 1);
        if (b.isEmpty()) {
            ((C59052c) ((C59052c) f312584e.mo56226d()).mo56372aa(27793)).mo56386p("sortedTextMethods contains no ContactInfo, no suggestion is rendered");
            bxVar.itemView.setVisibility(8);
        } else {
            bxVar.f312583q.setText(((C113321r) b.get(0)).f313842i);
        }
        this.f312589f.mo99657h(bxVar.f312573g, ezVar.mo100206f());
        this.f312589f.mo99657h(bxVar.f312574h, ezVar.mo100206f());
        bxVar.f312573g.setOnClickListener(new C112753bf(this, j));
        bxVar.f312574h.setOnClickListener(new C112762bo(this, j));
        bxVar.f312575i.setOnClickListener(new C112763bp(this, j));
        bxVar.f312576j.setOnClickListener(new C112764bq(this, j));
        bxVar.f312577k.setOnClickListener(new C112765br(this, j));
        bxVar.f312578l.setOnClickListener(new C112766bs(this, j));
        bxVar.f312579m.setOnClickListener(new C112767bt(this, j));
        bxVar.f312580n.setOnClickListener(new C112768bu(this, j));
        bxVar.f312581o.setOnClickListener(new C112769bv(this, j));
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }

    /* renamed from: j */
    public final void mo99735j(Context context, C58485gu guVar, boolean z) {
        C58485gu a = C112734an.m186598a(guVar, m186622l());
        if (!a.isEmpty()) {
            if (z || a.size() == 1) {
                C112775ca caVar = (C112775ca) this.f312587c.mo27525b();
                C112775ca.m186636a(context, new Intent("android.intent.action.CALL", Uri.parse("tel:".concat(String.valueOf(((C113321r) a.get(0)).f313835b)))));
                return;
            }
            ((C112750bc) this.f312590g.mo17428b()).mo99725a(new C112759bl(this, guVar));
        }
    }

    /* renamed from: k */
    public final void mo99736k(Context context, C58485gu guVar, boolean z) {
        C58485gu b = C112748ba.m186606b(guVar, m186622l());
        if (!b.isEmpty()) {
            if (z || b.size() == 1) {
                C112775ca caVar = (C112775ca) this.f312587c.mo27525b();
                C112775ca.m186636a(context, new Intent("android.intent.action.VIEW", Uri.parse("sms:".concat(String.valueOf(((C113321r) b.get(0)).f313835b)))));
                return;
            }
            ((C112750bc) this.f312590g.mo17428b()).mo99725a(new C112761bn(this, b));
        }
    }
}
