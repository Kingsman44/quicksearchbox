package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10188c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10189d;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10263h;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10274s;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10277v;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p569e.C10375a;
import com.google.android.apps.gsa.assistant.shared.appactions.C73828m;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C103000c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C49849bg;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ac */
/* compiled from: PG */
final class C10197ac implements C73828m {

    /* renamed from: a */
    final /* synthetic */ C10199ae f34621a;

    public C10197ac(C10199ae aeVar) {
        this.f34621a = aeVar;
    }

    /* renamed from: a */
    public final void mo18321a(View view) {
        this.f34621a.f34633k.mo18354a(view);
        this.f34621a.f34634l.mo65296c(C89849ae.APP_ACTIONS_SETTINGS_DELETE_CLICKED);
    }

    /* renamed from: b */
    public final void mo18322b(View view) {
        C49826ak akVar;
        String str;
        this.f34621a.f34633k.mo18354a(view);
        C10263h hVar = this.f34621a.f34626d;
        if (hVar.f34792b == 1) {
            akVar = (C49826ak) hVar.f34793c;
        } else {
            akVar = C49826ak.f129462q;
        }
        if (akVar.f129465b.isEmpty()) {
            C0167am activity = this.f34621a.f34625c.getActivity();
            Context context = this.f34621a.f34625c.getContext();
            C10199ae aeVar = this.f34621a;
            C10325al alVar = aeVar.f34627e;
            C22871g gVar = aeVar.f34632j;
            InputMethodManager inputMethodManager = aeVar.f34631i;
            if (aeVar.f34644v.f129465b.isEmpty()) {
                str = this.f34621a.f34644v.f129471h;
            } else {
                str = (String) this.f34621a.f34644v.f129465b.get(0);
            }
            String str2 = str;
            C10199ae aeVar2 = this.f34621a;
            new C10375a(activity, context, alVar, gVar, inputMethodManager, str2, aeVar2.f34636n, new C10196ab(aeVar2)).e();
            return;
        }
        C10199ae aeVar3 = this.f34621a;
        C10274s sVar = (C10274s) C10277v.f34824h.createBuilder();
        C49838aw awVar = aeVar3.f34626d.f34795e;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        sVar.copyOnWrite();
        C10277v vVar = (C10277v) sVar.instance;
        awVar.getClass();
        vVar.f34829d = awVar;
        vVar.f34826a = 1 | vVar.f34826a;
        C49826ak akVar2 = aeVar3.f34644v;
        sVar.copyOnWrite();
        C10277v vVar2 = (C10277v) sVar.instance;
        akVar2.getClass();
        vVar2.f34830e = akVar2;
        vVar2.f34826a |= 2;
        sVar.copyOnWrite();
        C10277v vVar3 = (C10277v) sVar.instance;
        vVar3.f34831f = 3;
        vVar3.f34826a |= 16;
        long j = aeVar3.f34626d.f34794d;
        sVar.copyOnWrite();
        C10277v vVar4 = (C10277v) sVar.instance;
        vVar4.f34826a |= 32;
        vVar4.f34832g = j;
        C47393f.m84235f(new C10189d((C10277v) sVar.build()), aeVar3.f34625c);
    }

    /* renamed from: c */
    public final void mo18323c(ImageView imageView) {
        imageView.setVisibility(0);
        C10199ae aeVar = this.f34621a;
        C91189au auVar = aeVar.f34630h;
        C49838aw awVar = aeVar.f34626d.f34795e;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        auVar.mo85421i(awVar.f129509d, imageView);
    }

    /* renamed from: d */
    public final void mo18324d(ImageView imageView) {
        Optional ofNullable = Optional.ofNullable(((C86054o) this.f34621a.f34629g.mo27525b()).mo79659F());
        if (ofNullable.isPresent()) {
            this.f34621a.f34628f.b((String) ofNullable.get(), imageView);
        }
    }

    /* renamed from: e */
    public final void mo18325e(View view) {
        this.f34621a.f34633k.mo18354a(view);
        C47393f.m84235f(new C10188c(false, Optional.empty()), this.f34621a.f34625c);
        this.f34621a.f34625c.dismiss();
    }

    /* renamed from: f */
    public final void mo18326f(View view) {
        this.f34621a.f34635m.f76997b.mo33800a(C28427h.m53115a(105892)).mo33809b(view);
    }

    /* renamed from: g */
    public final void mo18327g() {
        C49826ak akVar;
        C10263h hVar = this.f34621a.f34626d;
        if (hVar.f34792b == 1) {
            akVar = (C49826ak) hVar.f34793c;
        } else {
            akVar = C49826ak.f129462q;
        }
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        ahVar.copyOnWrite();
        ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
        this.f34621a.mo18337b((C49826ak) ahVar.build(), false);
    }

    /* renamed from: h */
    public final void mo18328h(View view) {
        this.f34621a.f34635m.f76997b.mo33800a(C28427h.m53115a(105891)).mo33809b(view);
    }

    /* renamed from: i */
    public final void mo18329i(View view) {
        this.f34621a.f34635m.f76997b.mo33800a(C28427h.m53115a(105890)).mo33809b(view);
    }

    /* renamed from: j */
    public final void mo18330j(View view) {
        this.f34621a.f34635m.f76997b.mo33800a(C28427h.m53115a(109403)).mo33809b(view);
    }

    /* renamed from: k */
    public final void mo18331k(View view) {
        C49826ak akVar;
        String str;
        C49826ak akVar2;
        this.f34621a.f34633k.mo18354a(view);
        this.f34621a.f34634l.mo65296c(C89849ae.APP_ACTIONS_SETTINGS_SAVE_CLICKED);
        C10199ae aeVar = this.f34621a;
        C10263h hVar = aeVar.f34626d;
        if (hVar.f34792b == 1) {
            akVar = (C49826ak) hVar.f34793c;
        } else {
            akVar = C49826ak.f129462q;
        }
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        ahVar.copyOnWrite();
        ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
        C49826ak akVar3 = aeVar.f34644v;
        if (akVar3.f129465b.isEmpty()) {
            str = akVar3.f129471h;
        } else {
            str = (String) akVar3.f129465b.get(0);
        }
        ahVar.mo53361a(str);
        C49826ak akVar4 = (C49826ak) ahVar.build();
        C10263h hVar2 = aeVar.f34626d;
        if (hVar2.f34792b == 1) {
            akVar2 = (C49826ak) hVar2.f34793c;
        } else {
            akVar2 = C49826ak.f129462q;
        }
        aeVar.mo18337b(akVar4, akVar2.f129465b.isEmpty());
    }

    /* renamed from: l */
    public final void mo18332l(View view) {
        this.f34621a.f34635m.f76997b.mo33800a(C28427h.m53115a(105889)).mo33809b(view);
    }

    /* renamed from: m */
    public final void mo18333m(View view) {
        C49849bg bgVar;
        this.f34621a.f34633k.mo18354a(view);
        Context context = this.f34621a.f34625c.getContext();
        Object[] objArr = new Object[1];
        C10263h hVar = this.f34621a.f34626d;
        if (hVar.f34792b == 5) {
            bgVar = (C49849bg) hVar.f34793c;
        } else {
            bgVar = C49849bg.f129546d;
        }
        objArr[0] = bgVar.f129548a;
        String string = context.getString(R.string.full_education_query, objArr);
        if (!this.f34621a.f34636n.mo79746e(C90014bt.f247449hP) || !this.f34621a.f34639q.isPresent() || !this.f34621a.f34638p.isPresent() || !((C74714bo) ((C68214a) this.f34621a.f34639q.get()).mo27525b()).mo71081c()) {
            Context context2 = this.f34621a.f34625c.getContext();
            C87565h hVar2 = new C87565h();
            hVar2.f236546aq = true;
            hVar2.f236547ar = string;
            ((C87568k) this.f34621a.f34637o.get()).mo81688b(context2, hVar2.mo81685a());
        } else {
            C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
            C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
            e eVar = e.bi;
            abVar.copyOnWrite();
            C83614ac acVar = (C83614ac) abVar.instance;
            acVar.f227955c = eVar.ca;
            acVar.f227953a |= 2;
            abVar.copyOnWrite();
            C83614ac acVar2 = (C83614ac) abVar.instance;
            acVar2.f227954b = 1;
            acVar2.f227953a = 1 | acVar2.f227953a;
            abVar.copyOnWrite();
            C83614ac acVar3 = (C83614ac) abVar.instance;
            string.getClass();
            acVar3.f227953a |= 4;
            acVar3.f227956d = string;
            C83614ac acVar4 = (C83614ac) abVar.build();
            wVar.copyOnWrite();
            C83673y yVar = (C83673y) wVar.instance;
            acVar4.getClass();
            yVar.f228084c = acVar4;
            yVar.f228083b = 5;
            ((C103000c) ((C68214a) this.f34621a.f34638p.get()).mo27525b()).f287579a.mo93763v((C83673y) wVar.build(), Bundle.EMPTY);
        }
        this.f34621a.f34624b.setVisibility(8);
    }

    /* renamed from: n */
    public final void mo18334n(View view) {
        this.f34621a.f34635m.f76997b.mo33800a(C28427h.m53115a(110868)).mo33809b(view);
    }
}
